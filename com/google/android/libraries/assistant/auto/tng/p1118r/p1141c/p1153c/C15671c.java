package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protos.p4850an.p4865e.C63590d;
import com.google.protos.p4850an.p4865e.C63594h;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.c.c */
/* compiled from: PG */
public final class C15671c {

    /* renamed from: b */
    private static final C58974d f46790b = C58974d.m91134h("FunctionCallAccessor");

    /* renamed from: a */
    public final C58833ax f46791a;

    private C15671c(C58833ax axVar) {
        this.f46791a = axVar;
    }

    public C15671c(C61752n nVar) {
        this.f46791a = C58833ax.m90834k(nVar);
    }

    /* renamed from: a */
    public final C15671c mo22496a(String str) {
        C61752n nVar;
        C58833ax b = mo22497b(str);
        if (b.mo56113h()) {
            C61748j jVar = ((C61746h) b.mo56107c()).f166797e;
            if (jVar == null) {
                jVar = C61748j.f166800d;
            }
            if (jVar.f166802a == 2) {
                C61748j jVar2 = ((C61746h) b.mo56107c()).f166797e;
                if (jVar2 == null) {
                    jVar2 = C61748j.f166800d;
                }
                if (jVar2.f166802a == 2) {
                    nVar = (C61752n) jVar2.f166803b;
                } else {
                    nVar = C61752n.f166808f;
                }
                return new C15671c(nVar);
            }
        }
        return new C15671c((C58833ax) C58836b.f156633a);
    }

    /* renamed from: b */
    public final C58833ax mo22497b(String str) {
        C58833ax axVar = this.f46791a;
        if (axVar.mo56113h()) {
            for (C61746h hVar : ((C61752n) axVar.mo56107c()).f166812c) {
                if (hVar.f166796d.equals(str)) {
                    return C58833ax.m90834k(hVar);
                }
            }
            ((C58970a) ((C58970a) f46790b.mo56224b()).mo56372aa(46249)).mo56354G("Argument %s doesn't exist in FunctionCall: \n%s", str, this.f46791a);
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final C58833ax mo22498c(String str) {
        C63590d dVar;
        C63590d dVar2;
        C63594h hVar;
        C58833ax b = mo22497b(str);
        if (b.mo56113h()) {
            C61748j jVar = ((C61746h) b.mo56107c()).f166797e;
            if (jVar == null) {
                jVar = C61748j.f166800d;
            }
            if (jVar.f166802a == 6) {
                dVar = (C63590d) jVar.f166803b;
            } else {
                dVar = C63590d.f172003c;
            }
            if (dVar.f172005a == 1) {
                C61748j jVar2 = ((C61746h) b.mo56107c()).f166797e;
                if (jVar2 == null) {
                    jVar2 = C61748j.f166800d;
                }
                if (jVar2.f166802a == 6) {
                    dVar2 = (C63590d) jVar2.f166803b;
                } else {
                    dVar2 = C63590d.f172003c;
                }
                if (dVar2.f172005a == 1) {
                    hVar = (C63594h) dVar2.f172006b;
                } else {
                    hVar = C63594h.f172008d;
                }
                return C58833ax.m90834k(hVar);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final C58833ax mo22499d(String str) {
        C61758t tVar;
        C61758t tVar2;
        C58833ax b = mo22497b(str);
        if (b.mo56113h()) {
            C61748j jVar = ((C61746h) b.mo56107c()).f166797e;
            if (jVar == null) {
                jVar = C61748j.f166800d;
            }
            if (jVar.f166802a == 3) {
                tVar = (C61758t) jVar.f166803b;
            } else {
                tVar = C61758t.f166824c;
            }
            if (tVar.f166826a == 1) {
                C61748j jVar2 = ((C61746h) b.mo56107c()).f166797e;
                if (jVar2 == null) {
                    jVar2 = C61748j.f166800d;
                }
                if (jVar2.f166802a == 3) {
                    tVar2 = (C61758t) jVar2.f166803b;
                } else {
                    tVar2 = C61758t.f166824c;
                }
                return C58833ax.m90834k(tVar2.f166826a == 1 ? (String) tVar2.f166827b : BuildConfig.FLAVOR);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: e */
    public final C58833ax mo22500e(String str) {
        C58833ax b = mo22497b(str);
        if (b.mo56113h()) {
            C61762x xVar = ((C61746h) b.mo56107c()).f166798f;
            if (xVar == null) {
                xVar = C61762x.f166835e;
            }
            if ((xVar.f166837a & 128) != 0) {
                C61762x xVar2 = ((C61746h) b.mo56107c()).f166798f;
                if (xVar2 == null) {
                    xVar2 = C61762x.f166835e;
                }
                return C58833ax.m90834k(xVar2.f166840d);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: f */
    public final boolean mo22501f(String str) {
        C58833ax axVar = this.f46791a;
        if (!axVar.mo56113h()) {
            return false;
        }
        for (C61746h hVar : ((C61752n) axVar.mo56107c()).f166812c) {
            if (hVar.f166796d.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
