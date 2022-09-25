package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1784aa;
import androidx.core.app.C1787ad;
import androidx.core.app.C1788ae;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90429j;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60242lp;
import com.google.common.p4552o.C60244lr;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.y */
/* compiled from: PG */
public final class C90391y {

    /* renamed from: a */
    public static final C90388v f252450a = new C90388v(Pattern.compile("(.+?)\\: (.*)"), (Map) null, (Integer) null, 1, 2);

    /* renamed from: b */
    private static final C59071e f252451b = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.collection.a.y");

    /* renamed from: c */
    private static final C90388v f252452c = new C90388v(Pattern.compile("^(.+) @ (.+)$"), (Map) null, 2, 1, (Integer) null);

    /* renamed from: d */
    private static final C90388v f252453d;

    /* renamed from: e */
    private static final C90388v f252454e = new C90388v(Pattern.compile("^(.+) \\((\\d+) (\\w+)\\)(.?)\\: (.+)$"), (Map) null, 1, 5, (Integer) null);

    /* renamed from: f */
    private static final C90388v f252455f = new C90388v(Pattern.compile("^(.+?)\\: (.*)$"), (Map) null, 1, 2, (Integer) null);

    /* renamed from: g */
    private static final C90388v f252456g;

    /* renamed from: h */
    private static final C90388v f252457h = new C90388v(Pattern.compile("^(.+?)\\: (.*)$"), (Map) null, 1, 2, (Integer) null);

    static {
        Pattern compile = Pattern.compile("^Message from (.+) @ (.+)$");
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(Locale.FRANCE, Pattern.compile("^Message de (.+) @ (.+)$"));
        gzVar.mo55429h(Locale.FRENCH, Pattern.compile("^Message de (.+) @ (.+)$"));
        gzVar.mo55429h(Locale.CANADA_FRENCH, Pattern.compile("^Message de (.+) @ (.+)$"));
        gzVar.mo55429h(Locale.GERMAN, Pattern.compile("^Nachricht von (.+) @ (.+)$"));
        gzVar.mo55429h(Locale.GERMANY, Pattern.compile("^Nachricht von (.+) @ (.+)$"));
        gzVar.mo55429h(Locale.forLanguageTag("pt-BR"), Pattern.compile("^Mensagem de (.+) @ (.+)$"));
        f252453d = new C90388v(compile, gzVar.mo55427f(false), 2, 1, (Integer) null);
        Pattern compile2 = Pattern.compile("^Message from (.+)$");
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(Locale.FRANCE, Pattern.compile("^Message de (.+)$"));
        gzVar2.mo55429h(Locale.FRENCH, Pattern.compile("^Message de (.+)$"));
        gzVar2.mo55429h(Locale.CANADA, Pattern.compile("^Message de (.+)$"));
        gzVar2.mo55429h(Locale.GERMAN, Pattern.compile("^Nachricht von (.+)$"));
        gzVar2.mo55429h(Locale.GERMANY, Pattern.compile("^Nachricht von (.+)$"));
        gzVar2.mo55429h(Locale.forLanguageTag("pt-BR"), Pattern.compile("^Mensagem de (.+)$"));
        f252456g = new C90388v(compile2, gzVar2.mo55427f(false), (Integer) null, 1, (Integer) null);
    }

