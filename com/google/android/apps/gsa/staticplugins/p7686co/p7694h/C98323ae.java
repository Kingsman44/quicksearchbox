package com.google.android.apps.gsa.staticplugins.p7686co.p7694h;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.proactive.C84179o;
import com.google.android.apps.gsa.proactive.p6474a.C84156a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.store.C118312c;
import com.google.android.apps.gsa.store.C118316g;
import com.google.android.apps.gsa.store.C118328s;
import com.google.android.apps.gsa.store.C118329t;
import com.google.android.apps.gsa.store.C118335x;
import com.google.android.apps.p489g.p493c.C9129b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.h.ae */
/* compiled from: PG */
public final class C98323ae implements C84156a {

    /* renamed from: a */
    public static final C59071e f274452a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.h.ae");

    /* renamed from: b */
    public final C118312c f274453b;

    /* renamed from: c */
    public final C22871g f274454c;

    /* renamed from: d */
    public final C58881cr f274455d;

    /* renamed from: e */
    private final C22871g f274456e;

    public C98323ae(C118312c cVar, C22871g gVar, C22871g gVar2, C68214a aVar) {
        this.f274453b = cVar;
        this.f274456e = gVar;
        this.f274454c = gVar2;
        this.f274455d = C58886cw.m90973a(new C98320ab(aVar));
    }

    /* renamed from: n */
    private final void m162862n(C60870cx cxVar) {
        new C90873ag(cxVar, this.f274454c, "trackWriteSuccess", new C98338n(this)).mo85223a(new C98340p(this));
    }

    /* renamed from: a */
    public final C60870cx mo77582a() {
        return mo91053g(C98325ag.f274474j);
    }

    /* renamed from: b */
    public final C60870cx mo77583b(C84179o[] oVarArr) {
        String[] strArr = new String[oVarArr.length];
        for (int i = 0; i < oVarArr.length; i++) {
            strArr[i] = C98325ag.m162879d(oVarArr[i]);
        }
        return mo91054h(strArr);
    }

    /* renamed from: c */
    public final C60870cx mo77584c() {
        return mo91056j(11, "getAllRequestScheduleFenceStates", C98333i.f274490a);
    }

    /* renamed from: d */
    public final C60870cx mo77585d() {
        return mo91057k(C98325ag.f274474j, "getNotificationStoreData", C98329e.f274486a);
    }

    /* renamed from: e */
    public final C60870cx mo77586e(C9129b bVar) {
        return mo91058l(C98325ag.f274474j, bVar.toByteArray(), 10);
    }

    /* renamed from: f */
    public final C60870cx mo77587f(C84179o oVar) {
        return mo91058l(C98325ag.m162879d(oVar), oVar.toByteArray(), 11);
    }

    /* renamed from: g */
    public final C60870cx mo91053g(String str) {
        return mo91054h(new String[]{str});
    }

    /* renamed from: h */
    public final C60870cx mo91054h(String[] strArr) {
        if (r0 == 0) {
            return C118826c.f331423b;
        }
        C118316g c = this.f274453b.mo91759c();
        for (String b : strArr) {
            c.mo103661b(b);
        }
        C60870cx g = C60922j.m93044g(this.f274453b.mo91762h(c.mo103660a()), C98332h.f274489a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: i */
    public final C60870cx mo91055i(long j) {
        C118312c cVar = this.f274453b;
        C118316g c = cVar.mo91759c();
        c.f328433a.mo55395g(C118328s.m196511c(C98324af.f274457a, j));
        C60870cx g = C60922j.m93044g(cVar.mo91762h(c.mo103660a()), C98345u.f274502a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: j */
    public final C60870cx mo91056j(long j, String str, C98321ac acVar) {
        C118335x g = this.f274453b.mo91761g();
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274457a, j));
        C60870cx i = this.f274453b.mo91763i(g.mo103674a());
        return this.f274456e.mo28209i(i, "getAllObjectsOfType$".concat(str), new C98339o(acVar));
    }

    /* renamed from: k */
    public final C60870cx mo91057k(String str, String str2, C98321ac acVar) {
        return this.f274456e.mo28209i(this.f274453b.mo91765k(str), "getObject$".concat(str2), new C98343s(acVar));
    }

    /* renamed from: l */
    public final C60870cx mo91058l(String str, byte[] bArr, long j) {
        if (!C98325ag.m162880e(str)) {
            C59104x c = f274452a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NowContentStore");
            ((C59052c) ((C59052c) c).mo56372aa(30611)).mo56389s("Invalid key: %s", str);
            ((C118831d) this.f274455d.mo6453a()).mo104025g(0);
            return C60856cj.m92899h(new IllegalArgumentException("Invalid key: ".concat(String.valueOf(str))));
        }
        C118329t e = this.f274453b.mo91760e();
        e.mo103667a(str, bArr).mo103672a(C98324af.f274457a, Long.valueOf(j));
        C60870cx h = this.f274453b.mo91762h(e.mo103669c());
        m162862n(h);
        C60870cx g = C60922j.m93044g(h, new C98335k(str), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: m */
    public final C60870cx mo91059m(List list) {
        C118329t e = this.f274453b.mo91760e();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C98322ad adVar = (C98322ad) it.next();
            if (!C98325ag.m162880e(adVar.mo91051b())) {
                C59104x c = f274452a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NowContentStore");
                ((C59052c) ((C59052c) c).mo56372aa(30612)).mo56389s("Invalid key: %s", adVar.mo91051b());
                ((C118831d) this.f274455d.mo6453a()).mo104025g(0);
                return C60856cj.m92899h(new IllegalArgumentException("Invalid key: ".concat(String.valueOf(adVar.mo91051b()))));
            }
            e.mo103667a(adVar.mo91051b(), adVar.mo91052c()).mo103672a(C98324af.f274457a, Long.valueOf(adVar.mo91050a()));
            arrayList.add(adVar.mo91051b());
        }
        C60870cx h = this.f274453b.mo91762h(e.mo103669c());
        m162862n(h);
        C60870cx g = C60922j.m93044g(h, new C98341q(arrayList), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }
}
