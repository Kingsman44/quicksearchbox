package androidx.work.impl.p207b;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3966s;
import androidx.p182p.p185c.C3940b;
import java.util.TreeMap;

/* renamed from: androidx.work.impl.b.h */
/* compiled from: PG */
public final class C4499h implements C4497f {

    /* renamed from: a */
    private final C3925ah f14259a;

    /* renamed from: b */
    private final C3966s f14260b;

    public C4499h(C3925ah ahVar) {
        this.f14259a = ahVar;
        this.f14260b = new C4498g(ahVar);
    }

    /* renamed from: a */
    public final Long mo9456a(String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT long_value FROM Preference where `key`=?", 1);
        a.mo8206g(1, str);
        this.f14259a.mo8175S();
        Long l = null;
        Cursor a2 = C3940b.m11293a(this.f14259a, a, false, (CancellationSignal) null);
        try {
            if (a2.moveToFirst()) {
                if (!a2.isNull(0)) {
                    l = Long.valueOf(a2.getLong(0));
                }
            }
            return l;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: b */
    public final void mo9457b(C4496e eVar) {
        this.f14259a.mo8175S();
        this.f14259a.mo8181p();
        try {
            this.f14260b.mo8308c(eVar);
            this.f14259a.mo8188w();
        } finally {
            this.f14259a.mo8183r();
        }
    }
}
