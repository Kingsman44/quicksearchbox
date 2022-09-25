package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.view.ChatHeadNudge;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.p */
/* compiled from: PG */
public final /* synthetic */ class C108172p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C108185z f300834a;

    public /* synthetic */ C108172p(C108185z zVar) {
        this.f300834a = zVar;
    }

    public final void run() {
        C108185z zVar = this.f300834a;
        int i = zVar.f300873j;
        if (i == 3 || i == 4) {
            zVar.mo96525g().mo96509a(zVar.mo96520b());
            ChatHeadNudge g = zVar.mo96525g();
            if (g.getVisibility() != 0) {
                g.setVisibility(0);
                g.setAlpha(0.0f);
                g.animate().alpha(1.0f).setDuration(ChatHeadNudge.f300842b.toMillis()).start();
                if (g.f300843c == null) {
                    g.f300843c = ObjectAnimator.ofFloat(g, "rotation", new float[]{0.0f, 360.0f}).setDuration(ChatHeadNudge.f300841a.toMillis());
                    g.f300843c.setInterpolator(new LinearInterpolator());
                    g.f300843c.setRepeatCount(-1);
                }
                g.f300843c.start();
            }
            if (zVar.f300866c.mo79746e(C90037cp.f248404L)) {
                zVar.f300865b.mo28213m("nudgeHaptic", 1000, new C108177u(zVar));
            }
        }
    }
}
