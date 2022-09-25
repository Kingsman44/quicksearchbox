package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.w */
/* compiled from: PG */
public class C115647w extends LinearLayout {

    /* renamed from: a */
    final C115645u f320821a;

    /* renamed from: b */
    public final TextView f320822b;

    /* renamed from: c */
    public final int f320823c;

    /* renamed from: d */
    public final C58485gu f320824d;

    /* renamed from: e */
    public C115642r f320825e = null;

    /* renamed from: f */
    public C115646v f320826f;

    public C115647w(Context context, AttributeSet attributeSet, C58485gu guVar) {
        super(context, attributeSet);
        super.setOrientation(1);
        this.f320823c = 5;
        LayoutInflater.from(context).inflate(R.layout.omp_playback_speed_value_selector, this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.horizontal_value_selector_scroll_view_frame);
        this.f320822b = (TextView) findViewById(R.id.value_text);
        C58838bb.m90869d(!guVar.isEmpty(), "We should have one available value at least for selector.");
        C58838bb.m90869d(guVar.size() == new HashSet(guVar).size(), "All available values should be different.");
        this.f320824d = guVar;
        C115645u uVar = new C115645u(this, context);
        this.f320821a = uVar;
        uVar.setImportantForAccessibility(2);
        frameLayout.addView(uVar);
        setImportantForAccessibility(1);
    }

    /* renamed from: b */
    public final void mo102175b(C115642r rVar) {
        this.f320825e = rVar;
        C115646v vVar = this.f320826f;
        if (vVar != null) {
            rVar.mo102099c(vVar);
        }
    }

    /* renamed from: c */
    public final void mo102176c(C115646v vVar) {
        C58838bb.m90869d(this.f320824d.contains(vVar), "The value must be one of available values.");
        this.f320826f = vVar;
        this.f320822b.setText(vVar.mo102172b());
        C115645u uVar = this.f320821a;
        int i = C115645u.f320810e;
        uVar.mo102166a(uVar.f320814d.f320824d.indexOf(vVar));
    }

    public final CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        C115646v vVar;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isEnabled() && (vVar = this.f320826f) != null) {
            int indexOf = this.f320824d.indexOf(vVar);
            if (indexOf > 0) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
            if (indexOf < this.f320824d.size() - 1) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            }
        }
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!isEnabled()) {
            return false;
        }
        if (i != 4096 && i != 8192) {
            return super.performAccessibilityAction(i, bundle);
        }
        int indexOf = this.f320824d.indexOf(this.f320826f) + (i == 4096 ? 1 : -1);
        if (indexOf < 0 || indexOf >= this.f320824d.size()) {
            return false;
        }
        mo102176c((C115646v) this.f320824d.get(indexOf));
        return true;
    }

    public final void setOrientation(int i) {
        throw new UnsupportedOperationException("Setting orientation is not allowed.");
    }
}
