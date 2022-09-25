package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.settings.shared.C73735aj;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.libraries.gsa.p1876k.C22871g;

@ProguardMustNotDelete
/* compiled from: PG */
public class BistoLicensesFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C9557ac f33104h;

    /* renamed from: i */
    private String f33105i;

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33105i = arguments.getString("bisto_device_id");
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C9557ac acVar = this.f33104h;
        String str = this.f33105i;
        C89496ch chVar = (C89496ch) acVar.f33123a.mo17428b();
        chVar.getClass();
        ((C73735aj) acVar.f33124b.mo17428b()).getClass();
        C22871g gVar = (C22871g) acVar.f33125c.mo17428b();
        gVar.getClass();
        return new C9556ab(chVar, gVar, str);
    }
}
