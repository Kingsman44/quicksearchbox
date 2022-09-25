package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.C42310ci;
import com.google.android.libraries.social.populous.core.C42313cl;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.base.C58833ax;
import com.google.p4181bi.C55856r;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.social.populous.am */
/* compiled from: PG */
final class C42159am implements Comparator {

    /* renamed from: a */
    private final C42405ab f110420a;

    public C42159am(C42405ab abVar) {
        this.f110420a = abVar;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C55856r rVar = (C55856r) obj2;
        C58833ax d = this.f110420a.mo45402d((C55856r) obj);
        C42310ci ciVar = null;
        C42310ci a = d.mo56113h() ? ((C42313cl) d.mo56107c()).mo45275a() : null;
        boolean z = a != null && a.mo45270e();
        C58833ax d2 = this.f110420a.mo45402d(rVar);
        if (d2.mo56113h()) {
            ciVar = ((C42313cl) d2.mo56107c()).mo45275a();
        }
        boolean z2 = ciVar != null && ciVar.mo45270e();
        if (z) {
            if (!z2) {
                return -1;
            }
            z2 = true;
        }
        return (z || !z2) ? 0 : 1;
    }
}
