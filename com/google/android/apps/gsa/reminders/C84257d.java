package com.google.android.apps.gsa.reminders;

import android.content.BroadcastReceiver;
import com.google.android.apps.gsa.sidekick.main.notifications.C91486aa;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91755a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.reminders.d */
/* compiled from: PG */
public final /* synthetic */ class C84257d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ RemindersBroadcastReceiver f229301a;

    /* renamed from: b */
    public final /* synthetic */ Set f229302b;

    /* renamed from: c */
    public final /* synthetic */ int f229303c;

    /* renamed from: d */
    public final /* synthetic */ boolean f229304d;

    /* renamed from: e */
    public final /* synthetic */ List f229305e;

    /* renamed from: f */
    public final /* synthetic */ BroadcastReceiver.PendingResult f229306f;

    public /* synthetic */ C84257d(RemindersBroadcastReceiver remindersBroadcastReceiver, Set set, int i, boolean z, List list, BroadcastReceiver.PendingResult pendingResult) {
        this.f229301a = remindersBroadcastReceiver;
        this.f229302b = set;
        this.f229303c = i;
        this.f229304d = z;
        this.f229305e = list;
        this.f229306f = pendingResult;
    }

    public final void run() {
        RemindersBroadcastReceiver remindersBroadcastReceiver = this.f229301a;
        Set set = this.f229302b;
        int i = this.f229303c;
        boolean z = this.f229304d;
        List list = this.f229305e;
        BroadcastReceiver.PendingResult pendingResult = this.f229306f;
        if (((C91755a) remindersBroadcastReceiver.f229278b.mo27525b()).mo86250h(set, i) && z) {
            C58976aa aaVar = C58975e.f156826a;
            ((C91486aa) remindersBroadcastReceiver.f229280d.mo27525b()).mo85830a(list);
        }
        pendingResult.finish();
    }
}
