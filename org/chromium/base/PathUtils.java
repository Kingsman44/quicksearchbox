package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class PathUtils {
    static {
        new AtomicBoolean();
    }

    private PathUtils() {
    }

    /* renamed from: a */
    private static String[] m107023a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        C72408u b = C72408u.m107066b();
        try {
            File[] externalFilesDirs = C72382h.f192527a.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            b.close();
            return m107023a(arrayList);
        } catch (Throwable th) {
            C72391q.m107051a(th, th);
        }
        throw th;
    }

    public static String getCacheDirectory() {
        throw null;
    }

    public static String getDataDirectory() {
        throw null;
    }

    public static String getDownloadsDirectory() {
        C72408u a = C72408u.m107065a();
        try {
            String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            String str = allPrivateDownloadsDirectories.length == 0 ? BuildConfig.FLAVOR : allPrivateDownloadsDirectories[0];
            a.close();
            return str;
        } catch (Throwable th) {
            C72391q.m107051a(th, th);
        }
        throw th;
    }

    public static String[] getExternalDownloadVolumesNames() {
        ArrayList arrayList = new ArrayList();
        for (String next : MediaStore.getExternalVolumeNames(C72382h.f192527a)) {
            if (!TextUtils.isEmpty(next) && !next.contains("external_primary")) {
                File directory = ((StorageManager) C72382h.f192527a.getSystemService(StorageManager.class)).getStorageVolume(MediaStore.Files.getContentUri(next)).getDirectory();
                File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                if (!file.isDirectory()) {
                    C72387m.m107043d("PathUtils", "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory()));
                }
                arrayList.add(file);
            }
        }
        return m107023a(arrayList);
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = C72382h.f192527a.getApplicationInfo();
        if ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) {
            return applicationInfo.nativeLibraryDir;
        }
        return "/system/lib/";
    }

    public static String getThumbnailCacheDirectory() {
        throw null;
    }
}
