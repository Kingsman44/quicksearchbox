package com.google.research.p5181a.p5187e;

import com.evernote.android.state.BuildConfig;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.research.a.e.g */
/* compiled from: PG */
public final class C66357g extends C66368r {

    /* renamed from: a */
    static final long f180438a = TimeUnit.MINUTES.toMillis(90);

    /* renamed from: e */
    public final String mo59575e() {
        return "Location_Rule_Predictor";
    }

    /* renamed from: t */
    public final C66367q mo59574t(C66376a aVar) {
        C66367q qVar = new C66367q();
        if (aVar.mo59465h() != null) {
            aVar.mo59465h().mo59474b();
            if (aVar.mo59465h().mo59474b().mo59477b() != null) {
                long c = aVar.mo59467j().mo59503c() - aVar.mo59465h().mo59474b().mo59476a();
                if (c >= 0 && c <= f180438a) {
                    String b = aVar.mo59465h().mo59474b().mo59477b();
                    boolean equals = "Place.TYPE_AIRPORT".equals(b);
                    String str = BuildConfig.FLAVOR;
                    if (!equals && !"Place.TYPE_RESTAURANT".equals(b) && !"Place.TYPE_CAFE".equals(b)) {
                        str = null;
                    }
                    if (str != null) {
                        qVar.f180459b.add(new C66366p(str, 1.0f, "Location_Rule_Predictor"));
                    }
                }
            }
        }
        return qVar;
    }
}
