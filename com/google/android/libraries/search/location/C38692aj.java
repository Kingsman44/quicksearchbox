package com.google.android.libraries.search.location;

import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.places.api.p2437b.C31861q;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.search.location.p3029a.p3031b.C38608a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.aj */
/* compiled from: PG */
public final /* synthetic */ class C38692aj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C31863s f102166a;

    /* renamed from: b */
    public final /* synthetic */ C31861q f102167b;

    /* renamed from: c */
    public final /* synthetic */ String f102168c;

    public /* synthetic */ C38692aj(C31863s sVar, C31861q qVar, String str) {
        this.f102166a = sVar;
        this.f102167b = qVar;
        this.f102168c = str;
    }

    public final C60870cx apply(Object obj) {
        C31863s sVar = this.f102166a;
        C31861q qVar = this.f102167b;
        String str = this.f102168c;
        if (((Boolean) obj).booleanValue()) {
            return C43205e.m76192b(sVar.mo37397c(qVar, str));
        }
        return C60856cj.m92899h(new C38608a());
    }
}
