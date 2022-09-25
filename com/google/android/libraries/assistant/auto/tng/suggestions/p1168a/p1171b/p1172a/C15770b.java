package com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.p1172a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15795e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16356bc;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16360bg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.a.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C15770b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15774f f46985a;

    /* renamed from: b */
    public final /* synthetic */ C16090ap f46986b;

    public /* synthetic */ C15770b(C15774f fVar, C16090ap apVar) {
        this.f46985a = fVar;
        this.f46986b = apVar;
    }

    public final C60870cx apply(Object obj) {
        C15774f fVar = this.f46985a;
        C58833ax axVar = (C58833ax) obj;
        if (this.f46986b != C16090ap.COOLWALK) {
            C16356bc bcVar = ((C16360bg) axVar.mo56109e(C16360bg.f48159g)).f48163c;
            if (bcVar == null) {
                bcVar = C16356bc.f48144g;
            }
            if (!bcVar.f48147b) {
                return C60856cj.m92900i(C58836b.f156633a);
            }
        }
        return fVar.f47001b.mo22573a(C15795e.f47027a);
    }
}
