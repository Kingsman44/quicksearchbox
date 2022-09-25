package com.google.android.libraries.social.populous.p3296e.p3300d;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import com.google.android.libraries.social.populous.core.C42261an;
import com.google.android.libraries.social.populous.core.C42301c;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42239g;
import com.google.android.libraries.social.populous.p3296e.C42550o;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.p4181bi.C55844f;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.e.d.e */
/* compiled from: PG */
public final /* synthetic */ class C42505e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C42239g f111463a;

    public /* synthetic */ C42505e(C42239g gVar) {
        this.f111463a = gVar;
    }

    public final Object apply(Object obj) {
        C42239g gVar = this.f111463a;
        List list = (List) obj;
        C42550o oVar = new C42550o();
        C55844f fVar = gVar.f110584a;
        if (fVar == null) {
            fVar = C55844f.f147352c;
        }
        C57883f fVar2 = fVar.f147355b;
        if (fVar2 == null) {
            fVar2 = C57883f.f154839d;
        }
        oVar.f111622a = Integer.valueOf(fVar2.f154842b);
        oVar.f111623b = C58485gu.m89842j(list);
        oVar.f111626e = 2;
        oVar.f111627f = 2;
        C42261an d = AutocompletionCallbackMetadata.m74298d();
        C42301c cVar = (C42301c) d;
        cVar.f110930a = 5;
        cVar.f110932c = 1;
        cVar.f110931b = 1;
        oVar.f111625d = d.mo45216a();
        return oVar.mo45556a();
    }
}
