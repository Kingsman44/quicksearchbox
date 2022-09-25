package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.storage.cd */
/* compiled from: PG */
public final class C42657cd extends C42654ca {

    /* renamed from: a */
    private final C3925ah f111862a;

    public C42657cd(C3925ah ahVar) {
        this.f111862a = ahVar;
        new C42655cb(ahVar);
        new C42656cc(ahVar);
    }

    /* renamed from: a */
    public final void mo45757a(List list) {
        this.f111862a.mo8175S();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ContextualCandidateTokens WHERE candidate_id IN (");
        C3943e.m11297a(sb, list.size());
        sb.append(")");
        C4057l L = this.f111862a.mo8168L(sb.toString());
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
        this.f111862a.mo8181p();
        try {
            L.mo8256a();
            this.f111862a.mo8188w();
        } finally {
            this.f111862a.mo8183r();
        }
    }
}
