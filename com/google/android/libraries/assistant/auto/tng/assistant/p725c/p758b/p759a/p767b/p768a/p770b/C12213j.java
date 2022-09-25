package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b;

import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.C11055a;
import com.google.android.libraries.assistant.assistantactions.p621c.C11258l;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p769a.C12194c;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.j */
/* compiled from: PG */
public final class C12213j {

    /* renamed from: a */
    public static final C59071e f38931a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.j");

    /* renamed from: b */
    public final C11258l f38932b;

    /* renamed from: c */
    public final C12194c f38933c;

    /* renamed from: d */
    public final C15481g f38934d;

    /* renamed from: e */
    public final Executor f38935e;

    /* renamed from: f */
    public final Executor f38936f;

    /* renamed from: g */
    public final C11054a f38937g;

    /* renamed from: h */
    public final boolean f38938h;

    /* renamed from: i */
    public final boolean f38939i;

    /* renamed from: j */
    public final C58528ij f38940j;

    /* renamed from: k */
    public C11055a f38941k = null;

    public C12213j(C11258l lVar, C12194c cVar, C15481g gVar, Executor executor, C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7) {
        C58495hd f;
        this.f38932b = lVar;
        this.f38933c = cVar;
        this.f38934d = gVar;
        this.f38935e = executor;
        this.f38936f = new C60904dr(executor);
        String str = (String) aVar4.mo17428b();
        boolean booleanValue = ((Boolean) aVar2.mo17428b()).booleanValue();
        long longValue = ((Long) aVar5.mo17428b()).longValue();
        C11054a aVar8 = new C11054a();
        aVar8.f36298a.put(7, true);
        aVar8.f36298a.put(9, true);
        aVar8.f36298a.put(10, booleanValue);
        aVar8.f36298a.put(23, true);
        aVar8.f36298a.put(26, true);
        aVar8.f36298a.put(4, true);
        C58490gz gzVar = new C58490gz(4);
        Iterator it = C58869cf.m90938d(";").mo56153g((String) aVar3.mo17428b()).iterator();
        while (true) {
            if (!it.hasNext()) {
                f = gzVar.mo55427f(false);
                break;
            }
            List i = C58869cf.m90938d(",").mo56155i((String) it.next());
            if (i.size() != 2) {
                f = C58729pv.f156485a;
                break;
            }
            gzVar.mo55429h((String) i.get(0), (String) i.get(1));
        }
        aVar8.mo19524e(f);
        aVar8.mo19523d(str);
        aVar8.mo19522c(longValue);
        this.f38937g = aVar8;
        this.f38938h = ((Boolean) aVar.mo17428b()).booleanValue();
        this.f38939i = ((Boolean) aVar6.mo17428b()).booleanValue();
        this.f38940j = C58528ij.m90006F(((C65603f) aVar7.mo17428b()).f178307a);
    }
}
