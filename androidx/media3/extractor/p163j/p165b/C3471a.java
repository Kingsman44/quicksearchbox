package androidx.media3.extractor.p163j.p165b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.p163j.C3470b;
import androidx.media3.extractor.p163j.C3482c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.b.a */
/* compiled from: PG */
public final class C3471a extends C3470b {

    /* renamed from: f */
    private final C3480j f10777f;

    public C3471a(List list) {
        C2604ac acVar = new C2604ac((byte[]) list.get(0));
        this.f10777f = new C3480j(acVar.mo6142j(), acVar.mo6142j());
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C3482c mo7433l(byte[] bArr, int i, boolean z) {
        C3481k kVar;
        List list;
        C3481k kVar2;
        int i2;
        int i3;
        C3481k kVar3;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        Paint paint;
        int[] iArr;
        C3477g gVar;
        int i4;
        int i5;
        int i6;
        int i7;
        if (z) {
            C3479i iVar = this.f10777f.f10826f;
            iVar.f10811c.clear();
            iVar.f10812d.clear();
            iVar.f10813e.clear();
            iVar.f10814f.clear();
            iVar.f10815g.clear();
            iVar.f10816h = null;
            iVar.f10817i = null;
        }
        C3480j jVar = this.f10777f;
        C2603ab abVar = new C2603ab(bArr, i);
        while (abVar.mo6116a() >= 48 && abVar.mo6119d(8) == 15) {
            C3479i iVar2 = jVar.f10826f;
            int d = abVar.mo6119d(8);
            int i8 = 16;
            int d2 = abVar.mo6119d(16);
            int d3 = abVar.mo6119d(16);
            int b = abVar.mo6117b() + d3;
            if (d3 * 8 > abVar.mo6116a()) {
                C2633u.m7050e("DvbParser", "Data field length exceeds limit");
                abVar.mo6126k(abVar.mo6116a());
            } else {
                switch (d) {
                    case 16:
                        if (d2 == iVar2.f10809a) {
                            C3475e eVar = iVar2.f10817i;
                            int i9 = 8;
                            abVar.mo6119d(8);
                            int d4 = abVar.mo6119d(4);
                            int d5 = abVar.mo6119d(2);
                            abVar.mo6126k(2);
                            int i10 = d3 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i10 > 0) {
                                int d6 = abVar.mo6119d(i9);
                                abVar.mo6126k(i9);
                                i10 -= 6;
                                sparseArray3.put(d6, new C3476f(abVar.mo6119d(16), abVar.mo6119d(16)));
                                i9 = 8;
                            }
                            C3475e eVar2 = new C3475e(d4, d5, sparseArray3);
                            if (eVar2.f10793b == 0) {
                                if (!(eVar == null || eVar.f10792a == eVar2.f10792a)) {
                                    iVar2.f10817i = eVar2;
                                    break;
                                }
                            } else {
                                iVar2.f10817i = eVar2;
                                iVar2.f10811c.clear();
                                iVar2.f10812d.clear();
                                iVar2.f10813e.clear();
                                break;
                            }
                        }
                        break;
                    case 17:
                        C3475e eVar3 = iVar2.f10817i;
                        if (d2 == iVar2.f10809a && eVar3 != null) {
                            int d7 = abVar.mo6119d(8);
                            abVar.mo6126k(4);
                            boolean m = abVar.mo6128m();
                            abVar.mo6126k(3);
                            int d8 = abVar.mo6119d(16);
                            int d9 = abVar.mo6119d(16);
                            abVar.mo6119d(3);
                            int d10 = abVar.mo6119d(3);
                            abVar.mo6126k(2);
                            int d11 = abVar.mo6119d(8);
                            int d12 = abVar.mo6119d(8);
                            int d13 = abVar.mo6119d(4);
                            int d14 = abVar.mo6119d(2);
                            abVar.mo6126k(2);
                            int i11 = d3 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i11 > 0) {
                                int d15 = abVar.mo6119d(i8);
                                int d16 = abVar.mo6119d(2);
                                abVar.mo6119d(2);
                                int d17 = abVar.mo6119d(12);
                                abVar.mo6126k(4);
                                int d18 = abVar.mo6119d(12);
                                i11 -= 6;
                                if (d16 == 1 || d16 == 2) {
                                    abVar.mo6119d(8);
                                    abVar.mo6119d(8);
                                    i11 -= 2;
                                }
                                sparseArray4.put(d15, new C3478h(d17, d18));
                                i8 = 16;
                            }
                            C3477g gVar2 = new C3477g(d7, m, d8, d9, d10, d11, d12, d13, d14, sparseArray4);
                            if (eVar3.f10793b == 0 && (gVar = (C3477g) iVar2.f10811c.get(gVar2.f10797a)) != null) {
                                SparseArray sparseArray5 = gVar.f10806j;
                                for (int i12 = 0; i12 < sparseArray5.size(); i12++) {
                                    gVar2.f10806j.put(sparseArray5.keyAt(i12), (C3478h) sparseArray5.valueAt(i12));
                                }
                            }
                            iVar2.f10811c.put(gVar2.f10797a, gVar2);
                            break;
                        }
                    case 18:
                        if (d2 != iVar2.f10809a) {
                            if (d2 == iVar2.f10810b) {
                                C3472b a = C3480j.m10071a(abVar, d3);
                                iVar2.f10814f.put(a.f10778a, a);
                                break;
                            }
                        } else {
                            C3472b a2 = C3480j.m10071a(abVar, d3);
                            iVar2.f10812d.put(a2.f10778a, a2);
                            break;
                        }
                        break;
                    case 19:
                        if (d2 != iVar2.f10809a) {
                            if (d2 == iVar2.f10810b) {
                                C3474d b2 = C3480j.m10072b(abVar);
                                iVar2.f10815g.put(b2.f10788a, b2);
                                break;
                            }
                        } else {
                            C3474d b3 = C3480j.m10072b(abVar);
                            iVar2.f10813e.put(b3.f10788a, b3);
                            break;
                        }
                        break;
                    case 20:
                        if (d2 == iVar2.f10809a) {
                            abVar.mo6126k(4);
                            boolean m2 = abVar.mo6128m();
                            abVar.mo6126k(3);
                            int d19 = abVar.mo6119d(16);
                            int d20 = abVar.mo6119d(16);
                            if (m2) {
                                int d21 = abVar.mo6119d(16);
                                i6 = abVar.mo6119d(16);
                                i5 = abVar.mo6119d(16);
                                i4 = abVar.mo6119d(16);
                                i7 = d21;
                            } else {
                                i6 = d19;
                                i4 = d20;
                                i7 = 0;
                                i5 = 0;
                            }
                            iVar2.f10816h = new C3473c(d19, d20, i7, i6, i5, i4);
                            break;
                        }
                        break;
                }
                abVar.mo6127l(b - abVar.mo6117b());
            }
        }
        C3479i iVar3 = jVar.f10826f;
        C3475e eVar4 = iVar3.f10817i;
        if (eVar4 == null) {
            list = Collections.emptyList();
            kVar2 = kVar;
        } else {
            C3473c cVar = iVar3.f10816h;
            if (cVar == null) {
                cVar = jVar.f10824d;
            }
            Bitmap bitmap = jVar.f10827g;
            if (!(bitmap != null && cVar.f10782a + 1 == bitmap.getWidth() && cVar.f10783b + 1 == jVar.f10827g.getHeight())) {
                jVar.f10827g = Bitmap.createBitmap(cVar.f10782a + 1, cVar.f10783b + 1, Bitmap.Config.ARGB_8888);
                jVar.f10823c.setBitmap(jVar.f10827g);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = eVar4.f10794c;
            int i13 = 0;
            while (i13 < sparseArray6.size()) {
                jVar.f10823c.save();
                C3476f fVar = (C3476f) sparseArray6.valueAt(i13);
                C3477g gVar3 = (C3477g) jVar.f10826f.f10811c.get(sparseArray6.keyAt(i13));
                int i14 = fVar.f10795a + cVar.f10784c;
                int i15 = fVar.f10796b + cVar.f10786e;
                jVar.f10823c.clipRect(i14, i15, Math.min(gVar3.f10799c + i14, cVar.f10785d), Math.min(gVar3.f10800d + i15, cVar.f10787f));
                C3472b bVar = (C3472b) jVar.f10826f.f10812d.get(gVar3.f10802f);
                if (bVar == null && (bVar = (C3472b) jVar.f10826f.f10814f.get(gVar3.f10802f)) == null) {
                    bVar = jVar.f10825e;
                }
                SparseArray sparseArray7 = gVar3.f10806j;
                int i16 = 0;
                while (i16 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i16);
                    C3478h hVar = (C3478h) sparseArray7.valueAt(i16);
                    C3474d dVar = (C3474d) jVar.f10826f.f10813e.get(keyAt);
                    if (dVar == null) {
                        dVar = (C3474d) jVar.f10826f.f10815g.get(keyAt);
                    }
                    if (dVar != null) {
                        if (dVar.f10789b) {
                            paint = null;
                        } else {
                            paint = jVar.f10821a;
                        }
                        int i17 = gVar3.f10801e;
                        sparseArray2 = sparseArray6;
                        int i18 = hVar.f10807a + i14;
                        int i19 = hVar.f10808b + i15;
                        sparseArray = sparseArray7;
                        Canvas canvas = jVar.f10823c;
                        kVar3 = kVar;
                        if (i17 == 3) {
                            iArr = bVar.f10781d;
                        } else if (i17 == 2) {
                            iArr = bVar.f10780c;
                        } else {
                            iArr = bVar.f10779b;
                        }
                        i3 = i13;
                        int[] iArr2 = iArr;
                        int i20 = i17;
                        int i21 = i18;
                        Paint paint2 = paint;
                        Canvas canvas2 = canvas;
                        C3480j.m10073c(dVar.f10790c, iArr2, i20, i21, i19, paint2, canvas2);
                        C3480j.m10073c(dVar.f10791d, iArr2, i20, i21, i19 + 1, paint2, canvas2);
                    } else {
                        kVar3 = kVar;
                        sparseArray2 = sparseArray6;
                        i3 = i13;
                        sparseArray = sparseArray7;
                    }
                    i16++;
                    sparseArray6 = sparseArray2;
                    sparseArray7 = sparseArray;
                    kVar = kVar3;
                    i13 = i3;
                }
                C3481k kVar4 = kVar;
                SparseArray sparseArray8 = sparseArray6;
                int i22 = i13;
                if (gVar3.f10798b) {
                    int i23 = gVar3.f10801e;
                    if (i23 == 3) {
                        i2 = bVar.f10781d[gVar3.f10803g];
                    } else if (i23 == 2) {
                        i2 = bVar.f10780c[gVar3.f10804h];
                    } else {
                        i2 = bVar.f10779b[gVar3.f10805i];
                    }
                    jVar.f10822b.setColor(i2);
                    jVar.f10823c.drawRect((float) i14, (float) i15, (float) (gVar3.f10799c + i14), (float) (gVar3.f10800d + i15), jVar.f10822b);
                }
                C2566b bVar2 = new C2566b();
                bVar2.f7066b = Bitmap.createBitmap(jVar.f10827g, i14, i15, gVar3.f10799c, gVar3.f10800d);
                float f = (float) cVar.f10782a;
                bVar2.f7072h = ((float) i14) / f;
                bVar2.f7073i = 0;
                float f2 = (float) cVar.f10783b;
                bVar2.f7069e = ((float) i15) / f2;
                bVar2.f7070f = 0;
                bVar2.f7071g = 0;
                bVar2.f7076l = ((float) gVar3.f10799c) / f;
                bVar2.f7077m = ((float) gVar3.f10800d) / f2;
                arrayList.add(bVar2.mo6076a());
                jVar.f10823c.drawColor(0, PorterDuff.Mode.CLEAR);
                jVar.f10823c.restore();
                i13 = i22 + 1;
                sparseArray6 = sparseArray8;
                kVar = kVar4;
            }
            list = Collections.unmodifiableList(arrayList);
            kVar2 = kVar;
        }
        return new C3481k(list);
    }
}
