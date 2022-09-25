package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.p069a.p070a.p072b.C1255d;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;

/* renamed from: androidx.camera.core.ds */
/* compiled from: PG */
final class C1542ds implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C60870cx f4245a;

    /* renamed from: b */
    final /* synthetic */ C2164c f4246b;

    /* renamed from: c */
    final /* synthetic */ String f4247c;

    public C1542ds(C60870cx cxVar, C2164c cVar, String str) {
        this.f4245a = cxVar;
        this.f4246b = cVar;
        this.f4247c = str;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        if (th instanceof CancellationException) {
            C1974i.m5315c(this.f4246b.mo5439d(new C1544du(this.f4247c.concat(" cancelled."), th)), (String) null);
        } else {
            this.f4246b.mo5437b((Object) null);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        Surface surface = (Surface) obj;
        C1263l.m3437i(this.f4245a, this.f4246b);
    }
}
