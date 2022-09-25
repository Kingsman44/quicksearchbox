package androidx.camera.camera2.p063b.p064a.p066b;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1346cf;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.a.b.e */
/* compiled from: PG */
public final class C1020e implements C1346cf {

    /* renamed from: a */
    public final List f3153a;

    public C1020e(C1068k kVar) {
        List list;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) kVar.mo3785a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C1477bw.m3980c("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
        }
        Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(34) : null;
        if (outputSizes != null) {
            list = Arrays.asList((Size[]) outputSizes.clone());
        } else {
            list = Collections.emptyList();
        }
        this.f3153a = list;
        new StringBuilder("mSupportedResolutions = ").append(list);
        C1477bw.m3978a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = ".concat(String.valueOf(list)));
    }
}
