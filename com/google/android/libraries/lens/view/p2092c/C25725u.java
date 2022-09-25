package com.google.android.libraries.lens.view.p2092c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.libraries.lens.view.p2056af.C25070bo;
import com.google.android.libraries.p1635au.C19567d;

/* renamed from: com.google.android.libraries.lens.view.c.u */
/* compiled from: PG */
final class C25725u extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C25727w f69950a;

    public C25725u(C25727w wVar) {
        this.f69950a = wVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C118569b bVar;
        this.f69950a.mo30863c();
        String stringExtra = intent.getStringExtra("LensAppShortcutType");
        C25070bo boVar = this.f69950a.f69955e;
        C118575h hVar = C118575h.PLUGIN_LENS;
        if (stringExtra == null) {
            bVar = C118569b.UNKNOWN_METRIC_TYPE;
        } else if (stringExtra.equals("QSB_WIDGET")) {
            bVar = C118569b.QSB_WIDGET_APP_SHORTCUT_INSTALLED;
        } else if (stringExtra.equals("LENS_APP_ICON")) {
            bVar = C118569b.LENS_APP_SHORTCUT_INSTALLED;
        } else {
            bVar = C118569b.UNKNOWN_METRIC_TYPE;
        }
        boVar.mo30251a(hVar, bVar, 1);
        if (this.f69950a.f69957g && stringExtra != null) {
            if (stringExtra.equals("QSB_WIDGET")) {
                ((C19567d) this.f69950a.f69956f.f68255g.mo6453a()).mo24822a(1, new Object[0]);
            } else if (stringExtra.equals("LENS_APP_ICON")) {
                ((C19567d) this.f69950a.f69956f.f68257i.mo6453a()).mo24822a(1, new Object[0]);
            }
        }
        this.f69950a.f69959i.mo5706i(true);
    }
}
