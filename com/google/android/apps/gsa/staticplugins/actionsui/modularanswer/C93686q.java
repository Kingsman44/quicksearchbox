package com.google.android.apps.gsa.staticplugins.actionsui.modularanswer;

import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.ModularCard;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.q */
/* compiled from: PG */
final class C93686q implements C93670a {

    /* renamed from: a */
    final /* synthetic */ ModularCard f261488a;

    public C93686q(ModularCard modularCard) {
        this.f261488a = modularCard;
    }

    /* renamed from: a */
    public final void mo88137a(TextView textView) {
        if (textView.getId() != R.id.message_overflow) {
            this.f261488a.findViewById(R.id.message_overflow).setVisibility(0);
        }
    }
}
