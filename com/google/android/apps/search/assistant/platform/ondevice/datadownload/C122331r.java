package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.r */
/* compiled from: PG */
public final /* synthetic */ class C122331r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122165am f339200a;

    /* renamed from: b */
    public final /* synthetic */ Locale f339201b;

    public /* synthetic */ C122331r(C122165am amVar, Locale locale) {
        this.f339200a = amVar;
        this.f339201b = locale;
    }

    public final C60870cx apply(Object obj) {
        return C60856cj.m92896e((Iterable) Collection.EL.stream((C58485gu) obj).filter(C122160ah.f338829a).map(new C122161ai(this.f339200a, this.f339201b)).collect(C58370cn.f155946a));
    }
}
