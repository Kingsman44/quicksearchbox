package com.google.android.apps.gsa.search.shared.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.search.shared.p6930h.C87560c;
import com.google.android.apps.gsa.searchplate.ClearOrVoiceButton;
import com.google.android.apps.gsa.searchplate.p6965c.C88927a;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class OverlaySearchPlateContainer extends FrameLayout {

    /* renamed from: a */
    public final String f236697a;

    /* renamed from: b */
    public int f236698b = -1;

    /* renamed from: c */
    public ClearOrVoiceButton f236699c;

    /* renamed from: d */
    private TouchDelegate f236700d;

    public OverlaySearchPlateContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f236697a = getResources().getString(R.string.accessibility_voice_search_button);
    }

    /* renamed from: a */
    public final void mo81757a(int i) {
        setTouchDelegate(i == 0 ? this.f236700d : null);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C88927a.m144530e(this.f236698b);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        View findViewById = findViewById(R.id.launcher_search_button);
        ClearOrVoiceButton clearOrVoiceButton = (ClearOrVoiceButton) findViewById(R.id.clear_or_voice_button);
        this.f236699c = clearOrVoiceButton;
        if (clearOrVoiceButton != null) {
            clearOrVoiceButton.setContentDescription(this.f236697a);
        }
        C87655d dVar = new C87655d(this);
        findViewById.setOnTouchListener(new C87560c(dVar, new C87654c(findViewById(R.id.search_box))));
        ClearOrVoiceButton clearOrVoiceButton2 = this.f236699c;
        if (clearOrVoiceButton2 != null) {
            clearOrVoiceButton2.setOnTouchListener(dVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ClearOrVoiceButton clearOrVoiceButton;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f236698b == 0 && this.f236700d == null && (clearOrVoiceButton = this.f236699c) != null) {
            Rect rect = new Rect(0, 0, clearOrVoiceButton.getWidth(), this.f236699c.getHeight());
            offsetDescendantRectToMyCoords(this.f236699c, rect);
            rect.top = i2;
            rect.bottom = i4;
            if (C91115n.m148876h(this)) {
                rect.left = i;
            } else {
                rect.right = i3;
            }
            this.f236700d = new TouchDelegate(rect, this.f236699c);
            mo81757a(this.f236698b);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
