package com.google.android.apps.gsa.search.core.p6501ad;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.ad.a */
/* compiled from: PG */
public final class C84414a {

    /* renamed from: a */
    protected final List f229693a;

    /* renamed from: b */
    private final String f229694b;

    /* renamed from: c */
    private final Query f229695c;

    public C84414a(String str, Query query) {
        this.f229694b = str;
        this.f229695c = query;
        this.f229693a = C58485gu.m89845m();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("\n{[");
        sb.append(this.f229695c);
        sb.append("] ");
        for (Suggestion append : this.f229693a) {
            sb.append("\n  ");
            sb.append(append);
        }
        sb.append(" sourceName:");
        sb.append(this.f229694b);
        sb.append("}\n");
        return sb.toString();
    }

    public C84414a(Query query, List list) {
        this.f229694b = "complete-server";
        this.f229695c = query;
        this.f229693a = new ArrayList(list);
    }
}
