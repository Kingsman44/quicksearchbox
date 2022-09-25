package com.google.android.libraries.search.assistant.notification.p2712c;

import android.app.Notification;
import androidx.core.app.C1791ah;
import androidx.core.app.C1811ba;
import androidx.core.app.C1832s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.c.a */
/* compiled from: PG */
public final class C34867a {
    /* renamed from: a */
    public static Optional m63629a(Notification notification) {
        int a = C1791ah.m4933a(notification);
        for (int i = 0; i < a; i++) {
            C1832s b = C1791ah.m4934b(notification.actions[i]);
            if (b.f5658e == 2) {
                return Optional.m71637of(b);
            }
        }
        return Optional.empty();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r8v4, types: [androidx.core.app.aa] */
    /* JADX WARNING: type inference failed for: r13v2, types: [androidx.core.app.ba] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p3186j$.util.Optional m63630b(android.app.Notification r21) {
        /*
            r0 = r21
            int r1 = androidx.core.app.C1791ah.m4933a(r21)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            r3 = 0
            r4 = 0
        L_0x000c:
            r5 = 1
            if (r4 >= r1) goto L_0x003b
            android.app.Notification$Action[] r6 = r0.actions
            r6 = r6[r4]
            androidx.core.app.s r6 = androidx.core.app.C1791ah.m4934b(r6)
            int r7 = r6.f5658e
            if (r7 != r5) goto L_0x0020
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r6)
            return r0
        L_0x0020:
            boolean r5 = r2.isPresent()
            if (r5 != 0) goto L_0x0038
            boolean r5 = r6.f5656c
            if (r5 == 0) goto L_0x0038
            j$.util.Optional r5 = m63631c(r6)
            boolean r5 = r5.isPresent()
            if (r5 == 0) goto L_0x0038
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r6)
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x003b:
            boolean r1 = r2.isPresent()
            if (r1 == 0) goto L_0x0042
            return r2
        L_0x0042:
            androidx.core.app.ag r1 = new androidx.core.app.ag
            r1.<init>(r0)
            java.util.ArrayList r1 = r1.f5583a
            java.util.Iterator r1 = r1.iterator()
        L_0x004d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()
            androidx.core.app.s r2 = (androidx.core.app.C1832s) r2
            j$.util.Optional r4 = m63631c(r2)
            boolean r4 = r4.isPresent()
            if (r4 == 0) goto L_0x004d
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r2)
            return r0
        L_0x0068:
            android.os.Bundle r1 = r0.extras
            r2 = 0
            if (r1 != 0) goto L_0x006f
            r0 = r2
            goto L_0x0077
        L_0x006f:
            android.os.Bundle r0 = r0.extras
            java.lang.String r1 = "android.car.EXTENSIONS"
            android.os.Bundle r0 = r0.getBundle(r1)
        L_0x0077:
            if (r0 == 0) goto L_0x010d
            java.lang.String r1 = "large_icon"
            android.os.Parcelable r1 = r0.getParcelable(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.String r1 = "app_color"
            r0.getInt(r1, r3)
            java.lang.String r1 = "car_conversation"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 != 0) goto L_0x0090
            goto L_0x010d
        L_0x0090:
            java.lang.String r1 = "messages"
            android.os.Parcelable[] r1 = r0.getParcelableArray(r1)
            if (r1 == 0) goto L_0x00b8
            int r4 = r1.length
            java.lang.String[] r6 = new java.lang.String[r4]
            r7 = 0
        L_0x009c:
            if (r7 >= r4) goto L_0x00b6
            r8 = r1[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 != 0) goto L_0x00a6
            goto L_0x010d
        L_0x00a6:
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r9 = "text"
            java.lang.String r8 = r8.getString(r9)
            r6[r7] = r8
            if (r8 != 0) goto L_0x00b3
            goto L_0x010d
        L_0x00b3:
            int r7 = r7 + 1
            goto L_0x009c
        L_0x00b6:
            r9 = r6
            goto L_0x00b9
        L_0x00b8:
            r9 = r2
        L_0x00b9:
            java.lang.String r1 = "on_read"
            android.os.Parcelable r1 = r0.getParcelable(r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            java.lang.String r1 = "on_reply"
            android.os.Parcelable r1 = r0.getParcelable(r1)
            r11 = r1
            android.app.PendingIntent r11 = (android.app.PendingIntent) r11
            java.lang.String r1 = "remote_input"
            android.os.Parcelable r1 = r0.getParcelable(r1)
            android.app.RemoteInput r1 = (android.app.RemoteInput) r1
            java.lang.String r4 = "participants"
            java.lang.String[] r12 = r0.getStringArray(r4)
            if (r12 == 0) goto L_0x010d
            int r4 = r12.length
            if (r4 == r5) goto L_0x00de
            goto L_0x010d
        L_0x00de:
            if (r1 == 0) goto L_0x0100
            androidx.core.app.ba r2 = new androidx.core.app.ba
            java.lang.String r14 = r1.getResultKey()
            java.lang.CharSequence r15 = r1.getLabel()
            java.lang.CharSequence[] r16 = r1.getChoices()
            boolean r17 = r1.getAllowFreeFormInput()
            int r18 = r1.getEditChoicesBeforeSending()
            android.os.Bundle r19 = r1.getExtras()
            r20 = 0
            r13 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
        L_0x0100:
            r10 = r2
            androidx.core.app.aa r2 = new androidx.core.app.aa
            java.lang.String r1 = "timestamp"
            long r13 = r0.getLong(r1)
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x010d:
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r2)
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x014f
            java.lang.Object r1 = r0.get()
            androidx.core.app.aa r1 = (androidx.core.app.C1784aa) r1
            android.app.PendingIntent r1 = r1.f5564c
            if (r1 == 0) goto L_0x014f
            java.lang.Object r1 = r0.get()
            androidx.core.app.aa r1 = (androidx.core.app.C1784aa) r1
            androidx.core.app.ba r1 = r1.f5563b
            if (r1 != 0) goto L_0x012c
            goto L_0x014f
        L_0x012c:
            androidx.core.app.r r1 = new androidx.core.app.r
            java.lang.Object r2 = r0.get()
            androidx.core.app.aa r2 = (androidx.core.app.C1784aa) r2
            android.app.PendingIntent r2 = r2.f5564c
            java.lang.String r4 = "reply"
            r1.<init>(r3, r4, r2)
            java.lang.Object r0 = r0.get()
            androidx.core.app.aa r0 = (androidx.core.app.C1784aa) r0
            androidx.core.app.ba r0 = r0.f5563b
            r1.mo5009b(r0)
            androidx.core.app.s r0 = r1.mo5008a()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x0153
        L_0x014f:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0153:
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto L_0x015a
            return r0
        L_0x015a:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.notification.p2712c.C34867a.m63630b(android.app.Notification):j$.util.Optional");
    }

    /* renamed from: c */
    public static Optional m63631c(C1832s sVar) {
        C1811ba[] baVarArr = sVar.f5655b;
        if (baVarArr == null) {
            return Optional.empty();
        }
        for (C1811ba baVar : baVarArr) {
            if (baVar.f5639d) {
                return Optional.m71637of(baVar);
            }
        }
        return Optional.empty();
    }
}
