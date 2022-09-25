package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129309m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129310n;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.g */
/* compiled from: PG */
public final class C129318g {

    /* renamed from: a */
    static final C46690ah f355182a = new C46885y("SuggestionDataSource.SUGGESTION");

    /* renamed from: b */
    public final Executor f355183b;

    /* renamed from: c */
    public final C46401p f355184c;

    /* renamed from: d */
    private final C46778cv f355185d;

    public C129318g(C46778cv cvVar, Executor executor, InstanceStateStoreFactory instanceStateStoreFactory) {
        this.f355185d = cvVar;
        this.f355183b = executor;
        this.f355184c = instanceStateStoreFactory.mo50325a("SUGGESTION_STATE_STORE", C129310n.f355158b);
    }

    /* renamed from: a */
    public final void mo108965a(C58485gu guVar) {
        C129309m mVar = (C129309m) C129310n.f355158b.createBuilder();
        mVar.copyOnWrite();
        C129310n nVar = (C129310n) mVar.instance;
        C62971cq cqVar = nVar.f355160a;
        if (!cqVar.mo58948c()) {
            nVar.f355160a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) nVar.f355160a);
        this.f355184c.mo50381d(C62912at.f169862a, (C129310n) mVar.build());
        this.f355185d.mo50787a(C60866ct.f164955a, f355182a);
    }
}
