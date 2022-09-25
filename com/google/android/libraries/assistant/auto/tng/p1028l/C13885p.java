package com.google.android.libraries.assistant.auto.tng.p1028l;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1029a.C13715a;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.p */
/* compiled from: PG */
public final /* synthetic */ class C13885p implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13889t f42298a;

    public /* synthetic */ C13885p(C13889t tVar) {
        this.f42298a = tVar;
    }

    public final Object call() {
        C13889t tVar = this.f42298a;
        C2164c cVar = tVar.f42308d;
        cVar.getClass();
        cVar.mo5439d(new C13715a(tVar.f42306b.concat(" timed out")));
        tVar.f42307c.cancel(true);
        return null;
    }
}
