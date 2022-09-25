package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.VoiceSearchUi */
/* compiled from: PG */
public class VoiceSearchUi extends FrameLayout {

    /* renamed from: a */
    public TextView f314936a;

    /* renamed from: b */
    public StreamingTextView f314937b;

    public VoiceSearchUi(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f314936a = (TextView) findViewById(R.id.opa_voice_search_display_text);
        this.f314937b = (StreamingTextView) findViewById(R.id.opa_voice_search_transcription_text);
    }

    public VoiceSearchUi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceSearchUi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
