package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61818k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.s3.producers.s */
/* compiled from: PG */
public abstract class C84320s {

    /* renamed from: b */
    public static final C59071e f229469b = C59071e.m91332i("com.google.android.apps.gsa.s3.producers.s");

    /* renamed from: a */
    private final C90931ca f229470a;

    /* renamed from: c */
    public final C22871g f229471c;

    /* renamed from: d */
    private final Map f229472d = new HashMap();

    protected C84320s(C90931ca caVar, C22871g gVar) {
        this.f229470a = caVar;
        this.f229471c = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo77838a(C61818k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo77839b(String str, String str2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo77840c(C84326y yVar, List list, Query query);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C60870cx mo77858d(C60870cx cxVar, C84326y yVar) {
        return this.f229470a.mo85141f(cxVar, new C84319r(this, yVar));
    }

    /* renamed from: e */
    public final void mo77859e(C84326y yVar) {
        List list = (List) this.f229472d.remove(yVar);
        if (list != null) {
            ArrayList b = C58597ky.m90211b(list);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                C60870cx cxVar = (C60870cx) b.get(i);
                if (cxVar != null) {
                    cxVar.cancel(true);
                } else {
                    C59104x d = f229469b.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "S3ReqUpHdlr");
                    ((C59052c) ((C59052c) d).mo56372aa(7242)).mo56386p("Null pending update.");
                    int i2 = C90755l.f253831a;
                }
            }
            return;
        }
        C59104x d2 = f229469b.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "S3ReqUpHdlr");
        ((C59052c) ((C59052c) d2).mo56372aa(7241)).mo56386p("Stop called for unknown listener.");
    }

    /* renamed from: f */
    public final void mo77860f(C84326y yVar, Query query) {
        C90748e.m148224b();
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        this.f229472d.put(yVar, arrayList);
        mo77840c(yVar, arrayList, query);
        if (arrayList.isEmpty()) {
            yVar.mo77847hk();
            return;
        }
        ArrayList d = C58597ky.m90213d(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C60870cx cxVar = (C60870cx) it.next();
            if (cxVar != null) {
                d.add(cxVar);
            } else {
                C59104x d2 = f229469b.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "S3ReqUpHdlr");
                ((C59052c) ((C59052c) d2).mo56372aa(7245)).mo56386p("Null pending update found.");
                int i = C90755l.f253831a;
                it.remove();
            }
        }
        int size = d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C60870cx cxVar2 = (C60870cx) d.get(i2);
            this.f229470a.mo85143h(cxVar2, new C84318q(yVar, cxVar2, arrayList));
        }
    }
}
