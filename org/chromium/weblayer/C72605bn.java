package org.chromium.weblayer;

/* renamed from: org.chromium.weblayer.bn */
/* compiled from: PG */
public final class C72605bn extends RuntimeException {
    public C72605bn(String str) {
        super("Unsupported WebLayer version, client version 105.0.5121.0 is not supported by implementation version ".concat(String.valueOf(str)));
    }
}
