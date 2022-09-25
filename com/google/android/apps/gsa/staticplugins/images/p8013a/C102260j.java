package com.google.android.apps.gsa.staticplugins.images.p8013a;

import android.net.Uri;
import com.google.android.apps.gsa.search.p6489a.p6490a.C84337b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5147a.p5148a.C65937o;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.a.j */
/* compiled from: PG */
public final class C102260j {

    /* renamed from: a */
    public final C22871g f285328a;

    /* renamed from: b */
    public final C84337b f285329b;

    public C102260j(C22871g gVar, C84337b bVar) {
        this.f285328a = gVar;
        this.f285329b = bVar;
    }

    /* renamed from: a */
    public final Uri mo93044a(C65930h hVar) {
        Object obj;
        Object obj2;
        Uri.Builder path = this.f285329b.mo77868a().buildUpon().path("imgres");
        C65928f fVar = hVar.f179305d;
        if (fVar == null) {
            fVar = C65928f.f179293f;
        }
        Uri.Builder appendQueryParameter = path.appendQueryParameter("imgurl", fVar.f179296b);
        C62940bt r1 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r1);
        Object l = hVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("imgrefurl", ((C65937o) obj).f179338d);
        C62940bt r12 = C62942bv.checkIsLite(C65937o.f179333l);
        hVar.mo58887l(r12);
        Object l2 = hVar.f169962ag.mo58854l(r12.f169971d);
        if (l2 == null) {
            obj2 = r12.f169969b;
        } else {
            obj2 = r12.mo58889c(l2);
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("docid", ((C65937o) obj2).f179337c).appendQueryParameter("tbnid", hVar.f179303b);
        C65928f fVar2 = hVar.f179305d;
        if (fVar2 == null) {
            fVar2 = C65928f.f179293f;
        }
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("w", Integer.toString(fVar2.f179298d));
        C65928f fVar3 = hVar.f179305d;
        if (fVar3 == null) {
            fVar3 = C65928f.f179293f;
        }
        return appendQueryParameter4.appendQueryParameter(C19618h.f54585a, Integer.toString(fVar3.f179297c)).appendQueryParameter("source", "sh/x/im").build();
    }
}
