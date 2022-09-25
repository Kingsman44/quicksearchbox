package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import androidx.p182p.p185c.C3943e;
import androidx.p186q.p187a.C4057l;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.cs */
/* compiled from: PG */
final class C16147cs implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f47639a;

    /* renamed from: b */
    final /* synthetic */ C16156da f47640b;

    public C16147cs(C16156da daVar, List list) {
        this.f47640b = daVar;
        this.f47639a = list;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM suggestion_to_display WHERE candidate_suggestion_id IN (");
        C3943e.m11297a(sb, this.f47639a.size());
        sb.append(")");
        C4057l L = this.f47640b.f47656a.mo8168L(sb.toString());
        int i = 1;
        for (String str : this.f47639a) {
            if (str == null) {
                L.mo8205f(i);
            } else {
                L.mo8206g(i, str);
            }
            i++;
        }
        this.f47640b.f47656a.mo8181p();
        try {
            L.mo8256a();
            this.f47640b.f47656a.mo8188w();
            this.f47640b.f47656a.mo8183r();
            return null;
        } catch (Throwable th) {
            this.f47640b.f47656a.mo8183r();
            throw th;
        }
    }
}
