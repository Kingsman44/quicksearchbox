package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55305nl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ModularActionCardHeader extends LinearLayout implements C93584ch {

    /* renamed from: b */
    private static final int[] f261064b = {R.attr.state_showingVoiceOfGoogle};

    /* renamed from: a */
    public boolean f261065a;

    /* renamed from: c */
    private TextView f261066c;

    /* renamed from: d */
    private ImageView f261067d;

    /* renamed from: e */
    private View f261068e;

    /* renamed from: f */
    private C93602cz f261069f;

    /* renamed from: g */
    private boolean f261070g;

    public ModularActionCardHeader(Context context) {
        super(context);
    }

    /* renamed from: f */
    private final void m154117f(TransitionSet transitionSet, int i) {
        Interpolator interpolator;
        int i2;
        int applyDimension = (int) TypedValue.applyDimension(1, 45.0f, getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 13.0f, getResources().getDisplayMetrics());
        C93625dv dvVar = new C93625dv(i, i == -1 ? 1 : -1, applyDimension, applyDimension2, getResources().getColor(R.color.action_card_medium_grey));
        dvVar.addTarget(this.f261066c);
        dvVar.f261367b = 500;
        dvVar.f261369d = C91107f.f254405a;
        dvVar.f261368c = C91107f.f254405a;
        Interpolator interpolator2 = C91107f.f254406b;
        dvVar.f261371f = interpolator2;
        dvVar.f261370e = interpolator2;
        transitionSet.addTransition(dvVar);
        if (i != 1) {
            applyDimension = applyDimension2;
        }
        C93617dn a = C93617dn.m154465a(1, applyDimension);
        a.addTarget(this.f261067d);
        long j = 250;
        a.setDuration(250);
        if (i == 1) {
            interpolator = C91107f.f254405a;
            i2 = 1;
        } else {
            i2 = i;
            interpolator = C91107f.f254406b;
        }
        a.setInterpolator(interpolator);
        if (i2 == 1) {
            j = 0;
        }
        a.setStartDelay(j);
        transitionSet.addTransition(a);
        transitionSet.addTransition(C93632eb.m154486a(getResources().getColor(R.color.action_card_medium_grey), this.f261067d));
    }

    /* renamed from: g */
    private final void m154118g(int i, C93602cz czVar) {
        String str;
        C55305nl nlVar;
        C55136he heVar;
        boolean z = this.f261065a;
        String str2 = BuildConfig.FLAVOR;
        if (z) {
            this.f261066c.setText(str2);
            return;
        }
        int E = czVar.mo88010E();
        boolean z2 = false;
        this.f261070g = false;
        int i2 = 3;
        int i3 = 2;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ModularAction modularAction = (ModularAction) czVar.f239226b;
                    if (modularAction.f236103i.f236312a.size() > 1) {
                        nlVar = modularAction.f236104j;
                    } else {
                        nlVar = modularAction.mo81219Z();
                    }
                    if ((nlVar.f145691a & 2048) != 0) {
                        heVar = nlVar.f145702l;
                        if (heVar == null) {
                            heVar = C55136he.f145130j;
                        }
                    } else {
                        heVar = null;
                    }
                    String a = czVar.mo88004a(heVar);
                    if (!(a == null && (a = ((ModularAction) czVar.f239226b).mo81219Z().f145701k) == null)) {
                        str2 = a;
                    }
                    str = str2;
                } else if (i != 8) {
                    str = czVar.mo88021P();
                }
            }
            if (!TextUtils.isEmpty(czVar.mo82039ao().f236249c)) {
                this.f261070g = true;
                str = czVar.mo82039ao().f236249c;
                z2 = true;
            } else {
                str = czVar.mo88021P();
            }
        } else if (E == 1) {
            this.f261070g = true;
            str = czVar.mo88022Q();
        } else {
            str = czVar.mo88021P();
        }
        drawableStateChanged();
        if (!TextUtils.equals(str, this.f261066c.getText())) {
            this.f261066c.setText(str);
        }
        if (!TextUtils.equals(str, this.f261066c.getContentDescription())) {
            setContentDescription(str);
        }
        TextView textView = this.f261066c;
        if (true == z2) {
            i2 = 17;
        }
        textView.setGravity(i2);
        TextView textView2 = this.f261066c;
        if (true == z2) {
            i3 = 4;
        }
        textView2.setTextAlignment(i3);
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
        this.f261069f = czVar;
    }

    /* renamed from: e */
    public final void mo87842e(int i, C88511e eVar) {
        int i2 = 0;
        switch (i) {
            case 1:
                setVisibility(0);
                C93602cz czVar = this.f261069f;
                czVar.getClass();
                m154118g(i, czVar);
                C93602cz czVar2 = this.f261069f;
                czVar2.getClass();
                boolean ag = czVar2.mo88038ag();
                if (ag) {
                    C93602cz czVar3 = this.f261069f;
                    czVar3.getClass();
                    if (czVar3.mo88014I() != null) {
                        Drawable c = eVar.mo82073c(5, getContext());
                        if (c != null && !c.equals(this.f261067d.getDrawable())) {
                            this.f261067d.setImageDrawable(c);
                        }
                    } else {
                        this.f261067d.setImageResource(R.drawable.ic_default_app_icon);
                    }
                }
                this.f261067d.setVisibility(true != ag ? 8 : 0);
                this.f261068e.setVisibility(8);
                setClickable(ag);
                break;
            case 2:
                setVisibility(0);
                C93602cz czVar4 = this.f261069f;
                czVar4.getClass();
                m154118g(i, czVar4);
                this.f261067d.setVisibility(8);
                this.f261068e.setVisibility(0);
                setClickable(false);
                break;
            case 3:
                setVisibility(0);
                C93602cz czVar5 = this.f261069f;
                czVar5.getClass();
                m154118g(i, czVar5);
                this.f261067d.setVisibility(8);
                this.f261068e.setVisibility(8);
                setClickable(true);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                setVisibility(8);
                this.f261068e.setVisibility(8);
                break;
            case 8:
                setVisibility(0);
                C93602cz czVar6 = this.f261069f;
                czVar6.getClass();
                m154118g(i, czVar6);
                this.f261067d.setVisibility(8);
                this.f261068e.setVisibility(8);
                setClickable(false);
                break;
        }
        if (i == 3) {
            C89941l.m146512c(this.f261066c, 8346);
            C89941l.m146512c(this, 8341);
        } else if (i == 8) {
            TextView textView = this.f261066c;
            List ac = ((ModularAction) this.f261069f.f239226b).mo81223ac();
            if (!ac.isEmpty()) {
                i2 = ((Argument) ac.get(0)).mo81276k();
            }
            C89941l.m146512c(textView, i2);
            C89941l.m146512c(this, 16441);
        } else {
            C89941l.m146512c(this.f261066c, 8342);
            C89941l.m146512c(this, 8340);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0070, code lost:
        if (r2 == 1) goto L_0x0079;
     */
    /* renamed from: iM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair mo87843iM(int r10, int r11) {
        /*
            r9 = this;
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            android.transition.ChangeBounds r2 = new android.transition.ChangeBounds
            r2.<init>()
            com.google.android.apps.gsa.shared.ui.al r3 = new com.google.android.apps.gsa.shared.ui.al
            r3.<init>()
            r2.setInterpolator(r3)
            r3 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r3)
            android.widget.TextView r3 = r9.f261066c
            r2.addTarget(r3)
            r2.addTarget(r9)
            r0.addTransition(r2)
            android.content.res.Resources r2 = r9.getResources()
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            android.view.View r5 = r9.f261068e
            r6 = 0
            r4[r6] = r5
            r5 = 1
            r4[r5] = r9
            r7 = 2131099725(0x7f06004d, float:1.7811811E38)
            int r2 = r2.getColor(r7)
            android.transition.TransitionSet r2 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154486a(r2, r4)
            r0.addTransition(r2)
            android.content.res.Resources r2 = r9.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r6] = r9
            r8 = -1
            com.google.android.apps.gsa.staticplugins.actionsui.modular.dn r2 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154488c(r8, r2, r4)
            r0.addTransition(r2)
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r2 = r9.f261069f
            r2.getClass()
            int r2 = r2.mo88010E()
            com.google.android.apps.gsa.staticplugins.actionsui.modular.cz r4 = r9.f261069f
            r4.getClass()
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = r4.mo82039ao()
            boolean r4 = r4.f236252f
            if (r4 == 0) goto L_0x00a0
            if (r11 != r5) goto L_0x0073
            if (r2 != r5) goto L_0x00a0
            goto L_0x0079
        L_0x0073:
            if (r11 != r3) goto L_0x00a0
            if (r2 == r3) goto L_0x0079
            r11 = 2
            goto L_0x00a0
        L_0x0079:
            com.google.android.apps.gsa.staticplugins.actionsui.modular.bk r10 = new com.google.android.apps.gsa.staticplugins.actionsui.modular.bk
            android.content.res.Resources r11 = r9.getResources()
            r10.<init>(r11, r6)
            android.widget.TextView r11 = r9.f261066c
            r10.addTarget(r11)
            r1.addTransition(r10)
            android.content.res.Resources r10 = r9.getResources()
            java.lang.Object[] r11 = new java.lang.Object[r5]
            android.widget.ImageView r2 = r9.f261067d
            r11[r6] = r2
            int r10 = r10.getColor(r7)
            android.transition.TransitionSet r10 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154486a(r10, r11)
            r0.addTransition(r10)
            goto L_0x00d2
        L_0x00a0:
            r2 = 3
            if (r11 != r2) goto L_0x00a7
            r9.m154117f(r0, r5)
            goto L_0x00d2
        L_0x00a7:
            if (r10 != r2) goto L_0x00ad
            r9.m154117f(r0, r8)
            goto L_0x00d2
        L_0x00ad:
            if (r10 != r3) goto L_0x00b3
            r9.m154117f(r0, r5)
            goto L_0x00d2
        L_0x00b3:
            if (r11 != r3) goto L_0x00b9
            r9.m154117f(r0, r5)
            goto L_0x00d2
        L_0x00b9:
            android.content.res.Resources r10 = r9.getResources()
            java.lang.Object[] r11 = new java.lang.Object[r3]
            android.widget.TextView r2 = r9.f261066c
            r11[r6] = r2
            android.widget.ImageView r2 = r9.f261067d
            r11[r5] = r2
            int r10 = r10.getColor(r7)
            android.transition.TransitionSet r10 = com.google.android.apps.gsa.staticplugins.actionsui.modular.C93632eb.m154486a(r10, r11)
            r0.addTransition(r10)
        L_0x00d2:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.ModularActionCardHeader.mo87843iM(int, int):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        if (this.f261070g) {
            i++;
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i);
        if (this.f261070g) {
            mergeDrawableStates(onCreateDrawableState, f261064b);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.header_text);
        textView.getClass();
        this.f261066c = textView;
        ImageView imageView = (ImageView) findViewById(R.id.header_icon);
        imageView.getClass();
        this.f261067d = imageView;
        View findViewById = findViewById(R.id.header_bottom_line);
        findViewById.getClass();
        this.f261068e = findViewById;
        C89941l.m146512c(this.f261067d, 8343);
    }

    public ModularActionCardHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModularActionCardHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
