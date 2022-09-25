package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2476a.p2479c.C32209j;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46012bw;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.apps.tiktok.account.api.controller.C46054v;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.account.p3616e.p3617a.C46332a;
import com.google.apps.tiktok.account.p3616e.p3620d.C46347g;
import com.google.apps.tiktok.account.p3616e.p3620d.C46348h;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63042fg;
import com.google.protos.p5124m.p5125a.C65599b;
import com.google.protos.p5124m.p5125a.C65603f;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bb */
/* compiled from: PG */
public final class C126791bb implements C45987ay {

    /* renamed from: a */
    public static final C59071e f349159a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.roti.home.bb");

    /* renamed from: b */
    public final HomeActivity f349160b;

    /* renamed from: c */
    public final C143701ac f349161c;

    /* renamed from: d */
    public final boolean f349162d;

    /* renamed from: e */
    public final boolean f349163e;

    /* renamed from: f */
    public final C37215b f349164f;

    /* renamed from: g */
    public final C31639g f349165g;

    /* renamed from: h */
    public final boolean f349166h;

    /* renamed from: i */
    public final C65599b f349167i;

    /* renamed from: j */
    public int f349168j = -1;

    /* renamed from: k */
    public C126797bh f349169k = C126797bh.f349177j;

    /* renamed from: l */
    private final Context f349170l;

    /* renamed from: m */
    private final C28310af f349171m;

    /* renamed from: n */
    private final C58528ij f349172n;

