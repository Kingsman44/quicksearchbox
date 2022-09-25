package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.staticplugins.fedass.ipc.aidl.C100967b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public final class TrainCommunicationService extends C100973a {

    /* renamed from: a */
    public static final C59071e f282038a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.ipc.service.TrainCommunicationService");

    /* renamed from: b */
    public C101012y f282039b;

    /* renamed from: c */
    private final C100967b f282040c = new C101013z(this);

    public final IBinder onBind(Intent intent) {
        C59104x b = f282038a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommService");
        ((C59052c) ((C59052c) b).mo56372aa(19628)).mo56386p("onBind");
        if (this.f282039b != null) {
            return this.f282040c;
        }
        throw new RuntimeException("Got NULL binderDelegate.");
    }

    public final void onCreate() {
        C74507e.m120466b(26);
        super.onCreate();
        C59104x b = f282038a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommService");
        ((C59052c) ((C59052c) b).mo56372aa(19629)).mo56386p("onCreate");
    }

    public final void onDestroy() {
        C59104x b = f282038a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommService");
        ((C59052c) ((C59052c) b).mo56372aa(19630)).mo56386p("onDestroy");
        super.onDestroy();
    }

    public final boolean onUnbind(Intent intent) {
        C59104x b = f282038a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainCommService");
        ((C59052c) ((C59052c) b).mo56372aa(19631)).mo56386p("onUnBind");
        return super.onUnbind(intent);
    }
}
