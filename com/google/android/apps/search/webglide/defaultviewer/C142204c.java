package com.google.android.apps.search.webglide.defaultviewer;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.search.webglide.p10704f.C142224b;
import com.google.android.apps.search.webglide.p10704f.C142225c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58852bp;

/* renamed from: com.google.android.apps.search.webglide.defaultviewer.c */
/* compiled from: PG */
public final /* synthetic */ class C142204c implements C58852bp {

    /* renamed from: a */
    public final /* synthetic */ C142211j f385783a;

    public /* synthetic */ C142204c(C142211j jVar) {
        this.f385783a = jVar;
    }

    /* renamed from: a */
    public final void mo40846a(Object obj) {
        View view;
        View findViewById;
        C142211j jVar = this.f385783a;
        if (!((Boolean) obj).booleanValue() && (view = jVar.f385797d.getView()) != null && (findViewById = view.findViewById(R.id.webglide_bottom_navigation_next)) != null && findViewById.getVisibility() == 0 && findViewById.isEnabled()) {
            C142224b bVar = new C142224b();
            bVar.f385829c = view.findViewById(R.id.webglide_default_bottom_bar);
            bVar.f385828b = view;
            bVar.f385827a = jVar.f385812s.getString(R.string.webglide_tutorial_next_button);
            bVar.f385831e = new C142206e(jVar);
            bVar.f385830d = R.id.webglide_tutorial_bottom_nav_next;
            jVar.f385810q = new C142225c(bVar);
            C142225c cVar = jVar.f385810q;
            if (!cVar.f385837f) {
                ConstraintLayout constraintLayout = (ConstraintLayout) cVar.f385833b;
                constraintLayout.getClass();
                View view2 = cVar.f385834c;
                view2.getClass();
                int indexOfChild = constraintLayout.indexOfChild(view2);
                View view3 = cVar.f385836e;
                view3.getClass();
                constraintLayout.addView((ConstraintLayout) view3, indexOfChild);
                ((TextView) cVar.f385836e.findViewById(R.id.webglide_tutorial_text)).setText(cVar.f385832a);
                C1756o oVar = new C1756o();
                oVar.mo4889i(constraintLayout);
                C1756o oVar2 = oVar;
                oVar2.mo4892l(cVar.f385836e.getId(), 3, 0, 3, 0);
                oVar2.mo4892l(cVar.f385836e.getId(), 4, cVar.f385834c.getId(), 3, cVar.f385834c.getHeight());
                oVar.mo4888h(constraintLayout);
                cVar.f385836e.setOnClickListener(cVar.f385835d);
                cVar.f385834c.setOnClickListener(cVar.f385835d);
                cVar.f385837f = true;
            }
        }
    }
}
