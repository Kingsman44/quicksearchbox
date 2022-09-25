package com.google.android.libraries.search.p2904c.p2975u;

import com.google.android.libraries.search.p2904c.C37419bx;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.u.f */
/* compiled from: PG */
public final class C38118f implements C68220f {
    /* renamed from: a */
    public static C37419bx m67295a(boolean z, C69464a aVar, C69464a aVar2) {
        C37419bx bxVar;
        C69664n.m101061g(aVar, "audioRequestClientProvider");
        C69664n.m101061g(aVar2, "primaryAudioRequestClientProvider");
        if (z) {
            Object b = aVar2.mo17428b();
            C69664n.m101060f(b, "{\n        primaryAudioRe…entProvider.get()\n      }");
            bxVar = (C37419bx) b;
        } else {
            Object b2 = aVar.mo17428b();
            C69664n.m101060f(b2, "{\n        audioRequestClientProvider.get()\n      }");
            bxVar = (C37419bx) b2;
        }
        C68225k.m98532d(bxVar);
        return bxVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
