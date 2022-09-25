package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.MessageLite;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ao */
/* compiled from: PG */
public final /* synthetic */ class C112320ao implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ MessageLite f311694a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f311695b;

    public /* synthetic */ C112320ao(MessageLite messageLite, C65753ak akVar) {
        this.f311694a = messageLite;
        this.f311695b = akVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        MessageLite messageLite = this.f311694a;
        C65753ak akVar = this.f311695b;
        C58485gu guVar = (C58485gu) obj;
        C121537f fVar = C112331az.f311704a;
        if (guVar.isEmpty() || ((MessageLite) guVar.get(0)).equals(messageLite)) {
            ((C59052c) ((C59052c) C112331az.f311705b.mo56224b()).mo56372aa(27697)).mo56389s("Geller got empty result from corpus %s.", akVar.name());
            return Optional.empty();
        }
        ((C59052c) ((C59052c) C112331az.f311705b.mo56224b()).mo56372aa(27698)).mo56389s("Successfully read non-empty result from Geller corpus %s.", akVar.name());
        return Optional.m71637of((MessageLite) guVar.get(0));
    }
}
