package androidx.camera.core.p069a.p070a;

import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: androidx.camera.core.a.a.h */
/* compiled from: PG */
final class C1277h implements Enumeration {

    /* renamed from: a */
    int f3688a = 0;

    public final boolean hasMoreElements() {
        int i = this.f3688a;
        int i2 = C1280k.f3700e;
        return i < 4;
    }

    public final /* bridge */ /* synthetic */ Object nextElement() {
        this.f3688a++;
        return new HashMap();
    }
}
