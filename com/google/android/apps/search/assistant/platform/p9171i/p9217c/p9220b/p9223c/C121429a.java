package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9223c;

import com.google.assistant.p3781ad.p3787c.p3788a.C48482aa;
import com.google.assistant.p3781ad.p3787c.p3788a.C48544x;
import com.google.assistant.p3781ad.p3787c.p3788a.C48545y;
import com.google.assistant.p3781ad.p3787c.p3788a.C48546z;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.c.a */
/* compiled from: PG */
public final class C121429a {

    /* renamed from: a */
    public final C48545y f337080a;

    /* renamed from: b */
    public final List f337081b;

    public C121429a(C48545y yVar) {
        if (yVar.f125420b.size() >= 2) {
            this.f337080a = yVar;
            yVar.getClass();
            int size = yVar.f125420b.size() - 1;
            ArrayList arrayList = new ArrayList(size);
            int i = 0;
            while (i < size) {
                C48482aa aaVar = (C48482aa) this.f337080a.f125420b.get(i);
                i++;
                C48482aa aaVar2 = (C48482aa) this.f337080a.f125420b.get(i);
                arrayList.add(new C121430b(m200670b(mo105137a(aaVar.f125241b), aaVar.f125242c), m200670b(mo105137a(aaVar2.f125241b), aaVar2.f125242c)));
            }
            this.f337081b = arrayList;
            return;
        }
        throw new IllegalArgumentException("points must have at least 2 elements");
    }

    /* renamed from: b */
    private static C48482aa m200670b(double d, double d2) {
        C48546z zVar = (C48546z) C48482aa.f125238d.createBuilder();
        zVar.copyOnWrite();
        C48482aa aaVar = (C48482aa) zVar.instance;
        aaVar.f125240a |= 1;
        aaVar.f125241b = d;
        zVar.copyOnWrite();
        C48482aa aaVar2 = (C48482aa) zVar.instance;
        aaVar2.f125240a |= 2;
        aaVar2.f125242c = d2;
        return (C48482aa) zVar.build();
    }

    /* renamed from: a */
    public final double mo105137a(double d) {
        C48545y yVar = this.f337080a;
        yVar.getClass();
        int a = C48544x.m85235a(yVar.f125419a);
        if (a == 0 || a == 1) {
            return d;
        }
        if (a == 2) {
            return Math.log(d);
        }
        if (a == 3) {
            return Math.log1p(d);
        }
        if (d >= C59203do.f157270a) {
            return Math.log1p(d);
        }
        return -Math.log1p(-d);
    }
}
