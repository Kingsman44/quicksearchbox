package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6465b.C83986b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.aq */
/* compiled from: PG */
final class C108833aq implements C22868d {

    /* renamed from: a */
    final /* synthetic */ OpaPageLayout f302606a;

    /* renamed from: b */
    final /* synthetic */ LayoutInflater f302607b;

    /* renamed from: c */
    final /* synthetic */ Context f302608c;

    /* renamed from: d */
    final /* synthetic */ C9439b f302609d;

    /* renamed from: e */
    final /* synthetic */ C108836at f302610e;

    public C108833aq(C108836at atVar, OpaPageLayout opaPageLayout, LayoutInflater layoutInflater, Context context, C9439b bVar) {
        this.f302610e = atVar;
        this.f302606a = opaPageLayout;
        this.f302607b = layoutInflater;
        this.f302608c = context;
        this.f302609d = bVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        int i = C108836at.f302614t;
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C83986b bVar;
        C83986b bVar2;
        LinearLayout linearLayout;
        C83986b bVar3;
        int i;
        C83986b bVar4;
        C58833ax axVar;
        String str;
        this.f302606a.findViewById(R.id.progress_indicator).setVisibility(8);
        this.f302610e.f302631r = (Boolean) obj;
        LayoutInflater layoutInflater = this.f302607b;
        ViewGroup viewGroup = (ViewGroup) this.f302606a.findViewById(R.id.get_more_content_container);
        C108836at atVar = this.f302610e;
        Context context = this.f302608c;
        C9439b bVar5 = this.f302609d;
        C58480gp e = C58485gu.m89837e();
        if (!atVar.f302625l.mo97263b()) {
            bVar = null;
        } else {
            if (atVar.f302617d.mo79746e(C90037cp.f248610f)) {
                str = context.getString(R.string.opa_getmore_optin_screen_add_launcher_icon_description);
            } else {
                str = context.getString(R.string.opa_email_optin_screen_sub_toggle_explanation);
            }
            Context context2 = context;
            bVar = C108836at.m181034e(context2, R.id.get_more_element_app_shortcut, R.drawable.add_opa_shortcut, context.getString(R.string.opa_email_optin_screen_add_shortcut_explanation), str, C58836b.f156633a, true);
        }
        C108836at.m181035i(e, bVar);
        if (atVar.f302620g.mo17584f() || atVar.f302620g.mo17583e() || atVar.f302620g.mo17585g() || atVar.f302617d.mo79746e(C90053de.f248940G)) {
            bVar2 = null;
        } else {
            bVar2 = C108836at.m181034e(context, R.id.get_more_element_screen_context, R.drawable.ic_screen_search_grey_24, context.getString(R.string.screen_context_title), context.getString(R.string.screen_context_desc), C58836b.f156633a, atVar.f302617d.mo79746e(C90014bt.f247630kl));
        }
        C108836at.m181035i(e, bVar2);
        if (!atVar.f302631r.booleanValue()) {
            linearLayout = null;
        } else {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            C83986b bVar6 = new C83986b(context);
            bVar6.setId(R.id.get_more_element_assistant_on_lockscreen);
            bVar6.mo77424c(context.getString(R.string.oobe_assistant_on_lockscreen_title));
            TextView textView = (TextView) bVar6.findViewById(R.id.switch_content_message);
            String string = context.getString(R.string.skip_voice_recognition_learn_more);
            String string2 = context.getString(R.string.assistant_on_lockscreen_desc, new Object[]{atVar.mo97211h()});
            SpannableString spannableString = new SpannableString(string2 + " " + string);
            String x = atVar.f302617d.mo79758x(C90014bt.f247392gL);
            int indexOf = spannableString.toString().indexOf(string);
            spannableString.setSpan(new C108834ar(x, context), indexOf, string.length() + indexOf, 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            bVar6.f228785a.setChecked(true);
            bVar6.mo77422a().setVisibility(8);
            linearLayout.addView(bVar6);
            linearLayout.addView(new Space(context), new ViewGroup.LayoutParams(0, context.getResources().getDimensionPixelSize(R.dimen.assistant_on_lockscreen_space)));
            C83986b bVar7 = new C83986b(context);
            bVar7.setId(R.id.get_more_element_skip_voice_recognition);
            bVar7.mo77425d(context.getString(R.string.skip_voice_recognition_desc, new Object[]{atVar.mo97211h()}), C58836b.f156633a);
            bVar7.findViewById(R.id.consent_element_title_text).setVisibility(8);
            Switch switchR = bVar7.f228785a;
            switchR.setChecked(false);
            linearLayout.addView(bVar7);
            bVar6.f228785a.setOnCheckedChangeListener(new C108829am(switchR));
        }
        C108836at.m181035i(e, linearLayout);
        if (atVar.f302623j.mo97255c() && !atVar.f302617d.mo79746e(C90053de.f248944K)) {
            String string3 = atVar.getString(R.string.nga_opt_in_continued_conversation_title);
            String string4 = atVar.getString(R.string.nga_opt_in_continued_conversation_description);
            C58836b bVar8 = C58836b.f156633a;
            C58836b bVar9 = bVar8;
            i = 0;
            bVar3 = C108836at.m181034e(context, R.id.get_more_element_continued_conversation, R.drawable.ic_continued_conversation_grey600_24, string3, string4, bVar9, atVar.f302617d.mo79746e(C90126fx.f251009ai));
        } else {
            i = 0;
            bVar3 = null;
        }
        C108836at.m181035i(e, bVar3);
        if (C9439b.BLOCKING_VOICE_MATCH_FROM_ASSISTANT_INVOCATION.equals(bVar5) || !atVar.f302625l.mo97264c()) {
            bVar4 = null;
        } else {
            String string5 = context.getString(R.string.opa_email_optin_screen_toggle_explanation);
            String string6 = context.getString(R.string.omniconsent_email_optin_description);
            if (atVar.f302617d.mo79746e(C90014bt.f247601kI)) {
                axVar = C58833ax.m90834k(context.getString(R.string.opa_email_optin_screen_unsubscribe));
            } else {
                axVar = C58836b.f156633a;
            }
            bVar4 = C108836at.m181034e(context, R.id.get_more_element_email, R.drawable.ic_email_grey_24, string5, string6, axVar, atVar.f302617d.mo79746e(C90014bt.f247600kH));
        }
        C108836at.m181035i(e, bVar4);
        C58485gu f = e.mo55394f();
        int i2 = 0;
        while (true) {
            C58724pq pqVar = (C58724pq) f;
            if (i2 >= pqVar.f156474d) {
                break;
            }
            viewGroup.addView((View) f.get(i2));
            if (i2 < pqVar.f156474d - 1) {
                layoutInflater.inflate(R.layout.get_more_divider, viewGroup, true);
            }
            i2++;
        }
        C108836at atVar2 = this.f302610e;
        if (!C9439b.BLOCKING_VOICE_MATCH_FROM_ASSISTANT_INVOCATION.equals(this.f302609d)) {
            atVar2.f302618e.edit().putInt("opa_email_optin_seen_count", atVar2.f302618e.getInt("opa_email_optin_seen_count", i) + 1).apply();
            if (atVar2.f302625l.mo97265d()) {
                atVar2.f302618e.edit().putInt("opa_wakeup_routine_opt_in_status", 999999999).apply();
            }
        }
    }
}
