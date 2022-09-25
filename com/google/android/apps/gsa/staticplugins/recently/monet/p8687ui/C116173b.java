package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.app.AlertDialog;
import com.google.android.libraries.p576aq.p578b.C10502ai;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.b */
/* compiled from: PG */
public final /* synthetic */ class C116173b implements C10502ai {

    /* renamed from: a */
    public static final /* synthetic */ C116173b f322136a = new C116173b();

    private /* synthetic */ C116173b() {
    }

    /* renamed from: a */
    public final void mo18542a(Object obj, Object obj2) {
        C116176e eVar = (C116176e) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        int i = C116176e.f322141h;
        if (booleanValue) {
            if (eVar.f322145f == null) {
                eVar.f322145f = eVar.mo102532a();
                String str = eVar.f322146g;
                if (str != null) {
                    eVar.f322145f.setMessage(str);
                }
            }
            eVar.f322145f.show();
            eVar.mo102533b(eVar.f322145f);
            return;
        }
        AlertDialog alertDialog = eVar.f322145f;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }
}
