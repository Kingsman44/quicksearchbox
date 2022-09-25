package com.android.datetimepicker.date;

import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.datetimepicker.C5066a;

/* renamed from: com.android.datetimepicker.date.k */
/* compiled from: PG */
public final class C5088k extends C5066a implements C5086i, C5080c {
    public C5088k() {
        new C5081d(this);
    }

    /* renamed from: a */
    public final C5097t mo10082a() {
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivity();
        throw null;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C5084g) {
            C5084g gVar = (C5084g) targetFragment;
        }
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getActivity();
        throw null;
    }

    public final void onPause() {
        super.onPause();
        throw null;
    }

    public final void onResume() {
        super.onResume();
        throw null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        throw null;
    }
}
