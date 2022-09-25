package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2814a;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.a.c */
/* compiled from: PG */
public final class C36687c extends LinearLayout {

    /* renamed from: a */
    public final Switch f95575a;

    public C36687c(Context context) {
        super(context, (AttributeSet) null, 0);
        LayoutInflater.from(context).inflate(R.layout.assistant_consent_ui, this);
        Switch switchR = new Switch(context);
        this.f95575a = switchR;
        ((ViewGroup) findViewById(R.id.consent_ui_control)).addView(switchR);
    }

    /* renamed from: a */
    public final ImageView mo40330a() {
        return (ImageView) findViewById(R.id.consent_ui_image);
    }

    /* renamed from: b */
    public final void mo40331b(String str) {
        ((TextView) findViewById(R.id.consent_ui_title)).setText(Html.fromHtml(str));
    }
}
