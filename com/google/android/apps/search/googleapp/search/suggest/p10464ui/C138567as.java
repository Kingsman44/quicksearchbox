package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138057n;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138068y;
import com.google.android.apps.search.googleapp.search.suggest.p10453e.C138080b;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138583h;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.as */
/* compiled from: PG */
final class C138567as implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376894a;

    public C138567as(C138558am amVar) {
        this.f376894a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138558am amVar = this.f376894a;
        C138068y yVar = amVar.f376868i;
        yVar.f375655k = Duration.ofMillis(yVar.f375645a.mo26871c());
        C138057n nVar = amVar.f376873n;
        nVar.f375630a.mo114106d(Duration.ofNanos(nVar.f375631b.mo26872d()), "AGA");
        String str = ((C138583h) bVar).f376914a;
        Editable text = amVar.mo114326d().mo114401b().getText();
        C69664n.m101060f(text, "getSearchBox().text");
        String a = C138080b.m224415a(text);
        String str2 = str;
        CharSequence charSequence = str;
        if (str2.regionMatches(true, 0, a.toString(), 0, a.length())) {
            if (str.length() == a.length()) {
                return C47392e.f123115a;
            }
            charSequence = TextUtils.concat(new CharSequence[]{a, str.subSequence(a.length(), str.length())});
        }
        amVar.mo114326d().mo114404f(charSequence);
        C138611m d = amVar.mo114326d();
        d.mo114400a().restartInput(d.mo114401b());
        amVar.mo114326d().mo114406h();
        return C47392e.f123115a;
    }
}
