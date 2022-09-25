package com.google.android.libraries.lens.view.session.ondevice;

import android.util.Size;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19658f;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19665d;
import com.google.lens.p4701g.C62257ag;
import com.google.lens.p4701g.C62281bd;
import com.google.lens.p4701g.C62308cd;
import com.google.lens.p4701g.C62341dj;
import com.google.p4172bg.p4174b.C55719h;
import com.google.p4172bg.p4174b.C55731t;
import com.google.p4172bg.p4174b.C55733v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.b */
/* compiled from: PG */
final class C27922b extends C27971i {

    /* renamed from: a */
    private final C55731t f76058a;

    /* renamed from: b */
    private final C62281bd f76059b;

    /* renamed from: c */
    private final C62341dj f76060c;

    /* renamed from: d */
    private final C62257ag f76061d;

    /* renamed from: e */
    private final C55733v f76062e;

    /* renamed from: f */
    private final C55719h f76063f;

    /* renamed from: g */
    private final C19665d f76064g;

    /* renamed from: h */
    private final C56220aa f76065h;

    /* renamed from: i */
    private final C56220aa f76066i;

    /* renamed from: j */
    private final C19658f f76067j;

    /* renamed from: k */
    private final Size f76068k;

    /* renamed from: l */
    private final boolean f76069l;

    public C27922b(C55731t tVar, C62281bd bdVar, C62341dj djVar, C62257ag agVar, C55733v vVar, C55719h hVar, C19665d dVar, C56220aa aaVar, C56220aa aaVar2, C19658f fVar, Size size, boolean z) {
        this.f76058a = tVar;
        this.f76059b = bdVar;
        this.f76060c = djVar;
        this.f76061d = agVar;
        this.f76062e = vVar;
        this.f76063f = hVar;
        this.f76064g = dVar;
        this.f76065h = aaVar;
        this.f76066i = aaVar2;
        this.f76067j = fVar;
        this.f76068k = size;
        this.f76069l = z;
    }

    /* renamed from: a */
    public final Size mo33382a() {
        return this.f76068k;
    }

    /* renamed from: b */
    public final C19658f mo33383b() {
        return this.f76067j;
    }

    @Deprecated
    /* renamed from: c */
    public final C19665d mo33384c() {
        return this.f76064g;
    }

    /* renamed from: d */
    public final C62257ag mo33385d() {
        return this.f76061d;
    }

