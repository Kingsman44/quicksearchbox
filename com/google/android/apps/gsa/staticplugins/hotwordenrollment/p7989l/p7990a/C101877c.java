package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7990a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p2203m.p2204a.C28487a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.a.c */
/* compiled from: PG */
public final /* synthetic */ class C101877c implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f284165a;

    /* renamed from: b */
    public final /* synthetic */ Activity f284166b;

    public /* synthetic */ C101877c(AlertDialog alertDialog, Activity activity) {
        this.f284165a = alertDialog;
        this.f284166b = activity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.f284165a;
        Activity activity = this.f284166b;
        alertDialog.getButton(-2).setTextColor(C28487a.m53260a(activity, R.attr.colorPrimary));
        alertDialog.getButton(-1).setTextColor(C28487a.m53260a(activity, R.attr.colorPrimary));
    }
}
