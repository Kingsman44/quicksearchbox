package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a;

import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2864a.C37086a;
import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b.C37100d;
import com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2866c.C37116c;
import com.google.assistant.p3897e.p3921j.adm;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p3186j$.time.Duration;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.f */
/* compiled from: PG */
public final class C37125f {

    /* renamed from: a */
    public static final Comparator f96694a = new C37113c(C37095ae.f96612a);

    /* renamed from: b */
    public static final Comparator f96695b = new C37118d(C37095ae.f96613b);

    /* renamed from: c */
    public static final Comparator f96696c = new C37124e(C37095ae.f96614c);

    /* renamed from: d */
    public final C37095ae f96697d;

    /* renamed from: e */
    public final adm f96698e;

    /* renamed from: f */
    public final float f96699f;

    /* renamed from: g */
    public final float f96700g;

    /* renamed from: h */
    public final float f96701h;

    public C37125f(C37100d dVar, List list, List list2, C37136q qVar) {
        double d;
        C37100d dVar2 = dVar;
        List list3 = list;
        List list4 = list2;
        C37136q qVar2 = qVar;
        C69664n.m101061g(dVar2, "contact");
        C69664n.m101061g(list3, "calls");
        C69664n.m101061g(list4, "texts");
        C69664n.m101061g(dVar2, "contact");
        List b = C69540x.m100944b(new C37095ae(C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, dVar2.f96635b, 1023));
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list3, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C37086a aVar = (C37086a) it.next();
            C69664n.m101061g(aVar, "call");
            double a = qVar2.mo40650a(aVar.f96598a);
            Duration duration = aVar.f96599b;
            if (duration == null) {
                d = 0.0d;
            } else {
                double seconds = (double) duration.getSeconds();
                Double.isNaN(seconds);
                d = seconds * a;
            }
            int i = aVar.f96601d;
            double d2 = a + a;
            arrayList.add(new C37095ae(i == 2 ? a : 0.0d, i == 2 ? d : 0.0d, a, d, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, i == 2 ? d2 : 0.0d, d2, false, 1264));
        }
        List M = C69540x.m100831M(b, arrayList);
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(list4, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C37116c cVar = (C37116c) it2.next();
            C69664n.m101061g(cVar, "text");
            double a2 = qVar2.mo40650a(cVar.f96678a);
            double a3 = qVar2.mo40650a(cVar.f96678a);
            double d3 = (double) cVar.f96679b;
            Double.isNaN(d3);
            double d4 = a3 * d3;
            String str = cVar.f96680c;
            double d5 = str == null ? a2 : 0.0d;
            arrayList2.add(new C37095ae(C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, C59203do.f157270a, d5, str == null ? d4 : 0.0d, a2, d4, d5, a2, false, 1039));
        }
        Iterator it3 = C69540x.m100831M(M, arrayList2).iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            while (it3.hasNext()) {
                C37095ae aeVar = (C37095ae) it3.next();
                C37095ae aeVar2 = (C37095ae) next;
                C69664n.m101061g(aeVar, "other");
                C37100d dVar3 = dVar;
                it3 = it3;
                next = new C37095ae(aeVar2.f96616d + aeVar.f96616d, aeVar2.f96617e + aeVar.f96617e, aeVar2.f96618f + aeVar.f96618f, aeVar2.f96619g + aeVar.f96619g, aeVar2.f96620h + aeVar.f96620h, aeVar2.f96621i + aeVar.f96621i, aeVar2.f96622j + aeVar.f96622j, aeVar2.f96623k + aeVar.f96623k, aeVar2.f96624l + aeVar.f96624l, aeVar2.f96625m + aeVar.f96625m, aeVar2.f96626n || aeVar.f96626n);
            }
            C37095ae aeVar3 = (C37095ae) next;
            this.f96697d = aeVar3;
            this.f96698e = dVar.f96634a;
            C37095ae aeVar4 = aeVar3;
            this.f96699f = (float) aeVar3.mo40622a(aeVar4.mo40623b(aeVar3.f96616d * 1000.0d, aeVar3.f96618f * 1000.0d, true), aeVar4.mo40623b(aeVar3.f96617e, aeVar3.f96619g, false));
            this.f96700g = (float) aeVar3.mo40622a(aeVar4.mo40623b(aeVar3.f96620h * 1000.0d, aeVar3.f96622j * 1000.0d, true), aeVar4.mo40623b(aeVar3.f96621i, aeVar3.f96623k, false));
            this.f96701h = (float) aeVar4.mo40623b(aeVar3.f96624l * 1000.0d, aeVar3.f96625m * 1000.0d, true);
            return;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
