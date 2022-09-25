package com.google.android.apps.gsa.sidekick.main.p7217l;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91758d;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.sidekick.main.l.a */
/* compiled from: PG */
public final /* synthetic */ class C91456a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f255101a;

    /* renamed from: b */
    public final /* synthetic */ C90929bz f255102b;

    /* renamed from: c */
    public final /* synthetic */ String f255103c;

    /* renamed from: d */
    public final /* synthetic */ C68214a f255104d;

    public /* synthetic */ C91456a(Context context, C90929bz bzVar, String str, C68214a aVar) {
        this.f255101a = context;
        this.f255102b = bzVar;
        this.f255103c = str;
        this.f255104d = aVar;
    }

    public final Object call() {
        Context context = this.f255101a;
        C90929bz bzVar = this.f255102b;
        String str = this.f255103c;
        C68214a aVar = this.f255104d;
        C59071e eVar = C91458c.f255107a;
        return new C91758d(context, bzVar, str, aVar);
    }
}
