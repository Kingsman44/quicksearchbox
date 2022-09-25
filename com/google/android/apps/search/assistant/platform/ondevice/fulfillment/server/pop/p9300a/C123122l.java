package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.libraries.assistant.portable.C19095c;
import com.google.android.libraries.assistant.portable.C19096d;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.l */
/* compiled from: PG */
public final /* synthetic */ class C123122l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ PortableAssistant f340778a;

    /* renamed from: b */
    public final /* synthetic */ Optional f340779b;

    public /* synthetic */ C123122l(PortableAssistant portableAssistant, Optional optional) {
        this.f340778a = portableAssistant;
        this.f340779b = optional;
    }

    public final C60870cx apply(Object obj) {
        Void voidR = (Void) obj;
        C60870cx f = this.f340778a.mo24260f(new C19095c((String) this.f340779b.get()));
        C19096d dVar = C19096d.f53557a;
        return C60922j.m93045h(f, C47810es.m84966f(dVar), C60826bg.f164896a);
    }
}
