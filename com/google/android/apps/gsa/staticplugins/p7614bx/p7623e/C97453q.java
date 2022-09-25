package com.google.android.apps.gsa.staticplugins.p7614bx.p7623e;

import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.view.ContextThemeWrapper;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.e.q */
/* compiled from: PG */
public final /* synthetic */ class C97453q implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C97434ac f272153a;

    public /* synthetic */ C97453q(C97434ac acVar) {
        this.f272153a = acVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C97434ac acVar = this.f272153a;
        if (((Boolean) obj).booleanValue()) {
            C0391l lVar = new C0391l(new ContextThemeWrapper(acVar.f272082b, R.style.loading_account_hub_dialog));
            lVar.mo1307l(R.string.hub_menu_sign_in_title);
            lVar.f1347a.f1326g = acVar.f272082b.getString(R.string.hub_menu_sign_in_message, new Object[]{((C23249a) acVar.f272085e.mo90690p()).mo28725a()});
            acVar.f272093m = lVar.create();
            acVar.f272093m.show();
            return;
        }
        C0392m mVar = acVar.f272093m;
        if (mVar != null) {
            mVar.dismiss();
        }
        acVar.f272093m = null;
    }
}
