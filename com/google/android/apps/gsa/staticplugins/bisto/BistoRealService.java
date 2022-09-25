package com.google.android.apps.gsa.staticplugins.bisto;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89683v;
import com.google.android.apps.gsa.shared.bisto.C89684w;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95358bi;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95852c;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96017bm;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96019bo;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96020bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96027e;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.C95937g;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.C96002d;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96460ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.gms.common.data.C143864d;
import com.google.android.gms.common.data.C143865e;
import com.google.android.gms.wearable.C146413h;
import com.google.android.gms.wearable.C146414i;
import com.google.android.gms.wearable.C146527j;
import com.google.android.gms.wearable.C146528k;
import com.google.android.gms.wearable.C146532o;
import com.google.android.gms.wearable.internal.C146423ah;
import com.google.android.libraries.assistant.accessory.p618b.C10998c;
import com.google.android.libraries.assistant.accessory.p618b.C11005j;
import com.google.android.libraries.assistant.accessory.p618b.C11011p;
import com.google.android.libraries.assistant.accessory.p618b.C11017v;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3739a.p3740a.C48112i;
import com.google.assistant.p3739a.p3740a.C48115l;
import com.google.assistant.p3739a.p3740a.C48120q;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60293nf;
import com.google.common.p4552o.C60295nh;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* compiled from: PG */
public class BistoRealService extends C95027ae implements C95852c, C96019bo, C146413h {

    /* renamed from: a */
    public static final C59071e f264670a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.BistoRealService");

    /* renamed from: b */
    public static final C58528ij f264671b = C58528ij.m90015O("android.bluetooth.device.action.ACL_CONNECTED", "com.google.android.apps.gsa.broadcastreceiver.SETTINGS_CHANGED", "com.google.android.apps.gsa.broadcastreceiver.ACTION_OPA_ELIGIBILITY_CHANGE", "android.intent.action.HEADSET_PLUG", "android.intent.action.USER_PRESENT", "android.intent.action.VOICE_COMMAND", "android.speech.action.WEB_SEARCH", "android.speech.action.VOICE_SEARCH_HANDS_FREE", "android.hardware.usb.action.USB_DEVICE_ATTACHED");

    /* renamed from: c */
    static final ComponentName f264672c = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voiceinteraction.GsaVoiceInteractionService");

    /* renamed from: y */
    private static final long f264673y = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: A */
    private final Set f264674A = new HashSet();

    /* renamed from: B */
    private final Collection f264675B = new HashSet();

    /* renamed from: C */
    private C60870cx f264676C;

    /* renamed from: D */
    private C60888db f264677D;

    /* renamed from: E */
    private C60888db f264678E;

    /* renamed from: F */
    private final BroadcastReceiver f264679F = new C95707o(this);

    /* renamed from: d */
    public C89656k f264680d;

    /* renamed from: e */
    public C95850a f264681e;

    /* renamed from: f */
    public C68214a f264682f;

    /* renamed from: g */
    public C68214a f264683g;

    /* renamed from: h */
    public C95458i f264684h;

    /* renamed from: i */
    public C68214a f264685i;

    /* renamed from: j */
    public C95880a f264686j;

    /* renamed from: k */
    public C96027e f264687k;

    /* renamed from: l */
    public C95937g f264688l;

    /* renamed from: m */
    public C96017bm f264689m;

    /* renamed from: n */
    public C96002d f264690n;

    /* renamed from: o */
    public C95358bi f264691o;

    /* renamed from: p */
    public C11011p f264692p;

    /* renamed from: q */
    public C146414i f264693q;

    /* renamed from: r */
    public C146532o f264694r;

    /* renamed from: s */
    public C68214a f264695s;

    /* renamed from: t */
    public C95307m f264696t;

    /* renamed from: u */
    public C68214a f264697u;

    /* renamed from: v */
    protected C11005j f264698v;

    /* renamed from: w */
    public int f264699w;

    /* renamed from: x */
    public C90851k f264700x;

    /* renamed from: z */
    private boolean f264701z = true;

    /* renamed from: h */
    private final void m156074h() {
        C58976aa aaVar = C58975e.f156826a;
        mo88554b();
        this.f264676C = this.f264678E.mo29164d(new C95497n(this), f264673y, TimeUnit.MILLISECONDS);
    }

