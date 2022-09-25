package com.google.android.libraries.parenttools.youtube;

import android.content.Intent;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1635au.C19567d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: PG */
public class ParentToolsActivity extends C31100f implements C31117w {

    /* renamed from: k */
    private boolean f83747k = false;

    /* renamed from: l */
    private byte[] f83748l;

    /* renamed from: m */
    private final ScheduledExecutorService f83749m = new ScheduledThreadPoolExecutor(1);

    /* renamed from: n */
    private boolean f83750n;

    /* renamed from: o */
    private C31108n f83751o;

    /* renamed from: p */
    private String f83752p;

    /* renamed from: q */
    private C31109o f83753q = C31109o.UNKNOWN;

    /* renamed from: r */
    private boolean f83754r = false;

    /* renamed from: s */
    private int f83755s = 1;

    /* renamed from: z */
    private final void m58003z(int i, int i2) {
        if (this.f83750n) {
            C31108n nVar = this.f83751o;
            String str = i != 1 ? "NOT_ONBOARDED" : "ONBOARDED";
            String str2 = i2 != 1 ? i2 != 2 ? "CLOSED_BY_ERROR" : "CLOSED_BY_USER" : "CLOSED_BY_WEB_APP";
            int i3 = this.f83755s;
            String a = C31102h.m58029a(i3);
            if (i3 != 0) {
                ((C19567d) nVar.f83800d.mo6453a()).mo24822a(1, str, str2, a, this.f83752p, this.f83753q.name());
                this.f83754r = true;
                return;
            }
            throw null;
        }
    }