    public C126791bb(HomeActivity homeActivity, C45989b bVar, C143701ac acVar, C28310af afVar, C46348h hVar, Context context, boolean z, boolean z2, boolean z3, C38780c cVar, C31639g gVar, C65603f fVar, boolean z4, C65599b bVar2) {
        this.f349160b = homeActivity;
        this.f349171m = afVar;
        this.f349161c = acVar;
        this.f349162d = z;
        this.f349163e = z2;
        this.f349164f = cVar.mo41619a(C38828b.GOOGLE_APP);
        this.f349165g = gVar;
        this.f349172n = C58528ij.m90006F(fVar.f178307a);
        this.f349166h = z4;
        this.f349167i = bVar2;
        this.f349170l = context;
        Bundle extras = homeActivity.getIntent().getExtras();
        if (!(extras == null || extras.getString("com.android.chrome.voice.EXPERIMENT_ID") == null)) {
            try {
                String string = extras.getString("com.android.chrome.voice.EXPERIMENT_ID");
                string.getClass();
                this.f349168j = Integer.parseInt(string);
            } catch (NumberFormatException unused) {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
        if (z3) {
            C46012bw e = C46013bx.m82201e(homeActivity);
            e.mo50147b().mo55395g(C126836cp.class);
            bVar.mo50083f(e.mo50146a());
            bVar.mo50082e(this);
            return;
        }
        C46012bw e2 = C46013bx.m82201e(homeActivity);
        e2.mo50147b().mo55395g(C46332a.class);
        bVar.mo50083f(e2.mo50146a());
        bVar.mo50082e(this);
        bVar.mo50082e(new C46347g(hVar));
    }

    /* renamed from: g */
    private final void m207419g(Fragment fragment) {
        C0154a aVar = new C0154a(this.f349160b.f727a.f739a.f744e);
        aVar.mo689v(16908290, fragment, (String) null);
        aVar.mo509f();
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        if (this.f349169k.equals(C126797bh.f349177j)) {
            mo107787e();
        }
        if (this.f349167i.f178301a.contains(Integer.valueOf(this.f349168j)) || this.f349166h) {
            AccountId accountId = awVar.f120815a.f120816a;
            C126797bh bhVar = this.f349169k;
            C126817bz bzVar = new C126817bz();
            C68324h.m98669f(bzVar);
            C47247a.m84047b(bzVar, accountId);
            C47243l.m84039a(bzVar, bhVar);
            m207419g(bzVar);
            return;
        }
        AccountId accountId2 = awVar.f120815a.f120816a;
        C126797bh bhVar2 = this.f349169k;
        C126795bf bfVar = new C126795bf();
        C68324h.m98669f(bfVar);
        C47247a.m84047b(bfVar, accountId2);
        C47243l.m84039a(bfVar, bhVar2);
        m207419g(bfVar);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C59104x b = f349159a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeActivityPeer");
        ((C59052c) ((C59052c) b).mo56372aa(37168)).mo56386p("Account error detected, falling back to intent-api activity");
        int i = 8;
        if ((th instanceof C46054v) && (th.getCause() instanceof C32209j)) {
            i = 14;
        }
        C37215b bVar = this.f349164f;
        C126797bh bhVar = this.f349169k;
        int i2 = bhVar.f349181c;
        C63042fg fgVar = bhVar.f349185g;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C126838cr.m207505d(bVar, i2, i, fgVar, this.f349169k.f349182d);
        mo107788f(this.f349160b.getIntent());
        this.f349160b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28313c a = this.f349171m.f76997b.mo33800a(C28427h.m53115a(119031));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(119026));
        a.mo33810c(this.f349160b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f0, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01b4, code lost:
        if (r1.f349323b.equals(r1.f349324c) == false) goto L_0x01b8;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107787e() {
        /*
            r8 = this;
            com.google.android.apps.search.assistant.surfaces.roti.home.HomeActivity r0 = r8.f349160b
            r0.getClass()
            android.content.Intent r0 = r0.getIntent()
            com.google.common.b.ij r1 = r8.f349172n
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r2 = com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh.f349177j
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.assistant.surfaces.roti.home.bg r2 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126796bg) r2
            android.os.Bundle r3 = r0.getExtras()
            if (r3 != 0) goto L_0x001e
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0040
        L_0x001e:
            java.lang.String r4 = "com.android.chrome.voice.EXPERIMENT_ID"
            java.lang.String r3 = r3.getString(r4)
            boolean r4 = com.google.common.base.C58837ba.m90859h(r3)
            if (r4 != 0) goto L_0x003c
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0037 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0037 }
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)     // Catch:{ NumberFormatException -> 0x0037 }
            goto L_0x0040
        L_0x0037:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0040
        L_0x003c:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x0040:
            p3186j$.util.Objects.requireNonNull(r2)
            com.google.android.apps.search.assistant.surfaces.roti.home.ck r4 = new com.google.android.apps.search.assistant.surfaces.roti.home.ck
            r4.<init>(r2)
            r3.ifPresent(r4)
            android.os.Bundle r0 = r0.getExtras()
            r3 = -1
            if (r0 != 0) goto L_0x0081
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r0 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r0
            int r1 = r0.f349179a
            r1 = r1 | 2
            r0.f349179a = r1
            r0.f349181c = r3
            r0 = 0
            com.google.protobuf.fg r0 = com.google.android.apps.search.assistant.surfaces.roti.home.C126832cl.m207495a(r0)
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r1 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r1
            r0.getClass()
            r1.f349185g = r0
            int r0 = r1.f349179a
            r0 = r0 | 16
            r1.f349179a = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r0 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r0
            goto L_0x01cd
        L_0x0081:
            java.lang.String r4 = "com.android.chrome.voice.VOICE_ENTRYPOINT"
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L_0x009d
            int r3 = r0.getInt(r4)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r4 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r4
            int r5 = r4.f349179a
            r5 = r5 | 2
            r4.f349179a = r5
            r4.f349181c = r3
            goto L_0x00ac
        L_0x009d:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r4 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r4
            int r5 = r4.f349179a
            r5 = r5 | 2
            r4.f349179a = r5
            r4.f349181c = r3
        L_0x00ac:
            java.lang.String r3 = "com.android.chrome.voice.PAGE_URL"
            java.lang.String r4 = r0.getString(r3)
            r5 = 1
            if (r4 == 0) goto L_0x00ca
            java.lang.String r3 = r0.getString(r3)
            r3.getClass()
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r4 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r4
            int r6 = r4.f349179a
            r6 = r6 | r5
            r4.f349179a = r6
            r4.f349180b = r3
        L_0x00ca:
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r3 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r3
            java.lang.String r3 = r3.f349180b
            com.google.common.b.sl r1 = r1.iterator()
        L_0x00d4:
            boolean r4 = r1.hasNext()
            r6 = 0
            if (r4 == 0) goto L_0x00e8
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L_0x00d4
            goto L_0x00f0
        L_0x00e8:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x00f0
            r1 = 1
            goto L_0x00f1
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r3 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r3
            int r4 = r3.f349179a
            r4 = r4 | 64
            r3.f349179a = r4
            r3.f349187i = r1
            com.google.android.apps.search.assistant.surfaces.roti.home.d r1 = com.google.android.apps.search.assistant.surfaces.roti.home.C126843d.f349320e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.assistant.surfaces.roti.home.c r1 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126818c) r1
            java.lang.String r3 = "com.android.chrome.voice.TRANSLATE_CURRENT_LANGUAGE"
            java.lang.String r4 = r0.getString(r3)
            if (r4 == 0) goto L_0x0125
            java.lang.String r3 = r0.getString(r3)
            r3.getClass()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.d r4 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126843d) r4
            int r7 = r4.f349322a
            r7 = r7 | r5
            r4.f349322a = r7
            r4.f349323b = r3
        L_0x0125:
            java.lang.String r3 = "com.android.chrome.voice.TRANSLATE_TARGET_LANGUAGE"
            java.lang.String r4 = r0.getString(r3)
            if (r4 == 0) goto L_0x0143
            java.lang.String r3 = r0.getString(r3)
            r3.getClass()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.d r4 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126843d) r4
            int r7 = r4.f349322a
            r7 = r7 | 2
            r4.f349322a = r7
            r4.f349324c = r3
        L_0x0143:
            java.lang.String r3 = "com.android.chrome.voice.TRANSLATE_ORIGINAL_LANGUAGE"
            java.lang.String r4 = r0.getString(r3)
            if (r4 == 0) goto L_0x0161
            java.lang.String r3 = r0.getString(r3)
            r3.getClass()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.d r4 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126843d) r4
            int r7 = r4.f349322a
            r7 = r7 | 4
            r4.f349322a = r7
            r4.f349325d = r3
        L_0x0161:
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r3 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r3
            com.google.protobuf.bv r4 = r1.build()
            com.google.android.apps.search.assistant.surfaces.roti.home.d r4 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126843d) r4
            r4.getClass()
            r3.f349184f = r4
            int r4 = r3.f349179a
            r4 = r4 | 8
            r3.f349179a = r4
            java.lang.String r3 = "com.android.chrome.voice.INTENT_SENT_TIMESTAMP"
            long r3 = r0.getLong(r3)
            com.google.protobuf.fg r0 = com.google.android.apps.search.assistant.surfaces.roti.home.C126832cl.m207495a(r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r3 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r3
            r0.getClass()
            r3.f349185g = r0
            int r0 = r3.f349179a
            r0 = r0 | 16
            r3.f349179a = r0
            java.lang.String r0 = r3.f349180b
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.search.assistant.surfaces.roti.home.d r1 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126843d) r1
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01b7
            int r0 = r1.f349322a
            r3 = r0 & 2
            if (r3 == 0) goto L_0x01b7
            r0 = r0 & r5
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = r1.f349323b
            java.lang.String r1 = r1.f349324c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b7
            goto L_0x01b8
        L_0x01b7:
            r5 = 0
        L_0x01b8:
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r0 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r0
            int r1 = r0.f349179a
            r1 = r1 | 32
            r0.f349179a = r1
            r0.f349186h = r5
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r0 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r0
        L_0x01cd:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.apps.search.assistant.surfaces.roti.home.bg r0 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126796bg) r0
            com.google.android.apps.search.assistant.surfaces.roti.home.HomeActivity r1 = r8.f349160b
            java.lang.String r1 = r1.getCallingPackage()
            java.lang.String r1 = com.google.common.base.C58837ba.m90858g(r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r2 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r2
            int r3 = r2.f349179a
            r3 = r3 | 4
            r2.f349179a = r3
            r2.f349182d = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.search.assistant.surfaces.roti.home.bh r0 = (com.google.android.apps.search.assistant.surfaces.roti.home.C126797bh) r0
            r8.f349169k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.roti.home.C126791bb.mo107787e():void");
    }

    /* renamed from: f */
    public final void mo107788f(Intent intent) {
        ComponentName componentName;
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        if (Build.VERSION.SDK_INT >= 31) {
            componentName = new ComponentName("com.google.android.tts", "com.google.android.apps.speech.tts.googletts.service.GoogleTTSActivity");
        } else {
            componentName = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voicesearch.intentapi.IntentApiActivity");
        }
        C47810es.m84979s(this.f349170l, intent2.setComponent(componentName).setFlags(33554432).putExtras(intent));
    }
}
