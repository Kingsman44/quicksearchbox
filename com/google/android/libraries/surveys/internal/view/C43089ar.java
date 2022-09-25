package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;
import com.google.android.libraries.surveys.internal.p3328e.C43065n;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.ar */
/* compiled from: PG */
public final /* synthetic */ class C43089ar implements C43065n {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112682a;

    /* renamed from: b */
    public final /* synthetic */ String f112683b;

    public /* synthetic */ C43089ar(C43091at atVar, String str) {
        this.f112682a = atVar;
        this.f112683b = str;
    }

    /* renamed from: a */
    public final void mo46084a() {
        C43091at atVar = this.f112682a;
        String str = this.f112683b;
        C43060i iVar = new C43060i();
        Activity activity = atVar.f112688e;
        if (activity instanceof C0167am) {
            FragmentManager jw = ((C0167am) activity).mo545jw();
            C43139cn cnVar = new C43139cn();
            Bundle bundle = new Bundle(2);
            bundle.putString("EXTRA_ACCOUNT_NAME", str);
            bundle.putBundle("EXTRA_PSD_BUNDLE", C43066o.m75982c(atVar.f112686c.f112631c));
            cnVar.setArguments(bundle);
            cnVar.show(jw, C43139cn.f112824a);
            jw.mo467ah();
        } else {
            FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
            C43168z zVar = new C43168z();
            Bundle bundle2 = new Bundle(2);
            bundle2.putString("EXTRA_ACCOUNT_NAME", str);
            bundle2.putBundle("EXTRA_PSD_BUNDLE", C43066o.m75982c(atVar.f112686c.f112631c));
            zVar.setArguments(bundle2);
            beginTransaction.add(zVar, C43168z.f112865a);
            beginTransaction.commitAllowingStateLoss();
        }
        C43059h.m75972c(iVar, atVar.f112687d, str);
    }
}
