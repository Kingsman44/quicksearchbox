package org.chromium.net;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
public abstract class CronetProvider {
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final String TAG = "CronetProvider";
    protected final Context mContext;

    protected CronetProvider(Context context) {
        if (context != null) {
            this.mContext = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    private static boolean addCronetProviderFromResourceFile(Context context, Set set) {
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        boolean z = false;
        if (identifier == 0) {
            return false;
        }
        String string = context.getResources().getString(identifier);
        if (string != null && !string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) && !string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) && !string.equals(JAVA_CRONET_PROVIDER_CLASS) && !string.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            z = true;
            if (!addCronetProviderImplByClassName(context, string, set, true)) {
                String str = TAG;
                Log.e(str, "Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
            }
        }
        return z;
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, Set set, boolean z) {
        try {
            set.add((CronetProvider) context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
            return true;
        } catch (InstantiationException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (InvocationTargetException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (NoSuchMethodException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (IllegalAccessException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (ClassNotFoundException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }

    public static List getAllProviders(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, linkedHashSet);
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static void logReflectiveOperationException(String str, boolean z, Exception exc) {
        if (z) {
            Log.e(TAG, "Unable to load provider class: ".concat(String.valueOf(str)), exc);
            return;
        }
        String str2 = TAG;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, "Tried to load " + str + " provider class but it wasn't included in the app classpath");
        }
    }

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public String toString() {
        return "[class=" + getClass().getName() + ", name=" + getName() + ", version=" + getVersion() + ", enabled=" + isEnabled() + "]";
    }
}
