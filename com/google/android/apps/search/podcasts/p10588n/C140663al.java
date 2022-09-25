package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140649a;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import java.util.Comparator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.n.al */
/* compiled from: PG */
final class C140663al implements Comparator {

    /* renamed from: a */
    final /* synthetic */ C140651c f382040a;

    public C140663al(C140651c cVar) {
        this.f382040a = cVar;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2;
        C140641b bVar = (C140641b) obj;
        C140641b bVar2 = (C140641b) obj2;
        C140649a a = C140649a.m228441a(this.f382040a.f382024a);
        if (a == null) {
            a = C140649a.UNRECOGNIZED;
        }
        if (C140662ak.f382039a[a.ordinal()] == 1) {
            j2 = bVar.f381980g;
            j = bVar2.f381980g;
        } else {
            j2 = bVar2.f381980g;
            j = bVar.f381980g;
        }
        return C69664n.m101056b(j2, j);
    }
}
