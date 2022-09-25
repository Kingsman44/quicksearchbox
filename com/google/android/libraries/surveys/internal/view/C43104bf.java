package com.google.android.libraries.surveys.internal.view;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.surveys.internal.view.bf */
/* compiled from: PG */
public final /* synthetic */ class C43104bf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43108bj f112734a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f112735b;

    /* renamed from: c */
    public final /* synthetic */ int f112736c;

    public /* synthetic */ C43104bf(C43108bj bjVar, ViewGroup viewGroup, int i) {
        this.f112734a = bjVar;
        this.f112735b = viewGroup;
        this.f112736c = i;
    }

    public final void onClick(View view) {
        C43108bj bjVar = this.f112734a;
        ViewGroup viewGroup = this.f112735b;
        int i = this.f112736c;
        C43108bj.m76063a(viewGroup);
        new Handler().postDelayed(new C43101bc(bjVar, i), 250);
    }
}
