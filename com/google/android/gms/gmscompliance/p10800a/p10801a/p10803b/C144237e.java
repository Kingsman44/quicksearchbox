package com.google.android.gms.gmscompliance.p10800a.p10801a.p10803b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4017at.p4046e.p4047a.p4048a.C53928i;
import com.google.p4017at.p4046e.p4047a.p4048a.C53929j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63042fg;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.gmscompliance.a.a.b.e */
/* compiled from: PG */
public final class C144237e {

    /* renamed from: a */
    public final C144236d f390683a;

    public C144237e(File file) {
        this.f390683a = new C144236d(file);
    }

    /* renamed from: a */
    public final C58833ax mo119783a() {
        C58833ax a = this.f390683a.mo119781a();
        if (!a.mo56113h()) {
            return C58836b.f156633a;
        }
        C53929j jVar = (C53929j) a.mo56107c();
        try {
            C53928i iVar = (C53928i) C62942bv.parseFrom((C62942bv) C53928i.f141500i, jVar.f141513b, C62921ba.m95368a());
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            C63042fg fgVar = iVar.f141506e;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (seconds >= fgVar.f170154a) {
                return C58836b.f156633a;
            }
            return C58833ax.m90834k(jVar);
        } catch (C62974ct unused) {
            return C58836b.f156633a;
        }
    }
}
