package androidx.media3.exoplayer.dash;

import androidx.media3.common.C2598ay;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.dash.p141a.C2910a;
import androidx.media3.exoplayer.dash.p141a.C2911b;
import androidx.media3.exoplayer.dash.p141a.C2912c;
import androidx.media3.exoplayer.dash.p141a.C2922m;
import androidx.media3.exoplayer.p145h.p147b.C3049e;
import androidx.media3.exoplayer.p145h.p147b.C3055k;
import androidx.media3.exoplayer.p145h.p147b.C3059o;
import androidx.media3.exoplayer.p150j.C3197ad;
import androidx.media3.exoplayer.p151k.C3257w;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.p159f.C3400e;
import androidx.media3.extractor.p161h.C3428o;
import androidx.media3.p132b.C2505i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.dash.v */
/* compiled from: PG */
public final class C2953v implements C3055k {

    /* renamed from: a */
    public final C3257w f8463a;

    /* renamed from: b */
    public final C2933b f8464b;

    /* renamed from: c */
    public final int f8465c;

    /* renamed from: d */
    public final C2505i f8466d;

    /* renamed from: e */
    public final long f8467e;

    /* renamed from: f */
    public final C2956y f8468f;

    /* renamed from: g */
    public final C2951t[] f8469g;

    /* renamed from: h */
    public C3197ad f8470h;

    /* renamed from: i */
    public C2912c f8471i;

    /* renamed from: j */
    public int f8472j;

    /* renamed from: k */
    public IOException f8473k;

    /* renamed from: l */
    public boolean f8474l;

    /* renamed from: m */
    private final int[] f8475m;

    public C2953v(C3257w wVar, C2912c cVar, C2933b bVar, int i, int[] iArr, C3197ad adVar, int i2, C2505i iVar, long j, boolean z, List list, C2956y yVar) {
        int i3;
        C3326aa aaVar;
        C2953v vVar = this;
        C2912c cVar2 = cVar;
        C2933b bVar2 = bVar;
        int i4 = i;
        C3197ad adVar2 = adVar;
        int i5 = i2;
        C2956y yVar2 = yVar;
        vVar.f8463a = wVar;
        vVar.f8471i = cVar2;
        vVar.f8464b = bVar2;
        vVar.f8475m = iArr;
        vVar.f8470h = adVar2;
        vVar.f8465c = i5;
        vVar.f8466d = iVar;
        vVar.f8472j = i4;
        vVar.f8467e = j;
        vVar.f8468f = yVar2;
        long w = C2612ak.m6998w(cVar2.mo6765b(i4));
        ArrayList c = mo6842c();
        vVar.f8469g = new C2951t[adVar.mo7032j()];
        int i6 = 0;
        int i7 = 0;
        while (i7 < vVar.f8469g.length) {
            C2922m mVar = (C2922m) c.get(adVar2.mo7027f(i7));
            C2911b a = bVar2.mo6805a(mVar.f8367c);
            C2951t[] tVarArr = vVar.f8469g;
            C2911b bVar3 = a == null ? (C2911b) mVar.f8367c.get(i6) : a;
            C2680x xVar = mVar.f8366b;
            String str = xVar.f7495m;
            C3049e eVar = null;
            if (C2598ay.m6816o(str)) {
                boolean z2 = z;
                i3 = i7;
                List list2 = list;
            } else {
                if (C2598ay.m6815n(str)) {
                    aaVar = new C3400e(1);
                    boolean z3 = z;
                    i3 = i7;
                    List list3 = list;
                } else {
                    i3 = i7;
                    aaVar = new C3428o(true != z ? 0 : 4, (C2609ah) null, list, yVar2);
                }
                eVar = new C3049e(aaVar, i5, xVar);
            }
            C2951t[] tVarArr2 = tVarArr;
            C3049e eVar2 = eVar;
            int i8 = i3;
            tVarArr2[i8] = new C2951t(w, mVar, bVar3, eVar2, 0, mVar.mo6789k());
            i7 = i8 + 1;
            vVar = this;
            i6 = 0;
        }
    }

    /* renamed from: d */
    public static final long m8359d(C2951t tVar, C3059o oVar, long j, long j2, long j3) {
        if (oVar != null) {
            return oVar.mo6999k();
        }
        return C2612ak.m6994s(tVar.mo6834f(j), j2, j3);
    }

    /* renamed from: a */
    public final long mo6840a(long j) {
        C2912c cVar = this.f8471i;
        long j2 = cVar.f8316a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - C2612ak.m6998w(j2 + cVar.mo6766c(this.f8472j).f8351b);
    }

    /* renamed from: b */
    public final C2951t mo6841b(int i) {
        C2951t tVar = this.f8469g[i];
        C2911b a = this.f8464b.mo6805a(tVar.f8456a.f8367c);
        if (a == null || a.equals(tVar.f8457b)) {
            return tVar;
        }
        C2951t tVar2 = new C2951t(tVar.f8459d, tVar.f8456a, a, tVar.f8461f, tVar.f8460e, tVar.f8458c);
        this.f8469g[i] = tVar2;
        return tVar2;
    }

    /* renamed from: c */
    public final ArrayList mo6842c() {
        List list = this.f8471i.mo6766c(this.f8472j).f8352c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f8475m) {
            arrayList.addAll(((C2910a) list.get(i)).f8308c);
        }
        return arrayList;
    }
}
