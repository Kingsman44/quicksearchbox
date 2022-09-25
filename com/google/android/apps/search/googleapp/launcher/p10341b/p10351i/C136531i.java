package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133156d;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133157e;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133158f;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136438aj;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10342a.C136425b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10343b.C136445b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136453f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136470f;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136508k;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2476a.p2477a.C32159i;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46010bu;
import com.google.apps.tiktok.account.api.controller.C46012bw;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.apps.tiktok.inject.C47231d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.i */
/* compiled from: PG */
public final class C136531i extends C136542s {

    /* renamed from: A */
    private static final C58528ij f371702A = C58528ij.m90014N("bramble", "redfin", "barbet", "oriole", "raven");

    /* renamed from: a */
    public static final C59071e f371703a = C59071e.m91332i("com.google.android.apps.search.googleapp.launcher.b.i.i");

    /* renamed from: B */
    private Optional f371704B = Optional.empty();

    /* renamed from: b */
    public C45989b f371705b;

    /* renamed from: c */
    public C32159i f371706c;

    /* renamed from: d */
    public C28310af f371707d;

    /* renamed from: e */
    public C28306ab f371708e;

    /* renamed from: f */
    public C21370a f371709f;

    /* renamed from: g */
    public C136425b f371710g;

    /* renamed from: h */
    public C136445b f371711h;

    /* renamed from: i */
    public Context f371712i;

    /* renamed from: j */
    public Optional f371713j;

    /* renamed from: k */
    public boolean f371714k;

    /* renamed from: l */
    public boolean f371715l;

    /* renamed from: m */
    public C136453f f371716m;

    /* renamed from: n */
    public C136455h f371717n;

    /* renamed from: o */
    public float f371718o = -1.0f;

    /* renamed from: p */
    public boolean f371719p = false;

    /* renamed from: q */
    public Optional f371720q = Optional.empty();

    /* renamed from: r */
    public boolean f371721r = false;

    /* renamed from: s */
    public Optional f371722s = Optional.empty();

    /* renamed from: t */
    public boolean f371723t;

    /* renamed from: u */
    final Optional f371724u = Optional.empty();

    /* renamed from: v */
    public int f371725v = 4;

    /* renamed from: w */
    public C136438aj f371726w;

    /* renamed from: o */
    public static boolean m221890o() {
        if (!"google".equals(Build.MANUFACTURER.toLowerCase(Locale.ENGLISH))) {
            return false;
        }
        return f371702A.contains(Build.DEVICE.toLowerCase(Locale.ENGLISH));
    }

    /* renamed from: e */
    public final void mo51126e() {
        super.mo51126e();
        mo113161m();
    }

    /* renamed from: f */
    public final void mo51127f() {
        super.mo51127f();
        mo113161m();
    }

    /* renamed from: i */
    public final C136533k mo22017i() {
        Fragment a;
        C136508k j = mo113158j();
        if (j == null || (a = j.mo113103a()) == null) {
            return null;
        }
        return (C136533k) ((C47231d) a).mo17754z();
    }

    /* renamed from: j */
    public final C136508k mo113158j() {
        Fragment c = mo51122q().f634a.mo671c("sliding_fragment");
        if (c != null) {
            return (C136508k) ((C47231d) c).mo17754z();
        }
        return null;
    }

    /* renamed from: jP */
    public final void mo19987jP(Bundle bundle) {
        C136453f fVar = new C136453f("AcetoneFragmentHost", 20, this.f371709f);
        this.f371716m = fVar;
        fVar.mo113057a("onCreate");
        if (m221890o()) {
            this.f371723t = mo113162n();
            C136530h hVar = new C136530h(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MY_PACKAGE_SUSPENDED");
            intentFilter.addAction("android.intent.action.MY_PACKAGE_UNSUSPENDED");
            this.f371712i.registerReceiver(hVar, intentFilter);
            this.f371704B = Optional.m71637of(hVar);
        }
        C32159i iVar = this.f371706c;
        C45989b bVar = this.f371705b;
        C136527e eVar = new C136527e(this);
        C133158f fVar2 = ((C133156d) iVar).f362971a;
        C46012bw g = C46013bx.m82203g();
        Stream stream = Collection.EL.stream(fVar2.mo111000b());
        Objects.requireNonNull(g);
        stream.forEach(new C133157e(g));
        ((C46010bu) g).f120853a = fVar2.mo110999a();
        bVar.mo50083f(g.mo50146a());
        bVar.mo50082e(eVar);
        super.mo19987jP(bundle);
    }

    /* renamed from: jQ */
    public final void mo51129jQ() {
        super.mo51129jQ();
        Optional optional = this.f371704B;
        Context context = this.f371712i;
        Objects.requireNonNull(context);
        optional.ifPresent(new C136525c(context));
        this.f371710g.f371401d = Optional.empty();
        this.f371711h.f371484f = Optional.empty();
    }

    /* renamed from: k */
    public final void mo113159k(boolean z) {
        C136470f b;
        C136533k i = mo22017i();
        if (i != null && (b = i.mo113163b()) != null) {
            b.mo113068f(z);
        }
    }

    /* renamed from: l */
    public final void mo113160l() {
        C136470f b;
        C136533k i = mo22017i();
        if (i != null && (b = i.mo113163b()) != null) {
            b.mo113069h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113161m() {
        /*
            r3 = this;
            int r0 = r3.f371725v
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x001c
            r1 = 2
            if (r0 != r1) goto L_0x001b
            androidx.lifecycle.x r0 = r3.f122876x
            androidx.lifecycle.n r0 = r0.f6612c
            androidx.lifecycle.n r1 = androidx.lifecycle.C2383n.RESUMED
            boolean r0 = r0.mo5788a(r1)
            if (r0 == 0) goto L_0x001c
            boolean r0 = r3.f371723t
            if (r0 != 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001b:
            return
        L_0x001c:
            r0 = 0
        L_0x001d:
            com.google.android.apps.search.googleapp.launcher.b.i.k r1 = r3.mo22017i()
            if (r1 == 0) goto L_0x0027
            boolean r2 = r1.mo113172k()
        L_0x0027:
            if (r2 != r0) goto L_0x002a
            return
        L_0x002a:
            if (r0 == 0) goto L_0x003c
            com.google.android.apps.search.googleapp.launcher.b.i.k r0 = r3.mo22017i()
            if (r0 == 0) goto L_0x003b
            com.google.android.apps.search.googleapp.launcher.b.f.f r0 = r0.mo113163b()
            if (r0 == 0) goto L_0x003b
            r0.mo113070i()
        L_0x003b:
            return
        L_0x003c:
            r3.mo113160l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136531i.mo113161m():void");
    }

    /* renamed from: n */
    public final boolean mo113162n() {
        return ((Boolean) this.f371724u.orElse(Boolean.valueOf(this.f371712i.getPackageManager().isPackageSuspended()))).booleanValue();
    }
}
