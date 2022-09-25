package com.google.android.apps.search.pronunciationlearning;

import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.pronunciationlearning.u */
/* compiled from: PG */
public final class C141428u extends C141520v {

    /* renamed from: a */
    public static final C59071e f383888a = C59071e.m91332i("com.google.android.apps.search.pronunciationlearning.u");

    /* renamed from: b */
    public final PronunciationLearningActivity f383889b;

    /* renamed from: d */
    private final C141512e f383890d;

    public C141428u(PronunciationLearningActivity pronunciationLearningActivity, C45989b bVar, C32158h hVar, C141512e eVar) {
        C58495hd hdVar;
        this.f383889b = pronunciationLearningActivity;
        hVar.mo37971b(pronunciationLearningActivity, new C141427t(this), bVar);
        this.f383890d = eVar;
        String stringExtra = pronunciationLearningActivity.getIntent().getStringExtra("EXTRA_LOCALE");
        if (!C58837ba.m90859h(stringExtra)) {
            eVar.f384127e = stringExtra;
            if (stringExtra.toLowerCase(Locale.ENGLISH).startsWith("es")) {
                hdVar = C141512e.f384124b;
            } else {
                hdVar = stringExtra.toLowerCase(Locale.ENGLISH).startsWith("hi") ? C141512e.f384125c : C141512e.f384123a;
            }
            eVar.f384126d = hdVar;
        }
    }
}
