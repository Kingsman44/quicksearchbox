package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.assistant.shared.C73846br;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.s */
/* compiled from: PG */
public final /* synthetic */ class C93047s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259557a;

    public /* synthetic */ C93047s(ChatPerformer chatPerformer) {
        this.f259557a = chatPerformer;
    }

    public final C60870cx apply(Object obj) {
        String b;
        ChatPerformer chatPerformer = this.f259557a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h() || (b = ((C73846br) axVar.mo56107c()).mo65332b()) == null || (!b.startsWith("image/") && !b.startsWith("video/"))) {
            ((C59052c) ((C59052c) ChatPerformer.f259389a.mo56226d()).mo56372aa(13170)).mo56389s("Google Photo URI unavailable or invalid (%s). Sharing screenshot.", axVar);
            return chatPerformer.mo87500c();
        }
        ((C59052c) ((C59052c) ChatPerformer.f259389a.mo56226d()).mo56372aa(13171)).mo56386p("Google Photo URI received.");
        return C60856cj.m92900i(axVar);
    }
}
