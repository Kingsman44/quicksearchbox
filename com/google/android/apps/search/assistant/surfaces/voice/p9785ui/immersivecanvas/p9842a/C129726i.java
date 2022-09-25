package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129705b;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.i */
/* compiled from: PG */
public final /* synthetic */ class C129726i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C129728k f355982a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f355983b;

    public /* synthetic */ C129726i(C129728k kVar, Consumer consumer) {
        this.f355982a = kVar;
        this.f355983b = consumer;
    }

    public final C60870cx apply(Object obj) {
        C129728k kVar = this.f355982a;
        Consumer consumer = this.f355983b;
        C37561eb ebVar = ((C37400be) obj).mo40929a().f99350b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        if (ebVar.f99802a != 1) {
            return C60866ct.f164955a;
        }
        kVar.f355987c.f355937a.mo19974a(C37176a.f97045eD);
        ((C59052c) ((C59052c) C129728k.f355985a.mo56224b()).mo56372aa(38433)).mo56386p("Streaming starts.");
        C32534ai aiVar = kVar.f355986b.f355950h;
        if (aiVar != null) {
            return aiVar.mo38133a(new C129705b(consumer));
        }
        return C60866ct.f164955a;
    }
}
