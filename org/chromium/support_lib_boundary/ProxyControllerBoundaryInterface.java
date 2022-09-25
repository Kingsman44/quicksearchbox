package org.chromium.support_lib_boundary;

import java.util.concurrent.Executor;

/* compiled from: PG */
public interface ProxyControllerBoundaryInterface {
    void clearProxyOverride(Runnable runnable, Executor executor);

    void setProxyOverride(String[][] strArr, String[] strArr2, Runnable runnable, Executor executor);

    void setProxyOverride(String[][] strArr, String[] strArr2, Runnable runnable, Executor executor, boolean z);
}
