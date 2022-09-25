package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LinkUtil;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.net.MalformedURLException;
import java.net.URL;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ao */
/* compiled from: PG */
final class C109097ao implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C109100ar f303730a;

    public C109097ao(C109100ar arVar) {
        this.f303730a = arVar;
    }

    /* renamed from: c */
    public final void mo17702gm(Optional optional) {
        if (optional.isPresent()) {
            if (this.f303730a.f303791x.mo79746e(C90037cp.f248577cz)) {
                C109100ar arVar = this.f303730a;
                arVar.mo97591g(arVar.f303770c, C53593bz.f140658j);
                this.f303730a.f303770c.setOnClickListener(new C109095am(this, optional));
            }
            C109100ar arVar2 = this.f303730a;
            arVar2.f303755T.setVisibility(0);
            arVar2.mo97590f(new C109125v(arVar2, (Uri) optional.get()), 113744);
            if (this.f303730a.f303791x.mo79746e(C90037cp.f248532cG)) {
                this.f303730a.f303780m.setVisibility(0);
                try {
                    SpannableString spannableString = new SpannableString(Html.fromHtml(this.f303730a.mo97587c().getString(R.string.opa_greeting_plate_disclaimer_text, new Object[]{new URL(((Uri) optional.get()).toString())}), 0));
                    spannableString.setSpan(new C109096an(this, optional), 60, 75, 18);
                    this.f303730a.f303780m.setText(LinkUtil.m133791a(spannableString));
                    this.f303730a.f303780m.setMovementMethod(LinkMovementMethod.getInstance());
                    C109100ar arVar3 = this.f303730a;
                    arVar3.f303780m.setLinkTextColor(C1878d.m5128a(arVar3.f303790w, R.color.google_blue600));
                } catch (MalformedURLException e) {
                    C59104x c = C109100ar.f303734a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24508)).mo56386p("Malformed url for legal and disclaimer text");
                }
            }
        }
        this.f303730a.mo97596l();
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C109100ar.f303734a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24507)).mo56386p("Failed to get nest promo uri");
    }
}
