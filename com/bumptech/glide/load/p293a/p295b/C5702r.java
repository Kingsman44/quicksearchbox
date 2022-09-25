package com.bumptech.glide.load.p293a.p295b;

import androidx.core.p097i.C1971f;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.p291h.C5627n;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.C5632s;
import com.bumptech.glide.p291h.p292a.C5612h;

/* renamed from: com.bumptech.glide.load.a.b.r */
/* compiled from: PG */
public final class C5702r {

    /* renamed from: a */
    private final C5627n f17177a = new C5627n(1000);

    /* renamed from: b */
    private final C1971f f17178b = C5612h.m14575a(10, new C5700p());

    /* renamed from: a */
    public final String mo12198a(C5955n nVar) {
        String str;
        synchronized (this.f17177a) {
            str = (String) this.f17177a.mo12078f(nVar);
        }
        if (str == null) {
            C5701q qVar = (C5701q) this.f17178b.mo5126a();
            C5630q.m14607d(qVar, "Argument must not be null");
            try {
                nVar.mo12041a(qVar.f17175a);
                byte[] digest = qVar.f17175a.digest();
                synchronized (C5632s.f16975b) {
                    char[] cArr = C5632s.f16975b;
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i] & 255;
                        int i2 = i + i;
                        char[] cArr2 = C5632s.f16974a;
                        cArr[i2] = cArr2[b >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
                this.f17178b.mo5127b(qVar);
            } catch (Throwable th) {
                this.f17178b.mo5127b(qVar);
                throw th;
            }
        }
        synchronized (this.f17177a) {
            this.f17177a.mo12079g(nVar, str);
        }
        return str;
    }
}
