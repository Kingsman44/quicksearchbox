package com.google.android.apps.gsa.search.core.p6507ag.p6510c;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.search.googleapp.discover.p10182e.p10183a.C134238a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.search.core.ag.c.a */
/* compiled from: PG */
public final /* synthetic */ class C84488a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84489b f229944a;

    /* renamed from: b */
    public final /* synthetic */ long f229945b;

    public /* synthetic */ C84488a(C84489b bVar, long j) {
        this.f229944a = bVar;
        this.f229945b = j;
    }

    public final void run() {
        C84489b bVar = this.f229944a;
        long j = this.f229945b;
        long j2 = ((SharedPreferences) bVar.f229946a.mo27525b()).getLong(C90507o.f253034x, 0);
        ((C134238a) bVar.f229949d.mo27525b()).mo111659b(j2);
        if (j2 != 0) {
            bVar.f229950e = true;
            return;
        }
        ((SharedPreferences) bVar.f229946a.mo27525b()).edit().putLong(C90507o.f253034x, j).apply();
        ((C134238a) bVar.f229949d.mo27525b()).mo111658a(Instant.ofEpochMilli(j));
        bVar.f229950e = true;
    }
}
