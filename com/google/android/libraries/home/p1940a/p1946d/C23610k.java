package com.google.android.libraries.home.p1940a.p1946d;

import com.google.android.libraries.home.p1940a.p1943c.C23412ao;
import com.google.android.libraries.home.p1940a.p1943c.C23421ax;
import com.google.android.libraries.home.p1940a.p1943c.C23474bb;
import com.google.android.libraries.home.p1940a.p1943c.C23482bj;
import com.google.android.libraries.home.p1940a.p1943c.C23503cd;
import com.google.android.libraries.home.p1940a.p1943c.C23525cz;
import com.google.android.libraries.home.p1940a.p1943c.C23534dh;
import com.google.android.libraries.home.p1940a.p1943c.C23540dn;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.android.libraries.home.p1940a.p1943c.C23562ei;
import com.google.android.libraries.home.p1940a.p1943c.C23583j;
import com.google.android.libraries.home.p1940a.p1943c.C23587n;
import com.google.android.libraries.home.p1940a.p1943c.C23589p;
import com.google.android.libraries.home.p1940a.p1943c.C23591r;
import com.google.android.libraries.home.p1940a.p1943c.C23595v;
import com.google.android.libraries.home.p1940a.p1943c.p1944a.C23372as;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23436ak;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23437al;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23439an;
import com.google.android.libraries.home.p1940a.p1943c.p1945b.C23441ap;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.d.k */
/* compiled from: PG */
public final class C23610k {

    /* renamed from: a */
    static final /* synthetic */ C23610k f64629a = new C23610k();

    /* renamed from: b */
    public static final C59071e f64630b = C59071e.m91331h();

    private C23610k() {
    }

    /* renamed from: a */
    public static final C23611l m44070a(C23544dr drVar) {
        C69664n.m101061g(drVar, "param");
        if (drVar instanceof C23583j) {
            return new C23600a();
        }
        if (drVar instanceof C23372as) {
            return new C23601b();
        }
        if ((drVar instanceof C23587n) || (drVar instanceof C23589p) || (drVar instanceof C23591r)) {
            return new C23602c();
        }
        if (drVar instanceof C23595v) {
            return new C23603d();
        }
        if ((drVar instanceof C23412ao) || (drVar instanceof C23474bb)) {
            return new C23604e();
        }
        if (drVar instanceof C23421ax) {
            return new C23605f();
        }
        if (drVar instanceof C23482bj) {
            return new C23606g();
        }
        if (drVar instanceof C23525cz) {
            return new C23607h();
        }
        if ((drVar instanceof C23540dn) || (drVar instanceof C23534dh)) {
            return new C23609j();
        }
        if (drVar instanceof C23562ei) {
            return new C23614o();
        }
        if ((drVar instanceof C23441ap) || (drVar instanceof C23439an) || (drVar instanceof C23436ak) || (drVar instanceof C23437al)) {
            return new C23615p();
        }
        if (drVar instanceof C23503cd) {
            return new C23616q();
        }
        C59052c cVar = (C59052c) f64630b.mo56226d();
        String simpleName = drVar.getClass().getSimpleName();
        cVar.mo56379ah(new C59094n(48663));
        cVar.mo56389s("S3 translator doesn't exist for the given parameter. Param name = %s", simpleName);
        return null;
    }
}