    /* renamed from: i */
    private final void m156075i(int i, boolean z) {
        C95307m mVar = this.f264696t;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        C60293nf nfVar = (C60293nf) C60295nh.f163127d.createBuilder();
        nfVar.copyOnWrite();
        C60295nh nhVar = (C60295nh) nfVar.instance;
        nhVar.f163130b = i - 1;
        nhVar.f163129a |= 1;
        nfVar.copyOnWrite();
        C60295nh nhVar2 = (C60295nh) nfVar.instance;
        nhVar2.f163129a |= 2;
        nhVar2.f163131c = z;
        C60295nh nhVar3 = (C60295nh) nfVar.build();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        nhVar3.getClass();
        nmVar.f163141B = nhVar3;
        nmVar.f163148b |= 1024;
        mVar.mo83545c(nkVar);
    }

    /* renamed from: a */
    public final Intent mo88553a() {
        return new Intent(getApplicationContext(), BistoRealService.class);
    }

    /* renamed from: b */
    public final void mo88554b() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f264676C;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f264676C = null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03d9, code lost:
        if (r3.equals("reset_announcements") != false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0171, code lost:
        if (r7.equals("update_device_customization") != false) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0247  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88555d(android.content.Intent r15) {
        /*
            r14 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = 4
            java.lang.String r1 = "BistoRealService"
            r2 = 0
            if (r15 == 0) goto L_0x0092
            java.lang.String r3 = "extra_opt_in_state"
            boolean r4 = r15.hasExtra(r3)
            if (r4 == 0) goto L_0x0075
            java.lang.String r4 = "extra_available_for_onboarding"
            boolean r5 = r15.hasExtra(r4)
            if (r5 == 0) goto L_0x0075
            boolean r3 = r15.getBooleanExtra(r3, r2)
            boolean r4 = r15.getBooleanExtra(r4, r2)
            dagger.a r5 = r14.f264685i
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.x.d r5 = (com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d) r5
            java.lang.String r6 = "ope_enabled_on_phone"
            boolean r5 = r5.mo90295h(r6)
            dagger.a r7 = r14.f264685i
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.x.d r7 = (com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d) r7
            java.lang.String r8 = "phone_available_for_onboarding"
            boolean r7 = r7.mo90295h(r8)
            if (r3 != r5) goto L_0x0040
            if (r4 == r7) goto L_0x0075
        L_0x0040:
            com.google.common.f.e r5 = f264670a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r1)
            java.lang.String r7 = "Bisto opt in status change"
            r9 = 14528(0x38c0, float:2.0358E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r9)).mo56386p(r7)
            dagger.a r5 = r14.f264685i
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.x.d r5 = (com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d) r5
            r5.mo90293f(r6, r3)
            dagger.a r5 = r14.f264685i
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.x.d r5 = (com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d) r5
            r5.mo90293f(r8, r4)
            if (r3 == 0) goto L_0x0075
            dagger.a r3 = r14.f264683g
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.bisto.a.cd r3 = (com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd) r3
            r3.mo83416v()
        L_0x0075:
            java.lang.String r3 = r15.getAction()
            if (r3 == 0) goto L_0x0092
            java.lang.String r4 = "bisto_set_headphones_enable_state"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0092
            java.lang.String r3 = "extra_enable_state"
            boolean r4 = r15.hasExtra(r3)
            if (r4 == 0) goto L_0x0092
            boolean r3 = r15.getBooleanExtra(r3, r2)
            r14.m156075i(r0, r3)
        L_0x0092:
            if (r15 != 0) goto L_0x00d8
            java.util.Set r15 = r14.f264674A
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x00af
            com.google.common.f.e r15 = f264670a
            com.google.common.f.x r15 = r15.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r0, r1)
            java.lang.String r0 = "Empty intent received"
            r1 = 14532(0x38c4, float:2.0364E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x00af:
            com.google.common.f.e r15 = f264670a
            com.google.common.f.x r15 = r15.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r0, r1)
            java.lang.String r0 = "Empty intent received - likely after crash"
            r1 = 14531(0x38c3, float:2.0362E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r1)).mo56386p(r0)
            java.util.Collection r15 = r14.f264675B
            java.util.Iterator r15 = r15.iterator()
        L_0x00c7:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r0 = r15.next()
            com.google.android.apps.gsa.staticplugins.bisto.u.b.bp r0 = (com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96020bp) r0
            r0.mo89865m()
            goto L_0x00c7
        L_0x00d7:
            return
        L_0x00d8:
            java.lang.String r3 = r15.getAction()
            if (r3 != 0) goto L_0x00e0
            goto L_0x03ef
        L_0x00e0:
            java.lang.String r4 = "com.google.android.apps.gsa.broadcastreceiver.SETTINGS_CHANGED"
            boolean r4 = r4.equals(r3)
            r5 = 3
            r6 = 2
            if (r4 == 0) goto L_0x0117
            com.google.android.apps.gsa.shared.bisto.k r15 = r14.f264680d
            java.lang.String r0 = "key_personal_results_enabled"
            boolean r15 = r15.mo83553h(r0)
            com.google.android.apps.gsa.shared.bisto.k r2 = r14.f264680d
            java.lang.String r3 = "key_personal_results_headphones_enabled"
            boolean r2 = r2.mo83553h(r3)
            com.google.android.apps.gsa.shared.bisto.k r4 = r14.f264680d
            r4.mo83550e()
            com.google.android.apps.gsa.shared.bisto.k r4 = r14.f264680d
            boolean r0 = r4.mo83553h(r0)
            com.google.android.apps.gsa.shared.bisto.k r4 = r14.f264680d
            boolean r3 = r4.mo83553h(r3)
            if (r15 == r0) goto L_0x0110
            r14.m156075i(r6, r0)
        L_0x0110:
            if (r2 == r3) goto L_0x04fd
            r14.m156075i(r5, r3)
            goto L_0x04fd
        L_0x0117:
            com.google.android.apps.gsa.staticplugins.bisto.u.b.a r4 = r14.f264686j
            java.lang.String r7 = r15.getAction()
            java.lang.String r8 = "AdbCommonCommandHandler"
            if (r7 != 0) goto L_0x0135
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r8)
            java.lang.String r2 = "Received intent with null action: %s"
            r3 = 15560(0x3cc8, float:2.1804E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r15)
            goto L_0x04fd
        L_0x0135:
            android.os.Bundle r9 = r15.getExtras()
            int r10 = r7.hashCode()
            r11 = -1
            r12 = 1
            switch(r10) {
                case -1789771493: goto L_0x017e;
                case -1416038084: goto L_0x0174;
                case -1328663712: goto L_0x016b;
                case -825542499: goto L_0x0161;
                case 1033781018: goto L_0x0157;
                case 1416980073: goto L_0x014d;
                case 1699718295: goto L_0x0143;
                default: goto L_0x0142;
            }
        L_0x0142:
            goto L_0x0188
        L_0x0143:
            java.lang.String r0 = "set_boolean_pref"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0188
            r0 = 1
            goto L_0x0189
        L_0x014d:
            java.lang.String r0 = "set_long_pref"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0188
            r0 = 2
            goto L_0x0189
        L_0x0157:
            java.lang.String r0 = "bypass_oobe"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0188
            r0 = 6
            goto L_0x0189
        L_0x0161:
            java.lang.String r0 = "dump_status"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0188
            r0 = 0
            goto L_0x0189
        L_0x016b:
            java.lang.String r5 = "update_device_customization"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0188
            goto L_0x0189
        L_0x0174:
            java.lang.String r0 = "clear_pref_prefix"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0188
            r0 = 3
            goto L_0x0189
        L_0x017e:
            java.lang.String r0 = "modify_bisto_db"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0188
            r0 = 5
            goto L_0x0189
        L_0x0188:
            r0 = -1
        L_0x0189:
            java.lang.String r5 = "empty extras"
            java.lang.String r7 = "No preference provided!"
            java.lang.String r10 = "value"
            java.lang.String r13 = "name"
            switch(r0) {
                case 0: goto L_0x037f;
                case 1: goto L_0x0327;
                case 2: goto L_0x02b2;
                case 3: goto L_0x0287;
                case 4: goto L_0x0280;
                case 5: goto L_0x01aa;
                case 6: goto L_0x0196;
                default: goto L_0x0194;
            }
        L_0x0194:
            goto L_0x03b1
        L_0x0196:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            java.lang.String r4 = "Bypass OOBE should be handled elsewhere"
            r5 = 15559(0x3cc7, float:2.1803E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x03b1
        L_0x01aa:
            dagger.a r0 = r4.f268456c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.f r0 = (com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f) r0
            java.lang.String r4 = "key_device_id"
            java.lang.String r4 = r15.getStringExtra(r4)
            boolean r5 = com.google.common.base.C58837ba.m90859h(r4)
            if (r5 == 0) goto L_0x01d2
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            java.lang.String r4 = "Missing device id"
            r5 = 15565(0x3ccd, float:2.1811E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x03b1
        L_0x01d2:
            java.lang.String r5 = r15.getStringExtra(r13)
            boolean r7 = com.google.common.base.C58837ba.m90859h(r5)
            if (r7 == 0) goto L_0x01f0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            java.lang.String r4 = "No name provided!"
            r5 = 15564(0x3ccc, float:2.181E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x03b1
        L_0x01f0:
            java.lang.String r7 = "double_tap"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x026c
            java.lang.String r5 = r15.getStringExtra(r10)
            if (r5 != 0) goto L_0x0212
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            java.lang.String r4 = "Invalid value: null"
            r5 = 15563(0x3ccb, float:2.1808E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x03b1
        L_0x0212:
            int r7 = r5.hashCode()
            r9 = -284840886(0xffffffffef05ac4a, float:-4.136979E28)
            if (r7 == r9) goto L_0x023a
            r9 = 3377907(0x338af3, float:4.733456E-39)
            if (r7 == r9) goto L_0x0230
            r9 = 1429828318(0x553972de, float:1.27439376E13)
            if (r7 == r9) goto L_0x0226
            goto L_0x0244
        L_0x0226:
            java.lang.String r7 = "assistant"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0244
            r7 = 1
            goto L_0x0245
        L_0x0230:
            java.lang.String r7 = "next"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0244
            r7 = 2
            goto L_0x0245
        L_0x023a:
            java.lang.String r7 = "unknown"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0244
            r7 = 0
            goto L_0x0245
        L_0x0244:
            r7 = -1
        L_0x0245:
            if (r7 == 0) goto L_0x0265
            if (r7 == r12) goto L_0x0262
            if (r7 == r6) goto L_0x025f
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            java.lang.String r4 = "Invalid value %s"
            r7 = 15562(0x3cca, float:2.1807E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56389s(r4, r5)
            goto L_0x03b1
        L_0x025f:
            com.google.android.apps.search.assistant.surfaces.bisto.d.i r15 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i.BUTTON_ACTION_NEXT_TRACK
            goto L_0x0267
        L_0x0262:
            com.google.android.apps.search.assistant.surfaces.bisto.d.i r15 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i.BUTTON_ACTION_ASSISTANT
            goto L_0x0267
        L_0x0265:
            com.google.android.apps.search.assistant.surfaces.bisto.d.i r15 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i.BUTTON_ACTION_UNKNOWN
        L_0x0267:
            r0.mo83367I(r4, r15)
            goto L_0x04fd
        L_0x026c:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            java.lang.String r4 = "Invalid key name %s"
            r7 = 15561(0x3cc9, float:2.1806E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56389s(r4, r5)
            goto L_0x03b1
        L_0x0280:
            dagger.a r0 = r4.f268456c
            com.google.android.apps.gsa.staticplugins.bisto.p7495m.C95493j.m157948d(r15, r0)
            goto L_0x04fd
        L_0x0287:
            java.lang.String r0 = r15.getStringExtra(r13)
            boolean r5 = com.google.common.base.C58837ba.m90859h(r0)
            if (r5 == 0) goto L_0x02a5
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            java.lang.String r4 = "No preference prefix provided!"
            r5 = 15558(0x3cc6, float:2.1801E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x03b1
        L_0x02a5:
            dagger.a r15 = r4.f268455b
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.x.d r15 = (com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d) r15
            r15.mo90292e(r0)
            goto L_0x04fd
        L_0x02b2:
            java.lang.String r0 = r15.getStringExtra(r13)
            if (r0 != 0) goto L_0x02ca
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            r4 = 15557(0x3cc5, float:2.18E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r7)
            goto L_0x03b1
        L_0x02ca:
            if (r9 != 0) goto L_0x02de
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            r4 = 15556(0x3cc4, float:2.1799E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r5)
            goto L_0x03b1
        L_0x02de:
            java.lang.Object r5 = r9.get(r10)
            boolean r7 = r5 instanceof java.lang.Long
            java.lang.String r9 = "prefs"
            if (r7 == 0) goto L_0x02fb
            dagger.a r15 = r4.f268455b
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.x.d r15 = (com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d) r15
            java.lang.Long r5 = (java.lang.Long) r5
            long r2 = r5.longValue()
            r15.mo90291d(r9, r0, r2)
            goto L_0x04fd
        L_0x02fb:
            boolean r7 = r5 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x0313
            dagger.a r15 = r4.f268455b
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.x.d r15 = (com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d) r15
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r2 = r5.intValue()
            long r2 = (long) r2
            r15.mo90291d(r9, r0, r2)
            goto L_0x04fd
        L_0x0313:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            java.lang.String r4 = "No Long or Integer value provided!"
            r5 = 15553(0x3cc1, float:2.1794E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x03b1
        L_0x0327:
            java.lang.String r0 = r15.getStringExtra(r13)
            if (r0 != 0) goto L_0x033e
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            r4 = 15552(0x3cc0, float:2.1793E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r7)
            goto L_0x03b1
        L_0x033e:
            if (r9 != 0) goto L_0x0351
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            r4 = 15551(0x3cbf, float:2.1792E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r5)
            goto L_0x03b1
        L_0x0351:
            java.lang.Object r5 = r9.get(r10)
            boolean r7 = r5 instanceof java.lang.Boolean
            if (r7 != 0) goto L_0x036c
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r8)
            java.lang.String r4 = "No boolean value provided!"
            r5 = 15550(0x3cbe, float:2.179E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            goto L_0x03b1
        L_0x036c:
            dagger.a r15 = r4.f268455b
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.x.d r15 = (com.google.android.apps.gsa.staticplugins.bisto.p7533x.C96628d) r15
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r2 = r5.booleanValue()
            r15.mo90293f(r0, r2)
            goto L_0x04fd
        L_0x037f:
            java.io.StringWriter r15 = new java.io.StringWriter     // Catch:{ all -> 0x039c }
            r15.<init>()     // Catch:{ all -> 0x039c }
            java.lang.String[] r0 = new java.lang.String[r12]     // Catch:{ all -> 0x039c }
            java.lang.String r3 = "verbose"
            r0[r2] = r3     // Catch:{ all -> 0x039c }
            dagger.a r2 = r4.f268457d     // Catch:{ all -> 0x039c }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ all -> 0x039c }
            com.google.android.apps.gsa.shared.bisto.w r2 = (com.google.android.apps.gsa.shared.bisto.C89684w) r2     // Catch:{ all -> 0x039c }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ all -> 0x039c }
            r3.<init>(r15)     // Catch:{ all -> 0x039c }
            r2.mo83588b(r3, r0, r12)     // Catch:{ all -> 0x039c }
            goto L_0x04fd
        L_0x039c:
            r15 = move-exception
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a.f268454a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r8)
            java.lang.String r2 = "caught exception while dumping"
            r3 = 15548(0x3cbc, float:2.1787E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r15)).mo56372aa(r3)).mo56386p(r2)
            goto L_0x04fd
        L_0x03b1:
            com.google.android.apps.gsa.staticplugins.bisto.u.b.e r0 = r14.f264687k
            com.google.android.apps.gsa.staticplugins.bisto.notifications.g r0 = r0.f268880i
            int r4 = r3.hashCode()
            r5 = -594128698(0xffffffffdc9650c6, float:-3.38480463E17)
            if (r4 == r5) goto L_0x03dc
            r5 = 146035996(0x8b4551c, float:1.0853365E-33)
            if (r4 == r5) goto L_0x03d3
            r2 = 2045427687(0x79eabfe7, float:1.5236121E35)
            if (r4 == r2) goto L_0x03c9
            goto L_0x03e6
        L_0x03c9:
            java.lang.String r2 = "com.google.android.apps.gsa.notificationlistener.NOTIFICATION_LISTENER_SERVICE_CONNECTED"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03e6
            r2 = 1
            goto L_0x03e7
        L_0x03d3:
            java.lang.String r4 = "reset_announcements"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x03e6
            goto L_0x03e7
        L_0x03dc:
            java.lang.String r2 = "action_handle_hpr_allow"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03e6
            r2 = 2
            goto L_0x03e7
        L_0x03e6:
            r2 = -1
        L_0x03e7:
            java.lang.String r3 = "NAS is null"
            if (r2 == 0) goto L_0x04c0
            if (r2 == r12) goto L_0x0489
            if (r2 == r6) goto L_0x0406
        L_0x03ef:
            java.util.Collection r0 = r14.f264675B
            java.util.Iterator r0 = r0.iterator()
        L_0x03f5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0405
            java.lang.Object r1 = r0.next()
            com.google.android.apps.gsa.staticplugins.bisto.u.b.bp r1 = (com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96020bp) r1
            r1.mo89864h(r15)
            goto L_0x03f5
        L_0x0405:
            return
        L_0x0406:
            dagger.a r15 = r14.f264697u
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.util.ay r15 = (com.google.android.apps.gsa.staticplugins.bisto.util.C96467ay) r15
            com.google.android.apps.gsa.search.core.aj.aa r0 = r15.f269871e
            android.app.KeyguardManager r0 = r0.f230023b
            boolean r0 = r0.isDeviceLocked()
            java.lang.String r2 = "PRNotifHelper"
            if (r0 == 0) goto L_0x042e
            com.google.common.f.e r15 = com.google.android.apps.gsa.staticplugins.bisto.util.C96467ay.f269867a
            com.google.common.f.x r15 = r15.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r0, r2)
            java.lang.String r0 = "unlock required for HPR"
            r2 = 17188(0x4324, float:2.4086E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r2)).mo56386p(r0)
            goto L_0x04fd
        L_0x042e:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.util.C96467ay.f269867a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r2)
            java.lang.String r2 = "Enable HPR"
            r3 = 17187(0x4323, float:2.4084E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            dagger.a r0 = r15.f269870d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.bisto.r.h r0 = (com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95857h) r0
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.BISTO_WORK_REQUEST
            com.google.android.apps.gsa.search.shared.service.b.bu r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.BISTO_ALLOW_HEADPHONE_PR
            r4 = 0
            r0.mo89824a(r2, r3, r4)
            android.content.Context r0 = r15.f269869c
            r2 = 2132088293(0x7f1515e5, float:1.9816865E38)
            java.lang.String r0 = r0.getString(r2)
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            com.google.android.apps.gsa.staticplugins.bisto.util.av r3 = new com.google.android.apps.gsa.staticplugins.bisto.util.av
            r3.<init>(r15, r0)
            r2.post(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 >= r2) goto L_0x047c
            android.content.Context r15 = r15.f269869c
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            r0.<init>(r2)
            r15.sendBroadcast(r0)
        L_0x047c:
            java.lang.String r15 = "notification"
            java.lang.Object r15 = r14.getSystemService(r15)
            android.app.NotificationManager r15 = (android.app.NotificationManager) r15
            r15.cancel(r12)
            goto L_0x04fd
        L_0x0489:
            if (r0 != 0) goto L_0x049c
            com.google.common.f.e r15 = f264670a
            com.google.common.f.x r15 = r15.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r0, r1)
            r0 = 14543(0x38cf, float:2.0379E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r0)).mo56386p(r3)
            goto L_0x04fd
        L_0x049c:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.f r0 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.C95636f) r0
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.az r15 = r0.f267658g
            if (r15 == 0) goto L_0x04ad
            com.google.android.apps.gsa.staticplugins.bisto.notifications.a r2 = r0.f267673v
            android.content.Context r2 = r2.f267242a
            android.content.Context r2 = r2.getApplicationContext()
            com.google.android.apps.gsa.notificationlistener.C83387d.m132712b(r2, r15)
        L_0x04ad:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.k r15 = r0.f267657f
            if (r15 == 0) goto L_0x04bc
            com.google.android.apps.gsa.staticplugins.bisto.notifications.a r2 = r0.f267673v
            android.content.Context r2 = r2.f267242a
            android.content.Context r2 = r2.getApplicationContext()
            com.google.android.apps.gsa.notificationlistener.C83387d.m132712b(r2, r15)
        L_0x04bc:
            r0.mo89599e()
            goto L_0x04fd
        L_0x04c0:
            if (r0 != 0) goto L_0x04d3
            com.google.common.f.e r15 = f264670a
            com.google.common.f.x r15 = r15.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r0, r1)
            r0 = 14542(0x38ce, float:2.0378E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r0)).mo56386p(r3)
            goto L_0x04fd
        L_0x04d3:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.f r0 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.C95636f) r0
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.l r15 = r0.f267659h
            com.google.android.apps.gsa.staticplugins.bisto.notifications.e.d r2 = r15.f267948f
            com.google.android.apps.gsa.staticplugins.bisto.notifications.j.i r3 = new com.google.android.apps.gsa.staticplugins.bisto.notifications.j.i
            r3.<init>(r15)
            r2.mo89592o(r3)
            com.google.android.apps.gsa.staticplugins.bisto.f.ae r15 = r0.f267668q
            if (r15 == 0) goto L_0x04ee
            com.google.android.apps.gsa.staticplugins.bisto.x.d r15 = r15.f266622d
            if (r15 == 0) goto L_0x04ee
            java.lang.String r2 = "TaperingHelper"
            r15.mo90292e(r2)
        L_0x04ee:
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aj r15 = r0.f267654c
            r15.mo89528b()
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.as r15 = r0.f267655d
            r15.mo89544h()
            com.google.android.apps.gsa.staticplugins.bisto.notifications.d.v r15 = r0.f267656e
            r15.mo89579c()
        L_0x04fd:
            com.google.common.f.e r15 = f264670a
            com.google.common.f.x r15 = r15.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r0, r1)
            java.lang.String r0 = "Intent handled internally"
            r1 = 14530(0x38c2, float:2.0361E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r1)).mo56386p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.BistoRealService.mo88555d(android.content.Intent):void");
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C58976aa aaVar = C58975e.f156826a;
        ((C89684w) this.f264682f.mo27525b()).mo83588b(printWriter, strArr, false);
        printWriter.printf("Bisto Flags: %s\n", new Object[]{this.f264680d.mo83548c("enabled_features")});
        printWriter.printf("PR: migrated=%b pr=%b hpr=%b\n", new Object[]{Boolean.valueOf(this.f264680d.mo83561p()), Boolean.valueOf(this.f264680d.mo83553h("key_personal_results_enabled")), Boolean.valueOf(this.f264680d.mo83553h("key_personal_results_headphones_enabled"))});
    }

    /* renamed from: e */
    public final void mo88557e(C146527j jVar) {
        Optional optional;
        C143864d dVar = new C143864d(jVar);
        while (dVar.hasNext()) {
            C146423ah ahVar = (C146423ah) dVar.next();
            if (ahVar.mo119336ks("event_type") == 1) {
                C146528k h = ahVar.mo123206h();
                String path = h.mo123132b().getPath();
                if (path != null && path.startsWith(C11017v.m26074c(false))) {
                    byte[] g = ((C143865e) h).mo119334g("data");
                    try {
                        optional = Optional.m71637of((C48115l) C62942bv.parseFrom((C62942bv) C48115l.f124522j, g, C62921ba.m95368a()));
                    } catch (C62974ct e) {
                        C59104x d = C11017v.f36196a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicatorUtils");
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(42550)).mo56386p("Invalid format for parsing AssistantConnectionStateUpdate ");
                        optional = Optional.empty();
                    }
                    if (optional.isPresent()) {
                        C59104x b = f264670a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "BistoRealService");
                        ((C59052c) ((C59052c) b).mo56372aa(14534)).mo56359L("Received data item, action: %d, state: %d, order: %d", Integer.valueOf(((C48115l) optional.get()).f124524a), Integer.valueOf(((C48115l) optional.get()).f124531h), Integer.valueOf(((C48115l) optional.get()).f124532i));
                        int i = ((C48115l) optional.get()).f124524a;
                        int i2 = ((C48115l) optional.get()).f124531h;
                        C63088z zVar = ((C48115l) optional.get()).f124525b;
                        int i3 = ((C48115l) optional.get()).f124532i;
                        this.f264678E.execute(new C95479l(this));
                        C48115l lVar = (C48115l) optional.get();
                        C10998c cVar = new C10998c();
                        cVar.f36149a = Integer.valueOf(lVar.f124524a);
                        cVar.mo19379b(lVar.f124525b.mo59170I(C62972cr.f170009a));
                        cVar.f36154f = Integer.valueOf(lVar.f124531h);
                        cVar.f36155g = Integer.valueOf(lVar.f124532i);
                        if (!lVar.f124528e.mo59173M()) {
                            cVar.f36153e = lVar.f124528e.mo59170I(C62972cr.f170009a);
                        }
                        if (!lVar.f124527d.mo59173M()) {
                            cVar.f36150b = lVar.f124527d.mo59170I(C62972cr.f170009a);
                        }
                        int i4 = lVar.f124529f;
                        int b2 = C48120q.m85187b(i4);
                        if (b2 == 0 || b2 != 2) {
                            cVar.f36151c = Integer.valueOf(i4);
                        }
                        int b3 = C48112i.m85183b(lVar.f124524a);
                        if (b3 != 0 && b3 == 4) {
                            cVar.f36152d = Integer.valueOf(lVar.f124530g);
                        }
                        C60856cj.m92911t(this.f264692p.mo19411d(cVar.mo19378a()), this.f264698v, C60826bg.f164896a);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo88558f(C96020bp bpVar, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        boolean isEmpty = this.f264674A.isEmpty();
        if (z) {
            this.f264674A.add(bpVar);
        } else {
            this.f264674A.remove(bpVar);
        }
        boolean isEmpty2 = this.f264674A.isEmpty();
        if (isEmpty == isEmpty2) {
            return;
        }
        if (isEmpty2) {
            m156074h();
        } else {
            mo88554b();
        }
    }

    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        this.f264701z = false;
        C58976aa aaVar = C58975e.f156826a;
        return null;
    }

    public final void onCreate() {
        C74507e.m120466b(23);
        super.onCreate();
        C58976aa aaVar = C58975e.f156826a;
        this.f264677D = this.f264700x.mo85208a("bisto-real-service");
        this.f264678E = this.f264700x.mo85211d("bisto-real-service");
        this.f264680d.mo83550e();
        this.f264675B.add(this.f264689m);
        this.f264675B.add(this.f264688l);
        this.f264675B.add(this.f264690n);
        registerReceiver(this.f264679F, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        C96017bm bmVar = this.f264689m;
        C11011p pVar = bmVar.f268838h;
        synchronized (pVar.f36178d) {
            if (!pVar.f36178d.contains(bmVar)) {
                pVar.f36178d.add(bmVar);
            }
        }
        bmVar.f268840j.mo123085b(bmVar);
        m156074h();
        C47633f.m84733g(((C89492cd) this.f264683g.mo27525b()).mo83402i()).mo51515h(new C95470j(this), this.f264678E).mo51513e(Exception.class, C95474k.f267163a, C60826bg.f164896a);
        ((C89684w) this.f264682f.mo27525b()).mo83587a("BistoDeviceDatabase", (C89683v) this.f264683g.mo27525b());
        this.f264693q.mo123093b(this);
        C11011p pVar2 = this.f264692p;
        this.f264698v = new C11005j(pVar2, this.f264693q, true);
        pVar2.mo19420m(this.f264694r);
    }

    public final void onDestroy() {
        C59104x b = f264670a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoRealService");
        ((C59052c) ((C59052c) b).mo56372aa(14537)).mo56386p("onDestroy");
        mo88554b();
        unregisterReceiver(this.f264679F);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(48);
        }
        C95458i iVar = this.f264684h;
        iVar.f267110a.clear();
        iVar.f267114e.clear();
        iVar.f267115f.clear();
        iVar.f267111b.set(false);
        iVar.f267118i = Optional.empty();
        iVar.f267119j = null;
        this.f264681e.close();
        this.f264693q.mo123094c(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C59104x b = f264670a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoRealService");
        ((C59052c) ((C59052c) b).mo56372aa(14521)).mo56359L("onStartCommand: %d %d %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        boolean z = intent != null && intent.getBooleanExtra("run_in_foreground", false);
        if (z) {
            if (C89636g.m145898d(intent)) {
                startForeground(49, C96460ar.m159821a(this, C58833ax.m90834k(C124719q.GACS_DEVICE)).mo5013a());
            } else {
                startForeground(48, C96460ar.m159821a(this, C58836b.f156633a).mo5013a());
            }
        }
        this.f264699w = i2;
        mo88555d(intent);
        if (this.f264701z) {
            this.f264677D.execute(new C95483m(this, intent, z));
            this.f264701z = false;
        }
        return 1;
    }
}
