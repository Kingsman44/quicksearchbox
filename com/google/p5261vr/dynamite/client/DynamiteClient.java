package com.google.p5261vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;

/* renamed from: com.google.vr.dynamite.client.DynamiteClient */
/* compiled from: PG */
public final class DynamiteClient {

    /* renamed from: a */
    private static final ArrayMap f184161a = new ArrayMap();

    private DynamiteClient() {
    }

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            C67958f fVar = new C67958f(str, str2);
            C67957e remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(fVar);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.mo60072b(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.mo60071a(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    String obj = fVar.toString();
                    Log.e("DynamiteClient", "Failed to load native library " + obj + " from remote package: no loader available.");
                    return -1;
                }
                int checkVersion = newNativeLibraryLoader.checkVersion(str3);
                return checkVersion;
            } catch (RemoteException | C67956d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String obj2 = fVar.toString();
                Log.e("DynamiteClient", "Failed to load native library " + obj2 + " from remote package:\n  ", e);
                return -1;
            }
        }
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            ClassLoader classLoader = remoteContext.getClassLoader();
            return classLoader;
        }
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context a;
        synchronized (DynamiteClient.class) {
            C67958f fVar = new C67958f(str, str2);
            try {
                a = getRemoteLibraryLoaderFromInfo(fVar).mo60071a(context);
            } catch (C67956d e) {
                String obj = fVar.toString();
                Log.e("DynamiteClient", "Failed to get remote Context" + obj + " from remote package:\n  ", e);
                return null;
            }
        }
        return a;
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, (String) null);
            if (remoteContext == null) {
                return null;
            }
            try {
                DexClassLoader dexClassLoader = new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
                return dexClassLoader;
            } catch (RuntimeException e) {
                Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e);
                return null;
            }
        }
    }

    private static synchronized C67957e getRemoteLibraryLoaderFromInfo(C67958f fVar) {
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = f184161a;
            C67957e eVar = (C67957e) arrayMap.get(fVar);
            if (eVar != null) {
                return eVar;
            }
            C67957e eVar2 = new C67957e(fVar);
            arrayMap.put(fVar, eVar2);
            return eVar2;
        }
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            C67958f fVar = new C67958f(str, str2);
            C67957e remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(fVar);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.mo60072b(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.mo60071a(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    String obj = fVar.toString();
                    Log.e("DynamiteClient", "Failed to load native library " + obj + " from remote package: no loader available.");
                    return 0;
                }
                long initializeAndLoadNativeLibrary = newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
                return initializeAndLoadNativeLibrary;
            } catch (RemoteException | C67956d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String obj2 = fVar.toString();
                Log.e("DynamiteClient", "Failed to load native library " + obj2 + " from remote package:\n  ", e);
                return 0;
            }
        }
    }
}
