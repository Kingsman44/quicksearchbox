package com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeoutException;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.b.s */
/* compiled from: PG */
final class C125289s implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C69615a f345630a;

    public C125289s(C69615a aVar) {
        this.f345630a = aVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        C69664n.m101061g(timeoutException, "timeout");
        this.f345630a.mo5672a();
        return C60856cj.m92899h(timeoutException);
    }
}
