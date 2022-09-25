package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9774k.p9777b;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128840o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.apps.tiktok.tracing.C47591co;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.k.b.e */
/* compiled from: PG */
final class C128941e implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128943g f354313a;

    public C128941e(C128943g gVar) {
        this.f354313a = gVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        Integer num;
        C128840o oVar = (C128840o) obj;
        C69664n.m101061g(oVar, "type");
        View findViewById = this.f354313a.f354315b.requireView().findViewById(R.id.assistant_voice_plate_onboarding_text);
        C69664n.m101060f(findViewById, "fragment.requireView().f…ce_plate_onboarding_text)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = this.f354313a.f354315b.requireView().findViewById(R.id.assistant_voice_plate_onboarding_button);
        C69664n.m101060f(findViewById2, "fragment.requireView().f…_plate_onboarding_button)");
        TextView textView2 = (TextView) findViewById2;
        textView.setVisibility(C128939c.m210469a(oVar));
        textView2.setVisibility(C128939c.m210469a(oVar));
        C128943g gVar = this.f354313a;
        textView2.setOnClickListener(new C47591co(gVar.f354317d, "Clicked onboarding button", new C128940d(oVar, gVar, textView2)));
        C128943g gVar2 = this.f354313a;
        C128840o oVar2 = C128840o.UNKNOWN;
        int ordinal = oVar.ordinal();
        if (ordinal == 0) {
            num = null;
        } else if (ordinal == 1) {
            num = 152877;
        } else if (ordinal == 2) {
            num = 153096;
        } else {
            throw new C69677g();
        }
        if (num != null) {
            gVar2.f354319f.mo108809a(num.intValue(), textView);
        }
        Integer b = C128939c.m210470b(oVar);
        if (b != null) {
            gVar2.f354319f.mo108809a(b.intValue(), textView2);
        }
        int ordinal2 = oVar.ordinal();
        if (ordinal2 == 1) {
            textView.setText(R.string.assistant_voice_plate_onboarding_oobe_text);
            textView2.setText(R.string.assistant_voice_plate_onboarding_oobe_button);
        } else if (ordinal2 == 2) {
            textView.setText(R.string.assistant_voice_plate_onboarding_oauth_recovery_text);
            textView2.setText(R.string.assistant_voice_plate_onboarding_oauth_recovery_button);
        }
    }
}
