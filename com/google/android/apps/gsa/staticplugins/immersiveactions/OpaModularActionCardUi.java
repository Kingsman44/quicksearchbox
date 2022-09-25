package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93545aw;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class OpaModularActionCardUi extends LinearLayout implements C93545aw, C73867g {

    /* renamed from: a */
    public OpaActionConfirmationCard f285764a;

    /* renamed from: b */
    public List f285765b;

    /* renamed from: c */
    public C93602cz f285766c;

    /* renamed from: d */
    public C88511e f285767d;

    /* renamed from: e */
    public boolean f285768e;

    /* renamed from: f */
    private InteractiveArgumentContainerView f285769f;

    /* renamed from: g */
    private ImmersiveActionsLabeledFooter f285770g;

    public OpaModularActionCardUi(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        C73867g gVar;
        if (this.f285764a.getVisibility() == 0) {
            gVar = this.f285764a;
        } else {
            gVar = this.f285769f;
        }
        return gVar.mo65343a(caVar);
    }

    /* renamed from: c */
    public final FragmentManager mo87959c() {
        return null;
    }

    /* renamed from: d */
    public final void mo87960d(DialogFragment dialogFragment, String str) {
    }

    /* renamed from: i */
    public final void mo87961i(Argument argument, String str) {
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.opa_actions_arguments_ui);
        findViewById.getClass();
        this.f285769f = (InteractiveArgumentContainerView) findViewById;
        View findViewById2 = findViewById(R.id.opa_action_confirmation);
        findViewById2.getClass();
        this.f285764a = (OpaActionConfirmationCard) findViewById2;
        View findViewById3 = findViewById(R.id.immersive_actions_small_labeled_footer);
        findViewById3.getClass();
        this.f285770g = (ImmersiveActionsLabeledFooter) findViewById3;
        this.f285769f.f260987e = this;
        ArrayList arrayList = new ArrayList();
        this.f285765b = arrayList;
        arrayList.addAll(Arrays.asList(new LinearLayout[]{this.f285769f, this.f285764a, this.f285770g}));
    }

    public OpaModularActionCardUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OpaModularActionCardUi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
