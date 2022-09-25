package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import android.os.RemoteException;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.ar */
/* compiled from: PG */
public final /* synthetic */ class C101366ar implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C101369au f282882a;

    public /* synthetic */ C101366ar(C101369au auVar) {
        this.f282882a = auVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C101369au auVar = this.f282882a;
        ((C58970a) ((C58970a) ((C58970a) auVar.f282885b.mo56225c()).mo56382g((Exception) obj)).mo56372aa(20107)).mo56386p("Failed to run lifecycle on AssistantFragmentHost");
        C142660f fVar = auVar.f282886c.f229166a;
        if (fVar != null) {
            try {
                fVar.mo117445g();
            } catch (RemoteException e) {
                ((C58970a) ((C58970a) ((C58970a) auVar.f282885b.mo56225c()).mo56382g(e)).mo56372aa(20122)).mo56386p("Client callback onVoiceSessionEnd() failed");
            }
        }
        auVar.mo118012A();
    }
}
