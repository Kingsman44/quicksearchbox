package androidx.work.impl.p207b;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3933ap;
import androidx.p182p.C3966s;
import androidx.p182p.p185c.C3940b;
import androidx.p186q.p187a.C4057l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.b.az */
/* compiled from: PG */
public final class C4491az implements C4488aw {

    /* renamed from: a */
    public final C3925ah f14252a;

    /* renamed from: b */
    public final C3966s f14253b;

    /* renamed from: c */
    private final C3933ap f14254c;

    public C4491az(C3925ah ahVar) {
        this.f14252a = ahVar;
        this.f14253b = new C4489ax(ahVar);
        this.f14254c = new C4490ay(ahVar);
    }

    /* renamed from: a */
    public final List mo9446a(String str) {
        String str2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a.f12582g[1] = 1;
        } else {
            a.mo8206g(1, str);
        }
        this.f14252a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f14252a, a, false, (CancellationSignal) null);
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
    public final void mo9447b(String str) {
        this.f14252a.mo8175S();
        C4057l d = this.f14254c.mo8212d();
        if (str == null) {
            d.mo8205f(1);
        } else {
            d.mo8206g(1, str);
        }
        this.f14252a.mo8181p();
        try {
            d.mo8256a();
            this.f14252a.mo8188w();
        } finally {
            this.f14252a.mo8183r();
            this.f14254c.mo8215g(d);
        }
    }

    /* renamed from: c */
    public final void mo9448c(String str, Set set) {
        C69664n.m101061g(str, "id");
        C69664n.m101061g(set, "tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4487av avVar = new C4487av((String) it.next(), str);
            this.f14252a.mo8175S();
            this.f14252a.mo8181p();
            try {
                this.f14253b.mo8308c(avVar);
                this.f14252a.mo8188w();
            } finally {
                this.f14252a.mo8183r();
            }
        }
    }
}
