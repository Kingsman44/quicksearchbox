package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
public class JavaCronetProvider extends CronetProvider {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    public final CronetEngine.Builder createBuilder() {
        return new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) new C72462av(this.mContext));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider) obj).mContext);
        }
        return true;
    }

    public final String getName() {
        return CronetProvider.PROVIDER_NAME_FALLBACK;
    }

    public final String getVersion() {
        return "107.0.5284.2";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    public final boolean isEnabled() {
        return true;
    }
}
