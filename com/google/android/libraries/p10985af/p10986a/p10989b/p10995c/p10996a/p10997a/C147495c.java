package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10996a.p10997a;

import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4184bj.p4193c.p4197c.C55944ar;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.libraries.af.a.b.c.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C147495c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C147496d f398116a;

    public /* synthetic */ C147495c(C147496d dVar) {
        this.f398116a = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C147496d dVar = this.f398116a;
        try {
            return C60856cj.m92900i(C58833ax.m90834k((C55944ar) dVar.f398118b.mo45889c(dVar.f398117a, new C42789m(C55944ar.f148910d.getParserForType()))));
        } catch (FileNotFoundException e) {
            if (!dVar.f398118b.mo45894h(dVar.f398117a)) {
                return C60856cj.m92900i(C58836b.f156633a);
            }
            throw e;
        }
    }
}
