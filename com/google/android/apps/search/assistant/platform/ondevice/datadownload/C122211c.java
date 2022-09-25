package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.c */
/* compiled from: PG */
public final /* synthetic */ class C122211c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122165am f338919a;

    /* renamed from: b */
    public final /* synthetic */ Locale f338920b;

    public /* synthetic */ C122211c(C122165am amVar, Locale locale) {
        this.f338919a = amVar;
        this.f338920b = locale;
    }

    public final C60870cx apply(Object obj) {
        return C60856cj.m92896e((Iterable) Collection.EL.stream((C58485gu) obj).map(new C122163ak(this.f338919a, this.f338920b)).collect(C58370cn.f155946a));
    }
}
