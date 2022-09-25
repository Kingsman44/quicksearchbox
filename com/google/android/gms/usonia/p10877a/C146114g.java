package com.google.android.gms.usonia.p10877a;

import com.google.android.gms.usonia.auth.internal.C146128af;
import com.google.android.gms.usonia.auth.internal.C146131d;
import com.google.android.gms.usonia.auth.internal.C146145r;
import com.google.android.gms.usonia.directory.internal.C146268d;
import com.google.common.util.concurrent.C60895di;
import dagger.p5294a.C68220f;
import java.util.concurrent.Executors;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.gms.usonia.a.g */
/* compiled from: PG */
public final class C146114g implements C68220f {

    /* renamed from: a */
    private final C69464a f394853a;

    /* renamed from: b */
    private final C69464a f394854b;

    public C146114g(C69464a aVar, C69464a aVar2) {
        this.f394853a = aVar;
        this.f394854b = aVar2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        return new C146145r((C146268d) this.f394853a.mo17428b(), (C146131d) this.f394854b.mo17428b(), C146128af.m237998a(), C60895di.m92996b(Executors.newSingleThreadScheduledExecutor()));
    }
}
