package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.C87463b;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class GroupArgumentView extends C93666w {

    /* renamed from: b */
    private static final int[] f261045b = {R.attr.state_showingVoiceOfGoogle};

    /* renamed from: a */
    public C87463b f261046a;

    /* renamed from: c */
    private C93564bo f261047c;

    /* renamed from: d */
    private ViewGroup f261048d;

    /* renamed from: e */
    private int f261049e;

    public GroupArgumentView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    public final void mo87731e(boolean z) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87732f() {
        /*
            r9 = this;
            android.content.Context r0 = r9.getContext()
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r1 = r9.f261447m
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument r1 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument) r1
            java.util.List r2 = r1.f236183i
            int r3 = r2.size()
            android.view.ViewGroup r4 = r9.f261048d
            int r4 = r4.getChildCount()
            r5 = 0
            if (r3 == r4) goto L_0x003d
            android.view.ViewGroup r3 = r9.f261048d
            r3.removeAllViews()
            r3 = 0
        L_0x0025:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x003d
            int r4 = r9.f261049e
            android.view.ViewGroup r6 = r9.f261048d
            android.view.View r4 = r0.inflate(r4, r6, r5)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.GroupArgumentRadioButton r4 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.GroupArgumentRadioButton) r4
            android.view.ViewGroup r6 = r9.f261048d
            r6.addView(r4)
            int r3 = r3 + 1
            goto L_0x0025
        L_0x003d:
            r0 = 0
        L_0x003e:
            int r3 = r2.size()
            if (r0 >= r3) goto L_0x00c8
            java.lang.Object r3 = r2.get(r0)
            com.google.bb.a.lk r3 = (com.google.p4152bb.p4153a.C55250lk) r3
            android.view.ViewGroup r4 = r9.f261048d
            android.view.View r4 = r4.getChildAt(r0)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.GroupArgumentRadioButton r4 = (com.google.android.apps.gsa.staticplugins.actionsui.modular.GroupArgumentRadioButton) r4
            int r6 = r3.f145491a
            r6 = r6 & 64
            if (r6 == 0) goto L_0x0065
            com.google.bb.a.ja r6 = r3.f145497g
            if (r6 != 0) goto L_0x005e
            com.google.bb.a.ja r6 = com.google.p4152bb.p4153a.C55186ja.f145265b
        L_0x005e:
            boolean r6 = r6.f145267a
            if (r6 != 0) goto L_0x0065
            r6 = 8
            goto L_0x0066
        L_0x0065:
            r6 = 0
        L_0x0066:
            r4.setVisibility(r6)
            boolean r6 = r1.mo81263C()
            if (r6 == 0) goto L_0x007b
            java.lang.Object r6 = r1.f236203n
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != r0) goto L_0x007b
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            r4.setSelected(r6)
            r4.setId(r0)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.bo r6 = r9.f261047c
            r4.setOnClickListener(r6)
            java.lang.String r6 = r3.f145492b
            android.widget.TextView r7 = r4.f261043a
            r7.setText(r6)
            boolean r6 = r9.mo88130s()
            r4.f261044b = r6
            r4.drawableStateChanged()
            int r6 = r3.f145491a
            r6 = r6 & 16
            if (r6 == 0) goto L_0x00a3
            int r3 = r3.f145496f
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146512c(r4, r3)
            goto L_0x00c4
        L_0x00a3:
            com.google.android.apps.gsa.search.shared.actions.modular.b r3 = r9.f261046a
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r6 = r9.f261447m
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument r6 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument) r6
            int r6 = r6.f236140a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "No ve_ui_type for argument id="
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = "."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r3.mo81398b(r6)
            com.google.android.apps.gsa.shared.logger.p7065j.C89941l.m146511b(r4)
        L_0x00c4:
            int r0 = r0 + 1
            goto L_0x003e
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.GroupArgumentView.mo87732f():void");
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        boolean s = mo88130s();
        if (s) {
            i++;
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i);
        if (s) {
            mergeDrawableStates(onCreateDrawableState, f261045b);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f261047c = new C93564bo(this);
    }

    /* renamed from: q */
    public final void mo87882q(boolean z) {
        this.f261449o = true;
        this.f261048d = (ViewGroup) findViewById(R.id.immersive_actions_group_argument_radio_button_editor);
        this.f261049e = R.layout.immersive_actions_group_argument_radio_button;
        TextView textView = (TextView) findViewById(R.id.argument_label);
        textView.setVisibility(0);
        textView.setText(getResources().getString(R.string.immersive_actions_group_argument_label));
    }

    public GroupArgumentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupArgumentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f261048d = this;
        this.f261049e = R.layout.group_argument_radio_button;
    }
}
