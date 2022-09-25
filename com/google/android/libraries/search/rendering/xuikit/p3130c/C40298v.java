package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.Comparator;
import p5462h.p5465b.C69544a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.v */
/* compiled from: PG */
public final class C40298v implements Comparator {
    public final int compare(Object obj, Object obj2) {
        C63042fg fgVar = ((C40278b) obj).f105804d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar, "it.lastUsed");
        Long valueOf = Long.valueOf(C62953e.m95478c(fgVar));
        C63042fg fgVar2 = ((C40278b) obj2).f105804d;
        if (fgVar2 == null) {
            fgVar2 = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar2, "it.lastUsed");
        return C69544a.m100954a(valueOf, Long.valueOf(C62953e.m95478c(fgVar2)));
    }
}
