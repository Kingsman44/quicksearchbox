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
import com.airbnb.lottie.LottieAnimationView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84027v;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59071e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.z */
/* compiled from: PG */
public final class C109005z extends C83907bm {

    /* renamed from: b */
    public static final C59071e f303104b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.z");

    /* renamed from: c */
    public Context f303105c;

    /* renamed from: d */
    public C108887cq f303106d;

    /* renamed from: e */
    public C86124t f303107e;

    /* renamed from: f */
    public C83893b f303108f;

    /* renamed from: g */
    public C69464a f303109g;

    /* renamed from: h */
    public boolean f303110h;

    /* renamed from: i */
    public boolean f303111i;

    /* renamed from: j */
    public C104149a f303112j;

    /* renamed from: k */
    private C83973o f303113k;

    /* renamed from: l */
    private C109004y f303114l;

    /* renamed from: m */
    private OpaPageLayout f303115m;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = LayoutInflater.from(C84027v.m133919a(this.f303112j, layoutInflater.getContext(), this.f303111i)).getContext();
        this.f303115m = new OpaPageLayout(context);
        String x = this.f303107e.mo79758x(C90053de.f248969b);
        String str = x;
        this.f303114l = new C109004y(getActivity(), this.f303108f, this.f303109g, str, Uri.parse(this.f303107e.mo79758x(C90053de.f248970c)));
        C28295m.m52919e(this.f303115m, new C28292j(80475));
        this.f303115m.mo77370b(R.layout.continued_conversation);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f303115m.findViewById(R.id.continued_conversation_animation);
        View findViewById = this.f303115m.findViewById(R.id.continued_conversation_animation_container);
        C83973o oVar = new C83973o(findViewById, lottieAnimationView, new C109002w(this));
        if (this.f303110h) {
            findViewById.setForceDarkAllowed(false);
        }
        oVar.mo77402c();
        oVar.mo77403d();
        this.f303113k = oVar;
        lottieAnimationView.setVisibility(0);
        TextView textView = (TextView) this.f303115m.findViewById(R.id.continued_conversation_optin_text);
        if (x.isEmpty()) {
            textView.setText(context.getString(R.string.opa_continued_conversation_optin_screen_secondary_message, new Object[]{BuildConfig.FLAVOR}));
        } else {
            String string = this.f303105c.getString(R.string.opa_continued_conversation_optin_screen_learn_more);
            SpannableString spannableString = new SpannableString(this.f303105c.getString(R.string.opa_continued_conversation_optin_screen_secondary_message, new Object[]{string}));
            int indexOf = spannableString.toString().indexOf(string);
            spannableString.setSpan(new C109003x(this.f303105c, this.f303114l), indexOf, string.length() + indexOf, 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        textView.setVisibility(0);
        C84012g a = this.f303115m.mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(getText(R.string.opa_continued_conversation_optin_screen_allow_button_text));
        ((C83958a) e).f228734b = new C89943l(new C108999t(this));
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(getText(R.string.opa_continued_conversation_optin_screen_disallow_button_text));
        ((C83958a) e2).f228734b = new C89943l(new C109000u(this));
        a.mo77473b(e2.mo77373a());
        return this.f303115m;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f303113k;
        if (oVar != null) {
            oVar.mo77406g();
        }
        this.f303113k = null;
    }
}
