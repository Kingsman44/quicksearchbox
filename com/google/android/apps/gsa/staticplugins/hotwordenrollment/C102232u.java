package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.widget.TextView;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.u */
/* compiled from: PG */
public abstract class C102232u {
    /* renamed from: e */
    public static C102231t m169449e() {
        C101502c cVar = new C101502c();
        cVar.mo92353e(TextView.BufferType.NORMAL);
        cVar.f283253b = BuildConfig.FLAVOR;
        cVar.mo92350b(false);
        return cVar;
    }

    /* renamed from: a */
    public abstract TextView.BufferType mo92539a();

    /* renamed from: b */
    public abstract CharSequence mo92540b();

    /* renamed from: c */
    public abstract CharSequence mo92541c();

    /* renamed from: d */
    public abstract boolean mo92542d();
}
