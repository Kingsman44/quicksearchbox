package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.C83909c;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.fn */
/* compiled from: PG */
public final class C94316fn extends C83907bm {

    /* renamed from: d */
    private static final C59071e f263549d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.fn");

    /* renamed from: b */
    public C83893b f263550b;

    /* renamed from: c */
    public int f263551c = 1;

    /* renamed from: e */
    private List f263552e;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1321) {
            C83909c.m133669a(getActivity());
            C59104x b = f263549d.mo56224b();
            b.mo56378ag(C58975e.f156826a, "VMLauncherFragment");
            ((C59052c) ((C59052c) b).mo56372aa(14434)).mo56387q("resultCode %d", i2);
            this.f263551c = i2;
            mo77318iT().mo77312a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        this.f263552e = ProtoParsers.m95529l(arguments, "VoiceMatchEnrollList", C83917d.f228552j, C62921ba.m95368a());
        ArrayList arrayList = new ArrayList();
        for (C83917d dVar : this.f263552e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("assistant_settings_device_info_device_id_extra", dVar.f228555b);
            bundle2.putString("assistant_settings_device_info_device_certificate", dVar.f228556c);
            bundle2.putString("assistant_settings_device_info_ip_addr_extra", dVar.f228557d);
            bundle2.putString("assistant_settings_device_info_name_extra", dVar.f228558e);
            bundle2.putBoolean("assistant_settings_device_info_display_capability_extra", dVar.f228559f);
            bundle2.putBoolean("assistant_settings_device_info_avocado_capability_extra", dVar.f228560g);
            bundle2.putBoolean("assistant_settings_device_info_use_https_extra", dVar.f228561h);
            bundle2.putInt("assistant_settings_device_info_device_type", dVar.f228562i);
            arrayList.add(bundle2);
        }
        C18509a c = C18522b.m35986c();
        C18523c cVar = (C18523c) c;
        cVar.f52492a = "speaker_id_enrollment";
        c.mo24025g("voice_and_face");
        c.mo24022d(arrayList);
        c.mo24023e("fm_settings");
        cVar.f52494c = ((Account) this.f263550b.mo77278a().mo56107c()).name;
        startActivityForResult(c.mo24020b().mo24031a(), 1321);
        C83909c.m133669a(getActivity());
    }
}
