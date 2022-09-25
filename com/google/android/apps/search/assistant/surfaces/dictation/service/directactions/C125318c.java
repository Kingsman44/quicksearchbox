package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125649ab;
import com.google.assistant.p3931f.p3939c.C52825b;
import com.google.assistant.p3931f.p3939c.C52840q;
import com.google.assistant.p3931f.p3939c.C52845v;
import com.google.protobuf.C62942bv;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.c */
/* compiled from: PG */
public final class C125318c {

    /* renamed from: a */
    private static final Map f345694a = C69505av.m100867i(new C69685i(C125649ab.BULLETED, "Bulleted"), new C69685i(C125649ab.NUMBERED, "Numbered"));

    /* renamed from: a */
    public static final C52825b m205268a(List list) {
        Object obj;
        C69664n.m101061g(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C69664n.m101066l(((C52825b) obj).f138596b, "actions.intent.CREATE_ITEM_LIST")) {
                break;
            }
        }
        return (C52825b) obj;
    }

    /* renamed from: b */
    public static final C52845v m205269b(C125649ab abVar) {
        C69664n.m101061g(abVar, "listFormat");
        C52840q qVar = (C52840q) C52845v.f138648d.createBuilder();
        qVar.copyOnWrite();
        ((C52845v) qVar.instance).f138651b = "Create_list";
        qVar.copyOnWrite();
        ((C52845v) qVar.instance).f138650a = "actions.intent.CREATE_ITEM_LIST";
        String str = (String) f345694a.get(abVar);
        if (str != null) {
            C125317b.m205267c(qVar, "itemList.itemListFormat", str, (String) null, 4);
        }
        C62942bv build = qVar.build();
        C69664n.m101060f(build, "fulfillmentBuilder.build()");
        return (C52845v) build;
    }
}
