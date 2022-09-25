package com.google.android.libraries.social.populous.android;

import com.google.android.libraries.social.populous.core.C42289bo;
import com.google.android.libraries.social.populous.core.C42349j;
import com.google.android.libraries.social.populous.core.C42351l;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.Email;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.android.e */
/* compiled from: PG */
public final /* synthetic */ class C42166e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C42166e f110437a = new C42166e();

    private /* synthetic */ C42166e() {
    }

    public final Object apply(Object obj) {
        C42352m mVar = (C42352m) obj;
        String str = C42181t.f110467a;
        C58480gp e = C58485gu.m89837e();
        C42289bo h = Email.m74331h();
        h.mo45249g(mVar.f111089a);
        e.mo55395g(h.mo45250h());
        if (mVar.f111091c == C42351l.SUCCESS_LOGGED_IN) {
            C42349j jVar = new C42349j();
            String str2 = mVar.f111092d;
            if (str2 != null) {
                jVar.f111078a = str2;
                e.mo55395g(jVar.mo45312d());
            } else {
                throw new NullPointerException("Null value");
            }
        }
        return e.mo55394f();
    }
}
