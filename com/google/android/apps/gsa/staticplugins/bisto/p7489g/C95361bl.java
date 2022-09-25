package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.bl */
/* compiled from: PG */
public final class C95361bl extends C95447t {

    /* renamed from: f */
    private static final C59071e f266797f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.bl");

    /* renamed from: g */
    private final C95397cu f266798g;

    /* renamed from: h */
    private final C22871g f266799h;

    /* renamed from: i */
    private final C95349b f266800i;

    /* renamed from: j */
    private C95396ct f266801j;

    /* renamed from: k */
    private final C124539a f266802k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95361bl(android.content.Context r13, com.google.android.libraries.gsa.p1876k.C22871g r14, com.google.android.libraries.gsa.p1876k.C22871g r15, com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a r16, dagger.C68214a r17, com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95407dd r18, com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95349b r19, com.google.android.apps.gsa.shared.bisto.C89656k r20, com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c r21, com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95397cu r22, com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a r23) {
        /*
            r12 = this;
            r10 = r12
            r11 = r23
            android.bluetooth.BluetoothDevice r0 = r11.f343619a
            java.lang.String r1 = r0.getAddress()
            r0 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r18
            r6 = r16
            r7 = r17
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r22
            r10.f266798g = r0
            r0 = r14
            r10.f266799h = r0
            r10.f266802k = r11
            r0 = r19
            r10.f266800i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95361bl.<init>(android.content.Context, com.google.android.libraries.gsa.k.g, com.google.android.libraries.gsa.k.g, com.google.android.apps.gsa.staticplugins.bisto.r.a, dagger.a, com.google.android.apps.gsa.staticplugins.bisto.g.dd, com.google.android.apps.gsa.staticplugins.bisto.g.b, com.google.android.apps.gsa.shared.bisto.k, com.google.android.apps.gsa.staticplugins.bisto.b.b.c, com.google.android.apps.gsa.staticplugins.bisto.g.cu, com.google.android.apps.search.assistant.surfaces.bisto.c.a.a):void");
    }

    /* renamed from: A */
    public final boolean mo89303A(Intent intent) {
        if (!"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo89304B() {
        C95396ct ctVar = new C95396ct(this.f266798g, this);
        this.f266801j = ctVar;
        return ctVar.f266913b.mo89343b(ctVar, false);
    }

    /* renamed from: l */
    public final String mo89305l() {
        return "legacy-wired";
    }

    /* renamed from: m */
    public final String mo89306m() {
        return "N/A/BT/LEGACY";
    }

    /* renamed from: s */
    public final void mo89307s() {
        C95396ct ctVar = this.f266801j;
        if (ctVar != null) {
            C22871g gVar = this.f266799h;
            Objects.requireNonNull(ctVar);
            gVar.mo28212l("call", new C95360bk(ctVar));
            return;
        }
        C59104x d = f266797f.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoLegacyBtDevice");
        ((C59052c) ((C59052c) d).mo56372aa(14960)).mo56386p("startVoiceInput ignored, no BtInputRouter");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo89308t() {
        C95396ct ctVar = this.f266801j;
        if (ctVar != null) {
            ctVar.f266913b.mo89342a(false);
        }
        this.f266801j = null;
    }

    /* renamed from: u */
    public final boolean mo89309u() {
        if (this.f266800i.mo89283b()) {
            return this.f266800i.mo89284c(this.f266802k);
        }
        return true;
    }

    /* renamed from: v */
    public final boolean mo89310v(boolean z, boolean z2, boolean z3) {
        return z3 && z;
    }

    /* renamed from: z */
    public final boolean mo89311z(Intent intent) {
        if (!"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) || intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) != 2) {
            return false;
        }
        return true;
    }
}