    /* renamed from: e */
    public final C62281bd mo33386e() {
        return this.f76059b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ce, code lost:
        r1 = r4.f76067j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e3, code lost:
        r1 = r4.f76068k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.lens.view.session.ondevice.C27971i
            r2 = 0
            if (r1 == 0) goto L_0x0102
            com.google.android.libraries.lens.view.session.ondevice.i r5 = (com.google.android.libraries.lens.view.session.ondevice.C27971i) r5
            com.google.bg.b.t r1 = r4.f76058a
            if (r1 != 0) goto L_0x0016
            com.google.bg.b.t r1 = r5.mo33392i()
            if (r1 != 0) goto L_0x0102
            goto L_0x0020
        L_0x0016:
            com.google.bg.b.t r3 = r5.mo33392i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x0020:
            com.google.lens.g.bd r1 = r4.f76059b
            if (r1 != 0) goto L_0x002b
            com.google.lens.g.bd r1 = r5.mo33386e()
            if (r1 != 0) goto L_0x0102
            goto L_0x0035
        L_0x002b:
            com.google.lens.g.bd r3 = r5.mo33386e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x0035:
            com.google.lens.g.dj r1 = r4.f76060c
            if (r1 != 0) goto L_0x0040
            com.google.lens.g.dj r1 = r5.mo33389g()
            if (r1 != 0) goto L_0x0102
            goto L_0x004a
        L_0x0040:
            com.google.lens.g.dj r3 = r5.mo33389g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x004a:
            com.google.lens.g.ag r1 = r4.f76061d
            if (r1 != 0) goto L_0x0055
            com.google.lens.g.ag r1 = r5.mo33385d()
            if (r1 != 0) goto L_0x0102
            goto L_0x005f
        L_0x0055:
            com.google.lens.g.ag r3 = r5.mo33385d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x005f:
            com.google.bg.b.v r1 = r4.f76062e
            if (r1 != 0) goto L_0x006a
            com.google.bg.b.v r1 = r5.mo33393j()
            if (r1 != 0) goto L_0x0102
            goto L_0x0074
        L_0x006a:
            com.google.bg.b.v r3 = r5.mo33393j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x0074:
            com.google.bg.b.h r1 = r4.f76063f
            if (r1 != 0) goto L_0x007f
            com.google.bg.b.h r1 = r5.mo33390h()
            if (r1 != 0) goto L_0x0102
            goto L_0x0089
        L_0x007f:
            com.google.bg.b.h r3 = r5.mo33390h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x0089:
            com.google.android.libraries.ba.c.c.c.d r1 = r4.f76064g
            if (r1 != 0) goto L_0x0094
            com.google.android.libraries.ba.c.c.c.d r1 = r5.mo33384c()
            if (r1 != 0) goto L_0x0102
            goto L_0x009e
        L_0x0094:
            com.google.android.libraries.ba.c.c.c.d r3 = r5.mo33384c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x009e:
            com.google.bp.f.b.a.aa r1 = r4.f76065h
            if (r1 != 0) goto L_0x00a9
            com.google.bp.f.b.a.aa r1 = r5.mo33395l()
            if (r1 != 0) goto L_0x0102
            goto L_0x00b3
        L_0x00a9:
            com.google.bp.f.b.a.aa r3 = r5.mo33395l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x00b3:
            com.google.bp.f.b.a.aa r1 = r4.f76066i
            if (r1 != 0) goto L_0x00be
            com.google.bp.f.b.a.aa r1 = r5.mo33394k()
            if (r1 != 0) goto L_0x0102
            goto L_0x00c8
        L_0x00be:
            com.google.bp.f.b.a.aa r3 = r5.mo33394k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x00c8:
            com.google.lens.g.cd r1 = r5.mo33388f()
            if (r1 != 0) goto L_0x0102
            com.google.android.libraries.ba.c.c.b.f r1 = r4.f76067j
            if (r1 != 0) goto L_0x00d9
            com.google.android.libraries.ba.c.c.b.f r1 = r5.mo33383b()
            if (r1 != 0) goto L_0x0102
            goto L_0x00e3
        L_0x00d9:
            com.google.android.libraries.ba.c.c.b.f r3 = r5.mo33383b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0102
        L_0x00e3:
            android.util.Size r1 = r4.f76068k
            if (r1 != 0) goto L_0x00ee
            android.util.Size r1 = r5.mo33382a()
            if (r1 != 0) goto L_0x0102
            goto L_0x00f9
        L_0x00ee:
            android.util.Size r3 = r5.mo33382a()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00f9
            goto L_0x0102
        L_0x00f9:
            boolean r1 = r4.f76069l
            boolean r5 = r5.mo33396m()
            if (r1 != r5) goto L_0x0102
            return r0
        L_0x0102:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.session.ondevice.C27922b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C62308cd mo33388f() {
        return null;
    }

    /* renamed from: g */
    public final C62341dj mo33389g() {
        return this.f76060c;
    }

    /* renamed from: h */
    public final C55719h mo33390h() {
        return this.f76063f;
    }

    /* renamed from: i */
    public final C55731t mo33392i() {
        return this.f76058a;
    }

    /* renamed from: j */
    public final C55733v mo33393j() {
        return this.f76062e;
    }

    /* renamed from: k */
    public final C56220aa mo33394k() {
        return this.f76066i;
    }

    /* renamed from: l */
    public final C56220aa mo33395l() {
        return this.f76065h;
    }

    /* renamed from: m */
    public final boolean mo33396m() {
        return this.f76069l;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f76058a);
        String valueOf2 = String.valueOf(this.f76059b);
        String valueOf3 = String.valueOf(this.f76060c);
        String valueOf4 = String.valueOf(this.f76061d);
        String valueOf5 = String.valueOf(this.f76062e);
        String valueOf6 = String.valueOf(this.f76063f);
        String valueOf7 = String.valueOf(this.f76064g);
        String valueOf8 = String.valueOf(this.f76065h);
        String valueOf9 = String.valueOf(this.f76066i);
        String valueOf10 = String.valueOf(this.f76067j);
        String valueOf11 = String.valueOf(this.f76068k);
        boolean z = this.f76069l;
        return "OnDeviceEngineResult{textImageResult=" + valueOf + ", paragraphsResult=" + valueOf2 + ", translationsResult=" + valueOf3 + ", inpaintingResult=" + valueOf4 + ", textImageStatsResult=" + valueOf5 + ", detectionBoxesResult=" + valueOf6 + ", detectionResult=" + valueOf7 + ", unreconciledDetections=" + valueOf8 + ", reconciledDetections=" + valueOf9 + ", proactiveResult=null, embeddingResult=" + valueOf10 + ", bitmapSize=" + valueOf11 + ", isError=" + z + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        C55731t tVar = this.f76058a;
        int i5 = 0;
        int hashCode = ((tVar == null ? 0 : tVar.hashCode()) ^ 1000003) * 1000003;
        C62281bd bdVar = this.f76059b;
        int hashCode2 = (hashCode ^ (bdVar == null ? 0 : bdVar.hashCode())) * 1000003;
        C62341dj djVar = this.f76060c;
        int hashCode3 = (hashCode2 ^ (djVar == null ? 0 : djVar.hashCode())) * 1000003;
        C62257ag agVar = this.f76061d;
        int hashCode4 = (hashCode3 ^ (agVar == null ? 0 : agVar.hashCode())) * 1000003;
        C55733v vVar = this.f76062e;
        int hashCode5 = (hashCode4 ^ (vVar == null ? 0 : vVar.hashCode())) * 1000003;
        C55719h hVar = this.f76063f;
        int hashCode6 = (hashCode5 ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        C19665d dVar = this.f76064g;
        if (dVar == null) {
            i = 0;
        } else {
            i = dVar.hashCode();
        }
        int i6 = (hashCode6 ^ i) * 1000003;
        C56220aa aaVar = this.f76065h;
        if (aaVar == null) {
            i2 = 0;
        } else {
            i2 = aaVar.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        C56220aa aaVar2 = this.f76066i;
        if (aaVar2 == null) {
            i3 = 0;
        } else {
            i3 = aaVar2.hashCode();
        }
        int i8 = (i7 ^ i3) * -721379959;
        C19658f fVar = this.f76067j;
        if (fVar == null) {
            i4 = 0;
        } else {
            i4 = fVar.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        Size size = this.f76068k;
        if (size != null) {
            i5 = size.hashCode();
        }
        return ((i9 ^ i5) * 1000003) ^ (true != this.f76069l ? 1237 : 1231);
    }
}
