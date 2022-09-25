package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.storage.bl */
/* compiled from: PG */
public final class C42638bl extends C42635bi {

    /* renamed from: a */
    private final C3925ah f111847a;

    public C42638bl(C3925ah ahVar) {
        this.f111847a = ahVar;
        new C42636bj(ahVar);
        new C42637bk(ahVar);
    }

    /* renamed from: a */
    public final void mo45745a(List list) {
        this.f111847a.mo8175S();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ContextualCandidateContexts WHERE candidate_id IN (");
        C3943e.m11297a(sb, list.size());
        sb.append(")");
        C4057l L = this.f111847a.mo8168L(sb.toString());
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
        this.f111847a.mo8181p();
        try {
            L.mo8256a();
            this.f111847a.mo8188w();
        } finally {
            this.f111847a.mo8183r();
        }
    }
}
