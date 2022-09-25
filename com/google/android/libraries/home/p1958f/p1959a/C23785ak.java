package com.google.android.libraries.home.p1958f.p1959a;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.assistant.p3861at.C50181no;

/* renamed from: com.google.android.libraries.home.f.a.ak */
/* compiled from: PG */
final class C23785ak implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C50181no f65179a;

    /* renamed from: b */
    final /* synthetic */ C23786al f65180b;

    public C23785ak(C50181no noVar, C23786al alVar) {
        this.f65179a = noVar;
        this.f65180b = alVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Bundle bundle = new Bundle(1);
        C23787b.m44307b(bundle, this.f65179a);
        this.f65180b.getParentFragmentManager().mo449P("zeroDevicesSynced", bundle);
    }
}
