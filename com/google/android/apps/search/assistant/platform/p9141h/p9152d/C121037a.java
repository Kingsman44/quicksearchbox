package com.google.android.apps.search.assistant.platform.p9141h.p9152d;

import com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a.C121040c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.settingsdata.inputmodality.AgsaClassicInputModalityUtils$setPreferredInputProtoDataStoreValue$1", mo61344c = "AgsaClassicInputModalityUtils.kt", mo61345d = "invokeSuspend", mo61346e = {28})
/* renamed from: com.google.android.apps.search.assistant.platform.h.d.a */
/* compiled from: PG */
final class C121037a extends C69572j implements C69630p {

    /* renamed from: a */
    int f336417a;

    /* renamed from: b */
    final /* synthetic */ C121042b f336418b;

    /* renamed from: c */
    final /* synthetic */ String f336419c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121037a(C121042b bVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f336418b = bVar;
        this.f336419c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121037a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C121040c cVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336417a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar2 = (C59052c) ((C59052c) C121042b.f336430a.mo56226d()).mo56382g(th);
                cVar2.mo56379ah(new C59094n(35687));
                cVar2.mo56386p("Failed to write input modality from AGSA-Classic settings.");
            }
        } else {
            C69714l.m101134b(obj);
            C121048h hVar = this.f336418b.f336431b;
            String str = this.f336419c;
            C69664n.m101061g(str, "sharedPreferencesValue");
            if (C69664n.m101066l(str, "voice")) {
                cVar = C121040c.VOICE;
            } else if (C69664n.m101066l(str, "typing")) {
                cVar = C121040c.TOUCH;
            } else {
                cVar = C121040c.VOICE;
            }
            C69664n.m101061g(cVar, "inputModality");
            C60870cx e = C71663i.m104692e(hVar.f336442c, (C71424ay) null, new C121047g(hVar, cVar, (C69577g) null), 3);
            this.f336417a = 1;
            if (C71663i.m104690c(e, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121037a(this.f336418b, this.f336419c, gVar);
    }
}
