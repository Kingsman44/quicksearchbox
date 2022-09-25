package com.google.android.libraries.assistant.auto.tng.assistant.p885e.p886a;

import com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a.C11953b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16757g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16758h;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16760j;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32442ai;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.assistant.p3931f.p3939c.C52849z;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.e.a.h */
/* compiled from: PG */
final class C13089h implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C13097p f40599a;

    public C13089h(C13097p pVar) {
        this.f40599a = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C32442ai aiVar = (C32442ai) obj;
        C13097p pVar = this.f40599a;
        C11953b bVar = pVar.f40622c;
        C16757g gVar2 = (C16757g) C16758h.f49035i.createBuilder();
        C69664n.m101060f(gVar2, "newBuilder()");
        C16760j a = C69664n.m101061g(gVar2, "builder");
        String str = ((String) pVar.f40624e.get()).toString();
        C69664n.m101061g(str, "value");
        C16757g gVar3 = a.f49046a;
        gVar3.copyOnWrite();
        C16758h hVar = (C16758h) gVar3.instance;
        str.getClass();
        hVar.f49037a |= 4;
        hVar.f49040d = str;
        Object obj2 = pVar.f40623d.get();
        C69664n.m101060f(obj2, "this@RemoteActionsDataSe…istantRequestConfig.get()");
        a.mo22999b((C12991i) obj2);
        C52849z zVar = aiVar.f86913a;
        if (zVar != null) {
            C16757g gVar4 = a.f49046a;
            gVar4.copyOnWrite();
            C16758h hVar2 = (C16758h) gVar4.instance;
            hVar2.f49038b = zVar;
            hVar2.f49037a |= 1;
        }
        C52829f fVar = aiVar.f86914b;
        if (fVar != null) {
            C16757g gVar5 = a.f49046a;
            gVar5.copyOnWrite();
            C16758h hVar3 = (C16758h) gVar5.instance;
            hVar3.f49039c = fVar;
            hVar3.f49037a |= 2;
        }
        bVar.mo20333d(a.mo22998a());
        return C69788q.f186170a;
    }
}
