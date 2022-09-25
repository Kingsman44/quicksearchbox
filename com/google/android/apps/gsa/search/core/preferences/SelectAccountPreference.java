package com.google.android.apps.gsa.search.core.preferences;

import android.content.Context;
import android.os.Bundle;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class SelectAccountPreference extends ListPreference {

    /* renamed from: a */
    public C89037bh f233312a;

    /* renamed from: b */
    private final Context f233313b;

    public SelectAccountPreference(Context context) {
        super(context);
        this.f233313b = context;
    }

    public final void showDialog(Bundle bundle) {
        C89062r rVar;
        try {
            rVar = (C89062r) C90877ak.m148472f(this.f233312a.mo27378c());
        } catch (Exception unused) {
            rVar = C89062r.f241369a;
        }
        if (!rVar.mo83040a()) {
            Toast.makeText(this.f233313b, R.string.error_connecting_to_server, 0).show();
        } else {
            super.showDialog(bundle);
        }
    }

    public SelectAccountPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f233313b = context;
    }
}
