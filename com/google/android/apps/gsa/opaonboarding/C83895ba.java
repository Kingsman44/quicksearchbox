package com.google.android.apps.gsa.opaonboarding;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ba */
/* compiled from: PG */
public final class C83895ba {
    /* renamed from: a */
    public static C83892az m133621a(Context context, C83915b bVar, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if ((bVar.f228543a & 1) != 0) {
            builder.setTitle(bVar.f228544b);
        } else {
            builder.setTitle(bVar.f228545c);
        }
        if ((bVar.f228543a & 4) != 0) {
            builder.setMessage(bVar.f228546d);
        } else {
            builder.setMessage(bVar.f228547e);
        }
        if ((bVar.f228543a & 16) != 0) {
            builder.setPositiveButton(bVar.f228548f, onClickListener);
        } else {
            builder.setPositiveButton(bVar.f228549g, onClickListener);
        }
        if ((bVar.f228543a & 64) != 0) {
            builder.setNegativeButton(bVar.f228550h, onClickListener2);
        } else {
            builder.setNegativeButton(bVar.f228551i, onClickListener2);
        }
        return new C83892az(builder.create());
    }
}
