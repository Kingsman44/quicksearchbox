package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.text.TextUtils;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.p */
/* compiled from: PG */
public final /* synthetic */ class C93044p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259546a;

    /* renamed from: b */
    public final /* synthetic */ C52321nk f259547b;

    /* renamed from: c */
    public final /* synthetic */ String f259548c;

    /* renamed from: d */
    public final /* synthetic */ C51809dy f259549d;

    /* renamed from: e */
    public final /* synthetic */ C22434e f259550e;

    public /* synthetic */ C93044p(ChatPerformer chatPerformer, C52321nk nkVar, String str, C51809dy dyVar, C22434e eVar) {
        this.f259546a = chatPerformer;
        this.f259547b = nkVar;
        this.f259548c = str;
        this.f259549d = dyVar;
        this.f259550e = eVar;
    }

    public final C60870cx apply(Object obj) {
        ChatPerformer chatPerformer = this.f259546a;
        C52321nk nkVar = this.f259547b;
        String str = this.f259548c;
        C51809dy dyVar = this.f259549d;
        C22434e eVar = this.f259550e;
        String str2 = (String) obj;
        ((C59052c) ((C59052c) ChatPerformer.f259389a.mo56226d()).mo56372aa(13167)).mo56389s("ForegroundUri: %s", str2);
        if (TextUtils.isEmpty(str2)) {
            ((C59052c) ((C59052c) ChatPerformer.f259389a.mo56226d()).mo56372aa(13168)).mo56386p("Get foregroundActivityUri failed, fallback to screenshot.");
            return chatPerformer.mo87503f(nkVar, str, chatPerformer.mo87500c(), dyVar, eVar);
        }
        return chatPerformer.mo87502e(nkVar, str2, nkVar.f137335h, dyVar, eVar);
    }
}
