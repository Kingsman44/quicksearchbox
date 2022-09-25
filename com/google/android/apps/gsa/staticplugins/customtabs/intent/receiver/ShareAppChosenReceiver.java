package com.google.android.apps.gsa.staticplugins.customtabs.intent.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class ShareAppChosenReceiver extends C98687a {

    /* renamed from: a */
    public C37215b f275673a;

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(33);
        mo91264a(context);
        BroadcastReceiver.PendingResult goAsync = goAsync();
        C60870cx a = this.f275673a.mo19974a(C37182a.f97744C.mo40805c(C62722b.OK));
        Objects.requireNonNull(goAsync);
        a.mo4106b(new C98688b(goAsync), C60826bg.f164896a);
    }
}
