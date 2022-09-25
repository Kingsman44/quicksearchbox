package androidx.media3.p132b.p133a;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.p131a.C2452c;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.media3.b.a.r */
/* compiled from: PG */
final class C2473r {

    /* renamed from: a */
    public final HashMap f6802a = new HashMap();

    /* renamed from: b */
    public final SparseArray f6803b = new SparseArray();

    /* renamed from: c */
    public final C2472q f6804c;

    /* renamed from: d */
    public C2472q f6805d;

    /* renamed from: e */
    private final SparseBooleanArray f6806e = new SparseBooleanArray();

    /* renamed from: f */
    private final SparseBooleanArray f6807f = new SparseBooleanArray();

    public C2473r(C2452c cVar, File file) {
        C2470o oVar = new C2470o(cVar);
        C2471p pVar = new C2471p(new File(file, "cached_content_index.exi"));
        this.f6804c = oVar;
        this.f6805d = pVar;
    }

    /* renamed from: c */
    public static C2476u m6516c(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < readInt) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = C2612ak.f7254f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
                i++;
            } else {
                throw new IOException("Invalid value size: " + readInt2);
            }
        }
        return new C2476u(hashMap);
    }

    /* renamed from: a */
    public final C2469n mo5901a(String str) {
        return (C2469n) this.f6802a.get(str);
    }

    /* renamed from: b */
    public final C2469n mo5902b(String str) {
        int i;
        C2469n nVar = (C2469n) this.f6802a.get(str);
        if (nVar != null) {
            return nVar;
        }
        SparseArray sparseArray = this.f6803b;
        int size = sparseArray.size();
        int i2 = 0;
        if (size == 0) {
            i = 0;
        } else {
            i = sparseArray.keyAt(size - 1) + 1;
        }
        if (i < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            i = i2;
        }
        C2469n nVar2 = new C2469n(i, str, C2476u.f6810a);
        this.f6802a.put(str, nVar2);
        this.f6803b.put(i, str);
        this.f6807f.put(i, true);
        this.f6804c.mo5898b(nVar2);
        return nVar2;
    }

    /* renamed from: d */
    public final void mo5903d(String str) {
        C2469n nVar = (C2469n) this.f6802a.get(str);
        if (nVar != null && nVar.f6792c.isEmpty() && nVar.f6793d.isEmpty()) {
            this.f6802a.remove(str);
            int i = nVar.f6790a;
            boolean z = this.f6807f.get(i);
            C2472q qVar = this.f6804c;
            if (z) {
                ((C2470o) qVar).f6796b.delete(nVar.f6790a);
                this.f6803b.remove(i);
                this.f6807f.delete(i);
                return;
            }
            ((C2470o) qVar).f6796b.put(nVar.f6790a, (Object) null);
            this.f6803b.put(i, (Object) null);
            this.f6806e.put(i, true);
        }
    }

    /* renamed from: e */
    public final void mo5904e() {
        this.f6804c.mo5900d();
        int size = this.f6806e.size();
        for (int i = 0; i < size; i++) {
            this.f6803b.remove(this.f6806e.keyAt(i));
        }
        this.f6806e.clear();
        this.f6807f.clear();
    }
}
