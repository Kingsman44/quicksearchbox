package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4526f.C59052c;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61906bp;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.u */
/* compiled from: PG */
public final /* synthetic */ class C122665u implements C122640at {

    /* renamed from: a */
    public final /* synthetic */ C122642av f339914a;

    public /* synthetic */ C122665u(C122642av avVar) {
        this.f339914a = avVar;
    }

    /* renamed from: a */
    public final Optional mo105709a(C29690f fVar) {
        C122642av avVar = this.f339914a;
        try {
            return Optional.ofNullable(avVar.f339880c.mo58340c(fVar, avVar.f339879b));
        } catch (C61906bp | IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C122642av.f339878a.mo56225c()).mo56382g(e)).mo56372aa(34913)).mo56386p("Could not load webref model");
            return Optional.empty();
        }
    }
}
