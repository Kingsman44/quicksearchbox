package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.text.BidiFormatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129963n;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129966q;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.assistant.p3897e.p3921j.p3926e.C51891cy;
import com.google.assistant.p3897e.p3921j.p3926e.C51894da;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5462h.C69685i;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.q */
/* compiled from: PG */
final /* synthetic */ class C130045q implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C130047s f356608a;

    public C130045q(C130047s sVar) {
        this.f356608a = sVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C129963n nVar;
        C129963n nVar2;
        C129963n nVar3;
        C129963n nVar4;
        C129963n nVar5;
        C129963n nVar6;
        C129966q qVar = (C129966q) obj;
        C130047s sVar = this.f356608a;
        if (qVar == null || qVar.f356469b != 6) {
            sVar.f356614d.requireView().setVisibility(4);
            return;
        }
        String str = ((C129963n) qVar.f356470c).f356454k;
        C69664n.m101060f(str, "state.translationState.outputTextLocale");
        sVar.f356622l = str;
        if (qVar.f356469b == 6) {
            nVar = (C129963n) qVar.f356470c;
        } else {
            nVar = C129963n.f356442m;
        }
        String str2 = nVar.f356453j;
        C69664n.m101060f(str2, "state.translationState.inputTextLocale");
        sVar.f356621k = str2;
        sVar.f356614d.requireView().setVisibility(0);
        TextView c = sVar.mo109457c();
        if (qVar.f356469b == 6) {
            nVar2 = (C129963n) qVar.f356470c;
        } else {
            nVar2 = C129963n.f356442m;
        }
        c.setText(nVar2.f356445b);
        TextView d = sVar.mo109458d();
        if (qVar.f356469b == 6) {
            nVar3 = (C129963n) qVar.f356470c;
        } else {
            nVar3 = C129963n.f356442m;
        }
        d.setText(nVar3.f356452i);
        TextView e = sVar.mo109459e();
        if (qVar.f356469b == 6) {
            nVar4 = (C129963n) qVar.f356470c;
        } else {
            nVar4 = C129963n.f356442m;
        }
        e.setText(nVar4.f356446c);
        sVar.mo109457c().getText();
        sVar.mo109459e().getText();
        sVar.mo109458d().getText();
        if (qVar.f356469b == 6) {
            nVar5 = (C129963n) qVar.f356470c;
        } else {
            nVar5 = C129963n.f356442m;
        }
        C51894da daVar = nVar5.f356450g;
        if (daVar == null) {
            daVar = C51894da.f136125b;
        }
        if (daVar.f136127a.size() > 0) {
            InterpreterOtherTranslationView f = sVar.mo109460f();
            if (qVar.f356469b == 6) {
                nVar6 = (C129963n) qVar.f356470c;
            } else {
                nVar6 = C129963n.f356442m;
            }
            C69664n.m101060f(nVar6, "state.translationState");
            C69664n.m101061g(nVar6, "state");
            f.setVisibility(0);
            String str3 = nVar6.f356455l;
            C69664n.m101060f(str3, "state.alternativeTranslationsHeaderText");
            if (str3.length() > 0) {
                View findViewById = f.findViewById(R.id.assistant_interpreter_other_translation_header);
                C69664n.m101060f(findViewById, "this.findViewById(R.id.a…other_translation_header)");
                ((TextView) findViewById).setText(nVar6.f356455l);
            }
            C51894da daVar2 = nVar6.f356450g;
            if (daVar2 == null) {
                daVar2 = C51894da.f136125b;
            }
            C62971cq cqVar = daVar2.f136127a;
            C69664n.m101060f(cqVar, "state.alternativeTranslations.translationsList");
            List a = f.mo109429a();
            if (cqVar.size() > a.size()) {
                C59052c cVar = (C59052c) InterpreterOtherTranslationView.f356568a.mo56226d();
                int size = cqVar.size();
                int size2 = a.size();
                cVar.mo56379ah(new C59094n(38662));
                cVar.mo56393w("More alternative translations than views: %d vs %d. The additional alternative translations would be skipped.", size, size2);
            }
            int size3 = a.size();
            int size4 = cqVar.size();
            if (size3 > size4) {
                size3 = size4;
            }
            boolean z = false;
            for (int i = 0; i < size3; i++) {
                C69685i b = f.mo109430b(i);
                TextView textView = (TextView) b.f186052a;
                TextView textView2 = (TextView) b.f186053b;
                ((View) a.get(i)).setVisibility(0);
                textView.setText(((C51891cy) cqVar.get(i)).f136116a);
                textView.setVisibility(0);
                textView2.setVisibility(8);
                if (((C51891cy) cqVar.get(i)).f136117b.size() > 0) {
                    C62971cq cqVar2 = ((C51891cy) cqVar.get(i)).f136117b;
                    C69664n.m101060f(cqVar2, "otherTranslations[i].backTranslationsList");
                    textView2.setText(C69540x.m100851ag(cqVar2, " ", (CharSequence) null, (CharSequence) null, (C69626l) null, 62));
                    z = true;
                }
            }
            int size5 = a.size();
            int size6 = cqVar.size();
            if (size5 > size6) {
                size5 = size6;
            }
            for (int i2 = 0; i2 < size5; i2++) {
                TextView textView3 = (TextView) f.mo109430b(i2).f186053b;
                if (z) {
                    textView3.setVisibility(0);
                }
            }
            View findViewById2 = f.findViewById(R.id.assistant_interpreter_other_translation_scroll_view);
            C69664n.m101060f(findViewById2, "this.findViewById(R.id.a…_translation_scroll_view)");
            findViewById2.scrollTo(0, 0);
        }
        CharSequence text = sVar.mo109459e().getText();
        C69664n.m101060f(text, "outputText.text");
        boolean isRtl = text.length() > 0 ? BidiFormatter.getInstance().isRtl(sVar.mo109459e().getText()) : false;
        ImageView a2 = sVar.mo109455a();
        ViewGroup.LayoutParams layoutParams = sVar.mo109455a().getLayoutParams();
        C69664n.m101059e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int i3 = 9;
        layoutParams2.removeRule(9);
        layoutParams2.removeRule(11);
        if (true != isRtl) {
            i3 = 11;
        }
        layoutParams2.addRule(i3);
        a2.setLayoutParams(layoutParams2);
        ImageView b2 = sVar.mo109456b();
        ViewGroup.LayoutParams layoutParams3 = sVar.mo109456b().getLayoutParams();
        C69664n.m101059e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.removeRule(0);
        layoutParams4.removeRule(1);
        layoutParams4.addRule(isRtl ? 1 : 0, R.id.assistant_interpreter_output_text_copy_button);
        b2.setLayoutParams(layoutParams4);
    }
}
