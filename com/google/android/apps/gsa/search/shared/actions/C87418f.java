package com.google.android.apps.gsa.search.shared.actions;

import com.google.android.apps.gsa.shared.search.Query;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.f */
/* compiled from: PG */
public final class C87418f extends C87412e {

    /* renamed from: a */
    public final List f236075a;

    /* renamed from: b */
    private final Query f236076b;

    public C87418f(List list, Query query) {
        this.f236075a = list;
        this.f236076b = query;
    }

    /* renamed from: a */
    public final Query mo81177a() {
        return this.f236076b;
    }

    /* renamed from: b */
    public final List mo81178b() {
        return this.f236075a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C87412e) {
            C87412e eVar = (C87412e) obj;
            List list = this.f236075a;
            if (list != null ? list.equals(eVar.mo81178b()) : eVar.mo81178b() == null) {
                Query query = this.f236076b;
                if (query != null ? query.equals(eVar.mo81177a()) : eVar.mo81177a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f236075a);
        String valueOf2 = String.valueOf(this.f236076b);
        return "ActionProcessorResult{actions=" + valueOf + ", modifiedCommit=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        List list = this.f236075a;
        int i2 = 0;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        Query query = this.f236076b;
        if (query != null) {
            i2 = query.hashCode();
        }
        return i3 ^ i2;
    }
}
