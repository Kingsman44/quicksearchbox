package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8358c;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83914a;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.c.d */
/* compiled from: PG */
public abstract class C108599d {
    /* renamed from: q */
    public static C108598c m180579q() {
        C108596a aVar = new C108596a();
        aVar.mo97001d(false);
        aVar.mo96999b(false);
        aVar.mo97000c(false);
        aVar.mo97002e(false);
        aVar.f302081k = 1;
        return aVar;
    }

    /* renamed from: a */
    public abstract Boolean mo97003a();

    /* renamed from: b */
    public abstract Integer mo97004b();

    /* renamed from: c */
    public abstract Integer mo97005c();

    /* renamed from: d */
    public abstract String mo97006d();

    /* renamed from: e */
    public abstract String mo97007e();

    /* renamed from: f */
    public abstract String mo97009f();

    /* renamed from: g */
    public abstract String mo97010g();

    /* renamed from: h */
    public abstract String mo97011h();

    /* renamed from: i */
    public abstract String mo97013i();

    /* renamed from: j */
    public abstract String mo97014j();

    /* renamed from: k */
    public abstract boolean mo97015k();

    /* renamed from: l */
    public abstract boolean mo97016l();

    /* renamed from: m */
    public abstract boolean mo97017m();

    /* renamed from: n */
    public abstract boolean mo97018n();

    /* renamed from: o */
    public abstract int mo97019o();

    /* renamed from: p */
    public final Intent mo97021p() {
        C9439b bVar;
        Bundle bundle = new Bundle();
        bundle.putString("source_package_name", mo97011h());
        bundle.putString("link_provider_id", mo97009f());
        bundle.putString("unlink_provider_id", mo97014j());
        bundle.putBoolean("should_trigger_port", mo97017m());
        bundle.putBoolean("hide_address_sequence", mo97015k());
        bundle.putBoolean("hide_room_sequence", mo97016l());
        bundle.putBoolean("show_media_sequence", mo97018n());
        bundle.putString("source_return_url", mo97013i());
        Boolean a = mo97003a();
        if (a != null) {
            bundle.putBoolean("should_return_source_url_errors", a.booleanValue());
        }
        bundle.putString("account_name", mo97006d());
        bundle.putString("explicit_device_id", mo97007e());
        Integer b = mo97004b();
        if (b != null) {
            bundle.putInt("explicit_device_type", b.intValue());
        }
        Integer c = mo97005c();
        if (c != null) {
            bundle.putInt("value_prop_id", c.intValue());
        }
        C83914a aVar = (C83914a) C83915b.f228541j.createBuilder();
        aVar.copyOnWrite();
        C83915b bVar2 = (C83915b) aVar.instance;
        bVar2.f228543a |= 2;
        bVar2.f228545c = R.string.device_setup_cancel_dialog_title;
        aVar.copyOnWrite();
        C83915b bVar3 = (C83915b) aVar.instance;
        bVar3.f228543a |= 8;
        bVar3.f228547e = R.string.device_setup_cancel_dialog_message;
        aVar.copyOnWrite();
        C83915b bVar4 = (C83915b) aVar.instance;
        bVar4.f228543a |= 32;
        bVar4.f228549g = R.string.device_setup_cancel_dialog_positive_button;
        aVar.copyOnWrite();
        C83915b bVar5 = (C83915b) aVar.instance;
        bVar5.f228543a |= 128;
        bVar5.f228551i = R.string.device_setup_cancel_dialog_negative_button;
        C83915b bVar6 = (C83915b) aVar.build();
        C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
        if (mo97019o() == 2 || mo97019o() == 3) {
            bVar = C9439b.DEVICE_REGISTRATION_ACCOUNT_LINKING;
        } else {
            bVar = C9439b.DEVICE_REGISTRATION_ONBOARDING;
        }
        vVar.copyOnWrite();
        C59567w wVar = (C59567w) vVar.instance;
        wVar.f158062c = bVar.f32835aq;
        wVar.f158060a |= 2;
        String g = mo97010g();
        if (g != null) {
            if (g.length() > 50) {
                String substring = g.substring(0, 50);
                vVar.copyOnWrite();
                C59567w wVar2 = (C59567w) vVar.instance;
                substring.getClass();
                wVar2.f158060a |= 32;
                wVar2.f158065f = substring;
            } else {
                vVar.copyOnWrite();
                C59567w wVar3 = (C59567w) vVar.instance;
                wVar3.f158060a |= 32;
                wVar3.f158065f = g;
            }
        }
        C83879am o = C83880an.m133553o();
        int o2 = mo97019o();
        int i = o2 - 1;
        if (o2 != 0) {
            C83940g gVar = (C83940g) o;
            gVar.f228605a = i != 1 ? i != 2 ? i != 3 ? "DeviceRegistration" : "DeviceSetupPersonalResults" : "DeviceSetupConsent" : "DeviceSetupLinkProvider";
            gVar.f228607c = new C83938e(0, (String) null, (String) null);
            o.mo77222b((C59567w) vVar.build());
            gVar.f228606b = bundle;
            gVar.f228610f = C58833ax.m90834k(bVar6);
            return o.mo77221a().mo77240n();
        }
        throw null;
    }
}
