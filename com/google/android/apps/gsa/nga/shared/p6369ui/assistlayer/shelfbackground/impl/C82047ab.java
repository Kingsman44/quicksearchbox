package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80770er;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80771es;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.ab */
/* compiled from: PG */
public final /* synthetic */ class C82047ab implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C82071az f224280a;

    public /* synthetic */ C82047ab(C82071az azVar) {
        this.f224280a = azVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C82071az azVar = this.f224280a;
        C80771es esVar = (C80771es) obj;
        C80770er erVar = esVar.f221681a;
        C82074bb bbVar = azVar.f224337n;
        bbVar.f224368d = esVar;
        C82084bl blVar = bbVar.f224365a;
        C82083bk bkVar = blVar.f224408h;
        if (bbVar.f224367c && bbVar.f224368d.f221681a == null) {
            blVar.mo75500b(bkVar, 0.0f);
            bbVar.f224367c = false;
        }
        C82074bb bbVar2 = azVar.f224337n;
        if (bbVar2.f224368d.f221681a != null) {
            GestureAwareLayout gestureAwareLayout = azVar.f224327d;
            Supplier supplier = azVar.f224341r;
            C82090f fVar = gestureAwareLayout.f224273d;
            fVar.f224441d = supplier;
            fVar.mo75505a(bbVar2);
            azVar.f224333j.setVisibility(0);
            azVar.f224333j.setOnClickListener(new C82060ao(azVar));
            return;
        }
        GestureAwareLayout gestureAwareLayout2 = azVar.f224327d;
        Supplier supplier2 = azVar.f224342s;
        C82090f fVar2 = gestureAwareLayout2.f224273d;
        fVar2.f224441d = supplier2;
        fVar2.mo75505a(bbVar2);
        azVar.f224333j.setVisibility(8);
        azVar.f224333j.setOnClickListener((View.OnClickListener) null);
    }
}
