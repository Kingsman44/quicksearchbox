package com.google.android.libraries.surveys.internal.view;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.p033v7.app.C0392m;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43057f;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;

/* renamed from: com.google.android.libraries.surveys.internal.view.z */
/* compiled from: PG */
public final class C43168z extends DialogFragment {

    /* renamed from: a */
    public static final String f112865a = "SurveyPlatSysInfoDialog-".concat("z");

    public final Dialog onCreateDialog(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.SurveyTheme);
        View inflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.survey_system_info_dialog, (ViewGroup) null);
        inflate.getContext().setTheme(R.style.SurveyAlertDialogCustomViewTheme);
        C0392m create = C43057f.m75964a(contextThemeWrapper).setView(inflate).create();
        inflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new C43166x(create));
        Bundle arguments = getArguments();
        String string = arguments.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle2 = arguments.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.setLayoutManager(new LinearLayoutManager(contextThemeWrapper));
        C43141cp cpVar = new C43141cp();
        recyclerView.setAdapter(cpVar);
        recyclerView.addOnScrollListener(new C43167y(this, inflate));
        cpVar.f112826a = C43066o.m75989j(contextThemeWrapper, string, bundle2);
        cpVar.mObservable.mo2879a();
        return create;
    }
}
