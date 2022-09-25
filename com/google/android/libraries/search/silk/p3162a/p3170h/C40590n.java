package com.google.android.libraries.search.silk.p3162a.p3170h;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.silk.a.h.n */
/* compiled from: PG */
public final /* synthetic */ class C40590n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C40595s f106529a;

    /* renamed from: b */
    public final /* synthetic */ C39226b f106530b;

    public /* synthetic */ C40590n(C40595s sVar, C39226b bVar) {
        this.f106529a = sVar;
        this.f106530b = bVar;
    }

    public final C60870cx apply(Object obj) {
        return !((Boolean) obj).booleanValue() ? C60856cj.m92899h(new C41742a(C41749b.m73222a("permission_denied", "No permission to access device location."))) : this.f106529a.mo42535a(this.f106530b);
    }
}
