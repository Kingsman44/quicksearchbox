package com.google.android.libraries.surveys.internal.view;

import android.os.Bundle;
import android.support.p031v4.app.FragmentManager;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43065n;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.cb */
/* compiled from: PG */
public final /* synthetic */ class C43127cb implements C43065n {

    /* renamed from: a */
    public final /* synthetic */ C43129cd f112787a;

    /* renamed from: b */
    public final /* synthetic */ String f112788b;

    public /* synthetic */ C43127cb(C43129cd cdVar, String str) {
        this.f112787a = cdVar;
        this.f112788b = str;
    }

    /* renamed from: a */
    public final void mo46084a() {
        C43129cd cdVar = this.f112787a;
        String str = this.f112788b;
        C43060i iVar = new C43060i();
        FragmentManager fragmentManager = cdVar.f112808r;
        C43139cn cnVar = new C43139cn();
        Bundle bundle = new Bundle(2);
        bundle.putString("EXTRA_ACCOUNT_NAME", str);
        bundle.putBundle("EXTRA_PSD_BUNDLE", C43066o.m75982c(cdVar.f112794d.f112631c));
        cnVar.setArguments(bundle);
        cnVar.show(fragmentManager, C43139cn.f112824a);
        fragmentManager.mo467ah();
        C43059h.m75972c(iVar, cdVar.f112807q, str);
    }
}
