package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.C69685i;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5482l.C69716aa;
import p5462h.p5482l.C69731k;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.x */
/* compiled from: PG */
final class C40300x extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ long f105870a;

    /* renamed from: b */
    final /* synthetic */ long f105871b;

    /* renamed from: c */
    final /* synthetic */ Map f105872c;

    /* renamed from: d */
    final /* synthetic */ C40301y f105873d;

    /* renamed from: e */
    final /* synthetic */ Duration f105874e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40300x(long j, long j2, Map map, C40301y yVar, Duration duration) {
        super(1);
        this.f105870a = j;
        this.f105871b = j2;
        this.f105872c = map;
        this.f105873d = yVar;
        this.f105874e = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C40262ab abVar = (C40262ab) obj;
        C69664n.m101061g(abVar, "oldIndex");
        long j = this.f105870a;
        long j2 = this.f105871b;
        C58480gp e = C58485gu.m89837e();
        Collection<C40278b> values = Collections.unmodifiableMap(abVar.f105756a).values();
        ArrayList arrayList = new ArrayList(C69540x.m100804k(values, 10));
        for (C40278b bVar : values) {
            arrayList.add(bVar.f105803c);
        }
        Set ab = C69540x.m100846ab(arrayList);
        Map map = this.f105872c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!ab.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Duration duration = this.f105874e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Duration duration2 = ((C40290n) entry2.getValue()).f105839b;
            if (duration2 == null || duration2.abs().compareTo(duration) >= 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            e.mo55395g((String) entry3.getKey());
            j -= ((C40290n) entry3.getValue()).f105838a;
            j2--;
        }
        Instant b = C40265ae.m69883b(this.f105873d.f105878d);
        C62934bn builder = abVar.toBuilder();
        C69664n.m101060f(builder, "oldIndex.toBuilder()");
        C40302z zVar = (C40302z) builder;
        C69664n.m101060f(b, "now");
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(((C40262ab) zVar.instance).f105756a));
        C69664n.m101060f(unmodifiableMap, "indexBuilder.filesMap");
        for (Map.Entry entry4 : unmodifiableMap.entrySet()) {
            String str = (String) entry4.getKey();
            C40278b bVar2 = (C40278b) entry4.getValue();
            C63042fg fgVar = bVar2.f105804d;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (fgVar != null) {
                C63042fg fgVar2 = bVar2.f105804d;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                C69664n.m101060f(fgVar2, "file.lastUsed");
                if (C40265ae.m69884c(fgVar2).compareTo(b) <= 0) {
                }
            }
            C69664n.m101060f(bVar2, "file");
            C62934bn builder2 = bVar2.toBuilder();
            C69664n.m101060f(builder2, "this.toBuilder()");
            C40280d a = C69664n.m101061g((C40260a) builder2, "builder");
            C63042fg c = C62950b.m95472c(b);
            C69664n.m101060f(c, "toProtoTimestamp(this)");
            a.mo42372b(c);
            zVar.mo42391a(str, a.mo42371a());
        }
        C69731k h = C69734n.m101140h(C69540x.m100847ac(Collections.unmodifiableMap(Collections.unmodifiableMap(((C40262ab) zVar.instance).f105756a)).values()), new C40299w(b, this.f105874e));
        C40298v vVar = new C40298v();
        C69664n.m101061g(h, "<this>");
        Iterator a2 = new C69716aa(h, vVar).mo5191a();
        while (a2.hasNext() && (j > 0 || j2 > 0)) {
            C40278b bVar3 = (C40278b) a2.next();
            String str2 = bVar3.f105802b;
            str2.getClass();
            zVar.copyOnWrite();
            ((C40262ab) zVar.instance).mo42367a().remove(str2);
            C40290n nVar = (C40290n) this.f105872c.get(bVar3.f105803c);
            if (nVar != null) {
                e.mo55395g(bVar3.f105803c);
                j -= nVar.f105838a;
                j2--;
            }
        }
        return new C69685i(zVar.build(), e.mo55394f());
    }
}
