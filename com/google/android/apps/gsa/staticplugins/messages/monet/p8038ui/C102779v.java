package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102754f;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102757i;
import com.google.android.apps.gsa.staticplugins.messages.p8033a.C102705b;
import com.google.android.apps.gsa.staticplugins.messages.p8033a.C102706c;
import com.google.android.apps.gsa.staticplugins.messages.p8033a.C102707d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23198ac;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23204ai;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.v */
/* compiled from: PG */
public final class C102779v extends C22939d {

    /* renamed from: a */
    public final C102757i f286890a;

    /* renamed from: b */
    public final C102754f f286891b;

    /* renamed from: c */
    public final Context f286892c;

    /* renamed from: d */
    public final LayoutInflater f286893d;

    /* renamed from: e */
    public TextView f286894e;

    /* renamed from: f */
    public TextView f286895f;

    /* renamed from: g */
    public LinearLayout f286896g;

    /* renamed from: h */
    public TextView f286897h;

    /* renamed from: i */
    private ImageView f286898i;

    /* renamed from: j */
    private LinearLayout f286899j;

    /* renamed from: k */
    private LinearLayout f286900k;

    public C102779v(C22945j jVar, C102757i iVar, C102754f fVar, Context context) {
        super(jVar);
        this.f286890a = iVar;
        this.f286891b = fVar;
        this.f286892c = context;
        this.f286893d = LayoutInflater.from(context);
    }

    /* renamed from: g */
    private final ImageView m170391g(boolean z) {
        int i;
        LinearLayout linearLayout = this.f286899j;
        boolean h = m170392h();
        int i2 = R.id.message_card_icon_tinted;
        ImageView imageView = (ImageView) linearLayout.findViewById(true != h ? R.id.message_card_icon_tinted : R.id.message_card_icon);
        if (imageView != null) {
            this.f286899j.removeView(imageView);
        }
        if (true != m170392h()) {
            i2 = R.id.message_card_icon;
        }
        int a = C102707d.m170306a(this.f286892c);
        ImageView imageView2 = (ImageView) this.f286899j.findViewById(true != z ? i2 : a);
        if (imageView2 != null) {
            return imageView2;
        }
        LinearLayout linearLayout2 = this.f286899j;
        if (true != z) {
            i2 = a;
        }
        ImageView imageView3 = (ImageView) linearLayout2.findViewById(i2);
        if (imageView3 != null) {
            this.f286899j.removeView(imageView3);
        }
        LayoutInflater layoutInflater = this.f286893d;
        if (z) {
            i = C102707d.m170307b(this.f286892c);
        } else {
            i = m170392h() ? R.layout.message_card_icon_tinted : R.layout.message_card_icon;
        }
        ImageView imageView4 = (ImageView) layoutInflater.inflate(i, this.f286899j, false);
        this.f286899j.addView(imageView4, 0);
        imageView4.setOnClickListener(new C102771n(this));
        return imageView4;
    }

    /* renamed from: h */
    private final boolean m170392h() {
        C87544b bVar = (C87544b) ((C58833ax) ((C102783z) this.f286890a).f286915h.f63720e).mo56109e(C87544b.UNKNOWN_MESSAGE);
        return (bVar == C87544b.RECONNECTING || bVar == C87544b.GMM_INTENT) ? false : true;
    }

    /* renamed from: e */
    public final void mo93428e() {
        int intValue;
        if (this.f286899j != null) {
            if (((Boolean) ((C102783z) this.f286890a).f286913f.f63720e).booleanValue()) {
                ImageView g = m170391g(true);
                this.f286898i = g;
                C87544b bVar = (C87544b) ((C58833ax) ((C102783z) this.f286890a).f286915h.f63720e).mo56107c();
                if (C102707d.f286734a.containsKey(bVar) && (g instanceof LottieAnimationView)) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) g;
                    C102706c cVar = (C102706c) C102707d.f286734a.get(bVar);
                    lottieAnimationView.mo9700j(cVar.f286733k);
                    if (!cVar.mo93397a() || cVar.mo93398b() == null) {
                        lottieAnimationView.mo9695f();
                        lottieAnimationView.mo9693d(cVar.mo93397a());
                    } else {
                        int[] b = cVar.mo93398b();
                        b.getClass();
                        int[] iArr = b;
                        lottieAnimationView.mo9693d(true);
                        lottieAnimationView.mo9689a(new C102705b(lottieAnimationView, iArr));
                        lottieAnimationView.f15138d.mo9769i(0.0f, (float) iArr[1]);
                        lottieAnimationView.f15138d.mo9773j(0.0f);
                        lottieAnimationView.mo9695f();
                    }
                }
            } else {
                ImageView g2 = m170391g(false);
                this.f286898i = g2;
                g2.setImageResource(((Integer) ((C102783z) this.f286890a).f286911d.f63720e).intValue());
            }
            if (this.f286898i != null && (intValue = ((Integer) ((C102783z) this.f286890a).f286914g.f63720e).intValue()) != 0) {
                this.f286898i.setContentDescription(this.f286892c.getString(intValue));
            }
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = this.f286893d.inflate(R.layout.message_card_view, (ViewGroup) null, false);
        mo28295iC(inflate);
        this.f286894e = (TextView) inflate.findViewById(R.id.message_card_title);
        this.f286895f = (TextView) inflate.findViewById(R.id.message_card_explanation);
        this.f286899j = (LinearLayout) inflate.findViewById(R.id.message_card_header);
        this.f286896g = (LinearLayout) inflate.findViewById(R.id.message_card_main_content);
        this.f286900k = (LinearLayout) inflate.findViewById(R.id.message_card_buttons);
        this.f286897h = (TextView) inflate.findViewById(R.id.message_card_feedback_link);
        ((C102783z) this.f286890a).f286914g.mo28726b(new C102772o(this));
        ((C102783z) this.f286890a).f286909b.mo28726b(new C102773p(this));
        C23198ac acVar = ((C102783z) this.f286890a).f286908a;
        LinearLayout linearLayout = this.f286900k;
        linearLayout.getClass();
        acVar.mo28657c(new C23204ai(linearLayout));
        ((C102783z) this.f286890a).f286911d.mo28726b(new C102774q(this));
        ((C102783z) this.f286890a).f286913f.mo28726b(new C102775r(this));
        ((C102783z) this.f286890a).f286912e.mo28726b(new C102776s(this));
        ((C102783z) this.f286890a).f286910c.mo28726b(new C102777t(this));
        TextView textView = this.f286897h;
        if (textView != null) {
            textView.setOnClickListener(new C102770m(this));
        }
    }
}
