package com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a;

import android.text.TextUtils;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138716b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.a.l */
/* compiled from: PG */
public final /* synthetic */ class C138878l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f377752a;

    /* renamed from: b */
    public final /* synthetic */ String f377753b;

    public /* synthetic */ C138878l(String str, String str2) {
        this.f377752a = str;
        this.f377753b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f377752a;
        String str2 = this.f377753b;
        C138716b bVar = (C138716b) obj;
        C58495hd b = bVar.mo114497b();
        String str3 = (String) b.get(bVar.mo114498c());
        Stream stream = Collection.EL.stream(bVar.mo114496a());
        Objects.requireNonNull(b);
        C58485gu guVar = (C58485gu) stream.filter(new C138867a(b)).map(new C138871e(b)).collect(C58370cn.f155946a);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str);
            sb.append(str3);
        }
        if (!guVar.isEmpty()) {
            sb.append(" ");
            sb.append(str2);
            sb.append((String) Collection.EL.stream(guVar).map(C138872f.f377744a).collect(Collectors.joining(", ")));
        }
        return sb.toString();
    }
}
