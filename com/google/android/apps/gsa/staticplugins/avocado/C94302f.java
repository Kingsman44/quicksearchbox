package com.google.android.apps.gsa.staticplugins.avocado;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.speech.hotword.p7282a.C92349f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.f */
/* compiled from: PG */
public final /* synthetic */ class C94302f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94321h f263516a;

    public /* synthetic */ C94302f(C94321h hVar) {
        this.f263516a = hVar;
    }

    public final void onClick(View view) {
        View view2;
        C44565p pVar;
        Spannable spannable;
        Spannable spannable2;
        Spannable spannable3;
        Spannable spannable4;
        FooterLayout footerLayout;
        C94321h hVar = this.f263516a;
        hVar.f263577m = 1;
        ((C89859i) hVar.f263568d.mo27525b()).mo83702b(C89849ae.FACE_MATCH_VALUE_PROP_CONTINUE);
        if (hVar.f263567c.mo79746e(C90082eg.f249988by)) {
            pVar = new C92349f(hVar.getActivity(), hVar.f263575k.getHeight(), hVar.f263575k.f228726a.getHeight());
            view2 = hVar.getActivity().getLayoutInflater().inflate(R.layout.consent_scrolling_bottom_sheet, (ViewGroup) null);
        } else {
            pVar = new C44565p(hVar.getActivity());
            view2 = hVar.getActivity().getLayoutInflater().inflate(R.layout.consent_bottom_sheet, (ViewGroup) null);
        }
        TextView textView = (TextView) view2.findViewById(R.id.opa_error_learn_more);
        ((TextView) view2.findViewById(R.id.consent_bottom_title)).setText(R.string.consent_screen_bottom_sheet_title);
        ((TextView) view2.findViewById(R.id.consent_bottom_message)).setText(R.string.consent_screen_bottom_sheet_message);
        TextView textView2 = (TextView) view2.findViewById(R.id.consent_bottom_second_message_title1);
        TextView textView3 = (TextView) view2.findViewById(R.id.consent_bottom_second_message_content1);
        TextView textView4 = (TextView) view2.findViewById(R.id.consent_bottom_second_message_title2);
        TextView textView5 = (TextView) view2.findViewById(R.id.consent_bottom_second_message_content2);
        if (hVar.f263579o) {
            spannable4 = AvocadoUtils.m155378b(hVar.getString(R.string.consent_screen_bottom_sheet_unicorn_message_title1), hVar.getResources().getColor(R.color.link_text_color));
            spannable3 = AvocadoUtils.m155378b(hVar.getString(R.string.consent_screen_bottom_sheet_unicorn_message_content1), hVar.getResources().getColor(R.color.link_text_color));
            spannable = AvocadoUtils.m155378b(hVar.getString(R.string.consent_screen_bottom_sheet_unicorn_message_title2), hVar.getResources().getColor(R.color.link_text_color));
            spannable2 = AvocadoUtils.m155378b(hVar.getString(R.string.consent_screen_bottom_sheet_unicorn_message_content2), hVar.getResources().getColor(R.color.link_text_color));
        } else {
            Spannable b = AvocadoUtils.m155378b(hVar.getString(R.string.consent_screen_bottom_sheet_second_message_title1), hVar.getResources().getColor(R.color.link_text_color));
            Spannable b2 = AvocadoUtils.m155378b(hVar.getString(R.string.consent_screen_bottom_sheet_second_message_content1), hVar.getResources().getColor(R.color.link_text_color));
            Spannable b3 = AvocadoUtils.m155378b(hVar.getString(R.string.consent_screen_bottom_sheet_second_message_title2), hVar.getResources().getColor(R.color.link_text_color));
            Spannable b4 = AvocadoUtils.m155378b(hVar.getString(R.string.consent_screen_bottom_sheet_second_message_content2), hVar.getResources().getColor(R.color.link_text_color));
            textView.setText(AvocadoUtils.m155378b(hVar.getString(R.string.consent_learn_more, new Object[]{hVar.getString(R.string.consent_learn_more_url)}), hVar.getResources().getColor(R.color.link_text_color)));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            spannable4 = b;
            spannable3 = b2;
            spannable = b3;
            spannable2 = b4;
        }
        textView2.setText(spannable4);
        textView3.setText(spannable3);
        textView4.setText(spannable);
        textView5.setText(spannable2);
        pVar.setContentView(view2);
        if (hVar.f263567c.mo79746e(C90082eg.f249988by)) {
            footerLayout = ((C92349f) pVar).f257463k;
        } else {
            footerLayout = (FooterLayout) view2.findViewById(R.id.consent_bottom_footer_container);
        }
        footerLayout.mo77362c(2);
        footerLayout.mo77363d(true);
        Button a = footerLayout.mo77360a();
        a.setText(hVar.getString(R.string.consent_screen_action_button_text));
        a.setOnClickListener(new C94248d(hVar));
        Button b5 = footerLayout.mo77361b();
        b5.setText(hVar.getString(R.string.consent_screen_cancel_button_text));
        b5.setOnClickListener(new C94275e(hVar));
        hVar.f263576l = pVar;
        if (hVar.f263573i.f253818a.isEnabled() && hVar.f263567c.mo79746e(C90082eg.f249988by)) {
            ((C92349f) hVar.f263576l).mo86996a(hVar.f263574j);
        }
        hVar.f263576l.show();
    }
}
