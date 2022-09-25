package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123046cm;
import com.google.android.libraries.assistant.portable.C19111s;
import com.google.android.libraries.assistant.portable.C19112t;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C123087aa implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C123089ac f340680a;

    /* renamed from: b */
    public final /* synthetic */ PortableAssistant f340681b;

    public /* synthetic */ C123087aa(C123089ac acVar, PortableAssistant portableAssistant) {
        this.f340680a = acVar;
        this.f340681b = portableAssistant;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C123089ac acVar = this.f340680a;
        PortableAssistant portableAssistant = this.f340681b;
        C60870cx f = portableAssistant.mo24260f(C19111s.f53574a);
        C19112t tVar = C19112t.f53575a;
        C60870cx h = C60922j.m93045h(f, C47810es.m84966f(tVar), C60826bg.f164896a);
        C123088ab abVar = new C123088ab(cVar, portableAssistant);
        C123119i iVar = new C123119i(cVar, portableAssistant);
        C60856cj.m92911t(h, C47810es.m84974n(new C123046cm(abVar, iVar)), acVar.f340690g);
        return "warmUpAsync";
    }
}
