package com.google.android.libraries.social.populous.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.p183a.C3917e;
import androidx.p182p.p185c.C3940b;
import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.social.populous.storage.bz */
/* compiled from: PG */
public final class C42652bz extends C42648bv {

    /* renamed from: a */
    public final C3925ah f111861a;

    public C42652bz(C3925ah ahVar) {
        this.f111861a = ahVar;
        new C42649bw(ahVar);
        new C42650bx(ahVar);
    }

    /* renamed from: a */
    public final C58485gu mo45754a(long j) {
        String str;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a("SELECT candidate_id FROM ContextualCandidateInfo WHERE last_updated < ?", 1);
        a.mo8204e(1, j);
        this.f111861a.mo8175S();
        Cursor a2 = C3940b.m11293a(this.f111861a, a, false, (CancellationSignal) null);
        try {
            C58480gp e = C58485gu.m89837e();
            while (a2.moveToNext()) {
                if (a2.isNull(0)) {
                    str = null;
                } else {
                    str = a2.getString(0);
                }
                e.mo55395g(str);
            }
            return e.mo55394f();
        } finally {
            a2.close();
            a.mo8207h();
        }
    }

    /* renamed from: b */
    public final C60870cx mo45755b(List list, long j) {
        C3925ah ahVar = this.f111861a;
        return C3917e.m11216a(ahVar.mo8172P(), new C42651by(this, list, j));
    }

    /* renamed from: c */
    public final void mo45756c(List list) {
        this.f111861a.mo8175S();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ContextualCandidateInfo WHERE candidate_id IN (");
        int size = list.size();
        C3943e.m11297a(sb, size);
        sb.append(")AND last_updated < ?");
        C4057l L = this.f111861a.mo8168L(sb.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                L.mo8205f(i);
            } else {
                L.mo8206g(i, str);
            }
            i++;
        }
        L.mo8204e(size + 1, Long.MAX_VALUE);
        this.f111861a.mo8181p();
        try {
            L.mo8256a();
            this.f111861a.mo8188w();
        } finally {
            this.f111861a.mo8183r();
        }
    }
}
