package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2610ai;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.hls.p148a.C3137e;
import androidx.media3.exoplayer.hls.p148a.C3139g;
import androidx.media3.exoplayer.hls.p148a.C3141i;
import androidx.media3.exoplayer.hls.p148a.C3142j;
import androidx.media3.exoplayer.hls.p148a.C3144l;
import androidx.media3.exoplayer.hls.p148a.C3157y;
import androidx.media3.exoplayer.p137a.C2731bt;
import androidx.media3.exoplayer.p145h.p147b.C3050f;
import androidx.media3.exoplayer.p145h.p147b.C3061q;
import androidx.media3.exoplayer.p150j.C3197ad;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2509m;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60757n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.hls.l */
/* compiled from: PG */
final class C3172l {

    /* renamed from: a */
    public final C3173m f9401a;

    /* renamed from: b */
    public final C2505i f9402b;

    /* renamed from: c */
    public final C3160ac f9403c;

    /* renamed from: d */
    public final Uri[] f9404d;

    /* renamed from: e */
    public final C2680x[] f9405e;

    /* renamed from: f */
    public final C3157y f9406f;

    /* renamed from: g */
    public final C2652bn f9407g;

    /* renamed from: h */
    public final List f9408h;

    /* renamed from: i */
    public final C3166f f9409i = new C3166f();

    /* renamed from: j */
    public final C2731bt f9410j;

    /* renamed from: k */
    public boolean f9411k;

    /* renamed from: l */
    public byte[] f9412l = C2612ak.f7254f;

    /* renamed from: m */
    public IOException f9413m;

    /* renamed from: n */
    public Uri f9414n;

    /* renamed from: o */
    public boolean f9415o;

    /* renamed from: p */
    public C3197ad f9416p;

    /* renamed from: q */
    public long f9417q = -9223372036854775807L;

    /* renamed from: r */
    public boolean f9418r;

    /* renamed from: s */
    private final C2505i f9419s;

