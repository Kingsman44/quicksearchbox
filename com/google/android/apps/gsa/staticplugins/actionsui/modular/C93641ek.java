package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ek */
/* compiled from: PG */
public abstract class C93641ek extends C93643em {

    /* renamed from: a */
    private static final C59071e f261396a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.modular.ek");

    /* renamed from: b */
    public TextView f261397b;

    /* renamed from: c */
    public TextView f261398c;

    /* renamed from: d */
    public ListPopupWindow f261399d;

    public C93641ek(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.valyrian_display_argument_content, this, true);
        setDuplicateParentStateEnabled(false);
        onFinishInflate();
    }

    /* renamed from: b */
    private final String mo88096b() {
        if (mo88097c()) {
            return Spinner.class.getName();
        }
        return Button.class.getName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo88095a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo88097c();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo88101g() {
        return this.f261447m.mo81263C();
    }

    /* renamed from: h */
    public final boolean mo88102h() {
        ListPopupWindow listPopupWindow = this.f261399d;
        if (listPopupWindow == null || !listPopupWindow.isShowing()) {
            return false;
        }
        try {
            this.f261399d.dismiss();
        } catch (IllegalArgumentException e) {
            C59104x d = f261396a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "vDropDownArgumentView");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(13758)).mo56386p("View not attached to window manager");
        }
        this.f261399d = null;
        return true;
    }

    /* renamed from: i */
    public final View[] mo88103i() {
        if (TextUtils.isEmpty(this.f261398c.getText())) {
            return new View[]{this.f261397b};
        }
        return new View[]{this.f261397b, this.f261398c};
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo88102h();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.argument_value);
        textView.getClass();
        this.f261397b = textView;
        TextView textView2 = (TextView) findViewById(R.id.argument_secondary_value);
        textView2.getClass();
        this.f261398c = textView2;
        setOnClickListener(new C93640ej(this));
        setFocusable(true);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(mo88096b());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(mo88096b());
        accessibilityNodeInfo.setCanOpenPopup(true);
    }
}
