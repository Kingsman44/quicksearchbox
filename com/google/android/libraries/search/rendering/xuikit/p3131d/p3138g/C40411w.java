package com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40308aa;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40309ab;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40477n;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40478o;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.g.w */
/* compiled from: PG */
public final class C40411w implements C68220f {

    /* renamed from: a */
    private final C69464a f106077a;

    /* renamed from: b */
    private final C69464a f106078b;

    /* renamed from: c */
    private final C69464a f106079c;

    public C40411w(C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f106077a = aVar;
        this.f106078b = aVar2;
        this.f106079c = aVar3;
    }

    /* renamed from: a */
    public static Set m70103a(Set set, C40477n nVar, C40335z zVar) {
        if (set != null) {
            ArrayList arrayList = new ArrayList(C69540x.m100804k(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((C40309ab) it.next()).mo42393a(nVar, zVar));
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
        return m70103a((Set) ((C68221g) this.f106077a).f184583a, ((C40478o) this.f106078b).mo17428b(), ((C40308aa) this.f106079c).mo17428b());
    }
}
