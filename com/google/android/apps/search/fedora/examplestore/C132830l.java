package com.google.android.apps.search.fedora.examplestore;

import com.google.android.apps.search.fedora.p10093b.C132722c;
import com.google.android.gms.learning.C144581d;
import com.google.android.gms.learning.internal.C144771c;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19405i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.fedora.examplestore.l */
/* compiled from: PG */
final class C132830l implements C144581d {

    /* renamed from: a */
    public static final C59071e f362427a = C59071e.m91332i("com.google.android.apps.search.fedora.examplestore.l");

    /* renamed from: b */
    public final C19405i f362428b;

    /* renamed from: c */
    private final Executor f362429c;

    public C132830l(C19405i iVar, Executor executor) {
        this.f362428b = iVar;
        this.f362429c = executor;
    }

    /* renamed from: a */
    public final void mo92061a(int i) {
        C132722c b = C132722c.m215733b(this.f362428b.mo24599c());
        C132827i iVar = new C132827i(i);
        C60856cj.m92911t(b.f362147a.f164926b, C47810es.m84974n(iVar), this.f362429c);
    }

    /* renamed from: b */
    public final void mo92062b(C144771c cVar) {
        C132722c c = C132722c.m215733b(this.f362428b.mo24597a()).mo110894c(new C132828j(cVar), this.f362429c);
        C132829k kVar = new C132829k(cVar);
        C60856cj.m92911t(c.f362147a.f164926b, C47810es.m84974n(kVar), this.f362429c);
    }

    public final void close() {
        try {
            this.f362428b.close();
        } catch (Exception e) {
            C59104x c = f362427a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaExampleStoreItr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(39837)).mo56389s("Failed to close the adapter : %s", this.f362428b);
        }
    }
}
