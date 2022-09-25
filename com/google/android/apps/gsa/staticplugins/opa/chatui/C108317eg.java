package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C113974bt;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.eg */
/* compiled from: PG */
public final class C108317eg extends DialogFragment {

    /* renamed from: e */
    public static final /* synthetic */ int f301316e = 0;

    /* renamed from: a */
    public C108321ej f301317a;

    /* renamed from: b */
    public C108320ei f301318b;

    /* renamed from: c */
    public SharedPreferences f301319c;

    /* renamed from: d */
    public C86054o f301320d;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.eg$a */
    /* compiled from: PG */
    public interface C108318a {
        /* renamed from: qC */
        void mo96773qC(C108317eg egVar);
    }

    /* renamed from: a */
    public final void mo96767a(String str) {
        dismiss();
        this.f301319c.edit().putBoolean("opa_has_previous_deletions_prefix_".concat(str), true).apply();
        C108321ej ejVar = this.f301317a;
        String h = this.f301318b.mo96778h();
        if (!TextUtils.isEmpty(h) && ejVar.f301326f != null) {
            ejVar.f301322b.mo28212l("Handle delete", new C108312eb(ejVar, h));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C108318a) C47266f.m84076a(getActivity().getApplicationContext(), C108318a.class)).mo96773qC(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.dialog_chatui_long_click, viewGroup);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C113974bt btVar;
        C108321ej ejVar = this.f301317a;
        String h = this.f301318b.mo96778h();
        if (!TextUtils.isEmpty(h) && (btVar = ejVar.f301328h) != null) {
            btVar.f315609a.mo101007bi(false, h);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onResume() {
        super.onResume();
        C89949q.m146522f(getDialog().findViewById(R.id.dialog_content));
        getDialog().getWindow().clearFlags(2);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.dialog_row_delete);
        if (this.f301317a.f301323c) {
            findViewById.setEnabled(true);
            findViewById.setOnClickListener(new C89943l(new C108315ee(this)));
        } else {
            findViewById.setEnabled(false);
        }
        if (!TextUtils.isEmpty(this.f301318b.mo96696i())) {
            View findViewById2 = view.findViewById(R.id.dialog_row_edit);
            findViewById2.setVisibility(0);
            findViewById2.setOnClickListener(new C89943l(new C108316ef(this)));
        }
    }
}
