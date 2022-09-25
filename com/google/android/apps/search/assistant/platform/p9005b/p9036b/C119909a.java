package com.google.android.apps.search.assistant.platform.p9005b.p9036b;

import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a */
/* compiled from: PG */
final class C119909a extends C119936e {

    /* renamed from: a */
    public C58495hd f333920a;

    /* renamed from: b */
    private C52091ex f333921b;

    /* renamed from: c */
    private Optional f333922c = Optional.empty();

    /* renamed from: a */
    public final C119937f mo104556a() {
        if (this.f333921b != null && this.f333920a != null) {
            return new C119932b(this.f333921b, this.f333922c, this.f333920a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f333921b == null) {
            sb.append(" conversationParams");
        }
        if (this.f333920a == null) {
            sb.append(" contextHeader");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo104557b(C58495hd hdVar) {
        if (hdVar != null) {
            this.f333920a = hdVar;
            return;
        }
        throw new NullPointerException("Null contextHeader");
    }

    /* renamed from: c */
    public final void mo104558c(C52091ex exVar) {
        if (exVar != null) {
            this.f333921b = exVar;
            return;
        }
        throw new NullPointerException("Null conversationParams");
    }

    /* renamed from: d */
    public final void mo104559d(Optional optional) {
        if (optional != null) {
            this.f333922c = optional;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }
}
