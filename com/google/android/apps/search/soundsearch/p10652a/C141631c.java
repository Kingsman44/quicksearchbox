package com.google.android.apps.search.soundsearch.p10652a;

import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141678h;
import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141679i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4535g.C59203do;
import com.google.common.p4541l.C59332o;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.soundsearch.a.c */
/* compiled from: PG */
public final /* synthetic */ class C141631c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C141633e f384443a;

    public /* synthetic */ C141631c(C141633e eVar) {
        this.f384443a = eVar;
    }

    public final Object call() {
        C141633e eVar = this.f384443a;
        InputStream a = eVar.mo116623a();
        C141679i iVar = eVar.f384446c;
        Objects.requireNonNull(iVar);
        int i = 1024;
        double[] dArr = new double[1024];
        float[] fArr = new float[15];
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (C59332o.m92210a(a, bArr, 0, i2) == i2) {
            try {
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = i3 + i3;
                    double d = (double) ((bArr[i4 + 1] << 8) + (bArr[i4] & 255));
                    Double.isNaN(d);
                    dArr[i3] = d / 32768.0d;
                }
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < i; i5++) {
                    arrayList.add(Double.valueOf(dArr[i5]));
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    arrayList2.add(new C141635g(((Double) arrayList.get(i6)).doubleValue(), C59203do.f157270a));
                    i6++;
                    dArr = dArr;
                }
                double[] dArr2 = dArr;
                List<C141635g> subList = C141636h.m229852a(arrayList2).subList(0, arrayList.size() / 2);
                ArrayList arrayList3 = new ArrayList();
                for (C141635g gVar : subList) {
                    arrayList3.add(Double.valueOf(Math.hypot(gVar.f384455a, gVar.f384456b)));
                }
                float[] fArr2 = new float[8];
                int i7 = 16;
                int i8 = 0;
                while (i8 <= 7) {
                    int i9 = i8 == 0 ? 8 : 32;
                    double d2 = 0.0d;
                    int i10 = 0;
                    while (i10 < i9) {
                        int i11 = i7 + 1;
                        d2 += ((Double) arrayList3.get(i7)).doubleValue();
                        i10++;
                        i7 = i11;
                    }
                    double d3 = (double) i9;
                    Double.isNaN(d3);
                    fArr2[i8] = (float) (Math.log10(d2 / d3) * 20.0d);
                    i8++;
                }
                for (int i12 = 0; i12 <= 7; i12++) {
                    fArr2[i12] = 1.0f - (Math.max(-35.0f, fArr2[i12]) / -35.0f);
                }
                Arrays.sort(fArr2);
                for (int i13 = 6; i13 >= 0; i13--) {
                    fArr2[i13] = Math.max(fArr2[i13], fArr2[i13 + 1] / 1.4f);
                }
                for (int i14 = 0; i14 <= 7; i14++) {
                    float f = fArr2[i14];
                    fArr[i14] = f;
                    fArr[14 - i14] = f;
                }
                iVar.f384535a.f384538c.execute(C47810es.m84977q(new C141678h(iVar, fArr)));
                dArr = dArr2;
                i = 1024;
                i2 = 2048;
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C141637i.f384457a.mo56226d()).mo56382g(e)).mo56372aa(41769)).mo56386p("Failed to generate waveform");
                return null;
            }
        }
        return null;
    }
}
