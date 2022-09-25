package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.android.apps.gsa.sidekick.shared.cards.VoiceOfGoogleLayout;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91770f;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91771g;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91773i;
import com.google.android.apps.gsa.sidekick.shared.monet.p7246b.C91774j;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91940p;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104480p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23302r;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58881cr;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.en */
/* compiled from: PG */
public final class C104812en extends C22939d implements C91770f, C23302r {

    /* renamed from: a */
    public TextView f292040a;

    /* renamed from: b */
    public Button f292041b;

    /* renamed from: c */
    public Button f292042c;

    /* renamed from: d */
    private final C104480p f292043d;

    /* renamed from: e */
    private final Context f292044e;

    /* renamed from: f */
    private final boolean f292045f;

    /* renamed from: g */
    private final C91773i f292046g;

    /* renamed from: h */
    private final CardRenderingContext f292047h;

    /* renamed from: i */
    private VoiceOfGoogleLayout f292048i;

    public C104812en(C22945j jVar, C104480p pVar, Context context, C58881cr crVar, boolean z, CardRenderingContext cardRenderingContext) {
        super(jVar);
        this.f292043d = pVar;
        this.f292044e = new C91940p(context, false, ((Boolean) crVar.mo6453a()).booleanValue()).f256405a;
        this.f292045f = z;
        this.f292046g = C91774j.m150380a(jVar);
        this.f292047h = cardRenderingContext;
    }

    /* renamed from: e */
    public final int mo86264e() {
        return 0;
    }

    /* renamed from: f */
    public final int mo86265f() {
        return 0;
    }

    /* renamed from: g */
    public final int mo86266g(int i, List list, int i2) {
        return this.f292046g.mo86267h();
    }

    /* renamed from: h */
    public final int mo86267h() {
        return this.f292046g.mo86267h();
    }

    /* renamed from: iZ */
    public final int mo86269iZ() {
        return this.f292046g.mo86269iZ();
    }

    /* renamed from: im */
    public final void mo28298im() {
        VoiceOfGoogleLayout voiceOfGoogleLayout = this.f292048i;
        if (voiceOfGoogleLayout != null) {
            voiceOfGoogleLayout.removeOnLayoutChangeListener(this.f292046g.f255921d);
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        int i = 0;
        View inflate = LayoutInflater.from(this.f292044e).inflate(R.layout.card_feedback_prompt, (ViewGroup) null, false);
        VoiceOfGoogleLayout voiceOfGoogleLayout = (VoiceOfGoogleLayout) inflate.findViewById(R.id.voice_of_google);
        this.f292048i = voiceOfGoogleLayout;
        this.f292040a = (TextView) voiceOfGoogleLayout.findViewById(R.id.prompt);
        this.f292041b = (Button) this.f292048i.findViewById(R.id.button1);
        this.f292042c = (Button) this.f292048i.findViewById(R.id.button2);
        VoiceOfGoogleLayout voiceOfGoogleLayout2 = this.f292048i;
        int color = voiceOfGoogleLayout2.getResources().getColor(true != this.f292045f ? R.color.qp_text_b2 : R.color.qp_text_w1);
        voiceOfGoogleLayout2.f255644a.setTextColor(color);
        voiceOfGoogleLayout2.f255645b.setTextColor(color);
        voiceOfGoogleLayout2.f255646c.setTextColor(color);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f292048i.getLayoutParams();
        int dimensionPixelSize = this.f292044e.getResources().getDimensionPixelSize(R.dimen.vog_prompt_top_margin_monet);
        if (this.f292047h.mo49316k()) {
            i = this.f292044e.getResources().getDimensionPixelSize(R.dimen.vog_prompt_bottom_margin_no_headers);
        }
        marginLayoutParams.setMargins(this.f292044e.getResources().getDimensionPixelSize(R.dimen.vog_prompt_start_margin_monet), dimensionPixelSize, marginLayoutParams.rightMargin, i);
        this.f292048i.setLayoutParams(marginLayoutParams);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C90686c.m148055a(this.f292044e, 4), -2);
        layoutParams.gravity = 1;
        inflate.setLayoutParams(layoutParams);
        mo28295iC(inflate);
        ((C104797dz) this.f292043d).f292012b.mo28726b(new C104807ei(this));
        ((C104797dz) this.f292043d).f292011a.mo28726b(new C104808ej(this));
        ((C104797dz) this.f292043d).f292013c.mo28726b(new C104809ek(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        MovementMethod movementMethod = null;
        if (this.f292040a.getText() instanceof Spanned) {
            Spanned spanned = (Spanned) this.f292040a.getText();
            if (((ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)).length > 0) {
                movementMethod = LinkMovementMethod.getInstance();
            }
        }
        this.f292040a.setMovementMethod(movementMethod);
        this.f292041b.setOnClickListener(new C104810el(this));
        this.f292042c.setOnClickListener(new C104811em(this));
        this.f292046g.mo86283b(this.f292048i);
    }

    /* renamed from: j */
    public final List mo86270j() {
        return C91773i.f255918a;
    }

    /* renamed from: r */
    public final void mo86278r(C91771g gVar) {
        this.f292046g.mo86278r(gVar);
    }

    /* renamed from: t */
    public final void mo28806t() {
        this.f292046g.mo86282a();
    }
}
