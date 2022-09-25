package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26766r;
import java.util.Locale;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.h.e.q */
/* compiled from: PG */
public final /* synthetic */ class C26806q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f73076a;

    public /* synthetic */ C26806q(C26784ai aiVar) {
        this.f73076a = aiVar;
    }

    public final void accept(Object obj) {
        C26784ai aiVar = this.f73076a;
        C26766r rVar = (C26766r) obj;
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = Float.valueOf(aiVar.f73027s.mo31952a());
        objArr[1] = Float.valueOf(aiVar.f73025q.mo31952a());
        objArr[2] = Float.valueOf(aiVar.f73026r.mo31952a());
        objArr[3] = Float.valueOf(aiVar.f73028t.mo31952a());
        objArr[4] = aiVar.f72983K ? "\n".concat(String.valueOf(String.valueOf(aiVar.f72976D))) : BuildConfig.FLAVOR;
        String.format(locale, "Capture ~ Display / Analysis:\n%4.1f~%4.1f/%4.1f %4.1f req/s%s", objArr);
        rVar.mo32134kN();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
