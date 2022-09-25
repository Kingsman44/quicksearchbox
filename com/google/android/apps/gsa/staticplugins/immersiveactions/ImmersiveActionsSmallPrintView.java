package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93584ch;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ImmersiveActionsSmallPrintView extends RelativeLayout implements C93584ch {

    /* renamed from: a */
    private C93602cz f285752a;

    /* renamed from: b */
    private TextView f285753b;

    public ImmersiveActionsSmallPrintView(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f285752a = czVar;
    }

    /* renamed from: e */
    public final void mo87842e(int i, C88511e eVar) {
        C93602cz czVar;
        int i2 = 8;
        if (i == 1 && (czVar = this.f285752a) != null) {
            String O = czVar.mo88020O();
            if (!TextUtils.isEmpty(O)) {
                this.f285753b.setText(O);
                i2 = 0;
            }
        }
        setVisibility(i2);
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(C102396ac.m169775a(getResources(), this));
        return new Pair(transitionSet, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.small_print_text);
        textView.getClass();
        this.f285753b = textView;
    }

    public ImmersiveActionsSmallPrintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImmersiveActionsSmallPrintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
