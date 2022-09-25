package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.setupwizard.C92653e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.x */
/* compiled from: PG */
public final class C101634x {

    /* renamed from: a */
    private static final C59071e f283606a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.x");

    /* renamed from: b */
    private final C89994f f283607b;

    /* renamed from: c */
    private final SharedPreferences f283608c;

    /* renamed from: d */
    private final C92653e f283609d;

    /* renamed from: e */
    private final C68214a f283610e;

    public C101634x(C89994f fVar, SharedPreferences sharedPreferences, C92653e eVar, C68214a aVar) {
        this.f283607b = fVar;
        this.f283608c = sharedPreferences;
        this.f283609d = eVar;
        this.f283610e = aVar;
    }

    /* renamed from: a */
    public final void mo92452a(boolean z) {
        C59071e eVar = f283606a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VmESettingsUpdate");
        ((C59052c) ((C59052c) b).mo56372aa(20374)).mo56389s("#updateSettings, isOpaHotwordAvailable %b", Boolean.valueOf(z));
        if (z) {
            ((C92486a) this.f283610e.mo27525b()).mo87237k(true, EventForDump.m147675d(8));
        } else {
            this.f283607b.mo83903aw(1, EventForDump.m147675d(8));
        }
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "VmESettingsUpdate");
        ((C59052c) ((C59052c) b2).mo56372aa(20373)).mo56386p("#onEnrollDone");
        this.f283607b.mo83826o(EventForDump.m147675d(8));
        if (!this.f283608c.getBoolean("hotwordDetector", true)) {
            ((C92486a) this.f283610e.mo27525b()).mo87233g(true);
        }
        this.f283609d.mo87423a();
    }
}
