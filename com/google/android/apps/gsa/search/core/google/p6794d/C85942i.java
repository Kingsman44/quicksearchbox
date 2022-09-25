package com.google.android.apps.gsa.search.core.google.p6794d;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8523ac;
import com.google.p395al.p417d.p418a.C8533am;
import com.google.p395al.p417d.p418a.C8596w;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.i */
/* compiled from: PG */
public final class C85942i implements C85934a {

    /* renamed from: a */
    private static final C59071e f232366a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.d.i");

    /* renamed from: b */
    private final InputStream f232367b;

    /* renamed from: c */
    private final int f232368c;

    /* renamed from: d */
    private final C85951r f232369d;

    /* renamed from: e */
    private final C85948o f232370e;

    /* renamed from: f */
    private final C58009ae f232371f;

    public C85942i(InputStream inputStream, C85948o oVar, C58009ae aeVar, String[] strArr, String str, int i, C68214a aVar) {
        this.f232371f = aeVar;
        this.f232370e = oVar;
        this.f232368c = i;
        this.f232367b = inputStream;
        this.f232369d = new C85951r(inputStream, str, strArr, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo79590a() {
        Object obj;
        Object obj2;
        Throwable e = null;
        try {
            C85945l a = this.f232369d.mo79619a();
            int i = 0;
            while (a != null) {
                C8523ac a2 = a.mo79592a();
                if (a2 != null) {
                    C62940bt r4 = C62942bv.checkIsLite(C8596w.f29745e);
                    a2.mo58887l(r4);
                    if (a2.f169962ag.mo58857o(r4.f169971d)) {
                        C62940bt r1 = C62942bv.checkIsLite(C8596w.f29745e);
                        a2.mo58887l(r1);
                        Object l = a2.f169962ag.mo58854l(r1.f169971d);
                        if (l == null) {
                            obj = r1.f169969b;
                        } else {
                            obj = r1.mo58889c(l);
                        }
                        C8596w wVar = (C8596w) obj;
                        int i2 = wVar.f29748b;
                        String str = wVar.f29749c;
                        throw new C90457d(i2 + "(" + str + ")", (int) C89885b.GWS_INTERNAL_SERVER_ERROR_VALUE);
                    }
                    C62940bt r42 = C62942bv.checkIsLite(C8533am.f29593t);
                    a2.mo58887l(r42);
                    Object l2 = a2.f169962ag.mo58854l(r42.f169971d);
                    if (l2 == null) {
                        obj2 = r42.f169969b;
                    } else {
                        obj2 = r42.mo58889c(l2);
                    }
                    i += ((C8533am) obj2).f29602h.mo59031d();
                }
                if (!this.f232370e.mo17709a(a)) {
                    throw new C90457d(C89885b.GWS_CHUNK_NOT_ACCEPTED_VALUE);
                } else if (i <= this.f232368c) {
                    a = this.f232369d.mo79619a();
                } else {
                    throw new C90457d(C89885b.GWS_RESPONSE_SIZE_EXCEEDED_VALUE);
                }
            }
            try {
                this.f232367b.close();
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException | Error | RuntimeException e3) {
            e = e3;
            try {
                this.f232367b.close();
            } catch (IOException e4) {
                ((C59052c) ((C59052c) ((C59052c) f232366a.mo56226d()).mo56382g(e4)).mo56372aa(8084)).mo56386p("Suppressing additional exception in finally block.");
            }
        } catch (Throwable th) {
            try {
                this.f232367b.close();
            } catch (IOException e5) {
                e = e5;
            }
            this.f232370e.mo79616b(e);
            throw th;
        }
        this.f232370e.mo79616b(e);
        if (e != null) {
            C58887cx.m90980g(e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final C60870cx mo79586c() {
        return this.f232371f.mo54598b(new C85941h(this));
    }
}
