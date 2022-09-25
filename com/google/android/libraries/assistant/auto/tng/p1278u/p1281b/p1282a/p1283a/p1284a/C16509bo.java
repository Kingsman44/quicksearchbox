package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p883a.C13012b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p001a.p007b.p011b.p012a.C0031g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.bo */
/* compiled from: PG */
public final class C16509bo extends C68247h {

    /* renamed from: a */
    private final C68283d f48483a;

    public C16509bo(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C16509bo.class), aVar);
        this.f48483a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        Object obj3;
        C12991i iVar = (C12991i) obj;
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (a != C12989g.MORRIS) {
            obj2 = C58836b.f156633a;
        } else {
            C62940bt r0 = C62942bv.checkIsLite(C13012b.f40423f);
            iVar.mo58887l(r0);
            Object l = iVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj3 = r0.f169969b;
            } else {
                obj3 = r0.mo58889c(l);
            }
            C0031g gVar = ((C13012b) obj3).f40426b;
            if (gVar == null) {
                gVar = C0031g.f92d;
            }
            obj2 = C58833ax.m90834k(gVar);
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f48483a.mo60297gq();
    }
}
