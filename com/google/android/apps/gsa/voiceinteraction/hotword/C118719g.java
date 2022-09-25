package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.app.AppOpsManager;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import com.google.android.apps.gsa.shared.bisto.C89606ad;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.hotword.service.HotwordInformation;
import com.google.android.libraries.assistant.hotword.C18339al;
import com.google.android.libraries.assistant.hotword.C18370g;
import com.google.android.libraries.assistant.hotword.C18375l;
import com.google.android.libraries.assistant.hotword.C18384u;
import com.google.android.libraries.assistant.hotword.data.AutoValue_HotwordData;
import com.google.android.libraries.assistant.hotword.data.HotwordData;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.g */
/* compiled from: PG */
public final class C118719g {

    /* renamed from: a */
    public static final C59071e f331138a = C59071e.m91332i("com.google.android.apps.gsa.voiceinteraction.hotword.g");

    /* renamed from: b */
    public C18375l f331139b;

    /* renamed from: c */
    public C18339al f331140c = null;

    /* renamed from: d */
    final C118717e f331141d;

    /* renamed from: e */
    final C22871g f331142e;

    /* renamed from: f */
    final C60888db f331143f;

    /* renamed from: g */
    final Executor f331144g;

    /* renamed from: h */
    final Context f331145h;

    /* renamed from: i */
    final C18370g f331146i;

    /* renamed from: j */
    public final C118720h f331147j;

    /* renamed from: k */
    public HotwordInformation f331148k;

    /* renamed from: l */
    public HotwordData f331149l;

    /* renamed from: m */
    public boolean f331150m;

    /* renamed from: n */
    AppOpsManager f331151n;

    /* renamed from: o */
    public boolean f331152o;

    /* renamed from: p */
    C118718f f331153p;

    /* renamed from: q */
    final C118715c f331154q;

    /* renamed from: r */
    private final C68214a f331155r;

    /* renamed from: s */
    private final C68214a f331156s;

    /* renamed from: t */
    private final C68214a f331157t;

    /* renamed from: u */
    private final C58833ax f331158u;

    /* renamed from: v */
    private int f331159v;

    public C118719g(C22871g gVar, C60888db dbVar, Executor executor, C118717e eVar, C68214a aVar, Context context, C68214a aVar2, C68214a aVar3, C58833ax axVar, C68214a aVar4) {
        Context context2 = context;
        C118714b bVar = new C118714b(this);
        this.f331146i = bVar;
        C118715c cVar = new C118715c(this);
        this.f331154q = cVar;
        this.f331148k = null;
        this.f331149l = null;
        this.f331150m = false;
        this.f331159v = 0;
        this.f331141d = eVar;
        C22871g gVar2 = gVar;
        this.f331142e = gVar2;
        C60888db dbVar2 = dbVar;
        this.f331143f = dbVar2;
        this.f331144g = executor;
        this.f331145h = context2;
        this.f331155r = aVar2;
        this.f331156s = aVar3;
        this.f331157t = aVar4;
        this.f331158u = axVar;
        this.f331139b = new C18384u(dbVar2, gVar2, cVar, bVar, context);
        C68214a aVar5 = aVar;
        this.f331147j = new C118720h(aVar);
        if (Build.VERSION.SDK_INT >= 30 && context2 != null) {
            this.f331151n = (AppOpsManager) context.getSystemService("appops");
        }
    }

