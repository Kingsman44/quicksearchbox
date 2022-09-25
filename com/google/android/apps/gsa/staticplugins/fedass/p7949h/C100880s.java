package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import com.google.android.apps.gsa.staticplugins.fedass.p7945d.C100831j;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.p4017at.p4018a.p4019a.p4020a.C53785bp;
import com.google.p4017at.p4018a.p4019a.p4020a.C53786bq;
import com.google.p4017at.p4018a.p4019a.p4020a.C53790bu;
import com.google.p4017at.p4018a.p4019a.p4020a.C53791bv;
import com.google.p4017at.p4018a.p4019a.p4020a.C53798i;
import com.google.p4017at.p4018a.p4019a.p4020a.C53799j;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.s */
/* compiled from: PG */
public final /* synthetic */ class C100880s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100862aj f281869a;

    /* renamed from: b */
    public final /* synthetic */ boolean f281870b;

    public /* synthetic */ C100880s(C100862aj ajVar, boolean z) {
        this.f281869a = ajVar;
        this.f281870b = z;
    }

    public final C60870cx apply(Object obj) {
        C100862aj ajVar = this.f281869a;
        boolean z = this.f281870b;
        Void voidR = (Void) obj;
        C100831j jVar = (C100831j) ajVar.f281837e.mo17428b();
        int i = z ? 2 : 3;
        C53790bu buVar = (C53790bu) C53791bv.f141184e.createBuilder();
        C45595b bVar = C45595b.GOOGLE_ASSISTANT_ANDROID_PERSONALIZED_SPEECH_RECOGNITION_UI;
        buVar.copyOnWrite();
        C53791bv bvVar = (C53791bv) buVar.instance;
        bvVar.f141187b = bVar.f119929nK;
        bvVar.f141186a |= 1;
        String languageTag = Locale.getDefault().toLanguageTag();
        buVar.copyOnWrite();
        C53791bv bvVar2 = (C53791bv) buVar.instance;
        languageTag.getClass();
        bvVar2.f141186a = 2 | bvVar2.f141186a;
        bvVar2.f141188c = languageTag;
        C53785bp bpVar = (C53785bp) C53786bq.f141173e.createBuilder();
        C53798i iVar = (C53798i) C53799j.f141206b.createBuilder();
        iVar.mo54014a(R.string.speech_personalization_toggle_text);
        iVar.mo54014a(R.string.speech_personalization_toggle_description);
        bpVar.copyOnWrite();
        C53786bq bqVar = (C53786bq) bpVar.instance;
        C53799j jVar2 = (C53799j) iVar.build();
        jVar2.getClass();
        bqVar.f141178d = jVar2;
        bqVar.f141175a |= 1024;
        buVar.copyOnWrite();
        C53791bv bvVar3 = (C53791bv) buVar.instance;
        C53786bq bqVar2 = (C53786bq) bpVar.build();
        bqVar2.getClass();
        bvVar3.f141189d = bqVar2;
        bvVar3.f141186a |= 8;
        return C60846c.m92879h(jVar.mo92074c(i, (C53791bv) buVar.build()), Throwable.class, C47810es.m84966f(new C100859ag(z)), ajVar.f281841i);
    }
}
