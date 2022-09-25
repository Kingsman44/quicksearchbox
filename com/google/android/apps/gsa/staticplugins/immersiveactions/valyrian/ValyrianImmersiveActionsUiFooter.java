package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93584ch;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55419v;
import com.google.p4152bb.p4153a.C55421x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ValyrianImmersiveActionsUiFooter extends RelativeLayout implements C93584ch {

    /* renamed from: a */
    public ValyrianImmersiveActionsExecuteButtonContainer f285884a;

    /* renamed from: b */
    public C93602cz f285885b;

    /* renamed from: c */
    public boolean f285886c;

    /* renamed from: d */
    public int f285887d;

    /* renamed from: e */
    private TextView f285888e;

    /* renamed from: f */
    private TextView f285889f;

    /* renamed from: g */
    private ImageView f285890g;

    /* renamed from: h */
    private View f285891h;

    /* renamed from: i */
    private WebImageView f285892i;

    /* renamed from: j */
    private TextView f285893j;

    /* renamed from: k */
    private RelativeLayout f285894k;

    public ValyrianImmersiveActionsUiFooter(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    private final void m169869g(boolean z) {
        int i = 0;
        this.f285891h.setVisibility(0);
        this.f285892i.setVisibility(true != z ? 8 : 0);
        TextView textView = this.f285893j;
        if (true == z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: h */
    private final boolean m169870h(int i) {
        return i == 4 && !this.f285885b.mo82036A();
    }

    /* renamed from: i */
    private final boolean m169871i(int i) {
        if (i == 2 || m169870h(i)) {
            return true;
        }
        return i == 7 && !this.f285885b.mo82039ao().mo81425i();
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
        this.f285885b = czVar;
    }

    /* renamed from: e */
    public final void mo87842e(int i, C88511e eVar) {
        C55361pn pnVar;
        int a;
        this.f285887d = i;
        if (i == 1 || i == 9 || m169871i(i)) {
            setVisibility(0);
            if (i == 9) {
                pnVar = null;
            } else {
                pnVar = this.f285885b.mo88014I();
            }
            Drawable G = this.f285885b.mo88012G(getContext(), eVar, pnVar);
            List d = ((ModularAction) this.f285885b.f239226b).f236102h.mo81322d();
            if (pnVar != null && (G != null || !pnVar.f145871d.isEmpty())) {
                if (G != null) {
                    this.f285892i.setImageDrawable(G);
                } else {
                    this.f285892i.mo76738i(pnVar.f145871d, this.f285885b.mo82040ap());
                }
                this.f285892i.setContentDescription(pnVar.f145869b);
                m169869g(true);
            } else if (d != null && d.size() > 1) {
                this.f285892i.setContentDescription(getResources().getString(R.string.immersive_actions_no_selected_provider));
                m169869g(true);
            } else if (i == 9) {
                Drawable drawable = getContext().getResources().getDrawable(R.drawable.quantum_ic_group_white_32);
                if (drawable != null) {
                    drawable.setColorFilter(getResources().getColor(R.color.immersive_actions_relationship_header), PorterDuff.Mode.MULTIPLY);
                    this.f285892i.setImageDrawable(drawable);
                    m169869g(true);
                } else {
                    this.f285891h.setVisibility(4);
                }
            } else {
                this.f285891h.setVisibility(4);
            }
            if (pnVar != null && (a = C55419v.m87685a(pnVar.f145872e)) != 0 && a == 13) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.immersive_actions_sms_icon_horizontal_padding);
                this.f285892i.setPadding(dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.immersive_actions_sms_icon_top_padding), dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.immersive_actions_sms_icon_bottom_padding));
            } else if (((ModularAction) this.f285885b.f239226b).f236107m == C55421x.ADD_REMINDER) {
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.immersive_actions_reminder_icon_padding);
                this.f285892i.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            } else {
                this.f285892i.setPadding(0, 0, 0, 0);
            }
        } else {
            setVisibility(8);
        }
        if (this.f285885b.mo88038ag() && (i == 1 || i == 9)) {
            this.f285891h.setOnClickListener(new C102446n(this));
        }
        if (!m169871i(i) || (i == 2 && ((ModularAction) this.f285885b.f239226b).mo81222ab().size() == 1 && (((ModularAction) this.f285885b.f239226b).mo81222ab().get(0) instanceof EntityArgument))) {
            this.f285890g.setVisibility(8);
            this.f285891h.setVisibility(0);
            this.f285894k.setVisibility(0);
        } else {
            this.f285890g.setVisibility(0);
            this.f285891h.setVisibility(8);
            this.f285894k.setVisibility(8);
            if (i == 2) {
                this.f285890g.setOnClickListener(new C102447o(this));
            } else if (i == 7) {
                this.f285890g.setOnClickListener(new C102448p(this));
            } else if (m169870h(i)) {
                this.f285890g.setOnClickListener(new C102449q(this));
            }
        }
        this.f285884a.mo93232a(i, this.f285885b);
        this.f285888e.setText(this.f285885b.mo88011F(getContext()).getString(R.string.valyrian_immersive_actions_cancel));
        this.f285889f.setText(this.f285885b.mo88011F(getContext()).getString(R.string.valyrian_immersive_actions_confirm));
        this.f285893j.setText(this.f285885b.mo88011F(getContext()).getString(R.string.immersive_actions_unknown_provider_short));
    }

    /* renamed from: f */
    public final boolean mo93238f() {
        return ((ModularAction) this.f285885b.f239226b).f235985a.mo81122j() || ((ModularAction) this.f285885b.f239226b).mo81229ai();
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        return null;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        ValyrianImmersiveActionsExecuteButtonContainer valyrianImmersiveActionsExecuteButtonContainer = (ValyrianImmersiveActionsExecuteButtonContainer) findViewById(R.id.execute_button_container);
        valyrianImmersiveActionsExecuteButtonContainer.getClass();
        this.f285884a = valyrianImmersiveActionsExecuteButtonContainer;
        TextView textView = (TextView) findViewById(R.id.valyrian_immersive_actions_cancel_text_button);
        textView.getClass();
        this.f285888e = textView;
        ImageView imageView = (ImageView) findViewById(R.id.immersive_actions_back_button);
        imageView.getClass();
        this.f285890g = imageView;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.immersive_actions_control_buttons);
        relativeLayout.getClass();
        this.f285894k = relativeLayout;
        TextView textView2 = (TextView) findViewById(R.id.valyrian_immersive_actions_confirm_text_button);
        textView2.getClass();
        this.f285889f = textView2;
        textView2.setOnClickListener(new C102444l(this));
        this.f285888e.setOnClickListener(new C102445m(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.immersive_actions_header_title);
        linearLayout.getClass();
        linearLayout.setVisibility(8);
        View findViewById = findViewById(R.id.immersive_actions_provider_icon_container);
        findViewById.getClass();
        this.f285891h = findViewById;
        WebImageView webImageView = (WebImageView) findViewById(R.id.immersive_actions_provider_icon);
        webImageView.getClass();
        this.f285892i = webImageView;
        TextView textView3 = (TextView) findViewById(R.id.unknown_provider_text);
        textView3.getClass();
        this.f285893j = textView3;
        m169869g(false);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.immersive_actions_header_editor);
        relativeLayout2.getClass();
        relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) getResources().getDimension(R.dimen.valyrian_immersive_actions_footer_height)));
        C89941l.m146512c(this, 21988);
        C89941l.m146512c(this.f285889f, 21991);
        C89941l.m146512c(this.f285888e, 21990);
        C89941l.m146512c(this.f285890g, 21996);
        C89941l.m146512c(this.f285892i, 21995);
    }

    public ValyrianImmersiveActionsUiFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ValyrianImmersiveActionsUiFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f285886c = false;
        this.f285887d = 0;
    }
}
