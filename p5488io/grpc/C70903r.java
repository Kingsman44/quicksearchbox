package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.grpc.r */
/* compiled from: PG */
public final class C70903r {

    /* renamed from: a */
    public static final C70898m f189095a = new C70900o();

    /* renamed from: a */
    public static C70888j m103829a(C70888j jVar, List list) {
        C58838bb.m90866a(jVar, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar = new C70902q(jVar, (C70899n) it.next());
        }
        return jVar;
    }

    /* renamed from: b */
    public static C70888j m103830b(C70888j jVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return m103829a(jVar, arrayList);
    }
}
