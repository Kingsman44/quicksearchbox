package com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40482s;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.h.n */
/* compiled from: PG */
public final class C40428n extends FaultObserver {

    /* renamed from: a */
    final /* synthetic */ C40432r f106118a;

    /* renamed from: b */
    final /* synthetic */ C40433s f106119b;

    public C40428n(C40432r rVar, C40433s sVar) {
        this.f106118a = rVar;
        this.f106119b = sVar;
    }

    public final Status storeDidFault(ByteStore byteStore, String str) {
        C69664n.m101061g(str, "key");
        if (!C69764m.m101234m(str, this.f106118a.f106128b)) {
            Status status = Status.f186902OK;
            C69664n.m101060f(status, "OK");
            return status;
        }
        C40433s sVar = this.f106119b;
        C40482s.m70199a(sVar.f106141d, "PersistentByteStoreInstaller", new String[]{"storeDidFault"}, new C40427m(this.f106118a, sVar, str));
        Status status2 = Status.f186902OK;
        C69664n.m101060f(status2, "OK");
        return status2;
    }
}
