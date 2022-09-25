package com.google.frameworks.client.data.android.p4632a;

import com.google.frameworks.client.data.android.p4641h.C61481b;
import java.util.Set;
import java.util.concurrent.Callable;
import p5488io.grpc.C70846h;

/* renamed from: com.google.frameworks.client.data.android.a.b */
/* compiled from: PG */
public final /* synthetic */ class C61341b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C61481b f165887a;

    /* renamed from: b */
    public final /* synthetic */ C61343d f165888b;

    /* renamed from: c */
    public final /* synthetic */ C61333a f165889c;

    /* renamed from: d */
    public final /* synthetic */ Set f165890d;

    public /* synthetic */ C61341b(C61481b bVar, C61343d dVar, C61333a aVar, Set set) {
        this.f165887a = bVar;
        this.f165888b = dVar;
        this.f165889c = aVar;
        this.f165890d = set;
    }

    public final Object call() {
        C61481b bVar = this.f165887a;
        C61343d dVar = this.f165888b;
        C61333a aVar = this.f165889c;
        Set set = this.f165890d;
        C70846h hVar = C61342c.f165891a;
        if (((Boolean) bVar.f166236b.mo62571g(C61342c.f165891a)).booleanValue()) {
            return dVar.mo57911a(aVar, set);
        }
        return dVar.mo57912b(aVar, set);
    }
}
