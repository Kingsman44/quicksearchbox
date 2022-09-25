package androidx.camera.core.p069a;

import androidx.camera.core.C1472br;
import androidx.camera.core.C1473bs;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1264m;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.a.ct */
/* compiled from: PG */
public final class C1360ct implements C1329bp {

    /* renamed from: a */
    private final int f3849a;

    /* renamed from: b */
    private final C1473bs f3850b;

    public C1360ct(C1473bs bsVar, String str) {
        C1472br e = bsVar.mo4305e();
        if (e != null) {
            Integer num = (Integer) e.mo4333d().mo4257d(str);
            if (num != null) {
                this.f3849a = num.intValue();
                this.f3850b = bsVar;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    /* renamed from: a */
    public final C60870cx mo4196a(int i) {
        return i != this.f3849a ? new C1264m(new IllegalArgumentException("Capture id does not exist in the bundle")) : C1263l.m3430b(this.f3850b);
    }

    /* renamed from: b */
    public final List mo4197b() {
        return Collections.singletonList(Integer.valueOf(this.f3849a));
    }

    /* renamed from: c */
    public final void mo4250c() {
        this.f3850b.close();
    }
}
