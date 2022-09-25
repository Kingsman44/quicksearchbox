package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90389w;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.g */
/* compiled from: PG */
public final class C90400g extends C90398e {

    /* renamed from: b */
    private static final Pattern f252477b = Pattern.compile("^(.+) to your group\\: (.*)$");

    /* renamed from: c */
    private static final Pattern f252478c = Pattern.compile("^(.+) to (.+)\\: (.*)$");

    /* renamed from: a */
    public boolean f252479a;

    /* renamed from: a */
    private static String m147027a() {
        return (Locale.JAPAN.equals(Locale.getDefault()) || Locale.JAPANESE.equals(Locale.getDefault())) ? "、" : ", ";
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ee A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0222 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo84092d(android.content.Context r27, com.google.android.apps.gsa.shared.bisto.C89656k r28, com.google.android.libraries.p1730f.C21370a r29, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af r30, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o r31, com.google.common.p4552o.C60242lp r32, boolean r33) {
        /*
            r26 = this;
            r8 = r27
            r9 = r31
            r10 = r30
            android.service.notification.StatusBarNotification r11 = r10.f252393a
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146995b(r11, r9)
            r1 = 2132093361(0x7f1529b1, float:1.9827145E38)
            r12 = 0
            if (r0 != 0) goto L_0x01ad
            android.app.Notification r0 = r11.getNotification()
            java.lang.CharSequence r0 = r0.tickerText
            if (r0 != 0) goto L_0x0024
            if (r9 == 0) goto L_0x0024
            long r2 = r11.getPostTime()
            java.lang.CharSequence r0 = r9.mo84081a(r2)
        L_0x0024:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.length()
            if (r2 != 0) goto L_0x002d
            r0 = r12
        L_0x002d:
            android.app.Notification r2 = r11.getNotification()
            android.os.Bundle r2 = r2.extras
            java.lang.String r3 = "android.title"
            java.lang.CharSequence r2 = r2.getCharSequence(r3)
            java.lang.String r2 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146997d(r2)
            if (r2 == 0) goto L_0x01a9
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0047
            goto L_0x01a9
        L_0x0047:
            android.app.Notification r3 = r11.getNotification()
            android.os.Bundle r3 = r3.extras
            java.lang.String r4 = "android.text"
            java.lang.CharSequence r3 = r3.getCharSequence(r4)
            if (r3 == 0) goto L_0x01a9
            int r4 = r3.length()
            if (r4 != 0) goto L_0x005d
            goto L_0x01a9
        L_0x005d:
            r4 = 1
            if (r0 == 0) goto L_0x00e8
            java.util.regex.Pattern r5 = f252477b
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L_0x00a3
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = m147027a()
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00a3
            java.lang.String r6 = r5.group(r4)
            java.lang.String r6 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146997d(r6)
            r7 = 2
            java.lang.String r5 = r5.group(r7)
            java.lang.String r5 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146997d(r5)
            if (r6 == 0) goto L_0x00a3
            if (r5 == 0) goto L_0x00a3
            if (r33 == 0) goto L_0x009c
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r0 = new com.google.android.apps.gsa.shared.notificationlistening.collection.a.u
            java.lang.String r2 = r8.getString(r1)
            r0.<init>(r2, r6, r5)
            goto L_0x01ad
        L_0x009c:
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r0 = new com.google.android.apps.gsa.shared.notificationlistening.collection.a.u
            r0.<init>(r2, r6, r5)
            goto L_0x01ad
        L_0x00a3:
            java.util.regex.Pattern r5 = f252478c
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L_0x00cb
            java.lang.String r4 = r5.group(r4)
            java.lang.String r4 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146997d(r4)
            r6 = 3
            java.lang.String r5 = r5.group(r6)
            java.lang.String r5 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146997d(r5)
            if (r4 == 0) goto L_0x00cb
            if (r5 == 0) goto L_0x00cb
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r0 = new com.google.android.apps.gsa.shared.notificationlistening.collection.a.u
            r0.<init>(r2, r4, r5)
            goto L_0x01ad
        L_0x00cb:
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r4 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.f252450a
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r4 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u.m146991a(r4, r0)
            if (r4 == 0) goto L_0x01a9
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r3.toString()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01a9
            r4.f252440a = r2
            r14 = r26
            r13 = r4
            goto L_0x01b0
        L_0x00e8:
            android.app.Notification r0 = r11.getNotification()
            android.os.Bundle r5 = r0.extras
            if (r5 != 0) goto L_0x00f2
            r0 = r12
            goto L_0x00fa
        L_0x00f2:
            android.os.Bundle r0 = r0.extras
            java.lang.String r5 = "android.car.EXTENSIONS"
            android.os.Bundle r0 = r0.getBundle(r5)
        L_0x00fa:
            if (r0 == 0) goto L_0x0199
            java.lang.String r5 = "large_icon"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.String r5 = "app_color"
            r6 = 0
            r0.getInt(r5, r6)
            java.lang.String r5 = "car_conversation"
            android.os.Bundle r0 = r0.getBundle(r5)
            if (r0 != 0) goto L_0x0114
            goto L_0x0199
        L_0x0114:
            java.lang.String r5 = "messages"
            android.os.Parcelable[] r5 = r0.getParcelableArray(r5)
            if (r5 == 0) goto L_0x013b
            int r7 = r5.length
            java.lang.String[] r13 = new java.lang.String[r7]
        L_0x011f:
            if (r6 >= r7) goto L_0x0139
            r14 = r5[r6]
            boolean r15 = r14 instanceof android.os.Bundle
            if (r15 != 0) goto L_0x0129
            goto L_0x0199
        L_0x0129:
            android.os.Bundle r14 = (android.os.Bundle) r14
            java.lang.String r15 = "text"
            java.lang.String r14 = r14.getString(r15)
            r13[r6] = r14
            if (r14 != 0) goto L_0x0136
            goto L_0x0199
        L_0x0136:
            int r6 = r6 + 1
            goto L_0x011f
        L_0x0139:
            r15 = r13
            goto L_0x013c
        L_0x013b:
            r15 = r12
        L_0x013c:
            java.lang.String r5 = "on_read"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            java.lang.String r5 = "on_reply"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            r17 = r5
            android.app.PendingIntent r17 = (android.app.PendingIntent) r17
            java.lang.String r5 = "remote_input"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            android.app.RemoteInput r5 = (android.app.RemoteInput) r5
            java.lang.String r6 = "participants"
            java.lang.String[] r6 = r0.getStringArray(r6)
            if (r6 == 0) goto L_0x0199
            int r7 = r6.length
            if (r7 == r4) goto L_0x0162
            goto L_0x0199
        L_0x0162:
            if (r5 == 0) goto L_0x0188
            androidx.core.app.ba r4 = new androidx.core.app.ba
            java.lang.String r19 = r5.getResultKey()
            java.lang.CharSequence r20 = r5.getLabel()
            java.lang.CharSequence[] r21 = r5.getChoices()
            boolean r22 = r5.getAllowFreeFormInput()
            int r23 = r5.getEditChoicesBeforeSending()
            android.os.Bundle r24 = r5.getExtras()
            r25 = 0
            r18 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r16 = r4
            goto L_0x018a
        L_0x0188:
            r16 = r12
        L_0x018a:
            androidx.core.app.aa r4 = new androidx.core.app.aa
            java.lang.String r5 = "timestamp"
            long r19 = r0.getLong(r5)
            r14 = r4
            r18 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x019a
        L_0x0199:
            r4 = r12
        L_0x019a:
            if (r4 == 0) goto L_0x019d
            goto L_0x01a9
        L_0x019d:
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.f252450a
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u.m146991a(r0, r3)
            if (r0 != 0) goto L_0x01a6
            goto L_0x01a9
        L_0x01a6:
            r0.f252440a = r2
            goto L_0x01ad
        L_0x01a9:
            r14 = r26
            r13 = r12
            goto L_0x01b0
        L_0x01ad:
            r14 = r26
            r13 = r0
        L_0x01b0:
            boolean r0 = r14.f252479a
            if (r0 == 0) goto L_0x01b6
            if (r33 == 0) goto L_0x01ef
        L_0x01b6:
            if (r13 == 0) goto L_0x01ef
            java.lang.CharSequence r0 = r13.f252440a
            if (r0 == 0) goto L_0x01ef
            if (r33 == 0) goto L_0x01d0
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = m147027a()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x01d0
            java.lang.String r0 = r8.getString(r1)
        L_0x01d0:
            r13.f252440a = r0
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.x r6 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146996c()
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r13
            r7 = r33
            java.util.List r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146998e(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x01ee
            goto L_0x01ef
        L_0x01ee:
            return r0
        L_0x01ef:
            android.app.Notification r0 = r11.getNotification()
            java.lang.String r11 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146965d(r0, r9)
            java.lang.String r15 = "msg"
            if (r33 != 0) goto L_0x0223
            if (r11 == 0) goto L_0x0203
            boolean r0 = r15.equals(r11)
            if (r0 == 0) goto L_0x0223
        L_0x0203:
            if (r13 == 0) goto L_0x0209
            java.lang.CharSequence r0 = r13.f252440a
            r6 = r0
            goto L_0x020a
        L_0x0209:
            r6 = r12
        L_0x020a:
            r7 = 0
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            java.util.List r0 = super.mo84103k(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0222
            goto L_0x0223
        L_0x0222:
            return r0
        L_0x0223:
            boolean r0 = r15.equals(r11)
            if (r0 != 0) goto L_0x022e
            java.util.List r0 = super.mo84092d(r27, r28, r29, r30, r31, r32, r33)
            return r0
        L_0x022e:
            r5 = 6
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r7 = r33
            java.util.List r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146999f(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.C90400g.mo84092d(android.content.Context, com.google.android.apps.gsa.shared.bisto.k, com.google.android.libraries.f.a, com.google.android.apps.gsa.shared.notificationlistening.collection.a.af, com.google.android.apps.gsa.shared.notificationlistening.collection.a.o, com.google.common.o.lp, boolean):java.util.List");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C90389w mo84101i(Context context, Notification notification, CharSequence charSequence) {
        return new C90389w(charSequence, "text/plain");
    }
}
