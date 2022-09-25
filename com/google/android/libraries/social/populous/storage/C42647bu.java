package com.google.android.libraries.social.populous.storage;

import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.C3929al;
import androidx.p182p.C3930am;
import androidx.p182p.p183a.C3917e;
import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.google.android.libraries.social.populous.storage.bu */
/* compiled from: PG */
public final class C42647bu extends C42642bp {

    /* renamed from: a */
    public final C3925ah f111857a;

    public C42647bu(C3925ah ahVar) {
        this.f111857a = ahVar;
        new C42643bq(ahVar);
        new C42644br(ahVar);
    }

    /* renamed from: c */
    public final void mo45752c(List list) {
        this.f111857a.mo8175S();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ContextualCandidates WHERE id IN (");
        C3943e.m11297a(sb, list.size());
        sb.append(")");
        C4057l L = this.f111857a.mo8168L(sb.toString());
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
        this.f111857a.mo8181p();
        try {
            L.mo8256a();
            this.f111857a.mo8188w();
        } finally {
            this.f111857a.mo8183r();
        }
    }

    /* renamed from: d */
    public final C60870cx mo45748d(Set set, String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS candidate_id,   c.proto_bytes AS candidate_proto_bytes,   t.candidate_id AS token_candidate_id,   t.value AS token_value,   t.source_type AS token_source_type FROM   ContextualCandidates c   INNER JOIN   ContextualCandidateTokens t ON t.candidate_id = c.id   INNER JOIN   ContextualCandidateContexts cc ON cc.candidate_id = c.id   INNER JOIN   ContextualCandidateInfo cci ON cci.candidate_id = c.id WHERE   t.source_type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(")   AND   cc.context_id = ?   AND   cci.last_updated >= ? GROUP BY   c.id ORDER BY   c.id ASC");
        String sb2 = sb.toString();
        int i = size + 2;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i);
        Iterator it = set.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2 == null) {
                a.f12582g[i2] = 1;
            } else {
                a.mo8206g(i2, str2);
            }
            i2++;
        }
        int i3 = size + 1;
        if (str == null) {
            a.f12582g[i3] = 1;
        } else {
            a.mo8206g(i3, str);
        }
        a.mo8204e(i, j);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111857a, new C42646bt(this, a, cancellationSignal), a, cancellationSignal);
    }

    /* renamed from: e */
    public final C60870cx mo45749e(String str, Set set, String str2, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT   c.id AS candidate_id,   c.proto_bytes AS candidate_proto_bytes,   t.candidate_id AS token_candidate_id,   t.value AS token_value,   t.source_type AS token_source_type FROM   ContextualCandidates c   INNER JOIN   ContextualCandidateTokens t ON t.candidate_id = c.id   INNER JOIN   ContextualCandidateContexts cc ON cc.candidate_id = c.id   INNER JOIN   ContextualCandidateInfo cci ON cci.candidate_id = c.id WHERE   t.value MATCH ?   AND   t.source_type IN (");
        int size = set.size();
        C3943e.m11297a(sb, size);
        sb.append(")   AND   cc.context_id = ?   AND   cci.last_updated >= ? GROUP BY   c.id ORDER BY   c.id ASC");
        String sb2 = sb.toString();
        int i = size + 3;
        TreeMap treeMap = C3930am.f12576a;
        C3930am a = C3929al.m11267a(sb2, i);
        a.mo8206g(1, str);
        Iterator it = set.iterator();
        int i2 = 2;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str3 == null) {
                a.f12582g[i2] = 1;
            } else {
                a.mo8206g(i2, str3);
            }
            i2++;
        }
        int i3 = size + 2;
        if (str2 == null) {
            a.f12582g[i3] = 1;
        } else {
            a.mo8206g(i3, str2);
        }
        a.mo8204e(i, j);
        CancellationSignal cancellationSignal = new CancellationSignal();
        return C3917e.m11217b(this.f111857a, new C42645bs(this, a, cancellationSignal), a, cancellationSignal);
    }
}
