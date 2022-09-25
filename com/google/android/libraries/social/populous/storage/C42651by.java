package com.google.android.libraries.social.populous.storage;

import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58801sm;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.social.populous.storage.by */
/* compiled from: PG */
final class C42651by implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f111858a;

    /* renamed from: b */
    final /* synthetic */ long f111859b;

    /* renamed from: c */
    final /* synthetic */ C42652bz f111860c;

    public C42651by(C42652bz bzVar, List list, long j) {
        this.f111860c = bzVar;
        this.f111858a = list;
        this.f111859b = j;
    }

    /* JADX INFO: finally extract failed */
    public final /* synthetic */ Object call() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ContextualCandidateInfo SET last_accessed = ? WHERE candidate_id IN (");
        C3943e.m11297a(sb, ((C58724pq) this.f111858a).f156474d);
        sb.append(")");
        C4057l L = this.f111860c.f111861a.mo8168L(sb.toString());
        L.mo8204e(1, this.f111859b);
        C58801sm G = ((C58485gu) this.f111858a).listIterator(0);
        int i = 2;
        while (G.hasNext()) {
            String str = (String) G.next();
            if (str == null) {
                L.mo8205f(i);
            } else {
                L.mo8206g(i, str);
            }
            i++;
        }
        this.f111860c.f111861a.mo8181p();
        try {
            L.mo8256a();
            this.f111860c.f111861a.mo8188w();
            this.f111860c.f111861a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f111860c.f111861a.mo8183r();
            throw th;
        }
    }
}
