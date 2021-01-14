package io.flutter.plugins.googlemaps;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import com.google.android.libraries.internal.maps.zzw;
import com.google.android.libraries.maps.model.Polygon;
import org.junit.Test;
import org.mockito.Mockito;

public class PolygonControllerTest {

  @Test
  public void controller_SetsStrokeDensity() {
    final zzw z = mock(zzw.class);
    final Polygon polygon = spy(new Polygon(z));

    final float density = 5;
    final float strokeWidth = 3;
    final PolygonController controller = new PolygonController(polygon, false, density);
    controller.setStrokeWidth(strokeWidth);

    Mockito.verify(polygon).setStrokeWidth(density * strokeWidth);
  }
}
