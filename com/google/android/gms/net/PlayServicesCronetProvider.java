package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.C144023z;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            C145577a.m236660b(this.mContext);
        } catch (C144023z unused) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        } catch (C144022y unused2) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
    }

    public CronetEngine.Builder createBuilder() {
        try {
            C145577a.m236660b(this.mContext);
            try {
                DynamiteModule a = C145577a.m236659a();
                C143919bh.m233958a(a);
                ClassLoader classLoader = a.f390459e.getClassLoader();
                C143919bh.m233958a(classLoader);
                return new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this.mContext}));
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            }
        } catch (C144023z e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e2);
        } catch (C144022y e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e3);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (C145577a.f393614a) {
            str = C145577a.f393615b;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return C145577a.m236661c();
    }
}
