package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.text.TextUtils;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.LoadHelper */
/* compiled from: PG */
public final class LoadHelper {
    private static final String ANDROID_ASSET = "/android_asset/";
    private static final long DEFAULT_CACHE_SIZE_BYTES = 536870912;
    private static final String DRAWABLE_RESOURCE_TYPE = "drawable";
    public static final int INVALID_RESOURCE_IDENTIFIER = 0;
    private static final String RAW_RESOURCE_TYPE = "raw";
    private static final char SLASH_DELIMETER = '/';
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.utilities.LoadHelper");

    private LoadHelper() {
    }

    private static Callable androidResourceUriToInputStreamCreator(Context context, Uri uri) {
        String path = uri.getPath();
        String substring = path.substring(1, path.lastIndexOf(47));
        if (substring.equals(RAW_RESOURCE_TYPE) || substring.equals(DRAWABLE_RESOURCE_TYPE)) {
            return new LoadHelper$$ExternalSyntheticLambda1(context, uri);
        }
        String valueOf = String.valueOf(uri);
        throw new IllegalArgumentException("Unknown resource resourceType '" + substring + "' in uri '" + valueOf + "'. Resource will not be loaded");
    }

    private static boolean assetExists(AssetManager assetManager, String str) {
        String[] strArr;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1);
            strArr = assetManager.list(str.substring(0, lastIndexOf));
            str = substring;
        } else {
            strArr = assetManager.list(BuildConfig.FLAVOR);
        }
        if (strArr != null) {
            for (String equals : strArr) {
                if (str.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Callable dataUriInputStreamCreator(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int indexOf = schemeSpecificPart.indexOf(44);
        if (indexOf >= 0) {
            return new LoadHelper$$ExternalSyntheticLambda4(schemeSpecificPart.substring(0, indexOf).contains(";base64"), schemeSpecificPart.substring(indexOf + 1));
        }
        throw new IllegalArgumentException("Malformed data uri - does not contain a ','");
    }

    public static int drawableResourceNameToIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE_RESOURCE_TYPE, context.getPackageName());
    }

    public static void enableCaching(long j, File file, String str) {
        if (HttpResponseCache.getInstalled() == null) {
            try {
                HttpResponseCache.install(new File(file, str), j);
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) logger.mo56224b()).mo56382g(e)).mo56372aa(42390)).mo56386p("HTTP response cache installation failed.");
            }
        }
    }

    private static Callable fileUriToInputStreamCreator(Context context, Uri uri) {
        String str;
        AssetManager assets = context.getAssets();
        if (uri.getAuthority() == null) {
            str = uri.getPath();
        } else if (uri.getPath().isEmpty()) {
            str = uri.getAuthority();
        } else {
            str = String.valueOf(uri.getAuthority()).concat(String.valueOf(uri.getPath()));
        }
        return new LoadHelper$$ExternalSyntheticLambda0(assets, removeAndroidAssetPath(str), str);
    }

    public static void flushHttpCache() {
        HttpResponseCache installed = HttpResponseCache.getInstalled();
        if (installed != null) {
            installed.flush();
        }
    }

    public static Callable fromResource(Context context, int i) {
        C58838bb.m90866a(context, "Parameter \"context\" was null.");
        String resourceTypeName = context.getResources().getResourceTypeName(i);
        if (resourceTypeName.equals(RAW_RESOURCE_TYPE) || resourceTypeName.equals(DRAWABLE_RESOURCE_TYPE)) {
            return new LoadHelper$$ExternalSyntheticLambda3(context, i);
        }
        String resourceName = context.getResources().getResourceName(i);
        throw new IllegalArgumentException("Unknown resource resourceType '" + resourceTypeName + "' in resId '" + resourceName + "'. Resource will not be loaded");
    }

    public static Callable fromUri(Context context, Uri uri) {
        return fromUri(context, uri, (Map) null);
    }

    private static String getGltfExtensionFromSchemeSpecificPart(String str) {
        if (str.startsWith("model/gltf-binary")) {
            return "glb";
        }
        if (str.startsWith("model/gltf+json")) {
            return "gltf";
        }
        return null;
    }

    public static String getLastPathSegment(Uri uri) {
        if (isGltfDataUri(uri)) {
            return "file.".concat(String.valueOf(getGltfExtensionFromSchemeSpecificPart(uri.getSchemeSpecificPart())));
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            return lastPathSegment;
        }
        String uri2 = uri.toString();
        return uri2.substring(uri2.lastIndexOf(47) + 1);
    }

    public static Boolean isAndroidResource(Uri uri) {
        C58838bb.m90866a(uri, "Parameter \"sourceUri\" was null.");
        return Boolean.valueOf(TextUtils.equals("android.resource", uri.getScheme()));
    }

    public static boolean isDataUri(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("data");
    }

    public static Boolean isFileAsset(Uri uri) {
        C58838bb.m90866a(uri, "Parameter \"sourceUri\" was null.");
        String scheme = uri.getScheme();
        boolean z = true;
        if (!TextUtils.isEmpty(scheme) && !Objects.equals("file", scheme)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static boolean isGltfDataUri(Uri uri) {
        if (isDataUri(uri) && getGltfExtensionFromSchemeSpecificPart(uri.getSchemeSpecificPart()) != null) {
            return true;
        }
        return false;
    }

    static /* synthetic */ InputStream lambda$dataUriInputStreamCreator$4(boolean z, String str) {
        return new ByteArrayInputStream(z ? Base64.decode(str, 0) : str.getBytes());
    }

    static /* synthetic */ InputStream lambda$fileUriToInputStreamCreator$1(AssetManager assetManager, String str, String str2) {
        if (assetExists(assetManager, str)) {
            return assetManager.open(str);
        }
        return new FileInputStream(new File(str2));
    }

    public static int rawResourceNameToIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, RAW_RESOURCE_TYPE, context.getPackageName());
    }

    public static Callable remoteUriToInputStreamCreator(Uri uri, Map map) {
        return remoteUriToInputStreamCreator(uri, map, (Boolean) null);
    }

    private static String removeAndroidAssetPath(String str) {
        return str.startsWith(ANDROID_ASSET) ? str.substring(15) : str;
    }

    private static Uri resolve(Uri uri, Uri uri2) {
        try {
            return Uri.parse(new URI(uri.toString()).resolve(new URI(uri2.toString())).toString());
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Unable to parse Uri.", e);
        }
    }

    public static Uri resolveUri(Uri uri, Uri uri2) {
        return uri2 == null ? uri : resolve(uri2, uri);
    }

    public static Uri resourceToUri(Context context, int i) {
        Resources resources = context.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i)).appendPath(resources.getResourceTypeName(i)).appendPath(resources.getResourceEntryName(i)).build();
    }

    public static Callable fromUri(Context context, Uri uri, Map map) {
        C58838bb.m90866a(uri, "Parameter \"sourceUri\" was null.");
        C58838bb.m90866a(context, "Parameter \"context\" was null.");
        if (isFileAsset(uri).booleanValue()) {
            return fileUriToInputStreamCreator(context, uri);
        }
        if (isAndroidResource(uri).booleanValue()) {
            return androidResourceUriToInputStreamCreator(context, uri);
        }
        if (isGltfDataUri(uri)) {
            return dataUriInputStreamCreator(uri);
        }
        return remoteUriToInputStreamCreator(uri, map);
    }

    public static Callable remoteUriToInputStreamCreator(Uri uri, Map map, Boolean bool) {
        try {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            if (bool != null) {
                openConnection.setUseCaches(bool.booleanValue());
            }
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return new LoadHelper$$ExternalSyntheticLambda2(openConnection);
        } catch (MalformedURLException e) {
            String valueOf = String.valueOf(uri);
            throw new IllegalArgumentException("Unable to parse url: '" + valueOf + "'", e);
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(uri);
            throw LoadHelper$$ExternalSyntheticBackport0.m25753m("Error opening url connection: '" + valueOf2 + "'", e2);
        }
    }

    public static void enableCaching(Context context) {
        enableCaching(DEFAULT_CACHE_SIZE_BYTES, context.getCacheDir(), "http_cache");
    }
}
