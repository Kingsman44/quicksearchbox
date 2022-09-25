package androidx.work.impl.p207b;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3966s;
import androidx.p182p.p185c.C3940b;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* renamed from: androidx.work.impl.b.v */
/* compiled from: PG */
public final class C4513v implements C4511t {

    /* renamed from: a */
    private final C3925ah f14273a;

    /* renamed from: b */
    private final C3966s f14274b;

    public C4513v(C3925ah ahVar) {
        this.f14273a = ahVar;
        this.f14274b = new C4512u(ahVar);
    }

    /* renamed from: a */
    public final List mo9470a(String str) {
        String str2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14273a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14273a, a, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = a2.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: b */
    public final void mo9471b(C4510s sVar) {
        this.f14273a.mo8175S();
        this.f14273a.mo8181p();
        try {
            this.f14274b.mo8308c(sVar);
            this.f14273a.mo8188w();
        } finally {
            this.f14273a.mo8183r();
        }
    }
}
