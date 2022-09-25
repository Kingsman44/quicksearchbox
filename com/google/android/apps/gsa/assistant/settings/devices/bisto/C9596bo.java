package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.DialogInterface;
import android.support.p033v7.app.C0391l;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124657bw;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.bo */
/* compiled from: PG */
public final /* synthetic */ class C9596bo implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33205a;

    public /* synthetic */ C9596bo(C9619ck ckVar) {
        this.f33205a = ckVar;
    }

    public final void run() {
        C0391l gh;
        C9619ck ckVar = this.f33205a;
        if (ckVar.f33290x.mo106523u().equals(C124657bw.WAITING_TO_APPLY_OTA) && ckVar.mo17905N() && (gh = ckVar.mo17796gh()) != null) {
            int i = ckVar.f33290x.mo106513k() == C124719q.f344099c ? R.string.confirm_ota_message_car : R.string.confirm_ota_message;
            C0391l title = gh.setTitle(ckVar.mo17797h(R.string.confirm_ota_title, ckVar.f33290x.mo106476Q()));
            title.mo1300f(i);
            title.setPositiveButton(R.string.confirm_ota_positive_button, new C9585bd(ckVar)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create().show();
        }
    }
}
