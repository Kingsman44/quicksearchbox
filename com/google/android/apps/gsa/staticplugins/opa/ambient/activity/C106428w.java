package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.content.Context;
import android.graphics.Bitmap;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8236d.C106646a;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a.C131829n;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4528b.p4529a.C58994k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.Map;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.activity.w */
/* compiled from: PG */
public final class C106428w {

    /* renamed from: a */
    public final C90021c f296874a;

    /* renamed from: b */
    public final C90465g f296875b;

    /* renamed from: c */
    private final C58994k f296876c;

    /* renamed from: d */
    private final Optional f296877d;

    /* renamed from: e */
    private final C106646a f296878e;

    /* renamed from: f */
    private final Optional f296879f;

    /* renamed from: g */
    private final C60888db f296880g;

    public C106428w(C90021c cVar, C58994k kVar, Optional optional, C106646a aVar, Optional optional2, C90465g gVar, C60888db dbVar) {
        this.f296874a = cVar;
        this.f296876c = kVar;
        this.f296877d = optional;
        this.f296878e = aVar;
        this.f296879f = optional2;
        this.f296875b = gVar;
        this.f296880g = dbVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo95526a(Context context, String str, Map map, Optional optional, boolean z, Bitmap bitmap) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx a = this.f296876c.mo56261a();
        if (this.f296877d.isPresent()) {
            cxVar = ((C58994k) this.f296877d.get()).mo56261a();
        } else {
            cxVar = C60856cj.m92900i("TNG absent".getBytes(StandardCharsets.UTF_8));
        }
        C60870cx cxVar3 = cxVar;
        C60870cx a2 = this.f296878e.mo95607a();
        if (!this.f296879f.isPresent() || !optional.isPresent()) {
            cxVar2 = C60856cj.m92900i(BuildConfig.FLAVOR);
        } else {
            cxVar2 = ((C131829n) this.f296879f.get()).mo110328b((Duration) optional.get());
        }
        C60870cx cxVar4 = cxVar2;
        C47638k.m84751b(a, cxVar3, a2, cxVar4).mo51520a(new C106427v(this, str, bitmap, map, optional, cxVar4, cxVar3, a, z, a2, context), this.f296880g);
    }
}
