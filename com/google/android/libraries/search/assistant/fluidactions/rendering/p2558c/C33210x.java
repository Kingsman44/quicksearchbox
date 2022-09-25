package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32973f;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32974g;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import java.util.List;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.x */
/* compiled from: PG */
public final class C33210x implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C33211y f88812a;

    public C33210x(C33211y yVar) {
        this.f88812a = yVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        List<C32974g> list;
        Optional optional = (Optional) obj;
        C69664n.m101061g(optional, "data");
        if (optional.isPresent() && (list = (List) this.f88812a.f88815c.get(((C32973f) optional.get()).mo38421d().toString())) != null) {
            for (C32974g a : list) {
                a.mo38428a((C32973f) optional.get());
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
