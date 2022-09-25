package com.google.android.apps.search.googleapp.p10117aa;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.aa.aj */
/* compiled from: PG */
public final /* synthetic */ class C133092aj implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C133092aj f362863a = new C133092aj();

    private /* synthetic */ C133092aj() {
    }

    public final Object apply(Object obj) {
        List list = (List) Collection.EL.stream(((C133127l) obj).f362935b).filter(C133093ak.f362864a).filter(C133094al.f362865a).sorted(Comparator.CC.comparing(C133095am.f362866a, C133096an.f362867a)).collect(Collectors.toCollection(C133097ao.f362868a));
        String str = (String) Collection.EL.stream(list).max(Comparator.CC.comparing(C133098ap.f362869a, C133096an.f362867a)).map(C133099aq.f362870a).orElse(BuildConfig.FLAVOR);
        C133126k kVar = (C133126k) C133127l.f362932d.createBuilder();
        kVar.copyOnWrite();
        C133127l lVar = (C133127l) kVar.instance;
        str.getClass();
        lVar.f362934a |= 1;
        lVar.f362936c = str;
        kVar.mo110985a(list);
        return (C133127l) kVar.build();
    }
}
