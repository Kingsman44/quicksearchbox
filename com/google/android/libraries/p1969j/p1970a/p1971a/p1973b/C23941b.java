package com.google.android.libraries.p1969j.p1970a.p1971a.p1973b;

import android.text.Spanned;
import androidx.core.p096h.C1951d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4538j.p4539a.C59305c;
import com.google.common.p4538j.p4539a.C59308f;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.j.a.a.b.b */
/* compiled from: PG */
public final class C23941b {
    /* renamed from: a */
    public static Spanned m44523a(C59308f fVar) {
        return C1951d.m5280a(new C59305c(fVar.f157474a).f157465a, 0);
    }

    /* renamed from: b */
    public static C58485gu m44524b(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e.mo55395g(m44523a((C59308f) it.next()));
        }
        return e.mo55394f();
    }
}
