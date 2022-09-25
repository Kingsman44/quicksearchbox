package com.google.android.apps.gsa.assistant.settings.devices.libassistant;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9732e;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

@ProguardMustNotDelete
/* compiled from: PG */
public class DeviceIdLibassistantSettingsFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C68214a f33575h;

    /* renamed from: i */
    private String f33576i = null;

    /* renamed from: j */
    private String f33577j = null;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return R.xml.assistant_device_id_libassistant_settings;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33576i = arguments.getString("assistant_device_id");
            this.f33577j = arguments.getString("assistant_home_automation_provider_id");
            C58976aa aaVar = C58975e.f156826a;
        }
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C28295m.m52919e(onCreateView, new C28292j(67944));
        C89949q.m146521e(C28285c.m52874a(onCreateView, 61687), false);
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C9722e eVar = (C9722e) this.f33575h.mo27525b();
        String str = this.f33576i;
        String str2 = this.f33577j;
        C22871g gVar = (C22871g) eVar.f33596a.mo17428b();
        gVar.getClass();
        o oVar = (o) eVar.f33597b.mo17428b();
        oVar.getClass();
        C9732e eVar2 = (C9732e) eVar.f33598c.mo17428b();
        eVar2.getClass();
        return new C9721d(str, str2, gVar, oVar, eVar2);
    }
}
