package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.tracing.C47822fd;
import com.google.apps.tiktok.tracing.C47865y;
import com.google.common.base.C58817ah;
import java.util.concurrent.TimeoutException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bc */
/* compiled from: PG */
final class C46936bc implements C58817ah {

    /* renamed from: a */
    public static final C46936bc f122422a = new C46936bc();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        C69664n.m101061g(timeoutException, "it");
        Throwable cause = timeoutException.getCause();
        C47865y.m85085a(cause);
        throw C47822fd.m84995a(cause);
    }
}
