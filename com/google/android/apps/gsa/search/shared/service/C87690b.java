package com.google.android.apps.gsa.search.shared.service;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.search.p7137a.C90483a;
import com.google.android.apps.gsa.shared.util.C90722af;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b */
/* compiled from: PG */
public final class C87690b implements C90483a {

    /* renamed from: a */
    public final C87673aa f237037a;

    /* renamed from: b */
    public Bundle f237038b;

    /* renamed from: c */
    public Intent f237039c;

    /* renamed from: d */
    public boolean f237040d;

    /* renamed from: e */
    private final C21370a f237041e;

    /* renamed from: f */
    private boolean f237042f;

    /* renamed from: g */
    private final C87682aj f237043g;

    /* renamed from: h */
    private final int f237044h = 1;

    public C87690b(C21370a aVar, C87677ae aeVar, C87682aj ajVar, ClientConfig clientConfig) {
        C87665a aVar2 = new C87665a(this);
        this.f237043g = aVar2;
        this.f237041e = aVar;
        C87673aa a = aeVar.mo81958a(ajVar, (C90757ba) null, clientConfig);
        this.f237037a = a;
        a.mo81940l(aVar2, C88244um.HAND_OVER, C88244um.START_ACTIVITY);
    }

    /* renamed from: Q */
    public final void mo81784Q(Intent intent, Bundle bundle) {
        if (this.f237044h == 1) {
            this.f237037a.mo81932c();
        }
        this.f237039c = intent;
        this.f237038b = bundle;
    }

    /* renamed from: T */
    public final void mo81787T(Bundle bundle) {
    }

    /* renamed from: U */
    public final void mo81788U() {
        if (!this.f237042f) {
            Intent intent = this.f237039c;
            Bundle bundle = this.f237038b;
            if (bundle != null) {
                this.f237037a.mo81945q(bundle);
            } else if (intent != null && C90722af.m148174b(intent)) {
                this.f237037a.mo81946r(C90722af.m148173a(intent), (Bundle) null, C88431bb.f239082a);
            } else if (this.f237040d) {
                this.f237037a.mo81947s((Bundle) null);
            } else {
                this.f237037a.mo81944p();
            }
        }
        this.f237042f = true;
        this.f237039c = null;
        this.f237038b = null;
        this.f237040d = false;
    }

    /* renamed from: V */
    public final void mo81789V(Bundle bundle) {
        throw null;
    }

    /* renamed from: W */
    public final void mo81790W() {
        if (this.f237040d) {
            this.f237037a.mo81932c();
        }
    }

    /* renamed from: X */
    public final void mo81791X(boolean z) {
        if (z) {
            this.f237037a.mo81948t(true);
            this.f237040d = true;
        } else {
            this.f237037a.mo81948t(false);
        }
        this.f237042f = false;
        if (this.f237040d) {
            this.f237037a.mo81933e();
        }
    }

    /* renamed from: Y */
    public final void mo81792Y(boolean z) {
        this.f237037a.mo81939k(z, this.f237041e.mo26871c());
    }

    /* renamed from: a */
    public final C87673aa mo81975a() {
        return this.f237037a;
    }

    /* renamed from: an */
    public final boolean mo81807an() {
        throw null;
    }

    /* renamed from: ao */
    public final void mo81808ao() {
    }

    /* renamed from: ap */
    public final void mo81809ap() {
        this.f237037a.mo81941m(this.f237043g, C88244um.HAND_OVER, C88244um.START_ACTIVITY);
        this.f237037a.mo81933e();
    }

    /* renamed from: b */
    public final void mo81976b(Intent intent) {
        this.f237039c = intent;
        this.f237038b = null;
        this.f237040d = false;
        if (this.f237042f) {
            this.f237042f = false;
            this.f237037a.mo81948t(false);
        }
    }
}
