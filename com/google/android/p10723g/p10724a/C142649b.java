package com.google.android.p10723g.p10724a;

import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.p10723g.C142647a;
import com.google.android.p10723g.C142653c;
import com.google.android.p10723g.C142654d;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;

/* renamed from: com.google.android.g.a.b */
/* compiled from: PG */
public final class C142649b {

    /* renamed from: a */
    private final C143658k f387085a;

    /* renamed from: b */
    private final C142654d f387086b;

    public C142649b(C143658k kVar, String str, C142654d dVar) {
        try {
            throw new IllegalArgumentException(String.format("Clearcut does not support setting log source int values (%s, %d). Use log source name instead.", new Object[]{str, Integer.valueOf(Integer.parseInt(str))}));
        } catch (NumberFormatException unused) {
            this.f387085a = kVar;
            this.f387086b = dVar;
        }
    }

    /* renamed from: a */
    public final void mo117432a(C142653c cVar) {
        C142647a aVar = (C142647a) cVar;
        C143657j jVar = new C143657j(this.f387085a, (byte[]) this.f387086b.mo37381a(aVar.f387083b));
        int i = 1;
        if (aVar.f387084c + -1 == 1) {
            i = 2;
        }
        jVar.f389473o = i;
        Integer num = aVar.f387082a;
        if (num != null) {
            int intValue = num.intValue();
            C58149a aVar2 = jVar.f389461c;
            aVar2.copyOnWrite();
            C58150b bVar = (C58150b) aVar2.instance;
            C58150b bVar2 = C58150b.f155459k;
            bVar.f155461a |= 16;
            bVar.f155464d = intValue;
        }
        jVar.mo118992a().mo117321f(new C142648a());
    }
}
