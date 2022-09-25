package com.google.android.libraries.search.silk.web.core;

import com.google.android.libraries.web.contrib.requestupdate.internal.RequestUpdateWebFragmentObserver;
import com.google.android.libraries.web.p3416i.C43807a;
import com.google.android.libraries.web.shared.contrib.C44085c;
import com.google.android.libraries.web.shared.contrib.WebFeature;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.core.l */
/* compiled from: PG */
public final class C40758l {

    /* renamed from: a */
    public final boolean f106861a;

    public C40758l(boolean z) {
        this.f106861a = z;
    }

    /* renamed from: a */
    public final WebFeature mo42702a(C40757k kVar) {
        if (!this.f106861a) {
            return new AutoValue_SilkCoreFeature(new C44085c().mo47056a(), new ProtoParsers.InternalDontUse((byte[]) null, kVar));
        }
        C44085c cVar = new C44085c();
        cVar.mo47057b(C43807a.class, C40749c.class);
        cVar.f114767d.add(RequestUpdateWebFragmentObserver.class);
        return new AutoValue_SilkCoreFeature(cVar.mo47056a(), new ProtoParsers.InternalDontUse((byte[]) null, kVar));
    }
}
