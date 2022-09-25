package com.google.android.libraries.abuse.reporting;

import android.view.View;

/* renamed from: com.google.android.libraries.abuse.reporting.ak */
/* compiled from: PG */
public final /* synthetic */ class C146722ak implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C146726ao f396221a;

    /* renamed from: b */
    public final /* synthetic */ int f396222b;

    /* renamed from: c */
    public final /* synthetic */ int f396223c;

    public /* synthetic */ C146722ak(C146726ao aoVar, int i, int i2) {
        this.f396221a = aoVar;
        this.f396222b = i;
        this.f396223c = i2;
    }

    public final void onClick(View view) {
        C146726ao aoVar = this.f396221a;
        ((C146713ab) aoVar.getActivity()).mo123514m(this.f396222b, this.f396223c);
    }
}
