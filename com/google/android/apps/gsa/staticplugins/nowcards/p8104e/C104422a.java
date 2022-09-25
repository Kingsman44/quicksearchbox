package com.google.android.apps.gsa.staticplugins.nowcards.p8104e;

import com.google.android.libraries.gsa.monet.service.C23050a;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23053d;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23085ap;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.a */
/* compiled from: PG */
public final class C104422a extends C23050a {

    /* renamed from: a */
    private final C23053d f290559a;

    /* renamed from: b */
    private final C23053d f290560b;

    /* renamed from: c */
    private final Map f290561c;

    public C104422a(Map map, C23053d dVar, C23053d dVar2) {
        this.f290561c = map;
        this.f290560b = dVar;
        this.f290559a = dVar2;
    }

    /* renamed from: e */
    private final C23053d m172644e(String str) {
        C23053d dVar = (C23053d) this.f290561c.get(str);
        if (dVar != null) {
            return dVar;
        }
        if (str.startsWith("TYPE_CAROUSEL_MODULE")) {
            return this.f290560b;
        }
        if (str.startsWith("TYPE_MODULE")) {
            return this.f290559a;
        }
        return null;
    }

    /* renamed from: a */
    public final C23056g mo28487a(String str, C23052c cVar) {
        C23053d e = m172644e(str);
        if (e != null) {
            return e.mo28440a(cVar);
        }
        return null;
    }

    /* renamed from: b */
    public final C23115k mo28322b(String str) {
        C23053d e = m172644e(str);
        if (e != null) {
            return e.mo28441b();
        }
        throw new C23085ap(C23129y.m43315a(str));
    }
}
