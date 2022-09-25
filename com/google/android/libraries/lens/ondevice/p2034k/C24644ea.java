package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.common.text.C24129e;
import com.google.android.libraries.lens.common.text.C24140p;
import com.google.android.libraries.lens.common.text.C24141q;
import com.google.android.libraries.lens.ondevice.p2032i.C24530h;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62336de;
import com.google.lens.p4701g.C62337df;
import com.google.lens.p4701g.C62338dg;
import com.google.lens.p4701g.C62339dh;
import com.google.lens.p4701g.C62355r;
import com.google.p4172bg.p4173a.C55692c;
import com.google.p4492ck.p4493a.p4494a.C58127b;
import com.google.protobuf.C62947c;
import com.google.protos.p5132q.C65873p;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.ea */
/* compiled from: PG */
public final class C24644ea extends C68247h {

    /* renamed from: a */
    private final C68283d f67386a;

    /* renamed from: c */
    private final C68283d f67387c;

    /* renamed from: d */
    private final C68283d f67388d;

    /* renamed from: e */
    private final C68283d f67389e;

    public C24644ea(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C24644ea.class), aVar);
        this.f67386a = C68236af.m98549d(dVar);
        this.f67387c = C68236af.m98549d(dVar2);
        this.f67388d = C68236af.m98549d(dVar3);
        this.f67389e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar;
        List list = (List) obj;
        C55692c cVar = (C55692c) list.get(0);
        C24530h hVar = (C24530h) list.get(1);
        C24735hk hkVar = (C24735hk) list.get(2);
        C58127b bVar = (C58127b) list.get(3);
        C24653ej.m45755b(C24638dv.class, hVar);
        if (!hkVar.mo29988c()) {
            axVar = hkVar.mo29986a();
        } else {
            axVar = C24129e.m44827a(bVar);
        }
        if (axVar.mo56113h()) {
            C65873p pVar = C65873p.LINE;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) Collection.EL.stream(cVar.f146927b.mo55277g(pVar)).collect(Collectors.groupingBy(C24634dr.f67378a, C24635ds.f67379a, Collectors.mapping(C24636dt.f67380a, C58370cn.f155946a)))).entrySet()) {
                if (((Integer) entry.getKey()).intValue() == -1) {
                    C58485gu guVar = (C58485gu) entry.getValue();
                    int size = guVar.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) guVar.get(i);
                        C62336de deVar = (C62336de) C62337df.f168289d.createBuilder();
                        deVar.copyOnWrite();
                        C62337df dfVar = (C62337df) deVar.instance;
                        dfVar.f168291a |= 1;
                        dfVar.f168292b = String.valueOf(entry.getKey());
                        deVar.copyOnWrite();
                        C62337df dfVar2 = (C62337df) deVar.instance;
                        str.getClass();
                        dfVar2.f168291a |= 2;
                        dfVar2.f168293c = str;
                        arrayList.add((C62337df) deVar.build());
                    }
                } else {
                    String a = C24140p.m44838a(C24141q.m44842d(Locale.forLanguageTag((String) axVar.mo56107c())), (List) entry.getValue());
                    C62336de deVar2 = (C62336de) C62337df.f168289d.createBuilder();
                    deVar2.copyOnWrite();
                    C62337df dfVar3 = (C62337df) deVar2.instance;
                    dfVar3.f168291a |= 1;
                    dfVar3.f168292b = String.valueOf(entry.getKey());
                    deVar2.copyOnWrite();
                    C62337df dfVar4 = (C62337df) deVar2.instance;
                    dfVar4.f168291a |= 2;
                    dfVar4.f168293c = a;
                    arrayList.add((C62337df) deVar2.build());
                }
            }
            C24653ej.m45756c(C24638dv.class, hVar, C62355r.f168332e);
            C62338dg dgVar = (C62338dg) C62339dh.f168294b.createBuilder();
            dgVar.copyOnWrite();
            C62339dh dhVar = (C62339dh) dgVar.instance;
            dhVar.mo58493a();
            C62947c.addAll((Iterable) arrayList, (List) dhVar.f168296a);
            return C60856cj.m92900i((C62339dh) dgVar.build());
        }
        C24653ej.m45754a(C24638dv.class, hVar);
        throw new IllegalArgumentException("Content language can't be determined. It is required for concatenating paragraph lines.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67386a.mo60297gq(), this.f67387c.mo60297gq(), this.f67388d.mo60297gq(), this.f67389e.mo60297gq());
    }
}
