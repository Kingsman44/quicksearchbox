package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c;

import android.support.p031v4.media.session.C0320v;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C13926c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Optional f42397a;

    /* renamed from: b */
    public final /* synthetic */ Optional f42398b;

    public /* synthetic */ C13926c(Optional optional, Optional optional2) {
        this.f42397a = optional;
        this.f42398b = optional2;
    }

    public final Object apply(Object obj) {
        Optional optional = this.f42397a;
        Optional optional2 = this.f42398b;
        Optional optional3 = (Optional) obj;
        C59104x b = C13928e.f42401a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AAMediaAppFlowLogger");
        ((C59052c) ((C59052c) b).mo56372aa(45185)).mo56386p("mediaControllerFuture complete");
        if (optional3.isPresent()) {
            C13932i iVar = new C13932i();
            C0320v vVar = (C0320v) optional3.get();
            if (vVar != null) {
                iVar.f42405a = vVar;
                Objects.requireNonNull(iVar);
                optional.ifPresent(new C13922a(iVar));
                Objects.requireNonNull(iVar);
                optional2.ifPresent(new C13925b(iVar));
                C59104x b2 = C13928e.f42401a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "AAMediaAppFlowLogger");
                ((C59052c) ((C59052c) b2).mo56372aa(45187)).mo56386p("returning valid AssistantAutoMediaAppFlowMetadata");
                C0320v vVar2 = iVar.f42405a;
                if (vVar2 != null) {
                    return Optional.m71637of(new C13933j(vVar2, iVar.f42406b, iVar.f42407c));
                }
                throw new IllegalStateException("Missing required properties: mediaControllerCompat");
            }
            throw new NullPointerException("Null mediaControllerCompat");
        }
        C59104x d = C13928e.f42401a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AAMediaAppFlowLogger");
        ((C59052c) ((C59052c) d).mo56372aa(45186)).mo56386p("getExistingTopActiveMediaController failed");
        return Optional.empty();
    }
}
