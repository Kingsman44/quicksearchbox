package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.p033v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Property;
import android.view.accessibility.AccessibilityNodeInfo;
import com.evernote.android.state.BuildConfig;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.widgets.StreamingTextView */
/* compiled from: PG */
public final class StreamingTextView extends AppCompatTextView {

    /* renamed from: a */
    public final C16832d f49280a;

    /* renamed from: b */
    public final ObjectAnimator f49281b;

    /* renamed from: c */
    public long f49282c;

    /* renamed from: d */
    public boolean f49283d = true;

    /* renamed from: e */
    public String f49284e = BuildConfig.FLAVOR;

    /* renamed from: f */
    private final Property f49285f;

    public StreamingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C16831c cVar = new C16831c(this, Integer.class);
        this.f49285f = cVar;
        C16832d dVar = new C16832d();
        this.f49280a = dVar;
        this.f49281b = ObjectAnimator.ofInt(dVar, cVar, new int[]{0, PrivateKeyType.INVALID}).setDuration(150);
    }

    /* renamed from: a */
    public final void mo23052a(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(StreamingTextView.class.getCanonicalName());
    }
}
