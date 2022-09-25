package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89493ce;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

@ProguardMustNotDelete
/* compiled from: PG */
public class BistoDeviceDiagnosticsFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C9636s f33100h;

    /* renamed from: i */
    private String f33101i;

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33101i = arguments.getString("key_device_id");
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C9636s sVar = this.f33100h;
        String str = this.f33101i;
        str.getClass();
        C88483e eVar = (C88483e) sVar.f33348a.mo17428b();
        eVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) sVar.f33349b).f184585a);
        a.getClass();
        C91142g gVar = (C91142g) sVar.f33350c.mo17428b();
        gVar.getClass();
        C89994f fVar = (C89994f) sVar.f33351d.mo17428b();
        fVar.getClass();
        C89496ch chVar = (C89496ch) sVar.f33352e.mo17428b();
        chVar.getClass();
        C89493ce ceVar = (C89493ce) sVar.f33353f.mo17428b();
        ceVar.getClass();
        return new C9635r(str, eVar, a, gVar, fVar, chVar, ceVar);
    }
}
