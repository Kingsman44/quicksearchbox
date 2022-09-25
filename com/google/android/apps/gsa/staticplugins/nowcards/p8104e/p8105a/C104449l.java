package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a.l */
/* compiled from: PG */
public final class C104449l implements C23113i {

    /* renamed from: a */
    private final C104447j f290573a;

    public C104449l(C104447j jVar) {
        this.f290573a = jVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("CardEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("reportAdView_java.lang.String_int_int")) {
                String string = pVar.f63472a.getString("url");
                string.getClass();
                this.f290573a.mo94181f(string, Integer.valueOf(pVar.f63472a.getInt("durationMs")).intValue(), Integer.valueOf(pVar.f63472a.getInt("index")).intValue());
            }
        }
    }
}
