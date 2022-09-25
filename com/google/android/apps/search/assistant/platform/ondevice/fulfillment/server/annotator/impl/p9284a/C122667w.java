package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4526f.C59052c;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61906bp;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.w */
/* compiled from: PG */
public final /* synthetic */ class C122667w implements C122640at {

    /* renamed from: a */
    public final /* synthetic */ C122642av f339916a;

    public /* synthetic */ C122667w(C122642av avVar) {
        this.f339916a = avVar;
    }

    /* renamed from: a */
    public final Optional mo105709a(C29690f fVar) {
        C122642av avVar = this.f339916a;
        try {
            return Optional.m71637of(avVar.f339880c.mo58338a(fVar, avVar.f339879b, "alternate_name_model"));
        } catch (C61906bp | IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C122642av.f339878a.mo56225c()).mo56382g(e)).mo56372aa(34908)).mo56386p("Could not load contact model");
            return Optional.empty();
        }
    }
}
