package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i;
import com.google.android.googlequicksearchbox.R;

@ProguardMustNotDelete
/* compiled from: PG */
public class ApolloDoubleTapSettingFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C9581b f33093h;

    /* renamed from: i */
    C124711i f33094i;

    /* renamed from: j */
    String f33095j;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return R.xml.preference_double_tap;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33094i = C124711i.m204374a(arguments.getInt("button_action"));
            this.f33095j = arguments.getString("key_device_id");
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C124711i iVar = this.f33094i;
        if (iVar == null) {
            iVar = C124711i.BUTTON_ACTION_UNKNOWN;
        }
        C9581b bVar = this.f33093h;
        String str = this.f33095j;
        C89492cd cdVar = (C89492cd) bVar.f33187a.mo17428b();
        cdVar.getClass();
        iVar.getClass();
        return new C9553a(cdVar, str, iVar);
    }
}
