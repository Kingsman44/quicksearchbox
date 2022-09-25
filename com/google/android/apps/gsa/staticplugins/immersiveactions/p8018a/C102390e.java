package com.google.android.apps.gsa.staticplugins.immersiveactions.p8018a;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.a.e */
/* compiled from: PG */
public final class C102390e extends C102391f {
    public C102390e(C88512f fVar) {
        super(fVar);
    }

    /* renamed from: k */
    public final void mo82048k() {
        C88509c cVar = this.f239227c;
        cVar.getClass();
        C102389d dVar = (C102389d) cVar;
        dVar.removeAllViews();
        C102389d.inflate(dVar.getContext(), R.layout.voice_delight_quiz_welcome_card, dVar);
        View findViewById = dVar.findViewById(R.id.voice_delight_quiz_welcome_card_title);
        findViewById.getClass();
        ((TextView) findViewById).setText("Hello!");
    }
}
