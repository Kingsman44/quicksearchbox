package com.google.android.apps.gsa.staticplugins.nowcards.p8104e;

import com.google.android.libraries.gsa.monet.p1886a.C22936a;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.p1886a.C22946k;
import com.google.android.libraries.gsa.monet.shared.C23085ap;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c */
/* compiled from: PG */
public final class C104482c extends C22936a {

    /* renamed from: a */
    private final C22946k f290585a;

    /* renamed from: b */
    private final C22946k f290586b;

    /* renamed from: c */
    private final Map f290587c;

    public C104482c(Map map, C22946k kVar, C22946k kVar2) {
        this.f290587c = map;
        this.f290586b = kVar;
        this.f290585a = kVar2;
    }

    /* renamed from: e */
    private final C22946k m172826e(String str) {
        C22946k kVar = (C22946k) this.f290587c.get(str);
        if (kVar != null) {
            return kVar;
        }
        if (str.startsWith("TYPE_CAROUSEL_MODULE")) {
            return this.f290586b;
        }
        if (str.startsWith("TYPE_MODULE")) {
            return this.f290585a;
        }
        return null;
    }

    /* renamed from: a */
    public final C22939d mo28284a(String str, C22945j jVar) {
        C22946k e = m172826e(str);
        if (e != null) {
            return e.mo28318b(jVar);
        }
        return null;
    }

    /* renamed from: b */
    public final C23115k mo28322b(String str) {
        C22946k e = m172826e(str);
        if (e != null) {
            return e.mo28317a();
        }
        throw new C23085ap(C23129y.m43315a(str));
    }
}
