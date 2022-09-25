package com.google.research.p5181a.p5187e;

import com.evernote.android.state.BuildConfig;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.research.a.e.c */
/* compiled from: PG */
public final class C66353c extends C66368r {

    /* renamed from: a */
    static final long f180427a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: e */
    public final String mo59575e() {
        return "Bluetooth_Rule_Predictor";
    }

    /* renamed from: t */
    public final C66367q mo59574t(C66376a aVar) {
        boolean z;
        C66355e eVar = this.f180447l;
        int i = eVar.f180433a.f180248b;
        long c = aVar.mo59467j().mo59503c();
        while (true) {
            i--;
            z = false;
            if (i < 0) {
                break;
            }
            C66376a aVar2 = (C66376a) eVar.f180433a.mo59448a(i);
            if (aVar2.mo59463f() == 5) {
                long c2 = c - aVar2.mo59467j().mo59503c();
                if (c2 >= 0 && c2 <= f180427a) {
                    if (!"headset_wired_in".equals(aVar2.mo59460c()) && !"headset_bluetooth_in".equals(aVar2.mo59460c())) {
                        if ("headset_wired_out".equals(aVar2.mo59460c()) || "headset_bluetooth_out".equals(aVar2.mo59460c())) {
                            break;
                        }
                    } else {
                        z = true;
                    }
                } else {
                    break;
                }
            }
        }
        C66367q qVar = new C66367q();
        if (z) {
            qVar.f180459b.add(new C66366p(BuildConfig.FLAVOR, 1.0f, "Bluetooth_Rule_Predictor"));
        }
        return qVar;
    }
}
