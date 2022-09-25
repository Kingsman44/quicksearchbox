package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113302c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.common.p4522b.C58370cn;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import java.util.List;
import java.util.regex.Pattern;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.bs */
/* compiled from: PG */
public final class C113161bs {

    /* renamed from: a */
    private static final Pattern f313478a = Pattern.compile("<(/?b)>");

    /* renamed from: a */
    public static C113408es m187175a(C54229ar arVar, Function function) {
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d((List) Collection.EL.stream(arVar.f142355b).filter(C113160br.f313477a).limit(5).map(function).collect(C58370cn.f155946a))));
        ((C113302c) p).f313769a = Optional.m71637of(arVar);
        return p.mo100091a();
    }

    /* renamed from: b */
    public static String m187176b(String str) {
        return f313478a.matcher(str).replaceAll(BuildConfig.FLAVOR);
    }
}
