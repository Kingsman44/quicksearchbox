package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a;

import com.google.android.libraries.search.assistant.p2786t.p2787a.C36453d;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36412f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C36439m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36447u f95145a;

    /* renamed from: b */
    public final /* synthetic */ C36412f f95146b;

    /* renamed from: c */
    public final /* synthetic */ String f95147c = "MarkAsRead";

    public /* synthetic */ C36439m(C36447u uVar, C36412f fVar) {
        this.f95145a = uVar;
        this.f95146b = fVar;
    }

    public final C60870cx apply(Object obj) {
        C36447u uVar = this.f95145a;
        C36412f fVar = this.f95146b;
        String str = this.f95147c;
        Void voidR = (Void) obj;
        C36453d dVar = fVar.f95099b;
        if (dVar == null) {
            dVar = C36453d.f95179d;
        }
        return uVar.mo40168c(dVar.f95182b, Optional.empty(), str);
    }
}
