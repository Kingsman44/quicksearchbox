package com.google.android.libraries.mdi.download.p2236d;

import android.net.Uri;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.mdi.download.d.n */
/* compiled from: PG */
public final /* synthetic */ class C29302n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79419a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f79420b;

    /* renamed from: c */
    public final /* synthetic */ List f79421c;

    /* renamed from: d */
    public final /* synthetic */ List f79422d;

    public /* synthetic */ C29302n(C29314z zVar, AtomicInteger atomicInteger, List list, List list2) {
        this.f79419a = zVar;
        this.f79420b = atomicInteger;
        this.f79421c = list;
        this.f79422d = list2;
    }

    public final Object call() {
        C29314z zVar = this.f79419a;
        AtomicInteger atomicInteger = this.f79420b;
        List<Uri> list = this.f79421c;
        List list2 = this.f79422d;
        if (atomicInteger.get() > 0) {
            zVar.f79444e.mo34545j(4, atomicInteger.get());
        }
        Uri a = C29090d.m53980a(zVar.f79440a, zVar.f79447h);
        int i = 0;
        for (Uri f : list) {
            try {
                zVar.f79446g.mo45892f(f);
                i++;
                zVar.f79444e.mo34543h(1086);
            } catch (IOException e) {
                zVar.f79444e.mo34543h(1076);
                C29045l.m53938j(e, "%s: Failed to release unaccounted file!", "ExpirationHandler");
            }
        }
        C29045l.m53931c("%s: Total %d unaccounted file released. ", "ExpirationHandler", Integer.valueOf(i));
        int a2 = zVar.mo34651a(a, list2);
        C29045l.m53931c("%s: Total %d unaccounted file deleted. ", "ExpirationHandler", Integer.valueOf(a2));
        if (a2 > 0) {
            zVar.f79444e.mo34545j(5, a2);
        }
        if (i <= 0) {
            return null;
        }
        zVar.f79444e.mo34545j(8, i);
        return null;
    }
}
