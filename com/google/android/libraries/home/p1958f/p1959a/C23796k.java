package com.google.android.libraries.home.p1958f.p1959a;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50181no;

/* renamed from: com.google.android.libraries.home.f.a.k */
/* compiled from: PG */
final class C23796k implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C50181no f65208a;

    /* renamed from: b */
    final /* synthetic */ C23797l f65209b;

    public C23796k(C50181no noVar, C23797l lVar) {
        this.f65208a = noVar;
        this.f65209b = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Bundle bundle = new Bundle(2);
        C23787b.m44307b(bundle, this.f65208a);
        int i2 = C23795j.m44329a()[i];
        bundle.putString("providerAction", i2 != 0 ? i2 != R.string.resync_provider ? i2 != R.string.unlink_provider ? "null" : "UNLINK" : "RESYNC" : null);
        this.f65209b.getParentFragmentManager().mo449P("linkedProviderAction", bundle);
    }
}
