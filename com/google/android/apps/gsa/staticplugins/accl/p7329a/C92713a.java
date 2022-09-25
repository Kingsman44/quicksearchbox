package com.google.android.apps.gsa.staticplugins.accl.p7329a;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.a.a */
/* compiled from: PG */
public final class C92713a {

    /* renamed from: a */
    public static final long f258804a = TimeUnit.DAYS.toMillis(21);

    /* renamed from: c */
    private static final C59071e f258805c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.a.a");

    /* renamed from: b */
    public final C21370a f258806b;

    /* renamed from: d */
    private final C68214a f258807d;

    /* renamed from: e */
    private final C68214a f258808e;

    /* renamed from: f */
    private final Map f258809f = new ConcurrentHashMap();

    public C92713a(C21370a aVar, C68214a aVar2, C68214a aVar3) {
        this.f258806b = aVar;
        this.f258807d = aVar2;
        this.f258808e = aVar3;
    }

    /* renamed from: c */
    private final String m152696c(int i) {
        String F = ((C86054o) this.f258808e.mo27525b()).mo79659F();
        return "accl_jwn_capabilities_record_prefix_" + F + "_" + i;
    }

    /* renamed from: a */
    public final C92717e mo87446a(int i) {
        String c = m152696c(i);
        C92717e eVar = (C92717e) this.f258809f.get(c);
        if (eVar != null) {
            return eVar;
        }
        byte[] e = ((C86338r) this.f258807d.mo27525b()).mo80079e(c, (byte[]) null);
        if (e == null) {
            return C92717e.f258816b;
        }
        try {
            C92717e eVar2 = (C92717e) C62942bv.parseFrom((C62942bv) C92717e.f258816b, e);
            this.f258809f.put(c, eVar2);
            return eVar2;
        } catch (C62974ct unused) {
            ((C59052c) ((C59052c) f258805c.mo56226d()).mo56372aa(13037)).mo56386p("Attempted to read malformed JwnLibrariesRecord from shared prefs.");
            return C92717e.f258816b;
        }
    }

    /* renamed from: b */
    public final void mo87447b(int i, C92717e eVar) {
        String c = m152696c(i);
        C86337q b = ((C86338r) this.f258807d.mo27525b()).mo80076b();
        b.mo80068c(c, eVar.toByteArray());
        b.apply();
        this.f258809f.put(c, eVar);
    }
}
