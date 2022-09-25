package com.google.android.apps.gsa.shared.p7038f.p7039a;

import android.content.Context;
import android.content.pm.LauncherApps;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c.C130441b;
import com.google.assistant.p3825an.p3830c.p3831a.C49266al;
import com.google.assistant.p3825an.p3830c.p3831a.C49267am;
import com.google.assistant.p3825an.p3830c.p3831a.C49292bk;
import com.google.assistant.p3825an.p3830c.p3831a.C49293bl;
import com.google.assistant.p3825an.p3830c.p3831a.C49331h;
import com.google.assistant.p3825an.p3830c.p3831a.C49333j;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.shared.f.a.p */
/* compiled from: PG */
public final class C89756p {

    /* renamed from: a */
    public static final C58974d f242940a = C58974d.m91136j();

    /* renamed from: b */
    private final C89746f f242941b;

    /* renamed from: c */
    private final C89737an f242942c;

    /* renamed from: d */
    private final C90021c f242943d;

    /* renamed from: e */
    private final Map f242944e;

    /* renamed from: f */
    private final PackageManager f242945f;

    public C89756p(C89746f fVar, C89737an anVar, C90021c cVar, Context context, Map map) {
        this.f242941b = fVar;
        this.f242942c = anVar;
        this.f242943d = cVar;
        this.f242944e = map;
        this.f242945f = context.getPackageManager();
    }

    /* renamed from: a */
    public final C60870cx mo83620a() {
        C60870cx cxVar;
        C58528ij a = C130441b.m212876a(this.f242945f);
        HashMap hashMap = new HashMap();
        C49292bk bkVar = (C49292bk) C49293bl.f127401b.createBuilder();
        Iterator it = this.f242944e.keySet().iterator();
        while (true) {
            char c = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            for (C49267am amVar : (List) this.f242944e.get(str)) {
                if (!hashMap.containsKey(str)) {
                    String[] strArr = new String[1];
                    strArr[c] = amVar.f127350c;
                    HashSet g = C58758qx.m90649g(1);
                    Collections.addAll(g, strArr);
                    hashMap.put(str, g);
                } else if (!((Set) hashMap.get(str)).add(amVar.f127350c)) {
                }
                C49266al alVar = (C49266al) C49267am.f127346f.createBuilder();
                alVar.copyOnWrite();
                C49267am amVar2 = (C49267am) alVar.instance;
                str.getClass();
                amVar2.f127348a |= 1;
                amVar2.f127349b = str;
                String str2 = amVar.f127350c;
                alVar.copyOnWrite();
                C49267am amVar3 = (C49267am) alVar.instance;
                str2.getClass();
                amVar3.f127348a |= 2;
                amVar3.f127350c = str2;
                int i = (amVar.f127348a & 4) != 0 ? amVar.f127351d : 1;
                alVar.copyOnWrite();
                C49267am amVar4 = (C49267am) alVar.instance;
                amVar4.f127348a |= 4;
                amVar4.f127351d = i;
                int i2 = (amVar.f127348a & 8) != 0 ? amVar.f127352e : 10;
                alVar.copyOnWrite();
                C49267am amVar5 = (C49267am) alVar.instance;
                amVar5.f127348a |= 8;
                amVar5.f127352e = i2;
                bkVar.mo53228b(alVar);
                c = 0;
            }
        }
        C58800sl lA = a.iterator();
        while (lA.hasNext()) {
            String str3 = (String) lA.next();
            Set set = (Set) Map.EL.computeIfAbsent(hashMap, str3, C89748h.f242931a);
            if (set.add("schema.org/Thing")) {
                C49266al alVar2 = (C49266al) C49267am.f127346f.createBuilder();
                alVar2.copyOnWrite();
                C49267am amVar6 = (C49267am) alVar2.instance;
                str3.getClass();
                amVar6.f127348a |= 1;
                amVar6.f127349b = str3;
                alVar2.copyOnWrite();
                C49267am amVar7 = (C49267am) alVar2.instance;
                amVar7.f127348a |= 2;
                amVar7.f127350c = "schema.org/Thing";
                alVar2.copyOnWrite();
                C49267am amVar8 = (C49267am) alVar2.instance;
                amVar8.f127348a |= 4;
                amVar8.f127351d = 1;
                alVar2.copyOnWrite();
                C49267am amVar9 = (C49267am) alVar2.instance;
                amVar9.f127348a |= 8;
                amVar9.f127352e = 10;
                bkVar.mo53228b(alVar2);
            }
            if (set.add("schema.org/Shortcut")) {
                C49266al alVar3 = (C49266al) C49267am.f127346f.createBuilder();
                alVar3.copyOnWrite();
                C49267am amVar10 = (C49267am) alVar3.instance;
                str3.getClass();
                amVar10.f127348a |= 1;
                amVar10.f127349b = str3;
                alVar3.copyOnWrite();
                C49267am amVar11 = (C49267am) alVar3.instance;
                amVar11.f127348a |= 2;
                amVar11.f127350c = "schema.org/Shortcut";
                alVar3.copyOnWrite();
                C49267am amVar12 = (C49267am) alVar3.instance;
                amVar12.f127348a |= 4;
                amVar12.f127351d = 1;
                alVar3.copyOnWrite();
                C49267am amVar13 = (C49267am) alVar3.instance;
                amVar13.f127348a |= 8;
                amVar13.f127352e = 10;
                bkVar.mo53228b(alVar3);
            }
        }
        C89737an anVar = this.f242942c;
        C49331h hVar = (C49331h) C49333j.f127504f.createBuilder();
        C49293bl blVar = (C49293bl) bkVar.build();
        hVar.copyOnWrite();
        C49333j jVar = (C49333j) hVar.instance;
        blVar.getClass();
        jVar.f127508c = blVar;
        jVar.f127507b = 1;
        String x = this.f242943d.mo79758x(C90019by.f248058H);
        hVar.copyOnWrite();
        C49333j jVar2 = (C49333j) hVar.instance;
        x.getClass();
        jVar2.f127506a |= 4;
        jVar2.f127509d = x;
        C60870cx a2 = anVar.mo83617a((C49333j) hVar.build());
        Set set2 = (Set) Collection.EL.stream(this.f242945f.getInstalledPackages(0)).map(C89749i.f242932a).collect(Collectors.toSet());
        if (this.f242943d.mo79746e(C90019by.f248082p)) {
            cxVar = this.f242941b.mo83618a(new LauncherApps.ShortcutQuery().setQueryFlags(Build.VERSION.SDK_INT >= 30 ? 27 : 11), C58528ij.m90006F(set2));
        } else {
            cxVar = this.f242941b.mo83618a(new LauncherApps.ShortcutQuery().setQueryFlags(8), C58528ij.m90006F(set2));
        }
        return C60856cj.m92893b(cxVar, a2).mo57334a(new C89750j(cxVar, a2), C60826bg.f164896a);
    }
}
