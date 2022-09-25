package com.google.android.libraries.surveys.internal.view;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.surveys.internal.view.bb */
/* compiled from: PG */
public final /* synthetic */ class C43100bb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43108bj f112724a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f112725b;

    /* renamed from: c */
    public final /* synthetic */ int f112726c;

    public /* synthetic */ C43100bb(C43108bj bjVar, ViewGroup viewGroup, int i) {
        this.f112724a = bjVar;
        this.f112725b = viewGroup;
        this.f112726c = i;
    }

    public final void onClick(View view) {
        C43108bj bjVar = this.f112724a;
        ViewGroup viewGroup = this.f112725b;
        int i = this.f112726c;
        C43108bj.m76063a(viewGroup);
        new Handler().postDelayed(new C43097az(bjVar, i), 250);
    }
}
