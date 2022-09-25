package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import android.service.notification.StatusBarNotification;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.u */
/* compiled from: PG */
public final class C95625u {

    /* renamed from: a */
    public static final long[] f267621a = {0, 250, 250, 250};

    /* renamed from: b */
    public final Vibrator f267622b;

    /* renamed from: c */
    public final AudioManager f267623c;

    /* renamed from: d */
    public final Set f267624d = new ConcurrentSkipListSet();

    /* renamed from: e */
    public String f267625e = BuildConfig.FLAVOR;

    public C95625u(Context context) {
        this.f267622b = (Vibrator) context.getSystemService("vibrator");
        this.f267623c = (AudioManager) context.getSystemService("audio");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo89578a(StatusBarNotification[] statusBarNotificationArr) {
        this.f267624d.clear();
        if (statusBarNotificationArr != null) {
            int length = statusBarNotificationArr.length;
            int i = 0;
            while (i < length) {
                this.f267624d.add(C90366ae.m146966e(statusBarNotificationArr[i]));
                i++;
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }
}
