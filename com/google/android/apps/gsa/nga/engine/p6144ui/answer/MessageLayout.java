package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.MessageLayout */
/* compiled from: PG */
public class MessageLayout extends LinearLayout {
    public MessageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final ImageView mo72983a() {
        return (ImageView) findViewById(R.id.messaging_app_icon);
    }

    /* renamed from: b */
    public final TextView mo72984b() {
        return (TextView) findViewById(R.id.text_header);
    }

    /* renamed from: c */
    public final TextView mo72985c() {
        return (TextView) findViewById(R.id.text_message);
    }
}
