package com.google.android.libraries.lens.view.filters.translation;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.be */
/* compiled from: PG */
public final /* synthetic */ class C26067be implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26070bh f70859a;

    public /* synthetic */ C26067be(C26070bh bhVar) {
        this.f70859a = bhVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C26070bh bhVar = this.f70859a;
        bhVar.f70865e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(((C0392m) dialogInterface).f1349a.mo1106a(i)));
        if (bhVar.f70870j.mo56113h()) {
            ((C26069bg) bhVar.f70870j.mo56107c()).mo31276a(-1);
        }
    }
}
