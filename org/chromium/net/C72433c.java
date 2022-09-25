package org.chromium.net;

import java.util.Comparator;
import org.chromium.net.CronetEngine;

/* renamed from: org.chromium.net.c */
/* compiled from: PG */
final class C72433c implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        CronetProvider cronetProvider = (CronetProvider) obj;
        CronetProvider cronetProvider2 = (CronetProvider) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
    }
}
