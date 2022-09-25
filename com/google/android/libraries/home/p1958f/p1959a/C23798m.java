package com.google.android.libraries.home.p1958f.p1959a;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

/* renamed from: com.google.android.libraries.home.f.a.m */
/* compiled from: PG */
public final class C23798m extends C23792g {
    public final Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage(requireArguments().getCharSequence("message"));
        setCancelable(isCancelable());
        progressDialog.setIndeterminate(true);
        return progressDialog;
    }
}
