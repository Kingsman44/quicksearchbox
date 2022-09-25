package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.shared.service.AttachClientResponse;
import com.google.android.apps.gsa.search.shared.service.C88494o;
import com.google.android.apps.gsa.search.shared.service.C88498s;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87666a;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.core.service.ag */
/* compiled from: PG */
public final class C86611ag extends C88494o {

    /* renamed from: a */
    private final C87666a f233991a;

    public C86611ag(C87666a aVar) {
        this.f233991a = aVar;
    }

    /* renamed from: a */
    public final AttachClientResponse mo80232a(long j, C88498s sVar, ClientConfig clientConfig, long j2) {
        try {
            return this.f233991a.mo80239e(j, sVar, clientConfig, j2);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) SearchService.f233935a.mo56226d()).mo56382g(e)).mo56372aa(8398)).mo56388r("#attachClient: clientId=%d", j);
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo80233b(long j, boolean z) {
        try {
            this.f233991a.mo80242h(j, z);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) SearchService.f233935a.mo56226d()).mo56382g(e)).mo56372aa(8399)).mo56388r("#detachClient: clientId=%d", j);
            throw e;
        }
    }
}
