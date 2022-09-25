package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.family.custodio.C132306fa;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ex */
/* compiled from: PG */
public final /* synthetic */ class C132302ex implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C132306fa f361091a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f361092b;

    public /* synthetic */ C132302ex(C132306fa faVar, C0392m mVar) {
        this.f361091a = faVar;
        this.f361092b = mVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C132306fa faVar = this.f361091a;
        C0392m mVar = this.f361092b;
        String string = faVar.f361098c.getString("entry_point_id");
        String string2 = faVar.f361098c.getString("supervised_oid");
        if (string2 == null || string == null) {
            throw new IllegalStateException("Required supervised_oid argument not provided to SelectedChildVerificationDialogFragment!");
        }
        C132306fa.C132307a aVar = faVar.f361103h;
        aVar.f361105a = (ProgressBar) mVar.mo1197b().mo1177e(R.id.assistant_custodio_scvdf_progress_bar);
        aVar.f361106b = (TextView) mVar.mo1197b().mo1177e(R.id.assistant_custodio_scvdf_title);
        aVar.f361107c = (TextView) mVar.mo1197b().mo1177e(R.id.assistant_custodio_scvdf_body);
        aVar.f361108d = (ViewGroup) mVar.mo1197b().mo1177e(R.id.buttonPanel);
        aVar.f361109e = mVar.f1349a.f1110j;
        faVar.f361100e.mo50707a(faVar.f361099d.mo110501a(string, C58485gu.m89846n(string2), false), faVar.f361103h);
    }
}
