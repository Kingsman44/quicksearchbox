package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2814a.C36687c;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p4120ax.p4121a.p4122a.p4123a.p4124a.C54642b;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.n */
/* compiled from: PG */
class C126673n implements C46792di {

    /* renamed from: a */
    final /* synthetic */ LayoutInflater f348823a;

    /* renamed from: b */
    final /* synthetic */ GlifLayout f348824b;

    /* renamed from: c */
    final /* synthetic */ C126674o f348825c;

    public C126673n(C126674o oVar, LayoutInflater layoutInflater, GlifLayout glifLayout) {
        this.f348825c = oVar;
        this.f348823a = layoutInflater;
        this.f348824b = glifLayout;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18078b(Object obj) {
        C54642b bVar = (C54642b) obj;
        LayoutInflater layoutInflater = this.f348823a;
        ViewGroup viewGroup = (ViewGroup) this.f348824b.findViewById(R.id.assistant_oobe_get_more_content_container);
        Context context = this.f348825c.f348827b;
        C58480gp e = C58485gu.m89837e();
        if ((bVar.f143463a & 1) != 0) {
            C9855w a = C9855w.m24617a(bVar.f143464b);
            if (a == null) {
                a = C9855w.STANDBY;
            }
            if (a.equals(C9855w.STANDBY)) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                String string = context.getString(R.string.assistant_oobe_default_x_google_hotword);
                C36687c cVar = new C36687c(context);
                cVar.setId(R.id.assistant_oobe_aol_opt_in);
                cVar.mo40331b(context.getString(R.string.assistant_oobe_aol_title));
                ((TextView) cVar.findViewById(R.id.consent_ui_description)).setText(context.getString(R.string.assistant_oobe_aol_description, new Object[]{string}));
                cVar.f95575a.setChecked(true);
                cVar.mo40330a().setVisibility(8);
                linearLayout.addView(cVar);
                linearLayout.addView(new Space(context), new ViewGroup.LayoutParams(0, 36));
                C36687c cVar2 = new C36687c(context);
                cVar2.setId(R.id.assistant_oobe_skip_voice_recognition_opt_in);
                cVar2.findViewById(R.id.consent_ui_title).setVisibility(8);
                ((TextView) cVar2.findViewById(R.id.consent_ui_description)).setText(context.getString(R.string.assistant_oobe_skip_voice_recognition_description, new Object[]{string}));
                Switch switchR = cVar2.f95575a;
                switchR.setChecked(false);
                linearLayout.addView(cVar2);
                cVar.f95575a.setOnCheckedChangeListener(new C126672m(switchR));
                e.mo55395g(linearLayout);
            }
        }
        int i = bVar.f143466d;
        int i2 = bVar.f143465c;
        if (i <= 0 && i2 == 0) {
            C36687c cVar3 = new C36687c(context);
            cVar3.setId(R.id.assistant_oobe_email_opt_in);
            cVar3.mo40331b(context.getString(R.string.assistant_oobe_email_optin_title));
            ((TextView) cVar3.findViewById(R.id.consent_ui_description)).setText(Html.fromHtml(context.getString(R.string.assistant_oobe_email_optin_description)));
            cVar3.mo40330a().setImageResource(R.drawable.ic_email_grey_24);
            e.mo55395g(cVar3);
        }
        C58485gu f = e.mo55394f();
        IntStream.CC.range(0, ((C58724pq) f).f156474d).forEach(new C126670k(viewGroup, f, layoutInflater));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
