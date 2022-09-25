package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116196y;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1875j.C22836g;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.d */
/* compiled from: PG */
public final class C116138d extends C116156v {

    /* renamed from: a */
    public final C116196y f322055a;

    public C116138d(Context context, C116196y yVar) {
        super(context, R.drawable.sync_with_chrome_icon, R.string.cct_account_mismatch_card_header, R.string.cct_account_mismatch_card_text);
        this.f322055a = yVar;
    }

    /* renamed from: f */
    public final void mo102413f(View view, C116019b bVar, C116226r rVar, C116214f fVar) {
        super.mo102413f(view, bVar, rVar, fVar);
        View findViewById = view.findViewById(R.id.info_entry_divider);
        Button button = (Button) view.findViewById(R.id.info_entry_action_button);
        findViewById.setVisibility(8);
        Timeline timeline = bVar.f321699a.f321706d;
        int i = rVar.f322281b;
        C22836g gVar = timeline.f322178a[i].f322177h[fVar.f322256e].f62904m;
        if (gVar == null) {
            gVar = C22836g.f62864d;
        }
        String str = gVar.f62867b;
        TextView textView = (TextView) view.findViewById(R.id.info_entry_message);
        Resources resources = textView.getResources();
        String str2 = gVar.f62868c;
        textView.setText(Html.fromHtml(String.format(resources.getString(R.string.cct_account_mismatch_card_text), new Object[]{str2, str})));
        button.setVisibility(0);
        button.setText(resources.getString(R.string.cct_account_mismatch_card_button_text, new Object[]{str2}));
        button.setOnClickListener(new C116137c(this));
    }
}
