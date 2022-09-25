package com.google.android.apps.gsa.search.core.google.p6794d;

import com.google.android.apps.gsa.search.core.p6513aj.C84555o;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p395al.p417d.p418a.C8523ac;
import com.google.p395al.p417d.p418a.C8533am;
import com.google.p395al.p417d.p418a.C8596w;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import dagger.C68214a;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.k */
/* compiled from: PG */
public final class C85944k implements C85936c, C90991b {

    /* renamed from: a */
    private static final C59071e f232383a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.d.k");

    /* renamed from: b */
    private final C63010eb f232384b;

    /* renamed from: c */
    private final InputStream f232385c;

    /* renamed from: d */
    private final int f232386d;

    /* renamed from: e */
    private final C85947n f232387e;

    /* renamed from: f */
    private final String[] f232388f;

    /* renamed from: g */
    private final String f232389g;

    /* renamed from: h */
    private final C90476a f232390h;

    /* renamed from: i */
    private final C68214a f232391i;

    /* renamed from: j */
    private C85948o f232392j;

    public C85944k(C63010eb ebVar, InputStream inputStream, int i, C85947n nVar, String[] strArr, String str, C68214a aVar, C90476a aVar2) {
        this.f232384b = ebVar;
        this.f232385c = inputStream;
        this.f232386d = i;
        this.f232387e = nVar;
        this.f232388f = strArr;
        this.f232389g = str;
        this.f232391i = aVar;
        this.f232390h = aVar2;
    }

    /* renamed from: a */
    public final void mo79588a(C85935b bVar) {
        C85949p pVar;
        Object obj;
        Object obj2;
        C63010eb ebVar = this.f232384b;
        if (ebVar != null) {
            pVar = new C85952s(ebVar, this.f232385c);
        } else {
            pVar = new C85951r(this.f232385c, this.f232389g, this.f232388f, this.f232391i);
        }
        C85948o oVar = new C85948o(bVar, this.f232387e, this.f232391i);
        this.f232392j = oVar;
        int i = 0;
        while (true) {
            try {
                bVar.mo78288b("PelletChunkReader requires non-stopped sink");
                C85945l a = pVar.mo79619a();
                if (a == null) {
                    try {
                        oVar.mo79617c(true);
                        e = null;
                        break;
                    } catch (C90455b e) {
                        e = e;
                    }
                } else {
                    C8523ac a2 = a.mo79592a();
                    if (a2 != null) {
                        C62940bt r7 = C62942bv.checkIsLite(C8596w.f29745e);
                        a2.mo58887l(r7);
                        if (a2.f169962ag.mo58857o(r7.f169971d)) {
                            C62940bt r10 = C62942bv.checkIsLite(C8596w.f29745e);
                            a2.mo58887l(r10);
                            Object l = a2.f169962ag.mo58854l(r10.f169971d);
                            if (l == null) {
                                obj = r10.f169969b;
                            } else {
                                obj = r10.mo58889c(l);
                            }
                            C8596w wVar = (C8596w) obj;
                            int i2 = wVar.f29748b;
                            String str = wVar.f29749c;
                            throw new C90457d(i2 + "(" + str + ")", (int) C89885b.GWS_INTERNAL_SERVER_ERROR_VALUE);
                        }
                        C62940bt r72 = C62942bv.checkIsLite(C8533am.f29593t);
                        a2.mo58887l(r72);
                        Object l2 = a2.f169962ag.mo58854l(r72.f169971d);
                        if (l2 == null) {
                            obj2 = r72.f169969b;
                        } else {
                            obj2 = r72.mo58889c(l2);
                        }
                        i += ((C8533am) obj2).f29602h.mo59031d();
                    }
                    if (!oVar.mo17709a(a)) {
                        C90457d dVar = new C90457d(C89885b.GWS_CHUNK_NOT_ACCEPTED_VALUE);
                        if (!((C84555o) bVar).mo78292i()) {
                            C89886e b = ((C89911f) ((C84555o) bVar).f230099c.mo27525b()).mo83756b(dVar);
                            b.f246284e = ((C84555o) bVar).f230098b;
                            b.mo83721a();
                        }
                    }
                    if (i > this.f232386d) {
                        throw new C90457d(C89885b.GWS_RESPONSE_SIZE_EXCEEDED_VALUE);
                    } else if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedException();
                    }
                }
            } catch (IllegalStateException e2) {
                bVar.mo78287a(e2);
                throw e2;
            } catch (C90455b e3) {
                e = e3;
                try {
                    oVar.mo79617c(false);
                } catch (C90455b e4) {
                    ((C59052c) ((C59052c) ((C59052c) f232383a.mo56226d()).mo56382g(e4)).mo56372aa(8096)).mo56386p("Suppressing additional exception in finally block.");
                }
            } catch (Throwable th) {
                try {
                    oVar.mo79617c(true);
                } catch (C90455b unused) {
                }
                throw th;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("Pellet chunk reader");
        C85948o oVar = this.f232392j;
        if (oVar == null) {
            fVar.mo85279c("demuxer").mo85276a(C90752i.m148229c("null"));
        } else {
            fVar.mo85279c("pellet sequence").mo85276a(C90752i.m148229c(oVar.f232400b.toString()));
        }
    }
}
