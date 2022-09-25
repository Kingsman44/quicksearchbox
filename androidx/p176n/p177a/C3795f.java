package androidx.p176n.p177a;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import androidx.p060c.C0984n;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.n.a.f */
/* compiled from: PG */
public final class C3795f {

    /* renamed from: a */
    public int f12234a = 16;

    /* renamed from: b */
    private final Bitmap f12235b;

    /* renamed from: c */
    private final List f12236c;

    /* renamed from: d */
    private final List f12237d;

    public C3795f(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f12236c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f12237d = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(C3798i.f12247f);
        this.f12235b = bitmap;
        arrayList.add(C3799j.f12253a);
        arrayList.add(C3799j.f12254b);
        arrayList.add(C3799j.f12255c);
        arrayList.add(C3799j.f12256d);
        arrayList.add(C3799j.f12257e);
        arrayList.add(C3799j.f12258f);
    }

    /* renamed from: a */
    public final C3798i mo8023a() {
        double d;
        C3793d[] dVarArr;
        char c;
        float f;
        Bitmap bitmap = this.f12235b;
        int width = bitmap.getWidth() * bitmap.getHeight();
        if (width > 12544) {
            double d2 = (double) width;
            Double.isNaN(d2);
            d = Math.sqrt(12544.0d / d2);
        } else {
            d = -1.0d;
        }
        char c2 = 0;
        if (d > C59203do.f157270a) {
            double width2 = (double) bitmap.getWidth();
            Double.isNaN(width2);
            double height = (double) bitmap.getHeight();
            Double.isNaN(height);
            bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width2 * d), (int) Math.ceil(height * d), false);
        }
        int width3 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int[] iArr = new int[(width3 * height2)];
        bitmap.getPixels(iArr, 0, width3, 0, 0, width3, height2);
        int i = this.f12234a;
        if (this.f12237d.isEmpty()) {
            dVarArr = null;
        } else {
            List list = this.f12237d;
            dVarArr = (C3793d[]) list.toArray(new C3793d[list.size()]);
        }
        C3792c cVar = new C3792c(iArr, i, dVarArr);
        if (bitmap != this.f12235b) {
            bitmap.recycle();
        }
        C3798i iVar = new C3798i(cVar.f12229c, this.f12236c);
        int size = iVar.f12249b.size();
        int i2 = 0;
        while (i2 < size) {
            C3799j jVar = (C3799j) iVar.f12249b.get(i2);
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i3 = 0; i3 < 3; i3++) {
                float f4 = jVar.f12261i[i3];
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                for (int i4 = 0; i4 < 3; i4++) {
                    float[] fArr = jVar.f12261i;
                    float f5 = fArr[i4];
                    if (f5 > 0.0f) {
                        fArr[i4] = f5 / f3;
                    }
                }
            }
            C0984n nVar = iVar.f12250c;
            int size2 = iVar.f12248a.size();
            int i5 = 0;
            C3797h hVar = null;
            float f6 = 0.0f;
            while (i5 < size2) {
                C3797h hVar2 = (C3797h) iVar.f12248a.get(i5);
                float[] a = hVar2.mo8026a();
                float f7 = a[1];
                float[] fArr2 = jVar.f12259g;
                if (f7 >= fArr2[c2] && f7 <= fArr2[2]) {
                    float f8 = a[2];
                    float[] fArr3 = jVar.f12260h;
                    if (f8 >= fArr3[c2] && f8 <= fArr3[2] && !iVar.f12251d.get(hVar2.f12238a)) {
                        float[] a2 = hVar2.mo8026a();
                        C3797h hVar3 = iVar.f12252e;
                        int i6 = hVar3 != null ? hVar3.f12239b : 1;
                        float f9 = jVar.f12261i[c2];
                        if (f9 > f2) {
                            c = 1;
                            f = f9 * (1.0f - Math.abs(a2[1] - jVar.f12259g[1]));
                        } else {
                            c = 1;
                            f = 0.0f;
                        }
                        float f10 = jVar.f12261i[c];
                        float abs = f10 > f2 ? f10 * (1.0f - Math.abs(a2[2] - jVar.f12260h[c])) : 0.0f;
                        float f11 = jVar.f12261i[2];
                        float f12 = f + abs + (f11 > 0.0f ? f11 * (((float) hVar2.f12239b) / ((float) i6)) : 0.0f);
                        if (hVar == null || f12 > f6) {
                            f6 = f12;
                            hVar = hVar2;
                        }
                    }
                }
                i5++;
                f2 = 0.0f;
                c2 = 0;
            }
            if (hVar != null) {
                boolean z = jVar.f12262j;
                iVar.f12251d.append(hVar.f12238a, true);
            }
            nVar.put(jVar, hVar);
            i2++;
            c2 = 0;
        }
        iVar.f12251d.clear();
        return iVar;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo8024b(C3796g gVar) {
        gVar.getClass();
        new C3794e(this, gVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.f12235b});
    }
}
