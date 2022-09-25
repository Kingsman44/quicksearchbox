package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.q */
/* compiled from: PG */
final class C136739q implements C42844bc {

    /* renamed from: a */
    final /* synthetic */ C136747y f372210a;

    /* renamed from: b */
    final /* synthetic */ long f372211b;

    public C136739q(C136747y yVar, long j) {
        this.f372210a = yVar;
        this.f372211b = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo45922a(C42847bf bfVar) {
        C136747y yVar = this.f372210a;
        String str = yVar.f372236a;
        String str2 = yVar.f372238c;
        boolean z = true;
        if (bfVar.mo45930b(str, str2.concat(" < ?"), String.valueOf(this.f372211b)) <= 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
