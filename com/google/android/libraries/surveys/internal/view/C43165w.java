package com.google.android.libraries.surveys.internal.view;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.surveys.internal.view.w */
/* compiled from: PG */
public final class C43165w extends DialogFragment implements C43090as {

    /* renamed from: a */
    private final C43091at f112861a = new C43091at(this);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f112861a.mo46155j();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f112861a.mo46156k(viewGroup);
    }

    public final void onDestroy() {
        this.f112861a.mo46148c();
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
        this.f112861a.mo46149d(getView());
    }
}
