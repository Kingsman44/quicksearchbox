package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7176n.C91067j;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.bj */
/* compiled from: PG */
public final /* synthetic */ class C103147bj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C103153bp f287853a;

    public /* synthetic */ C103147bj(C103153bp bpVar) {
        this.f287853a = bpVar;
    }

    public final void run() {
        C103153bp bpVar = this.f287853a;
        if (bpVar.f287866e.mo79746e(C90037cp.f248467av)) {
            bpVar.f287865d.mo74741b(C91067j.m148771c(bpVar.f287866e));
        } else {
            C103143bf.m171041h(bpVar.f287862a);
        }
        if (bpVar.f287867f.isPresent()) {
            C89949q.m146521e(C28285c.m52882i((View) bpVar.f287867f.get(), 5, (Integer) null), false);
        }
    }
}
