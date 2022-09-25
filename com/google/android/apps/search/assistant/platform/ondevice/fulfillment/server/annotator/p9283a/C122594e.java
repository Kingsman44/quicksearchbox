package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58532in;
import com.google.common.p4580v.C60950i;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.e */
/* compiled from: PG */
public final class C122594e {

    /* renamed from: a */
    private final C60950i f339766a;

    public C122594e(C60950i iVar) {
        this.f339766a = iVar;
    }

    /* renamed from: b */
    public static final C58485gu m202006b(String str, List list, ZoneId zoneId, Instant instant) {
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).map(new C122580a(str, list, instant, zoneId)).filter(C122591b.f339762a).map(C122592c.f339763a).collect(C58370cn.f155946a);
        String b = C122605p.m202015b(C80080z.APP);
        String b2 = C122605p.m202015b(C80080z.URL);
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(new C122615z(b2)).collect(C58370cn.f155946a);
        return (C58485gu) Stream.CC.concat(Stream.CC.concat(Collection.EL.stream((C58485gu) Collection.EL.stream(guVar).filter(new C122581aa(b, b2)).collect(C58370cn.f155946a)), Collection.EL.stream(guVar2)), Collection.EL.stream((C58485gu) Collection.EL.stream(((C58532in) Stream.CC.concat(Collection.EL.stream((C58485gu) Collection.EL.stream(guVar).filter(new C122614y(b)).collect(C58370cn.f155946a)), Collection.EL.stream(guVar2)).collect(C58370cn.m89405e(C122582ab.f339753a, C122583ac.f339754a))).map.entrySet()).map(C122607r.f339778a).filter(C122608s.f339779a).map(C122609t.f339780a).collect(C58370cn.f155946a))).collect(C58370cn.f155946a);
    }

    /* renamed from: a */
    public final C58485gu mo105688a(String str, List list, ZoneId zoneId) {
        return m202006b(str, list, zoneId, this.f339766a.mo57444a());
    }
}
