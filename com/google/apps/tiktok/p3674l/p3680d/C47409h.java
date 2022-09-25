package com.google.apps.tiktok.p3674l.p3680d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileLock;
import p3186j$.wrapper.java.p3189io.FileInputStreamWrapper;

/* renamed from: com.google.apps.tiktok.l.d.h */
/* compiled from: PG */
final class C47409h {

    /* renamed from: a */
    public static final C47409h f123141a = new C47409h();

    /* renamed from: d */
    private static final C59071e f123142d = C59071e.m91332i("com.google.apps.tiktok.l.d.h");

    /* renamed from: b */
    public volatile C58833ax f123143b = null;

    /* renamed from: c */
    public volatile boolean f123144c = false;

    /* renamed from: a */
    public static File m84254a(Context context, C47411j jVar) {
        if (jVar == C47411j.DEVICE) {
            File filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
            if (filesDir != null) {
                return filesDir;
            }
            throw new IllegalStateException("Unable to get a device protected storage directory");
        }
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo.applicationInfo.dataDir != null) {
                return new File(packageInfo.applicationInfo.dataDir, "files");
            }
            throw new IllegalStateException("PackageInfo was invalid.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Could not find our own package, this should be impossible.", e);
        }
    }

    /* renamed from: b */
    public static final C58833ax m84255b(File file, C62921ba baVar) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        File file2 = new File(file, "tiktok_configuration");
        File file3 = new File(file2, "CustomConfiguration.lock");
        if (!file3.exists()) {
            return C58836b.f156633a;
        }
        File file4 = new File(file2, "CustomConfiguration");
        if (file4.exists()) {
            try {
                fileInputStream3 = new FileInputStream(file4);
                C58833ax k = C58833ax.m90834k((C47406e) C47406e.parseDelimitedFrom(C47406e.f123136c, fileInputStream3, baVar));
                fileInputStream3.close();
                return k;
            } catch (C62974ct | FileNotFoundException | RuntimeException unused) {
            } catch (Throwable th) {
                C47407f.m84253a(th, th);
            }
        }
        FileInputStream fileInputStream4 = new FileInputStream(file3);
        try {
            FileLock lock = FileInputStreamWrapper.getChannel(fileInputStream4).lock(0, Long.MAX_VALUE, true);
            try {
                File file5 = new File(file2, "CustomConfiguration.bak");
                if (file4.exists()) {
                    try {
                        fileInputStream2 = new FileInputStream(file4);
                        C47406e eVar = (C47406e) C47406e.parseDelimitedFrom(C47406e.f123136c, fileInputStream2, baVar);
                        if (eVar != null) {
                            C58833ax k2 = C58833ax.m90834k(eVar);
                            fileInputStream2.close();
                            if (lock != null) {
                                lock.close();
                            }
                            fileInputStream4.close();
                            return k2;
                        }
                        throw new C47408g();
                    } catch (C62974ct | RuntimeException e) {
                        if (file5.exists()) {
                            ((C59052c) ((C59052c) ((C59052c) f123142d.mo56225c()).mo56382g(e)).mo56372aa(54791)).mo56386p("Failed to read locale, trying back up");
                        } else if (e instanceof C62974ct) {
                            throw new C47408g(e);
                        } else {
                            throw e;
                        }
                    } catch (Throwable th2) {
                        C47407f.m84253a(th, th2);
                    }
                }
                if (file5.exists()) {
                    try {
                        fileInputStream = new FileInputStream(file5);
                        C47406e eVar2 = (C47406e) C47406e.parseDelimitedFrom(C47406e.f123136c, fileInputStream, baVar);
                        if (eVar2 != null) {
                            C58833ax k3 = C58833ax.m90834k(eVar2);
                            fileInputStream.close();
                            if (lock != null) {
                                lock.close();
                            }
                            fileInputStream4.close();
                            return k3;
                        }
                        throw new C47408g();
                    } catch (C62974ct e2) {
                        throw new C47408g(e2);
                    } catch (Throwable th3) {
                        C47407f.m84253a(th, th3);
                    }
                } else {
                    C58836b bVar = C58836b.f156633a;
                    if (lock != null) {
                        lock.close();
                    }
                    fileInputStream4.close();
                    return bVar;
                }
            } catch (Throwable th4) {
                if (lock != null) {
                    lock.close();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                fileInputStream4.close();
            } catch (Throwable th6) {
                C47407f.m84253a(th5, th6);
            }
            throw th5;
        }
        throw th;
        throw th;
        throw th;
    }
}
