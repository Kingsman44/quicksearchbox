package com.google.android.libraries.home.p1958f.p1959a;

import android.view.View;
import android.view.ViewStub;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.home.f.a.z */
/* compiled from: PG */
final class C23811z implements ViewStub.OnInflateListener {

    /* renamed from: a */
    final /* synthetic */ C23782ah f65227a;

    public C23811z(C23782ah ahVar) {
        this.f65227a = ahVar;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        view.findViewById(R.id.empty_provider_list_refresh_button).setOnClickListener(new C23810y(this.f65227a));
    }
}
