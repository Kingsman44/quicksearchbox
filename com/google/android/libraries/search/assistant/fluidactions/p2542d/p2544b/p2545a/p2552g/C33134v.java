package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3745ab.p3755g.C48330e;
import com.google.assistant.p3745ab.p3755g.C48331f;
import com.google.assistant.p3745ab.p3755g.C48332g;
import com.google.assistant.p3745ab.p3755g.C48333h;
import com.google.assistant.p3745ab.p3755g.C48334i;
import com.google.assistant.p3745ab.p3755g.C48335j;
import com.google.assistant.p3745ab.p3755g.C48336k;
import com.google.assistant.p3745ab.p3755g.C48337l;
import com.google.assistant.p3745ab.p3755g.C48338m;
import com.google.assistant.p3745ab.p3755g.C48339n;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58557jl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import p3186j$.util.Collection;
import p5585l.p5586a.p5587a.p5588a.C71817a;
import p5585l.p5586a.p5587a.p5588a.C71818b;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.v */
/* compiled from: PG */
public final class C33134v {

    /* renamed from: a */
    public static final /* synthetic */ int f88655a = 0;

    /* renamed from: b */
    private static final Pattern f88656b = Pattern.compile("\\p{Punct}*");

    /* renamed from: b */
    private static boolean m61483b(String str) {
        return !TextUtils.isEmpty(str) && f88656b.matcher(str).matches();
    }

