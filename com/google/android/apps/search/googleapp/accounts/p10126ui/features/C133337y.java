package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import com.google.android.material.p3506c.C44581b;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.y */
/* compiled from: PG */
public final class C133337y extends C0260w {

    /* renamed from: a */
    public C44581b f363322a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f363322a == null) {
            dismiss();
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return this.f363322a.create();
    }
}
