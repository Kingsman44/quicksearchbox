package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.android.apps.gsa.p8839t.p8845f.C118362d;
import com.google.android.apps.gsa.p8839t.p8845f.C118363e;
import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.assistant.p3980n.p3985c.C53023n;
import com.google.assistant.p3980n.p3985c.C53024o;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cd */
/* compiled from: PG */
public final /* synthetic */ class C18858cd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C53306j f53105a;

    public /* synthetic */ C18858cd(C53306j jVar) {
        this.f53105a = jVar;
    }

    public final Object apply(Object obj) {
        C53306j jVar = this.f53105a;
        C123742bi biVar = (C123742bi) obj;
        C59071e eVar = C18868cn.f53115a;
        Iterator it = biVar.f341802a.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            C53020k kVar = (C53020k) it.next();
            C59052c cVar = (C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47472);
            C53024o oVar = kVar.f138973b;
            if (oVar == null) {
                oVar = C53024o.f138977d;
            }
            int b = C53023n.m86772b(oVar.f138981c);
            if (b != 0) {
                i = b;
            }
            cVar.mo56352E("Merged Potter section %s size %s", C53023n.m86771a(i), kVar.f138974c.size());
        }
        C118364f fVar = (C118364f) C118365g.f328542b.createBuilder();
        C118362d dVar = (C118362d) C118363e.f328532h.createBuilder();
        dVar.copyOnWrite();
        C118363e eVar2 = (C118363e) dVar.instance;
        biVar.getClass();
        eVar2.f328536c = biVar;
        eVar2.f328535b = 6;
        int i2 = true != C53306j.AMBIENT_ASSISTANT.equals(jVar) ? 10 : 19;
        dVar.copyOnWrite();
        C118363e eVar3 = (C118363e) dVar.instance;
        eVar3.f328534a = 1 | eVar3.f328534a;
        eVar3.f328537d = i2;
        fVar.mo103680b(dVar);
        return C58833ax.m90834k((C118365g) fVar.build());
    }
}
