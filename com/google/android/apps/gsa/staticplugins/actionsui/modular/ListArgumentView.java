package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ListArgument;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ListArgumentView extends C93666w {

    /* renamed from: b */
    private static final int[] f261051b = {R.attr.state_promptedArgument};

    /* renamed from: a */
    public C93602cz f261052a;

    /* renamed from: c */
    private Button f261053c;

    public ListArgumentView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
        this.f261053c.setEnabled(z);
    }

    /* renamed from: f */
    public final void mo87732f() {
        this.f261053c.setText(this.f261052a.mo88004a(((ListArgument) this.f261447m).f236186j));
        int i = ((ListArgument) this.f261447m).f236187k;
        if (i > 0) {
            C89941l.m146512c(this.f261053c, i);
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        boolean z = this.f261452r;
        if (z) {
            i++;
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i);
        if (z) {
            mergeDrawableStates(onCreateDrawableState, f261051b);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Button button = (Button) findViewById(R.id.add_item_button);
        button.getClass();
        this.f261053c = button;
        button.setOnClickListener(new C93567br(this));
    }

    public ListArgumentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListArgumentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
