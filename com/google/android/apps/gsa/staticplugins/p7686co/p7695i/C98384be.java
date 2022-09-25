package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.staticplugins.p7686co.C98476p;
import com.google.android.apps.gsa.staticplugins.p7686co.C98477q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.be */
/* compiled from: PG */
public final class C98384be extends C68247h {

    /* renamed from: a */
    private final C98378az f274655a;

    public C98384be(C98378az azVar, C69464a aVar, C69464a aVar2) {
        super(aVar2, new C68277d(C98384be.class), aVar);
        this.f274655a = azVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Void voidR = (Void) obj;
        C98378az azVar = this.f274655a;
        if (azVar.f274603b == null) {
            return C60866ct.f164955a;
        }
        int[] f = azVar.f274605d.f274641s.f232790a.mo79722a().mo80080f("context_upload_keys");
        if (f.length == 0) {
            C58976aa aaVar = C58975e.f156826a;
        }
        C98477q a = azVar.f274605d.f274629g.mo91045a(azVar.f274603b.name);
        return a.mo84765i(new C98476p(a, f), "Get latest ContextData");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60866ct.f164955a;
    }
}
