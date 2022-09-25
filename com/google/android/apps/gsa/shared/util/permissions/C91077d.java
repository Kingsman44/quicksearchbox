package com.google.android.apps.gsa.shared.util.permissions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Process;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.permissions.p7179a.C91074a;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.permissions.d */
/* compiled from: PG */
public final class C91077d implements C90991b {

    /* renamed from: a */
    public static final C59071e f254354a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.permissions.d");

    /* renamed from: b */
    public final Context f254355b;

    /* renamed from: c */
    public final C91074a f254356c;

    public C91077d(Context context, C91022f fVar, C91074a aVar) {
        this.f254355b = context;
        this.f254356c = aVar;
        fVar.mo85301a(this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.apps.gsa.p8852u.C118571d m148793a(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -2078357533: goto L_0x0154;
                case -2062386608: goto L_0x0149;
                case -1928411001: goto L_0x013e;
                case -1921431796: goto L_0x0133;
                case -1888586689: goto L_0x0129;
                case -1573809616: goto L_0x011f;
                case -1561629405: goto L_0x0114;
                case -1479758289: goto L_0x0109;
                case -1238066820: goto L_0x00ff;
                case -895679497: goto L_0x00f4;
                case -895673731: goto L_0x00e8;
                case -406040016: goto L_0x00dc;
                case -63024214: goto L_0x00d1;
                case -5573545: goto L_0x00c5;
                case 52602690: goto L_0x00b9;
                case 112197485: goto L_0x00ae;
                case 175802396: goto L_0x00a2;
                case 214526995: goto L_0x0096;
                case 463403621: goto L_0x008b;
                case 603653886: goto L_0x007f;
                case 610633091: goto L_0x0073;
                case 691260818: goto L_0x0067;
                case 710297143: goto L_0x005b;
                case 784519842: goto L_0x004f;
                case 952819282: goto L_0x0043;
                case 1271781903: goto L_0x0038;
                case 1365911975: goto L_0x002c;
                case 1831139720: goto L_0x0020;
                case 1977429404: goto L_0x0014;
                case 2133799037: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x015f
        L_0x0009:
            java.lang.String r0 = "com.android.voicemail.permission.ADD_VOICEMAIL"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 2
            goto L_0x0160
        L_0x0014:
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 11
            goto L_0x0160
        L_0x0020:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 21
            goto L_0x0160
        L_0x002c:
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 28
            goto L_0x0160
        L_0x0038:
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 6
            goto L_0x0160
        L_0x0043:
            java.lang.String r0 = "android.permission.PROCESS_OUTGOING_CALLS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 8
            goto L_0x0160
        L_0x004f:
            java.lang.String r0 = "android.permission.USE_SIP"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 24
            goto L_0x0160
        L_0x005b:
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 15
            goto L_0x0160
        L_0x0067:
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 13
            goto L_0x0160
        L_0x0073:
            java.lang.String r0 = "android.permission.WRITE_CALL_LOG"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 26
            goto L_0x0160
        L_0x007f:
            java.lang.String r0 = "android.permission.WRITE_CALENDAR"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 25
            goto L_0x0160
        L_0x008b:
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 5
            goto L_0x0160
        L_0x0096:
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 27
            goto L_0x0160
        L_0x00a2:
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 14
            goto L_0x0160
        L_0x00ae:
            java.lang.String r0 = "android.permission.CALL_PHONE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 4
            goto L_0x0160
        L_0x00b9:
            java.lang.String r0 = "android.permission.SEND_SMS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 22
            goto L_0x0160
        L_0x00c5:
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 16
            goto L_0x0160
        L_0x00d1:
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 0
            goto L_0x0160
        L_0x00dc:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 12
            goto L_0x0160
        L_0x00e8:
            java.lang.String r0 = "android.permission.RECEIVE_SMS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 19
            goto L_0x0160
        L_0x00f4:
            java.lang.String r0 = "android.permission.RECEIVE_MMS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 18
            goto L_0x0160
        L_0x00ff:
            java.lang.String r0 = "android.permission.BODY_SENSORS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 3
            goto L_0x0160
        L_0x0109:
            java.lang.String r0 = "android.permission.RECEIVE_WAP_PUSH"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 20
            goto L_0x0160
        L_0x0114:
            java.lang.String r0 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 23
            goto L_0x0160
        L_0x011f:
            java.lang.String r0 = "com.google.android.googleapps.permission.GOOGLE_AUTH.cp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 7
            goto L_0x0160
        L_0x0129:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 1
            goto L_0x0160
        L_0x0133:
            java.lang.String r0 = "android.permission.READ_CALL_LOG"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 10
            goto L_0x0160
        L_0x013e:
            java.lang.String r0 = "android.permission.READ_CALENDAR"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 9
            goto L_0x0160
        L_0x0149:
            java.lang.String r0 = "android.permission.READ_SMS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 17
            goto L_0x0160
        L_0x0154:
            java.lang.String r0 = "android.permission.WRITE_SETTINGS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x015f
            r1 = 29
            goto L_0x0160
        L_0x015f:
            r1 = -1
        L_0x0160:
            switch(r1) {
                case 0: goto L_0x01bd;
                case 1: goto L_0x01ba;
                case 2: goto L_0x01b7;
                case 3: goto L_0x01b4;
                case 4: goto L_0x01b1;
                case 5: goto L_0x01ae;
                case 6: goto L_0x01ab;
                case 7: goto L_0x01a8;
                case 8: goto L_0x01a5;
                case 9: goto L_0x01a2;
                case 10: goto L_0x019f;
                case 11: goto L_0x019c;
                case 12: goto L_0x0199;
                case 13: goto L_0x0196;
                case 14: goto L_0x0193;
                case 15: goto L_0x0190;
                case 16: goto L_0x018d;
                case 17: goto L_0x018a;
                case 18: goto L_0x0187;
                case 19: goto L_0x0184;
                case 20: goto L_0x0181;
                case 21: goto L_0x017e;
                case 22: goto L_0x017b;
                case 23: goto L_0x0178;
                case 24: goto L_0x0175;
                case 25: goto L_0x0172;
                case 26: goto L_0x016f;
                case 27: goto L_0x016c;
                case 28: goto L_0x0169;
                case 29: goto L_0x0166;
                default: goto L_0x0163;
            }
        L_0x0163:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.UNKNOWN_PERMISSION
            return r1
        L_0x0166:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.WRITE_SETTINGS
            return r1
        L_0x0169:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.WRITE_EXTERNAL_STORAGE
            return r1
        L_0x016c:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.WRITE_CONTACTS
            return r1
        L_0x016f:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.WRITE_CALL_LOG
            return r1
        L_0x0172:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.WRITE_CALENDAR
            return r1
        L_0x0175:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.USE_SIP
            return r1
        L_0x0178:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.SYSTEM_ALERT_WINDOW
            return r1
        L_0x017b:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.SEND_SMS
            return r1
        L_0x017e:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.RECORD_AUDIO
            return r1
        L_0x0181:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.RECEIVE_WAP_PUSH
            return r1
        L_0x0184:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.RECEIVE_SMS
            return r1
        L_0x0187:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.RECEIVE_MMS
            return r1
        L_0x018a:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.READ_SMS
            return r1
        L_0x018d:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.READ_PHONE_STATE
            return r1
        L_0x0190:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.READ_MEDIA_VIDEO
            return r1
        L_0x0193:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.READ_MEDIA_IMAGES
            return r1
        L_0x0196:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.READ_MEDIA_AUDIO
            return r1
        L_0x0199:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.READ_EXTERNAL_STORAGE
            return r1
        L_0x019c:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.READ_CONTACTS
            return r1
        L_0x019f:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.READ_CALL_LOG
            return r1
        L_0x01a2:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.READ_CALENDAR
            return r1
        L_0x01a5:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.PROCESS_OUTGOING_CALLS
            return r1
        L_0x01a8:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.GOOGLE_AUTH_CP
            return r1
        L_0x01ab:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.GET_ACCOUNTS
            return r1
        L_0x01ae:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.CAMERA
            return r1
        L_0x01b1:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.CALL_PHONE
            return r1
        L_0x01b4:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.BODY_SENSORS
            return r1
        L_0x01b7:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.ADD_VOICEMAIL
            return r1
        L_0x01ba:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.ACCESS_FINE_LOCATION
            return r1
        L_0x01bd:
            com.google.android.apps.gsa.u.d r1 = com.google.android.apps.gsa.p8852u.C118571d.ACCESS_COARSE_LOCATION
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.permissions.C91077d.m148793a(java.lang.String):com.google.android.apps.gsa.u.d");
    }

    /* renamed from: e */
    public static boolean m148794e(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (RuntimeException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo85348b() {
        try {
            PackageInfo packageInfo = this.f254355b.getPackageManager().getPackageInfo(this.f254355b.getPackageName(), 4096);
            ArrayList arrayList = null;
            for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                if ((packageInfo.requestedPermissionsFlags[i] & 2) == 0) {
                    String str = packageInfo.requestedPermissions[i];
                    try {
                        PermissionInfo permissionInfo = this.f254355b.getPackageManager().getPermissionInfo(str, 0);
                        if (permissionInfo != null && permissionInfo.protectionLevel == 1) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(str);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.emptyList();
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final List mo85349c() {
        List<String> b = mo85348b();
        if (b.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp gpVar = new C58480gp(4);
        for (String a : b) {
            gpVar.mo55395g(m148793a(a));
        }
        return gpVar.mo55394f();
    }

    /* renamed from: f */
    public final boolean mo85350f(String str) {
        return !this.f254356c.mo85346a(str);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("PermissionsManager");
        List b = mo85348b();
        if (!b.isEmpty()) {
            Collections.sort(b);
            C91006f e = fVar.mo85281e((Object) null);
            e.mo85291r("Denied");
            e.mo85292s(C90752i.m148229c(C58827ar.m90818c(',').mo56097d(b)));
        }
    }
}
