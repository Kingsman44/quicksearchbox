package com.google.android.apps.gsa.search.core.service.p6848e;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;

/* renamed from: com.google.android.apps.gsa.search.core.service.e.b */
/* compiled from: PG */
public final class C86679b {

    /* renamed from: a */
    public ClientConfig f234155a;

    /* renamed from: a */
    public final ClientConfig mo80283a() {
        ClientConfig clientConfig = this.f234155a;
        if (clientConfig != null) {
            return clientConfig;
        }
        throw new IllegalStateException("No client has been attached to this session.");
    }
}
