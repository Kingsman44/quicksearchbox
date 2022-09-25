package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import android.widget.AdapterView;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.p1685b.C19893b;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20153bw;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20154bx;
import com.google.common.p4535g.C59203do;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.c.eb */
/* compiled from: PG */
final class C20290eb implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C20297ei f57002a;

    public C20290eb(C20297ei eiVar) {
        this.f57002a = eiVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C20297ei eiVar = this.f57002a;
        if (eiVar.f57025m != i) {
            String n = eiVar.f57014b.mo25171n();
            List b = this.f57002a.f57013a.mo25346b(n);
            C20297ei eiVar2 = this.f57002a;
            eiVar2.f57021i = true;
            eiVar2.f57022j = true;
            eiVar2.f57024l = true;
            eiVar2.f57017e.mo25169D(b);
            C20297ei eiVar3 = this.f57002a;
            C19893b bVar = eiVar3.f57017e;
            C20300el elVar = (C20300el) eiVar3.f57013a.f57042b.get(n);
            String str = BuildConfig.FLAVOR;
            bVar.mo25168C(elVar != null ? elVar.f57038c.f56518a : str);
            this.f57002a.f57018f.mo25169D(b);
            C20297ei eiVar4 = this.f57002a;
            C19893b bVar2 = eiVar4.f57018f;
            C20300el elVar2 = (C20300el) eiVar4.f57013a.f57042b.get(n);
            if (elVar2 != null) {
                str = elVar2.f57039d.f56518a;
            }
            bVar2.mo25168C(str);
            C20297ei eiVar5 = this.f57002a;
            C20205ay ayVar = eiVar5.f57015c;
            C20300el elVar3 = (C20300el) eiVar5.f57013a.f57042b.get(n);
            ayVar.mo25289A(C20297ei.m38179m(elVar3 != null ? elVar3.f57040e : C59203do.f157270a));
            C20297ei eiVar6 = this.f57002a;
            eiVar6.f57021i = false;
            eiVar6.f57022j = false;
            eiVar6.f57024l = false;
            eiVar6.f57025m = i;
            eiVar6.mo25344o();
            C20153bw bwVar = this.f57002a.f57013a.f57041a;
            bwVar.copyOnWrite();
            C20154bx bxVar = (C20154bx) bwVar.instance;
            C20154bx bxVar2 = C20154bx.f56530h;
            n.getClass();
            bxVar.f56532a |= 1;
            bxVar.f56533b = n;
            this.f57002a.f57014b.mo25172o();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
