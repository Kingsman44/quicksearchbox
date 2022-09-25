package com.google.android.libraries.search.assistant.p2511d;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.util.concurrent.C60826bg;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.d.b */
/* compiled from: PG */
public final /* synthetic */ class C32539b implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C32541d f87153a;

    /* renamed from: b */
    public final /* synthetic */ Callable f87154b;

    public /* synthetic */ C32539b(C32541d dVar, Callable callable) {
        this.f87153a = dVar;
        this.f87154b = callable;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C32541d dVar = this.f87153a;
        Callable callable = this.f87154b;
        C32540c cVar2 = new C32540c(dVar, callable, cVar);
        cVar.mo5436a(new C32507a(dVar, cVar2), C60826bg.f164896a);
        dVar.f87158a.add(cVar2);
        cVar2.run();
        return callable;
    }
}
