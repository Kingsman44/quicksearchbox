package com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b;

import com.google.android.apps.search.googleapp.search.suggest.C138016ah;
import com.google.android.apps.search.googleapp.search.suggest.C138019ak;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.b.n */
/* compiled from: PG */
public final class C138589n {
    /* renamed from: a */
    public static final C138590o m225046a(C138030av avVar, String str, String str2, boolean z) {
        C69664n.m101061g(avVar, "suggestion");
        C69664n.m101061g(str, "message");
        C69664n.m101061g(str2, "learnMoreUrl");
        C138016ah ahVar = (C138016ah) C138019ak.f375490i.createBuilder();
        ahVar.copyOnWrite();
        C138019ak akVar = (C138019ak) ahVar.instance;
        avVar.getClass();
        akVar.f375493b = avVar;
        akVar.f375492a |= 1;
        ahVar.copyOnWrite();
        C138019ak akVar2 = (C138019ak) ahVar.instance;
        akVar2.f375494c = 1;
        akVar2.f375492a |= 2;
        ahVar.copyOnWrite();
        C138019ak akVar3 = (C138019ak) ahVar.instance;
        str.getClass();
        akVar3.f375492a |= 4;
        akVar3.f375495d = str;
        ahVar.copyOnWrite();
        C138019ak akVar4 = (C138019ak) ahVar.instance;
        str2.getClass();
        akVar4.f375492a |= 8;
        akVar4.f375496e = str2;
        ahVar.copyOnWrite();
        C138019ak akVar5 = (C138019ak) ahVar.instance;
        akVar5.f375492a |= 16;
        akVar5.f375497f = z;
        C62942bv build = ahVar.build();
        C69664n.m101060f(build, "newBuilder()\n          .…abled)\n          .build()");
        return new C138590o((C138019ak) build);
    }

    /* renamed from: b */
    public static final C138590o m225047b(C138030av avVar, String str, boolean z) {
        C69664n.m101061g(avVar, "suggestion");
        C69664n.m101061g(str, "message");
        C138016ah ahVar = (C138016ah) C138019ak.f375490i.createBuilder();
        ahVar.copyOnWrite();
        C138019ak akVar = (C138019ak) ahVar.instance;
        avVar.getClass();
        akVar.f375493b = avVar;
        akVar.f375492a |= 1;
        ahVar.copyOnWrite();
        C138019ak akVar2 = (C138019ak) ahVar.instance;
        akVar2.f375494c = 2;
        akVar2.f375492a = 2 | akVar2.f375492a;
        ahVar.copyOnWrite();
        C138019ak akVar3 = (C138019ak) ahVar.instance;
        str.getClass();
        akVar3.f375492a |= 4;
        akVar3.f375495d = str;
        ahVar.copyOnWrite();
        C138019ak akVar4 = (C138019ak) ahVar.instance;
        akVar4.f375492a |= 16;
        akVar4.f375497f = z;
        C62942bv build = ahVar.build();
        C69664n.m101060f(build, "newBuilder()\n          .…abled)\n          .build()");
        return new C138590o((C138019ak) build);
    }

    /* renamed from: c */
    public static final C138590o m225048c(C138030av avVar, int i, String str, String str2) {
        C69664n.m101061g(avVar, "suggestion");
        C69664n.m101061g(str, "message");
        C69664n.m101061g(str2, "learnMoreUrl");
        C138016ah ahVar = (C138016ah) C138019ak.f375490i.createBuilder();
        ahVar.copyOnWrite();
        C138019ak akVar = (C138019ak) ahVar.instance;
        avVar.getClass();
        akVar.f375493b = avVar;
        akVar.f375492a |= 1;
        ahVar.copyOnWrite();
        C138019ak akVar2 = (C138019ak) ahVar.instance;
        akVar2.f375494c = 0;
        akVar2.f375492a |= 2;
        ahVar.copyOnWrite();
        C138019ak akVar3 = (C138019ak) ahVar.instance;
        akVar3.f375492a |= 32;
        akVar3.f375498g = i;
        ahVar.copyOnWrite();
        C138019ak akVar4 = (C138019ak) ahVar.instance;
        str.getClass();
        akVar4.f375492a |= 4;
        akVar4.f375495d = str;
        ahVar.copyOnWrite();
        C138019ak akVar5 = (C138019ak) ahVar.instance;
        str2.getClass();
        akVar5.f375492a |= 8;
        akVar5.f375496e = str2;
        C62942bv build = ahVar.build();
        C69664n.m101060f(build, "newBuilder()\n          .…reUrl)\n          .build()");
        return new C138590o((C138019ak) build);
    }
}
