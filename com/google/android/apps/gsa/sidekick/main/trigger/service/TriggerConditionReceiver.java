package com.google.android.apps.gsa.sidekick.main.trigger.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.sidekick.main.trigger.C91630g;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;

/* compiled from: PG */
public class TriggerConditionReceiver extends C91633a {

    /* renamed from: c */
    public C91635c f255577c;

    /* renamed from: d */
    public C118561t f255578d;

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(28);
        mo86012b(context);
        String action = intent.getAction();
        if (C118522by.TRIGGER_CONDITION_RESET.name().equals(action)) {
            C91635c.m149897b(this.f255578d, C118522by.TRIGGER_CONDITION_RESET, (C91630g) null);
        } else if (action.startsWith("f:")) {
            C91635c.m149897b(this.f255578d, C118522by.TRIGGER_CONDITION_REEVALUATION, this.f255577c.mo86014d(intent, true));
        } else if (action.startsWith("a:")) {
            C91635c.m149897b(this.f255578d, C118522by.TRIGGER_CONDITION_REEVALUATION, this.f255577c.mo86014d(intent, false));
        }
    }
}
