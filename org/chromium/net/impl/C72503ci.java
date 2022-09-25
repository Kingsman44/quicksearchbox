package org.chromium.net.impl;

import android.content.Context;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* renamed from: org.chromium.net.impl.ci */
/* compiled from: PG */
public class C72503ci extends C72533o {
    public C72503ci(Context context) {
        super(context);
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        super.mo64275c(str, set, z, date);
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        super.mo64276d(str, i, i2);
        return this;
    }

    public final ExperimentalCronetEngine build() {
        if (this.f193001e == null) {
            this.f193001e = C72514ct.m107222a(this.f192997a);
        }
        return new CronetUrlRequestContext(this);
    }

    public final /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.f193005i = z;
        return this;
    }

    public final /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.f193004h = z;
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        super.mo64277e(i, j);
        return this;
    }

    public final /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.f193009m = z;
        return this;
    }

    public final /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.f193000d = z;
        return this;
    }

    public final /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.f193003g = z;
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    public final /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.f193008l = str;
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        super.mo64278g(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        super.mo64279h(i);
        return this;
    }

    public final /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.f193001e = str;
        return this;
    }
}
