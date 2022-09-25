package com.google.android.libraries.web.coordinator.internal.fragment;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3420k.C43863i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import dagger.C68214a;
import java.util.ArrayDeque;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class WebCoordinatorInternal {

    /* renamed from: a */
    public final Fragment f114092a;

    /* renamed from: b */
    public final C43269t f114093b;

    /* renamed from: c */
    public final InstanceStateStoreFactory f114094c;

    /* renamed from: d */
    public final C68214a f114095d;

    /* renamed from: e */
    public boolean f114096e;

    /* renamed from: f */
    public final ArrayDeque f114097f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f114098g = new ArrayDeque();

    /* renamed from: h */
    public C43863i f114099h;

    public WebCoordinatorInternal(AccountId accountId, Fragment fragment, C43269t tVar, InstanceStateStoreFactory instanceStateStoreFactory, C68214a aVar, C43748g gVar) {
        Fragment a;
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(tVar, "info");
        C69664n.m101061g(instanceStateStoreFactory, "instanceStateStoreFactory");
        C69664n.m101061g(aVar, "postAttach");
        this.f114092a = fragment;
        this.f114093b = tVar;
        this.f114094c = instanceStateStoreFactory;
        this.f114095d = aVar;
        C69664n.m101061g(fragment, "<this>");
        Bundle arguments = fragment.getArguments();
        if (arguments == null || !arguments.getBoolean("webx-nest-coords")) {
            C69664n.m101061g(fragment, "<this>");
            Fragment parentFragment = fragment.getParentFragment();
            if (!(parentFragment == null || (a = C43757p.m77266a(parentFragment)) == null)) {
                String c = C43757p.m77268c(a);
                Fragment parentFragment2 = a.getParentFragment();
                String name = parentFragment2 != null ? parentFragment2.getClass().getName() : null;
                if (name == null) {
                    name = a.requireHost().getClass().getName();
                    C69664n.m101060f(name, "requireHost()::class.java.name");
                }
                throw new IllegalStateException("A web coordinator cannot be the ancestor of another. Found " + c + " (child of " + name + ") in the ancestors.");
            }
        }
        gVar.mo46781a();
        C43750i iVar = new C43750i(this);
        FragmentManager fragmentManager = fragment.getFragmentManager();
        C69664n.m101058d(fragmentManager);
        fragmentManager.f644k.mo606o(new C43755n(fragment, iVar), false);
        fragment.getLifecycle().mo5790b(new C2376g() {
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x006d, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
                p5462h.p5472e.C69598b.m101013a(r0, r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
                throw r1;
             */
            /* renamed from: gV */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo3520gV(androidx.lifecycle.C2391v r4) {
                /*
                    r3 = this;
                    androidx.lifecycle.o r4 = r4.getLifecycle()
                    r4.mo5791c(r3)
                    com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInternal r4 = com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInternal.this
                    dagger.a r4 = r4.f114095d
                    java.lang.Object r4 = r4.mo27525b()
                    com.google.android.libraries.web.coordinator.internal.fragment.k r4 = (com.google.android.libraries.web.coordinator.internal.fragment.C43752k) r4
                    java.lang.String r0 = "WebCoordinator onCreate"
                    com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)
                    com.google.android.libraries.web.shared.d.f r1 = r4.f114112b     // Catch:{ all -> 0x006b }
                    android.support.v4.app.Fragment r4 = r4.f114111a     // Catch:{ all -> 0x006b }
                    com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInfoInternal r4 = com.google.android.libraries.web.coordinator.internal.fragment.C43749h.m77260a(r4)     // Catch:{ all -> 0x006b }
                    java.util.Set r4 = r4.f114086c     // Catch:{ all -> 0x006b }
                    j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)     // Catch:{ all -> 0x006b }
                    com.google.android.libraries.web.shared.d.b r2 = new com.google.android.libraries.web.shared.d.b     // Catch:{ all -> 0x006b }
                    r2.<init>(r1)     // Catch:{ all -> 0x006b }
                    j$.util.stream.Stream r4 = r4.filter(r2)     // Catch:{ all -> 0x006b }
                    com.google.android.libraries.web.shared.d.c r2 = new com.google.android.libraries.web.shared.d.c     // Catch:{ all -> 0x006b }
                    r2.<init>(r1)     // Catch:{ all -> 0x006b }
                    j$.util.stream.Stream r4 = r4.map(r2)     // Catch:{ all -> 0x006b }
                    com.google.android.libraries.web.shared.d.d r1 = com.google.android.libraries.web.shared.p3444d.C44092d.f114774a     // Catch:{ all -> 0x006b }
                    j$.util.stream.Stream r4 = r4.map(r1)     // Catch:{ all -> 0x006b }
                    com.google.android.libraries.web.shared.d.e r1 = com.google.android.libraries.web.shared.p3444d.C44093e.f114775a     // Catch:{ all -> 0x006b }
                    j$.util.stream.Collector r1 = p3186j$.util.stream.Collectors.toCollection(r1)     // Catch:{ all -> 0x006b }
                    java.lang.Object r4 = r4.collect(r1)     // Catch:{ all -> 0x006b }
                    java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x006b }
                    com.google.common.b.ij r4 = com.google.common.p4522b.C58528ij.m90006F(r4)     // Catch:{ all -> 0x006b }
                    java.lang.String r1 = "webFeatureSetupsProvider.get(fragment)"
                    p5462h.p5473f.p5475b.C69664n.m101060f(r4, r1)     // Catch:{ all -> 0x006b }
                    java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x006b }
                L_0x0056:
                    boolean r1 = r4.hasNext()     // Catch:{ all -> 0x006b }
                    if (r1 == 0) goto L_0x0066
                    java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x006b }
                    com.google.android.libraries.web.shared.contrib.f r1 = (com.google.android.libraries.web.shared.contrib.C44088f) r1     // Catch:{ all -> 0x006b }
                    r1.mo42597g()     // Catch:{ all -> 0x006b }
                    goto L_0x0056
                L_0x0066:
                    r4 = 0
                    p5462h.p5472e.C69598b.m101013a(r0, r4)
                    return
                L_0x006b:
                    r4 = move-exception
                    throw r4     // Catch:{ all -> 0x006d }
                L_0x006d:
                    r1 = move-exception
                    p5462h.p5472e.C69598b.m101013a(r0, r4)
                    goto L_0x0073
                L_0x0072:
                    throw r1
                L_0x0073:
                    goto L_0x0072
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInternal.C437412.mo3520gV(androidx.lifecycle.v):void");
            }

            /* renamed from: gW */
            public final /* synthetic */ void mo3521gW(C2391v vVar) {
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }

    /* renamed from: a */
    public final Fragment mo46774a() {
        C43863i iVar = this.f114099h;
        if (iVar != null) {
            return iVar.f114310a.f114319a;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo46775b(Consumer consumer) {
        C69664n.m101061g(consumer, "runnable");
        C43863i iVar = this.f114099h;
        if (iVar != null) {
            consumer.accept(iVar.f114310a.f114319a);
        } else {
            this.f114098g.add(new C43753l(this, consumer));
        }
    }

    /* renamed from: c */
    public final void mo46776c(Consumer consumer) {
        C69664n.m101061g(consumer, "runnable");
        C43863i iVar = this.f114099h;
        if (iVar != null) {
            consumer.accept(iVar.f114310a.f114319a);
        } else {
            this.f114097f.add(new C43754m(this, consumer));
        }
    }
}
