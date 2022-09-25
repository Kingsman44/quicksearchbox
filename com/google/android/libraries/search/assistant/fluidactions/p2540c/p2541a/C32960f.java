package com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a;

import androidx.slice.Slice;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32971d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C32960f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C32965k f88313a;

    /* renamed from: b */
    public final /* synthetic */ C32971d f88314b;

    public /* synthetic */ C32960f(C32965k kVar, C32971d dVar) {
        this.f88313a = kVar;
        this.f88314b = dVar;
    }

    public final Object apply(Object obj) {
        C32965k kVar = this.f88313a;
        C32971d dVar = this.f88314b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x d = C32965k.f88325a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SliceSettingMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(50677)).mo56389s("Failed to load slice for %s.", dVar);
            return null;
        }
        kVar.mo38412d(dVar, (Slice) optional.get());
        return null;
    }
}
