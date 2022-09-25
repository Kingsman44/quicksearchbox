package com.google.android.libraries.assistant.pcp.datastore.room;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.C3966s;
import androidx.p182p.p183a.C3917e;
import androidx.p182p.p185c.C3943e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.room.n */
/* compiled from: PG */
public final class C18627n implements C18621h {

    /* renamed from: a */
    public final C3925ah f52652a;

    /* renamed from: b */
    public final C3966s f52653b;

    public C18627n(C3925ah ahVar) {
        this.f52652a = ahVar;
        this.f52653b = new C18622i(ahVar);
        new C18623j(ahVar);
    }

    /* renamed from: a */
    public final C60870cx mo24086a(int i, String str) {
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT stored_element FROM stored_elements WHERE feature_type = ? AND id = ?", 2);
        a.mo8204e(1, (long) i);
        if (str == null) {
            a.f12582g[2] = 1;
        } else {
            a.mo8206g(2, str);
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f52652a, new C18625l(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: b */
    public final C60870cx mo24087b(Set set) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT stored_element FROM stored_elements WHERE feature_type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(")");
        String sb2 = sb.toString();
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, size);
        Iterator it = set.iterator();
        int i = 1;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num == null) {
                a.f12582g[i] = 1;
            } else {
                a.mo8204e(i, (long) num.intValue());
            }
            i++;
        }
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f52652a, new C18626m(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: c */
    public final C60870cx mo24088c(C18628o oVar) {
        C3925ah ahVar = this.f52652a;
        return C3917e.m11216a(ahVar.mo8172P(), new C18624k(this, oVar));
    }
}
