package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.google.assistant.p3931f.p3936b.p3938b.C52809a;
import com.google.assistant.p3931f.p3939c.C52825b;
import com.google.assistant.p3931f.p3939c.C52828e;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.ac */
/* compiled from: PG */
public final class C125315ac {
    /* renamed from: a */
    public static final C52825b m205262a(List list, C52809a aVar) {
        Object obj;
        C69664n.m101061g(list, "<this>");
        C69664n.m101061g(aVar, "updateType");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C52825b bVar = (C52825b) obj;
            if (C69664n.m101066l(bVar.f138596b, "actions.intent.UPDATE_ITEM_LIST")) {
                C62971cq cqVar = bVar.f138598d;
                C69664n.m101060f(cqVar, "it.paramsList");
                String str = aVar.f138566g;
                C69664n.m101060f(str, "updateType.toString()");
                if (C125317b.m205265a(cqVar, "updateType", str)) {
                    break;
                }
            }
        }
        return (C52825b) obj;
    }

    /* renamed from: b */
    public static final C52828e m205263b(List list) {
        Object obj;
        C69664n.m101061g(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C69664n.m101066l(((C52828e) obj).f138604a, "itemList.itemListElement.name")) {
                break;
            }
        }
        return (C52828e) obj;
    }
}
