package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ActionsOverlay */
/* compiled from: PG */
public class ActionsOverlay extends LinearLayout {

    /* renamed from: a */
    public View f285415a;

    /* renamed from: b */
    public View f285416b;

    /* renamed from: c */
    public View f285417c;

    /* renamed from: d */
    public C102374p f285418d;

    /* renamed from: e */
    private ImageView f285419e;

    /* renamed from: f */
    private TextView f285420f;

    public ActionsOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo93063a(boolean z) {
        View view = this.f285415a;
        C28292j jVar = new C28292j(true != z ? 38361 : 38363);
        jVar.mo33794h(1);
        jVar.mo33795i(5);
        C28295m.m52919e(view, jVar);
        if (z) {
            this.f285415a.setContentDescription(getResources().getString(R.string.images_saved_button_description));
            this.f285419e.setImageResource(R.drawable.quantum_ic_bookmark_white_24);
            this.f285420f.setText(R.string.images_saved);
            return;
        }
        String string = getResources().getString(R.string.save_action);
        this.f285415a.setContentDescription(string);
        this.f285419e.setImageResource(R.drawable.quantum_ic_bookmark_border_white_24);
        this.f285420f.setText(string);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f285415a = findViewById(R.id.actions_overlay_save_area);
        this.f285419e = (ImageView) findViewById(R.id.actions_overlay_save_icon);
        this.f285420f = (TextView) findViewById(R.id.actions_overlay_save_text);
        this.f285416b = findViewById(R.id.actions_overlay_share_area);
        this.f285417c = findViewById(R.id.actions_overlay_referrer_area);
        View view = this.f285416b;
        C28292j jVar = new C28292j(38362);
        jVar.mo33795i(5);
        C28295m.m52919e(view, jVar);
        View view2 = this.f285417c;
        C28292j jVar2 = new C28292j(38364);
        jVar2.mo33795i(5);
        C28295m.m52919e(view2, jVar2);
    }
}
