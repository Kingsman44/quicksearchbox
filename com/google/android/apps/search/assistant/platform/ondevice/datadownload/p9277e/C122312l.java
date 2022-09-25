package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.l */
/* compiled from: PG */
public final /* synthetic */ class C122312l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122314n f339164a;

    /* renamed from: b */
    public final /* synthetic */ Optional f339165b;

    /* renamed from: c */
    public final /* synthetic */ Locale f339166c;

    /* renamed from: d */
    public final /* synthetic */ String f339167d;

    public /* synthetic */ C122312l(C122314n nVar, Optional optional, Locale locale, String str) {
        this.f339164a = nVar;
        this.f339165b = optional;
        this.f339166c = locale;
        this.f339167d = str;
    }

    public final Object apply(Object obj) {
        return (C58485gu) Collection.EL.stream((List) obj).map(new C122306f(this.f339164a, this.f339165b, this.f339166c, this.f339167d)).collect(C58370cn.f155946a);
    }
}
