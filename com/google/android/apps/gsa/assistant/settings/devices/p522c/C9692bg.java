package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.shared.p6968aa.C89036bg;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.C90736at;
import com.google.android.apps.search.assistant.platform.p9141h.p9152d.C121042b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.bg */
/* compiled from: PG */
public final class C9692bg extends C9649ad implements C89036bg {

    /* renamed from: a */
    public SharedPreferences f33496a;

    /* renamed from: b */
    public C9666au f33497b;

    /* renamed from: c */
    public C89037bh f33498c;

    /* renamed from: d */
    public C22871g f33499d;

    /* renamed from: e */
    public C121042b f33500e;

    /* renamed from: d */
    public static int m24414d(String[] strArr, String str, int i) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (str.equals(strArr[i2])) {
                return i2;
            }
        }
        return i;
    }

    /* renamed from: f */
    private final void m24415f(ItemView itemView, int i, int i2, int i3, C58881cr crVar, C90736at atVar, int i4) {
        ItemView itemView2 = itemView;
        int i5 = i2;
        String[] stringArray = getResources().getStringArray(i2);
        String[] stringArray2 = getResources().getStringArray(i3);
        int d = m24414d(stringArray, getString(i4), 0);
        itemView.p(itemView.f(i));
        itemView.o(stringArray2[m24414d(stringArray, (String) crVar.mo6453a(), d)]);
        itemView.setOnClickListener(new C9691bf(this, i, stringArray2, stringArray, crVar, d, itemView, atVar));
    }

    /* renamed from: e */
    public final void mo17963e(C89062r rVar) {
        this.f33499d.mo28212l("VoiceAndSpeechSectionFragment.onConnectivityChange", new C9690be(this, rVar));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_voice_and_speech_section, viewGroup, false);
        int i = ItemView.a;
        ItemView findViewById = inflate.findViewById(R.id.settings_nexus_preferred_input);
        findViewById.setVisibility(0);
        m24415f(findViewById, R.string.nexus_device_default_input_mode_dialog_title, R.array.nexus_device_pref_values_input_mode, R.array.nexus_device_pref_entries_input_mode, new C9688bc(this), new C9689bd(this), R.string.nexus_device_default_input_mode);
        if (this.f33497b.mo17943d()) {
            C9666au auVar = this.f33497b;
            Objects.requireNonNull(auVar);
            C9686ba baVar = new C9686ba(auVar);
            C9666au auVar2 = this.f33497b;
            Objects.requireNonNull(auVar2);
            m24415f(inflate.findViewById(R.id.settings_nexus_speech_output), R.string.prefTitle_ttsMode, R.array.prefValues_ttsMode_nga, R.array.prefEntries_ttsMode_nga, baVar, new C9687bb(auVar2), R.string.prefDefault_ttsMode);
        } else {
            C9666au auVar3 = this.f33497b;
            Objects.requireNonNull(auVar3);
            C9686ba baVar2 = new C9686ba(auVar3);
            C9666au auVar4 = this.f33497b;
            Objects.requireNonNull(auVar4);
            m24415f(inflate.findViewById(R.id.settings_nexus_speech_output), R.string.prefTitle_ttsMode, R.array.prefValues_ttsMode, R.array.prefEntries_ttsMode, baVar2, new C9687bb(auVar4), R.string.prefDefault_ttsMode);
        }
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        this.f33498c.mo27383i();
    }

    public final void onResume() {
        super.onResume();
        if (this.f33497b.mo17943d()) {
            this.f33498c.mo27382h(this);
        }
    }
}
