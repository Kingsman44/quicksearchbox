package com.google.android.apps.gsa.assistant.settings.devices.libassistant;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

@ProguardMustNotDelete
/* compiled from: PG */
public class MediaOutputSettingsFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: i */
    private static final C59071e f33578i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.libassistant.MediaOutputSettingsFragment");

    /* renamed from: h */
    public C9727j f33579h;

    /* renamed from: j */
    private String f33580j;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return R.xml.assistant_device_id_media_output_settings;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33580j = arguments.getString("assistant_device_id");
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C59104x c = f33578i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MediaOutputFrag");
            ((C59052c) ((C59052c) c).mo56372aa(454)).mo56386p("onCreate() with no deviceId.");
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C9727j jVar = this.f33579h;
        String str = this.f33580j;
        C90932cb cbVar = (C90932cb) jVar.f33611a.mo17428b();
        cbVar.getClass();
        o oVar = (o) jVar.f33612b.mo17428b();
        oVar.getClass();
        return new C9726i(str, cbVar, oVar);
    }
}
