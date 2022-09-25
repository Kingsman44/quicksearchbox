package androidx.camera.core;

import android.content.Context;
import android.os.SystemClock;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: androidx.camera.core.z */
/* compiled from: PG */
public final /* synthetic */ class C1576z implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C1400aa f4308a;

    /* renamed from: b */
    public final /* synthetic */ Context f4309b;

    public /* synthetic */ C1576z(C1400aa aaVar, Context context) {
        this.f4308a = aaVar;
        this.f4309b = context;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C1400aa aaVar = this.f4308a;
        aaVar.mo4294a(aaVar.f3932d, SystemClock.elapsedRealtime(), this.f4309b, cVar);
        return "CameraX initInternal";
    }
}
