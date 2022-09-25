package com.google.android.apps.gsa.assistant.settings.devices.androidtv;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9732e;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
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
public class DeviceIdAndroidTvSettingsFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C68214a f33054h;

    /* renamed from: i */
    public C86124t f33055i;

    /* renamed from: j */
    private String f33056j = null;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return R.xml.assistant_device_id_android_tv_settings;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33056j = arguments.getString("assistant_device_id");
            C58976aa aaVar = C58975e.f156826a;
        }
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C28295m.m52919e(onCreateView, new C28292j(67941));
        C89949q.m146521e(C28285c.m52874a(onCreateView, 61687), false);
        Preference gg = mo8411gg("androidTvUnlinkDevice");
        if (gg != null && this.f33055i.mo79746e(C90059dk.f249045aH)) {
            gg.mo8348O(false);
        }
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C9541e eVar = (C9541e) this.f33054h.mo27525b();
        String str = this.f33056j;
        C22871g gVar = (C22871g) eVar.f33067a.mo17428b();
        gVar.getClass();
        o oVar = (o) eVar.f33068b.mo17428b();
        oVar.getClass();
        C9732e eVar2 = (C9732e) eVar.f33069c.mo17428b();
        eVar2.getClass();
        return new C9540d(str, gVar, oVar, eVar2);
    }
}
