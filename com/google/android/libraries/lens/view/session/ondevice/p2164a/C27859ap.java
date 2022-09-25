package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2024d.C24293a;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.lens.p4701g.C62331d;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C27859ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C27877bg f75938a;

    public /* synthetic */ C27859ap(C27877bg bgVar) {
        this.f75938a = bgVar;
    }

    public final C60870cx apply(Object obj) {
        C27877bg bgVar = this.f75938a;
        C58833ax b = ((C27851ah) obj).mo33331b();
        if (!b.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("Failed to get cascade configuration"));
        }
        C62331d d = ((C27891h) b.mo56107c()).mo33347d();
        C24795f b2 = ((C27891h) b.mo56107c()).mo33345b();
        if (!bgVar.f75980f.mo56113h() || !((C27891h) bgVar.f75980f.mo56107c()).mo33347d().equals(d) || !((C27891h) bgVar.f75980f.mo56107c()).mo33345b().equals(b2)) {
            bgVar.f75980f = b;
            ((C58970a) ((C58970a) C27877bg.f75975a.mo56224b()).mo56372aa(50035)).mo56389s("Loading cascade engine: %s", d);
            C60870cx c = bgVar.f75976b.mo30021c(d, b2);
            C27876bf bfVar = new C27876bf(bgVar, b2);
            C60856cj.m92911t(c, C47810es.m84974n(bfVar), C60826bg.f164896a);
            return c;
        }
        ((C58970a) ((C58970a) C27877bg.f75975a.mo56224b()).mo56372aa(50036)).mo56386p("Trying to load the same cascade and config twice. Skipped.");
        return C60856cj.m92900i(new C24293a(((C27891h) b.mo56107c()).mo33347d()));
    }
}
