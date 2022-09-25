package com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.h.a.a.b */
/* compiled from: PG */
public final class C17592b implements C70862aj {

    /* renamed from: a */
    private static final C59071e f50696a = C59071e.m91332i("com.google.android.libraries.assistant.c.h.a.a.b");

    /* renamed from: b */
    private final C2164c f50697b;

    /* renamed from: c */
    private Optional f50698c = Optional.empty();

    public C17592b(C2164c cVar) {
        this.f50697b = cVar;
    }

    /* renamed from: d */
    public static C60870cx m34885d(Function function) {
        return C2169h.m6027a(new C17591a(function));
    }

    /* renamed from: a */
    public final void mo20121a() {
        if (this.f50698c.isPresent()) {
            this.f50697b.mo5437b(this.f50698c.get());
            return;
        }
        ((C59052c) ((C59052c) f50696a.mo56226d()).mo56372aa(42816)).mo56386p("Did not receive any responses");
        this.f50697b.mo5439d(new IllegalStateException("Did not receive any responses"));
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f50696a.mo56226d()).mo56382g(th)).mo56372aa(42818)).mo56386p("Received error");
        this.f50697b.mo5439d(th);
    }

    /* renamed from: c */
    public final void mo20123c(Object obj) {
        if (this.f50698c.isPresent()) {
            ((C59052c) ((C59052c) f50696a.mo56226d()).mo56372aa(42821)).mo56386p("Received multiple responses");
            this.f50697b.mo5439d(new UnsupportedOperationException("Received multiple responses"));
        } else if (obj == null) {
            ((C59052c) ((C59052c) f50696a.mo56226d()).mo56372aa(42820)).mo56386p("Received null response");
            this.f50697b.mo5439d(new NullPointerException("Received null response"));
        } else {
            this.f50698c = Optional.m71637of(obj);
        }
    }
}
