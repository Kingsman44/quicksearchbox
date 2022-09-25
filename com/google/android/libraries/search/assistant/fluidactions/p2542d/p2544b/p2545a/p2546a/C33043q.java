package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C33043q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C33046t f88482a;

    /* renamed from: b */
    public final /* synthetic */ C33108d f88483b;

    /* renamed from: c */
    public final /* synthetic */ C51406gn f88484c;

    /* renamed from: d */
    public final /* synthetic */ C32951d f88485d;

    /* renamed from: e */
    public final /* synthetic */ Context f88486e;

    public /* synthetic */ C33043q(C33046t tVar, C33108d dVar, C51406gn gnVar, C32951d dVar2, Context context) {
        this.f88482a = tVar;
        this.f88483b = dVar;
        this.f88484c = gnVar;
        this.f88485d = dVar2;
        this.f88486e = context;
    }

    public final Object apply(Object obj) {
        C33046t tVar = this.f88482a;
        C33108d dVar = this.f88483b;
        C51406gn gnVar = this.f88484c;
        C32951d dVar2 = this.f88485d;
        Context context = this.f88486e;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return tVar.mo38508b(dVar.mo38534c(), gnVar, dVar2, context, optional);
        }
        C59104x b = C33046t.f88489a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ContactLookupFeatureClientOpResultProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(50725)).mo56386p("Failed to disambiguate contact by AUM");
        return Optional.empty();
    }
}
