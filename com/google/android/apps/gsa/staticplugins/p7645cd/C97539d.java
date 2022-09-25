package com.google.android.apps.gsa.staticplugins.p7645cd;

import com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.cd.d */
/* compiled from: PG */
final class C97539d implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        NotificationWrapper notificationWrapper = (NotificationWrapper) obj;
        NotificationWrapper notificationWrapper2 = (NotificationWrapper) obj2;
        if (notificationWrapper.f252552c.equalsIgnoreCase(notificationWrapper2.f252552c)) {
            return 0;
        }
        if (notificationWrapper.f252552c.equalsIgnoreCase("com.verizon.messaging.vzmsgs")) {
            return 1;
        }
        if (notificationWrapper2.f252552c.equalsIgnoreCase("com.verizon.messaging.vzmsgs")) {
            return -1;
        }
        return 0;
    }
}
