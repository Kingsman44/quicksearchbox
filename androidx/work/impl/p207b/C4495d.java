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

/* renamed from: androidx.work.impl.b.d */
/* compiled from: PG */
public final class C4495d implements C4492b {

    /* renamed from: a */
    private final C3925ah f14255a;

    /* renamed from: b */
    private final C3966s f14256b;

    public C4495d(C3925ah ahVar) {
        this.f14255a = ahVar;
        this.f14256b = new C4494c(ahVar);
    }

    /* renamed from: a */
    public final List mo9449a(String str) {
        String str2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14255a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14255a, a, false, (CancellationSignal) null);
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
    public final void mo9450b(C4465a aVar) {
        this.f14255a.mo8175S();
        this.f14255a.mo8181p();
        try {
            this.f14256b.mo8308c(aVar);
            this.f14255a.mo8188w();
        } finally {
            this.f14255a.mo8183r();
        }
    }

    /* renamed from: c */
    public final boolean mo9451c(String str) {
        TreeMap treeMap = C3930am.f12576a;
        boolean z = true;
        C3930am a = C3929al.m11267a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14255a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14255a, a, false, (CancellationSignal) null);
        try {
            if (!a2.moveToFirst() || a2.getInt(0) == 0) {
                z = false;
            }
            return z;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: d */
    public final boolean mo9452d(String str) {
        TreeMap treeMap = C3930am.f12576a;
        boolean z = true;
        C3930am a = C3929al.m11267a("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14255a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14255a, a, false, (CancellationSignal) null);
        try {
            if (!a2.moveToFirst() || a2.getInt(0) == 0) {
                z = false;
            }
            return z;
        } finally {
            a2.close();
            a.mo8207h();
        }
    }
}