    /* renamed from: a */
    public static int m146994a(C1784aa aaVar, C1788ae aeVar) {
        int i;
        if (!(aaVar == null || aeVar == null)) {
            String[] strArr = aaVar.f5562a;
            if (strArr == null) {
                i = 0;
            } else {
                i = strArr.length;
            }
            int size = aeVar.f5574a.size();
            if (!(i == 0 || size == 0)) {
                for (int i2 = 0; i2 < i; i2++) {
                    boolean g = m147000g(aaVar.f5562a[i2], ((C1787ad) aeVar.f5574a.get(0)).f5568a);
                    int i3 = i2;
                    int i4 = 0;
                    while (g) {
                        if (i3 >= i || i4 >= size) {
                            return i2;
                        }
                        g = m147000g(aaVar.f5562a[i3], ((C1787ad) aeVar.f5574a.get(i4)).f5568a);
                        i3++;
                        i4++;
                    }
                }
                return size;
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b5, code lost:
        if (r4 != false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r1 = r0.mo84081a(r24.getPostTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011a, code lost:
        if (r9.toString().startsWith(r11.f252440a.toString()) != false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0120 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0124 A[LOOP:1: B:20:0x00b6->B:48:0x0124, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u m146995b(android.service.notification.StatusBarNotification r24, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o r25) {
        /*
            r0 = r25
            android.app.Notification r1 = r24.getNotification()
            java.lang.CharSequence r1 = r1.tickerText
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x001a
            if (r0 == 0) goto L_0x001a
            long r4 = r24.getPostTime()
            java.lang.CharSequence r1 = r0.mo84081a(r4)
            if (r1 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            android.app.Notification r4 = r24.getNotification()
            android.os.Bundle r4 = r4.extras
            java.lang.String r5 = "android.title"
            java.lang.CharSequence r4 = r4.getCharSequence(r5)
            android.app.Notification r5 = r24.getNotification()
            android.os.Bundle r5 = r5.extras
            java.lang.String r6 = "android.text"
            java.lang.CharSequence r5 = r5.getCharSequence(r6)
            r6 = 0
            if (r1 == 0) goto L_0x0153
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 3
            r7.<init>(r8)
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r9 = f252453d
            r7.add(r9)
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r9 = f252452c
            r7.add(r9)
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r9 = f252456g
            r7.add(r9)
            int r9 = r7.size()
            r11 = r6
            r10 = 0
        L_0x0051:
            if (r10 >= r9) goto L_0x0063
            java.lang.Object r11 = r7.get(r10)
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r11 = (com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90388v) r11
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r11 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u.m146991a(r11, r1)
            int r10 = r10 + 1
            if (r11 == 0) goto L_0x0051
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0063:
            if (r11 != 0) goto L_0x0069
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0153
        L_0x0069:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r7 = f252452c
            r1.add(r7)
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r7 = f252454e
            r1.add(r7)
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r7 = f252457h
            r1.add(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r7.add(r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r7.add(r8)
            r7.add(r8)
            int r8 = r1.size()
            int r9 = r7.size()
            if (r8 == r9) goto L_0x00b5
            com.google.common.f.e r0 = f252451b
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "MessageParserUtil"
            r0.mo56378ag(r1, r5)
            java.lang.String r1 = "wrong sizes"
            r5 = 10896(0x2a90, float:1.5269E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r1)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x0153
        L_0x00b5:
            r8 = 0
        L_0x00b6:
            int r9 = r1.size()
            if (r8 >= r9) goto L_0x0127
            java.lang.Object r9 = r1.get(r8)
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r9 = (com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90388v) r9
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r10 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u.m146991a(r9, r4)
            java.lang.Object r12 = r7.get(r8)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r9.toString()
            if (r10 != 0) goto L_0x00d7
        L_0x00d5:
            r9 = r6
            goto L_0x011e
        L_0x00d7:
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r0 != 0) goto L_0x00df
            java.lang.CharSequence r9 = r11.f252440a
            if (r9 != 0) goto L_0x00e3
        L_0x00df:
            java.lang.CharSequence r9 = r10.f252440a
            r11.f252440a = r9
        L_0x00e3:
            java.lang.CharSequence r9 = r11.f252441b
            if (r9 == 0) goto L_0x0104
            java.lang.CharSequence r13 = r10.f252441b
            if (r13 == 0) goto L_0x0104
            java.lang.String r9 = r9.toString()
            java.lang.CharSequence r13 = r10.f252441b
            java.lang.String r13 = r13.toString()
            boolean r9 = r9.equals(r13)
            if (r9 != 0) goto L_0x0104
            if (r0 == 0) goto L_0x00d5
            if (r12 == 0) goto L_0x00d5
            java.lang.CharSequence r9 = r10.f252441b
            r11.f252441b = r9
            goto L_0x011d
        L_0x0104:
            java.lang.CharSequence r9 = r11.f252440a
            if (r9 == 0) goto L_0x00d5
            java.lang.CharSequence r9 = r10.f252440a
            if (r9 == 0) goto L_0x011d
            java.lang.String r9 = r9.toString()
            java.lang.CharSequence r10 = r11.f252440a
            java.lang.String r10 = r10.toString()
            boolean r9 = r9.startsWith(r10)
            if (r9 != 0) goto L_0x011d
            goto L_0x00d5
        L_0x011d:
            r9 = r11
        L_0x011e:
            if (r9 == 0) goto L_0x0124
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11 = r9
            goto L_0x0154
        L_0x0124:
            int r8 = r8 + 1
            goto L_0x00b6
        L_0x0127:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r0 = f252450a
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r0 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u.m146991a(r0, r5)
            if (r0 == 0) goto L_0x0153
            java.lang.CharSequence r1 = r11.f252441b
            if (r1 == 0) goto L_0x014a
            java.lang.CharSequence r5 = r0.f252441b
            if (r5 == 0) goto L_0x014a
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r5 = r0.f252441b
            java.lang.String r5 = r5.toString()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x014a
            goto L_0x0153
        L_0x014a:
            java.lang.CharSequence r1 = r11.f252442c
            if (r1 != 0) goto L_0x0154
            java.lang.CharSequence r0 = r0.f252442c
            r11.f252442c = r0
            goto L_0x0154
        L_0x0153:
            r11 = r6
        L_0x0154:
            if (r11 == 0) goto L_0x015e
            java.lang.CharSequence r0 = r11.f252440a
            if (r0 == 0) goto L_0x015e
            java.lang.CharSequence r0 = r11.f252441b
            if (r0 != 0) goto L_0x02b9
        L_0x015e:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r0 = f252454e
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r11 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u.m146991a(r0, r4)
            if (r11 == 0) goto L_0x016a
            goto L_0x02b9
        L_0x016a:
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r0 = f252455f
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.u r11 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u.m146991a(r0, r4)
            if (r11 == 0) goto L_0x02b8
            java.lang.CharSequence r0 = r11.f252440a
            if (r0 != 0) goto L_0x0178
            goto L_0x02b8
        L_0x0178:
            android.app.Notification r0 = r24.getNotification()
            androidx.core.app.ae r0 = androidx.core.app.C1788ae.m4919g(r0)
            if (r0 == 0) goto L_0x01e5
            java.lang.CharSequence r1 = r0.f5576c
            java.lang.String r1 = m146997d(r1)
            if (r1 == 0) goto L_0x019a
            java.lang.CharSequence r4 = r11.f252440a
            if (r4 == 0) goto L_0x019a
            java.lang.String r4 = r4.toString()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x019a
            r1 = 1
            goto L_0x019b
        L_0x019a:
            r1 = 0
        L_0x019b:
            androidx.core.app.at r4 = r0.f5575b
            java.lang.CharSequence r4 = r4.f5630a
            java.lang.String r4 = m146997d(r4)
            if (r4 == 0) goto L_0x01b5
            java.lang.CharSequence r5 = r11.f252440a
            if (r5 == 0) goto L_0x01b5
            java.lang.String r5 = r5.toString()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x01b5
            r4 = 1
            goto L_0x01b6
        L_0x01b5:
            r4 = 0
        L_0x01b6:
            r1 = r1 | r4
            java.util.List r0 = r0.f5574a
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L_0x01be:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01e7
            java.lang.Object r5 = r0.next()
            androidx.core.app.ad r5 = (androidx.core.app.C1787ad) r5
            java.lang.CharSequence r5 = r5.mo4994b()
            java.lang.String r5 = m146997d(r5)
            if (r5 == 0) goto L_0x01e2
            java.lang.CharSequence r7 = r11.f252441b
            java.lang.String r7 = r7.toString()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x01e2
            r5 = 1
            goto L_0x01e3
        L_0x01e2:
            r5 = 0
        L_0x01e3:
            r4 = r4 | r5
            goto L_0x01be
        L_0x01e5:
            r1 = 0
            r4 = 0
        L_0x01e7:
            android.app.Notification r0 = r24.getNotification()
            android.os.Bundle r5 = r0.extras
            if (r5 != 0) goto L_0x01f1
            r0 = r6
            goto L_0x01f9
        L_0x01f1:
            android.os.Bundle r0 = r0.extras
            java.lang.String r5 = "android.car.EXTENSIONS"
            android.os.Bundle r0 = r0.getBundle(r5)
        L_0x01f9:
            if (r0 == 0) goto L_0x0295
            java.lang.String r5 = "large_icon"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.String r5 = "app_color"
            r0.getInt(r5, r3)
            java.lang.String r5 = "car_conversation"
            android.os.Bundle r0 = r0.getBundle(r5)
            if (r0 != 0) goto L_0x0212
            goto L_0x0295
        L_0x0212:
            java.lang.String r5 = "messages"
            android.os.Parcelable[] r5 = r0.getParcelableArray(r5)
            if (r5 == 0) goto L_0x023a
            int r7 = r5.length
            java.lang.String[] r8 = new java.lang.String[r7]
            r9 = 0
        L_0x021e:
            if (r9 >= r7) goto L_0x0238
            r10 = r5[r9]
            boolean r12 = r10 instanceof android.os.Bundle
            if (r12 != 0) goto L_0x0228
            goto L_0x0295
        L_0x0228:
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.String r12 = "text"
            java.lang.String r10 = r10.getString(r12)
            r8[r9] = r10
            if (r10 != 0) goto L_0x0235
            goto L_0x0295
        L_0x0235:
            int r9 = r9 + 1
            goto L_0x021e
        L_0x0238:
            r13 = r8
            goto L_0x023b
        L_0x023a:
            r13 = r6
        L_0x023b:
            java.lang.String r5 = "on_read"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            java.lang.String r5 = "on_reply"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            r15 = r5
            android.app.PendingIntent r15 = (android.app.PendingIntent) r15
            java.lang.String r5 = "remote_input"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            android.app.RemoteInput r5 = (android.app.RemoteInput) r5
            java.lang.String r7 = "participants"
            java.lang.String[] r7 = r0.getStringArray(r7)
            if (r7 == 0) goto L_0x0295
            int r8 = r7.length
            if (r8 == r2) goto L_0x0260
            goto L_0x0295
        L_0x0260:
            if (r5 == 0) goto L_0x0285
            androidx.core.app.ba r8 = new androidx.core.app.ba
            java.lang.String r17 = r5.getResultKey()
            java.lang.CharSequence r18 = r5.getLabel()
            java.lang.CharSequence[] r19 = r5.getChoices()
            boolean r20 = r5.getAllowFreeFormInput()
            int r21 = r5.getEditChoicesBeforeSending()
            android.os.Bundle r22 = r5.getExtras()
            r23 = 0
            r16 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r14 = r8
            goto L_0x0286
        L_0x0285:
            r14 = r6
        L_0x0286:
            androidx.core.app.aa r5 = new androidx.core.app.aa
            java.lang.String r8 = "timestamp"
            long r17 = r0.getLong(r8)
            r12 = r5
            r16 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x0296
        L_0x0295:
            r5 = r6
        L_0x0296:
            if (r5 == 0) goto L_0x02b3
            java.lang.String r0 = r5.mo4985a()
            java.lang.String r0 = m146997d(r0)
            if (r0 == 0) goto L_0x02b1
            java.lang.CharSequence r5 = r11.f252440a
            if (r5 == 0) goto L_0x02b1
            java.lang.String r5 = r5.toString()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x02b1
            goto L_0x02b2
        L_0x02b1:
            r2 = 0
        L_0x02b2:
            r1 = r1 | r2
        L_0x02b3:
            if (r1 == 0) goto L_0x02b8
            if (r4 == 0) goto L_0x02b8
            goto L_0x02b9
        L_0x02b8:
            r11 = r6
        L_0x02b9:
            if (r11 == 0) goto L_0x02df
            java.lang.CharSequence r0 = r11.f252440a
            if (r0 == 0) goto L_0x02df
            java.lang.CharSequence r1 = r11.f252441b
            if (r1 != 0) goto L_0x02c4
            goto L_0x02df
        L_0x02c4:
            java.lang.String r0 = r0.toString()
            boolean r0 = com.google.common.base.C58837ba.m90859h(r0)
            if (r0 != 0) goto L_0x02dc
            java.lang.CharSequence r0 = r11.f252441b
            java.lang.String r0 = r0.toString()
            boolean r0 = com.google.common.base.C58837ba.m90859h(r0)
            if (r0 == 0) goto L_0x02db
            goto L_0x02dc
        L_0x02db:
            return r11
        L_0x02dc:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r6
        L_0x02df:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146995b(android.service.notification.StatusBarNotification, com.google.android.apps.gsa.shared.notificationlistening.collection.a.o):com.google.android.apps.gsa.shared.notificationlistening.collection.a.u");
    }

    /* renamed from: c */
    public static C90390x m146996c() {
        return new C90386t();
    }

    /* renamed from: d */
    public static String m146997d(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i = 0;
        while (i < charSequence.length() && m147001h(charSequence.charAt(i))) {
            i++;
        }
        while (length > i) {
            int i2 = length - 1;
            if (!m147001h(charSequence.charAt(i2))) {
                break;
            }
            length = i2;
        }
        return charSequence.subSequence(i, length).toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x010a A[EDGE_INSN: B:129:0x010a->B:43:0x010a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cd  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m146998e(android.content.Context r28, com.google.android.apps.gsa.shared.bisto.C89656k r29, com.google.android.libraries.p1730f.C21370a r30, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af r31, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o r32, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u r33, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90390x r34, boolean r35) {
        /*
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            java.lang.CharSequence r8 = r5.f252440a
            if (r8 != 0) goto L_0x001e
            java.lang.String r0 = "no group"
            com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(r0)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x001e:
            android.service.notification.StatusBarNotification r9 = r3.f252393a
            android.app.Notification r9 = r9.getNotification()
            androidx.core.app.ae r9 = androidx.core.app.C1788ae.m4919g(r9)
            java.lang.String r10 = "msg"
            if (r9 == 0) goto L_0x0112
            android.service.notification.StatusBarNotification r13 = r3.f252393a
            android.app.Notification r14 = r13.getNotification()
            androidx.core.app.s r14 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146964c(r14)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.List r12 = r9.f5574a
            int r12 = r12.size()
            int r12 = r12 + -1
        L_0x0043:
            if (r12 < 0) goto L_0x010a
            java.util.List r11 = r9.f5574a
            java.lang.Object r11 = r11.get(r12)
            androidx.core.app.ad r11 = (androidx.core.app.C1787ad) r11
            if (r11 != 0) goto L_0x0056
        L_0x004f:
            r17 = r9
            r16 = r12
            r5 = r13
            goto L_0x00ff
        L_0x0056:
            java.lang.CharSequence r16 = r11.mo4994b()
            if (r16 == 0) goto L_0x004f
            r17 = r9
            java.lang.CharSequence r9 = r11.f5568a
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.w r9 = r6.mo84088a(r0, r9)
            if (r4 != 0) goto L_0x0068
            r5 = 0
            goto L_0x0074
        L_0x0068:
            java.lang.String r5 = r16.toString()
            java.util.Map r6 = r4.f252425e
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
        L_0x0074:
            if (r5 != 0) goto L_0x0096
            java.lang.String r5 = r16.toString()
            java.lang.String r5 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146969h(r0, r5, r7)
            if (r4 == 0) goto L_0x0096
            if (r7 == 0) goto L_0x0096
            r6 = 154(0x9a, float:2.16E-43)
            boolean r6 = r1.mo83555j(r6)
            if (r6 != 0) goto L_0x0096
            java.lang.String r6 = r16.toString()
            r16 = r12
            java.util.Map r12 = r4.f252425e
            r12.put(r6, r5)
            goto L_0x0098
        L_0x0096:
            r16 = r12
        L_0x0098:
            com.google.android.apps.gsa.shared.notificationlistening.common.j r6 = new com.google.android.apps.gsa.shared.notificationlistening.common.j
            r6.<init>(r2)
            r6.f252620q = r8
            if (r9 != 0) goto L_0x00a3
            r12 = 0
            goto L_0x00a5
        L_0x00a3:
            java.lang.CharSequence r12 = r9.f252448a
        L_0x00a5:
            r6.f252622s = r12
            r6.f252615D = r5
            r6.mo84160c(r14)
            android.app.Notification r5 = r13.getNotification()
            androidx.core.app.s r5 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146963b(r5)
            r6.mo84159b(r5)
            android.app.Notification r5 = r13.getNotification()
            r6.f252614C = r5
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146971j(r0, r1, r3, r4, r6)
            java.lang.String r5 = r13.getKey()
            java.lang.String r12 = r8.toString()
            r6.mo84143a(r5, r12)
            r6.f252568e = r10
            r5 = r13
            long r12 = r11.f5569b
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r6.f252578o = r12
            java.lang.String r12 = r11.f5571d
            if (r12 != 0) goto L_0x00e3
            if (r9 != 0) goto L_0x00de
            r9 = 0
            goto L_0x00e0
        L_0x00de:
            java.lang.String r9 = r9.f252449b
        L_0x00e0:
            r6.f252623t = r9
            goto L_0x00e5
        L_0x00e3:
            r6.f252623t = r12
        L_0x00e5:
            if (r12 == 0) goto L_0x00f3
            java.lang.String r9 = "audio/"
            boolean r9 = r12.startsWith(r9)
            if (r9 == 0) goto L_0x00f3
            android.net.Uri r9 = r11.f5572e
            r6.f252567d = r9
        L_0x00f3:
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r9 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            r9.<init>(r6)
            r6 = 0
            r15.add(r6, r9)
            if (r7 != 0) goto L_0x00ff
            goto L_0x010a
        L_0x00ff:
            int r12 = r16 + -1
            r6 = r34
            r13 = r5
            r9 = r17
            r5 = r33
            goto L_0x0043
        L_0x010a:
            boolean r5 = r15.isEmpty()
            if (r5 == 0) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            return r15
        L_0x0112:
            android.service.notification.StatusBarNotification r5 = r3.f252393a
            android.app.Notification r5 = r5.getNotification()
            android.os.Bundle r6 = r5.extras
            if (r6 != 0) goto L_0x011e
            r5 = 0
            goto L_0x0126
        L_0x011e:
            android.os.Bundle r5 = r5.extras
            java.lang.String r6 = "android.car.EXTENSIONS"
            android.os.Bundle r5 = r5.getBundle(r6)
        L_0x0126:
            r6 = 1
            if (r5 == 0) goto L_0x01ca
            java.lang.String r9 = "large_icon"
            android.os.Parcelable r9 = r5.getParcelable(r9)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.lang.String r9 = "app_color"
            r11 = 0
            r5.getInt(r9, r11)
            java.lang.String r9 = "car_conversation"
            android.os.Bundle r5 = r5.getBundle(r9)
            if (r5 != 0) goto L_0x0141
            goto L_0x01ca
        L_0x0141:
            java.lang.String r9 = "messages"
            android.os.Parcelable[] r9 = r5.getParcelableArray(r9)
            if (r9 == 0) goto L_0x016a
            int r11 = r9.length
            java.lang.String[] r12 = new java.lang.String[r11]
            r13 = 0
        L_0x014d:
            if (r13 >= r11) goto L_0x0167
            r14 = r9[r13]
            boolean r15 = r14 instanceof android.os.Bundle
            if (r15 != 0) goto L_0x0157
            goto L_0x01ca
        L_0x0157:
            android.os.Bundle r14 = (android.os.Bundle) r14
            java.lang.String r15 = "text"
            java.lang.String r14 = r14.getString(r15)
            r12[r13] = r14
            if (r14 != 0) goto L_0x0164
            goto L_0x01ca
        L_0x0164:
            int r13 = r13 + 1
            goto L_0x014d
        L_0x0167:
            r17 = r12
            goto L_0x016c
        L_0x016a:
            r17 = 0
        L_0x016c:
            java.lang.String r9 = "on_read"
            android.os.Parcelable r9 = r5.getParcelable(r9)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            java.lang.String r9 = "on_reply"
            android.os.Parcelable r9 = r5.getParcelable(r9)
            r19 = r9
            android.app.PendingIntent r19 = (android.app.PendingIntent) r19
            java.lang.String r9 = "remote_input"
            android.os.Parcelable r9 = r5.getParcelable(r9)
            android.app.RemoteInput r9 = (android.app.RemoteInput) r9
            java.lang.String r11 = "participants"
            java.lang.String[] r11 = r5.getStringArray(r11)
            if (r11 == 0) goto L_0x01ca
            int r12 = r11.length
            if (r12 == r6) goto L_0x0192
            goto L_0x01ca
        L_0x0192:
            if (r9 == 0) goto L_0x01b8
            androidx.core.app.ba r12 = new androidx.core.app.ba
            java.lang.String r21 = r9.getResultKey()
            java.lang.CharSequence r22 = r9.getLabel()
            java.lang.CharSequence[] r23 = r9.getChoices()
            boolean r24 = r9.getAllowFreeFormInput()
            int r25 = r9.getEditChoicesBeforeSending()
            android.os.Bundle r26 = r9.getExtras()
            r27 = 0
            r20 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r18 = r12
            goto L_0x01ba
        L_0x01b8:
            r18 = 0
        L_0x01ba:
            androidx.core.app.aa r9 = new androidx.core.app.aa
            java.lang.String r12 = "timestamp"
            long r21 = r5.getLong(r12)
            r16 = r9
            r20 = r11
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x01cb
        L_0x01ca:
            r9 = 0
        L_0x01cb:
            if (r9 == 0) goto L_0x0283
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            android.service.notification.StatusBarNotification r12 = r3.f252393a
            android.app.Notification r13 = r12.getNotification()
            androidx.core.app.s r13 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146964c(r13)
            java.lang.String[] r14 = r9.f5562a
            int r14 = r14.length
            int r14 = r14 + -1
        L_0x01e1:
            if (r14 < 0) goto L_0x027b
            java.lang.String[] r15 = r9.f5562a
            r15 = r15[r14]
            if (r15 != 0) goto L_0x01ee
        L_0x01e9:
            r2 = r12
            r5 = r13
            r6 = 0
            goto L_0x0272
        L_0x01ee:
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r16 = f252450a
            java.util.regex.Pattern r5 = r16.mo84089a()
            java.util.regex.Matcher r5 = r5.matcher(r15)
            boolean r15 = r5.matches()
            if (r15 == 0) goto L_0x01e9
            java.lang.String r15 = r5.group(r6)
            r6 = 2
            java.lang.String r5 = r5.group(r6)
            boolean r6 = com.google.common.base.C58837ba.m90859h(r15)
            if (r6 != 0) goto L_0x01e9
            boolean r6 = com.google.common.base.C58837ba.m90859h(r5)
            if (r6 != 0) goto L_0x01e9
            r6 = r34
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.w r5 = r6.mo84088a(r0, r5)
            com.google.android.apps.gsa.shared.notificationlistening.common.j r6 = new com.google.android.apps.gsa.shared.notificationlistening.common.j
            r6.<init>(r2)
            r6.f252620q = r8
            if (r5 != 0) goto L_0x0224
            r2 = 0
            goto L_0x0226
        L_0x0224:
            java.lang.CharSequence r2 = r5.f252448a
        L_0x0226:
            r6.f252622s = r2
            if (r5 != 0) goto L_0x022c
            r2 = 0
            goto L_0x022e
        L_0x022c:
            java.lang.String r2 = r5.f252449b
        L_0x022e:
            r6.f252623t = r2
            java.lang.String r2 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146969h(r0, r15, r7)
            r6.f252615D = r2
            r6.mo84160c(r13)
            android.app.Notification r2 = r12.getNotification()
            androidx.core.app.s r2 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146963b(r2)
            r6.mo84159b(r2)
            android.app.Notification r2 = r12.getNotification()
            r6.f252614C = r2
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146971j(r0, r1, r3, r4, r6)
            java.lang.String r2 = r12.getKey()
            java.lang.String r5 = r8.toString()
            r6.mo84143a(r2, r5)
            r6.f252568e = r10
            r2 = r12
            r5 = r13
            if (r14 != 0) goto L_0x0266
            long r12 = r9.f5565d
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r6.f252578o = r12
        L_0x0266:
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r12 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            r12.<init>(r6)
            r6 = 0
            r11.add(r6, r12)
            if (r7 != 0) goto L_0x0272
            goto L_0x027b
        L_0x0272:
            int r14 = r14 + -1
            r12 = r2
            r13 = r5
            r6 = 1
            r2 = r30
            goto L_0x01e1
        L_0x027b:
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0282
            goto L_0x0283
        L_0x0282:
            return r11
        L_0x0283:
            r2 = r33
            java.lang.CharSequence r5 = r2.f252441b
            if (r5 == 0) goto L_0x0336
            java.lang.CharSequence r5 = r2.f252440a
            if (r5 != 0) goto L_0x0293
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0335
        L_0x0293:
            android.service.notification.StatusBarNotification r6 = r3.f252393a
            android.app.Notification r8 = r6.getNotification()
            androidx.core.app.s r8 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146964c(r8)
            java.lang.CharSequence r9 = r2.f252442c
            if (r9 != 0) goto L_0x02d9
            android.app.Notification r9 = r6.getNotification()
            android.os.Bundle r9 = r9.extras
            java.lang.String r11 = "android.text"
            java.lang.CharSequence r9 = r9.getCharSequence(r11)
            if (r9 != 0) goto L_0x02b7
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0335
        L_0x02b7:
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.v r11 = f252450a
            java.util.regex.Pattern r11 = r11.mo84089a()
            java.util.regex.Matcher r9 = r11.matcher(r9)
            boolean r11 = r9.matches()
            if (r11 != 0) goto L_0x02ce
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0335
        L_0x02ce:
            r11 = 2
            java.lang.String r9 = r9.group(r11)
            java.lang.String r9 = m146997d(r9)
            r2.f252442c = r9
        L_0x02d9:
            java.lang.CharSequence r9 = r2.f252442c
            r11 = r34
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.w r9 = r11.mo84088a(r0, r9)
            com.google.android.apps.gsa.shared.notificationlistening.common.j r11 = new com.google.android.apps.gsa.shared.notificationlistening.common.j
            r12 = r30
            r11.<init>(r12)
            java.lang.CharSequence r12 = r2.f252440a
            r11.f252620q = r12
            if (r9 != 0) goto L_0x02f0
            r12 = 0
            goto L_0x02f2
        L_0x02f0:
            java.lang.CharSequence r12 = r9.f252448a
        L_0x02f2:
            r11.f252622s = r12
            if (r9 != 0) goto L_0x02f8
            r12 = 0
            goto L_0x02fa
        L_0x02f8:
            java.lang.String r12 = r9.f252449b
        L_0x02fa:
            r11.f252623t = r12
            java.lang.CharSequence r2 = r2.f252441b
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146969h(r0, r2, r7)
            r11.f252615D = r2
            r11.mo84160c(r8)
            android.app.Notification r2 = r6.getNotification()
            androidx.core.app.s r2 = com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146963b(r2)
            r11.mo84159b(r2)
            android.app.Notification r2 = r6.getNotification()
            r11.f252614C = r2
            com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146971j(r0, r1, r3, r4, r11)
            java.lang.String r0 = r6.getKey()
            java.lang.String r1 = r5.toString()
            r11.mo84143a(r0, r1)
            r11.f252568e = r10
            com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification r0 = new com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification
            r0.<init>(r11)
            java.util.List r0 = java.util.Collections.singletonList(r0)
        L_0x0335:
            return r0
        L_0x0336:
            com.google.common.f.e r0 = f252451b
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "MessageParserUtil"
            r0.mo56378ag(r1, r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 10904(0x2a98, float:1.528E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "Failed to parse group notification. snd[%s]"
            android.service.notification.StatusBarNotification r2 = r3.f252393a
            r0.mo56389s(r1, r2)
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y.m146998e(android.content.Context, com.google.android.apps.gsa.shared.bisto.k, com.google.android.libraries.f.a, com.google.android.apps.gsa.shared.notificationlistening.collection.a.af, com.google.android.apps.gsa.shared.notificationlistening.collection.a.o, com.google.android.apps.gsa.shared.notificationlistening.collection.a.u, com.google.android.apps.gsa.shared.notificationlistening.collection.a.x, boolean):java.util.List");
    }

    /* renamed from: f */
    public static List m146999f(Context context, C89656k kVar, C21370a aVar, C90367af afVar, C90381o oVar, int i, C60242lp lpVar, boolean z) {
        StatusBarNotification statusBarNotification = afVar.f252393a;
        Bundle bundle = statusBarNotification.getNotification().extras;
        CharSequence charSequence = bundle.getCharSequence("android.title");
        CharSequence charSequence2 = bundle.getCharSequence("android.text");
        if (charSequence == null || charSequence2 == null) {
            C58976aa aaVar = C58975e.f156826a;
            C90366ae.m146974m(lpVar, i, Collections.singletonList(C60244lr.NO_EXTRA_TITLE_OR_EXTRA_TEXT));
            return Collections.emptyList();
        }
        C90429j jVar = new C90429j(aVar);
        C90366ae.m146971j(context, kVar, afVar, oVar, jVar);
        C90366ae.m146975n(kVar);
        jVar.f252615D = C90366ae.m146967f(context, charSequence.toString(), z);
        if (charSequence2.length() == 0) {
            jVar.f252622s = context.getString(R.string.blank_message_content);
        } else {
            jVar.f252626w = charSequence2;
            jVar.f252622s = charSequence2;
            jVar.f252623t = "text/plain";
        }
        if (statusBarNotification.getNotification().when > 0 && statusBarNotification.getNotification().when < statusBarNotification.getPostTime()) {
            jVar.f252578o = Long.valueOf(statusBarNotification.getNotification().when);
        }
        jVar.f252568e = "msg";
        jVar.mo84160c(C90366ae.m146964c(statusBarNotification.getNotification()));
        jVar.mo84159b(C90366ae.m146963b(statusBarNotification.getNotification()));
        jVar.f252614C = statusBarNotification.getNotification();
        CharSequence charSequence3 = jVar.f252615D;
        if (charSequence3 != null) {
            jVar.mo84143a(C90366ae.m146966e(statusBarNotification), charSequence3.toString());
        }
        return Collections.singletonList(new MessageNotification(jVar));
    }

    /* renamed from: g */
    private static boolean m147000g(String str, CharSequence charSequence) {
        if (charSequence == null) {
            return str == null;
        }
        return charSequence.toString().equals(str);
    }

    /* renamed from: h */
    private static boolean m147001h(char c) {
        return Character.isWhitespace(c) || c == 8239 || c == 8199 || c == 160;
    }
}
