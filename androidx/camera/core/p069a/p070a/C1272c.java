package androidx.camera.core.p069a.p070a;

import android.util.Size;
import java.util.Comparator;

/* renamed from: androidx.camera.core.a.a.c */
/* compiled from: PG */
public final class C1272c implements Comparator {

    /* renamed from: a */
    private final boolean f3680a;

    public C1272c() {
        this.f3680a = false;
    }

    public C1272c(boolean z) {
        this.f3680a = z;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f3680a ? -signum : signum;
    }
}
