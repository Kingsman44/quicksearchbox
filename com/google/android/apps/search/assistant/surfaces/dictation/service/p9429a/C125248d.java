package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.d */
/* compiled from: PG */
public final /* synthetic */ class C125248d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C125255k f345510a;

    /* renamed from: b */
    public final /* synthetic */ C125258n f345511b;

    public /* synthetic */ C125248d(C125255k kVar, C125258n nVar) {
        this.f345510a = kVar;
        this.f345511b = nVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C125255k kVar = this.f345510a;
        C125258n nVar = this.f345511b;
        long andIncrement = kVar.f345542m.getAndIncrement();
        ((C59052c) ((C59052c) C125255k.f345530a.mo56224b()).mo56372aa(36433)).mo56354G("Starting AiAi availability check #%s for '%s'. [SD]", C126290c.m206496a(Long.valueOf(andIncrement)), nVar);
        kVar.f345535f.mo107406e(andIncrement);
        AtomicReference atomicReference = new AtomicReference();
        C60870cx a = C2169h.m6027a(new C125249e(kVar, andIncrement, nVar, atomicReference));
        if (kVar.f345539j) {
            C60870cx b = kVar.mo106880b(a);
            C126308aq aqVar = new C126308aq(new C125250f(kVar, andIncrement), C125251g.f345518a);
            C60856cj.m92911t(b, C47810es.m84974n(aqVar), kVar.f345531b);
            cxVar = C126309ar.m206526e(a, kVar.f345537h, kVar.f345531b);
        } else {
            cxVar = C126309ar.m206526e(a, kVar.f345536g, kVar.f345531b);
        }
        C126308aq aqVar2 = new C126308aq(new C125252h(kVar, andIncrement, atomicReference), new C125253i(kVar, andIncrement, atomicReference));
        C60856cj.m92911t(cxVar, C47810es.m84974n(aqVar2), kVar.f345531b);
        return cxVar;
    }
}
