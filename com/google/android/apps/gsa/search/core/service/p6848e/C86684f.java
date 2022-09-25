package com.google.android.apps.gsa.search.core.service.p6848e;

import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6498ab.p6499a.C84395a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86678c;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88397b;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C89968ag;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.search.core.service.e.f */
/* compiled from: PG */
public final class C86684f implements C91007g {

    /* renamed from: a */
    public final C86686h f234158a;

    /* renamed from: b */
    public final C86679b f234159b;

    /* renamed from: c */
    public final C86683e f234160c;

    /* renamed from: d */
    public final C86678c f234161d;

    /* renamed from: e */
    public final C21370a f234162e;

    /* renamed from: f */
    public final String f234163f;

    /* renamed from: g */
    public volatile Long f234164g = -1L;

    /* renamed from: h */
    public volatile boolean f234165h;

    /* renamed from: i */
    public volatile boolean f234166i;

    /* renamed from: j */
    public final C86124t f234167j;

    /* renamed from: k */
    public final C118827a f234168k;

    /* renamed from: l */
    private final C89911f f234169l;

    public C86684f(C86686h hVar, C86679b bVar, C86683e eVar, C86678c cVar, String str, C21370a aVar, C89911f fVar, C86124t tVar, C118827a aVar2) {
        this.f234158a = hVar;
        this.f234159b = bVar;
        this.f234160c = eVar;
        this.f234161d = cVar;
        this.f234163f = str;
        this.f234162e = aVar;
        this.f234169l = fVar;
        this.f234167j = tVar;
        this.f234168k = aVar2;
        if (tVar.mo79746e(C89968ag.f246516p)) {
            m139627c(str, hVar);
        }
    }

    /* renamed from: c */
    public static void m139627c(String str, C86686h hVar) {
        boolean isAnnotationPresent = hVar.getClass().isAnnotationPresent(C84395a.class);
        if (C88397b.m142808a(str) && !isAnnotationPresent) {
            String simpleName = hVar.getClass().getSimpleName();
            throw new AssertionError("Session type " + str + " is marked as handling untrusted data via method canHandleUntrustedDeeplinkData();this requires that you apply @HandlesUntrustedDeeplinkData annotation to itsSession Controller as well, which is " + simpleName);
        } else if (!C88397b.m142808a(str) && isAnnotationPresent) {
            String simpleName2 = hVar.getClass().getSimpleName();
            throw new AssertionError("SessionController" + simpleName2 + " is marked with the @HandlesUntrustedDeeplinkData annotation; this requires that you ensure canHandleUntrustedDeeplinkData() method returns true for its session type as well.");
        }
    }

    /* renamed from: e */
    private final void m139628e(boolean z, int i, String str, Object... objArr) {
        if (!z) {
            this.f234169l.mo83755a(new IllegalStateException(String.format(str, objArr)), i, 29).mo83721a();
        }
    }

    /* renamed from: a */
    public final void mo80289a(String str) {
        m139628e(this.f234165h, 129873411, "%s called..Session is not started", str);
    }

    /* renamed from: b */
    public final void mo80290b(String str) {
        boolean z = this.f234166i;
        m139628e(!z, 129872165, "%s called..Session with sessionId = %s is already destroyed", str, this.f234164g);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85287n(this.f234158a);
    }
}
