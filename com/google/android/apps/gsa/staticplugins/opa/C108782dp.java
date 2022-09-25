package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Intent;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.p8182af.C106118a;
import com.google.android.apps.gsa.staticplugins.opa.p8182af.C106147x;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.dp */
/* compiled from: PG */
public final class C108782dp {

    /* renamed from: a */
    final /* synthetic */ C109040fj f302509a;

    public C108782dp(C109040fj fjVar) {
        this.f302509a = fjVar;
    }

    /* renamed from: a */
    public final void mo97164a(int i) {
        C59071e eVar = C109040fj.f303210a;
        C58976aa aaVar = C58975e.f156826a;
        C106147x xVar = this.f302509a.f303324be;
        C106118a aVar = xVar.f296236d;
        if (aVar != null) {
            aVar.mo95290b();
            ViewGroup a = xVar.f296236d.mo95289a();
            ViewGroup viewGroup = (ViewGroup) a.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(a);
                viewGroup.requestLayout();
            }
            xVar.f296236d = null;
        }
        if (i == 2 || i == 3) {
            Intent launchIntentForPackage = this.f302509a.f303346c.getPackageManager().getLaunchIntentForPackage("com.google.android.googlequicksearchbox");
            this.f302509a.f303444i.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_LANGUAGE_CHANGED);
            if (launchIntentForPackage != null) {
                this.f302509a.f303441f.startActivity(launchIntentForPackage);
                return;
            }
            return;
        }
        Intent intent = this.f302509a.f303441f.getIntent();
        this.f302509a.f303444i.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_LANGUAGE_CHANGED);
        this.f302509a.f303441f.startActivity(intent);
    }
}
