package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.al */
/* compiled from: PG */
final class C16086al implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f47549a;

    /* renamed from: b */
    final /* synthetic */ C16087am f47550b;

    public C16086al(C16087am amVar, List list) {
        this.f47550b = amVar;
        this.f47549a = list;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM candidate_suggestion_metrics WHERE candidate_suggestion_id IN (");
        C3943e.m11297a(sb, this.f47549a.size());
        sb.append(")");
        C4057l L = this.f47550b.f47551a.mo8168L(sb.toString());
        int i = 1;
        for (String str : this.f47549a) {
            if (str == null) {
                L.mo8205f(i);
            } else {
                L.mo8206g(i, str);
            }
            i++;
        }
        this.f47550b.f47551a.mo8181p();
        try {
            L.mo8256a();
            this.f47550b.f47551a.mo8188w();
            this.f47550b.f47551a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47550b.f47551a.mo8183r();
            throw th;
        }
    }
}
