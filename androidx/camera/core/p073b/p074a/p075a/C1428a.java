package androidx.camera.core.p073b.p074a.p075a;

import android.os.Build;
import androidx.camera.core.p069a.C1347cg;
import java.util.ArrayList;

/* renamed from: androidx.camera.core.b.a.a.a */
/* compiled from: PG */
public final class C1428a {

    /* renamed from: a */
    public static final C1347cg f3989a;

    static {
        ArrayList arrayList = new ArrayList();
        if (("HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
            arrayList.add(new C1429b());
        }
        arrayList.add(new C1431d());
        f3989a = new C1347cg(arrayList);
    }
}
