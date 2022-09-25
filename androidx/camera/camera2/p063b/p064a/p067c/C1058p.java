package androidx.camera.camera2.p063b.p064a.p067c;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.p063b.C1184dz;
import androidx.camera.camera2.p063b.p064a.p065a.C1008m;
import androidx.camera.core.p069a.p070a.p072b.C1252a;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.a.c.p */
/* compiled from: PG */
public final /* synthetic */ class C1058p implements C1252a {

    /* renamed from: a */
    public final /* synthetic */ CameraDevice f3191a;

    /* renamed from: b */
    public final /* synthetic */ C1008m f3192b;

    /* renamed from: c */
    public final /* synthetic */ List f3193c;

    /* renamed from: d */
    public final /* synthetic */ C1184dz f3194d;

    public /* synthetic */ C1058p(C1184dz dzVar, CameraDevice cameraDevice, C1008m mVar, List list) {
        this.f3194d = dzVar;
        this.f3191a = cameraDevice;
        this.f3192b = mVar;
        this.f3193c = list;
    }

    /* renamed from: a */
    public final C60870cx mo3782a(Object obj) {
        C1184dz dzVar = this.f3194d;
        List list = (List) obj;
        return dzVar.f3488a.mo4012z(this.f3191a, this.f3192b, this.f3193c);
    }
}
