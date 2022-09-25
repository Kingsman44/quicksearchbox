package com.google.android.apps.gsa.sidekick.main.p7203f;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.FileUriExposedException;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.c */
/* compiled from: PG */
public final class C91373c {

    /* renamed from: a */
    private static final C59071e f254941a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.f.c");

    /* renamed from: a */
    static final boolean m149394a(NotificationManager notificationManager, String str, int i, Notification notification) {
        try {
            notificationManager.notify(str, i, notification);
            return true;
        } catch (FileUriExposedException e) {
            C59104x d = f254941a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ExcptCatchingNotifier");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11565)).mo56386p("Unexpected FileUriExposedException");
            int i2 = C90755l.f253831a;
            return false;
        }
    }
}
