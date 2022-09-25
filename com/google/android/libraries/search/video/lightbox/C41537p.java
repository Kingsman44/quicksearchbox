package com.google.android.libraries.search.video.lightbox;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.video.players.C41592w;

/* renamed from: com.google.android.libraries.search.video.lightbox.p */
/* compiled from: PG */
public final /* synthetic */ class C41537p implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C41539r f108555a;

    public /* synthetic */ C41537p(C41539r rVar) {
        this.f108555a = rVar;
    }

    public final void onClick(View view) {
        C41539r rVar = this.f108555a;
        rVar.f108562f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C41592w wVar = rVar.f108565i;
        if (wVar != null) {
            wVar.mo44087j();
        }
    }
}
