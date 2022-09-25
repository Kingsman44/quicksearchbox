package com.google.p386ak.p388b.p392c;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: com.google.ak.b.c.f */
/* compiled from: PG */
final class C8357f extends C8266aa {

    /* renamed from: a */
    static final C8267ab f29185a = new C8356e();

    /* renamed from: b */
    private final C8266aa f29186b;

    public C8357f(C8266aa aaVar) {
        this.f29186b = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        Date date = (Date) this.f29186b.mo17029a(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        this.f29186b.mo17030b(cVar, (Timestamp) obj);
    }
}
