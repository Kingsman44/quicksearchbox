package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116163af;
import com.google.android.apps.gsa.staticplugins.recently.p8679b.C116032h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1875j.C22844o;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.w */
/* compiled from: PG */
public final class C116157w extends C116155u {
    public C116157w(Context context, C22871g gVar, C116032h hVar, C116163af afVar) {
        super(context, gVar, hVar, afVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo102528h(C22845p pVar) {
        return this.f322052a.getResources().getString(R.string.screenshot_web_desc, new Object[]{mo102529i(pVar)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo102529i(C22845p pVar) {
        C22844o oVar = pVar.f62897f;
        if (oVar == null) {
            oVar = C22844o.f62884e;
        }
        String str = oVar.f62889d;
        if (str != null && !str.isEmpty()) {
            return str;
        }
        C22844o oVar2 = pVar.f62897f;
        if (oVar2 == null) {
            oVar2 = C22844o.f62884e;
        }
        return oVar2.f62888c;
    }
}
