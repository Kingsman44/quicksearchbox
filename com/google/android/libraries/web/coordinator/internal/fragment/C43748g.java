package com.google.android.libraries.web.coordinator.internal.fragment;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.profile.C44075j;
import java.util.Map;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.internal.fragment.g */
/* compiled from: PG */
public final class C43748g {

    /* renamed from: a */
    private final Fragment f114104a;

    /* renamed from: b */
    private final C43743b f114105b;

    /* renamed from: c */
    private final Optional f114106c;

    /* renamed from: d */
    private final C44075j f114107d;

    /* renamed from: e */
    private final Map f114108e;

    public C43748g(Fragment fragment, C43743b bVar, Optional optional, C44075j jVar, Map map) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(bVar, "idGenerator");
        C69664n.m101061g(optional, "testWebImplementationOverride");
        this.f114104a = fragment;
        this.f114105b = bVar;
        this.f114106c = optional;
        this.f114107d = jVar;
        this.f114108e = map;
        if (!C43757p.m77270e(fragment)) {
            throw new IllegalStateException("WebCoordinatorInfoProvider should only be used by a coordinator fragment, found " + fragment + ".");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInfoInternal mo46781a() {
        /*
            r9 = this;
            android.support.v4.app.Fragment r0 = r9.f114104a
            android.os.Bundle r0 = r0.getArguments()
            java.lang.String r1 = "webx-coordinator-info"
            if (r0 != 0) goto L_0x000c
            r0 = 0
            goto L_0x0012
        L_0x000c:
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInfoInternal r0 = (com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInfoInternal) r0
        L_0x0012:
            if (r0 != 0) goto L_0x00ac
            android.support.v4.app.Fragment r0 = r9.f114104a
            android.os.Bundle r0 = r0.getArguments()
            if (r0 == 0) goto L_0x0059
            java.lang.String r2 = "webx-coordinator-confac"
            java.lang.String r2 = r0.getString(r2)
            if (r2 == 0) goto L_0x0045
            java.util.Map r0 = r9.f114108e
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0039
            g.a.a r0 = (p5460g.p5461a.C69464a) r0
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.libraries.web.b.a r0 = (com.google.android.libraries.web.p3345b.C43229a) r0
            com.google.android.libraries.web.base.WebConfig r0 = r0.mo46279a()
            goto L_0x0062
        L_0x0039:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = " must be annotated with @WebConfigInjectable."
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0045:
            java.lang.String r2 = "webx-coordinator-config"
            android.os.Parcelable r3 = r0.getParcelable(r2)
            com.google.android.libraries.web.base.WebConfig r3 = (com.google.android.libraries.web.base.WebConfig) r3
            if (r3 == 0) goto L_0x0059
            r0.remove(r2)
            android.support.v4.app.Fragment r2 = r9.f114104a
            r2.setArguments(r0)
            r5 = r3
            goto L_0x0063
        L_0x0059:
            com.google.android.libraries.web.base.j r0 = new com.google.android.libraries.web.base.j
            r0.<init>()
            com.google.android.libraries.web.base.WebConfig r0 = r0.mo46371a()
        L_0x0062:
            r5 = r0
        L_0x0063:
            com.google.android.libraries.web.profile.j r0 = r9.f114107d
            j$.util.Optional r2 = r9.f114106c
            com.google.android.libraries.web.coordinator.internal.fragment.f r3 = new com.google.android.libraries.web.coordinator.internal.fragment.f
            r3.<init>(r5)
            java.lang.Object r2 = r2.orElseGet(r3)
            java.lang.String r3 = "WebConfig.pickWebImpleme…_WEB_IMPLEMENTATION\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.libraries.web.base.v r2 = (com.google.android.libraries.web.base.C43271v) r2
            com.google.android.libraries.web.profile.Profile r6 = r0.mo47043a(r2)
            com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInfoInternal r0 = new com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInfoInternal
            com.google.android.libraries.web.coordinator.internal.fragment.b r2 = r9.f114105b
            java.util.concurrent.atomic.AtomicLong r2 = r2.f114101a
            long r3 = r2.incrementAndGet()
            boolean r2 = r5.f112963b
            r7 = 1
            if (r2 != 0) goto L_0x0093
            com.google.android.libraries.web.base.v r2 = r6.f114484b
            com.google.android.libraries.web.base.v r8 = com.google.android.libraries.web.base.C43271v.WEB_VIEW
            if (r2 != r8) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r2 = 0
            r7 = 0
        L_0x0093:
            r2 = r0
            r2.<init>(r3, r5, r6, r7)
            android.support.v4.app.Fragment r2 = r9.f114104a
            android.os.Bundle r2 = r2.getArguments()
            if (r2 != 0) goto L_0x00a4
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x00a4:
            r2.putParcelable(r1, r0)
            android.support.v4.app.Fragment r1 = r9.f114104a
            r1.setArguments(r2)
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.coordinator.internal.fragment.C43748g.mo46781a():com.google.android.libraries.web.coordinator.internal.fragment.WebCoordinatorInfoInternal");
    }
}
