package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7070b.p7092k.C90250a;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.l */
/* compiled from: PG */
public final /* synthetic */ class C105644l implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105474ab f294744a;

    public /* synthetic */ C105644l(C105474ab abVar) {
        this.f294744a = abVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105474ab abVar = this.f294744a;
        Boolean bool = (Boolean) obj;
        C90250a aVar = abVar.f294214v;
        if (aVar != null && abVar.f294215w != null) {
            int i = aVar.mo83968i();
            C105604ex exVar = abVar.f294215w;
            ViewGroup.LayoutParams layoutParams = exVar.f294660a.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(0, i, 0, 0);
                exVar.f294660a.setLayoutParams(marginLayoutParams);
            }
        }
    }
}
