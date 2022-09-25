package com.google.android.apps.search.googleapp.search.p10420k;

import android.os.Bundle;
import androidx.lifecycle.C2344as;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.k.b */
/* compiled from: PG */
public final class C137543b {

    /* renamed from: a */
    private final C2344as f374094a;

    /* renamed from: b */
    private final C71342e f374095b;

    public C137543b(C2344as asVar) {
        C69664n.m101061g(asVar, "savedStateHandle");
        this.f374094a = asVar;
        C137542d dVar = C137542d.f374085g;
        C69664n.m101060f(dVar, "getDefaultInstance()");
        this.f374095b = new C71342e(dVar, C71343f.f190534a);
        asVar.mo5758e("search_query_key", new C137538a(this));
        Bundle bundle = (Bundle) asVar.mo5755b("search_query_key");
        if (bundle != null) {
            C137542d dVar2 = (C137542d) ProtoParsers.m95520c(bundle, "search_query", C137542d.f374085g, C62921ba.m95368a());
            C69664n.m101060f(dVar2, "query");
            mo113805b(dVar2);
        }
    }

    /* renamed from: a */
    public final C137542d mo113804a() {
        return (C137542d) this.f374095b.f190532a;
    }

    /* renamed from: b */
    public final void mo113805b(C137542d dVar) {
        C69664n.m101061g(dVar, "<set-?>");
        this.f374095b.mo62678c(dVar);
    }
}
