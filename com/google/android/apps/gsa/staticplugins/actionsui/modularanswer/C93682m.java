package com.google.android.apps.gsa.staticplugins.actionsui.modularanswer;

import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.ModularCard;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.m */
/* compiled from: PG */
final class C93682m implements C93670a {

    /* renamed from: a */
    final /* synthetic */ ModularCard f261482a;

    public C93682m(ModularCard modularCard) {
        this.f261482a = modularCard;
    }

    /* renamed from: a */
    public final void mo88137a(TextView textView) {
        if (textView.getId() != R.id.list_items_overflow) {
            this.f261482a.findViewById(R.id.list_items_overflow).setVisibility(0);
        }
    }
}
