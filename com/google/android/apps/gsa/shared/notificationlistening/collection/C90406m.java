package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.content.Context;
import androidx.core.app.C1787ad;
import androidx.core.app.C1803at;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90389w;
import com.google.common.p4526f.C59071e;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.m */
/* compiled from: PG */
public class C90406m implements C90411r {

    /* renamed from: c */
    public static final /* synthetic */ int f252484c = 0;

    /* renamed from: d */
    private static final C59071e f252485d = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.collection.m");

    /* renamed from: e */
    private static final Pattern f252486e = Pattern.compile("^(.*)\\([0-9]+.*\\)$");

    /* renamed from: a */
    public boolean f252487a;

    /* renamed from: b */
    public boolean f252488b;

    /* renamed from: b */
    private static CharSequence m147036b(C1787ad adVar) {
        C1803at atVar = adVar.f5570c;
        if (atVar == null) {
            return null;
        }
        return atVar.f5630a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C90389w mo84107a(Context context, C1787ad adVar) {
        CharSequence charSequence = adVar.f5568a;
        String str = adVar.f5571d;
        if (str == null) {
            str = "text/plain";
        }
        return new C90389w(charSequence, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x027b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0274 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0171 A[SYNTHETIC, Splitter:B:56:0x0171] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0226  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo84092d(android.content.Context r18, com.google.android.apps.gsa.shared.bisto.C89656k r19, com.google.android.libraries.p1730f.C21370a r20, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af r21, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o r22, com.google.common.p4552o.C60242lp r23, boolean r24) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r21
            r4 = r24
            java.lang.String r5 = "MessageStyleParser"
            android.service.notification.StatusBarNotification r0 = r3.f252393a
            android.app.Notification r0 = r0.getNotification()
            androidx.core.app.ae r6 = androidx.core.app.C1788ae.m4919g(r0)
            if (r6 != 0) goto L_0x0020
            java.lang.String r0 = "Style shouldn't be null"
            com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(r0)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            return r0
        L_0x0020:
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146975n(r19)
            java.util.List r0 = r6.f5574a
            boolean r7 = r1.f252487a
            r8 = 0
            if (r7 != 0) goto L_0x0052
            if (r4 != 0) goto L_0x0052
            boolean r7 = r6.mo4996i()
            if (r7 == 0) goto L_0x0052
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004d
            java.util.List r0 = r6.f5574a
            com.google.android.apps.gsa.shared.notificationlistening.collection.l r7 = new com.google.android.apps.gsa.shared.notificationlistening.collection.l
            r7.<init>()
            java.util.Collections.sort(r0, r7)
            java.lang.Object r0 = r0.get(r8)
            androidx.core.app.ad r0 = (androidx.core.app.C1787ad) r0
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            goto L_0x0052
        L_0x004d:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            return r0
        L_0x0052:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r9 = r0.size()
            r7.<init>(r9)
            java.util.Iterator r9 = r0.iterator()
        L_0x005f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r0 = r9.next()
            r10 = r0
            androidx.core.app.ad r10 = (androidx.core.app.C1787ad) r10
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146975n(r19)
            androidx.core.app.at r0 = r10.f5570c
            if (r0 == 0) goto L_0x02af
            java.lang.CharSequence r0 = m147036b(r10)
            if (r0 == 0) goto L_0x008c
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146975n(r19)
            java.lang.CharSequence r0 = m147036b(r10)
            r0.getClass()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146969h(r2, r0, r4)
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            boolean r12 = com.google.common.base.C58837ba.m90859h(r0)
            if (r12 == 0) goto L_0x00af
            androidx.core.app.at r12 = r6.f5575b
            java.lang.CharSequence r12 = r12.f5630a
            if (r12 == 0) goto L_0x00af
            java.lang.CharSequence r12 = r6.f5576c
            if (r12 == 0) goto L_0x00af
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146975n(r19)
            androidx.core.app.at r0 = r6.f5575b
            java.lang.CharSequence r0 = r0.f5630a
            r0.getClass()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146969h(r2, r0, r4)
        L_0x00af:
            r12 = r0
            boolean r0 = com.google.common.base.C58837ba.m90859h(r12)
            if (r0 == 0) goto L_0x00bd
            r15 = r19
            r16 = r9
            r11 = 0
            goto L_0x02a5
        L_0x00bd:
            com.google.android.apps.gsa.shared.notificationlistening.common.j r13 = new com.google.android.apps.gsa.shared.notificationlistening.common.j
            r14 = r20
            r13.<init>(r14)
            r15 = r19
            r8 = r22
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146971j(r2, r15, r3, r8, r13)
            r16 = r12
            long r11 = r10.f5569b
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r13.f252578o = r0
            android.service.notification.StatusBarNotification r0 = r3.f252393a
            java.lang.String r0 = r0.getKey()
            r11 = r16
            r13.mo84143a(r0, r11)
            java.lang.String r0 = "msg"
            r13.f252568e = r0
            android.service.notification.StatusBarNotification r0 = r3.f252393a
            android.app.Notification r0 = r0.getNotification()
            androidx.core.app.s r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146964c(r0)
            r13.mo84160c(r0)
            android.service.notification.StatusBarNotification r0 = r3.f252393a
            android.app.Notification r0 = r0.getNotification()
            androidx.core.app.s r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146963b(r0)
            r13.mo84159b(r0)
            android.service.notification.StatusBarNotification r0 = r3.f252393a
            android.app.Notification r0 = r0.getNotification()
            r13.f252614C = r0
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.w r12 = r1.mo84107a(r2, r10)
            java.lang.CharSequence r0 = r10.f5568a
            r13.f252626w = r0
            if (r12 != 0) goto L_0x0112
            r0 = 0
            goto L_0x0114
        L_0x0112:
            java.lang.CharSequence r0 = r12.f252448a
        L_0x0114:
            r13.f252622s = r0
            if (r12 != 0) goto L_0x011a
            r0 = 0
            goto L_0x011c
        L_0x011a:
            java.lang.String r0 = r12.f252449b
        L_0x011c:
            r13.f252623t = r0
            java.lang.String r0 = r12.f252449b     // Catch:{ NullPointerException -> 0x014c }
            java.lang.String r8 = "audio"
            boolean r0 = r0.startsWith(r8)     // Catch:{ NullPointerException -> 0x014c }
            if (r0 == 0) goto L_0x0149
            r16 = r9
            long r8 = r10.f5569b     // Catch:{ NullPointerException -> 0x0147 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NullPointerException -> 0x0147 }
            r0.<init>()     // Catch:{ NullPointerException -> 0x0147 }
            java.lang.String r14 = "NotifTemp"
            r0.append(r14)     // Catch:{ NullPointerException -> 0x0147 }
            r0.append(r8)     // Catch:{ NullPointerException -> 0x0147 }
            java.lang.String r8 = ".dat"
            r0.append(r8)     // Catch:{ NullPointerException -> 0x0147 }
            java.lang.String r0 = r0.toString()     // Catch:{ NullPointerException -> 0x0147 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ NullPointerException -> 0x0147 }
            goto L_0x0165
        L_0x0147:
            r0 = move-exception
            goto L_0x014f
        L_0x0149:
            r16 = r9
            goto L_0x0161
        L_0x014c:
            r0 = move-exception
            r16 = r9
        L_0x014f:
            com.google.common.f.e r8 = f252485d
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r5)
            java.lang.String r9 = "Error parsing audio content."
            r14 = 10818(0x2a42, float:1.5159E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r0)).mo56372aa(r14)).mo56386p(r9)
        L_0x0161:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0165:
            com.google.android.apps.gsa.shared.notificationlistening.collection.j r8 = new com.google.android.apps.gsa.shared.notificationlistening.collection.j
            r8.<init>(r13, r10)
            r0.ifPresent(r8)
            boolean r0 = r1.f252488b
            if (r0 == 0) goto L_0x01cd
            java.lang.String r0 = r12.f252449b     // Catch:{ NullPointerException -> 0x01a0, IOException -> 0x019e, all -> 0x019b }
            java.lang.String r8 = "image"
            boolean r0 = r0.startsWith(r8)     // Catch:{ NullPointerException -> 0x01a0, IOException -> 0x019e, all -> 0x019b }
            if (r0 == 0) goto L_0x01cd
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NullPointerException -> 0x01a0, IOException -> 0x019e, all -> 0x019b }
            android.content.ContentResolver r0 = r18.getContentResolver()     // Catch:{ NullPointerException -> 0x01a0, IOException -> 0x019e, all -> 0x019b }
            android.net.Uri r8 = r10.f5572e     // Catch:{ NullPointerException -> 0x01a0, IOException -> 0x019e, all -> 0x019b }
            r8.getClass()
            java.io.InputStream r8 = com.google.android.libraries.gsa.util.C23335a.m43765b(r0, r8)     // Catch:{ NullPointerException -> 0x01a0, IOException -> 0x019e, all -> 0x019b }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ NullPointerException -> 0x0199, IOException -> 0x0197 }
            j$.util.Optional r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90385s.m146989a(r0)     // Catch:{ NullPointerException -> 0x0199, IOException -> 0x0197 }
            com.google.common.p4541l.C59337t.m92221a(r8)
            r8 = 0
            goto L_0x01d5
        L_0x0197:
            r0 = move-exception
            goto L_0x01a2
        L_0x0199:
            r0 = move-exception
            goto L_0x01a2
        L_0x019b:
            r0 = move-exception
            r11 = 0
            goto L_0x01c9
        L_0x019e:
            r0 = move-exception
            goto L_0x01a1
        L_0x01a0:
            r0 = move-exception
        L_0x01a1:
            r8 = 0
        L_0x01a2:
            com.google.common.f.e r9 = f252485d     // Catch:{ all -> 0x01c7 }
            com.google.common.f.x r9 = r9.mo56226d()     // Catch:{ all -> 0x01c7 }
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01c7 }
            r9.mo56378ag(r14, r5)     // Catch:{ all -> 0x01c7 }
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9     // Catch:{ all -> 0x01c7 }
            com.google.common.f.x r0 = r9.mo56382g(r0)     // Catch:{ all -> 0x01c7 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01c7 }
            r9 = 10820(0x2a44, float:1.5162E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r9)     // Catch:{ all -> 0x01c7 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01c7 }
            java.lang.String r9 = "Error parsing image content."
            r0.mo56386p(r9)     // Catch:{ all -> 0x01c7 }
            com.google.common.p4541l.C59337t.m92221a(r8)
            r8 = 0
            goto L_0x01d1
        L_0x01c7:
            r0 = move-exception
            r11 = r8
        L_0x01c9:
            com.google.common.p4541l.C59337t.m92221a(r11)
            throw r0
        L_0x01cd:
            r8 = 0
            com.google.common.p4541l.C59337t.m92221a(r8)
        L_0x01d1:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x01d5:
            com.google.android.apps.gsa.shared.notificationlistening.collection.k r9 = new com.google.android.apps.gsa.shared.notificationlistening.collection.k
            r9.<init>(r13, r10)
            r0.ifPresent(r9)
            if (r12 != 0) goto L_0x01e0
            goto L_0x01e3
        L_0x01e0:
            java.lang.String r0 = r12.f252449b
            r8 = r0
        L_0x01e3:
            r0 = 1
            if (r8 == 0) goto L_0x01fe
            java.lang.String r9 = "broadcast/assistant_server_audio"
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x01f6
            java.lang.String r9 = "family_broadcast/assistant_server_audio"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x01fe
        L_0x01f6:
            android.net.Uri r8 = r10.f5572e
            if (r8 == 0) goto L_0x01fe
            r13.f252628y = r0
            r13.f252624u = r8
        L_0x01fe:
            android.service.notification.StatusBarNotification r8 = r3.f252393a
            android.app.Notification r8 = r8.getNotification()
            java.lang.String r8 = r8.getGroup()
            if (r8 == 0) goto L_0x0216
            android.service.notification.StatusBarNotification r8 = r3.f252393a
            android.app.Notification r8 = r8.getNotification()
            java.lang.String r8 = r8.getGroup()
            r13.f252617F = r8
        L_0x0216:
            android.service.notification.StatusBarNotification r8 = r3.f252393a
            android.app.Notification r8 = r8.getNotification()
            android.os.Bundle r8 = r8.extras
            java.lang.String r9 = "opaque_token"
            byte[] r10 = r8.getByteArray(r9)
            if (r10 == 0) goto L_0x022c
            byte[] r9 = r8.getByteArray(r9)
            r13.f252619H = r9
        L_0x022c:
            java.lang.String r9 = "grouping_key"
            java.lang.String r10 = r8.getString(r9)
            if (r10 == 0) goto L_0x023a
            java.lang.String r8 = r8.getString(r9)
            r13.f252618G = r8
        L_0x023a:
            java.lang.String r8 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146967f(r2, r11, r4)
            r13.f252615D = r8
            java.lang.CharSequence r8 = r6.f5576c
            if (r8 == 0) goto L_0x02a0
            boolean r9 = r6.mo4996i()
            if (r9 == 0) goto L_0x02a0
            java.lang.String r9 = ", "
            com.google.common.base.cf r9 = com.google.common.base.C58869cf.m90938d(r9)
            java.lang.String r10 = r8.toString()
            java.lang.Iterable r9 = r9.mo56153g(r10)
            java.util.Iterator r10 = r9.iterator()
        L_0x025c:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0274
            java.lang.Object r12 = r10.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = r12.trim()
            boolean r12 = r11.contains(r12)
            if (r12 == 0) goto L_0x025c
            r10 = 1
            goto L_0x0275
        L_0x0274:
            r10 = 0
        L_0x0275:
            if (r10 == 0) goto L_0x0279
            r13.f252621r = r9
        L_0x0279:
            if (r4 == 0) goto L_0x0287
            if (r10 == 0) goto L_0x0287
            r0 = 2132093361(0x7f1529b1, float:1.9827145E38)
            java.lang.String r0 = r2.getString(r0)
            r13.f252620q = r0
            goto L_0x02a0
        L_0x0287:
            java.util.regex.Pattern r9 = f252486e
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r10 = r9.matches()
            if (r10 == 0) goto L_0x029e
            java.lang.String r0 = r9.group(r0)
            java.lang.String r8 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146997d(r0)
            r8.getClass()
        L_0x029e:
            r13.f252620q = r8
        L_0x02a0:
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r11 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            r11.<init>(r13)
        L_0x02a5:
            if (r11 == 0) goto L_0x02aa
            r7.add(r11)
        L_0x02aa:
            r9 = r16
            r8 = 0
            goto L_0x005f
        L_0x02af:
            r15 = r19
            goto L_0x005f
        L_0x02b3:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.C90406m.mo84092d(android.content.Context, com.google.android.apps.gsa.shared.bisto.k, com.google.android.libraries.f.a, com.google.android.apps.gsa.shared.notificationlistening.collection.a.af, com.google.android.apps.gsa.shared.notificationlistening.collection.a.o, com.google.common.o.lp, boolean):java.util.List");
    }
}
