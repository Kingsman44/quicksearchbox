package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.DialogInterface;
import android.support.p033v7.app.AlertController;
import android.support.p033v7.app.C0392m;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.family.custodio.C132280ec;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.dz */
/* compiled from: PG */
public final /* synthetic */ class C132275dz implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C132280ec f361039a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f361040b;

    public /* synthetic */ C132275dz(C132280ec ecVar, C0392m mVar) {
        this.f361039a = ecVar;
        this.f361040b = mVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C132280ec ecVar = this.f361039a;
        C0392m mVar = this.f361040b;
        String string = ecVar.f361052c.getString("entry_point_id");
        String string2 = ecVar.f361052c.getString("supervised_oid");
        if (string2 == null || string == null) {
            throw new IllegalStateException("Required supervised_oid argument not provided to DeviceListUnlinkDialogFragment!");
        }
        C132280ec.C132281a aVar = ecVar.f361056g;
        aVar.f361058a = (ProgressBar) mVar.mo1197b().mo1177e(R.id.assistant_custodio_device_list_progress_bar);
        aVar.f361059b = (TextView) mVar.mo1197b().mo1177e(R.id.assistant_custodio_device_list_unlink_dialog_title);
        aVar.f361060c = (TextView) mVar.mo1197b().mo1177e(R.id.assistant_custodio_device_list_unlink_dialog_body);
        aVar.f361061d = (ViewGroup) mVar.mo1197b().mo1177e(R.id.buttonPanel);
        AlertController alertController = mVar.f1349a;
        aVar.f361062e = alertController.f1110j;
        aVar.f361063f = alertController.f1113m;
        ecVar.f361054e.mo50707a(ecVar.f361053d.mo110501a(string, C58485gu.m89846n(string2), false), ecVar.f361056g);
    }
}
