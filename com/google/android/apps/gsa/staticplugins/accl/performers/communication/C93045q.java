package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.q */
/* compiled from: PG */
public final /* synthetic */ class C93045q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259551a;

    /* renamed from: b */
    public final /* synthetic */ C52321nk f259552b;

    /* renamed from: c */
    public final /* synthetic */ String f259553c;

    /* renamed from: d */
    public final /* synthetic */ C51809dy f259554d;

    /* renamed from: e */
    public final /* synthetic */ C22434e f259555e;

    public /* synthetic */ C93045q(ChatPerformer chatPerformer, C52321nk nkVar, String str, C51809dy dyVar, C22434e eVar) {
        this.f259551a = chatPerformer;
        this.f259552b = nkVar;
        this.f259553c = str;
        this.f259554d = dyVar;
        this.f259555e = eVar;
    }

    public final C60870cx apply(Object obj) {
        ChatPerformer chatPerformer = this.f259551a;
        C52321nk nkVar = this.f259552b;
        String str = this.f259553c;
        C51809dy dyVar = this.f259554d;
        C22434e eVar = this.f259555e;
        Exception exc = (Exception) obj;
        ((C59052c) ((C59052c) ChatPerformer.f259389a.mo56226d()).mo56372aa(13169)).mo56354G("GetForegroundActivityUri failed %s: %s", exc.getClass(), exc.getMessage());
        return chatPerformer.mo87503f(nkVar, str, chatPerformer.mo87500c(), dyVar, eVar);
    }
}
