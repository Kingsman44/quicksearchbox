package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.C3966s;
import androidx.p182p.p183a.C3917e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.bv */
/* compiled from: PG */
public final class C16123bv implements C16116bo {

    /* renamed from: a */
    public final C3925ah f47604a;

    /* renamed from: b */
    public final C3966s f47605b;

    /* renamed from: c */
    public final C3933ap f47606c;

    public C16123bv(C3925ah ahVar) {
        this.f47604a = ahVar;
        this.f47605b = new C16117bp(ahVar);
        this.f47606c = new C16118bq(ahVar);
    }

    /* renamed from: a */
    public final C60870cx mo22780a(String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM shortcut_to_display WHERE id =?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47604a, new C16122bu(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: b */
    public final C60870cx mo22781b(List list) {
        C3925ah ahVar = this.f47604a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16119br(this, list));
    }

    /* renamed from: c */
    public final C60870cx mo22782c(String str) {
        C3925ah ahVar = this.f47604a;
        return C3917e.m11216a(ahVar.mo8172P(), new C16120bs(this, str));
    }

    /* renamed from: d */
    public final C60870cx mo22783d(String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT * FROM shortcut_to_display WHERE display_id = ? AND is_displayed_now = ?", 2);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        a.mo8204e(2, 1);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f47604a, new C16121bt(this, a, cancellationSignal), a, cancellationSignal);
    }
}
