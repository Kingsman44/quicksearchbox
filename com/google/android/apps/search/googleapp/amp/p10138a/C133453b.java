package com.google.android.apps.search.googleapp.amp.p10138a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.amp.a.b */
/* compiled from: PG */
public final /* synthetic */ class C133453b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C133453b f363650a = new C133453b();

    private /* synthetic */ C133453b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        C133455d dVar = (C133455d) obj;
        C58528ij ijVar = C133456e.f363652a;
        String encodedFragment = dVar.mo111157a().getEncodedFragment();
        if (encodedFragment == null) {
            optional = Optional.empty();
        } else {
            String queryParameter = new Uri.Builder().encodedQuery(encodedFragment).build().getQueryParameter("ampshare");
            if (TextUtils.isEmpty(queryParameter)) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(Uri.parse(queryParameter));
            }
        }
        Uri.Builder clearQuery = Uri.parse((true != dVar.mo111159c() ? "http://" : "https://").concat(String.valueOf(dVar.mo111158b()))).buildUpon().encodedFragment((String) null).clearQuery();
        String encodedQuery = dVar.mo111157a().getEncodedQuery();
        if (encodedQuery != null) {
            clearQuery.encodedQuery((String) DesugarArrays.stream((T[]) encodedQuery.split("&", -1)).filter(C133454c.f363651a).collect(Collectors.joining("&")));
        }
        return (Uri) optional.orElse(clearQuery.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
