package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55253ln;
import com.google.p4152bb.p4153a.C55419v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ModularActionCardLabeledFooter extends LinearLayout implements C93584ch {

    /* renamed from: a */
    public TextView f261071a;

    /* renamed from: b */
    protected TextView f261072b;

    /* renamed from: c */
    protected TextView f261073c;

    /* renamed from: d */
    public TextView[] f261074d;

    /* renamed from: e */
    public C93602cz f261075e;

    /* renamed from: f */
    public C93545aw f261076f;

    /* renamed from: g */
    protected int f261077g = R.drawable.ic_openin_action_card_material;

    /* renamed from: h */
    protected int f261078h = R.drawable.ic_openin_action_card_material;

    /* renamed from: i */
    private LayoutInflater f261079i;

    /* renamed from: j */
    private List f261080j;

    public ModularActionCardLabeledFooter(Context context) {
        super(context);
    }

    /* renamed from: j */
    private final C93537ao m154125j() {
        C93594cr crVar;
        C55240la laVar;
        C93602cz czVar = this.f261075e;
        czVar.getClass();
        ModularAction modularAction = (ModularAction) czVar.f239226b;
        if (modularAction.f235985a.mo81117f()) {
            laVar = ((ModularActionMatchingProviderInfo) modularAction.f235986b).f236118d;
            crVar = new C93594cr(this, 102);
        } else if (modularAction.f235985a.mo81123k()) {
            laVar = ((ModularActionMatchingProviderInfo) modularAction.f235986b).f236119e;
            crVar = new C93594cr(this, 103);
        } else if (modularAction.f235985a.mo81119h()) {
            laVar = ((ModularActionMatchingProviderInfo) modularAction.f235986b).f236120f;
            crVar = new C93594cr(this, 105);
        } else if (modularAction.f235985a.mo81115e()) {
            laVar = ((ModularActionMatchingProviderInfo) modularAction.f235986b).f236117c;
            crVar = new C93594cr(this, 104);
        } else {
            laVar = null;
            crVar = null;
        }
        return m154124i(laVar, crVar);
    }

    /* renamed from: k */
    private final C93537ao m154126k(boolean z) {
        return new C93537ao(getContext().getString(true != z ? R.string.contact_select_dialog_find_contact : R.string.contact_select_dialog_find_another_contact), R.drawable.ic_forward_lighthouse_action_card, 6735, new C93593cq(this), true);
    }

    /* renamed from: m */
    private final boolean m154128m(List list) {
        if (list == null && this.f261080j == null) {
            return true;
        }
        if (list == null || this.f261080j == null || list.size() != this.f261080j.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((C55240la) ((C55253ln) this.f261080j.get(i)).f145510b.get(0)).equals((C55240la) ((C55253ln) list.get(i)).f145510b.get(0))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5) {
                    if (m154125j().f261177b && this.f261071a.getVisibility() == 8) {
                        this.f261071a.setVisibility(4);
                    }
                    C93602cz czVar = this.f261075e;
                    czVar.getClass();
                    ModularAction modularAction = (ModularAction) czVar.f239226b;
                    if (modularAction.f235985a.mo81119h() && modularAction.f235985a.f236005b && this.f261072b.getVisibility() == 8) {
                        this.f261072b.setVisibility(4);
                    }
                    if ((modularAction.f235985a.mo81115e() || modularAction.f235985a.mo81119h()) && this.f261073c.getVisibility() == 8) {
                        this.f261073c.setVisibility(4);
                    }
                }
            } else if (mo87894g().f261177b && this.f261071a.getVisibility() == 8) {
                this.f261071a.setVisibility(4);
            }
        } else if (mo87893f().f261177b && this.f261071a.getVisibility() == 8) {
            this.f261071a.setVisibility(4);
        }
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f261075e = czVar;
    }

    /* renamed from: e */
    public void mo87842e(int i, C88511e eVar) {
        TextView[] textViewArr;
        C55136he heVar;
        C93537ao aoVar;
        TextView[] textViewArr2;
        TextView textView = this.f261073c;
        C93602cz czVar = this.f261075e;
        czVar.getClass();
        textView.setText(czVar.mo88011F(getContext()).getString(R.string.feedback));
        TextView textView2 = this.f261072b;
        C93602cz czVar2 = this.f261075e;
        czVar2.getClass();
        textView2.setText(czVar2.mo88011F(getContext()).getString(R.string.try_action_again));
        C93602cz czVar3 = this.f261075e;
        czVar3.getClass();
        if (!czVar3.mo82039ao().mo81425i()) {
            C93602cz czVar4 = this.f261075e;
            czVar4.getClass();
            List R = czVar4.mo88023R();
            C55240la laVar = null;
            if (!m154128m(R) && (textViewArr2 = this.f261074d) != null) {
                for (TextView removeView : textViewArr2) {
                    removeView(removeView);
                }
                this.f261074d = null;
                this.f261080j = null;
            }
            switch (i) {
                case 1:
                case 6:
                case 8:
                case 9:
                    this.f261071a.setVisibility(8);
                    this.f261072b.setVisibility(8);
                    this.f261073c.setVisibility(8);
                    break;
                case 2:
                    m154127l(mo87893f());
                    this.f261072b.setVisibility(8);
                    this.f261073c.setVisibility(8);
                    break;
                case 3:
                    m154127l(mo87894g());
                    this.f261072b.setVisibility(8);
                    this.f261073c.setVisibility(8);
                    break;
                case 4:
                    m154127l(m154125j());
                    C93602cz czVar5 = this.f261075e;
                    czVar5.getClass();
                    ModularAction modularAction = (ModularAction) czVar5.f239226b;
                    this.f261072b.setVisibility(true != modularAction.f235985a.mo81119h() ? 8 : 0);
                    this.f261073c.setVisibility((modularAction.f235985a.mo81115e() || modularAction.f235985a.mo81119h()) ? 0 : 8);
                    break;
                case 5:
                    C93602cz czVar6 = this.f261075e;
                    czVar6.getClass();
                    ModularActionMatchingProviderInfo modularActionMatchingProviderInfo = (ModularActionMatchingProviderInfo) ((ModularAction) czVar6.f239226b).f235986b;
                    if (modularActionMatchingProviderInfo != null) {
                        laVar = modularActionMatchingProviderInfo.f236118d;
                    }
                    m154127l(m154124i(laVar, new C93594cr(this, 102)));
                    this.f261072b.setVisibility(8);
                    this.f261073c.setVisibility(8);
                    break;
                case 7:
                    if (R == null) {
                        C93602cz czVar7 = this.f261075e;
                        czVar7.getClass();
                        if (czVar7.mo88019N() == null) {
                            aoVar = C93537ao.f261176a;
                        } else {
                            C93602cz czVar8 = this.f261075e;
                            czVar8.getClass();
                            ModularAction modularAction2 = (ModularAction) czVar8.f239226b;
                            CardDecision ao = czVar8.mo82039ao();
                            if (!ao.mo81423h()) {
                                aoVar = C93537ao.f261176a;
                            } else {
                                Argument R2 = modularAction2.mo81211R(ao.mo81417a());
                                if (R2 == null) {
                                    aoVar = C93537ao.f261176a;
                                } else {
                                    C93602cz czVar9 = this.f261075e;
                                    czVar9.getClass();
                                    aoVar = (C93537ao) R2.mo81281p(new C93574by(czVar9, this.f261076f));
                                }
                            }
                        }
                        m154127l(aoVar);
                    } else {
                        if (!m154128m(R)) {
                            this.f261080j = R;
                            this.f261074d = new TextView[R.size()];
                            for (int i2 = 0; i2 < R.size(); i2++) {
                                C55253ln lnVar = (C55253ln) R.get(i2);
                                C55240la laVar2 = (C55240la) lnVar.f145510b.get(0);
                                TextView[] textViewArr3 = this.f261074d;
                                if (this.f261079i == null) {
                                    this.f261079i = (LayoutInflater) getContext().getSystemService("layout_inflater");
                                }
                                textViewArr3[i2] = (TextView) this.f261079i.inflate(R.layout.action_editor_labeled_footer_bar, this, false);
                                if (this.f261075e.mo82039ao().mo81425i()) {
                                    this.f261074d[i2].setPadding(0, 0, 0, 0);
                                }
                                addView(this.f261074d[i2]);
                                this.f261074d[i2].setVisibility(0);
                                TextView textView3 = this.f261074d[i2];
                                C93602cz czVar10 = this.f261075e;
                                czVar10.getClass();
                                if ((laVar2.f145451a & 2) != 0) {
                                    heVar = laVar2.f145453c;
                                    if (heVar == null) {
                                        heVar = C55136he.f145130j;
                                    }
                                } else {
                                    heVar = null;
                                }
                                textView3.setText(czVar10.mo88004a(heVar));
                                int a = C55419v.m87685a(R.drawable.ic_forward_lighthouse_action_card);
                                if (a == 0) {
                                    a = 1;
                                }
                                C91115n.m148881m(this.f261074d[i2], a - 1);
                                String str = laVar2.f145455e;
                                if (!TextUtils.isEmpty(str)) {
                                    C93602cz czVar11 = this.f261075e;
                                    czVar11.getClass();
                                    C91189au ap = czVar11.mo82040ap();
                                    ap.mo85428r(ap.mo85417d(Uri.parse(str)), "MACLFooter.ImageCallback", new C93589cm(this, i2));
                                } else {
                                    int a2 = C55419v.m87685a(laVar2.f145454d);
                                    if (a2 == 0) {
                                        a2 = 1;
                                    }
                                    if (a2 != 1) {
                                        C91115n.m148882n(this.f261074d[i2], eVar.mo82073c(a2, getContext()));
                                    }
                                }
                                this.f261074d[i2].setClickable(true);
                                this.f261074d[i2].setOnClickListener(new C93590cn(this, lnVar));
                                C89941l.m146512c(this.f261074d[i2], laVar2.f145457g);
                            }
                        }
                        this.f261071a.setVisibility(8);
                    }
                    this.f261072b.setVisibility(8);
                    this.f261073c.setVisibility(8);
                    break;
            }
            if (this.f261071a.getVisibility() == 8 && this.f261072b.getVisibility() == 8 && this.f261073c.getVisibility() == 8 && ((textViewArr = this.f261074d) == null || textViewArr.length == 0)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
        } else {
            setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C93537ao mo87893f() {
        C93602cz czVar = this.f261075e;
        czVar.getClass();
        Argument H = czVar.mo88013H();
        if (H == null) {
            return null;
        }
        if (!(H instanceof PersonArgument)) {
            return C93537ao.f261176a;
        }
        PersonDisambiguation personDisambiguation = (PersonDisambiguation) ((PersonArgument) H).f236203n;
        if (personDisambiguation.mo81541i()) {
            return m154126k(false);
        }
        if (!personDisambiguation.mo81544m()) {
            return m154126k(true);
        }
        if (personDisambiguation.f236395k.mo81601c()) {
            Context context = getContext();
            return new C93537ao(context.getString(R.string.remember), R.drawable.ic_action_check, 7287, new C93591co(this), true);
        } else if (!personDisambiguation.mo81607C()) {
            return m154126k(true);
        } else {
            Context context2 = getContext();
            return new C93537ao(context2.getString(R.string.show_contact_information_edit_contact), R.drawable.ic_action_people_all, 7447, new C93592cp(this), true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C93537ao mo87894g() {
        C93602cz czVar = this.f261075e;
        czVar.getClass();
        C55240la laVar = ((ModularActionMatchingProviderInfo) ((ModularAction) czVar.f239226b).f235986b).f236116b;
        if (laVar == null || czVar.mo88014I() == null) {
            return C93537ao.f261176a;
        }
        C93594cr crVar = new C93594cr(this, 2);
        C93602cz czVar2 = this.f261075e;
        czVar2.getClass();
        return new C93537ao(czVar2.mo88018M(laVar), this.f261078h, laVar.f145457g, crVar, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo87895h(int i, int i2, TransitionSet transitionSet) {
        if (i != 7) {
            if (i2 != 7) {
                transitionSet.addTransition(C93632eb.m154488c(-1, getResources().getDisplayMetrics(), this));
            }
            transitionSet.addTransition(C93632eb.m154488c(1, getResources().getDisplayMetrics(), this));
        }
        if (i2 != 7) {
            return;
        }
        transitionSet.addTransition(C93632eb.m154488c(1, getResources().getDisplayMetrics(), this));
    }

    /* renamed from: iM */
    public Pair mo87843iM(int i, int i2) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.addTarget(this);
        changeBounds.addTarget(this.f261071a);
        changeBounds.addTarget(this.f261073c);
        changeBounds.addTarget(this.f261072b);
        changeBounds.setDuration(500);
        transitionSet.addTransition(changeBounds);
        mo87895h(i2, i, transitionSet);
        transitionSet.addTransition(C93632eb.m154486a(getResources().getColor(R.color.action_card_light_grey), this, this.f261073c, this.f261071a, this.f261072b));
        return new Pair(transitionSet, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.labeled_confirm_bar);
        textView.getClass();
        this.f261071a = textView;
        TextView textView2 = (TextView) findViewById(R.id.retry_bar);
        textView2.getClass();
        this.f261072b = textView2;
        TextView textView3 = (TextView) findViewById(R.id.action_send_feedback_bar);
        textView3.getClass();
        this.f261073c = textView3;
        C93585ci ciVar = new C93585ci();
        this.f261071a.setAccessibilityDelegate(ciVar);
        this.f261072b.setAccessibilityDelegate(ciVar);
        this.f261073c.setAccessibilityDelegate(ciVar);
        C89941l.m146512c(this.f261072b, 8348);
        C89941l.m146512c(this.f261073c, 9949);
        this.f261071a.setOnClickListener(new C93586cj(this));
        this.f261072b.setOnClickListener(new C93587ck(this));
        this.f261073c.setOnClickListener(new C93588cl(this));
    }

    public final void setBackgroundColor(int i) {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public ModularActionCardLabeledFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: i */
    private final C93537ao m154124i(C55240la laVar, C93536an anVar) {
        if (laVar == null) {
            return C93537ao.f261176a;
        }
        C93602cz czVar = this.f261075e;
        czVar.getClass();
        return new C93537ao(czVar.mo88018M(laVar), this.f261077g, laVar.f145457g, anVar, true);
    }

    public ModularActionCardLabeledFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: l */
    private final void m154127l(C93537ao aoVar) {
        Drawable drawable = null;
        if (aoVar.f261177b) {
            this.f261071a.setText(aoVar.f261178c);
            int i = aoVar.f261181f;
            if (i != 0) {
                drawable = getResources().getDrawable(i);
            }
            if (drawable != null) {
                drawable.setTint(getResources().getColor(R.color.agsa_color_on_surface));
            }
            C91115n.m148882n(this.f261071a, drawable);
            C89941l.m146512c(this.f261071a, aoVar.f261179d);
            C93602cz czVar = this.f261075e;
            czVar.getClass();
            czVar.f261321h = aoVar.f261180e;
            this.f261071a.setVisibility(0);
            return;
        }
        C93602cz czVar2 = this.f261075e;
        czVar2.getClass();
        czVar2.f261321h = null;
        this.f261071a.setVisibility(8);
    }
}
