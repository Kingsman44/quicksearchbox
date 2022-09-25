package com.google.android.apps.gsa.nga.engine.education;

import android.util.Pair;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.aa */
/* compiled from: PG */
public final /* synthetic */ class C75676aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C75686ak f210069a;

    public /* synthetic */ C75676aa(C75686ak akVar) {
        this.f210069a = akVar;
    }

    public final C60870cx apply(Object obj) {
        C75686ak akVar = this.f210069a;
        Optional optional = (Optional) obj;
        C58974d dVar = C75688am.f210098a;
        if (optional.isPresent()) {
            return C60856cj.m92900i(new Pair(optional, C75746c.INAPP));
        }
        return C60922j.m93044g(akVar.mo71824b(), C75756k.f210242a, C60826bg.f164896a);
    }
}
