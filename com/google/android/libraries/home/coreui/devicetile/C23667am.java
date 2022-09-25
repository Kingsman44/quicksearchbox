package com.google.android.libraries.home.coreui.devicetile;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23653o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.am */
/* compiled from: PG */
public final class C23667am extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C23674at f64730a;

    public C23667am(C23674at atVar) {
        this.f64730a = atVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C69664n.m101061g(view, "host");
        C69664n.m101061g(accessibilityNodeInfo, "info");
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        C23642d dVar = this.f64730a.mo29001a().f64889g;
        String string = this.f64730a.f64764o.getString(R.string.open_additional_controls_accessibility_description);
        C69664n.m101060f(string, "context.getString(R.stri…ccessibility_description)");
        if (!(dVar instanceof C23653o) || dVar.mo28976b()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string));
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK);
            return;
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ((C23653o) dVar).f64701c));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, string));
    }
}
