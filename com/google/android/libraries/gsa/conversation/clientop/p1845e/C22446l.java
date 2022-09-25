package com.google.android.libraries.gsa.conversation.clientop.p1845e;

import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.libraries.gsa.conversation.C22573f;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1837a.C22314ae;
import com.google.android.libraries.gsa.conversation.p1837a.C22329j;
import com.google.android.libraries.gsa.conversation.p1837a.C22333n;
import com.google.android.libraries.gsa.conversation.p1852f.C22577d;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.conversation.p1852f.C22589p;
import com.google.android.libraries.gsa.conversation.p1852f.C22590q;
import com.google.android.libraries.gsa.conversation.p1852f.C22591r;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.android.libraries.gsa.conversation.p1855h.p1856a.C22686b;
import com.google.android.libraries.gsa.conversation.p1855h.p1856a.C22687c;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52648zn;
import com.google.assistant.p3897e.p3921j.C52651zq;
import com.google.assistant.p3897e.p3921j.C52653zs;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.e.l */
/* compiled from: PG */
public final class C22446l extends C22538o {

    /* renamed from: a */
    private final C22329j f61979a;

    /* renamed from: b */
    private final C22720x f61980b;

    /* renamed from: c */
    private final C22314ae f61981c;

    /* renamed from: d */
    private final C69464a f61982d;

    /* renamed from: e */
    private final C22589p f61983e;

    /* renamed from: f */
    private final C22573f f61984f;

    public C22446l(C22329j jVar, C22720x xVar, C22314ae aeVar, C69464a aVar, C22573f fVar, C22589p pVar) {
        this.f61979a = jVar;
        this.f61980b = xVar;
        this.f61981c = aeVar;
        this.f61982d = aVar;
        this.f61984f = fVar;
        this.f61983e = pVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("mic.UPDATE")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52654zt ztVar = (C52654zt) m41992m(dwVar, "mic_behavior_args", C52654zt.f138233e.getParserForType());
            int i = ztVar.f138236b;
            int b = C52648zn.m86683b(i);
            int i2 = 1;
            if (b == 0 || b != 2) {
                int b2 = C52648zn.m86683b(i);
                if (b2 == 0 || b2 == 1) {
                    C22329j jVar = this.f61979a;
                    C58976aa aaVar = C58975e.f156826a;
                    jVar.mo27561c(C22333n.INPUT);
                } else {
                    throw new C22534k();
                }
            } else if (this.f61980b.mo27824n()) {
                C22590q f = C22591r.m42062f();
                int i3 = ztVar.f138238d;
                int a = C52653zs.m86685a(i3);
                if (a != 0 && a == 2) {
                    ((C22577d) f).f62216c = 2;
                } else {
                    int a2 = C52653zs.m86685a(i3);
                    if (a2 != 0 && a2 == 3) {
                        ((C22577d) f).f62216c = 3;
                    } else {
                        ((C22577d) f).f62216c = 1;
                    }
                }
                C22407c cVar = (C22407c) eVar;
                f.mo27677b(cVar.f61899a);
                if (cVar.f61902d.mo56113h() && ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56113h()) {
                    ((C22577d) f).f62214a = C58833ax.m90834k((C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56107c());
                }
                if (cVar.f61903e.mo56113h()) {
                    C22686b bVar = (C22686b) cVar.f61903e.mo56107c();
                    if (bVar instanceof C22687c) {
                        ((C22577d) f).f62215b = C58833ax.m90834k(((C22687c) bVar).mo27786a());
                    }
                }
                int a3 = C52651zq.m86684a(ztVar.f138237c);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i4 = a3 - 1;
                if (i4 == 1) {
                    i2 = 2;
                } else if (i4 == 2) {
                    i2 = 3;
                } else if (i4 == 3) {
                    i2 = 4;
                }
                ((C22577d) f).f62217d = i2;
                this.f61979a.mo27560b(this.f61981c.mo27549a(this.f61982d, f.mo27676a(), this.f61984f, this.f61983e), new C22445k(this.f61980b));
            }
            return C22538o.f62144n;
        }
        throw new C22428d(dyVar);
    }
}
