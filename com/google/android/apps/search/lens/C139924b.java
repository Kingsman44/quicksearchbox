package com.google.android.apps.search.lens;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import android.view.KeyEvent;
import androidx.lifecycle.C2383n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.C26894i;
import com.google.android.libraries.lens.view.C27220l;
import com.google.android.libraries.lens.view.C27458o;
import com.google.android.libraries.lens.view.C28055t;
import com.google.android.libraries.lens.view.C28206x;
import com.google.android.libraries.lens.view.infopanel.C27073c;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.livingsurfaces.p2149a.C27235b;
import com.google.android.libraries.lens.view.livingsurfaces.p2149a.C27236c;
import com.google.android.libraries.lens.view.main.C27292ai;
import com.google.android.libraries.lens.view.main.C27384dt;
import com.google.android.libraries.lens.view.p2052ac.C24974a;
import com.google.android.libraries.lens.view.p2078at.C25505ak;
import com.google.android.libraries.lens.view.p2078at.C25508an;
import com.google.android.libraries.lens.view.p2078at.C25509ao;
import com.google.android.libraries.lens.view.p2078at.C25519b;
import com.google.android.libraries.lens.view.p2078at.C25525h;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.weblrp.C28191f;
import com.google.android.libraries.lens.view.weblrp.C28194i;
import com.google.android.libraries.lens.view.weblrp.C28201o;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28446p;
import com.google.android.libraries.logging.p2185ve.C28447q;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C60700zp;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59923ce;
import com.google.common.p4552o.p4563i.C59925cg;
import com.google.common.p4552o.p4563i.C59927ci;
import com.google.lens.p4711m.C62632i;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Arrays;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.lens.b */
/* compiled from: PG */
public class C139924b extends C19473a implements C28055t, C45987ay, C27220l {

    /* renamed from: o */
    private static final C59071e f380366o = C59071e.m91332i("com.google.android.apps.search.lens.b");

    /* renamed from: j */
    public final Duration f380367j = Duration.ofNanos(SystemClock.elapsedRealtimeNanos());

    /* renamed from: k */
    public C27232l f380368k;

    /* renamed from: l */
    public C27228h f380369l;

    /* renamed from: m */
    public C60700zp f380370m;

    /* renamed from: n */
    public Bundle f380371n;

    /* renamed from: p */
    private C68214a f380372p;

    /* renamed from: q */
    private boolean f380373q;

    /* renamed from: r */
    private AccountId f380374r;

    /* renamed from: s */
    private boolean f380375s = false;

    /* renamed from: t */
    private boolean f380376t = false;

    /* renamed from: B */
    private final void mo115343B() {
        if ((!this.f380375s || this.f380376t) && this.f380374r != null && mo115341w() == null && !mo545jw().mo461ab()) {
            C26894i v = mo115340v();
            if (v == null) {
                AccountId accountId = this.f380374r;
                accountId.getClass();
                C26894i iVar = new C26894i();
                C68324h.m98669f(iVar);
                C47247a.m84047b(iVar, accountId);
                C0154a aVar = new C0154a(mo545jw());
                aVar.mo685r(iVar, "AccountResolverFragment");
                aVar.mo509f();
                v = iVar;
            }
            if (v.f73316a.f6612c.mo5788a(C2383n.STARTED)) {
                v.mo17754z().mo32805b(this);
            }
        }
    }

    /* renamed from: C */
    private final void mo115330C() {
        int i = 1;
        if (true == C24974a.m46226b(this.f380373q, this.f380368k, this)) {
            i = -1;
        }
        setRequestedOrientation(i);
    }

