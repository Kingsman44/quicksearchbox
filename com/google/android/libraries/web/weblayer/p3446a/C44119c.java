package com.google.android.libraries.web.weblayer.p3446a;

import android.os.RemoteException;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.web.p3343a.C43228d;
import com.google.common.base.C58893dc;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.weblayer.C72594bc;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72615d;

/* renamed from: com.google.android.libraries.web.weblayer.a.c */
/* compiled from: PG */
public final /* synthetic */ class C44119c implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C44121e f114838a;

    public /* synthetic */ C44119c(C44121e eVar) {
        this.f114838a = eVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        try {
            C72615d b = this.f114838a.f114840a.mo47083b();
            C58893dc.m90996a(b);
            C72601bj a = b.mo64482a();
            C58893dc.m90996a(a);
            C44120d dVar = new C44120d(cVar);
            C72604bm.m107399a();
            a.mo64476g();
            a.f193153k.mo63750u(new C72341bj(new C72594bc(dVar)));
            return "activeTab#captureScreenShot";
        } catch (RemoteException e) {
            throw new C72304a(e);
        } catch (IllegalStateException unused) {
            cVar.mo5439d(new C43228d("WebFragment is destroyed or not attached yet."));
            return "activeTab#captureScreenShot";
        }
    }
}