    /* renamed from: a */
    public static C48339n m61482a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("message strings cannot be null");
        }
        C48330e eVar = (C48330e) C48339n.f124999c.createBuilder();
        C71818b bVar = new C71818b();
        LinkedList f = bVar.mo63056f(str, str2);
        bVar.mo63055b(f);
        ArrayList arrayList = new ArrayList(f.size());
        Iterator it = f.iterator();
        while (it.hasNext()) {
            C71817a aVar = (C71817a) it.next();
            int i = aVar.f191347b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        String str3 = aVar.f191346a;
                        arrayList.add(new C33133u(4, str3, str3));
                    }
                } else if (arrayList.isEmpty() || ((C33133u) C58557jl.m90131l(arrayList)).f88654c != 2) {
                    arrayList.add(new C33133u(1, BuildConfig.FLAVOR, aVar.f191346a));
                } else {
                    ((C33133u) C58557jl.m90131l(arrayList)).f88654c = 3;
                    ((C33133u) C58557jl.m90131l(arrayList)).f88653b = aVar.f191346a;
                }
            } else if (arrayList.isEmpty() || ((C33133u) C58557jl.m90131l(arrayList)).f88654c != 1) {
                arrayList.add(new C33133u(2, aVar.f191346a, BuildConfig.FLAVOR));
            } else {
                ((C33133u) C58557jl.m90131l(arrayList)).f88654c = 3;
                ((C33133u) C58557jl.m90131l(arrayList)).f88652a = aVar.f191346a;
            }
        }
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C33133u uVar = (C33133u) arrayList.get(i5);
            C48332g gVar = (C48332g) C48333h.f124978e.createBuilder();
            int size2 = C58869cf.m90936b(new C58903m(' ')).mo56152f(C58911u.f156751b).mo56151a().mo56155i(uVar.f88653b.trim()).size();
            gVar.copyOnWrite();
            ((C48333h) gVar.instance).f124981b = size2;
            gVar.copyOnWrite();
            ((C48333h) gVar.instance).f124980a = i3;
            int length = uVar.f88653b.length();
            gVar.copyOnWrite();
            ((C48333h) gVar.instance).f124983d = length;
            gVar.copyOnWrite();
            ((C48333h) gVar.instance).f124982c = i3;
            C48333h hVar = (C48333h) gVar.build();
            C48332g gVar2 = (C48332g) C48333h.f124978e.createBuilder();
            int size3 = C58869cf.m90936b(new C58903m(' ')).mo56152f(C58911u.f156751b).mo56151a().mo56155i(uVar.f88652a.trim()).size();
            gVar2.copyOnWrite();
            ((C48333h) gVar2.instance).f124981b = size3;
            gVar2.copyOnWrite();
            ((C48333h) gVar2.instance).f124980a = i4;
            int length2 = uVar.f88652a.length();
            gVar2.copyOnWrite();
            ((C48333h) gVar2.instance).f124983d = length2;
            gVar2.copyOnWrite();
            ((C48333h) gVar2.instance).f124982c = i4;
            C48333h hVar2 = (C48333h) gVar2.build();
            C48331f fVar = (C48331f) C48334i.f124984d.createBuilder();
            fVar.copyOnWrite();
            hVar.getClass();
            ((C48334i) fVar.instance).f124988c = hVar;
            fVar.copyOnWrite();
            hVar2.getClass();
            ((C48334i) fVar.instance).f124987b = hVar2;
            boolean z = uVar.f88654c != 4;
            fVar.copyOnWrite();
            ((C48334i) fVar.instance).f124986a = z;
            eVar.mo53152a((C48334i) fVar.build());
            i4 += uVar.f88652a.length();
            i3 += uVar.f88653b.length();
        }
        C48337l lVar = (C48337l) C48338m.f124994d.createBuilder();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (m61483b(String.valueOf(c))) {
                sb.append(c);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c2 : str2.toCharArray()) {
            if (m61483b(String.valueOf(c2))) {
                sb2.append(c2);
            }
        }
        int sum = Collection.EL.stream(new C71818b().mo63056f(sb.toString(), sb2.toString())).filter(C33131s.f88650a).mapToInt(C33132t.f88651a).sum();
        C48335j jVar = (C48335j) C48336k.f124989d.createBuilder();
        int length3 = sb.length();
        jVar.copyOnWrite();
        ((C48336k) jVar.instance).f124991a = length3;
        int length4 = sb2.length();
        jVar.copyOnWrite();
        ((C48336k) jVar.instance).f124992b = length4;
        jVar.copyOnWrite();
        ((C48336k) jVar.instance).f124993c = sum;
        C48336k kVar = (C48336k) jVar.build();
        lVar.copyOnWrite();
        kVar.getClass();
        ((C48338m) lVar.instance).f124996a = kVar;
        StringBuilder sb3 = new StringBuilder();
        for (char c3 : str.toCharArray()) {
            if (!m61483b(String.valueOf(c3))) {
                sb3.append(c3);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (char c4 : str2.toCharArray()) {
            if (!m61483b(String.valueOf(c4))) {
                sb4.append(c4);
            }
        }
        List i6 = C58869cf.m90936b(new C58903m(' ')).mo56152f(C58911u.f156751b).mo56151a().mo56155i(sb3.toString().trim());
        List i7 = C58869cf.m90936b(new C58903m(' ')).mo56152f(C58911u.f156751b).mo56151a().mo56155i(sb4.toString().trim());
        int sum2 = Collection.EL.stream(arrayList).filter(C33127o.f88646a).mapToInt(C33128p.f88647a).sum();
        C48335j jVar2 = (C48335j) C48336k.f124989d.createBuilder();
        int size4 = i6.size();
        jVar2.copyOnWrite();
        ((C48336k) jVar2.instance).f124991a = size4;
        int size5 = i7.size();
        jVar2.copyOnWrite();
        ((C48336k) jVar2.instance).f124992b = size5;
        jVar2.copyOnWrite();
        ((C48336k) jVar2.instance).f124993c = sum2;
        C48336k kVar2 = (C48336k) jVar2.build();
        lVar.copyOnWrite();
        kVar2.getClass();
        ((C48338m) lVar.instance).f124997b = kVar2;
        int sum3 = Collection.EL.stream(arrayList).filter(C33129q.f88648a).mapToInt(C33130r.f88649a).sum();
        C48335j jVar3 = (C48335j) C48336k.f124989d.createBuilder();
        jVar3.copyOnWrite();
        ((C48336k) jVar3.instance).f124991a = str.length();
        jVar3.copyOnWrite();
        ((C48336k) jVar3.instance).f124992b = str2.length();
        jVar3.copyOnWrite();
        ((C48336k) jVar3.instance).f124993c = sum3;
        C48336k kVar3 = (C48336k) jVar3.build();
        lVar.copyOnWrite();
        kVar3.getClass();
        ((C48338m) lVar.instance).f124998c = kVar3;
        C48338m mVar = (C48338m) lVar.build();
        eVar.copyOnWrite();
        mVar.getClass();
        ((C48339n) eVar.instance).f125002b = mVar;
        return (C48339n) eVar.build();
    }
}
