package com.google.android.libraries.lens.view.session;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.p114h.p115a.C2275g;
import com.google.android.libraries.lens.p2014e.C24181a;
import com.google.android.libraries.lens.p2014e.C24225q;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.android.libraries.lens.view.p2070an.p2072b.C25408f;
import com.google.android.libraries.lens.view.p2081au.C25560j;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26758j;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4056g.p4057a.p4058a.C54020ca;

/* renamed from: com.google.android.libraries.lens.view.session.y */
/* compiled from: PG */
public final class C28027y implements C28021s {

    /* renamed from: a */
    public static final C58974d f76278a = C58974d.m91135i("ImageProcessor");

    /* renamed from: b */
    public final C25408f f76279b;

    /* renamed from: c */
    public final ContentResolver f76280c;

    /* renamed from: d */
    private final C60887da f76281d;

    public C28027y(ContentResolver contentResolver, C60887da daVar, C25408f fVar) {
        this.f76280c = contentResolver;
        this.f76281d = daVar;
        this.f76279b = fVar;
    }

    /* renamed from: e */
    public static Matrix m52211e(C2275g gVar) {
        int i;
        Matrix matrix = new Matrix();
        if (gVar != null) {
            switch (gVar.mo5670d()) {
                case 3:
                case 4:
                    i = 180;
                    break;
                case 5:
                case 8:
                    i = 270;
                    break;
                case 6:
                case 7:
                    i = 90;
                    break;
                default:
                    i = 0;
                    break;
            }
            matrix.postRotate((float) i);
        }
        return matrix;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ad  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.base.C58833ax m52212f(androidx.p114h.p115a.C2275g r13) {
        /*
            if (r13 != 0) goto L_0x0005
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            return r13
        L_0x0005:
            java.lang.String r0 = "GPSLatitude"
            java.lang.String r0 = r13.mo5669c(r0)
            java.lang.String r1 = "GPSLatitudeRef"
            java.lang.String r1 = r13.mo5669c(r1)
            java.lang.String r2 = "GPSLongitude"
            java.lang.String r2 = r13.mo5669c(r2)
            java.lang.String r3 = "GPSLongitudeRef"
            java.lang.String r3 = r13.mo5669c(r3)
            r4 = 1
            r5 = 0
            r6 = 0
            if (r0 == 0) goto L_0x005a
            if (r1 == 0) goto L_0x005a
            if (r2 == 0) goto L_0x005a
            if (r3 == 0) goto L_0x005a
            r7 = 2
            double r8 = androidx.p114h.p115a.C2275g.m6189a(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0039 }
            double r10 = androidx.p114h.p115a.C2275g.m6189a(r2, r3)     // Catch:{ IllegalArgumentException -> 0x0039 }
            double[] r12 = new double[r7]     // Catch:{ IllegalArgumentException -> 0x0039 }
            r12[r5] = r8     // Catch:{ IllegalArgumentException -> 0x0039 }
            r12[r4] = r10     // Catch:{ IllegalArgumentException -> 0x0039 }
            r6 = r12
            goto L_0x005a
        L_0x0039:
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r5] = r0
            r8[r4] = r1
            r8[r7] = r2
            r0 = 3
            r8[r0] = r3
            java.lang.String r0 = "latValue=%s, latRef=%s, lngValue=%s, lngRef=%s"
            java.lang.String r0 = java.lang.String.format(r0, r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Latitude/longitude values are not parsable. "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "ExifInterface"
            android.util.Log.w(r1, r0)
        L_0x005a:
            if (r6 == 0) goto L_0x00c2
            com.google.at.g.a.a.ca r0 = com.google.p4017at.p4056g.p4057a.p4058a.C54020ca.f141734f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.at.g.a.a.bz r0 = (com.google.p4017at.p4056g.p4057a.p4058a.C54018bz) r0
            com.google.cg.k r1 = com.google.p4479cg.C58079k.f155250c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.cg.j r1 = (com.google.p4479cg.C58078j) r1
            r2 = r6[r5]
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.cg.k r5 = (com.google.p4479cg.C58079k) r5
            r5.f155252a = r2
            r2 = r6[r4]
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.cg.k r4 = (com.google.p4479cg.C58079k) r4
            r4.f155253b = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.at.g.a.a.ca r2 = (com.google.p4017at.p4056g.p4057a.p4058a.C54020ca) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.cg.k r1 = (com.google.p4479cg.C58079k) r1
            r1.getClass()
            r2.f141736a = r1
            java.lang.String r1 = "GPSHPositioningError"
            androidx.h.a.c r1 = r13.mo5668b(r1)
            r2 = 0
            if (r1 != 0) goto L_0x00a0
        L_0x009e:
            r4 = r2
            goto L_0x00a9
        L_0x00a0:
            java.nio.ByteOrder r13 = r13.f6428j     // Catch:{ NumberFormatException -> 0x00a7 }
            double r4 = r1.mo5661a(r13)     // Catch:{ NumberFormatException -> 0x00a7 }
            goto L_0x00a9
        L_0x00a7:
            goto L_0x009e
        L_0x00a9:
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x00b7
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.at.g.a.a.ca r13 = (com.google.p4017at.p4056g.p4057a.p4058a.C54020ca) r13
            float r1 = (float) r4
            r13.f141737b = r1
        L_0x00b7:
            com.google.protobuf.bv r13 = r0.build()
            com.google.at.g.a.a.ca r13 = (com.google.p4017at.p4056g.p4057a.p4058a.C54020ca) r13
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r13)
            return r13
        L_0x00c2:
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.session.C28027y.m52212f(androidx.h.a.g):com.google.common.base.ax");
    }

    /* renamed from: g */
    public static C60870cx m52213g(Bitmap bitmap, int i, C27228h hVar, RectF rectF) {
        C58838bb.m90866a((C24226r) hVar.mo32673f().mo56111f(), "Missing External Image source.");
        C24225q o = C24227s.m45178o();
        o.mo29649b(bitmap);
        o.mo29650c(m52214i(hVar));
        o.mo29654g(hVar.mo32675h());
        C24181a aVar = (C24181a) o;
        aVar.f66098i = i;
        aVar.f66097h = 1;
        o.mo29652e((C24226r) hVar.mo32673f().mo56107c());
        aVar.f66096g = C58833ax.m90833j(rectF);
        return C60856cj.m92900i(C25560j.m47126e(o.mo29648a()).mo30611a());
    }

    /* renamed from: i */
    private static C26733ab m52214i(C27228h hVar) {
        if (!hVar.mo32671e().mo56113h()) {
            return C26733ab.f72862a;
        }
        C26758j jVar = new C26758j();
        jVar.f72913e = C58833ax.m90834k((C54020ca) hVar.mo32671e().mo56107c());
        return jVar.mo32045a();
    }

    /* renamed from: j */
    private final C60870cx m52215j(C27228h hVar) {
        C28024v vVar = new C28024v(this, hVar);
        return C60856cj.m92904m(C47810es.m84978r(vVar), this.f76281d);
    }

    /* renamed from: a */
    public final C60870cx mo33478a(C27228h hVar, RectF rectF) {
        C58838bb.m90868c(hVar.mo32668b().mo56113h());
        return m52213g((Bitmap) hVar.mo32668b().mo56107c(), 3, hVar, rectF);
    }

    /* renamed from: b */
    public final C60870cx mo33479b(C27228h hVar, RectF rectF) {
        C24225q o = C24227s.m45178o();
        o.mo29649b((Bitmap) hVar.mo32668b().mo56107c());
        C24181a aVar = (C24181a) o;
        aVar.f66097h = 1;
        aVar.f66098i = 5;
        aVar.f66091b = C58833ax.m90833j((String) hVar.mo32669c().mo56111f());
        o.mo29652e((C24226r) hVar.mo32673f().mo56107c());
        o.mo29650c(m52214i(hVar));
        aVar.f66096g = C58833ax.m90833j(rectF);
        return C60856cj.m92900i(C25560j.m47126e(o.mo29648a()).mo30611a());
    }

    /* renamed from: c */
    public final C60870cx mo33480c(C27228h hVar, RectF rectF) {
        C60870cx j = m52215j(hVar);
        C28026x xVar = new C28026x(this, hVar, rectF);
        return C60922j.m93045h(j, C47810es.m84966f(xVar), this.f76281d);
    }

    /* renamed from: d */
    public final C60870cx mo33481d(C27228h hVar, RectF rectF) {
        C60870cx j = m52215j(hVar);
        C28023u uVar = new C28023u(this, hVar, rectF);
        return C60922j.m93045h(j, C47810es.m84966f(uVar), this.f76281d);
    }

    /* renamed from: h */
    public final C60870cx mo33484h(int i, C27228h hVar, Matrix matrix, RectF rectF) {
        C28022t tVar = new C28022t(this, hVar, matrix);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(tVar), this.f76281d);
        C28025w wVar = new C28025w(i, hVar, rectF);
        return C60922j.m93045h(m, C47810es.m84966f(wVar), this.f76281d);
    }
}
