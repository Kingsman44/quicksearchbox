package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.googlequicksearchbox.R;

@ProguardMustNotDelete
/* compiled from: PG */
public class BistoDeviceActionsSettingsFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C9628k f33098h;

    /* renamed from: i */
    private String f33099i;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return R.xml.device_actions_settings;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33099i = arguments.getString("key_device_id");
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C9628k kVar = this.f33098h;
        String str = this.f33099i;
        str.getClass();
        C89492cd cdVar = (C89492cd) kVar.f33330a.mo17428b();
        cdVar.getClass();
        return new C9627j(cdVar, str);
    }
}
