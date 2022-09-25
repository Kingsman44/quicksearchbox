package com.google.android.apps.gsa.shared.speech.hotword;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.e */
/* compiled from: PG */
public final /* synthetic */ class C90588e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C90588e f253260a = new C90588e();

    private /* synthetic */ C90588e() {
    }

    public final Object apply(Object obj) {
        C59104x c = C90590g.f253263a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HotwordModelConfigFetcher");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(11132)).mo56389s("Could not find or download client file group %s", "apa_hotword_model_config");
        return Optional.empty();
    }
}
