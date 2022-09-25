package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class StringArgumentView extends C93566bq {

    /* renamed from: e */
    private static final int[] f261101e = {R.attr.state_promptedArgument};

    /* renamed from: f */
    private static final int[] f261102f = {R.attr.state_showingVoiceOfGoogle};

    /* renamed from: a */
    public EditText f261103a;

    /* renamed from: b */
    public C93622ds f261104b;

    /* renamed from: c */
    public boolean f261105c;

    /* renamed from: d */
    View f261106d;

    public StringArgumentView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
        this.f261103a.setEnabled(z);
    }

    /* renamed from: f */
    public final void mo87732f() {
        int i;
        super.mo87732f();
        StringArgument stringArgument = (StringArgument) this.f261447m;
        if (stringArgument.mo81263C()) {
            String str = (String) stringArgument.f236203n;
            if (!TextUtils.equals(this.f261103a.getText(), str)) {
                this.f261103a.setText(str);
            }
        }
        if (stringArgument.f236204i == 3) {
            i = this.f261103a.getInputType() | C89885b.S3REQUEST_VALUE;
        } else {
            i = this.f261103a.getInputType() & -131073;
        }
        if (i != this.f261103a.getInputType()) {
            this.f261103a.setInputType(i);
        }
    }

    /* renamed from: h */
    public final boolean mo87738h() {
        return this.f261253h || mo87983C();
    }

    /* renamed from: j */
    public final View[] mo87741j() {
        return new View[]{this.f261103a};
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        boolean isFocused = this.f261103a.isFocused();
        boolean z = this.f261452r;
        if (isFocused || z) {
            i++;
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i);
        if (isFocused) {
            mergeDrawableStates(onCreateDrawableState, f261102f);
        } else if (z) {
            mergeDrawableStates(onCreateDrawableState, f261101e);
        }
        return onCreateDrawableState;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f261103a = (EditText) findViewById(R.id.string_argument_value);
        View findViewById = findViewById(R.id.dummy_focus_view);
        this.f261106d = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(0);
            this.f261106d.requestFocus();
        }
        this.f261103a.setOnFocusChangeListener(new C93619dp(this));
        this.f261103a.addTextChangedListener(new C93620dq(this));
        this.f261103a.setClickable(false);
        setOnClickListener(new C93621dr(this));
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(EditText.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getName());
    }

    /* renamed from: t */
    public final boolean mo87916t() {
        ModularAction modularAction = ((StringArgument) this.f261447m).f236144e;
        return this.f261105c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo87917y() {
        return this.f261105c;
    }

    public StringArgumentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StringArgumentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
