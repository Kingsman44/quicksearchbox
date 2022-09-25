package com.google.android.apps.search.podcasts.p10566g;

import com.google.android.apps.search.podcasts.p10566g.p10568b.C140371f;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140372g;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140373h;
import com.google.android.apps.search.podcasts.p10588n.C140666ao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.g.f */
/* compiled from: PG */
final class C140378f extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C140378f f381330a = new C140378f();

    public C140378f() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List<C140666ao> list = (List) obj;
        C69664n.m101061g(list, "subscriptionItems");
        if (list.isEmpty()) {
            return C69496am.f185918a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(list, 10));
        for (C140666ao fVar : list) {
            arrayList2.add(new C140371f(fVar));
        }
        arrayList.addAll(arrayList2);
        if (arrayList.size() < 4) {
            arrayList.add(new C140373h());
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C69664n.m101060f(unmodifiableList, "unmodifiableList(feedShowDataList)");
        return C69540x.m100944b(new C140372g(unmodifiableList));
    }
}
