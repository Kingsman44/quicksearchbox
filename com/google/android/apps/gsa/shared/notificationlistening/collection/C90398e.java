package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.C1787ad;
import androidx.core.app.C1788ae;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90389w;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90435p;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C60242lp;
import com.google.common.p4552o.C60244lr;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.e */
/* compiled from: PG */
public class C90398e implements C90411r {
    /* renamed from: d */
    public List mo84092d(Context context, C89656k kVar, C21370a aVar, C90367af afVar, C90381o oVar, C60242lp lpVar, boolean z) {
        Bundle bundle = afVar.f252393a.getNotification().extras;
        C90435p pVar = new C90435p(aVar);
        C90366ae.m146971j(context, kVar, afVar, oVar, pVar);
        if (bundle.getCharSequence("android.text") == null) {
            C90366ae.m146974m(lpVar, 2, Collections.singletonList(C60244lr.NO_EXTRA_TITLE_OR_EXTRA_TEXT));
            return Collections.emptyList();
        }
        pVar.f252646r = bundle.getCharSequence("android.text");
        pVar.f252645q = bundle.getCharSequence("android.title");
        StandardNotification standardNotification = new StandardNotification(pVar);
        if (standardNotification.f252587h || (oVar != null && oVar.f252424d != 0)) {
            return Collections.singletonList(standardNotification);
        }
        return Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C90389w mo84101i(Context context, Notification notification, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!notification.extras.containsKey("android.picture")) {
            return new C90389w(charSequence, "text/plain");
        }
        if (charSequence.toString().contains("Video") || charSequence.toString().contains("video")) {
            return new C90389w(context.getString(R.string.shared_video), "video");
        }
        if (charSequence.toString().contains("location")) {
            return new C90389w(context.getString(R.string.shared_location), "image");
        }
        return new C90389w(context.getString(R.string.shared_photo), "image");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo84102j(C89656k kVar, int i, C1788ae aeVar) {
        if (aeVar == null || i < 0 || i >= aeVar.f5574a.size() || aeVar.f5574a.get(i) == null || ((C1787ad) aeVar.f5574a.get(i)).mo4994b() == null) {
            return null;
        }
        CharSequence b = ((C1787ad) aeVar.f5574a.get(i)).mo4994b();
        b.getClass();
        return b.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0161, code lost:
        if (android.text.TextUtils.isEmpty(r15) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017a, code lost:
        if (com.google.common.base.C58837ba.m90859h(r7) == false) goto L_0x0183;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015d  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo84103k(android.content.Context r25, com.google.android.apps.gsa.shared.bisto.C89656k r26, com.google.android.libraries.p1730f.C21370a r27, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af r28, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o r29, java.lang.CharSequence r30, boolean r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = r30
            android.service.notification.StatusBarNotification r5 = r3.f252393a
            android.app.Notification r5 = r5.getNotification()
            android.os.Bundle r6 = r5.extras
            if (r6 != 0) goto L_0x0016
            r5 = 0
            goto L_0x001e
        L_0x0016:
            android.os.Bundle r5 = r5.extras
            java.lang.String r6 = "android.car.EXTENSIONS"
            android.os.Bundle r5 = r5.getBundle(r6)
        L_0x001e:
            r6 = 0
            if (r5 == 0) goto L_0x00bc
            java.lang.String r8 = "large_icon"
            android.os.Parcelable r8 = r5.getParcelable(r8)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            java.lang.String r8 = "app_color"
            r5.getInt(r8, r6)
            java.lang.String r8 = "car_conversation"
            android.os.Bundle r5 = r5.getBundle(r8)
            if (r5 != 0) goto L_0x0038
            goto L_0x00bc
        L_0x0038:
            java.lang.String r8 = "messages"
            android.os.Parcelable[] r8 = r5.getParcelableArray(r8)
            if (r8 == 0) goto L_0x0060
            int r9 = r8.length
            java.lang.String[] r10 = new java.lang.String[r9]
            r11 = 0
        L_0x0044:
            if (r11 >= r9) goto L_0x005e
            r12 = r8[r11]
            boolean r13 = r12 instanceof android.os.Bundle
            if (r13 != 0) goto L_0x004e
            goto L_0x00bc
        L_0x004e:
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.String r13 = "text"
            java.lang.String r12 = r12.getString(r13)
            r10[r11] = r12
            if (r12 != 0) goto L_0x005b
            goto L_0x00bc
        L_0x005b:
            int r11 = r11 + 1
            goto L_0x0044
        L_0x005e:
            r13 = r10
            goto L_0x0061
        L_0x0060:
            r13 = 0
        L_0x0061:
            java.lang.String r8 = "on_read"
            android.os.Parcelable r8 = r5.getParcelable(r8)
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8
            java.lang.String r8 = "on_reply"
            android.os.Parcelable r8 = r5.getParcelable(r8)
            r15 = r8
            android.app.PendingIntent r15 = (android.app.PendingIntent) r15
            java.lang.String r8 = "remote_input"
            android.os.Parcelable r8 = r5.getParcelable(r8)
            android.app.RemoteInput r8 = (android.app.RemoteInput) r8
            java.lang.String r9 = "participants"
            java.lang.String[] r9 = r5.getStringArray(r9)
            if (r9 == 0) goto L_0x00bc
            int r10 = r9.length
            r11 = 1
            if (r10 == r11) goto L_0x0087
            goto L_0x00bc
        L_0x0087:
            if (r8 == 0) goto L_0x00ac
            androidx.core.app.ba r10 = new androidx.core.app.ba
            java.lang.String r17 = r8.getResultKey()
            java.lang.CharSequence r18 = r8.getLabel()
            java.lang.CharSequence[] r19 = r8.getChoices()
            boolean r20 = r8.getAllowFreeFormInput()
            int r21 = r8.getEditChoicesBeforeSending()
            android.os.Bundle r22 = r8.getExtras()
            r23 = 0
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r14 = r10
            goto L_0x00ad
        L_0x00ac:
            r14 = 0
        L_0x00ad:
            androidx.core.app.aa r8 = new androidx.core.app.aa
            java.lang.String r10 = "timestamp"
            long r17 = r5.getLong(r10)
            r12 = r8
            r16 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x00bd
        L_0x00bc:
            r8 = 0
        L_0x00bd:
            android.service.notification.StatusBarNotification r5 = r3.f252393a
            android.app.Notification r5 = r5.getNotification()
            androidx.core.app.ae r5 = androidx.core.app.C1788ae.m4919g(r5)
            if (r8 == 0) goto L_0x00d0
            java.lang.String[] r9 = r8.f5562a
            if (r9 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            int r9 = r9.length
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            if (r5 == 0) goto L_0x00da
            java.util.List r10 = r5.f5574a
            int r10 = r10.size()
            goto L_0x00db
        L_0x00da:
            r10 = 0
        L_0x00db:
            int r11 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146994a(r8, r5)
            int r12 = java.lang.Math.min(r6, r11)
            int r11 = -r11
            int r6 = java.lang.Math.min(r6, r11)
            android.service.notification.StatusBarNotification r11 = r3.f252393a
            android.app.Notification r11 = r11.getNotification()
            androidx.core.app.s r11 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146964c(r11)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00f7:
            if (r6 < r9) goto L_0x00fd
            if (r12 >= r10) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            return r13
        L_0x00fd:
            if (r5 == 0) goto L_0x0119
            if (r12 < 0) goto L_0x0119
            java.util.List r14 = r5.f5574a
            int r14 = r14.size()
            if (r12 < r14) goto L_0x010a
            goto L_0x0119
        L_0x010a:
            java.util.List r14 = r5.f5574a
            java.lang.Object r14 = r14.get(r12)
            androidx.core.app.ad r14 = (androidx.core.app.C1787ad) r14
            long r14 = r14.f5569b
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x011a
        L_0x0119:
            r14 = 0
        L_0x011a:
            if (r14 != 0) goto L_0x0129
            if (r6 != 0) goto L_0x0128
            if (r8 != 0) goto L_0x0121
            goto L_0x0128
        L_0x0121:
            long r14 = r8.f5565d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x0129
        L_0x0128:
            r14 = 0
        L_0x0129:
            if (r5 == 0) goto L_0x0141
            if (r12 < 0) goto L_0x0141
            java.util.List r15 = r5.f5574a
            int r15 = r15.size()
            if (r12 < r15) goto L_0x0136
            goto L_0x0141
        L_0x0136:
            java.util.List r15 = r5.f5574a
            java.lang.Object r15 = r15.get(r12)
            androidx.core.app.ad r15 = (androidx.core.app.C1787ad) r15
            java.lang.CharSequence r15 = r15.f5568a
            goto L_0x0142
        L_0x0141:
            r15 = 0
        L_0x0142:
            if (r8 == 0) goto L_0x0164
            if (r15 == 0) goto L_0x014c
            boolean r16 = android.text.TextUtils.isEmpty(r15)
            if (r16 == 0) goto L_0x0164
        L_0x014c:
            java.lang.String[] r15 = r8.f5562a
            if (r15 == 0) goto L_0x015a
            if (r6 < 0) goto L_0x015a
            int r7 = r15.length
            if (r6 < r7) goto L_0x0156
            goto L_0x015a
        L_0x0156:
            r7 = r15[r6]
            r15 = r7
            goto L_0x015b
        L_0x015a:
            r15 = 0
        L_0x015b:
            if (r15 == 0) goto L_0x017d
            boolean r7 = android.text.TextUtils.isEmpty(r15)
            if (r7 == 0) goto L_0x0164
            goto L_0x017d
        L_0x0164:
            if (r8 != 0) goto L_0x0168
            r7 = 0
            goto L_0x016c
        L_0x0168:
            java.lang.String r7 = r8.mo4985a()
        L_0x016c:
            boolean r17 = com.google.common.base.C58837ba.m90859h(r7)
            if (r17 == 0) goto L_0x0183
            java.lang.String r7 = r0.mo84102j(r2, r12, r5)
            boolean r17 = com.google.common.base.C58837ba.m90859h(r7)
            if (r17 != 0) goto L_0x017d
            goto L_0x0183
        L_0x017d:
            r0 = r29
            r17 = r8
            goto L_0x0216
        L_0x0183:
            r17 = r8
            r8 = r31
            java.lang.String r7 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146969h(r1, r7, r8)
            android.service.notification.StatusBarNotification r8 = r3.f252393a
            android.app.Notification r8 = r8.getNotification()
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.w r8 = r0.mo84101i(r1, r8, r15)
            com.google.android.apps.gsa.shared.notificationlistening.common.j r15 = new com.google.android.apps.gsa.shared.notificationlistening.common.j
            r0 = r27
            r15.<init>(r0)
            if (r8 != 0) goto L_0x01a0
            r0 = 0
            goto L_0x01a2
        L_0x01a0:
            java.lang.CharSequence r0 = r8.f252448a
        L_0x01a2:
            r15.f252622s = r0
            if (r8 != 0) goto L_0x01a8
            r0 = 0
            goto L_0x01aa
        L_0x01a8:
            java.lang.String r0 = r8.f252449b
        L_0x01aa:
            r15.f252623t = r0
            r15.f252615D = r7
            if (r11 == 0) goto L_0x01b3
            r15.mo84160c(r11)
        L_0x01b3:
            android.service.notification.StatusBarNotification r0 = r3.f252393a
            android.app.Notification r0 = r0.getNotification()
            androidx.core.app.s r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146963b(r0)
            r15.mo84159b(r0)
            android.service.notification.StatusBarNotification r0 = r3.f252393a
            android.app.Notification r0 = r0.getNotification()
            r15.f252614C = r0
            r0 = r29
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146971j(r1, r2, r3, r0, r15)
            android.service.notification.StatusBarNotification r8 = r3.f252393a
            java.lang.String r8 = r8.getKey()
            r15.mo84143a(r8, r7)
            java.lang.String r7 = "msg"
            r15.f252568e = r7
            if (r14 == 0) goto L_0x01e6
            long r7 = r14.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r15.f252578o = r7
        L_0x01e6:
            if (r5 == 0) goto L_0x0206
            if (r12 < 0) goto L_0x0206
            if (r12 >= r10) goto L_0x0206
            java.util.List r7 = r5.f5574a
            java.lang.Object r7 = r7.get(r12)
            androidx.core.app.ad r7 = (androidx.core.app.C1787ad) r7
            if (r7 == 0) goto L_0x0206
            java.lang.String r8 = r7.f5571d
            if (r8 == 0) goto L_0x0206
            java.lang.String r14 = "audio/"
            boolean r8 = r8.startsWith(r14)
            if (r8 == 0) goto L_0x0206
            android.net.Uri r7 = r7.f5572e
            r15.f252567d = r7
        L_0x0206:
            if (r4 == 0) goto L_0x020e
            r15.f252620q = r4
            java.lang.String r7 = ""
            r15.f252615D = r7
        L_0x020e:
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r7 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            r7.<init>(r15)
            r13.add(r7)
        L_0x0216:
            int r6 = r6 + 1
            int r12 = r12 + 1
            r0 = r24
            r8 = r17
            goto L_0x00f7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.C90398e.mo84103k(android.content.Context, com.google.android.apps.gsa.shared.bisto.k, com.google.android.libraries.f.a, com.google.android.apps.gsa.shared.notificationlistening.collection.a.af, com.google.android.apps.gsa.shared.notificationlistening.collection.a.o, java.lang.CharSequence, boolean):java.util.List");
    }
}
