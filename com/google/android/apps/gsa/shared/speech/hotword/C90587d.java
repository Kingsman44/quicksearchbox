package com.google.android.apps.gsa.shared.speech.hotword;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.d */
/* compiled from: PG */
public final /* synthetic */ class C90587d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C90587d f253259a = new C90587d();

    private /* synthetic */ C90587d() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return optional;
        }
        C59104x c = C90590g.f253263a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HotwordModelConfigFetcher");
        ((C59052c) ((C59052c) c).mo56372aa(11129)).mo56386p("Model config not available.");
        return Optional.empty();
    }
}
