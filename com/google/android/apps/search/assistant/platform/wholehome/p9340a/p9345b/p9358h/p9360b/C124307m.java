package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124203s;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.android.apps.search.assistant.platform.wholehome.shared.jni.WholeHomeJniNative;
import com.google.assistant.p3741aa.C48130a;
import com.google.assistant.p3741aa.C48169d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.m */
/* compiled from: PG */
public final /* synthetic */ class C124307m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124315u f343147a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f343148b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f343149c;

    /* renamed from: d */
    public final /* synthetic */ C124204t f343150d;

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f343151e;

    public /* synthetic */ C124307m(C124315u uVar, C60870cx cxVar, C60870cx cxVar2, C124204t tVar, AtomicReference atomicReference) {
        this.f343147a = uVar;
        this.f343148b = cxVar;
        this.f343149c = cxVar2;
        this.f343150d = tVar;
        this.f343151e = atomicReference;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124315u uVar = this.f343147a;
        C60870cx cxVar = this.f343148b;
        C60870cx cxVar2 = this.f343149c;
        C124204t tVar = this.f343150d;
        AtomicReference atomicReference = this.f343151e;
        WholeHomeJniNative wholeHomeJniNative = (WholeHomeJniNative) C60856cj.m92909r(cxVar);
        String str = (String) C60856cj.m92909r(cxVar2);
        String str2 = tVar.f342962a;
        C124203s sVar = (C124203s) tVar.toBuilder();
        C48169d dVar = tVar.f342963b;
        if (dVar == null) {
            dVar = C48169d.f124635g;
        }
        C48130a aVar = (C48130a) dVar.toBuilder();
        aVar.copyOnWrite();
        C48169d dVar2 = (C48169d) aVar.instance;
        str.getClass();
        dVar2.f124637a |= 2;
        dVar2.f124639c = str;
        sVar.copyOnWrite();
        C48169d dVar3 = (C48169d) aVar.build();
        dVar3.getClass();
        ((C124204t) sVar.instance).f342963b = dVar3;
        wholeHomeJniNative.mo106381b((C124204t) sVar.build());
        atomicReference.set(C2169h.m6027a(new C124295a(uVar, str2)));
        return C60866ct.f164955a;
    }
}
