package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127804u;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9831b.p9832a.C129577a;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a.C130376r;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.a.i */
/* compiled from: PG */
public final class C127773i {

    /* renamed from: a */
    public final Context f351700a;

    /* renamed from: b */
    public final C127804u f351701b;

    /* renamed from: c */
    public final boolean f351702c;

    /* renamed from: d */
    public final Executor f351703d;

    /* renamed from: e */
    public final C129577a f351704e;

    public C127773i(Context context, C129577a aVar, C127804u uVar, Executor executor, boolean z) {
        this.f351700a = context;
        this.f351704e = aVar;
        this.f351701b = uVar;
        this.f351703d = executor;
        this.f351702c = z;
    }

    /* renamed from: a */
    public static C58485gu m208813a(C130348b bVar) {
        Optional d = bVar.mo109680d();
        if (d.isEmpty()) {
            return C58485gu.m89845m();
        }
        return (C58485gu) Collection.EL.stream(C130376r.m212832b((String) d.get(), bVar.mo109678b())).map(new C127768d(d)).collect(C58370cn.f155946a);
    }
}
