package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ag */
/* compiled from: PG */
public final /* synthetic */ class C131954ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131958ak f360278a;

    /* renamed from: b */
    public final /* synthetic */ String f360279b;

    /* renamed from: c */
    public final /* synthetic */ Function f360280c;

    public /* synthetic */ C131954ag(C131958ak akVar, String str, Function function) {
        this.f360278a = akVar;
        this.f360279b = str;
        this.f360280c = function;
    }

    public final C60870cx apply(Object obj) {
        C131958ak akVar = this.f360278a;
        return C47633f.m84733g(C60856cj.m92896e((C58485gu) Collection.EL.stream((C58528ij) obj).filter(new C131955ah(this.f360279b)).map(new C131956ai(akVar)).collect(C58370cn.f155946a))).mo51515h(new C131957aj(this.f360280c), akVar.f360284a);
    }
}
