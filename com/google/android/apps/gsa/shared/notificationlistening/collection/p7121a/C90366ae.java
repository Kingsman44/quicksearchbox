package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.telephony.PhoneNumberUtils;
import android.util.Patterns;
import android.view.SurfaceHolder;
import androidx.core.app.C1788ae;
import androidx.core.app.C1791ah;
import androidx.core.app.C1832s;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.notification.p2711b.C34866n;
import com.google.common.base.C58832aw;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60242lp;
import com.google.common.p4552o.C60244lr;
import com.google.common.p4552o.C60246lt;
import com.google.common.p4552o.C60247lu;
import com.google.common.p4552o.C60250lx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.lang.Character;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.ae */
/* compiled from: PG */
public final class C90366ae {

    /* renamed from: a */
    private static final Pattern f252392a = Pattern.compile("[☀-⟿]|[🀀-𠏿]");

    /* renamed from: a */
    public static Icon m146962a(Notification notification, Context context) {
        Icon b;
        Icon largeIcon = notification.getLargeIcon();
        if (largeIcon != null) {
            C58976aa aaVar = C58975e.f156826a;
            return largeIcon;
        }
        C1788ae g = C1788ae.m4919g(notification);
        if (g == null || (b = C34866n.m63623b(g, context)) == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            return null;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        return b;
    }

    /* renamed from: b */
    public static C1832s m146963b(Notification notification) {
        int a = C1791ah.m4933a(notification);
        for (int i = 0; i < a; i++) {
            C1832s b = C1791ah.m4934b(notification.actions[i]);
            if (b.f5658e == 2) {
                C58976aa aaVar = C58975e.f156826a;
                return b;
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.app.C1832s m146964c(android.app.Notification r21) {
        /*
            r0 = r21
            androidx.core.app.ag r1 = new androidx.core.app.ag
            r1.<init>(r0)
            java.util.ArrayList r1 = r1.f5583a
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r1.next()
            androidx.core.app.s r2 = (androidx.core.app.C1832s) r2
            com.google.android.apps.gsa.shared.bisto.p7029b.C89632c.m145885c(r2)
            boolean r3 = com.google.android.apps.gsa.shared.bisto.p7029b.C89632c.m145883a(r2)
            if (r3 == 0) goto L_0x000d
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r2
        L_0x0025:
            int r1 = androidx.core.app.C1791ah.m4933a(r21)
            r2 = 0
            r3 = 0
        L_0x002b:
            r4 = 1
            if (r3 >= r1) goto L_0x0040
            android.app.Notification$Action[] r5 = r0.actions
            r5 = r5[r3]
            androidx.core.app.s r5 = androidx.core.app.C1791ah.m4934b(r5)
            int r6 = r5.f5658e
            if (r6 != r4) goto L_0x003d
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r5
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x0040:
            android.os.Bundle r1 = r0.extras
            r3 = 0
            if (r1 != 0) goto L_0x0047
            r0 = r3
            goto L_0x004f
        L_0x0047:
            android.os.Bundle r0 = r0.extras
            java.lang.String r1 = "android.car.EXTENSIONS"
            android.os.Bundle r0 = r0.getBundle(r1)
        L_0x004f:
            if (r0 == 0) goto L_0x00e8
            java.lang.String r1 = "large_icon"
            android.os.Parcelable r1 = r0.getParcelable(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.String r1 = "app_color"
            r0.getInt(r1, r2)
            java.lang.String r1 = "car_conversation"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 != 0) goto L_0x0068
            goto L_0x00e8
        L_0x0068:
            java.lang.String r1 = "messages"
            android.os.Parcelable[] r1 = r0.getParcelableArray(r1)
            if (r1 == 0) goto L_0x0090
            int r5 = r1.length
            java.lang.String[] r6 = new java.lang.String[r5]
            r7 = 0
        L_0x0074:
            if (r7 >= r5) goto L_0x008e
            r8 = r1[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 != 0) goto L_0x007e
            goto L_0x00e8
        L_0x007e:
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r9 = "text"
            java.lang.String r8 = r8.getString(r9)
            r6[r7] = r8
            if (r8 != 0) goto L_0x008b
            goto L_0x00e8
        L_0x008b:
            int r7 = r7 + 1
            goto L_0x0074
        L_0x008e:
            r9 = r6
            goto L_0x0091
        L_0x0090:
            r9 = r3
        L_0x0091:
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
            java.lang.String r5 = "participants"
            java.lang.String[] r12 = r0.getStringArray(r5)
            if (r12 == 0) goto L_0x00e8
            int r5 = r12.length
            if (r5 == r4) goto L_0x00b6
            goto L_0x00e8
        L_0x00b6:
            if (r1 == 0) goto L_0x00da
            androidx.core.app.ba r4 = new androidx.core.app.ba
            java.lang.String r14 = r1.getResultKey()
            java.lang.CharSequence r15 = r1.getLabel()
            java.lang.CharSequence[] r16 = r1.getChoices()
            boolean r17 = r1.getAllowFreeFormInput()
            int r18 = r1.getEditChoicesBeforeSending()
            android.os.Bundle r19 = r1.getExtras()
            r20 = 0
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r10 = r4
            goto L_0x00db
        L_0x00da:
            r10 = r3
        L_0x00db:
            androidx.core.app.aa r1 = new androidx.core.app.aa
            java.lang.String r4 = "timestamp"
            long r13 = r0.getLong(r4)
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00e9
        L_0x00e8:
            r1 = r3
        L_0x00e9:
            if (r1 == 0) goto L_0x0105
            android.app.PendingIntent r0 = r1.f5564c
            if (r0 == 0) goto L_0x0105
            androidx.core.app.ba r4 = r1.f5563b
            if (r4 != 0) goto L_0x00f4
            goto L_0x0105
        L_0x00f4:
            androidx.core.app.r r4 = new androidx.core.app.r
            java.lang.String r5 = "reply"
            r4.<init>(r2, r5, r0)
            androidx.core.app.ba r0 = r1.f5563b
            r4.mo5009b(r0)
            androidx.core.app.s r0 = r4.mo5008a()
            goto L_0x0106
        L_0x0105:
            r0 = r3
        L_0x0106:
            if (r0 == 0) goto L_0x010b
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r0
        L_0x010b:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146964c(android.app.Notification):androidx.core.app.s");
    }

    /* renamed from: d */
    public static String m146965d(Notification notification, C90381o oVar) {
        String str = notification.category;
        return (str != null || oVar == null) ? str : oVar.f252422b;
    }

    /* renamed from: e */
    public static String m146966e(StatusBarNotification statusBarNotification) {
        return statusBarNotification.getKey();
    }

    /* renamed from: f */
    public static String m146967f(Context context, String str, boolean z) {
        String i = m146970i(context, str, z);
        return i == null ? str : i;
    }

    /* renamed from: g */
    public static String m146968g(Context context, String str) {
        String a = C90379m.m146982a(context, str);
        if (!C58837ba.m90859h(a)) {
            return a;
        }
        if (str.startsWith("mailto:")) {
            return context.getString(R.string.unknown_email);
        }
        if (str.startsWith("tel:")) {
            return context.getString(R.string.unknown_phone_number);
        }
        return context.getString(R.string.unknown_sender);
    }

    /* renamed from: h */
    public static String m146969h(Context context, String str, boolean z) {
        String i = m146970i(context, str, z);
        if (i != null) {
            return i;
        }
        String trim = f252392a.matcher(str).replaceAll(BuildConfig.FLAVOR).replaceAll("[@?]", BuildConfig.FLAVOR).replaceAll("\\s{2,}", " ").trim();
        int length = trim.length();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i2 >= trim.length()) {
                break;
            }
            char charAt = trim.charAt(i2);
            if (z2) {
                if (!(charAt == '-' || Character.isLetterOrDigit(charAt) || Character.getType(charAt) == 12 || Character.getType(charAt) == 6 || C58832aw.m90831a(Character.UnicodeBlock.of(charAt), Character.UnicodeBlock.DEVANAGARI))) {
                    length = i2;
                    break;
                }
            } else if (Character.isLetterOrDigit(charAt)) {
                z2 = true;
                i3 = i2;
            }
            i2++;
        }
        if (!z2 || length <= i3) {
            return null;
        }
        C58976aa aaVar = C58975e.f156826a;
        return trim.substring(i3, length).trim();
    }

    /* renamed from: i */
    static String m146970i(Context context, String str, boolean z) {
        String formatNumber;
        if (str == null) {
            return null;
        }
        Matcher matcher = Patterns.PHONE.matcher(str);
        if (!matcher.find() || (formatNumber = PhoneNumberUtils.formatNumber(matcher.group(), Locale.getDefault().getCountry())) == null) {
            return null;
        }
        String a = C90379m.m146982a(context, "tel:".concat(formatNumber));
        if (a == null) {
            return z ? context.getString(R.string.unknown_phone_number) : formatNumber;
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m146971j(android.content.Context r5, com.google.android.apps.gsa.shared.bisto.C89656k r6, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af r7, com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o r8, com.google.android.apps.gsa.shared.notificationlistening.common.C90420a r9) {
        /*
            android.service.notification.StatusBarNotification r0 = r7.f252393a
            android.app.Notification r1 = r0.getNotification()
            java.lang.String r2 = r0.getPackageName()
            r3 = 2132093336(0x7f152998, float:1.9827094E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.String r2 = com.google.android.apps.gsa.shared.bisto.p7029b.C89641l.m145913b(r5, r2, r3)
            if (r2 == 0) goto L_0x0019
            r9.f252565b = r2
        L_0x0019:
            java.lang.String r2 = m146965d(r1, r8)
            r9.f252568e = r2
            if (r8 != 0) goto L_0x0023
            r2 = 0
            goto L_0x0025
        L_0x0023:
            android.net.Uri r2 = r8.f252423c
        L_0x0025:
            android.net.Uri r3 = r7.f252395c
            android.net.Uri r4 = r1.sound
            boolean r4 = m146972k(r5, r6, r4)
            if (r4 == 0) goto L_0x0034
            android.net.Uri r5 = r1.sound
            r9.f252569f = r5
            goto L_0x0049
        L_0x0034:
            if (r3 == 0) goto L_0x003f
            boolean r4 = m146972k(r5, r6, r3)
            if (r4 == 0) goto L_0x003f
            r9.f252569f = r3
            goto L_0x0049
        L_0x003f:
            if (r2 == 0) goto L_0x0049
            boolean r5 = m146972k(r5, r6, r2)
            if (r5 == 0) goto L_0x0049
            r9.f252569f = r2
        L_0x0049:
            java.lang.Integer r5 = r7.f252394b
            r6 = 0
            r7 = 2
            r2 = 1
            if (r8 == 0) goto L_0x006f
            int r3 = r8.f252424d
            if (r3 == r2) goto L_0x005d
            if (r3 != r7) goto L_0x006f
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.p r3 = r8.f252427g
            boolean r3 = r3.f252433d
            if (r3 != 0) goto L_0x006f
            r3 = 2
        L_0x005d:
            if (r3 != r7) goto L_0x006c
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.p r3 = r8.f252427g
            boolean r3 = r3.f252433d
            if (r3 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.notificationlistening.collection.a.p r5 = r8.f252427g
            r5.f252433d = r2
        L_0x006c:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0093
        L_0x006f:
            if (r5 == 0) goto L_0x007a
            int r5 = r5.intValue()
            r3 = 3
            if (r5 >= r3) goto L_0x007a
        L_0x0078:
            r5 = 0
            goto L_0x0094
        L_0x007a:
            java.lang.String r5 = r1.getGroup()
            if (r5 == 0) goto L_0x0093
            boolean r5 = androidx.core.app.C1791ah.m4935c(r1)
            if (r5 == 0) goto L_0x008d
            int r5 = r1.getGroupAlertBehavior()
            if (r5 == r7) goto L_0x0078
            goto L_0x0093
        L_0x008d:
            int r5 = r1.getGroupAlertBehavior()
            if (r5 == r2) goto L_0x0078
        L_0x0093:
            r5 = 1
        L_0x0094:
            r9.f252571h = r5
            com.google.android.apps.gsa.shared.notificationlistening.common.GroupDataKey r5 = com.google.android.apps.gsa.shared.notificationlistening.common.GroupDataKey.m147083a(r0)
            r9.f252572i = r5
            java.lang.String r5 = r0.getPackageName()
            r9.f252575l = r5
            long r3 = r0.getPostTime()
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r9.f252576m = r5
            java.lang.String r5 = r0.getKey()
            r9.f252573j = r5
            if (r8 == 0) goto L_0x00b5
            r6 = 1
        L_0x00b5:
            r9.f252566c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae.m146971j(android.content.Context, com.google.android.apps.gsa.shared.bisto.k, com.google.android.apps.gsa.shared.notificationlistening.collection.a.af, com.google.android.apps.gsa.shared.notificationlistening.collection.a.o, com.google.android.apps.gsa.shared.notificationlistening.common.a):void");
    }

    /* renamed from: k */
    public static boolean m146972k(Context context, C89656k kVar, Uri uri) {
        if (uri == null) {
            return false;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || !lastPathSegment.endsWith(".flac")) {
            try {
                MediaPlayer create = MediaPlayer.create(context, uri, (SurfaceHolder) null, new AudioAttributes.Builder().setLegacyStreamType(3).build(), ((AudioManager) context.getSystemService("audio")).generateAudioSessionId());
                if (create != null) {
                    create.release();
                } else if (kVar.mo83556k()) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    C58976aa aaVar2 = C58975e.f156826a;
                }
                if (create != null) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                C58976aa aaVar3 = C58975e.f156826a;
                return false;
            }
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m146973l(Notification notification) {
        return (notification.defaults & 2) != 0;
    }

    /* renamed from: m */
    public static void m146974m(C60242lp lpVar, int i, List list) {
        C60246lt ltVar = (C60246lt) C60247lu.f163014e.createBuilder();
        ltVar.copyOnWrite();
        C60247lu luVar = (C60247lu) ltVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            luVar.f163017b = i2;
            luVar.f163016a |= 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C60244lr lrVar = (C60244lr) it.next();
                ltVar.copyOnWrite();
                C60247lu luVar2 = (C60247lu) ltVar.instance;
                lrVar.getClass();
                C62961ch chVar = luVar2.f163018c;
                if (!chVar.mo58948c()) {
                    luVar2.f163018c = C62942bv.mutableCopy(chVar);
                }
                luVar2.f163018c.mo58916g(lrVar.f163012g);
            }
            lpVar.copyOnWrite();
            C60250lx lxVar = (C60250lx) lpVar.instance;
            C60247lu luVar3 = (C60247lu) ltVar.build();
            C60250lx lxVar2 = C60250lx.f163020b;
            luVar3.getClass();
            C62971cq cqVar = lxVar.f163022a;
            if (!cqVar.mo58948c()) {
                lxVar.f163022a = C62942bv.mutableCopy(cqVar);
            }
            lxVar.f163022a.add(luVar3);
            return;
        }
        throw null;
    }

    /* renamed from: n */
    public static void m146975n(C89656k kVar) {
        if (kVar.mo83556k()) {
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
