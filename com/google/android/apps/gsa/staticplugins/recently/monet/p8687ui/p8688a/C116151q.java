package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116195x;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.q */
/* compiled from: PG */
public final class C116151q extends C116156v {

    /* renamed from: a */
    public final C116195x f322076a;

    public C116151q(Context context, C116195x xVar) {
        super(context, R.drawable.onboarding_search_on, R.string.recently_disabled_card_header, R.string.recently_disabled_card_text);
        this.f322076a = xVar;
    }

    /* renamed from: a */
    public final float mo102408a() {
        return 0.25f;
    }

    /* renamed from: b */
    public final float mo102409b() {
        return 0.0f;
    }

    /* renamed from: f */
    public final void mo102413f(View view, C116019b bVar, C116226r rVar, C116214f fVar) {
        super.mo102413f(view, bVar, rVar, fVar);
        View findViewById = view.findViewById(R.id.info_entry_divider);
        Button button = (Button) view.findViewById(R.id.info_entry_action_button);
        findViewById.setVisibility(8);
        button.setVisibility(0);
        button.setText(R.string.recently_disabled_card_button_text);
        button.setOnClickListener(new C116150p(this));
    }
}
