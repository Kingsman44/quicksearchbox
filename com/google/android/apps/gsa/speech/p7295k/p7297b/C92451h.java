package com.google.android.apps.gsa.speech.p7295k.p7297b;

import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.speech.p5224k.p5225a.C67229g;
import com.google.speech.p5224k.p5225a.C67230h;
import com.google.speech.p5224k.p5225a.C67231i;

/* renamed from: com.google.android.apps.gsa.speech.k.b.h */
/* compiled from: PG */
public final class C92451h {
    /* renamed from: a */
    public static void m151927a(C92449f fVar, HotwordResultMetadata hotwordResultMetadata) {
        C67230h hVar = (C67230h) C67231i.f182719l.createBuilder();
        float c = hotwordResultMetadata.mo84599c();
        hVar.copyOnWrite();
        C67231i iVar = (C67231i) hVar.instance;
        iVar.f182721a |= 2;
        iVar.f182723c = c;
        float d = hotwordResultMetadata.mo84600d();
        hVar.copyOnWrite();
        C67231i iVar2 = (C67231i) hVar.instance;
        iVar2.f182721a |= 4;
        iVar2.f182724d = d;
        C67229g j = hotwordResultMetadata.mo84608j();
        hVar.copyOnWrite();
        C67231i iVar3 = (C67231i) hVar.instance;
        iVar3.f182727g = j.f182718e;
        iVar3.f182721a |= 32;
        String str = (String) hotwordResultMetadata.mo84607i().mo56111f();
        if (str != null) {
            hVar.copyOnWrite();
            C67231i iVar4 = (C67231i) hVar.instance;
            iVar4.f182721a |= 1;
            iVar4.f182722b = str;
        }
        boolean l = hotwordResultMetadata.mo84610l();
        hVar.copyOnWrite();
        C67231i iVar5 = (C67231i) hVar.instance;
        iVar5.f182721a |= 64;
        iVar5.f182728h = l;
        fVar.f257853b = (C67231i) hVar.build();
    }

    /* renamed from: b */
    public static void m151928b(C92449f fVar, boolean z) {
        if (z) {
            fVar.f257852a = "unicorn";
        }
    }
}
