package androidx.camera.core.p073b.p074a.p076b;

import android.media.MediaCodec;
import androidx.camera.core.C1506cj;
import androidx.camera.core.C1554ed;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p073b.p074a.p075a.C1428a;
import androidx.camera.core.p073b.p074a.p075a.C1431d;

/* renamed from: androidx.camera.core.b.a.b.b */
/* compiled from: PG */
public final class C1433b {

    /* renamed from: a */
    public final boolean f3990a;

    public C1433b() {
        this.f3990a = C1428a.f3989a.mo4225a(C1431d.class) != null;
    }

    /* renamed from: a */
    public static final int m3895a(C1314ba baVar) {
        Class<C1506cj> cls = baVar.f3780s;
        if (cls == MediaCodec.class || cls == C1554ed.class) {
            return 2;
        }
        return cls == C1506cj.class ? 0 : 1;
    }
}
