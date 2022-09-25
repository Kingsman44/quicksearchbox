package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import android.net.Uri;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.o */
/* compiled from: PG */
public final class C90381o {

    /* renamed from: a */
    public final long f252421a;

    /* renamed from: b */
    public final String f252422b;

    /* renamed from: c */
    public final Uri f252423c;

    /* renamed from: d */
    public final int f252424d;

    /* renamed from: e */
    public final Map f252425e = new HashMap();

    /* renamed from: f */
    public boolean f252426f;

    /* renamed from: g */
    final /* synthetic */ C90382p f252427g;

    /* renamed from: h */
    private final CharSequence f252428h;

    /* renamed from: i */
    private final C89656k f252429i;

    public C90381o(C90382p pVar, long j) {
        this.f252427g = pVar;
        this.f252421a = j;
        this.f252428h = null;
        this.f252422b = null;
        this.f252423c = null;
        this.f252424d = 0;
        this.f252429i = null;
    }

    /* renamed from: a */
    public final CharSequence mo84081a(long j) {
        if (mo84082b(j)) {
            return this.f252428h;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo84082b(long j) {
        return !this.f252426f && mo84083c(j);
    }

    /* renamed from: c */
    public final boolean mo84083c(long j) {
        return Math.abs(this.f252421a - j) <= C90382p.f252432c;
    }

    public final String toString() {
        String str;
        String str2;
        C89656k kVar = this.f252429i;
        boolean z = true;
        boolean z2 = kVar != null && kVar.mo83556k();
        long j = this.f252421a;
        if (z2) {
            str = ", tickerText=".concat(String.valueOf(String.valueOf(this.f252428h)));
        } else {
            str = ", has tickerText=" + (this.f252428h != null);
        }
        String str3 = this.f252422b;
        if (z2) {
            str2 = ", chime=".concat(String.valueOf(String.valueOf(this.f252423c)));
        } else {
            if (this.f252423c == null) {
                z = false;
            }
            str2 = ", has chime=" + z;
        }
        return "Version: timestamp=" + j + str + ", category=" + str3 + str2 + ", chimePolicy=" + this.f252424d + ", tickerTextIsClaimed=" + this.f252426f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r8.f252395c == null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90381o(com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90382p r5, android.content.Context r6, com.google.android.apps.gsa.shared.bisto.C89656k r7, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af r8) {
        /*
            r4 = this;
            r4.f252427g = r5
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.f252425e = r5
            r4.f252429i = r7
            android.service.notification.StatusBarNotification r5 = r8.f252393a
            long r0 = r5.getPostTime()
            r4.f252421a = r0
            android.app.Notification r0 = r5.getNotification()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x009c
            android.app.Notification r0 = r5.getNotification()
            boolean r0 = androidx.core.app.C1791ah.m4935c(r0)
            if (r0 == 0) goto L_0x009c
            android.app.Notification r0 = r5.getNotification()
            java.lang.String r0 = r0.getGroup()
            if (r0 != 0) goto L_0x0034
            goto L_0x009c
        L_0x0034:
            android.app.Notification r0 = r5.getNotification()
            java.lang.CharSequence r0 = r0.tickerText
            r4.f252428h = r0
            android.app.Notification r0 = r5.getNotification()
            java.lang.String r0 = r0.category
            r4.f252422b = r0
            android.net.Uri r0 = r8.f252395c
            if (r0 != 0) goto L_0x004e
            android.app.Notification r0 = r5.getNotification()
            android.net.Uri r0 = r0.sound
        L_0x004e:
            if (r0 == 0) goto L_0x0059
            boolean r6 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146972k(r6, r7, r0)
            if (r6 == 0) goto L_0x0059
            r4.f252423c = r0
            goto L_0x005b
        L_0x0059:
            r4.f252423c = r2
        L_0x005b:
            java.lang.Integer r6 = r8.f252394b
            if (r6 != 0) goto L_0x0064
            boolean r6 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90382p.m146986c(r5)
            goto L_0x0079
        L_0x0064:
            int r6 = r6.intValue()
            r7 = 3
            if (r6 < r7) goto L_0x0078
            boolean r6 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90382p.m146986c(r5)
            if (r6 != 0) goto L_0x0076
            android.net.Uri r6 = r8.f252395c
            if (r6 != 0) goto L_0x007b
            goto L_0x0078
        L_0x0076:
            r6 = 1
            goto L_0x0079
        L_0x0078:
            r6 = 0
        L_0x0079:
            if (r6 == 0) goto L_0x0099
        L_0x007b:
            android.app.Notification r6 = r5.getNotification()
            int r6 = r6.flags
            r6 = r6 & 8
            android.app.Notification r5 = r5.getNotification()
            int r5 = r5.getGroupAlertBehavior()
            r7 = 2
            if (r5 != r7) goto L_0x0091
            r4.f252424d = r3
            return
        L_0x0091:
            if (r6 == 0) goto L_0x0096
            r4.f252424d = r7
            return
        L_0x0096:
            r4.f252424d = r1
            return
        L_0x0099:
            r4.f252424d = r3
            return
        L_0x009c:
            java.lang.String r5 = "Bad GroupData constructor"
            com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(r5)
            r4.f252428h = r2
            r4.f252422b = r2
            r4.f252423c = r2
            r4.f252424d = r3
            r4.f252426f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o.<init>(com.google.android.apps.gsa.shared.notificationlistening.collection.a.p, android.content.Context, com.google.android.apps.gsa.shared.bisto.k, com.google.android.apps.gsa.shared.notificationlistening.collection.a.af):void");
    }
}
