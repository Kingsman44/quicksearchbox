package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17083b;
import com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17093l;
import com.google.android.libraries.assistant.p1363c.p1371b.p1376d.C17094m;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.y */
/* compiled from: PG */
public final /* synthetic */ class C122373y implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C122373y f339282a = new C122373y();

    private /* synthetic */ C122373y() {
    }

    public final void accept(Object obj) {
        C17093l a;
        C17094m mVar = (C17094m) obj;
        synchronized (mVar.f49753f) {
            C70868g gVar = (C70868g) mVar.f49754g.orElseThrow(C17083b.f49727a);
            if (!mVar.f49756i) {
                mVar.f49756i = true;
                mVar.f49758k = true;
                gVar.mo62579e("Client requested cancellation");
                a = mVar.mo23184a();
            } else {
                throw new IllegalStateException("The download was already initialized.");
            }
        }
        synchronized (mVar.f49750c) {
            mVar.f49751d.accept(a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
