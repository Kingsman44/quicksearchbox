package com.google.android.apps.search.googleapp.search.srp.p10438h.p10439a;

import android.net.Uri;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10412h.C137469b;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.p10420k.C137546e;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.libraries.web.contrib.logging.C43712o;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.coordinator.C43737c;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.h.a.e */
/* compiled from: PG */
public final class C137860e implements C43712o {

    /* renamed from: a */
    private final C137859d f375089a;

    /* renamed from: b */
    private final C46401p f375090b;

    /* renamed from: c */
    private final C137546e f375091c;

    /* renamed from: d */
    private final C137857b f375092d;

    /* renamed from: e */
    private final boolean f375093e;

    /* renamed from: f */
    private final C43737c f375094f;

    public C137860e(C137859d dVar, C44077a aVar, C137546e eVar, C137857b bVar, C43737c cVar, boolean z) {
        this.f375089a = dVar;
        this.f375090b = aVar.f114747a.mo50325a("search_query_name", C137542d.f374085g);
        this.f375091c = eVar;
        this.f375092d = bVar;
        this.f375094f = cVar;
        this.f375093e = z;
    }

    /* renamed from: b */
    private final C137542d m224145b() {
        if (this.f375093e) {
            return ((C137543b) this.f375094f.mo5768a()).mo113804a();
        }
        C46370ah a = this.f375090b.mo50378a(C62912at.f169862a);
        if (a == null) {
            return null;
        }
        return (C137542d) a.f121384a;
    }

    /* renamed from: a */
    public final C43713p mo32339a(C43367l lVar) {
        C43366k kVar = C43366k.UNSPECIFIED;
        C43366k a = C43366k.m76517a(lVar.f113299e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                C137542d b = m224145b();
                if (b == null) {
                    return null;
                }
                int a2 = C137540b.m223424a(b.f374088b);
                if (a2 == 0 || a2 != 11) {
                    return this.f375089a.mo114012a(b);
                }
                C137469b bVar = (C137469b) this.f375092d.f375074a.mo17428b();
                bVar.getClass();
                return new C137856a(b, bVar);
            } else if (ordinal != 5) {
                return null;
            }
        }
        Uri parse = Uri.parse(lVar.f113296b);
        if (parse.isOpaque()) {
            return null;
        }
        C137542d b2 = m224145b();
        C137542d c = this.f375091c.mo113808c(parse, 5, parse.getBooleanQueryParameter("cs", false));
        if (b2 == null || c == null) {
            return null;
        }
        C137418g gVar = c.f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        String trim = gVar.f373770b.trim();
        C137418g gVar2 = b2.f374092f;
        if (gVar2 == null) {
            gVar2 = C137418g.f373767r;
        }
        if (trim.equals(gVar2.f373770b.trim())) {
            C137418g gVar3 = c.f374092f;
            if (gVar3 == null) {
                gVar3 = C137418g.f373767r;
            }
            String str = gVar3.f373771c;
            C137418g gVar4 = b2.f374092f;
            if (gVar4 == null) {
                gVar4 = C137418g.f373767r;
            }
            if (str.equals(gVar4.f373771c)) {
                return null;
            }
        }
        if (this.f375093e) {
            ((C137543b) this.f375094f.mo5768a()).mo113805b(c);
        } else {
            this.f375090b.mo50381d(C62912at.f169862a, c);
        }
        return this.f375089a.mo114012a(c);
    }
}
