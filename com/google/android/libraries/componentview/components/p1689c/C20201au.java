package com.google.android.libraries.componentview.components.p1689c;

import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.componentview.components.base.p1687a.C19953c;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20113aj;
import com.google.android.libraries.componentview.p1699f.C20520h;

/* renamed from: com.google.android.libraries.componentview.components.c.au */
/* compiled from: PG */
final class C20201au implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C20202av f56707a;

    public C20201au(C20202av avVar) {
        this.f56707a = avVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C20202av avVar = this.f56707a;
        if (i != avVar.f56712j) {
            int i2 = avVar.f56711d.mo25170i();
            avVar.f56712j = i2;
            if (i2 >= 0) {
                Uri.Builder appendQueryParameter = Uri.parse(avVar.f56710c.f56366c).buildUpon().appendQueryParameter("tl", ((C20113aj) avVar.f56710c.f56367d.get(i2)).f56370a);
                C19953c cVar = (C19953c) C19983f.f56002g.createBuilder();
                String builder = appendQueryParameter.toString();
                cVar.copyOnWrite();
                C19983f fVar = (C19983f) cVar.instance;
                builder.getClass();
                fVar.f56004a |= 1;
                fVar.f56005b = builder;
                cVar.copyOnWrite();
                C19983f fVar2 = (C19983f) cVar.instance;
                fVar2.f56007d = 1;
                fVar2.f56004a |= 8;
                avVar.f56709b.mo25440b((C19983f) cVar.build(), avVar.f56708a);
                C20520h.m38497b(3, "DictionaryDropdownComp", (Throwable) null, "Navigating to: ".concat(String.valueOf(appendQueryParameter.toString())), new Object[0]);
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
