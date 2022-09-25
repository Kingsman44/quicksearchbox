package androidx.camera.core;

import androidx.camera.core.p069a.p070a.p072b.C1255d;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.core.dq */
/* compiled from: PG */
final class C1540dq implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C2164c f4242a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f4243b;

    public C1540dq(C2164c cVar, C60870cx cxVar) {
        this.f4242a = cVar;
        this.f4243b = cxVar;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        if (th instanceof C1544du) {
            C1974i.m5315c(this.f4243b.cancel(false), (String) null);
        } else {
            C1974i.m5315c(this.f4242a.mo5437b((Object) null), (String) null);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        Void voidR = (Void) obj;
        C1974i.m5315c(this.f4242a.mo5437b((Object) null), (String) null);
    }
}
