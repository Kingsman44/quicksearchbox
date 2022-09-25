package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.core.app.aq */
/* compiled from: PG */
public final class C1800aq {

    /* renamed from: b */
    private static final Object f5617b = new Object();

    /* renamed from: c */
    private static String f5618c;

    /* renamed from: d */
    private static Set f5619d = new HashSet();

    /* renamed from: e */
    private static final Object f5620e = new Object();

    /* renamed from: f */
    private static C1799ap f5621f;

    /* renamed from: a */
    public final NotificationManager f5622a;

    /* renamed from: g */
    private final Context f5623g;

    public C1800aq(Context context) {
        this.f5623g = context;
        this.f5622a = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public static Set m4953a(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f5617b) {
            if (string != null) {
                if (!string.equals(f5618c)) {
                    HashSet hashSet = new HashSet(r3);
                    for (String unflattenFromString : string.split(":", -1)) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f5619d = hashSet;
                    f5618c = string;
                }
            }
            set = f5619d;
        }
        return set;
    }

    /* renamed from: b */
    public final void mo5003b(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.f5622a.notify(str, i, notification);
            return;
        }
        C1796am amVar = new C1796am(this.f5623g.getPackageName(), i, str, notification);
        synchronized (f5620e) {
            if (f5621f == null) {
                f5621f = new C1799ap(this.f5623g.getApplicationContext());
            }
            f5621f.f5612a.obtainMessage(0, amVar).sendToTarget();
        }
        this.f5622a.cancel(str, i);
    }
}
