package com.google.android.apps.gsa.staticplugins.opa.errorui;

import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84021p;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ab */
/* compiled from: PG */
public final class C108818ab implements C83956t {

    /* renamed from: a */
    public static final C59071e f302580a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.ab");

    /* renamed from: b */
    public final C69464a f302581b;

    /* renamed from: c */
    public C83956t f302582c = null;

    /* renamed from: d */
    private final C90929bz f302583d;

    /* renamed from: e */
    private final C60870cx f302584e;

    /* renamed from: f */
    private final C69464a f302585f;

    /* renamed from: g */
    private boolean f302586g;

    public C108818ab(C90929bz bzVar, C60870cx cxVar, C69464a aVar, C69464a aVar2) {
        this.f302583d = bzVar;
        this.f302584e = cxVar;
        this.f302585f = aVar;
        this.f302581b = aVar2;
    }

    /* renamed from: c */
    public final C58833ax mo77209c() {
        if (this.f302586g) {
            C83956t tVar = this.f302582c;
            if (tVar != null) {
                return tVar.mo77209c();
            }
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        }
        this.f302586g = true;
        if (this.f302584e.isDone()) {
            try {
                if (((Boolean) C90877ak.m148472f(this.f302584e)).booleanValue()) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    C83956t tVar2 = (C83956t) this.f302581b.mo17428b();
                    this.f302582c = tVar2;
                    return tVar2.mo77209c();
                }
            } catch (CancellationException unused) {
                C58976aa aaVar3 = C58975e.f156826a;
            } catch (InterruptedException | RuntimeException | ExecutionException unused2) {
                C58976aa aaVar4 = C58975e.f156826a;
            }
            C58976aa aaVar5 = C58975e.f156826a;
            return C58836b.f156633a;
        }
        C84021p pVar = (C84021p) this.f302585f.mo17428b();
        this.f302583d.mo85147l(this.f302584e, new C108817aa(this, pVar));
        return C58833ax.m90834k(pVar);
    }
}
