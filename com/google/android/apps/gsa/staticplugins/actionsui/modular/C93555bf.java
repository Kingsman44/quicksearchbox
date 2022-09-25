package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bf */
/* compiled from: PG */
public abstract class C93555bf extends C93566bq {

    /* renamed from: a */
    private static final C59071e f261217a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.modular.bf");

    /* renamed from: b */
    public TextView f261218b;

    /* renamed from: c */
    public TextView f261219c;

    /* renamed from: d */
    public TextView f261220d;

    /* renamed from: e */
    public TextView f261221e;

    /* renamed from: f */
    public ListPopupWindow f261222f;

    public C93555bf(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        setOrientation(1);
        mo87882q(z);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (z) {
            layoutInflater.inflate(R.layout.immersive_actions_spinner_argument_content, this, true);
        } else {
            layoutInflater.inflate(R.layout.spinner_argument_content, this, true);
        }
        setDuplicateParentStateEnabled(false);
        onFinishInflate();
    }

    /* renamed from: b */
    private final String mo87962b() {
        if (mo87952k()) {
            return Spinner.class.getName();
        }
        return Button.class.getName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo87734a();

    /* renamed from: j */
    public final View[] mo87741j() {
        if (this.f261449o && !TextUtils.isEmpty(this.f261220d.getText())) {
            return new View[]{this.f261220d, this.f261221e};
        } else if (TextUtils.isEmpty(this.f261219c.getText())) {
            return new View[]{this.f261218b};
        } else {
            return new View[]{this.f261218b, this.f261219c};
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo87952k();

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo87971z();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.argument_value);
        textView.getClass();
        this.f261218b = textView;
        TextView textView2 = (TextView) findViewById(R.id.argument_secondary_value);
        textView2.getClass();
        this.f261219c = textView2;
        textView2.setVisibility(8);
        if (this.f261449o) {
            View findViewById = findViewById(R.id.large_argument_value);
            findViewById.getClass();
            this.f261220d = (TextView) findViewById;
            View findViewById2 = findViewById(R.id.large_argument_secondary_value);
            findViewById2.getClass();
            this.f261221e = (TextView) findViewById2;
        }
        setOnClickListener(new C93552bc(this));
        setFocusable(true);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(mo87962b());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(mo87962b());
        accessibilityNodeInfo.setCanOpenPopup(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo87968v(C93630e eVar, AdapterView.OnItemClickListener onItemClickListener) {
        this.f261222f = new ListPopupWindow(new ContextThemeWrapper(getContext(), 2132150731));
        eVar.f261382c = new C93553bd(this, onItemClickListener);
        this.f261222f.setAdapter(eVar);
        this.f261222f.setOnItemClickListener(new C93554be(this, onItemClickListener));
        this.f261222f.setAnchorView(this.f261218b.getVisibility() != 8 ? this.f261218b : this);
        this.f261222f.setWidth(-2);
        this.f261222f.setHeight(-2);
        this.f261222f.setModal(true);
        this.f261222f.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo87969w(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f261219c.setVisibility(8);
        } else {
            this.f261219c.setVisibility(0);
        }
        this.f261219c.setText(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo87970x(CharSequence charSequence) {
        this.f261218b.setText(charSequence);
        TextView textView = this.f261220d;
        if (textView != null && this.f261221e != null) {
            textView.setVisibility(8);
            this.f261221e.setVisibility(8);
            this.f261220d.setText((CharSequence) null);
            this.f261221e.setText((CharSequence) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo87917y() {
        return this.f261447m.mo81263C();
    }

    /* renamed from: z */
    public final boolean mo87971z() {
        ListPopupWindow listPopupWindow = this.f261222f;
        if (listPopupWindow == null || !listPopupWindow.isShowing()) {
            return false;
        }
        try {
            this.f261222f.dismiss();
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) f261217a.mo56226d()).mo56382g(e)).mo56372aa(13744)).mo56386p("View not attached to window manager");
        }
        this.f261222f = null;
        return true;
    }
}
