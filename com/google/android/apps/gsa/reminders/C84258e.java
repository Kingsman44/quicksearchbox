package com.google.android.apps.gsa.reminders;

import android.content.BroadcastReceiver;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.reminders.e */
/* compiled from: PG */
final class C84258e implements C22868d {

    /* renamed from: a */
    final /* synthetic */ BroadcastReceiver.PendingResult f229307a;

    public C84258e(BroadcastReceiver.PendingResult pendingResult) {
        this.f229307a = pendingResult;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = RemindersBroadcastReceiver.f229276a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "RemindersReceiver");
        ((C59052c) ((C59052c) d).mo56372aa(7119)).mo56386p("Exception thrown for task HandleDismissedEntries");
        this.f229307a.finish();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        this.f229307a.finish();
    }
}
