package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.app.Dialog;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30261f;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.ag */
/* compiled from: PG */
public final /* synthetic */ class C30709ag implements C30261f {

    /* renamed from: a */
    public final /* synthetic */ C30712aj f82917a;

    public /* synthetic */ C30709ag(C30712aj ajVar) {
        this.f82917a = ajVar;
    }

    /* renamed from: a */
    public final void mo35771a(Object obj) {
        C30712aj ajVar = this.f82917a;
        if (ajVar.getDialog() != null && ajVar.getDialog().isShowing()) {
            C30718ap apVar = ajVar.f82922c;
            Dialog dialog = ajVar.getDialog();
            Objects.requireNonNull(dialog);
            apVar.post(new C30705ac(dialog));
        }
    }
}
