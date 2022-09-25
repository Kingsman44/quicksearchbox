package com.google.android.apps.search.podcasts.p10588n;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.List;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.n.ae */
/* compiled from: PG */
final class C140656ae extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ List f382027a;

    /* renamed from: b */
    final /* synthetic */ C140659ah f382028b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140656ae(List list, C140659ah ahVar) {
        super(1);
        this.f382027a = list;
        this.f382028b = ahVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        List list = (List) obj;
        C69664n.m101061g(list, "convertedEpisodesItems");
        boolean z = list.size() != this.f382027a.size();
        if (z) {
            C59052c cVar = (C59052c) this.f382028b.f382034c.mo56226d();
            int size = this.f382027a.size();
            int size2 = list.size();
            cVar.mo56379ah(new C59094n(41641));
            cVar.mo56393w("Queue contained unavailable episodes. ids: %d episode items: %d", size, size2);
        }
        return new C140660ai(list, z);
    }
}
