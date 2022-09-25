package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import dagger.p5295b.C68283d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.cy */
/* compiled from: PG */
public final /* synthetic */ class C120267cy implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C68283d f334638a;

    /* renamed from: b */
    public final /* synthetic */ Executor f334639b;

    /* renamed from: c */
    public final /* synthetic */ C68283d f334640c;

    public /* synthetic */ C120267cy(C68283d dVar, Executor executor, C68283d dVar2) {
        this.f334638a = dVar;
        this.f334639b = executor;
        this.f334640c = dVar2;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C68283d dVar = this.f334638a;
        Executor executor = this.f334639b;
        C68283d dVar2 = this.f334640c;
        C60856cj.m92911t(C47633f.m84733g(dVar.mo60297gq()).f164926b, C47810es.m84974n(new C120268cz(cVar)), executor);
        C60856cj.m92911t(C47633f.m84733g(dVar2.mo60297gq()).f164926b, C47810es.m84974n(new C120273da(cVar)), executor);
        cVar.mo5436a(new C120263cu(dVar), executor);
        cVar.mo5436a(new C120264cv(dVar2), executor);
        return "onlineprocessing.allDone";
    }
}
