package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.p183a.C3917e;
import com.google.common.util.concurrent.C60870cx;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bk */
/* compiled from: PG */
public final class C16112bk implements C16107bf {

    /* renamed from: a */
    public final C3925ah f47592a;

    /* renamed from: b */
    public final C3933ap f47593b;

    public C16112bk(C3925ah ahVar) {
        this.f47592a = ahVar;
        new C16108bg(ahVar);
        this.f47593b = new C16109bh(ahVar);
    }

    /* renamed from: a */
    public final C60870cx mo22761a(int i) {
        C3925ah ahVar = this.f47592a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16110bi(this, i));
    }

    /* renamed from: b */
    public final C60870cx mo22762b(int i) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM partner_app_signal where signal_type = ?", 1);
        a.mo8204e(1, (long) C16088an.m32968e(i));
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47592a, new C16111bj(this, a, cancellationSignal), a, cancellationSignal);
    }
}
