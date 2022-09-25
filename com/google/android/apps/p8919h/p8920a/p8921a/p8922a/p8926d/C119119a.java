package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8926d;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119127i;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119130l;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a.C119083h;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4638e.C61412g;
import p5285d.p5290b.p5291a.p5292a.C68154aq;
import p5285d.p5290b.p5291a.p5292a.C68155ar;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.h.a.a.a.d.a */
/* compiled from: PG */
public final class C119119a {
    /* renamed from: a */
    public static C119127i m197825a(C68154aq aqVar, C68155ar arVar, String str, Context context, C119083h hVar) {
        C70334de deVar = new C70334de();
        deVar.mo62033h(new C70290cs("X-Android-Cert", C70334de.f187481c), BuildConfig.FLAVOR);
        deVar.mo62033h(new C70290cs("X-Android-Package", C70334de.f187481c), context.getPackageName());
        deVar.mo62033h(new C70290cs("X-Goog-Api-Key", C70334de.f187481c), str);
        return new C119130l((C68155ar) ((C68155ar) arVar.mo62576o(new C70879r(deVar))).mo62577p(C61409d.f166071a, new C61412g()), (C68154aq) ((C68154aq) aqVar.mo62576o(new C70879r(deVar))).mo62577p(C61409d.f166071a, new C61412g()));
    }
}
