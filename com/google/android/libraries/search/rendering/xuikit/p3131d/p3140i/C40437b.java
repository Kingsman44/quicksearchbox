package com.google.android.libraries.search.rendering.xuikit.p3131d.p3140i;

import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.elements.interfaces.ValidationResult;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57793y;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57794z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4746a.C62882a;
import java.util.LinkedHashSet;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.i.b */
/* compiled from: PG */
public final class C40437b extends ResourceLoaderDelegate {

    /* renamed from: a */
    private final C40358k f106148a;

    /* renamed from: b */
    private final Set f106149b = new LinkedHashSet();

    public C40437b(C40358k kVar) {
        C69664n.m101061g(kVar, "counters");
        this.f106148a = kVar;
    }

    public final void onAttemptedToCacheResource(String str, ValidationResult validationResult, Status status) {
        C69664n.m101061g(str, "identifier");
        C69664n.m101061g(validationResult, "validationResult");
        C69664n.m101061g(status, "status");
        validationResult.ordinal();
        status.getCode().ordinal();
    }

    public final void onMissingCacheDependency(String str) {
        C69664n.m101061g(str, "identifier");
    }

    public final void onResourceCachePrepared(String str, Status status) {
        C69664n.m101061g(str, "identifier");
        C69664n.m101061g(status, "status");
        status.getCode().ordinal();
    }

    public final void onResourceProcessed(String str, ValidationResult validationResult, Status status) {
        C69664n.m101061g(str, "identifier");
        C69664n.m101061g(validationResult, "validationResult");
        C69664n.m101061g(status, "status");
        this.f106148a.mo42417d("Runtime.ResourceLoaderDelegate.OnResourceProcessed", validationResult.ordinal());
        validationResult.ordinal();
        status.getCode().ordinal();
    }

    public final void onServingContextUpdated(byte[] bArr) {
        C69664n.m101061g(bArr, "newServingContext");
        if (bArr.length != 0) {
            C57793y yVar = (C57793y) C57794z.f154407c.createBuilder();
            C69664n.m101060f(yVar, "newBuilder()");
            C69664n.m101061g(yVar, "builder");
            C63088z a = C62882a.m94955a(bArr);
            yVar.copyOnWrite();
            C57794z zVar = (C57794z) yVar.instance;
            zVar.f154409a |= 1;
            zVar.f154410b = a;
            C62942bv build = yVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C57794z zVar2 = (C57794z) build;
        }
        for (C40436a a2 : this.f106149b) {
            a2.mo42434a();
        }
    }
}
