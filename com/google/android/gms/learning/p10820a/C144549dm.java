package com.google.android.gms.learning.p10820a;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.droidguard.C144099a;
import com.google.android.gms.droidguard.internal.C144122b;
import com.google.android.gms.droidguard.internal.C144124d;
import com.google.android.gms.droidguard.internal.C144128h;
import com.google.android.libraries.micore.learning.base.C29717i;
import com.google.android.libraries.micore.learning.training.nflrunner.C29746d;
import java.util.Map;

/* renamed from: com.google.android.gms.learning.a.dm */
/* compiled from: PG */
public final class C144549dm implements C29717i {

    /* renamed from: a */
    private final Context f391190a;

    public C144549dm(Context context) {
        this.f391190a = context;
    }

    /* renamed from: a */
    public final void mo34861a(String str, Map map, C29746d dVar) {
        Context context = this.f391190a;
        C144548dl dlVar = new C144548dl(dVar);
        C144128h hVar = new C144099a(context).f390378a;
        C144124d dVar2 = new C144124d(hVar, str, map, dlVar);
        long a = (long) dVar2.f390437e.mo119651a();
        hVar.f390426b.postAtTime(new C144122b(hVar, dVar2, a), dVar2, a + SystemClock.uptimeMillis());
        hVar.f390425a.mo119683b(dVar2);
    }
}
