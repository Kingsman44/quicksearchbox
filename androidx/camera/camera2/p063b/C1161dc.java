package androidx.camera.camera2.p063b;

import android.util.Size;
import java.util.Comparator;

/* renamed from: androidx.camera.camera2.b.dc */
/* compiled from: PG */
public final /* synthetic */ class C1161dc implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C1161dc f3407a = new C1161dc();

    private /* synthetic */ C1161dc() {
    }

    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
    }
}
