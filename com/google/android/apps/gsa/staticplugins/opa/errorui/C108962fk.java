package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.C4833ak;
import com.airbnb.lottie.C4972s;
import com.airbnb.lottie.LottieAnimationView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fk */
/* compiled from: PG */
public final class C108962fk extends C83907bm {

    /* renamed from: b */
    public static final C59071e f303004b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.fk");

    /* renamed from: c */
    public Context f303005c;

    /* renamed from: d */
    public C108887cq f303006d;

    /* renamed from: e */
    public C86124t f303007e;

    /* renamed from: f */
    public C83893b f303008f;

    /* renamed from: g */
    public C69464a f303009g;

    /* renamed from: h */
    private C108961fj f303010h;

    /* renamed from: i */
    private OpaPageLayout f303011i;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        this.f303011i = new OpaPageLayout(context);
        String x = this.f303007e.mo79758x(C90053de.f248969b);
        String str = x;
        this.f303010h = new C108961fj(getActivity(), this.f303008f, this.f303009g, str, Uri.parse(this.f303007e.mo79758x(C90053de.f248970c)));
        C28295m.m52919e(this.f303011i, new C28292j(132906));
        this.f303011i.mo77370b(R.layout.voice_session_fragment);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f303011i.findViewById(R.id.voice_session_animation);
        C4833ak f = C4972s.m13748f(context, "anims/continued_conversation_nga.json");
        Objects.requireNonNull(lottieAnimationView);
        f.mo9793e(new C108957ff(lottieAnimationView));
        TextView textView = (TextView) this.f303011i.findViewById(R.id.voice_session_optin_text);
        if (x.isEmpty()) {
            textView.setText(context.getString(R.string.opa_continued_conversation_optin_screen_secondary_message, new Object[]{BuildConfig.FLAVOR}));
        } else {
            String string = this.f303005c.getString(R.string.opa_continued_conversation_optin_screen_learn_more);
            SpannableString spannableString = new SpannableString(this.f303005c.getString(R.string.opa_continued_conversation_optin_screen_secondary_message, new Object[]{string}));
            int indexOf = spannableString.toString().indexOf(string);
            spannableString.setSpan(new C108960fi(this.f303005c, this.f303010h), indexOf, string.length() + indexOf, 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        textView.setVisibility(0);
        C84012g a = this.f303011i.mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(getText(R.string.opa_continued_conversation_optin_screen_allow_button_text));
        ((C83958a) e).f228734b = new C89943l(new C108958fg(this));
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(getText(R.string.opa_continued_conversation_optin_screen_disallow_button_text));
        ((C83958a) e2).f228734b = new C89943l(new C108959fh(this));
        a.mo77473b(e2.mo77373a());
        return this.f303011i;
    }
}
