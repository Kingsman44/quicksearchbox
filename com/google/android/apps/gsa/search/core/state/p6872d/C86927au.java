package com.google.android.apps.gsa.search.core.state.p6872d;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.au */
/* compiled from: PG */
public final /* synthetic */ class C86927au implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86938be f234758a;

    public /* synthetic */ C86927au(C86938be beVar) {
        this.f234758a = beVar;
    }

    public final void run() {
        C86938be beVar = this.f234758a;
        BroadcastReceiver broadcastReceiver = beVar.f234801o;
        BroadcastReceiver broadcastReceiver2 = beVar.f234800n;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.googlequicksearchbox.action.PAUSE_HOTWORD");
        intentFilter.addAction("com.google.android.googlequicksearchbox.action.RESUME_HOTWORD");
        beVar.f234796j.registerReceiver(broadcastReceiver, intentFilter, "com.google.android.googlequicksearchbox.permission.PAUSE_HOTWORD", (Handler) null);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.USER_FOREGROUND");
        intentFilter2.addAction("android.intent.action.USER_BACKGROUND");
        beVar.f234796j.registerReceiver(broadcastReceiver2, intentFilter2);
    }
}
