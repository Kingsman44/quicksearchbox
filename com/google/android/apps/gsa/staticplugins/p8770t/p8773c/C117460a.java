package com.google.android.apps.gsa.staticplugins.p8770t.p8773c;

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90223c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90224d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.t.c.a */
/* compiled from: PG */
public final /* synthetic */ class C117460a implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117462c f326017a;

    public /* synthetic */ C117460a(C117462c cVar) {
        this.f326017a = cVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117462c cVar = this.f326017a;
        C90224d dVar = (C90224d) obj;
        int a = C90223c.m146769a(dVar.f252053b);
        if (a == 0 || a == 1) {
            cVar.mo103313e(cVar.f326024e, 8);
            return;
        }
        String str = dVar.f252055d;
        C90208n nVar = C90208n.UPDATES_TAB;
        C90208n a2 = C90208n.m146767a(dVar.f252057f);
        if (a2 == null) {
            a2 = C90208n.UNKNOWN_TAB;
        }
        if (nVar == a2 && TextUtils.isEmpty(str)) {
            str = cVar.f326022c.getString(R.string.opa_bottom_bar_tooltip_text_v1);
        }
        ((TextView) cVar.f326023d.findViewById(R.id.bottom_bar_tooltip_content_container)).setText(str);
        cVar.f326023d.findViewById(R.id.bottom_bar_tooltip_content_container).setContentDescription(cVar.mo83946c());
        if (cVar.f326027h == null) {
            cVar.f326027h = new C117461b(cVar, dVar);
            cVar.f326023d.getViewTreeObserver().addOnGlobalLayoutListener(cVar.f326027h);
        }
    }
}
