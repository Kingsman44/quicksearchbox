package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.p8404a;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.j */
/* compiled from: PG */
public final class C109843j extends C83907bm {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.error_retry, viewGroup, false);
        new AlertDialog.Builder(getActivity()).setMessage(R.string.opa_error_consent_retry_message_conn_error).setNegativeButton(R.string.opa_error_consent_retry_negative, new C109842i(this)).setPositiveButton(R.string.opa_error_consent_retry_positive, new C109841h(this)).setCancelable(false).create().show();
        C28295m.m52919e(frameLayout, new C28292j(46428));
        return frameLayout;
    }
}
