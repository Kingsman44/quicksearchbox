package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.bb */
/* compiled from: PG */
public final /* synthetic */ class C115535bb implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115539bf f320472a;

    public /* synthetic */ C115535bb(C115539bf bfVar) {
        this.f320472a = bfVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115539bf bfVar = this.f320472a;
        if (((Boolean) obj).booleanValue()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bfVar.f320478c.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            bfVar.f320478c.setLayoutParams(layoutParams);
            if (bfVar.f320477b.mo56113h()) {
                C90779c.m148334a((Activity) bfVar.f320477b.mo56107c(), 1);
                return;
            }
            return;
        }
        View findViewById = bfVar.mo28297il().findViewById(R.id.empty_counterfactual_view);
        C28292j jVar = new C28292j(72434);
        jVar.mo33794h(3);
        C28295m.m52919e(findViewById, jVar);
        C89949q.m146521e(C28285c.m52874a(findViewById, 71714), false);
    }
}
