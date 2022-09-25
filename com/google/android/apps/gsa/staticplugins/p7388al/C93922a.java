package com.google.android.apps.gsa.staticplugins.p7388al;

import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.shared.p7045k.C89827w;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.a */
/* compiled from: PG */
public final /* synthetic */ class C93922a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C93943q f262290a;

    /* renamed from: b */
    public final /* synthetic */ l f262291b;

    /* renamed from: c */
    public final /* synthetic */ String f262292c;

    public /* synthetic */ C93922a(C93943q qVar, l lVar, String str) {
        this.f262290a = qVar;
        this.f262291b = lVar;
        this.f262292c = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C93940n nVar;
        Map map;
        C93943q qVar = this.f262290a;
        l lVar = this.f262291b;
        String str = this.f262292c;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String d = lVar.d();
        if (booleanValue) {
            ((C59052c) ((C59052c) C93943q.f262327b.mo56224b()).mo56372aa(19340)).mo56389s("#runCanEnrollCheck: Adding supported device [name: %s]", d);
            qVar.f262345q.put(str, new C93942p(qVar, lVar));
            if (qVar.f262347s.containsKey(lVar.b())) {
                qVar.f262347s.remove(lVar.b());
            }
        } else {
            ((C59052c) ((C59052c) C93943q.f262327b.mo56226d()).mo56372aa(19339)).mo56389s("#runCanEnrollCheck: Adding unsupported device [name: %s]", d);
            int i = 1;
            try {
                if (((Integer) C90877ak.m148472f(lVar.d)).intValue() == 2) {
                    i = 2;
                }
                C89824t tVar = lVar.a;
                tVar.getClass();
                nVar = new C93940n(qVar, d, i, C89827w.m146246a(tVar));
                map = qVar.f262346r;
            } catch (InterruptedException | ExecutionException e) {
                ((C59052c) ((C59052c) ((C59052c) C93943q.f262327b.mo56225c()).mo56382g(e)).mo56372aa(19345)).mo56386p("Exception while checking for can-enroll on device.");
                C89824t tVar2 = lVar.a;
                tVar2.getClass();
                nVar = new C93940n(qVar, d, 1, C89827w.m146246a(tVar2));
                map = qVar.f262346r;
            } catch (Throwable th) {
                C89824t tVar3 = lVar.a;
                if (tVar3 == null) {
                    throw null;
                }
                qVar.f262346r.put(str, new C93940n(qVar, d, 1, C89827w.m146246a(tVar3)));
                throw th;
            }
            map.put(str, nVar);
        }
        qVar.mo88221g();
    }
}
