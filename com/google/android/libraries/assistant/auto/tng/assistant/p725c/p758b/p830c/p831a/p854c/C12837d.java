package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p837d.C12758a;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.d */
/* compiled from: PG */
public final /* synthetic */ class C12837d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12844k f40063a;

    /* renamed from: b */
    public final /* synthetic */ AtomicLong f40064b;

    /* renamed from: c */
    public final /* synthetic */ C52083ep f40065c;

    /* renamed from: d */
    public final /* synthetic */ Optional f40066d;

    public /* synthetic */ C12837d(C12844k kVar, AtomicLong atomicLong, C52083ep epVar, Optional optional) {
        this.f40063a = kVar;
        this.f40064b = atomicLong;
        this.f40065c = epVar;
        this.f40066d = optional;
    }

    public final C60870cx apply(Object obj) {
        C52076ei eiVar;
        C12844k kVar = this.f40063a;
        AtomicLong atomicLong = this.f40064b;
        C52083ep epVar = this.f40065c;
        Optional optional = this.f40066d;
        Void voidR = (Void) obj;
        atomicLong.set(kVar.f40082f.mo26872d());
        C12758a aVar = kVar.f40078b;
        if (epVar.f136692b == 4) {
            eiVar = (C52076ei) epVar.f136693c;
        } else {
            eiVar = C52076ei.f136664f;
        }
        return aVar.mo20773a(eiVar, optional);
    }
}
