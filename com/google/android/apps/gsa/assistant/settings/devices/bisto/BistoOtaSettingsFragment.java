package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

@ProguardMustNotDelete
/* compiled from: PG */
public class BistoOtaSettingsFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C9570ap f33107h;

    /* renamed from: i */
    private String f33108i;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return R.xml.ota_settings;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33108i = arguments.getString("key_device_id");
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C9570ap apVar = this.f33107h;
        String str = this.f33108i;
        str.getClass();
        C91142g gVar = (C91142g) apVar.f33162a.mo17428b();
        gVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) apVar.f33163b).f184585a);
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) apVar.f33164c).f184585a);
        a2.getClass();
        C22871g gVar2 = (C22871g) apVar.f33165d.mo17428b();
        gVar2.getClass();
        return new C9569ao(gVar, a, a2, gVar2, str);
    }
}
