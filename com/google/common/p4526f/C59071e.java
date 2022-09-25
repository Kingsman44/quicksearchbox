package com.google.common.p4526f;

import com.google.common.p4526f.p4528b.C59011af;
import com.google.common.p4526f.p4528b.C59033h;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.logging.Level;

/* renamed from: com.google.common.f.e */
/* compiled from: PG */
public final class C59071e extends C58969a {

    /* renamed from: b */
    public static final C59072a f157037b = new C59072a();

    /* renamed from: com.google.common.f.e$a */
    /* compiled from: PG */
    final class C59072a extends C59079f implements C59052c {
    }

    public C59071e(C59033h hVar) {
        super(hVar);
    }

    /* renamed from: h */
    public static C59071e m91331h() {
        return new C59071e(C59011af.m91225d(C59011af.m91227g().mo56253b(C59071e.class)));
    }

    @Deprecated
    /* renamed from: i */
    public static C59071e m91332i(String str) {
        C59081b.m91350b(!str.isEmpty(), "injected class name is empty");
        return new C59071e(C59011af.m91225d(str.replace('/', '.')));
    }

    /* renamed from: g */
    public final C59052c mo56223a(Level level) {
        boolean f = mo56227f(level);
        boolean n = C59011af.m91231n(this.f156823a.mo56247d(), level, f);
        return (f || n) ? new C59065d(this, level, n) : f157037b;
    }
}
