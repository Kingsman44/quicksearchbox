package com.google.android.apps.gsa.staticplugins.gearhead;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p8793w.C117734av;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.android.gearhead.sdk.assistant.CarAssistantEvent;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.bl */
/* compiled from: PG */
public final class C101332bl {

    /* renamed from: c */
    private static final C59071e f282817c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.gearhead.bl");

    /* renamed from: a */
    public final C101331bk f282818a;

    /* renamed from: b */
    public final C117734av f282819b;

    /* renamed from: d */
    private final C21370a f282820d;

    /* renamed from: e */
    private final C142660f f282821e;

    public C101332bl(C101331bk bkVar, C117734av avVar, C21370a aVar, C142660f fVar) {
        this.f282818a = bkVar;
        this.f282819b = avVar;
        this.f282820d = aVar;
        this.f282821e = fVar;
    }

    /* renamed from: a */
    public final void mo92250a(int i, Query query) {
        Bundle bundle = new Bundle();
        bundle.putLong("TRIGGER_ELAPSED_REALTIME_MILLIS_KEY", this.f282820d.mo26871c());
        bundle.putInt("VOICE_SESSION_TRIGGER_KEY", i);
        bundle.putParcelable("HOTWORD_QUERY_KEY", query);
        CarAssistantEvent carAssistantEvent = new CarAssistantEvent();
        carAssistantEvent.f387090a = 1;
        carAssistantEvent.f387093d = bundle;
        try {
            this.f282821e.mo117444f(carAssistantEvent);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f282817c.mo56225c()).mo56382g(e)).mo56372aa(20083)).mo56386p("onEvent() failed");
        }
    }
}
