package com.google.android.libraries.onegoogle.accountmenu.gmshead;

import android.content.Context;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e;
import com.google.android.libraries.onegoogle.owners.C30968c;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.android.libraries.onegoogle.p2378b.C30829f;
import com.google.android.libraries.onegoogle.p2378b.C30830g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.gmshead.e */
/* compiled from: PG */
public final class C30649e implements C30830g {

    /* renamed from: a */
    private final Context f82745a;

    /* renamed from: b */
    private final C31012n f82746b;

    /* renamed from: c */
    private final boolean f82747c;

    public C30649e(Context context, C31012n nVar, boolean z) {
        context.getClass();
        this.f82745a = context;
        nVar.getClass();
        this.f82746b = nVar;
        this.f82747c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo35681a(Object obj, int i, C30829f fVar) {
        C60870cx cxVar;
        C30492e eVar = (C30492e) obj;
        int b = C30968c.m57809b(this.f82745a, i);
        if (this.f82747c) {
            cxVar = this.f82746b.mo36640d(eVar.mo36114a(), b);
        } else {
            cxVar = this.f82746b.mo36641e(eVar.mo36114a(), b);
        }
        C60856cj.m92911t(cxVar, new C30648d(fVar), C60826bg.f164896a);
    }
}
