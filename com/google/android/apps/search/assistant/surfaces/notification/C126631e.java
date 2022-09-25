package com.google.android.apps.search.assistant.surfaces.notification;

import android.content.Intent;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.notification.e */
/* compiled from: PG */
public final class C126631e implements C47102r {

    /* renamed from: a */
    private static final C59071e f348730a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.notification.e");

    /* renamed from: b */
    private final C126625a f348731b;

    public C126631e(C126625a aVar) {
        C59104x b = f348730a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NTF.BroadcastReceiver");
        ((C59052c) ((C59052c) b).mo56372aa(37072)).mo56386p("#NotificationBroadcastReceiver");
        this.f348731b = aVar;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        C59104x b = f348730a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NTF.BroadcastReceiver");
        ((C59052c) ((C59052c) b).mo56372aa(37071)).mo56352E("#onReceive:%s %d", intent, i);
        return this.f348731b.mo107634a(intent, i);
    }
}
