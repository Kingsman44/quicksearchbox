package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.C73845bq;
import com.google.android.apps.gsa.assistant.shared.v;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83982ag;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83983ah;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84027v;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110419f;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110425l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ea */
/* compiled from: PG */
public final class C108925ea extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302853b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.ea");

    /* renamed from: c */
    public Context f302854c;

    /* renamed from: d */
    public C89994f f302855d;

    /* renamed from: e */
    public C86124t f302856e;

    /* renamed from: f */
    public C83893b f302857f;

    /* renamed from: g */
    public h f302858g;

    /* renamed from: h */
    public v f302859h;

    /* renamed from: i */
    public C110419f f302860i;

    /* renamed from: j */
    public C69464a f302861j;

    /* renamed from: k */
    public C58833ax f302862k;

    /* renamed from: l */
    public boolean f302863l;

    /* renamed from: m */
    public OpaPageLayout f302864m;

    /* renamed from: n */
    public C108920dw f302865n;

    /* renamed from: o */
    public int f302866o;

    /* renamed from: p */
    public C110425l f302867p;

    /* renamed from: q */
    public C104149a f302868q;

    /* renamed from: r */
    private C83973o f302869r;

    /* renamed from: s */
    private boolean f302870s = false;

    /* renamed from: e */
    protected static final C83973o m181156e(View view, LottieAnimationView lottieAnimationView) {
        C83973o oVar = new C83973o(view, lottieAnimationView, new C108923dz());
        oVar.mo77402c();
        oVar.mo77403d();
        return oVar;
    }

    /* renamed from: g */
    private final CharSequence m181157g() {
        String str;
        String string = this.f302854c.getString(R.string.personal_response_on_lockscreen_learn_more);
        if (this.f302856e.mo79746e(C90014bt.f247797nt)) {
            str = this.f302854c.getString(R.string.personal_response_on_lockscreen_turn_off_with_toggle_updated, new Object[]{string});
        } else {
            str = this.f302854c.getString(R.string.personal_response_on_lockscreen_turn_off_with_toggle, new Object[]{string});
        }
        SpannableString spannableString = new SpannableString(str);
        int indexOf = spannableString.toString().indexOf(string);
        spannableString.setSpan(new C108919dv(this.f302854c, this.f302865n), indexOf, string.length() + indexOf, 33);
        return spannableString;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        if (this.f302856e.mo79746e(C90014bt.f247546jG) && ((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getInt("style", 1) != 2) {
            z = false;
        }
        this.f302870s = z;
        this.f302866o = ((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getInt("content", 0);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C83982ag agVar;
        View inflate = LayoutInflater.from(C84027v.m133919a(this.f302868q, layoutInflater.getContext(), this.f302863l)).inflate(R.layout.personal_response, (ViewGroup) null);
        this.f302864m = (OpaPageLayout) inflate.findViewById(R.id.opa_page_layout);
        boolean e = C73845bq.m108431e((C73845bq) ((C58881cr) ((C58847bk) this.f302862k).f156646a).mo6453a());
        this.f302865n = new C108920dw(getActivity(), this.f302856e, this.f302857f, this.f302861j);
        if (this.f302870s) {
            C28295m.m52919e(this.f302864m, new C28292j(true != e ? 60071 : 75817));
            this.f302864m.mo77370b(R.layout.personal_response_content);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f302864m.findViewById(R.id.personal_response_animation);
            if (e) {
                ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
                layoutParams.height = this.f302854c.getResources().getDimensionPixelSize(R.dimen.opa_charging_ambient_pr_illustration_height);
                lottieAnimationView.setLayoutParams(layoutParams);
            }
            HeaderLayout headerLayout = (HeaderLayout) this.f302864m.findViewById(R.id.opa_header);
            int i = this.f302866o;
            if (i == 0) {
                if (this.f302856e.mo79746e(C90014bt.f247797nt)) {
                    C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.personal_response_on_lockscreen_title_updated, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                    C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.personal_response_on_lockscreen_message_updated, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                } else {
                    C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.personal_response_on_lockscreen_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                    C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.personal_response_on_lockscreen_message, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                }
            } else if (i == 2) {
                C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.personal_response_on_lockscreen_title_updated, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.both_personal_response_on_lockscreen_message, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            } else if (i == 1) {
                C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.proactive_personal_response_on_lockscreen_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
                C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.proactive_personal_response_on_lockscreen_only_message, headerLayout), TextView.BufferType.NORMAL, headerLayout);
            }
            TextView textView = (TextView) this.f302864m.findViewById(R.id.personal_response_learn_more);
            TextView textView2 = (TextView) this.f302864m.findViewById(R.id.proactive_personal_response_message);
            int i2 = this.f302866o;
            if (i2 == 0) {
                textView2.setVisibility(8);
                textView.setText(R.string.personal_response_on_lockscreen_learn_more);
                textView.setOnClickListener(new C89943l(new C108917dt(this)));
                textView.setVisibility(0);
            } else if (i2 == 2) {
                textView2.setText(R.string.proactive_personal_response_on_lockscreen_message);
                textView2.setVisibility(0);
                textView.setVisibility(8);
            } else if (i2 == 1) {
                textView2.setVisibility(8);
                textView.setVisibility(8);
            }
            TextView textView3 = (TextView) this.f302864m.findViewById(R.id.personal_response_turn_off_text);
            int i3 = this.f302866o;
            if (i3 == 0) {
                textView3.setText(R.string.personal_response_on_lockscreen_turn_off);
            } else if (i3 == 2) {
                textView3.setText(m181157g());
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
            } else if (i3 == 1) {
                textView3.setVisibility(8);
            }
            agVar = C83983ah.m133841a(this.f302864m, new C108915dr(this));
            this.f302869r = m181156e(this.f302864m.findViewById(R.id.personal_response_animation_container), lottieAnimationView);
        } else {
            C28295m.m52919e(this.f302864m, new C28292j(true != e ? 69286 : 75868));
            this.f302864m.mo77370b(R.layout.personal_response_with_toggle_content);
            HeaderLayout headerLayout2 = (HeaderLayout) this.f302864m.findViewById(R.id.opa_header);
            TextView textView4 = (TextView) this.f302864m.findViewById(R.id.personal_response_message);
            if (this.f302856e.mo79746e(C90014bt.f247797nt)) {
                C84018m.m133908c(headerLayout2.f228718a, C84018m.m133906a(R.string.personal_response_on_lockscreen_title_updated, headerLayout2), TextView.BufferType.NORMAL, headerLayout2);
                textView4.setText(R.string.personal_response_on_lockscreen_message_with_toggle_updated);
            } else {
                C84018m.m133908c(headerLayout2.f228718a, C84018m.m133906a(R.string.personal_response_on_lockscreen_title, headerLayout2), TextView.BufferType.NORMAL, headerLayout2);
                textView4.setText(R.string.personal_response_on_lockscreen_message_with_toggle);
            }
            TextView textView5 = (TextView) this.f302864m.findViewById(R.id.personal_response_turn_off_text);
            textView5.setText(m181157g());
            textView5.setMovementMethod(LinkMovementMethod.getInstance());
            agVar = C83983ah.m133841a(this.f302864m, new C108916ds(this));
            this.f302869r = m181156e(this.f302864m.findViewById(R.id.personal_response_animation_container), (LottieAnimationView) this.f302864m.findViewById(R.id.personal_response_animation));
        }
        agVar.mo77412a();
        if (this.f302857f.mo77278a().mo56113h()) {
            this.f302860i.mo98654a(true, ((Account) this.f302857f.mo77278a().mo56107c()).name);
        }
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C83973o oVar = this.f302869r;
        if (oVar != null) {
            oVar.mo77406g();
        }
        this.f302869r = null;
    }
}
