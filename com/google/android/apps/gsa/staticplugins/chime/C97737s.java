package com.google.android.apps.gsa.staticplugins.chime;

import android.app.NotificationChannel;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.staticplugins.chime.p7661f.C97700a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.notifications.data.C29820k;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.s */
/* compiled from: PG */
public final /* synthetic */ class C97737s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97739u f272901a;

    public /* synthetic */ C97737s(C97739u uVar) {
        this.f272901a = uVar;
    }

    public final void run() {
        int i;
        C97739u uVar = this.f272901a;
        String num = Integer.toString(27);
        String string = uVar.f272903b.getResources().getString(R.string.miscellaneous_notification_channel);
        String string2 = uVar.f272903b.getResources().getString(R.string.miscellaneous_notification_channel);
        NotificationChannel a = uVar.f272904c.mo85699a(string2);
        if (a == null) {
            i = 2;
        } else {
            int importance = a.getImportance();
            uVar.f272904c.mo85702e(string2);
            i = importance;
        }
        NotificationChannel notificationChannel = new NotificationChannel(num, string, i);
        notificationChannel.setShowBadge(false);
        uVar.f272904c.mo85701c(notificationChannel);
        C97700a aVar = uVar.f272905f;
        if (aVar.f272811b.mo79746e(C90081ef.f249857z)) {
            for (C29820k d : aVar.f272810a.mo35089c()) {
                if (C97700a.m161946d(d)) {
                    return;
                }
            }
            aVar.mo90795c(false);
            return;
        }
        aVar.mo90794b();
    }
}
