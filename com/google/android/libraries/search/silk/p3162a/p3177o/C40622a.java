package com.google.android.libraries.search.silk.p3162a.p3177o;

import com.google.android.libraries.silk.p3205a.p3231t.C41734a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4315t.C56821b;

/* renamed from: com.google.android.libraries.search.silk.a.o.a */
/* compiled from: PG */
public final class C40622a implements C41734a {

    /* renamed from: a */
    private final C47215a f106606a;

    /* renamed from: b */
    private final C40624c f106607b;

    public C40622a(C47215a aVar, C40624c cVar) {
        this.f106606a = aVar;
        this.f106607b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo42565a(C56821b bVar) {
        C40624c cVar = this.f106607b;
        C47215a aVar = this.f106606a;
        String str = bVar.f151612a;
        if (!C40624c.f106610a.matcher(str).matches()) {
            return C60856cj.m92899h(new C41742a(C41749b.m73222a("invalid_phone_number", "The provided number is not valid.")));
        }
        if (cVar.f106612c.checkSelfPermission("android.permission.CALL_PHONE") == 0) {
            return cVar.mo42566a(str, true);
        }
        C60870cx a = cVar.f106611b.mo42583a(aVar, 10001, "android.permission.CALL_PHONE");
        C40623b bVar2 = new C40623b(cVar, str);
        return C60922j.m93045h(a, C47810es.m84966f(bVar2), cVar.f106613d);
    }
}
