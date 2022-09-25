package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.v */
/* compiled from: PG */
public final class C135271v extends C135216ad {

    /* renamed from: a */
    private final List f368517a;

    /* renamed from: b */
    private final C135273x f368518b = C135273x.f368522a;

    public C135271v(List list) {
        C69664n.m101061g(list, "slices");
        this.f368517a = list;
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        return C134268c.m217846a("Force loading RenderableStream", new C134284d());
    }

    /* renamed from: b */
    public final /* synthetic */ C135213aa mo112170b() {
        return this.f368518b;
    }

    /* renamed from: c */
    public final List mo112171c() {
        return this.f368517a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135271v) && C69664n.m101066l(this.f368517a, ((C135271v) obj).f368517a);
    }

    public final int hashCode() {
        return this.f368517a.hashCode();
    }

    public final String toString() {
        List list = this.f368517a;
        return "ForceLoading(slices=" + list + ")";
    }
}
