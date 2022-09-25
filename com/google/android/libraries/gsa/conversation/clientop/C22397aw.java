package com.google.android.libraries.gsa.conversation.clientop;

import com.google.assistant.p3897e.p3921j.C51785da;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import java.util.HashSet;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.aw */
/* compiled from: PG */
public final class C22397aw implements C68220f {

    /* renamed from: a */
    private final C69464a f61881a;

    /* renamed from: b */
    private final C69464a f61882b;

    public C22397aw(C69464a aVar, C69464a aVar2) {
        this.f61881a = aVar;
        this.f61882b = aVar2;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo17428b() {
        Map a = ((C22547x) this.f61881a).mo17428b();
        C22458f fVar = (C22458f) ((C68221g) this.f61882b).f184583a;
        HashSet hashSet = new HashSet(a.size());
        for (String a2 : a.keySet()) {
            C51785da a3 = C22458f.m41903a(a2);
            if (a3 != null) {
                hashSet.add(a3);
            }
        }
        return hashSet;
    }
}
