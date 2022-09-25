package com.google.android.apps.search.googleapp.search.p10415i;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60815aw;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.search.i.al */
/* compiled from: PG */
public final class C137492al {
    /* renamed from: a */
    public static WebResourceResponse m223385a(C60817ay ayVar) {
        String str;
        C60870cx a = C2169h.m6027a(new C137486af(ayVar));
        try {
            C137514p pVar = (C137514p) ((C60815aw) ((C2168g) a).f6144b.get()).mo57270a();
            pVar.getClass();
            int i = pVar.f374021b;
            C137511m mVar = C137511m.UNKNOWN;
            if (C137510l.m223397a(i) == C137511m.REDIRECT) {
                return null;
            }
            int i2 = pVar.f374021b;
            if (TextUtils.isEmpty(pVar.f374022c)) {
                str = "OK";
            } else {
                str = pVar.f374022c;
            }
            return new WebResourceResponse("text/html", "utf-8", i2, str, (Map) Collection.EL.stream(pVar.f374020a.mo54948A()).collect(C58370cn.m89403c(C137487ag.f373953a, C137488ah.f373954a, C137489ai.f373955a)), pVar.f374023d);
        } catch (ExecutionException e) {
            return m223386b(e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            if (!ayVar.mo57281n(true)) {
                try {
                    ((C60815aw) C60856cj.m92909r(a)).f164882a.mo57279k();
                } catch (CancellationException | ExecutionException e3) {
                    return m223386b(e3);
                }
            }
            return m223386b(e2);
        }
    }

    /* renamed from: b */
    private static WebResourceResponse m223386b(Exception exc) {
        return new WebResourceResponse("text/html", "utf-8", new C137491ak(exc));
    }
}
