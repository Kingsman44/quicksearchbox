package com.google.android.libraries.componentview.services.application;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.componentview.components.p1689c.C20193am;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56425d;

/* renamed from: com.google.android.libraries.componentview.services.application.v */
/* compiled from: PG */
public final class C20631v extends C20576bc {

    /* renamed from: c */
    private final Context f57866c;

    /* renamed from: d */
    private final C20537f f57867d;

    public C20631v(Context context, C20537f fVar) {
        this.f57866c = context;
        this.f57867d = fVar;
        Activity d = m38723d(context);
        if (d == null) {
            Log.e("DefaultDialogLauncher", "Unable to register ActivityLifecycleCallbacks because provided Context is not an Activity");
        } else {
            d.getApplication().registerActivityLifecycleCallbacks(new C20630u(this, d));
        }
    }

    /* renamed from: d */
    private final Activity m38723d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m38723d(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo25512a(C56425d dVar, C20193am amVar) {
        View view;
        Context context = this.f57866c;
        C20193am[] amVarArr = {amVar};
        if (mo25514c()) {
            Log.e("DialogLauncher", "Unable to launch dialog because DialogLauncher has already launched a dialog");
        } else if (C20482m.m38444l(context)) {
            C20470a c = this.f57867d.mo25452c(dVar);
            if (c == null) {
                Log.e("DefaultDialogLauncher", "Unable to launch dialog because dialogContent was unable to be inflated");
                view = null;
            } else {
                view = c.mo25098kH();
            }
            if (view == null) {
                Log.e("DialogLauncher", "Unable to launch dialog because dialogContent did not have a root view");
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 2132148461);
            builder.setView(view);
            AlertDialog create = builder.create();
            create.setOnShowListener(new C20572az(this, create, dVar, amVarArr));
            create.setOnDismissListener(new C20574ba(this, amVarArr));
            create.setOnCancelListener(new C20575bb(amVarArr));
            create.show();
        } else {
            Log.e("DialogLauncher", "Unable to launch dialog because provided Context is not an Activity");
        }
    }
}
