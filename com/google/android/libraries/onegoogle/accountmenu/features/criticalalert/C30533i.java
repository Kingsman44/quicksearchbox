package com.google.android.libraries.onegoogle.accountmenu.features.criticalalert;

import android.view.View;
import com.google.android.libraries.onegoogle.common.C30923j;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.i */
/* compiled from: PG */
public final /* synthetic */ class C30533i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30535k f82472a;

    /* renamed from: b */
    public final /* synthetic */ Object f82473b;

    /* renamed from: c */
    public final /* synthetic */ View f82474c;

    /* renamed from: d */
    public final /* synthetic */ boolean f82475d;

    public /* synthetic */ C30533i(C30535k kVar, Object obj, View view, boolean z) {
        this.f82472a = kVar;
        this.f82473b = obj;
        this.f82474c = view;
        this.f82475d = z;
    }

    public final void run() {
        C30535k kVar = this.f82472a;
        Object obj = this.f82473b;
        View view = this.f82474c;
        kVar.mo36194t(kVar.mo36192r(obj), C30923j.m57715a(view.getContext()), this.f82475d);
    }
}
