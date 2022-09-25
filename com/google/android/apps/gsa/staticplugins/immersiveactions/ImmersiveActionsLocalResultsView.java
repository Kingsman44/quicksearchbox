package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.staticplugins.actionsui.LocalResultsView;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55112gh;
import com.google.p4152bb.p4153a.C55114gj;

/* compiled from: PG */
public class ImmersiveActionsLocalResultsView extends LocalResultsView {
    public ImmersiveActionsLocalResultsView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo87727a(LayoutInflater layoutInflater) {
    }

    /* renamed from: b */
    public final void mo87728b(C55114gj gjVar) {
        if (((LocationArgument) this.f261447m).f236147h) {
            mo87730d();
            this.f260758e.setVisibility(8);
            C55112gh ghVar = (C55112gh) gjVar.f145037b.get(0);
            View inflate = this.f260757d.inflate(R.layout.immersive_actions_location_view_suppress_disambiguation, this.f260755b, false);
            TextView textView = (TextView) inflate.findViewById(R.id.argument_label);
            TextView textView2 = (TextView) inflate.findViewById(R.id.argument_value);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.arrow);
            if (this.f260762i) {
                textView.setVisibility(8);
                textView2.setTextAppearance(R.style.action_card_filled_valyrian_immersive_actions);
                imageView.setPadding(0, 0, 0, 0);
            } else {
                textView.setText(mo88127l().getString(R.string.immersive_actions_location_label_suppress_disambiguation));
            }
            textView2.setText(mo88127l().getString(R.string.immersive_contact_disambiguation_header_label, new Object[]{ghVar.f145021c}));
            textView2.setOnClickListener(new C102454y(this, ghVar));
            this.f260755b.addView(inflate);
            this.f260756c.add(inflate);
            this.f260759f++;
            return;
        }
        this.f260758e.setVisibility(0);
        super.mo87728b(gjVar);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f260760g = R.layout.immersive_actions_small_location_argument_editor;
        this.f260761h = R.layout.immersive_actions_local_results_item_2;
    }

    public ImmersiveActionsLocalResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
