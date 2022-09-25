package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.text.TextUtils;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55191jf;
import com.google.p4152bb.p4153a.C55192jg;
import com.google.p4152bb.p4153a.C55263lx;
import com.google.p4152bb.p4153a.C55419v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ModalStateView extends LinearLayout implements C93584ch {

    /* renamed from: a */
    private WebImageView f261057a;

    /* renamed from: b */
    private TextView f261058b;

    /* renamed from: c */
    private TextView f261059c;

    /* renamed from: d */
    private String f261060d;

    /* renamed from: e */
    private C93602cz f261061e;

    /* renamed from: f */
    private LayoutInflater f261062f;

    /* renamed from: g */
    private int f261063g = 1;

    public ModalStateView(Context context) {
        super(context);
    }

    /* renamed from: f */
    private final LayoutInflater m154111f() {
        if (this.f261062f == null) {
            this.f261062f = (LayoutInflater) getContext().getSystemService("layout_inflater");
        }
        return this.f261062f;
    }

    /* renamed from: b */
    public final List mo87839b() {
        return new ArrayList();
    }

    /* renamed from: c */
    public final void mo87840c(int i, int i2, C88511e eVar) {
        int i3;
        if (i2 == 7) {
            C93602cz czVar = this.f261061e;
            czVar.getClass();
            C55263lx lxVar = czVar.mo82039ao().f236263q;
            if (lxVar == null || (lxVar.f145546a & 16) == 0) {
                i3 = 2;
            } else {
                C55192jg jgVar = lxVar.f145553h;
                if (jgVar == null) {
                    jgVar = C55192jg.f145274b;
                }
                i3 = C55191jf.m87619a(jgVar.f145276a);
                if (i3 == 0) {
                    i3 = 1;
                }
            }
            if (this.f261063g != i3) {
                while (getChildCount() > 0) {
                    removeViewAt(0);
                }
                int i4 = i3 - 1;
                if (i4 == 2) {
                    m154111f().inflate(R.layout.modal_state_large_summary, this, true);
                } else if (i4 != 3) {
                    m154111f().inflate(R.layout.modal_state_dialog, this, true);
                } else {
                    m154111f().inflate(R.layout.modal_state_small_summary, this, true);
                }
                this.f261063g = i3;
                WebImageView webImageView = (WebImageView) findViewById(R.id.modal_image_view);
                webImageView.getClass();
                this.f261057a = webImageView;
                TextView textView = (TextView) findViewById(R.id.display_prompt);
                textView.getClass();
                this.f261058b = textView;
                this.f261059c = (TextView) findViewById(R.id.secondary_text);
            }
        }
    }

    /* renamed from: d */
    public final void mo87841d(C93602cz czVar) {
        this.f261061e = czVar;
    }

    /* renamed from: e */
    public final void mo87842e(int i, C88511e eVar) {
        String str;
        int i2;
        if (i == 7) {
            C93602cz czVar = this.f261061e;
            czVar.getClass();
            C55263lx lxVar = czVar.mo82039ao().f236263q;
            CharSequence charSequence = null;
            if (lxVar == null) {
                str = null;
            } else {
                str = lxVar.f145549d;
            }
            C93602cz czVar2 = this.f261061e;
            czVar2.getClass();
            C55263lx lxVar2 = czVar2.mo82039ao().f236263q;
            int i3 = 2;
            if (lxVar2 == null || (lxVar2.f145546a & 2) == 0) {
                i2 = 7;
            } else {
                i2 = C55419v.m87685a(lxVar2.f145548c);
                if (i2 == 0) {
                    i2 = 1;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.equals(this.f261060d, str)) {
                    this.f261060d = str;
                    this.f261057a.mo76738i(str, this.f261061e.mo82040ap());
                }
                this.f261057a.setVisibility(0);
            } else if (i2 != 7) {
                this.f261057a.setImageDrawable(eVar.mo82073c(i2, getContext()));
                this.f261057a.setVisibility(0);
            } else {
                this.f261057a.setVisibility(8);
            }
            TextView textView = this.f261058b;
            C93602cz czVar3 = this.f261061e;
            czVar3.getClass();
            textView.setText(czVar3.mo82039ao().f236249c);
            C93602cz czVar4 = this.f261061e;
            czVar4.getClass();
            if (true != czVar4.mo82039ao().f236254h) {
                i3 = 0;
            }
            TextView textView2 = this.f261058b;
            textView2.setTypeface(textView2.getTypeface(), i3);
            if (this.f261059c != null) {
                C93602cz czVar5 = this.f261061e;
                czVar5.getClass();
                C55263lx lxVar3 = czVar5.mo82039ao().f236263q;
                if (lxVar3 != null) {
                    C93602cz czVar6 = this.f261061e;
                    czVar6.getClass();
                    charSequence = czVar6.mo88016K(lxVar3.f145552g);
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    this.f261059c.setText(charSequence);
                    this.f261059c.setVisibility(0);
                } else {
                    this.f261059c.setText(BuildConfig.FLAVOR);
                    this.f261059c.setVisibility(8);
                }
            }
            setVisibility(0);
            C93602cz czVar7 = this.f261061e;
            czVar7.getClass();
            C89941l.m146512c(this, czVar7.mo82039ao().f236263q.f145550e);
            return;
        }
        setVisibility(8);
    }

    /* renamed from: iM */
    public final Pair mo87843iM(int i, int i2) {
        C93602cz czVar = this.f261061e;
        czVar.getClass();
        if (!czVar.mo82039ao().f236254h) {
            return null;
        }
        Object[] objArr = {this};
        TransitionSet a = C93632eb.m154486a(getResources().getColor(R.color.action_card_medium_grey), objArr);
        C93560bk bkVar = new C93560bk(getResources(), true);
        bkVar.addTarget(this.f261058b);
        return new Pair(a, bkVar);
    }

    public ModalStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModalStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
