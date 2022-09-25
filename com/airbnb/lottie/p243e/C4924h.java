package com.airbnb.lottie.p243e;

import com.airbnb.lottie.p238c.C4857b;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p243e.p244a.C4908e;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.social.populous.android.C42181t;

/* renamed from: com.airbnb.lottie.e.h */
/* compiled from: PG */
public final class C4924h implements C4917ah {

    /* renamed from: a */
    public static final C4924h f15674a = new C4924h();

    /* renamed from: b */
    private static final C4906c f15675b = C4906c.m13601a(C42181t.f110467a, C10662f.f35572a, C59002s.f156871a, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C4924h() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo9858a(C4908e eVar, float f) {
        eVar.mo9847j();
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 3;
        int i2 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (eVar.mo9853p()) {
            switch (eVar.mo9841c(f15675b)) {
                case 0:
                    str = eVar.mo9845h();
                    break;
                case 1:
                    str2 = eVar.mo9845h();
                    break;
                case 2:
                    f2 = (float) eVar.mo9839a();
                    break;
                case 3:
                    int b = eVar.mo9840b();
                    if (b <= 2 && b >= 0) {
                        i = new int[]{1, 2, 3}[b];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 4:
                    i2 = eVar.mo9840b();
                    break;
                case 5:
                    f3 = (float) eVar.mo9839a();
                    break;
                case 6:
                    f4 = (float) eVar.mo9839a();
                    break;
                case 7:
                    i3 = C4932p.m13673b(eVar);
                    break;
                case 8:
                    i4 = C4932p.m13673b(eVar);
                    break;
                case 9:
                    f5 = (float) eVar.mo9839a();
                    break;
                case 10:
                    z = eVar.mo9854q();
                    break;
                default:
                    eVar.mo9851n();
                    eVar.mo9852o();
                    break;
            }
        }
        C4908e eVar2 = eVar;
        eVar.mo9849l();
        return new C4857b(str, str2, f2, i, i2, f3, f4, i3, i4, f5, z);
    }
}
