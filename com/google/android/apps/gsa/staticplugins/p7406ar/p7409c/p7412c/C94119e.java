package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7412c;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.c.e */
/* compiled from: PG */
final class C94119e extends C23243a {

    /* renamed from: a */
    final /* synthetic */ C94124j f262943a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94119e(C94124j jVar, View view) {
        super(R.id.elements_container, view);
        this.f262943a = jVar;
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        C89849ae aeVar;
        super.mo28675a(dVar);
        C94124j jVar = this.f262943a;
        View il = dVar.mo28297il();
        if (((Boolean) ((C94126l) jVar.f262956a).f262969b.f63720e).booleanValue()) {
            aeVar = C89849ae.EXPLORE_ON_CONTENT_LAYOUT_DONE;
        } else {
            aeVar = C89849ae.EXPLORE_ON_CONTENT_NO_SUGGESTIONS_LAYOUT_DONE;
        }
        il.getViewTreeObserver().addOnGlobalLayoutListener(new C94121g(jVar, aeVar, il));
    }
}
