package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4543n.p4545b.C59364ae;
import com.google.common.p4575r.C60744a;
import java.util.Collection;
import java.util.Comparator;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.w */
/* compiled from: PG */
final class C132021w {

    /* renamed from: a */
    public static final Comparator f360364a = Comparator.EL.thenComparing(Comparator.EL.thenComparing(Comparator.CC.comparing(C132007i.f360351a, C60744a.FALSE_FIRST), (Function) C132011m.f360355a), (Function) C132012n.f360356a);

    /* renamed from: a */
    public static C58485gu m214456a(Collection collection, String str) {
        return (C58485gu) Collection.EL.stream(collection).map(new C132018t(str)).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public static C58495hd m214457b(java.util.Collection collection) {
        return ((C59364ae) Collection.EL.stream(collection).filter(C132008j.f360352a).collect(C59364ae.m92268o(C132014p.f360358a, C58370cn.m89403c(C132009k.f360353a, Function.CC.identity(), C132010l.f360354a)))).mo56899h();
    }

    /* renamed from: c */
    public static int m214458c(C131947b bVar) {
        if (bVar == null) {
            return 4;
        }
        return bVar.f360268g ? 2 : 3;
    }
}
