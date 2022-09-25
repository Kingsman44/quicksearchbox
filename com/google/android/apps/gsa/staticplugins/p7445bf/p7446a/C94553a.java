package com.google.android.apps.gsa.staticplugins.p7445bf.p7446a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83883aq;
import com.google.android.apps.gsa.opaonboarding.C83884ar;
import com.google.android.apps.gsa.opaonboarding.C83885as;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.android.apps.gsa.opaonboarding.C83944k;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109789ai;
import com.google.android.apps.gsa.staticplugins.p7445bf.p7446a.p7447a.C94557d;
import com.google.android.apps.gsa.staticplugins.p7445bf.p7446a.p7448b.C94560c;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.a.a */
/* compiled from: PG */
public final class C94553a extends C84036z implements C83904bj {

    /* renamed from: a */
    private final Bundle f264485a;

    /* renamed from: b */
    private final C58833ax f264486b;

    /* renamed from: c */
    private C83885as f264487c;

    /* renamed from: d */
    private final boolean f264488d;

    /* renamed from: e */
    private final C109789ai f264489e;

    public C94553a(C109789ai aiVar, Bundle bundle, C58833ax axVar) {
        this.f264489e = aiVar;
        this.f264485a = bundle;
        this.f264486b = axVar;
        this.f264488d = bundle.getBoolean("udc_consent:skip_udc", false);
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        int i = -1;
        if (this.f264488d) {
            return C83903bi.m133649e(-1, (Intent) null);
        }
        int a = this.f264487c.mo77270a();
        int i2 = a - 1;
        if (a != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    i = 2;
                    if (i2 == 2) {
                        i = 1;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalArgumentException("Unknown ConsentOutcome: ".concat(a != 1 ? a != 2 ? a != 3 ? a != 4 ? "INTERNAL_ERROR" : "INELIGIBLE" : "REJECTED" : "ACCEPTED" : "PENDING"));
                        }
                    }
                }
                return C83903bi.m133649e(i, (Intent) null);
            }
            i = 3;
            return C83903bi.m133649e(i, (Intent) null);
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        int i = this.f264485a.getInt("udc_consent:value_prop_id", 0);
        boolean z = this.f264485a.getBoolean("udc_consent:is_udc_required", true);
        boolean z2 = this.f264485a.getBoolean("udc_consent:show_dsc", false);
        String string = this.f264485a.getString("udc_consent:dsc_device_id", BuildConfig.FLAVOR);
        C49875cf a = C49875cf.m85755a(this.f264485a.getInt("udc_consent:assistant_device_type", 0));
        C58976aa aaVar = C58975e.f156826a;
        C58480gp e = C58485gu.m89837e();
        C83883aq o = C83884ar.m133585o();
        o.mo77250e(false);
        o.mo77255j(12);
        o.mo77254i(i);
        C83944k kVar = (C83944k) o;
        kVar.f228637d = 12;
        o.mo77253h(true != z ? 3 : 2);
        C58833ax axVar = this.f264486b;
        if (axVar != null) {
            kVar.f228635b = axVar;
            if (a == C49875cf.ANDROID_TV) {
                Bundle bundle = new Bundle();
                bundle.putInt("value_prop_id", i);
                e.mo55395g(C83875ai.m133540e(new C94560c(), bundle));
                kVar.f228638e = 2;
                o.mo77252g(false);
            }
            C83885as a2 = this.f264489e.mo98123a(o.mo77246a());
            this.f264487c = a2;
            if (!this.f264488d) {
                e.mo55395g(a2);
            }
            if (z2 && !TextUtils.isEmpty(string)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("opa-dsc-device-id-param", string);
                e.mo55395g(C83875ai.m133540e(new C94557d(), bundle2));
            }
            return e.mo55394f();
        }
        throw new NullPointerException("Null confirmRejectDialog");
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return C83903bi.m133649e(1, (Intent) null);
    }
}
