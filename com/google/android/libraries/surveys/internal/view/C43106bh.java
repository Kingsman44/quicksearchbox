package com.google.android.libraries.surveys.internal.view;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.surveys.internal.view.bh */
/* compiled from: PG */
public final /* synthetic */ class C43106bh implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43108bj f112742a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f112743b;

    /* renamed from: c */
    public final /* synthetic */ int f112744c;

    public /* synthetic */ C43106bh(C43108bj bjVar, ViewGroup viewGroup, int i) {
        this.f112742a = bjVar;
        this.f112743b = viewGroup;
        this.f112744c = i;
    }

    public final void onClick(View view) {
        C43108bj bjVar = this.f112742a;
        ViewGroup viewGroup = this.f112743b;
        int i = this.f112744c;
        C43108bj.m76063a(viewGroup);
        new Handler().postDelayed(new C43102bd(bjVar, i), 250);
    }
}
