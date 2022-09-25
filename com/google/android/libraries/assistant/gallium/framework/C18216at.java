package com.google.android.libraries.assistant.gallium.framework;

import com.google.protos.p5127o.C65686l;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.at */
/* compiled from: PG */
final class C18216at {

    /* renamed from: a */
    public final Map f51739a = new HashMap();

    /* renamed from: b */
    public final Set f51740b;

    public C18216at(Set set) {
        this.f51740b = new LinkedHashSet(set);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C18206aj mo23696a(C65686l lVar, Long l) {
        Map map;
        if (this.f51739a.containsKey(l)) {
            map = (Map) this.f51739a.get(l);
            if (map.containsKey(lVar)) {
            } else {
                throw C18218av.m35478a(9, String.format("Should not happen! Unexpected scoping error: Span %d does not have a registered provider for interface %s.", new Object[]{l, lVar.f178473b}));
            }
        } else {
            throw C18218av.m35478a(9, String.format("Scoping error: Span %d is not registered on request to interface %s. There are two possible causes: An incorrect span id is given, or the span-scoped interface being called is destroyed which can be expected due to lifecycle mismatch (e.g. A Java span scope is destroyed as part of future cancellation but C++ code is still running and tries to call a Java interface.)", new Object[]{l, lVar.f178473b}));
        }
        return (C18206aj) map.get(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C18216at clone() {
        return new C18216at(this.f51740b);
    }

    /* renamed from: c */
    public final synchronized void mo23698c(long j) {
        this.f51739a.remove(Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo23700d(C65686l lVar) {
        return this.f51740b.contains(lVar);
    }
}
