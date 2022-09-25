package com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40308aa;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40313d;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40469f;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40470g;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.g.t */
/* compiled from: PG */
public final class C40408t implements C68220f {

    /* renamed from: a */
    private final C69464a f106069a;

    /* renamed from: b */
    private final C69464a f106070b;

    /* renamed from: c */
    private final C69464a f106071c;

    public C40408t(C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f106069a = aVar;
        this.f106070b = aVar2;
        this.f106071c = aVar3;
    }

    /* renamed from: a */
    public static Set m70097a(Set set, C40469f fVar, C40335z zVar) {
        if (set != null) {
            ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((C40313d) it.next()).mo42394a(fVar, zVar));
            }
            Set ab = C69540x.m100846ab(arrayList);
            if (ab != null) {
                return ab;
            }
        }
        return C69498ao.f185920a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        return m70097a((Set) ((C68221g) this.f106069a).f184583a, ((C40470g) this.f106070b).mo17428b(), ((C40308aa) this.f106071c).mo17428b());
    }
}