    public final void onBackPressed() {
        if (this.f83747k) {
            finishAffinity();
        }
        this.f2707h.mo3340c();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = r22
            super.onCreate(r23)
            r1 = 2131626321(0x7f0e0951, float:1.8879875E38)
            r0.setContentView((int) r1)
            android.content.Intent r1 = r22.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x01ba
            java.lang.String r4 = "should_block_system_back_button"
            boolean r4 = r1.getBoolean(r4, r2)
            r0.f83747k = r4
            java.lang.String r4 = "host_client_data"
            byte[] r4 = r1.getByteArray(r4)
            r0.f83748l = r4
            java.lang.String r4 = "client_name"
            java.lang.String r4 = r1.getString(r4)
            int r5 = r4.hashCode()
            r8 = 15
            r9 = 21
            r10 = 17
            r11 = 11
            r12 = 13
            r13 = 18
            r14 = 20
            r15 = 5
            r16 = 7
            r17 = 19
            r18 = 9
            r19 = -1
            r20 = 4
            r6 = 6
            r21 = 2
            r7 = 3
            switch(r5) {
                case -2142676268: goto L_0x013f;
                case -1844611154: goto L_0x0134;
                case -1653741425: goto L_0x012a;
                case -1634669761: goto L_0x011f;
                case -1479166400: goto L_0x0115;
                case -1285787309: goto L_0x010b;
                case -971722658: goto L_0x0101;
                case -971709531: goto L_0x00f7;
                case -632325618: goto L_0x00ed;
                case -361218851: goto L_0x00e2;
                case -361205724: goto L_0x00d6;
                case 488515446: goto L_0x00cb;
                case 554584476: goto L_0x00bf;
                case 554597603: goto L_0x00b3;
                case 599811261: goto L_0x00a7;
                case 967545909: goto L_0x009b;
                case 1228932830: goto L_0x008f;
                case 1304723582: goto L_0x0083;
                case 1364351180: goto L_0x0077;
                case 1364364307: goto L_0x006b;
                case 1493958652: goto L_0x005f;
                case 1493971779: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0149
        L_0x0053:
            java.lang.String r5 = "HOST_CLIENT_NAME_GOOGLE_HOME_WEB"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 14
            goto L_0x014a
        L_0x005f:
            java.lang.String r5 = "HOST_CLIENT_NAME_GOOGLE_HOME_IOS"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 16
            goto L_0x014a
        L_0x006b:
            java.lang.String r5 = "HOST_CLIENT_NAME_FAMILY_LINK_WEB"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 8
            goto L_0x014a
        L_0x0077:
            java.lang.String r5 = "HOST_CLIENT_NAME_FAMILY_LINK_IOS"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 10
            goto L_0x014a
        L_0x0083:
            java.lang.String r5 = "HOST_CLIENT_NAME_MUSIC_ANDROID"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 12
            goto L_0x014a
        L_0x008f:
            java.lang.String r5 = "HOST_CLIENT_NAME_GOOGLE_HOME_ANDROID"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 15
            goto L_0x014a
        L_0x009b:
            java.lang.String r5 = "HOST_CLIENT_NAME_ANDROID_DEVICE_SETUP_WEBVIEW"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 21
            goto L_0x014a
        L_0x00a7:
            java.lang.String r5 = "HOST_CLIENT_NAME_GOOGLE_HOME_ELVIS_WEB"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 17
            goto L_0x014a
        L_0x00b3:
            java.lang.String r5 = "HOST_CLIENT_NAME_MUSIC_WEB"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 11
            goto L_0x014a
        L_0x00bf:
            java.lang.String r5 = "HOST_CLIENT_NAME_MUSIC_IOS"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 13
            goto L_0x014a
        L_0x00cb:
            java.lang.String r5 = "HOST_CLIENT_NAME_IOS_KIDS"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 3
            goto L_0x014a
        L_0x00d6:
            java.lang.String r5 = "HOST_CLIENT_NAME_GOOGLE_ASSISTANT_WEB"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 18
            goto L_0x014a
        L_0x00e2:
            java.lang.String r5 = "HOST_CLIENT_NAME_GOOGLE_ASSISTANT_IOS"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 20
            goto L_0x014a
        L_0x00ed:
            java.lang.String r5 = "HOST_CLIENT_NAME_LIVING_ROOM_KIDS_SECONDARY_DEVICE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 4
            goto L_0x014a
        L_0x00f7:
            java.lang.String r5 = "HOST_CLIENT_NAME_MAIN_WEB"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 5
            goto L_0x014a
        L_0x0101:
            java.lang.String r5 = "HOST_CLIENT_NAME_MAIN_IOS"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 7
            goto L_0x014a
        L_0x010b:
            java.lang.String r5 = "HOST_CLIENT_NAME_UNKNOWN"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 0
            goto L_0x014a
        L_0x0115:
            java.lang.String r5 = "HOST_CLIENT_NAME_MAIN_ANDROID"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 6
            goto L_0x014a
        L_0x011f:
            java.lang.String r5 = "HOST_CLIENT_NAME_GOOGLE_ASSISTANT_ANDROID"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 19
            goto L_0x014a
        L_0x012a:
            java.lang.String r5 = "HOST_CLIENT_NAME_WEB_KIDS"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 2
            goto L_0x014a
        L_0x0134:
            java.lang.String r5 = "HOST_CLIENT_NAME_FAMILY_LINK_ANDROID"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 9
            goto L_0x014a
        L_0x013f:
            java.lang.String r5 = "HOST_CLIENT_NAME_ANDROID_KIDS"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0149
            r4 = 1
            goto L_0x014a
        L_0x0149:
            r4 = -1
        L_0x014a:
            switch(r4) {
                case 0: goto L_0x018c;
                case 1: goto L_0x018a;
                case 2: goto L_0x0187;
                case 3: goto L_0x0184;
                case 4: goto L_0x0181;
                case 5: goto L_0x017f;
                case 6: goto L_0x017d;
                case 7: goto L_0x017b;
                case 8: goto L_0x0179;
                case 9: goto L_0x0177;
                case 10: goto L_0x0174;
                case 11: goto L_0x0171;
                case 12: goto L_0x016e;
                case 13: goto L_0x016b;
                case 14: goto L_0x0168;
                case 15: goto L_0x0165;
                case 16: goto L_0x0162;
                case 17: goto L_0x015f;
                case 18: goto L_0x015c;
                case 19: goto L_0x0159;
                case 20: goto L_0x0156;
                case 21: goto L_0x0153;
                default: goto L_0x014d;
            }
        L_0x014d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x0153:
            r4 = 22
            goto L_0x018d
        L_0x0156:
            r4 = 21
            goto L_0x018d
        L_0x0159:
            r4 = 20
            goto L_0x018d
        L_0x015c:
            r4 = 19
            goto L_0x018d
        L_0x015f:
            r4 = 16
            goto L_0x018d
        L_0x0162:
            r4 = 15
            goto L_0x018d
        L_0x0165:
            r4 = 14
            goto L_0x018d
        L_0x0168:
            r4 = 13
            goto L_0x018d
        L_0x016b:
            r4 = 12
            goto L_0x018d
        L_0x016e:
            r4 = 11
            goto L_0x018d
        L_0x0171:
            r4 = 10
            goto L_0x018d
        L_0x0174:
            r4 = 8
            goto L_0x018d
        L_0x0177:
            r4 = 7
            goto L_0x018d
        L_0x0179:
            r4 = 6
            goto L_0x018d
        L_0x017b:
            r4 = 5
            goto L_0x018d
        L_0x017d:
            r4 = 4
            goto L_0x018d
        L_0x017f:
            r4 = 3
            goto L_0x018d
        L_0x0181:
            r4 = 18
            goto L_0x018d
        L_0x0184:
            r4 = 17
            goto L_0x018d
        L_0x0187:
            r4 = 9
            goto L_0x018d
        L_0x018a:
            r4 = 2
            goto L_0x018d
        L_0x018c:
            r4 = 1
        L_0x018d:
            int r4 = r4 + -1
            if (r4 == r3) goto L_0x019a
            if (r4 == r7) goto L_0x0199
            if (r4 == r6) goto L_0x0197
            r7 = 1
            goto L_0x019a
        L_0x0197:
            r7 = 2
            goto L_0x019a
        L_0x0199:
            r7 = 4
        L_0x019a:
            r0.f83755s = r7
            java.lang.String r4 = "client_version"
            java.lang.String r4 = r1.getString(r4)
            r0.f83752p = r4
            java.lang.String r4 = "parent_tools_use_case"
            java.io.Serializable r4 = r1.getSerializable(r4)
            boolean r5 = r4 instanceof com.google.android.libraries.parenttools.youtube.C31109o
            if (r5 == 0) goto L_0x01b2
            com.google.android.libraries.parenttools.youtube.o r4 = (com.google.android.libraries.parenttools.youtube.C31109o) r4
            r0.f83753q = r4
        L_0x01b2:
            java.lang.String r4 = "is_logging_enabled"
            boolean r4 = r1.getBoolean(r4, r2)
            r0.f83750n = r4
        L_0x01ba:
            java.lang.String r4 = "create streamz"
            java.lang.String r5 = "ParentToolsActivity"
            android.util.Log.d(r5, r4)
            java.util.concurrent.ScheduledExecutorService r4 = r0.f83749m
            android.app.Application r6 = r22.getApplication()
            com.google.android.libraries.au.c r7 = new com.google.android.libraries.au.c
            java.lang.String r8 = "STREAMZ_YOUTUBE_PARENT_TOOLS_MOBILE"
            r9 = 0
            r7.<init>(r0, r8, r9)
            com.google.android.libraries.parenttools.youtube.n r8 = new com.google.android.libraries.parenttools.youtube.n
            r8.<init>(r4, r7, r6)
            r0.f83751o = r8
            java.lang.String r4 = "streamz created"
            android.util.Log.d(r5, r4)
            r4 = 2130772141(0x7f0100ad, float:1.7147392E38)
            r5 = 2130772142(0x7f0100ae, float:1.7147394E38)
            r0.overridePendingTransition(r4, r5)
            com.google.android.libraries.parenttools.youtube.aa r4 = new com.google.android.libraries.parenttools.youtube.aa
            r4.<init>()
            r4.setArguments(r1)
            android.support.v4.app.FragmentManager r1 = r22.mo545jw()
            android.support.v4.app.a r5 = new android.support.v4.app.a
            r5.<init>((android.support.p031v4.app.FragmentManager) r1)
            r1 = 2131429972(0x7f0b0a54, float:1.8481632E38)
            r5.mo511h(r1, r4, r9, r3)
            r5.mo505b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.parenttools.youtube.ParentToolsActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        if (!this.f83754r) {
            m58003z(2, 2);
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        this.f83754r = false;
        if (this.f83750n) {
            C31108n nVar = this.f83751o;
            int i = this.f83755s;
            String a = C31102h.m58029a(i);
            if (i != 0) {
                ((C19567d) nVar.f83798b.mo6453a()).mo24822a(1, a, this.f83752p, this.f83753q.name());
            } else {
                throw null;
            }
        }
        super.onResume();
    }

    /* renamed from: w */
    public final void mo36833w() {
        if (this.f83750n) {
            C31108n nVar = this.f83751o;
            int i = this.f83755s;
            String a = C31102h.m58029a(i);
            if (i != 0) {
                ((C19567d) nVar.f83799c.mo6453a()).mo24822a(1, a, this.f83752p, this.f83753q.name());
                return;
            }
            throw null;
        }
    }

    /* renamed from: x */
    public final void mo36834x(ParentToolsResult parentToolsResult, int i) {
        C31095ac a = parentToolsResult.mo36827a();
        a.mo36839b(this.f83748l);
        ParentToolsResult a2 = a.mo36838a();
        Intent intent = new Intent();
        intent.putExtra("parent_tools_result", a2);
        setResult(-1, intent);
        int c = parentToolsResult.mo36829c();
        int i2 = c - 1;
        if (c != 0) {
            int i3 = 2;
            if (!(i2 == 0 || i2 == 1 || i2 != 2)) {
                i3 = 1;
            }
            m58003z(i3, i);
            finish();
            overridePendingTransition(R.anim.pt_slide_in_left, R.anim.pt_slide_out_right);
            return;
        }
        throw null;
    }

    /* renamed from: y */
    public final void mo36835y(int i, String str) {
        if (this.f83750n) {
            C31108n nVar = this.f83751o;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "NETWORK_ERROR" : "WEB_PAGE_LOAD_ERROR" : "OAUTH_TOKEN_ERROR" : "ACCOUNT_ACQUISITION_ERROR" : "MISSING_REQUIRED_PARAMS";
            int i2 = this.f83755s;
            String a = C31102h.m58029a(i2);
            if (i2 != 0) {
                ((C19567d) nVar.f83801e.mo6453a()).mo24822a(1, str2, str, a, this.f83752p, this.f83753q.name());
                return;
            }
            throw null;
        }
    }
}
