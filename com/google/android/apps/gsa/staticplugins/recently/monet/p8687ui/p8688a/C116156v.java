package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.v */
/* compiled from: PG */
public class C116156v extends C116145k {

    /* renamed from: a */
    private final Context f322088a;

    /* renamed from: b */
    private final int f322089b;

    /* renamed from: c */
    private final int f322090c;

    /* renamed from: d */
    private final int f322091d;

    public C116156v(Context context, int i, int i2, int i3) {
        this.f322088a = context;
        this.f322089b = i;
        this.f322090c = i2;
        this.f322091d = i3;
    }

    /* renamed from: a */
    public float mo102408a() {
        return 1.0f;
    }

    /* renamed from: b */
    public float mo102409b() {
        return this.f322088a.getResources().getDimension(R.dimen.recently_entry_max_z_translation);
    }

    /* renamed from: c */
    public final int mo102410c() {
        return R.layout.info_entry;
    }

    /* renamed from: e */
    public final void mo102412e(int i, int i2) {
    }

    /* renamed from: f */
    public void mo102413f(View view, C116019b bVar, C116226r rVar, C116214f fVar) {
        super.mo102413f(view, bVar, rVar, fVar);
        ((ImageView) view.findViewById(R.id.info_entry_icon)).setImageResource(this.f322089b);
        ((TextView) view.findViewById(R.id.info_entry_title)).setText(this.f322090c);
        TextView textView = (TextView) view.findViewById(R.id.info_entry_message);
        textView.setText(this.f322091d);
        textView.setAlpha(1.0f);
        View findViewById = view.findViewById(R.id.info_entry_divider);
        ((Button) view.findViewById(R.id.info_entry_action_button)).setVisibility(8);
        if (this.f322088a.getResources().getInteger(R.integer.info_entry_image_visibility) == 2) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
        }
        View findViewById2 = view.findViewById(R.id.info_entry_image);
        ((TextView) view.findViewById(R.id.info_entry_message_2)).setVisibility(8);
        findViewById2.setVisibility(8);
    }
}