    /* renamed from: z */
    private final void m227543z(String str, int[] iArr) {
        ((C31639g) this.f380372p.mo27525b()).mo37290d(iArr, str, "ANDROID_GSA");
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [android.graphics.Bitmap] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115339A(com.google.apps.tiktok.account.api.controller.C45989b r17, dagger.C68214a r18, com.google.common.p4552o.C60700zp r19, boolean r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            r2 = r18
            r1.f380372p = r2
            r1.f380370m = r0
            r2 = r20
            r1.f380373q = r2
            com.google.common.o.zp r2 = com.google.common.p4552o.C60700zp.DIRECT_INTENT
            r3 = 0
            java.lang.String r5 = "caller_package"
            r6 = 1
            r7 = 0
            r8 = 0
            if (r0 != r2) goto L_0x0175
            java.lang.String r0 = r16.getCallingPackage()
            if (r0 != 0) goto L_0x00a8
            android.content.Intent r0 = r16.getIntent()
            com.google.android.libraries.lens.sdk.intent.e r0 = com.google.android.libraries.lens.view.p2051ab.C24968a.m46212a(r0)
            if (r0 == 0) goto L_0x00a9
            boolean r2 = r0.mo30170f()
            if (r2 == 0) goto L_0x00a9
            android.os.IBinder r0 = r0.mo30166b()
            if (r0 == 0) goto L_0x00a9
            long r9 = android.os.SystemClock.elapsedRealtime()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            android.os.Parcel r11 = android.os.Parcel.obtain()
            r12 = 16
            byte[] r12 = new byte[r12]
            java.util.Random r13 = new java.util.Random
            long r14 = android.os.SystemClock.elapsedRealtimeNanos()
            r13.<init>(r14)
            r13.nextBytes(r12)
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r14 = "challenge"
            r13.putByteArray(r14, r12)
            r2.writeBundle(r13)
            r0.transact(r6, r2, r11, r8)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x006b
        L_0x0062:
            r0 = move-exception
            r13 = r0
            java.lang.String r0 = "Failed to get caller package"
            java.lang.Object[] r14 = new java.lang.Object[r8]
            com.google.android.libraries.lens.sdk.p2038a.C24841p.m45972c(r13, r0, r14)
        L_0x006b:
            r11.readException()
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r0 = r11.readBundle(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.String r13 = "challenge_reply"
            byte[] r13 = r0.getByteArray(r13)
            byte[] r12 = com.google.android.libraries.lens.sdk.intent.C24942d.m46158a(r12)
            boolean r12 = java.util.Arrays.equals(r12, r13)
            if (r12 == 0) goto L_0x008f
            java.lang.String r0 = r0.getString(r5)
            r7 = r0
        L_0x008f:
            r2.recycle()
            r11.recycle()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r11 = r11 - r9
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r0[r8] = r2
            java.lang.String r2 = "Get caller package took %d ms."
            com.google.android.libraries.lens.sdk.p2038a.C24841p.m45970a(r2, r0)
            goto L_0x00a9
        L_0x00a8:
            r7 = r0
        L_0x00a9:
            if (r7 != 0) goto L_0x00af
            com.google.android.libraries.lens.view.l.l r0 = com.google.android.libraries.lens.view.p2148l.C27232l.f74493A
            goto L_0x016b
        L_0x00af:
            android.content.Intent r0 = r16.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0147
            com.google.android.libraries.lens.sdk.intent.e r2 = com.google.android.libraries.lens.view.p2051ab.C24968a.m46214c(r0)
            if (r2 == 0) goto L_0x00c2
            r2.mo30171g(r7)
        L_0x00c2:
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90833j(r7)
            boolean r2 = com.google.lens.p4711m.C62632i.m94818c(r2)
            if (r2 == 0) goto L_0x013c
            java.lang.String r2 = "include_return_text_intent"
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x013c
            android.content.Intent r0 = r16.getIntent()
            com.google.android.libraries.lens.view.l.j r2 = com.google.android.libraries.lens.view.p2148l.C27232l.m50570D()
            java.lang.String r5 = r16.getCallingPackage()
            r5.getClass()
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90833j(r5)
            r7 = r2
            com.google.android.libraries.lens.view.l.c r7 = (com.google.android.libraries.lens.view.p2148l.C27223c) r7
            r7.f74434c = r5
            com.google.lens.j.cu r5 = com.google.lens.p4707j.C62471cu.f168676c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.lens.j.ce r5 = (com.google.lens.p4707j.C62455ce) r5
            com.google.lens.j.cr r7 = com.google.lens.p4707j.C62468cr.f168665d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.lens.j.cq r7 = (com.google.lens.p4707j.C62467cq) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.lens.j.cr r8 = (com.google.lens.p4707j.C62468cr) r8
            int r9 = r8.f168667a
            r9 = r9 | r6
            r8.f168667a = r9
            r8.f168668b = r6
            com.google.protobuf.bv r6 = r7.build()
            com.google.lens.j.cr r6 = (com.google.lens.p4707j.C62468cr) r6
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.lens.j.cu r7 = (com.google.lens.p4707j.C62471cu) r7
            r6.getClass()
            r7.f168679b = r6
            r6 = 3
            r7.f168678a = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.lens.j.cu r5 = (com.google.lens.p4707j.C62471cu) r5
            r2.mo32683f(r5)
            java.lang.String r5 = "extra_launch_time"
            boolean r6 = r0.hasExtra(r5)
            if (r6 == 0) goto L_0x0137
            long r3 = r0.getLongExtra(r5, r3)
            r2.mo32681d(r3)
        L_0x0137:
            com.google.android.libraries.lens.view.l.l r0 = r2.mo32678a()
            goto L_0x016b
        L_0x013c:
            com.google.android.libraries.lens.sdk.intent.e r2 = com.google.android.libraries.lens.view.p2051ab.C24968a.m46214c(r0)
            if (r2 == 0) goto L_0x0147
            com.google.android.libraries.lens.view.l.l r0 = com.google.android.libraries.lens.view.p2051ab.C24968a.m46217f(r0)
            goto L_0x016b
        L_0x0147:
            android.content.Intent r0 = r16.getIntent()
            android.net.Uri r0 = r0.getData()
            com.google.android.libraries.lens.sdk.intent.e r0 = com.google.android.libraries.lens.view.p2051ab.C24968a.m46213b(r0)
            if (r0 == 0) goto L_0x0169
            r0.mo30171g(r7)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "lens_activity_params"
            android.os.Bundle r0 = r0.f68071a
            r2.putBundle(r3, r0)
            com.google.android.libraries.lens.view.l.l r0 = com.google.android.libraries.lens.view.p2051ab.C24968a.m46217f(r2)
            goto L_0x016b
        L_0x0169:
            com.google.android.libraries.lens.view.l.l r0 = com.google.android.libraries.lens.view.p2148l.C27232l.f74493A
        L_0x016b:
            r1.f380368k = r0
            com.google.android.libraries.lens.view.l.h r0 = com.google.android.libraries.lens.view.p2051ab.C24968a.m46215d(r16)
            r1.f380369l = r0
            goto L_0x0422
        L_0x0175:
            android.content.Intent r0 = r16.getIntent()
            android.os.Bundle r2 = r0.getExtras()
            java.lang.String r9 = "fife_url"
            java.lang.String r10 = "injected_image_payload"
            if (r2 != 0) goto L_0x0187
            com.google.android.libraries.lens.view.l.l r0 = com.google.android.libraries.lens.view.p2148l.C27232l.f74493A
            goto L_0x03ac
        L_0x0187:
            java.lang.String r0 = "lens_tap_location"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            java.lang.String r11 = "bootstrap_image"
            byte[] r11 = r2.getByteArray(r11)
            if (r11 != 0) goto L_0x019b
            byte[] r11 = r2.getByteArray(r10)
        L_0x019b:
            java.lang.String r12 = "LensHomescreenShortcut"
            boolean r13 = r2.getBoolean(r12)
            if (r13 == 0) goto L_0x01a6
            java.lang.String r5 = "com.google.android.googlequicksearchbox"
            goto L_0x01aa
        L_0x01a6:
            java.lang.String r5 = r2.getString(r5)
        L_0x01aa:
            com.google.android.libraries.lens.view.l.j r13 = com.google.android.libraries.lens.view.p2148l.C27232l.m50570D()
            java.lang.String r14 = "account_name"
            java.lang.String r14 = r2.getString(r14)
            com.google.common.base.ax r14 = com.google.common.base.C58833ax.m90833j(r14)
            r15 = r13
            com.google.android.libraries.lens.view.l.c r15 = (com.google.android.libraries.lens.view.p2148l.C27223c) r15
            r15.f74432a = r14
            if (r11 != 0) goto L_0x01c1
            r11 = r7
            goto L_0x01c5
        L_0x01c1:
            com.google.protobuf.z r11 = com.google.protobuf.C63088z.m96139A(r11)
        L_0x01c5:
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90833j(r11)
            r15.f74433b = r11
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90833j(r5)
            r15.f74434c = r11
            com.google.lens.j.cu r11 = com.google.android.libraries.lens.view.p2051ab.C24971d.m46222b(r2)
            r13.mo32683f(r11)
            java.lang.String r11 = "triggered_by_deeplink"
            boolean r11 = r2.getBoolean(r11, r8)
            if (r11 != 0) goto L_0x01eb
            java.lang.String r11 = "treat_as_external"
            boolean r11 = r2.getBoolean(r11, r8)
            if (r11 == 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r11 = 0
            goto L_0x01ec
        L_0x01eb:
            r11 = 1
        L_0x01ec:
            r13.mo32686i(r11)
            if (r0 != 0) goto L_0x01f3
            r14 = r7
            goto L_0x01fc
        L_0x01f3:
            float r11 = r0.x
            float r0 = r0.y
            com.google.android.libraries.lens.view.l.e r14 = new com.google.android.libraries.lens.view.l.e
            r14.<init>(r11, r0)
        L_0x01fc:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r14)
            r15.f74435d = r0
            java.lang.String r0 = "lens_transition_type"
            int r0 = r2.getInt(r0, r8)
            r13.mo32690m(r0)
            boolean r0 = r2.getBoolean(r12)
            if (r0 == 0) goto L_0x0216
            com.google.lens.j.bj r0 = com.google.lens.p4707j.C62433bj.LENS_APP_SHORTCUT
            int r0 = r0.f168594ao
            goto L_0x0220
        L_0x0216:
            com.google.lens.j.bj r0 = com.google.lens.p4707j.C62433bj.UNKNOWN
            int r0 = r0.f168594ao
            java.lang.String r11 = "lens_intent_type"
            int r0 = r2.getInt(r11, r0)
        L_0x0220:
            r13.mo32684g(r0)
            java.lang.String r0 = "location"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.location.Location r0 = (android.location.Location) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r15.f74436e = r0
            java.lang.String r0 = "image_place_id"
            java.lang.String r0 = r2.getString(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r15.f74441j = r0
            java.lang.String r0 = "enable_art_lookalike_feature"
            boolean r0 = r2.getBoolean(r0, r6)
            r13.mo32680c(r0)
            boolean r0 = r2.getBoolean(r12)
            if (r0 == 0) goto L_0x024e
            r0 = 1
            goto L_0x0254
        L_0x024e:
            java.lang.String r0 = "hide_lens_close_button"
            boolean r0 = r2.getBoolean(r0, r8)
        L_0x0254:
            r13.mo32689l(r0)
            java.lang.String r0 = "screen_orientation"
            int r0 = r2.getInt(r0, r8)
            r13.mo32688k(r0)
            java.lang.String r0 = "from_incognito"
            boolean r0 = r2.getBoolean(r0, r8)
            r13.mo32685h(r0)
            java.lang.String r0 = r2.getString(r9)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r15.f74438g = r0
            java.lang.String r0 = "promo_add_shorcut"
            boolean r0 = r2.getBoolean(r0, r8)
            r13.mo32687j(r0)
            java.lang.String r0 = "hermetic_lfe_recording_file"
            java.lang.String r0 = r2.getString(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r15.f74443l = r0
            java.lang.String r0 = "hermetic_lfe_record_mode"
            boolean r0 = r2.getBoolean(r0)
            r13.mo32682e(r0)
            java.lang.String r0 = "ImageSrc"
            java.lang.String r0 = r2.getString(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r15.f74439h = r0
            java.lang.String r0 = "PageDomain"
            java.lang.String r0 = r2.getString(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r15.f74440i = r0
            java.lang.String r0 = "activity_launch_timestamp_nanos"
            long r11 = r2.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            long r11 = r0.longValue()
            int r14 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r14 != 0) goto L_0x02bc
            r0 = r7
        L_0x02bc:
            if (r0 == 0) goto L_0x02c5
            long r3 = r0.longValue()
            r13.mo32681d(r3)
        L_0x02c5:
            java.lang.String r0 = "lens_sreen_image_location"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 == 0) goto L_0x0326
            com.google.android.libraries.lens.view.am.t r3 = com.google.android.libraries.lens.view.p2069am.C25344t.f68987f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.lens.view.am.s r3 = (com.google.android.libraries.lens.view.p2069am.C25343s) r3
            int r4 = r0.left
            r3.copyOnWrite()
            com.google.protobuf.bv r11 = r3.instance
            com.google.android.libraries.lens.view.am.t r11 = (com.google.android.libraries.lens.view.p2069am.C25344t) r11
            int r12 = r11.f68989a
            r6 = r6 | r12
            r11.f68989a = r6
            r11.f68990b = r4
            int r4 = r0.top
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.lens.view.am.t r6 = (com.google.android.libraries.lens.view.p2069am.C25344t) r6
            int r11 = r6.f68989a
            r11 = r11 | 2
            r6.f68989a = r11
            r6.f68991c = r4
            int r4 = r0.right
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.lens.view.am.t r6 = (com.google.android.libraries.lens.view.p2069am.C25344t) r6
            int r11 = r6.f68989a
            r11 = r11 | 4
            r6.f68989a = r11
            r6.f68992d = r4
            int r0 = r0.bottom
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.lens.view.am.t r4 = (com.google.android.libraries.lens.view.p2069am.C25344t) r4
            int r6 = r4.f68989a
            r6 = r6 | 8
            r4.f68989a = r6
            r4.f68993e = r0
            com.google.protobuf.bv r0 = r3.build()
            com.google.android.libraries.lens.view.am.t r0 = (com.google.android.libraries.lens.view.p2069am.C25344t) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r15.f74437f = r0
        L_0x0326:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r5)
            boolean r0 = com.google.lens.p4711m.C62632i.m94817b(r0)
            if (r0 == 0) goto L_0x0392
            java.lang.String r0 = "chrome_finch_variations"
            java.lang.String r3 = r2.getString(r0)
            if (r3 == 0) goto L_0x0387
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ NumberFormatException -> 0x0377 }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x0377 }
            java.lang.String r4 = " "
            com.google.common.base.cf r4 = com.google.common.base.C58869cf.m90938d(r4)     // Catch:{ NumberFormatException -> 0x0377 }
            com.google.common.base.u r5 = com.google.common.base.C58911u.f156751b     // Catch:{ NumberFormatException -> 0x0377 }
            com.google.common.base.cf r4 = r4.mo56152f(r5)     // Catch:{ NumberFormatException -> 0x0377 }
            com.google.common.base.cf r4 = r4.mo56151a()     // Catch:{ NumberFormatException -> 0x0377 }
            java.lang.Iterable r4 = r4.mo56153g(r3)     // Catch:{ NumberFormatException -> 0x0377 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ NumberFormatException -> 0x0377 }
        L_0x0355:
            boolean r5 = r4.hasNext()     // Catch:{ NumberFormatException -> 0x0377 }
            if (r5 == 0) goto L_0x036d
            java.lang.Object r5 = r4.next()     // Catch:{ NumberFormatException -> 0x0377 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x0377 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0377 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0377 }
            r0.add(r5)     // Catch:{ NumberFormatException -> 0x0377 }
            goto L_0x0355
        L_0x036d:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)     // Catch:{ NumberFormatException -> 0x0377 }
            r4 = r13
            com.google.android.libraries.lens.view.l.c r4 = (com.google.android.libraries.lens.view.p2148l.C27223c) r4     // Catch:{ NumberFormatException -> 0x0377 }
            r4.f74442k = r0     // Catch:{ NumberFormatException -> 0x0377 }
            goto L_0x0392
        L_0x0377:
            r0 = move-exception
            com.google.common.f.e r4 = com.google.android.libraries.lens.view.p2051ab.C24969b.f68089a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Failed to parse variations: %s"
            r6 = 49618(0xc1d2, float:6.953E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r6)).mo56389s(r5, r3)
            goto L_0x0392
        L_0x0387:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r15.f74442k = r0
        L_0x0392:
            java.lang.String r0 = "proactive_query_id"
            int r0 = r2.getInt(r0, r8)
            if (r0 != 0) goto L_0x039c
            r0 = r7
            goto L_0x03a0
        L_0x039c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x03a0:
            if (r0 == 0) goto L_0x03a8
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            r15.f74446o = r0
        L_0x03a8:
            com.google.android.libraries.lens.view.l.l r0 = r13.mo32678a()
        L_0x03ac:
            r1.f380368k = r0
            android.content.Intent r0 = r16.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 != 0) goto L_0x03bb
            com.google.android.libraries.lens.view.l.h r0 = com.google.android.libraries.lens.view.p2148l.C27228h.f74491h
            goto L_0x0420
        L_0x03bb:
            com.google.android.libraries.lens.view.l.f r2 = com.google.android.libraries.lens.view.p2148l.C27228h.m50544i()
            java.lang.String r3 = "injected_image_bitmap"
            android.os.Parcelable r3 = r0.getParcelable(r3)
            com.google.android.libraries.lens.view.InProcessBitmap r3 = (com.google.android.libraries.lens.view.InProcessBitmap) r3
            if (r3 == 0) goto L_0x03de
            com.google.common.base.ax r4 = r3.mo30182a()
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x03de
            com.google.common.base.ax r3 = r3.mo30182a()
            java.lang.Object r3 = r3.mo56107c()
            r7 = r3
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
        L_0x03de:
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r7)
            r4 = r2
            com.google.android.libraries.lens.view.l.a r4 = (com.google.android.libraries.lens.view.p2148l.C27221a) r4
            r4.f74418b = r3
            java.lang.String r3 = r0.getString(r9)
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r3)
            r4.f74421e = r3
            byte[] r3 = r0.getByteArray(r10)
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r3)
            r4.f74419c = r3
            java.lang.String r3 = "injected_image_uri_string"
            boolean r5 = r0.containsKey(r3)
            if (r5 == 0) goto L_0x040e
            java.lang.String r3 = r0.getString(r3)
            if (r3 == 0) goto L_0x040e
            android.net.Uri r0 = android.net.Uri.parse(r3)
            goto L_0x0416
        L_0x040e:
            java.lang.String r3 = "injected_image_uri"
            android.os.Parcelable r0 = r0.getParcelable(r3)
            android.net.Uri r0 = (android.net.Uri) r0
        L_0x0416:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            r4.f74417a = r0
            com.google.android.libraries.lens.view.l.h r0 = r2.mo32662a()
        L_0x0420:
            r1.f380369l = r0
        L_0x0422:
            r16.mo115330C()
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            r2 = r17
            com.google.android.libraries.search.p2476a.p2477a.C32151a.m59929e(r1, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.lens.C139924b.mo115339A(com.google.apps.tiktok.account.api.controller.b, dagger.a, com.google.common.o.zp, boolean):void");
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        this.f380374r = awVar.f120815a.f120816a;
        C0154a aVar = new C0154a(mo545jw());
        C26894i v = mo115340v();
        if (v != null) {
            aVar.mo516m(v);
        }
        C27458o w = mo115341w();
        if (w != null) {
            aVar.mo516m(w);
        }
        aVar.mo509f();
        mo115343B();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f380366o.mo56226d()).mo56382g(th)).mo56372aa(41472)).mo56386p("Account error occurred");
        finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }

    public final void finish() {
        super.finish();
        if (C62632i.m94823h(this.f380368k.mo32701h())) {
            overridePendingTransition(R.anim.lens_translate_ux_fade_in, R.anim.lens_translate_ux_fade_out);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo1324o() {
        if (mo115341w() == null) {
            this.f380375s = true;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1234) {
            C27458o w = mo115341w();
            w.getClass();
            ((C25519b) w.mo17754z().f76813x.mo27525b()).mo30557h(i2, intent);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f380376t = true;
        mo115343B();
    }

    public void onBackPressed() {
        C28201o d;
        C28191f a;
        C27458o w = mo115341w();
        if (w != null) {
            C28206x a2 = w.mo17754z();
            if (!a2.f76791b.getChildFragmentManager().mo461ab()) {
                if (!a2.f76791b.getChildFragmentManager().mo462ac()) {
                    C27292ai aiVar = (C27292ai) a2.f76791b.getChildFragmentManager().f634a.mo671c("main_fragment");
                    if (aiVar != null) {
                        C27384dt a3 = aiVar.mo17754z();
                        FragmentManager childFragmentManager = a3.f74987g.getChildFragmentManager();
                        C27073c cVar = (C27073c) childFragmentManager.f634a.mo671c("info_panel_fragment");
                        if (cVar != null && (d = cVar.mo17754z().mo32625d()) != null && (a = d.mo17754z().mo33715a()) != null && a.mo17754z().f76738l.mo46338g(new C28194i())) {
                            return;
                        }
                        if (childFragmentManager.mo461ab() || !childFragmentManager.mo462ac()) {
                            if (a3.f74998r.mo33735f()) {
                                return;
                            }
                            if (a3.mo32943ae() || a3.mo32944af()) {
                                if (a3.f74957ba.mo30525b()) {
                                    a3.f74891M.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(a3.f74914aJ));
                                }
                                if (a3.f75005y.mo32445l()) {
                                    a3.mo32934U();
                                    a3.f74881C.mo32878i();
                                    return;
                                } else if (a3.f74947aq && cVar != null && a3.f75005y.mo32435a() == C26968d.FULLY_EXPANDED) {
                                    a3.f75005y.mo32441h(C26968d.OPEN);
                                    return;
                                } else if (!a3.f74957ba.mo30525b() || !a3.f74952av) {
                                    a3.mo32920F();
                                    return;
                                } else {
                                    return;
                                }
                            }
                        } else if (cVar != null) {
                            cVar.mo17754z().mo32635o();
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo115330C();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            com.google.android.libraries.lens.view.l.l r0 = r4.f380368k
            com.google.common.base.ax r1 = r0.mo32701h()
            boolean r1 = com.google.lens.p4711m.C62632i.m94819d(r1)
            if (r1 != 0) goto L_0x0016
            com.google.common.base.ax r0 = r0.mo32701h()
            boolean r0 = com.google.lens.p4711m.C62632i.m94817b(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0016:
            r0 = 2132150768(0x7f1609f0, float:1.994358E38)
            r4.setTheme(r0)
        L_0x001c:
            android.content.Intent r0 = r4.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1 = 0
            if (r5 == 0) goto L_0x0030
            java.lang.String r2 = "theme-override"
            boolean r2 = r5.getBoolean(r2, r1)
            if (r2 == 0) goto L_0x0030
            goto L_0x0090
        L_0x0030:
            com.google.common.o.zp r2 = r4.f380370m
            com.google.common.o.zp r3 = com.google.common.p4552o.C60700zp.DIRECT_INTENT
            if (r2 != r3) goto L_0x004d
            com.google.android.libraries.lens.sdk.intent.e r0 = com.google.android.libraries.lens.view.p2051ab.C24968a.m46214c(r0)
            if (r0 == 0) goto L_0x0056
            android.os.Bundle r2 = r0.f68071a
            java.lang.String r3 = "theme"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0056
            android.os.Bundle r0 = r0.f68071a
            int r0 = r0.getInt(r3)
            goto L_0x0057
        L_0x004d:
            if (r0 == 0) goto L_0x0056
            java.lang.String r2 = "lens_theme"
            int r0 = r0.getInt(r2, r1)
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 != 0) goto L_0x0072
            com.google.android.libraries.lens.view.l.l r0 = r4.f380368k
            com.google.common.base.ax r0 = r0.mo32701h()
            java.lang.Object r0 = r0.mo56111f()
            java.lang.String r0 = (java.lang.String) r0
            com.google.lens.j.ea r0 = com.google.lens.p4711m.C62632i.m94816a(r0)
            com.google.lens.j.ea r2 = com.google.lens.p4707j.C62505ea.XGA
            if (r0 == r2) goto L_0x0090
            com.google.lens.j.ea r2 = com.google.lens.p4707j.C62505ea.ASSISTANT
            if (r0 == r2) goto L_0x0090
            r0 = 0
        L_0x0072:
            r2 = 1
            if (r0 == r2) goto L_0x0089
            r2 = 2
            if (r0 == r2) goto L_0x0081
            android.support.v7.app.v r0 = r4.mo1322k()
            r2 = -1
            r0.mo1191s(r2)
            goto L_0x0090
        L_0x0081:
            android.support.v7.app.v r0 = r4.mo1322k()
            r0.mo1191s(r2)
            goto L_0x0090
        L_0x0089:
            android.support.v7.app.v r0 = r4.mo1322k()
            r0.mo1191s(r2)
        L_0x0090:
            r4.f380371n = r5
            super.onCreate(r5)
            if (r5 == 0) goto L_0x00aa
            java.lang.String r0 = "account-id"
            boolean r2 = r5.containsKey(r0)
            if (r2 == 0) goto L_0x00aa
            android.os.Parcelable r5 = r5.getParcelable(r0)
            com.google.apps.tiktok.account.AccountId r5 = (com.google.apps.tiktok.account.AccountId) r5
            r5.getClass()
            r4.f380374r = r5
        L_0x00aa:
            boolean r5 = r4.isFinishing()
            if (r5 == 0) goto L_0x00b1
            return
        L_0x00b1:
            com.google.android.libraries.lens.view.l.l r5 = r4.f380368k
            com.google.common.base.ax r5 = r5.mo32701h()
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x0111
            com.google.android.libraries.lens.view.l.l r5 = r4.f380368k
            com.google.common.base.ax r5 = r5.mo32703i()
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x00f3
            com.google.android.libraries.lens.view.l.l r5 = r4.f380368k
            com.google.common.base.ax r5 = r5.mo32701h()
            java.lang.Object r5 = r5.mo56107c()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.libraries.lens.view.l.l r0 = r4.f380368k
            com.google.common.base.ax r0 = r0.mo32703i()
            java.lang.Object r0 = r0.mo56107c()
            java.util.List r0 = (java.util.List) r0
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.apps.search.lens.a r1 = com.google.android.apps.search.lens.C139915a.f380351a
            j$.util.stream.IntStream r0 = r0.mapToInt(r1)
            int[] r0 = r0.toArray()
            r4.m227543z(r5, r0)
            goto L_0x0111
        L_0x00f3:
            com.google.lens.j.ea r5 = com.google.lens.p4707j.C62505ea.CHROMIUM
            com.google.common.b.hu r0 = com.google.lens.p4711m.C62632i.f169089b
            com.google.common.b.gg r5 = r0.mo55423a(r5)
            com.google.common.b.sl r5 = r5.iterator()
        L_0x00ff:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            int[] r2 = new int[r1]
            r4.m227543z(r0, r2)
            goto L_0x00ff
        L_0x0111:
            com.google.common.o.zp r5 = r4.f380370m
            com.google.common.o.zp r0 = com.google.common.p4552o.C60700zp.DIRECT_INTENT
            if (r5 == r0) goto L_0x0141
            java.lang.String r5 = "com.google.android.googlequicksearchbox"
            java.lang.String r0 = r4.getPackageName()
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0141
            android.app.ActivityManager$TaskDescription r5 = new android.app.ActivityManager$TaskDescription
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2132089039(0x7f1518cf, float:1.9818378E38)
            java.lang.String r0 = r0.getString(r1)
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131233890(0x7f080c62, float:1.808393E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r2)
            r5.<init>(r0, r1)
            r4.setTaskDescription(r5)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.lens.C139924b.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C27292ai aiVar;
        C27235b bVar;
        int i2;
        C27458o w = mo115341w();
        if (w != null) {
            C28206x a = w.mo17754z();
            if (!a.f76791b.getChildFragmentManager().mo461ab() && (aiVar = (C27292ai) a.f76791b.getChildFragmentManager().f634a.mo671c("main_fragment")) != null) {
                C27384dt a2 = aiVar.mo17754z();
                if ((a2.mo32943ae() || a2.mo32944af()) && (bVar = a2.f74925aU) != null) {
                    C27236c a3 = bVar.mo17754z();
                    if (i != 24) {
                        i2 = 25;
                        if (i == 25) {
                            i = 25;
                        }
                    } else {
                        i2 = i;
                    }
                    if (a3.f74507a.mo32784i()) {
                        C27236c a4 = a2.f74925aU.mo17754z();
                        if (i2 == 24) {
                            a4.f74507a.mo32783h(false);
                        }
                    }
                }
            }
        }
        if (super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo115343B();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        super.onRequestPermissionsResult(i, strArr, iArr);
        C27458o w = mo115341w();
        w.getClass();
        C25509ao aoVar = (C25509ao) w.mo17754z().f76814y.mo27525b();
        C19559g.m37304c();
        C25507am amVar = aoVar.f69469i;
        aoVar.f69469i = null;
        if (amVar == null) {
            ((C58970a) ((C58970a) C25509ao.f69461a.mo56225c()).mo56372aa(50135)).mo56359L("Received %s for permissions %s, code %s but no pending permission request.", Arrays.toString(iArr), Arrays.toString(strArr), Integer.valueOf(i));
            return;
        }
        C25525h hVar = (C25525h) amVar;
        String[] strArr3 = (String[]) Collection.EL.toArray(hVar.f69511b, C25505ak.f69456a);
        int length = strArr3.length;
        boolean[] zArr = new boolean[length];
        C58526ih ihVar = new C58526ih();
        if (strArr2.length == 0) {
            ((C58970a) ((C58970a) C25509ao.f69461a.mo56226d()).mo56372aa(50134)).mo56389s("Permission request for %s cancelled. Treating as denial", Arrays.toString(strArr3));
        } else if (!Arrays.equals(strArr2, strArr3) || iArr2.length != length) {
            ((C58970a) ((C58970a) C25509ao.f69461a.mo56225c()).mo56372aa(50133)).mo56359L("Received %s for permissions %s while waiting for %s. Treating as denial", Arrays.toString(iArr), Arrays.toString(strArr), Arrays.toString(strArr3));
        } else {
            for (int i3 = 0; i3 < length; i3++) {
                boolean z = iArr2[i3] == 0;
                zArr[i3] = z;
                if (z) {
                    ihVar.mo55373c(strArr2[i3]);
                }
                C25508an anVar = (C25508an) aoVar.f69467g.get(strArr2[i3]);
                if (anVar != null) {
                    boolean z2 = zArr[i3];
                    C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
                    C59927ci i4 = C25509ao.m46982i(hVar.f69512c);
                    bhVar.copyOnWrite();
                    C59900bi biVar = (C59900bi) bhVar.instance;
                    i4.getClass();
                    biVar.f161900h = i4;
                    biVar.f161893a |= 65536;
                    if (z2) {
                        i2 = anVar.f69459b;
                        if (i2 == -1) {
                        }
                    } else if (anVar.f69460c != -1) {
                        long b = aoVar.f69464d.mo26870b() - hVar.f69513d;
                        int i5 = b < 0 ? 1 : b > 300 ? 2 : 3;
                        C59923ce ceVar = (C59923ce) C59925cg.f161965c.createBuilder();
                        ceVar.copyOnWrite();
                        C59925cg cgVar = (C59925cg) ceVar.instance;
                        cgVar.f161968b = i5 - 1;
                        cgVar.f161967a = 1 | cgVar.f161967a;
                        C59925cg cgVar2 = (C59925cg) ceVar.build();
                        bhVar.copyOnWrite();
                        C59900bi biVar2 = (C59900bi) bhVar.instance;
                        cgVar2.getClass();
                        biVar2.f161899g = cgVar2;
                        biVar2.f161893a |= 16384;
                        i2 = anVar.f69460c;
                    }
                    C28448r rVar = aoVar.f69465e;
                    C28446p a = C28447q.m53152a(i2);
                    a.mo33898b(C45954d.m82060a(aoVar.f69466f.f69824a));
                    a.f77232a.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
                    rVar.mo33855a(a.mo33897a());
                }
            }
        }
        hVar.f69510a.mo30530a(zArr);
        C58528ij f = ihVar.mo55486f();
        aoVar.f69462b.addAll(f);
        aoVar.f69463c.f69475a.addAll(f);
        C25758g gVar = aoVar.f69468h;
        C58526ih ihVar2 = new C58526ih();
        ihVar2.mo55489i((Iterable) aoVar.f69468h.mo3842a());
        ihVar2.mo55489i(f);
        C58528ij f2 = ihVar2.mo55486f();
        f2.getClass();
        gVar.mo5708l(f2);
    }

    public void onResume() {
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AccountId accountId = this.f380374r;
        if (accountId != null) {
            bundle.putParcelable("account-id", accountId);
        }
        C27458o w = mo115341w();
        if (w != null) {
            w.mo17754z();
            bundle.putBoolean("theme-override", false);
            C28206x a = w.mo17754z();
            bundle.putParcelable("lensView_configFlags", a.f76795f);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("ActivityIntentOpener_pendingCallbackId", ((C25519b) a.f76813x.mo27525b()).f69484a.ordinal());
            bundle.putBundle("lensView_intentOpener", bundle2);
            bundle.putString("LensAccountName", a.f76793d);
            bundle.putByteArray("lensView_lensViewStartIdState", a.f76805p.f76837c.toByteArray());
        }
    }

    public void onStart() {
        super.onStart();
        C26894i v = mo115340v();
        if (v != null) {
            v.mo17754z().mo32805b(this);
        }
    }

    public void onStop() {
        C26894i v = mo115340v();
        if (v != null) {
            v.mo17754z().mo32805b((C27220l) null);
        }
        super.onStop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final C26894i mo115340v() {
        return (C26894i) mo545jw().f634a.mo671c("AccountResolverFragment");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final C27458o mo115341w() {
        return (C27458o) mo545jw().f634a.mo670b(16908290);
    }

    /* renamed from: x */
    public final void mo33508x() {
        finish();
    }

    /* renamed from: y */
    public final void mo32661y(AccountId accountId) {
        C58838bb.m90884s(accountId.equals(this.f380374r), "resolved stale account");
        C0154a aVar = new C0154a(mo545jw());
        C26894i v = mo115340v();
        v.getClass();
        aVar.mo516m(v);
        aVar.mo689v(16908290, C28206x.m52761a(accountId), (String) null);
        aVar.mo509f();
    }
}
