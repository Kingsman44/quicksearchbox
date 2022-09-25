package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;

@ProguardMustNotDelete
/* compiled from: PG */
public class BistoAudioOutputOptionsFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C9625h f33096h;

    /* renamed from: i */
    private String f33097i;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return R.xml.audio_output_options;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33097i = arguments.getString("key_device_id");
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C9625h hVar = this.f33096h;
        String str = this.f33097i;
        str.getClass();
        C89492cd cdVar = (C89492cd) hVar.f33323a.mo17428b();
        cdVar.getClass();
        C22871g gVar = (C22871g) hVar.f33324b.mo17428b();
        gVar.getClass();
        return new C9624g(cdVar, gVar, str);
    }
}
