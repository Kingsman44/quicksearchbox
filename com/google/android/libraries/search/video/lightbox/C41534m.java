package com.google.android.libraries.search.video.lightbox;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.search.video.lightbox.m */
/* compiled from: PG */
public final /* synthetic */ class C41534m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C41539r f108550a;

    public /* synthetic */ C41534m(C41539r rVar) {
        this.f108550a = rVar;
    }

    public final void onClick(View view) {
        C41539r rVar = this.f108550a;
        rVar.f108562f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C41526e eVar = rVar.f108569m;
        if (eVar != null) {
            eVar.f108539a.finish();
        }
        rVar.mo44062d(11);
    }
}
