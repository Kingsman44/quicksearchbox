package com.google.android.apps.search.assistant.platform.pcp.p9324a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c.C123841an;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c.C123853az;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c.C123881z;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3315b.C42837aw;
import com.google.android.libraries.storage.p3315b.C42838ax;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.a.n */
/* compiled from: PG */
final class C123576n implements C47352j {

    /* renamed from: a */
    public static final C62910ar f341451a = C62948a.m95462m(30, 0);

    /* renamed from: b */
    public final Context f341452b;

    /* renamed from: c */
    public final C46175b f341453c;

    /* renamed from: d */
    public final Executor f341454d;

    /* renamed from: e */
    public final C62910ar f341455e;

    /* renamed from: f */
    public final C21370a f341456f;

    /* renamed from: g */
    public final C123853az f341457g;

    /* renamed from: h */
    public final C123841an f341458h;

    /* renamed from: i */
    public final C123881z f341459i;

    /* renamed from: j */
    public final C58974d f341460j;

    /* renamed from: k */
    public final C60888db f341461k;

    /* renamed from: l */
    public final boolean f341462l;

    /* renamed from: m */
    public final boolean f341463m;

    public C123576n(Context context, C46175b bVar, C21370a aVar, C123853az azVar, C123841an anVar, C123881z zVar, Executor executor, C130603a aVar2, C60888db dbVar, C62910ar arVar, boolean z, boolean z2) {
        this.f341452b = context;
        this.f341453c = bVar;
        this.f341456f = aVar;
        this.f341454d = executor;
        this.f341457g = azVar;
        this.f341458h = anVar;
        this.f341459i = zVar;
        this.f341461k = dbVar;
        this.f341460j = aVar2.mo109740b(this);
        this.f341455e = arVar;
        this.f341462l = z;
        this.f341463m = z2;
    }

    /* renamed from: a */
    public static C42837aw m202877a(String str, long j) {
        C42838ax axVar = new C42838ax(str);
        axVar.f112125a.append("last_update_timestamp < ?");
        axVar.f112126b.add(String.valueOf(j));
        return axVar.mo45919a();
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        C60870cx d = this.f341453c.mo50247d();
        C123571i iVar = new C123571i(this);
        return C60922j.m93045h(d, C47810es.m84966f(iVar), this.f341454d);
    }
}
