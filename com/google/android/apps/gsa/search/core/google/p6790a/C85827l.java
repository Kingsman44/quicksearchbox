package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.l */
/* compiled from: PG */
public final /* synthetic */ class C85827l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C85828m f232067a;

    /* renamed from: b */
    public final /* synthetic */ String f232068b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f232069c;

    /* renamed from: d */
    public final /* synthetic */ Query f232070d;

    public /* synthetic */ C85827l(C85828m mVar, String str, byte[] bArr, Query query) {
        this.f232067a = mVar;
        this.f232068b = str;
        this.f232069c = bArr;
        this.f232070d = query;
    }

    public final Object apply(Object obj) {
        C85828m mVar = this.f232067a;
        String str = this.f232068b;
        byte[] bArr = this.f232069c;
        Query query = this.f232070d;
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.S3_HEADER_REQUEST_ASSISTANT_SDK_DEVICE_PARAMS_COMPLETE;
        ((C89859i) mVar.f232072b.mo27525b()).mo74236a(fVar.mo83699a());
        return C58833ax.m90833j(C85828m.m137900a((String) ((C58833ax) obj).mo56111f(), str, bArr, query));
    }
}
