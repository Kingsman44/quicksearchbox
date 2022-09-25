package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.k */
/* compiled from: PG */
public final /* synthetic */ class C115635k implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C115639o f320791a;

    public /* synthetic */ C115635k(C115639o oVar) {
        this.f320791a = oVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C115639o oVar = this.f320791a;
        AlertDialog alertDialog = oVar.f320796b;
        if (alertDialog != null) {
            Drawable background = alertDialog.getWindow().getDecorView().getBackground();
            if (background instanceof InsetDrawable) {
                ((InsetDrawable) background).setDrawable(oVar.f320795a.getResources().getDrawable(R.drawable.omp_gm_dialog_background));
            }
        }
    }
}
