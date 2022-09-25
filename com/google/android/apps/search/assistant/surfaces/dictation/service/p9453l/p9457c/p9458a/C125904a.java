package com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.p9457c.p9458a;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125094bv;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9453l.C125909d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126337n;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.frameworks.client.data.android.p4634b.C61390i;
import com.google.frameworks.client.data.android.p4634b.C61391j;
import com.google.frameworks.client.data.android.p4634b.C61392k;
import com.google.frameworks.client.data.android.p4634b.C61393l;
import java.net.URI;
import java.util.Set;
import p5488io.grpc.binder.C70175a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.l.c.a.a */
/* compiled from: PG */
public final class C125904a {

    /* renamed from: a */
    private final URI f346985a;

    /* renamed from: b */
    private final C125909d f346986b;

    /* renamed from: c */
    private final Object f346987c = new Object();

    /* renamed from: d */
    private final C61393l f346988d;

    public C125904a(C61393l lVar, URI uri, C125909d dVar) {
        this.f346988d = lVar;
        this.f346985a = uri;
        this.f346986b = dVar;
    }

    /* renamed from: a */
    public final void mo107160a(C125094bv bvVar) {
        if (!this.f346986b.mo107163b(bvVar.f345094a)) {
            String str = bvVar.f345094a;
            throw new C126337n("Bad package name: '" + str + "'");
        } else if (!bvVar.f345095b.isEmpty()) {
            synchronized (this.f346987c) {
                String str2 = bvVar.f345094a;
                C61393l lVar = this.f346988d;
                URI uri = this.f346985a;
                C70175a c = C70175a.m102188c(str2, bvVar.f345095b);
                C58838bb.m90879n(lVar.f166007a.equals(uri.getScheme()), "Scheme mis-match for %s. Expected %s", uri, lVar.f166007a);
                C61390i b = lVar.mo57974b(uri);
                synchronized (b) {
                    if (!C58832aw.m90831a(b.f166000b, c)) {
                        b.f166000b = c;
                        Set<C61392k> set = b.f165999a;
                        for (C61392k kVar : set) {
                            kVar.f166003a.mo62446c(new C61391j(kVar, c));
                        }
                        for (C61392k kVar2 : set) {
                            kVar2.f166003a.mo62445b();
                        }
                    }
                }
            }
        } else {
            throw new C126337n("Empty service name.");
        }
    }
}
