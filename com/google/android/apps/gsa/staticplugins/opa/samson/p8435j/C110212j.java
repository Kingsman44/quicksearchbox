package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.j */
/* compiled from: PG */
public final class C110212j {

    /* renamed from: b */
    private static final C59071e f307111b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.j.j");

    /* renamed from: a */
    public final C92486a f307112a;

    /* renamed from: c */
    private final C68214a f307113c;

    /* renamed from: d */
    private final C113787bc f307114d;

    public C110212j(C68214a aVar, C92486a aVar2, C113787bc bcVar) {
        this.f307113c = aVar;
        this.f307112a = aVar2;
        this.f307114d = bcVar;
    }

    /* renamed from: b */
    private final boolean m183522b() {
        return ((SharedPreferences) this.f307113c.mo27525b()).getBoolean("opa_hotword_training_seen_on_dock", false);
    }

    /* renamed from: a */
    public final boolean mo98473a(boolean z) {
        boolean z2 = this.f307112a.mo87242p() && !this.f307112a.mo87249w() && (z || !m183522b());
        C59104x b = f307111b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HWTrainingUtils");
        ((C59052c) ((C59052c) b).mo56372aa(25806)).mo56359L("hasHotwordEverywhere = %b, isVoiceMatchEnabled = %b, hasSeenHotwordOnDock = %b", Boolean.valueOf(this.f307112a.mo87242p()), Boolean.valueOf(this.f307112a.mo87249w()), Boolean.valueOf(m183522b()));
        return z2 && !this.f307114d.mo100631k();
    }
}
