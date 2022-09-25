package com.google.android.libraries.assistant.auto.tng.assistant.p885e.p886a;

import com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a.C11953b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16757g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16758h;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16760j;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32458q;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32460s;
import com.google.assistant.p3931f.p3939c.C52813ac;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.assistant.auto.tng.assistant.thirdpartydataservice.impl.RemoteActionsDataServiceImpl$subscribeToFlow$1$5", mo61344c = "RemoteActionsDataServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {138})
/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.e.a.m */
/* compiled from: PG */
final class C13094m extends C69572j implements C69630p {

    /* renamed from: a */
    int f40608a;

    /* renamed from: b */
    final /* synthetic */ C32433a f40609b;

    /* renamed from: c */
    final /* synthetic */ C13097p f40610c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13094m(C32433a aVar, C13097p pVar, C69577g gVar) {
        super(2, gVar);
        this.f40609b = aVar;
        this.f40610c = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C13094m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f40608a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71816z zVar = ((C32458q) this.f40609b).f86986o;
            this.f40608a = 1;
            obj = zVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C32460s sVar = (C32460s) obj;
        int i = C13097p.f40615g;
        C52813ac acVar = (C52813ac) ((C32458q) this.f40609b).f86983l.get();
        if (acVar != null) {
            C13097p pVar = this.f40610c;
            C11953b bVar = pVar.f40622c;
            C16757g gVar = (C16757g) C16758h.f49035i.createBuilder();
            C69664n.m101060f(gVar, "newBuilder()");
            C16760j a = C69664n.m101061g(gVar, "builder");
            Object obj2 = pVar.f40623d.get();
            C69664n.m101060f(obj2, "this@RemoteActionsDataSe…istantRequestConfig.get()");
            a.mo22999b((C12991i) obj2);
            C16757g gVar2 = a.f49046a;
            gVar2.copyOnWrite();
            C16758h hVar = (C16758h) gVar2.instance;
            hVar.f49043g = acVar;
            hVar.f49037a |= 32;
            C16757g gVar3 = a.f49046a;
            gVar3.copyOnWrite();
            C16758h hVar2 = (C16758h) gVar3.instance;
            hVar2.f49037a |= 64;
            hVar2.f49044h = true;
            bVar.mo20333d(a.mo22998a());
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C13094m(this.f40609b, this.f40610c, gVar);
    }
}
