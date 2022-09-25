package com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f;

import android.content.Context;
import com.google.android.libraries.search.assistant.notification.p2709a.C34852b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.t.b.f.t */
/* compiled from: PG */
public final class C36524t implements C36505a {

    /* renamed from: a */
    public static final C59071e f95297a = C59071e.m91332i("com.google.android.libraries.search.assistant.t.b.f.t");

    /* renamed from: b */
    public final Context f95298b;

    /* renamed from: c */
    public final Executor f95299c;

    /* renamed from: d */
    private final C34852b f95300d;

    /* renamed from: e */
    private final Executor f95301e;

    public C36524t(Context context, C34852b bVar, Executor executor, Executor executor2) {
        this.f95298b = context;
        this.f95300d = bVar;
        this.f95299c = executor;
        this.f95301e = executor2;
    }

    /* renamed from: a */
    public final C60870cx mo40207a(C58485gu guVar, C36511g gVar) {
        if (guVar.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        int i = gVar.f95280a;
        if (i == 2) {
            return C60856cj.m92900i((C58485gu) Collection.EL.stream(guVar).map(new C36523s(this)).filter(C36512h.f95282a).map(C36513i.f95283a).collect(C58370cn.f155946a));
        }
        if (i != 1) {
            return C60856cj.m92900i((C58485gu) Collection.EL.stream(guVar).map(C36522r.f95295a).collect(C58370cn.f155946a));
        }
        C36508d dVar = (C36508d) gVar.f95281b;
        String str = dVar.f95274b;
        if (str.isEmpty()) {
            return C60856cj.m92899h(new IllegalArgumentException("Missing Attribution tag in parser config"));
        }
        C47633f h = C47633f.m84733g(this.f95300d.mo39529a(guVar, str)).mo51515h(C36519o.f95292a, this.f95301e);
        if (!dVar.f95275c) {
            return h;
        }
        return h.mo51516i(new C36520p(this), this.f95301e);
    }
}
