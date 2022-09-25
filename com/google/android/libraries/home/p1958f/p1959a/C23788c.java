package com.google.android.libraries.home.p1958f.p1959a;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p031v4.app.FragmentManager;

/* renamed from: com.google.android.libraries.home.f.a.c */
/* compiled from: PG */
final class C23788c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C23789d f65181a;

    public C23788c(C23789d dVar) {
        this.f65181a = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FragmentManager parentFragmentManager = this.f65181a.getParentFragmentManager();
        Bundle bundle = new Bundle(2);
        C23789d dVar = this.f65181a;
        bundle.putInt("dialogWhich", i);
        C23787b.m44307b(bundle, dVar.mo29143a());
        parentFragmentManager.mo449P("confirmUnlinkProvider", bundle);
    }
}
