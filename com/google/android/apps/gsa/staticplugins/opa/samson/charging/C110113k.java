package com.google.android.apps.gsa.staticplugins.opa.samson.charging;

import android.app.Activity;
import android.view.Display;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.k */
/* compiled from: PG */
public final class C110113k {

    /* renamed from: a */
    public boolean f306831a = false;

    /* renamed from: b */
    private final Activity f306832b;

    public C110113k(Activity activity) {
        this.f306832b = activity;
    }

    /* renamed from: a */
    public final void mo98389a() {
        if (this.f306832b.getWindow() == null) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (this.f306832b.getWindow().getDecorView() == null) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            Display display = this.f306832b.getWindow().getDecorView().getDisplay();
            if (display == null) {
                C58976aa aaVar3 = C58975e.f156826a;
            } else if (!this.f306831a) {
                C58976aa aaVar4 = C58975e.f156826a;
            } else {
                int state = display.getState();
                if (state == 1 || state == 3 || state == 4) {
                    C58976aa aaVar5 = C58975e.f156826a;
                }
            }
        }
    }
}
