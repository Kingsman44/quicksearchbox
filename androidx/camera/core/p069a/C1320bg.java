package androidx.camera.core.p069a;

import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.a.bg */
/* compiled from: PG */
public final class C1320bg {
    /* renamed from: a */
    public static void m3527a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C1314ba) it.next()).mo4178d();
        }
    }

    /* renamed from: b */
    public static void m3528b(List list) {
        if (!list.isEmpty()) {
            int i = 0;
            do {
                try {
                    ((C1314ba) list.get(i)).mo4179e();
                    i++;
                } catch (C1311ay e) {
                    while (true) {
                        i--;
                        if (i >= 0) {
                            ((C1314ba) list.get(i)).mo4178d();
                        } else {
                            throw e;
                        }
                    }
                }
            } while (i < list.size());
        }
    }

    /* renamed from: c */
    public static C60870cx m3529c(Collection collection, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C1263l.m3431c(((C1314ba) it.next()).mo4176b()));
        }
        return C2169h.m6027a(new C1318be(arrayList, scheduledExecutorService, executor));
    }
}