    /* renamed from: a */
    public final Uri mo103909a() {
        ParcelFileDescriptor b = this.f331139b.mo23790b();
        if (b == null) {
            C59104x b2 = f331138a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "HwDetectorWithState");
            ((C59052c) ((C59052c) b2).mo56372aa(34100)).mo56386p("Returning null URI");
            return null;
        }
        try {
            long detachFd = (long) b.detachFd();
            if (detachFd == -1) {
                return null;
            }
            C58976aa aaVar = C58975e.f156826a;
            Uri withAppendedId = ContentUris.withAppendedId(C90721ae.f253802k, detachFd);
            if (!(withAppendedId == null || this.f331151n == null || Build.VERSION.SDK_INT < 30 || this.f331145h == null)) {
                this.f331152o = true;
                this.f331151n.startOp("android:record_audio", Process.myUid(), this.f331145h.getPackageName(), C39227c.m68658b(C39226b.TAG_CLASSIC_ASSISTANT_URI_VIS), (String) null);
            }
            return withAppendedId;
        } catch (IllegalStateException e) {
            C59104x c = f331138a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HwDetectorWithState");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34099)).mo56386p("IllegalStateException thrown in getContentUri method");
            return null;
        }
    }

    /* renamed from: b */
    public final void mo103910b() {
        if (!this.f331150m) {
            if (this.f331139b instanceof C118725m) {
                HotwordInformation hotwordInformation = this.f331148k;
                if (hotwordInformation != null && !hotwordInformation.f395877I) {
                    return;
                }
            } else {
                return;
            }
        }
        if (this.f331149l != null) {
            this.f331143f.execute(new C118713a(this));
        }
    }

    /* renamed from: c */
    public final void mo103911c() {
        mo103912d();
        HotwordData hotwordData = this.f331149l;
        if (hotwordData == null) {
            C59104x c = f331138a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HwDetectorWithState");
            ((C59052c) ((C59052c) c).mo56372aa(34102)).mo56386p("No HotwordData.  Cannot start hotword detection.");
            return;
        }
        C18375l lVar = this.f331139b;
        if (!(lVar instanceof C118725m) && this.f331150m && lVar.mo23797k() == 2) {
            C59104x b = f331138a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HwDetectorWithState");
            ((C59052c) ((C59052c) b).mo56372aa(34101)).mo56386p("Falling back to Micro.");
            this.f331150m = false;
            this.f331139b.mo23792d();
            C18384u uVar = new C18384u(this.f331143f, this.f331142e, this.f331154q, this.f331146i, this.f331145h);
            this.f331139b = uVar;
            uVar.mo23794f(hotwordData);
            HotwordInformation hotwordInformation = this.f331148k;
            if (hotwordInformation != null) {
                this.f331139b.mo23793e(hotwordInformation.f395889j);
            }
            this.f331159v++;
        }
    }

    /* renamed from: d */
    public final void mo103912d() {
        if (this.f331149l == null) {
            C59104x c = f331138a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HwDetectorWithState");
            ((C59052c) ((C59052c) c).mo56372aa(34103)).mo56386p("No HotwordData.  Cannot initialize detector.");
        } else if (this.f331139b.mo23797k() == 1) {
            this.f331139b.mo23794f(this.f331149l);
        }
    }

    /* renamed from: e */
    public final synchronized void mo103913e() {
        C118720h hVar = this.f331147j;
        HotwordInformation hotwordInformation = this.f331148k;
        boolean z = hotwordInformation.f395885f;
        boolean z2 = hotwordInformation.f395893n;
        ((C59052c) ((C59052c) C118720h.f331160a.mo56225c()).mo56372aa(34116)).mo56364Q("FASE: %b, SHwR: %b, ACR: %b, HR: %b, ACbSS: %b, ACbHE: %b, SO:%b, ARS: %b", Boolean.valueOf(z), Boolean.valueOf(hVar.f331166g), Boolean.valueOf(this.f331139b.mo23879i()), Boolean.valueOf(hVar.f331162c), Boolean.valueOf(hVar.f331163d), Boolean.valueOf(hVar.f331164e), Boolean.valueOf(hVar.f331165f), Boolean.valueOf(z2));
    }

    /* renamed from: f */
    public final synchronized void mo103914f() {
        this.f331147j.mo103922a();
    }

    /* renamed from: g */
    public final synchronized void mo103915g() {
        this.f331147j.mo103923b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0120, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0121 A[SYNTHETIC, Splitter:B:68:0x0121] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo103916h() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            com.google.android.hotword.service.HotwordInformation r0 = r1.f331148k     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0126
            com.google.android.apps.gsa.voiceinteraction.hotword.f r0 = r1.f331153p     // Catch:{ all -> 0x012e }
            r2 = 1
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.hasMessages(r2)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0017
            com.google.android.apps.gsa.voiceinteraction.hotword.f r0 = r1.f331153p     // Catch:{ all -> 0x012e }
            r0.removeMessages(r2)     // Catch:{ all -> 0x012e }
        L_0x0017:
            com.google.android.apps.gsa.voiceinteraction.hotword.h r0 = r1.f331147j     // Catch:{ all -> 0x012e }
            com.google.android.hotword.service.HotwordInformation r3 = r1.f331148k     // Catch:{ all -> 0x012e }
            boolean r4 = r3.f395885f     // Catch:{ all -> 0x012e }
            boolean r3 = r3.f395893n     // Catch:{ all -> 0x012e }
            com.google.android.libraries.assistant.hotword.l r5 = r1.f331139b     // Catch:{ all -> 0x012e }
            boolean r5 = r5.mo23879i()     // Catch:{ all -> 0x012e }
            dagger.a r6 = r0.f331161b     // Catch:{ all -> 0x012e }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x012e }
            com.google.android.apps.gsa.shared.util.v r6 = (com.google.android.apps.gsa.shared.util.C91123v) r6     // Catch:{ all -> 0x012e }
            boolean r6 = r6.mo85390b()     // Catch:{ all -> 0x012e }
            if (r6 == 0) goto L_0x0074
            com.google.common.f.e r6 = com.google.android.apps.gsa.voiceinteraction.hotword.C118720h.f331160a     // Catch:{ all -> 0x012e }
            com.google.common.f.x r6 = r6.mo56224b()     // Catch:{ all -> 0x012e }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x012e }
            r7 = 34114(0x8542, float:4.7804E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r7)     // Catch:{ all -> 0x012e }
            r7 = r6
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x012e }
            java.lang.String r8 = "#nextHotwordState isFromAnyScreenEnabled: %b, isSoftwareHotwordRequested: %b, isAudioCaptureRunning: %b, mIsHotwordRunning: %b, mIsAudioCapturedBySearchService: %b, mIsAudioCapturedByHotwordEnrollment: %b, mLastReportedIsScreenOn:%b, AlwaysRunSoftwareEnabled: %b"
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x012e }
            boolean r6 = r0.f331166g     // Catch:{ all -> 0x012e }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x012e }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x012e }
            boolean r6 = r0.f331162c     // Catch:{ all -> 0x012e }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x012e }
            boolean r6 = r0.f331163d     // Catch:{ all -> 0x012e }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x012e }
            boolean r6 = r0.f331164e     // Catch:{ all -> 0x012e }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x012e }
            boolean r6 = r0.f331165f     // Catch:{ all -> 0x012e }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x012e }
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x012e }
            r7.mo56364Q(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x012e }
        L_0x0074:
            boolean r6 = r0.f331162c     // Catch:{ all -> 0x012e }
            r7 = 2
            r8 = 3
            if (r6 == 0) goto L_0x0088
            boolean r9 = r0.f331163d     // Catch:{ all -> 0x012e }
            if (r9 != 0) goto L_0x0086
            boolean r9 = r0.f331164e     // Catch:{ all -> 0x012e }
            if (r9 != 0) goto L_0x0086
            boolean r9 = r0.f331167h     // Catch:{ all -> 0x012e }
            if (r9 == 0) goto L_0x0088
        L_0x0086:
            r9 = 3
            goto L_0x00bb
        L_0x0088:
            r9 = 4
            if (r6 != 0) goto L_0x0098
            boolean r10 = r0.f331163d     // Catch:{ all -> 0x012e }
            if (r10 != 0) goto L_0x00bb
            boolean r10 = r0.f331164e     // Catch:{ all -> 0x012e }
            if (r10 != 0) goto L_0x00bb
            boolean r10 = r0.f331167h     // Catch:{ all -> 0x012e }
            if (r10 == 0) goto L_0x0098
            goto L_0x00bb
        L_0x0098:
            if (r4 != 0) goto L_0x00a3
            if (r3 != 0) goto L_0x00a3
            boolean r10 = r0.f331166g     // Catch:{ all -> 0x012e }
            if (r10 != 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00bb
            goto L_0x0086
        L_0x00a3:
            boolean r10 = r0.f331165f     // Catch:{ all -> 0x012e }
            if (r10 != 0) goto L_0x00b3
            if (r3 == 0) goto L_0x00aa
            goto L_0x00b3
        L_0x00aa:
            if (r4 != 0) goto L_0x00b0
            boolean r0 = r0.f331166g     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x00bb
        L_0x00b0:
            if (r6 == 0) goto L_0x00bb
            goto L_0x0086
        L_0x00b3:
            if (r6 == 0) goto L_0x00b6
            goto L_0x00bb
        L_0x00b6:
            if (r5 == 0) goto L_0x00ba
            r9 = 2
            goto L_0x00bb
        L_0x00ba:
            r9 = 1
        L_0x00bb:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x012e }
            com.google.common.f.e r0 = f331138a     // Catch:{ all -> 0x012e }
            com.google.common.f.x r3 = r0.mo56224b()     // Catch:{ all -> 0x012e }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x012e }
            java.lang.String r5 = "HwDetectorWithState"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x012e }
            int r9 = r9 + -1
            java.lang.String r4 = "a: %d"
            r5 = 34104(0x8538, float:4.779E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56387q(r4, r9)     // Catch:{ all -> 0x012e }
            if (r9 == r2) goto L_0x0121
            if (r9 == r7) goto L_0x010b
            if (r9 == r8) goto L_0x011f
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x012e }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x012e }
            java.lang.String r3 = "HwDetectorWithState"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "#startMicHotword"
            r3 = 34111(0x853f, float:4.78E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x012e }
            r17.mo103914f()     // Catch:{ all -> 0x012e }
            r17.mo103911c()     // Catch:{ all -> 0x012e }
            com.google.android.libraries.assistant.hotword.l r0 = r1.f331139b     // Catch:{ all -> 0x012e }
            com.google.android.hotword.service.HotwordInformation r2 = r1.f331148k     // Catch:{ all -> 0x012e }
            int r3 = r2.f395874F     // Catch:{ all -> 0x012e }
            boolean r2 = r2.f395894o     // Catch:{ all -> 0x012e }
            com.google.common.util.concurrent.cx r0 = r0.mo23791c(r3, r2)     // Catch:{ all -> 0x012e }
            com.google.android.apps.gsa.voiceinteraction.hotword.d r2 = new com.google.android.apps.gsa.voiceinteraction.hotword.d     // Catch:{ all -> 0x012e }
            r2.<init>(r1)     // Catch:{ all -> 0x012e }
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x012e }
            com.google.common.util.concurrent.C60856cj.m92911t(r0, r2, r3)     // Catch:{ all -> 0x012e }
            monitor-exit(r17)
            return
        L_0x010b:
            r17.mo103921m()     // Catch:{ all -> 0x012e }
            com.google.android.libraries.assistant.hotword.l r0 = r1.f331139b     // Catch:{ all -> 0x012e }
            com.google.android.libraries.assistant.hotword.h r0 = r0.f52149p     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x011f
            com.google.android.hotword.service.HotwordInformation r2 = r1.f331148k     // Catch:{ all -> 0x012e }
            boolean r2 = r2.f395894o     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x011f
            r0.mo23809c()     // Catch:{ all -> 0x012e }
            monitor-exit(r17)
            return
        L_0x011f:
            monitor-exit(r17)
            return
        L_0x0121:
            r17.mo103917i()     // Catch:{ all -> 0x012e }
            monitor-exit(r17)
            return
        L_0x0126:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Hotword Information is null."
            r0.<init>(r2)     // Catch:{ all -> 0x012e }
            throw r0     // Catch:{ all -> 0x012e }
        L_0x012e:
            r0 = move-exception
            monitor-exit(r17)
            goto L_0x0132
        L_0x0131:
            throw r0
        L_0x0132:
            goto L_0x0131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.voiceinteraction.hotword.C118719g.mo103916h():void");
    }

    /* renamed from: i */
    public final void mo103917i() {
        if (this.f331153p == null) {
            this.f331153p = new C118718f(this);
        }
        this.f331153p.sendEmptyMessageDelayed(1, 5000);
    }

    /* renamed from: j */
    public final void mo103918j() {
        this.f331147j.f331167h = true;
        if (this.f331139b instanceof C118725m) {
            C18339al alVar = new C18339al(this.f331143f, this.f331144g, this.f331154q, this.f331146i, this.f331145h, ((C38780c) this.f331156s.mo27525b()).mo41619a(C38828b.HOTWORD_LIBRARY_ANDROID), this.f331155r, this.f331157t);
            this.f331140c = alVar;
            HotwordData hotwordData = this.f331149l;
            if (hotwordData != null) {
                alVar.mo23794f(hotwordData);
            }
        }
    }

    /* renamed from: k */
    public final void mo103919k() {
        HotwordData hotwordData = this.f331149l;
        if (hotwordData != null) {
            this.f331139b.mo23794f(hotwordData);
            C18339al alVar = this.f331140c;
            if (alVar != null) {
                alVar.mo23794f(this.f331149l);
            }
            mo103911c();
        }
    }

    /* renamed from: l */
    public final void mo103920l(HotwordInformation hotwordInformation) {
        boolean z;
        HotwordInformation hotwordInformation2;
        HotwordInformation hotwordInformation3 = hotwordInformation;
        C58976aa aaVar = C58975e.f156826a;
        this.f331148k = hotwordInformation3;
        if (hotwordInformation3 != null) {
            boolean z2 = false;
            if (!C118726n.m197095c(hotwordInformation3.f395869A) ? this.f331150m == hotwordInformation3.f395895p || this.f331159v >= 10 : (this.f331139b instanceof C118725m)) {
                z = false;
            } else {
                C59104x b = f331138a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HwDetectorWithState");
                ((C59052c) ((C59052c) b).mo56372aa(34113)).mo56386p("Updating detector.");
                this.f331139b.mo23792d();
                HotwordInformation hotwordInformation4 = this.f331148k;
                if (C118726n.m197095c(hotwordInformation4.f395869A) && !hotwordInformation4.f395882c) {
                    this.f331139b = new C118725m(this.f331154q, this.f331145h, this.f331143f);
                } else if (hotwordInformation4.f395895p) {
                    this.f331139b = new C18339al(this.f331143f, this.f331144g, this.f331154q, this.f331146i, this.f331145h, ((C38780c) this.f331156s.mo27525b()).mo41619a(C38828b.HOTWORD_LIBRARY_ANDROID), this.f331155r, this.f331157t);
                    this.f331150m = true;
                } else {
                    this.f331139b = new C18384u(this.f331143f, this.f331142e, this.f331154q, this.f331146i, this.f331145h);
                    this.f331150m = false;
                }
                this.f331139b.mo23793e(this.f331148k.f395889j);
                z = true;
            }
            byte[] bArr = hotwordInformation3.f395875G;
            boolean z3 = bArr == null;
            SpeakerIdModel speakerIdModel = hotwordInformation3.f395887h;
            if (this.f331158u.mo56113h() && ((C89606ad) this.f331158u.mo56107c()).mo83476v()) {
                z2 = true;
            }
            HotwordInformation hotwordInformation5 = this.f331148k;
            if (hotwordInformation5 != null && hotwordInformation5.f395882c && !hotwordInformation5.f395883d && !z2 && hotwordInformation5.f395887h != null) {
                speakerIdModel = null;
            }
            SpeakerIdModel speakerIdModel2 = speakerIdModel;
            if (!z3) {
                this.f331149l = new AutoValue_HotwordData(hotwordInformation3.f395888i, speakerIdModel2, bArr, hotwordInformation3.f395889j, hotwordInformation3.f395896q, hotwordInformation3.f395903x, hotwordInformation3.f395904y, hotwordInformation3.f395905z, hotwordInformation3.f395874F, hotwordInformation3.f395870B);
            }
            if (this.f331149l != null) {
                if (this.f331150m || !(this.f331139b instanceof C118725m) || ((hotwordInformation2 = this.f331148k) != null && hotwordInformation2.f395877I)) {
                    HotwordInformation hotwordInformation6 = this.f331148k;
                    if (hotwordInformation6 == null) {
                        return;
                    }
                    if ((!hotwordInformation6.f395883d || (hotwordInformation6.f395877I && (this.f331139b instanceof C118725m))) && !hotwordInformation6.f395885f && !hotwordInformation6.f395893n && !z2 && this.f331139b.mo23797k() == 1) {
                        return;
                    }
                }
                if (!z3 || z) {
                    mo103919k();
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo103921m() {
        C59104x b = f331138a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HwDetectorWithState");
        ((C59052c) ((C59052c) b).mo56372aa(34112)).mo56386p("#stopHotwordDetection");
        HotwordInformation hotwordInformation = this.f331148k;
        if (hotwordInformation != null && !hotwordInformation.f395878J) {
            mo103915g();
        }
        this.f331139b.mo23796h();
    }
}