    public C3172l(C3173m mVar, C3157y yVar, Uri[] uriArr, C2680x[] xVarArr, C3163c cVar, C2495an anVar, C3160ac acVar, List list, C2731bt btVar) {
        this.f9401a = mVar;
        this.f9406f = yVar;
        this.f9404d = uriArr;
        this.f9405e = xVarArr;
        this.f9403c = acVar;
        this.f9408h = list;
        this.f9410j = btVar;
        C2505i a = cVar.mo7163a();
        this.f9402b = a;
        if (anVar != null) {
            a.mo5884f(anVar);
        }
        this.f9419s = cVar.mo7163a();
        this.f9407g = new C2652bn(BuildConfig.FLAVOR, xVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((xVarArr[i].f7489g & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f9416p = new C3170j(this.f9407g, C60757n.m92752m(arrayList));
    }

    /* renamed from: b */
    public static Uri m9240b(C3144l lVar, C3142j jVar) {
        String str;
        if (jVar == null || (str = jVar.f9265i) == null) {
            return null;
        }
        return Uri.parse(C2610ai.m6915a(lVar.f9314t, str));
    }

    /* renamed from: a */
    public final int mo7168a(C3175o oVar) {
        List list;
        if (oVar.f9437e == -1) {
            return 1;
        }
        C3144l f = this.f9406f.mo7143f(this.f9404d[this.f9407g.mo6305a(oVar.f8848n)], false);
        f.getClass();
        int i = (int) (oVar.f8895t - f.f9282h);
        if (i < 0) {
            return 1;
        }
        if (i < f.f9289o.size()) {
            list = ((C3141i) f.f9289o.get(i)).f9258b;
        } else {
            list = f.f9290p;
        }
        if (oVar.f9437e >= list.size()) {
            return 2;
        }
        C3139g gVar = (C3139g) list.get(oVar.f9437e);
        if (gVar.f9253b) {
            return 0;
        }
        if (C2612ak.m6951aa(Uri.parse(C2610ai.m6915a(f.f9314t, gVar.f9259c)), oVar.f8846l.f6891a)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: d */
    public final C3050f mo7170d(Uri uri, int i) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        byte[] bArr = (byte[]) this.f9409i.f9389a.remove(uri2);
        if (bArr != null) {
            this.f9409i.mo7166b(uri2, bArr);
            return null;
        }
        return new C3167g(this.f9419s, C2509m.m6615a(uri, 0, Collections.emptyMap(), 0, -1, (String) null, 1), this.f9405e[i], this.f9416p.mo7022b(), this.f9416p.mo7023c(), this.f9412l);
    }

    /* renamed from: c */
    public final Pair mo7169c(C3175o oVar, boolean z, C3144l lVar, long j, long j2) {
        List list;
        long j3;
        int i = -1;
        if (oVar == null || z) {
            long j4 = lVar.f9292r + j;
            if (oVar != null && !this.f9415o) {
                j2 = oVar.f8851q;
            }
            if (!lVar.f9286l && j2 >= j4) {
                return new Pair(Long.valueOf(lVar.f9282h + ((long) lVar.f9289o.size())), -1);
            }
            long j5 = j2 - j;
            int i2 = 0;
            int b = C2612ak.m6977b(lVar.f9289o, Long.valueOf(j5), true, !((C3137e) this.f9406f).f9248k || oVar == null);
            long j6 = ((long) b) + lVar.f9282h;
            if (b >= 0) {
                C3141i iVar = (C3141i) lVar.f9289o.get(b);
                if (j5 < iVar.f9263g + iVar.f9261e) {
                    list = iVar.f9258b;
                } else {
                    list = lVar.f9290p;
                }
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    C3139g gVar = (C3139g) list.get(i2);
                    if (j5 >= gVar.f9263g + gVar.f9261e) {
                        i2++;
                    } else if (gVar.f9252a) {
                        j6 += list == lVar.f9290p ? 1 : 0;
                        i = i2;
                    }
                }
            }
            return new Pair(Long.valueOf(j6), Integer.valueOf(i));
        } else if (!oVar.f9439g) {
            return new Pair(Long.valueOf(oVar.f8895t), Integer.valueOf(oVar.f9437e));
        } else {
            int i3 = oVar.f9437e;
            if (i3 == -1) {
                j3 = oVar.mo6999k();
            } else {
                j3 = oVar.f8895t;
            }
            Long valueOf = Long.valueOf(j3);
            if (i3 != -1) {
                i = i3 + 1;
            }
            return new Pair(valueOf, Integer.valueOf(i));
        }
    }

    /* renamed from: e */
    public final C3061q[] mo7171e(C3175o oVar, long j) {
        int i;
        int i2;
        List list;
        C3175o oVar2 = oVar;
        if (oVar2 == null) {
            i = -1;
        } else {
            i = this.f9407g.mo6305a(oVar2.f8848n);
        }
        int j2 = this.f9416p.mo7032j();
        C3061q[] qVarArr = new C3061q[j2];
        boolean z = false;
        int i3 = 0;
        while (i3 < j2) {
            int f = this.f9416p.mo7027f(i3);
            Uri uri = this.f9404d[f];
            if (!this.f9406f.mo7145h(uri)) {
                qVarArr[i3] = C3061q.f8896b;
                i2 = i3;
            } else {
                C3144l f2 = this.f9406f.mo7143f(uri, z);
                f2.getClass();
                i2 = i3;
                long j3 = f2.f9279e - ((C3137e) this.f9406f).f9249l;
                C3144l lVar = f2;
                Pair c = mo7169c(oVar, f != i, f2, j3, j);
                long longValue = ((Long) c.first).longValue();
                int intValue = ((Integer) c.second).intValue();
                int i4 = (int) (longValue - lVar.f9282h);
                if (i4 < 0 || lVar.f9289o.size() < i4) {
                    list = C58485gu.m89845m();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i4 < lVar.f9289o.size()) {
                        if (intValue != -1) {
                            C3141i iVar = (C3141i) lVar.f9289o.get(i4);
                            if (intValue == 0) {
                                arrayList.add(iVar);
                            } else if (intValue < iVar.f9258b.size()) {
                                List list2 = iVar.f9258b;
                                arrayList.addAll(list2.subList(intValue, list2.size()));
                            }
                            i4++;
                        }
                        List list3 = lVar.f9289o;
                        arrayList.addAll(list3.subList(i4, list3.size()));
                        intValue = 0;
                    }
                    if (lVar.f9285k != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < lVar.f9290p.size()) {
                            List list4 = lVar.f9290p;
                            arrayList.addAll(list4.subList(intValue, list4.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
                qVarArr[i2] = new C3169i(j3, list);
            }
            i3 = i2 + 1;
            z = false;
        }
        return qVarArr;
    }
}
