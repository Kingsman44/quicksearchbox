package com.google.android.libraries.gsa.conversation.p1853g;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.gsa.conversation.g.ac */
/* compiled from: PG */
final class C22616ac {

    /* renamed from: a */
    public static final C59071e f62309a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.g.ac");

    /* renamed from: b */
    public final Map f62310b = new HashMap();

    /* renamed from: c */
    public C58833ax f62311c = C58836b.f156633a;

    /* renamed from: b */
    public static Long m42137b(C52081en enVar) {
        C22719w wVar = new C22719w();
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        wVar.mo27876c(exVar);
        return Long.valueOf(C22654bn.m42173c(wVar).f133491c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58495hd mo27734a(C52081en enVar) {
        C52076ei eiVar;
        this.f62311c = C58833ax.m90834k(m42137b(enVar));
        C58490gz gzVar = new C58490gz(4);
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 4) {
                eiVar = (C52076ei) epVar.f136693c;
            } else {
                eiVar = C52076ei.f136664f;
            }
            if (eiVar.f136670e) {
                gzVar.mo55429h(Integer.valueOf(epVar.f136694d), C2169h.m6027a(new C22680x(this, epVar)));
            }
        }
        C58495hd f = gzVar.mo55427f(false);
        f.keySet();
        this.f62310b.keySet();
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo27735c() {
        this.f62310b.keySet();
        Map.EL.forEach(this.f62310b, C22681y.f62469a);
        this.f62310b.clear();
    }
}
