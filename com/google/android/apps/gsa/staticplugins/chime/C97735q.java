package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.libraries.notifications.data.C29824o;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.C60789b;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7973qv;
import com.google.p4283bv.p4345d.C57041t;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56952b;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56968d;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56984t;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57000j;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57002l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.q */
/* compiled from: PG */
public final class C97735q {

    /* renamed from: a */
    public static final C59071e f272898a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.q");

    /* renamed from: a */
    public static C58833ax m162004a(C29827r rVar) {
        try {
            return C58833ax.m90834k(m162005b(rVar));
        } catch (IllegalArgumentException unused) {
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public static C56968d m162005b(C29827r rVar) {
        C63070h c = rVar.mo35054c();
        if (c == null || c.f170218b.mo59173M()) {
            throw new IllegalArgumentException("Payload cannot be null.");
        }
        try {
            C56968d dVar = (C56968d) C62942bv.parseFrom((C62942bv) C56968d.f152036t, c.f170218b, C62921ba.m95368a());
            int a = C57002l.m88252a(dVar.f152039b);
            if (a == 0) {
                return dVar;
            }
            if (a == 1) {
                return dVar;
            }
            byte[] N = dVar.f152040c.mo59174N();
            return (C56968d) C62942bv.parseFrom((C62942bv) C56968d.f152036t, C60789b.m92792b(N, N.length), C62921ba.m95368a());
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Failed to parse payload.", e);
        } catch (RuntimeException e2) {
            throw new IllegalArgumentException("Failed to decompress payload.", e2);
        }
    }

    /* renamed from: c */
    public static C56984t m162006c(C29824o oVar) {
        C63070h d = oVar.mo35023d();
        if (d == null || d.f170218b.mo59173M()) {
            throw new IllegalArgumentException("Payload cannot be null.");
        }
        try {
            return (C56984t) C62942bv.parseFrom((C62942bv) C56984t.f152114f, d.f170218b, C62921ba.m95368a());
        } catch (C62974ct e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public static String m162007d(C29827r rVar) {
        C57000j jVar = m162005b(rVar).f152041d;
        if (jVar == null) {
            jVar = C57000j.f152155i;
        }
        C7669fo foVar = jVar.f152158b;
        if (foVar == null) {
            foVar = C7669fo.f26633e;
        }
        return String.format("%s:0x%x", new Object[]{foVar.f26636b, Long.valueOf(foVar.f26638d)});
    }

    /* renamed from: e */
    public static boolean m162008e(C85651bb bbVar, boolean z) {
        if (z) {
            return bbVar.mo79140M();
        }
        return bbVar.mo79140M() && bbVar.mo79141N();
    }

    /* renamed from: f */
    public static int m162009f(C29827r rVar) {
        C57000j jVar = m162005b(rVar).f152041d;
        if (jVar == null) {
            jVar = C57000j.f152155i;
        }
        C57041t tVar = jVar.f152160d;
        if (tVar == null) {
            tVar = C57041t.f152278e;
        }
        C7973qv qvVar = tVar.f152282c;
        if (qvVar == null) {
            qvVar = C7973qv.f28001c;
        }
        int b = C56952b.m88242b(qvVar.f28004b);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
