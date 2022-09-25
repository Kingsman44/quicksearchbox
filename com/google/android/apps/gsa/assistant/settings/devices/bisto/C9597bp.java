package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.DialogInterface;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89642m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142346by;
import com.google.android.p10712d.C142355cg;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.bp */
/* compiled from: PG */
public final /* synthetic */ class C9597bp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33206a;

    public /* synthetic */ C9597bp(C9619ck ckVar) {
        this.f33206a = ckVar;
    }

    public final void run() {
        String str;
        C9619ck ckVar = this.f33206a;
        C0391l gh = ckVar.mo17796gh();
        if (gh != null) {
            C142346by byVar = ckVar.f33291y.f386120f;
            if (byVar == null) {
                byVar = C142346by.f386219m;
            }
            gh.mo1307l(R.string.confirm_remove_device_title);
            if ((byVar.f386221a & 256) != 0) {
                C142355cg cgVar = byVar.f386231k;
                if (cgVar == null) {
                    cgVar = C142355cg.f386263b;
                }
                str = C124525f.m203989e(cgVar);
            } else {
                str = ckVar.f32988d.getString(C89642m.m145915a(ckVar.f33290x.mo106513k()));
            }
            gh.mo1301g(str);
            C0392m create = gh.setPositiveButton(R.string.confirm_remove_device_positive_button, new C9571aq(ckVar)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
            create.show();
            TextView textView = (TextView) create.mo1197b().mo1177e(16908299);
            if (textView != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }
}
