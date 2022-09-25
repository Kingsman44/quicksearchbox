package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4526f.C59052c;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61906bp;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.v */
/* compiled from: PG */
public final /* synthetic */ class C122666v implements C122640at {

    /* renamed from: a */
    public final /* synthetic */ C122642av f339915a;

    public /* synthetic */ C122666v(C122642av avVar) {
        this.f339915a = avVar;
    }

    /* renamed from: a */
    public final Optional mo105709a(C29690f fVar) {
        C122642av avVar = this.f339915a;
        try {
            return Optional.m71637of(avVar.f339880c.mo58339b("lightweight_tokens_data", fVar, avVar.f339879b));
        } catch (C61906bp | IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C122642av.f339878a.mo56225c()).mo56382g(e)).mo56372aa(34910)).mo56386p("Could not load lightweight model");
            return Optional.empty();
        }
    }
}
