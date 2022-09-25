package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.surveys.internal.view.au */
/* compiled from: PG */
public final class C43092au extends C0260w implements C43090as {

    /* renamed from: a */
    private final C43091at f112707a = new C43091at(this);

    public final /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f112707a.mo46155j();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f112707a.mo46156k(viewGroup);
    }

    public final void onDestroy() {
        this.f112707a.mo46148c();
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
        this.f112707a.mo46149d(getView());
    }
}
