package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import androidx.preference.Preference;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9730c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.j */
/* compiled from: PG */
public final class C9627j extends C9730c {

    /* renamed from: i */
    public static final C59071e f33326i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.bisto.j");

    /* renamed from: j */
    public Preference f33327j;

    /* renamed from: k */
    public final String f33328k;

    /* renamed from: l */
    private final C89492cd f33329l;

    public C9627j(C89492cd cdVar, String str) {
        this.f33329l = cdVar;
        this.f33328k = str;
    }

    /* renamed from: F */
    public final void mo17862F(Preference preference) {
        String str = preference.f12748t;
        if (str != null) {
            if (((str.hashCode() == 55154769 && str.equals("bistoDeviceActionModelId")) ? (char) 0 : 65535) == 0) {
                this.f33327j = preference;
            }
        }
    }

    /* renamed from: s */
    public final void mo17808s() {
        String str = this.f33328k;
        if (str == null) {
            C59104x c = f33326i.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoDAController");
            ((C59052c) ((C59052c) c).mo56372aa(347)).mo56386p("deviceId null");
            return;
        }
        C60856cj.m92911t(this.f33329l.mo83408n(str), new C9626i(this), C60826bg.f164896a);
    }
}
