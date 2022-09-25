package com.google.android.libraries.material.opensearchbar;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;

/* renamed from: com.google.android.libraries.material.opensearchbar.i */
/* compiled from: PG */
public final /* synthetic */ class C28554i implements C2010ad {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f77633a;

    /* renamed from: b */
    public final /* synthetic */ int f77634b;

    /* renamed from: c */
    public final /* synthetic */ int f77635c;

    public /* synthetic */ C28554i(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        this.f77633a = marginLayoutParams;
        this.f77634b = i;
        this.f77635c = i2;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f77633a;
        int i = this.f77634b;
        int i2 = this.f77635c;
        marginLayoutParams.leftMargin = i + cpVar.mo5240b();
        marginLayoutParams.rightMargin = i2 + cpVar.mo5241c();
        return cpVar;
    }
}
