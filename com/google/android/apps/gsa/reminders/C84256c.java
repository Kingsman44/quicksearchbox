package com.google.android.apps.gsa.reminders;

import android.content.BroadcastReceiver;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91755a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.reminders.c */
/* compiled from: PG */
public final /* synthetic */ class C84256c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C91755a f229298a;

    /* renamed from: b */
    public final /* synthetic */ Set f229299b;

    /* renamed from: c */
    public final /* synthetic */ BroadcastReceiver.PendingResult f229300c;

    public /* synthetic */ C84256c(C91755a aVar, Set set, BroadcastReceiver.PendingResult pendingResult) {
        this.f229298a = aVar;
        this.f229299b = set;
        this.f229300c = pendingResult;
    }

    public final void run() {
        C91755a aVar = this.f229298a;
        Set set = this.f229299b;
        BroadcastReceiver.PendingResult pendingResult = this.f229300c;
        C59071e eVar = RemindersBroadcastReceiver.f229276a;
        if (!aVar.mo86250h(set, 3)) {
            C59104x c = RemindersBroadcastReceiver.f229276a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RemindersReceiver");
            ((C59052c) ((C59052c) c).mo56372aa(7129)).mo56386p("Failed to bump reminders");
        }
        pendingResult.finish();
    }
}
