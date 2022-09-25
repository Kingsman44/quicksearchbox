package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.OneTapVideoPlayerLayout */
/* compiled from: PG */
public class OneTapVideoPlayerLayout extends FrameLayout {

    /* renamed from: a */
    public C117557a f326320a;

    public OneTapVideoPlayerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C117557a aVar = this.f326320a;
        if (aVar != null) {
            aVar.mo103369a(configuration);
        }
    }

    public OneTapVideoPlayerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OneTapVideoPlayerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
