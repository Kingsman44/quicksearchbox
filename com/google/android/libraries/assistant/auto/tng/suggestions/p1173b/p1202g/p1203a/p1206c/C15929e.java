package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.p1206c;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.c.e */
/* compiled from: PG */
public final /* synthetic */ class C15929e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15932h f47287a;

    public /* synthetic */ C15929e(C15932h hVar) {
        this.f47287a = hVar;
    }

    public final Object call() {
        C15932h hVar = this.f47287a;
        C60870cx cxVar = hVar.f47298i;
        if (cxVar != null) {
            cxVar.cancel(false);
            hVar.f47298i = null;
            hVar.f47296g.set(hVar.f47294e.mo57444a().toEpochMilli());
        }
        return null;
    }
}
