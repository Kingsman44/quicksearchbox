package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import com.google.android.libraries.surveys.internal.p3328e.C43059h;
import com.google.android.libraries.surveys.internal.p3328e.C43060i;

/* renamed from: com.google.android.libraries.surveys.internal.view.aa */
/* compiled from: PG */
public final /* synthetic */ class C43072aa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112650a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f112651b;

    /* renamed from: c */
    public final /* synthetic */ String f112652c;

    public /* synthetic */ C43072aa(C43091at atVar, View.OnClickListener onClickListener, String str) {
        this.f112650a = atVar;
        this.f112651b = onClickListener;
        this.f112652c = str;
    }

    public final void onClick(View view) {
        C43091at atVar = this.f112650a;
        View.OnClickListener onClickListener = this.f112651b;
        String str = this.f112652c;
        C43060i iVar = new C43060i();
        onClickListener.onClick(view);
        C43059h.m75974e(iVar, atVar.f112687d, str);
    }
}
