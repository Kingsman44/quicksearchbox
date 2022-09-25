package com.google.android.libraries.gsa.monet.internal.service;

import com.google.android.libraries.gsa.monet.internal.shared.C23045j;
import com.google.android.libraries.gsa.monet.service.C23050a;
import com.google.android.libraries.gsa.monet.service.C23055f;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23086b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.b */
/* compiled from: PG */
public final class C23006b implements C23045j {

    /* renamed from: a */
    private final C23055f f63279a;

    /* renamed from: b */
    private final C23084ao f63280b;

    /* renamed from: c */
    private final Map f63281c = new HashMap();

    public C23006b(C23055f fVar, C23084ao aoVar) {
        this.f63279a = fVar;
        this.f63280b = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C23086b mo28395a(String str) {
        this.f63280b.mo28328a();
        C23050a aVar = (C23050a) this.f63281c.get(str);
        if (aVar == null && (aVar = this.f63279a.mo28492a(str)) != null) {
            this.f63281c.put(str, aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo28396b(String str, C23086b bVar) {
        this.f63280b.mo28328a();
        this.f63281c.put(str, (C23050a) bVar);
    }

    /* renamed from: c */
    public final void mo28397c(String str) {
        this.f63280b.mo28328a();
        this.f63281c.remove(str);
    }
}
