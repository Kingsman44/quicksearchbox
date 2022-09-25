package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.common.text.C24129e;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4172bg.p4173a.C55692c;
import com.google.p440an.p441a.C8837d;
import com.google.p440an.p441a.C8838e;
import com.google.p440an.p441a.C8841h;
import com.google.p440an.p441a.C8843j;
import com.google.p4492ck.p4493a.p4494a.C58126a;
import com.google.p4492ck.p4493a.p4494a.C58127b;
import com.google.protos.p5132q.C65867j;
import com.google.protos.p5132q.C65868k;
import com.google.protos.p5132q.C65873p;
import com.google.protos.p5132q.C65874q;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ca */
/* compiled from: PG */
public final class C24590ca extends C68247h {

    /* renamed from: a */
    private final C68283d f67286a;

    public C24590ca(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C24590ca.class), aVar);
        this.f67286a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        int i;
        C58833ax axVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        C58485gu b = ((C55692c) obj).f146927b.mo55277g(C65873p.LINE);
        int size = b.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            C65868k kVar = ((C65874q) b.get(i3)).f179088g;
            if (kVar == null) {
                kVar = C65868k.f179051b;
            }
            Iterator it = kVar.f179053a.iterator();
            int i5 = i4;
            int i6 = i2;
            while (true) {
                i = i3 + 1;
                if (!it.hasNext()) {
                    break;
                }
                C65867j jVar = (C65867j) it.next();
                if ((jVar.f179047a & 1) == 0 || jVar.f179048b.isEmpty()) {
                    ((C58970a) ((C58970a) C24587by.f67283a.mo56226d()).mo56372aa(48847)).mo56386p("Line has empty bcp47Tag which is unexpected. Skipping.");
                } else {
                    try {
                        C8841h a = C8841h.m23466a(jVar.f179048b);
                        C8841h b2 = a.mo17252b();
                        if (!b2.f30255g.equals("und")) {
                            Map.EL.merge(hashMap, b2, 1, C24582bt.f67274a);
                            Map.EL.merge(hashMap3, b2, Float.valueOf(jVar.f179049c), C24583bu.f67275a);
                            i5++;
                        }
                        int i7 = a.f30257i;
                        if (i7 == 0 || i7 == 198) {
                            axVar = C24129e.m44828b(b2.f30255g);
                        } else {
                            axVar = C58833ax.m90833j((String) C24129e.f65885a.get(C8843j.m23484a(i7)));
                        }
                        if (axVar.mo56113h()) {
                            Map.EL.merge(hashMap2, (String) axVar.mo56107c(), 1, C24582bt.f67274a);
                            Map.EL.merge(hashMap4, (String) axVar.mo56107c(), Float.valueOf(jVar.f179049c), C24584bv.f67276a);
                            i6++;
                        } else {
                            ((C58970a) ((C58970a) C24587by.f67283a.mo56226d()).mo56372aa(48848)).mo56389s("Script could not be interfered for bcp47Tag=%s for lens.", jVar.f179048b);
                        }
                    } catch (C8837d | C8838e e) {
                        ((C58970a) ((C58970a) ((C58970a) C24587by.f67283a.mo56226d()).mo56382g(e)).mo56372aa(48849)).mo56389s("Could not parse bcp74Tag='%s'. Skipping line.", jVar.f179048b);
                    }
                }
            }
            i3 = i;
            i2 = i6;
            i4 = i5;
        }
        for (Map.Entry entry : hashMap3.entrySet()) {
            entry.setValue(Float.valueOf(((Float) entry.getValue()).floatValue() / ((float) Math.max(((Integer) Map.EL.getOrDefault(hashMap, entry.getKey(), 1)).intValue(), 1))));
        }
        for (Map.Entry entry2 : hashMap4.entrySet()) {
            entry2.setValue(Float.valueOf(((Float) entry2.getValue()).floatValue() / ((float) Math.max(((Integer) Map.EL.getOrDefault(hashMap2, entry2.getKey(), 1)).intValue(), 1))));
        }
        C58126a aVar = (C58126a) C58127b.f155392g.createBuilder();
        Collection.EL.stream(hashMap3.entrySet()).sorted(Comparator.EL.reversed(Map.Entry.CC.comparingByValue())).forEachOrdered(new C24585bw(aVar, hashMap, i4));
        Collection.EL.stream(hashMap4.entrySet()).sorted(Comparator.EL.reversed(Map.Entry.CC.comparingByValue())).forEachOrdered(new C24586bx(aVar, hashMap2, i2));
        return C60856cj.m92900i((C58127b) aVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f67286a.mo60297gq();
    }
}
