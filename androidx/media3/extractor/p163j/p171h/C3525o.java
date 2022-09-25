package androidx.media3.extractor.p163j.p171h;

import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p135a.C2567c;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.p163j.C3482c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.j.h.o */
/* compiled from: PG */
final class C3525o implements C3482c {

    /* renamed from: a */
    private final List f11021a;

    /* renamed from: b */
    private final long[] f11022b;

    /* renamed from: c */
    private final long[] f11023c;

    public C3525o(List list) {
        this.f11021a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.f11022b = new long[(size + size)];
        for (int i = 0; i < list.size(); i++) {
            C3515e eVar = (C3515e) list.get(i);
            int i2 = i + i;
            long[] jArr = this.f11022b;
            jArr[i2] = eVar.f10990b;
            jArr[i2 + 1] = eVar.f10991c;
        }
        long[] jArr2 = this.f11022b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f11023c = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public final int mo7193a() {
        return this.f11023c.length;
    }

    /* renamed from: b */
    public final int mo7194b(long j) {
        int av = C2612ak.m6972av(this.f11023c, j, false);
        if (av < this.f11023c.length) {
            return av;
        }
        return -1;
    }

    /* renamed from: d */
    public final List mo7195d(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f11021a.size(); i++) {
            long[] jArr = this.f11022b;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C3515e eVar = (C3515e) this.f11021a.get(i);
                C2567c cVar = eVar.f10989a;
                if (cVar.f7088g == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        Collections.sort(arrayList2, C3524n.f11020a);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C2566b bVar = new C2566b(((C3515e) arrayList2.get(i3)).f10989a);
            bVar.f7069e = (float) (-1 - i3);
            bVar.f7070f = 1;
            arrayList.add(bVar.mo6076a());
        }
        return arrayList;
    }

    /* renamed from: ff */
    public final long mo7196ff(int i) {
        boolean z = true;
        C2601a.m6830b(i >= 0);
        if (i >= this.f11023c.length) {
            z = false;
        }
        C2601a.m6830b(z);
        return this.f11023c[i];
    }
}
