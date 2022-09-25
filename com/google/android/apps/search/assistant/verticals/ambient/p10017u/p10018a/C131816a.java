package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131815a;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131836h;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131837i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p4016z.C53686ak;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayDeque;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.a */
/* compiled from: PG */
public final class C131816a implements C131837i {

    /* renamed from: a */
    private final C21370a f360014a;

    /* renamed from: b */
    private final ArrayDeque f360015b = new ArrayDeque();

    public C131816a(C21370a aVar) {
        this.f360014a = aVar;
    }

    /* renamed from: a */
    public final C131836h mo110317a() {
        C131815a aVar = new C131815a();
        aVar.mo110316d();
        aVar.mo110315c(false);
        aVar.mo110314b(false);
        return aVar.mo110313a();
    }

    /* renamed from: b */
    public final synchronized C60870cx mo110318b(String str) {
        if ("<in memory>".equals(str)) {
        } else {
            throw new IllegalArgumentException(String.format("Unknown trace name %s", new Object[]{str}));
        }
        return C60856cj.m92900i(C58485gu.m89842j(this.f360015b));
    }

    /* renamed from: c */
    public final C60870cx mo110319c() {
        return C60856cj.m92900i(C58485gu.m89846n("<in memory>"));
    }

    /* renamed from: d */
    public final synchronized Duration mo110320d() {
        if (this.f360015b.isEmpty()) {
            return Duration.ZERO;
        }
        C63042fg fgVar = ((C53686ak) this.f360015b.getFirst()).f140918d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        return Duration.between(Instant.ofEpochMilli(C62953e.m95478c(fgVar)), Instant.ofEpochMilli(this.f360014a.mo26870b()));
    }

    /* renamed from: e */
    public final synchronized void mo110321e(C53686ak akVar) {
        if (this.f360015b.size() == 100) {
            this.f360015b.removeFirst();
        }
        this.f360015b.addLast(akVar);
    }
}
