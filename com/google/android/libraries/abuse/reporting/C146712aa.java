package com.google.android.libraries.abuse.reporting;

import android.view.View;
import android.widget.RadioGroup;

/* renamed from: com.google.android.libraries.abuse.reporting.aa */
/* compiled from: PG */
final class C146712aa implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C146713ab f396204a;

    /* renamed from: b */
    final /* synthetic */ int f396205b;

    /* renamed from: c */
    final /* synthetic */ String f396206c;

    public C146712aa(C146713ab abVar, int i, String str) {
        this.f396204a = abVar;
        this.f396205b = i;
        this.f396206c = str;
    }

    public final void onClick(View view) {
        this.f396204a.mo123515n(((RadioGroup) view.getParent()).indexOfChild(view), this.f396205b, this.f396206c);
    }
}
