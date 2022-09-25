package com.google.android.apps.gsa.staticplugins.actionsui;

import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.s */
/* compiled from: PG */
final class C93694s extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ CompactHelpCardFeatureView f261496a;

    public C93694s(CompactHelpCardFeatureView compactHelpCardFeatureView) {
        this.f261496a = compactHelpCardFeatureView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        if (this.f261496a.f260738a.getVisibility() == 0) {
            this.f261496a.f260738a.setVisibility(8);
            this.f261496a.f260740c.setVisibility(8);
            this.f261496a.f260741d.setImageResource(R.drawable.quantum_ic_expand_more_black_24);
            CompactHelpCardFeatureView compactHelpCardFeatureView = this.f261496a;
            compactHelpCardFeatureView.f260741d.setContentDescription(compactHelpCardFeatureView.getResources().getString(R.string.show_examples_description));
            this.f261496a.f260739b.setVisibility(0);
            return;
        }
        this.f261496a.f260738a.setVisibility(0);
        this.f261496a.f260740c.setVisibility(0);
        this.f261496a.f260741d.setImageResource(R.drawable.quantum_ic_expand_less_black_24);
        CompactHelpCardFeatureView compactHelpCardFeatureView2 = this.f261496a;
        compactHelpCardFeatureView2.f260741d.setContentDescription(compactHelpCardFeatureView2.getResources().getString(R.string.hide_examples_description));
        this.f261496a.f260739b.setVisibility(8);
    }
}
