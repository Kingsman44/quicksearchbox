package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116194w;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1875j.C22845p;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.n */
/* compiled from: PG */
public final class C116148n extends C116156v {

    /* renamed from: a */
    public final C116194w f322071a;

    /* renamed from: b */
    private final Context f322072b;

    public C116148n(Context context, C116194w wVar) {
        super(context, R.drawable.myactivity_illustration, R.string.my_activity_card_header, R.string.my_activity_card_text);
        this.f322072b = context;
        this.f322071a = wVar;
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
        Timeline timeline = bVar.f321699a.f321706d;
        int i = rVar.f322281b;
        C22845p pVar = timeline.f322178a[i].f322177h[fVar.f322256e];
        String str = pVar.f62896e;
        View findViewById = view.findViewById(R.id.info_entry_divider);
        Button button = (Button) view.findViewById(R.id.info_entry_action_button);
        findViewById.setVisibility(8);
        button.setVisibility(0);
        if (pVar.f62896e.isEmpty()) {
            button.setText(R.string.my_activity_card_button_text);
        } else {
            button.setText(this.f322072b.getString(R.string.my_activity_card_button_text_with_search, new Object[]{str}));
        }
        button.setOnClickListener(new C116147m(this, str));
    }
}
