package com.google.android.libraries.p11029ao.p11032c;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.OsConstants;
import android.system.StructStat;
import androidx.core.content.C1879e;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ao.c.g */
/* compiled from: PG */
public final class C147806g {

    /* renamed from: a */
    private static final String[] f398784a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};

    /* renamed from: b */
    private static final String[] f398785b;

    /* renamed from: c */
    private static final String[] f398786c = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "com.google.android.apps.docs.storage.legacy"};

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        strArr[1] = true != (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? BuildConfig.FLAVOR : "androidx.test.services.storage.runfiles";
        f398785b = strArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0092  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.AssetFileDescriptor m240907a(android.content.Context r7, android.net.Uri r8, java.lang.String r9, com.google.android.libraries.p11029ao.p11032c.C147805f r10) {
        /*
            android.content.ContentResolver r0 = r7.getContentResolver()
            android.net.Uri r8 = m240913g(r8)
            java.lang.String r1 = r8.getScheme()
            java.lang.String r2 = "android.resource"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0019
            android.content.res.AssetFileDescriptor r7 = r0.openAssetFileDescriptor(r8, r9)
            return r7
        L_0x0019:
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x009a
            int r1 = r9.hashCode()
            r2 = 114(0x72, float:1.6E-43)
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == r2) goto L_0x0067
            r2 = 119(0x77, float:1.67E-43)
            if (r1 == r2) goto L_0x005d
            r2 = 3653(0xe45, float:5.119E-42)
            if (r1 == r2) goto L_0x0053
            r2 = 3805(0xedd, float:5.332E-42)
            if (r1 == r2) goto L_0x0049
            r2 = 113359(0x1bacf, float:1.5885E-40)
            if (r1 == r2) goto L_0x003f
            goto L_0x0071
        L_0x003f:
            java.lang.String r1 = "rwt"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0071
            r1 = 4
            goto L_0x0072
        L_0x0049:
            java.lang.String r1 = "wt"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0071
            r1 = 2
            goto L_0x0072
        L_0x0053:
            java.lang.String r1 = "rw"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0071
            r1 = 3
            goto L_0x0072
        L_0x005d:
            java.lang.String r1 = "w"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0071
            r1 = 1
            goto L_0x0072
        L_0x0067:
            java.lang.String r1 = "r"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0071
            r1 = 0
            goto L_0x0072
        L_0x0071:
            r1 = -1
        L_0x0072:
            if (r1 == 0) goto L_0x0083
            if (r1 == r6) goto L_0x0084
            if (r1 == r5) goto L_0x0084
            if (r1 == r4) goto L_0x0084
            if (r1 != r3) goto L_0x007d
            goto L_0x0084
        L_0x007d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L_0x0083:
            r5 = 1
        L_0x0084:
            boolean r7 = m240917k(r7, r8, r5, r10)
            if (r7 == 0) goto L_0x0092
            android.content.res.AssetFileDescriptor r7 = r0.openAssetFileDescriptor(r8, r9)
            m240919m(r7)
            return r7
        L_0x0092:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = "Can't open content uri."
            r7.<init>(r8)
            throw r7
        L_0x009a:
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00c5
            android.content.res.AssetFileDescriptor r9 = r0.openAssetFileDescriptor(r8, r9)
            m240919m(r9)
            android.os.ParcelFileDescriptor r0 = r9.getParcelFileDescriptor()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00b1 }
            m240916j(r7, r0, r8, r10)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00b1 }
            return r9
        L_0x00b1:
            r7 = move-exception
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            java.lang.String r10 = "Validation failed."
            r8.<init>(r10)
            r8.initCause(r7)
            m240910d(r9, r8)
            throw r8
        L_0x00c0:
            r7 = move-exception
            m240910d(r9, r7)
            throw r7
        L_0x00c5:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = "Unsupported scheme"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p11029ao.p11032c.C147806g.m240907a(android.content.Context, android.net.Uri, java.lang.String, com.google.android.libraries.ao.c.f):android.content.res.AssetFileDescriptor");
    }

    /* renamed from: b */
    public static InputStream m240908b(Context context, Uri uri) {
        return m240909c(context, uri, C147805f.f398779a);
    }

    /* renamed from: c */
    public static InputStream m240909c(Context context, Uri uri, C147805f fVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = m240913g(uri);
        String scheme = g.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(g);
        }
        if ("content".equals(scheme)) {
            if (m240917k(context, g, 1, fVar)) {
                InputStream openInputStream = contentResolver.openInputStream(g);
                m240919m(openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(g.getPath()).getCanonicalFile()), C33259r.f88929b);
                try {
                    m240916j(context, openFileDescriptor, g, fVar);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e) {
                    m240915i(openFileDescriptor, e);
                    throw e;
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e2);
                    m240915i(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    /* renamed from: d */
    public static void m240910d(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            C147800a.m240902a(fileNotFoundException, e);
        }
    }

    /* renamed from: e */
    public static AssetFileDescriptor m240911e(Context context, Uri uri) {
        return m240907a(context, uri, "w", C147805f.f398779a);
    }

    /* renamed from: f */
    public static AssetFileDescriptor m240912f(Context context, Uri uri, CancellationSignal cancellationSignal, C147805f fVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri g = m240913g(uri);
        String scheme = g.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(g, C33259r.f88929b, cancellationSignal);
        }
        if ("content".equals(scheme)) {
            if (m240917k(context, g, 1, fVar)) {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(g, C33259r.f88929b, cancellationSignal);
                m240919m(openAssetFileDescriptor);
                return openAssetFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(g, C33259r.f88929b, cancellationSignal);
            try {
                m240916j(context, openAssetFileDescriptor2.getParcelFileDescriptor(), g, fVar);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e) {
                m240910d(openAssetFileDescriptor2, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                m240910d(openAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    /* renamed from: g */
    private static Uri m240913g(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    /* renamed from: h */
    private static String m240914h(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    /* renamed from: i */
    private static void m240915i(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            C147800a.m240902a(fileNotFoundException, e);
        }
    }

    /* renamed from: j */
    private static void m240916j(Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, C147805f fVar) {
        File b;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        StructStat structStat = (StructStat) C147811l.m240920a(new C147810k(parcelFileDescriptor.getFileDescriptor()));
        long j = structStat.st_dev;
        long j2 = structStat.st_ino;
        OsConstants.S_ISLNK(structStat.st_mode);
        StructStat structStat2 = (StructStat) C147811l.m240920a(new C147809j(canonicalPath));
        long j3 = structStat2.st_dev;
        long j4 = structStat2.st_ino;
        if (OsConstants.S_ISLNK(structStat2.st_mode)) {
            throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
        } else if (j == j3 && j2 == j4) {
            if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
                C147805f fVar2 = C147805f.f398779a;
                if (!fVar.f398782d) {
                    File b2 = C1879e.m5132b(context);
                    boolean z = true;
                    if (b2 == null ? !canonicalPath.startsWith(m240914h(Environment.getDataDirectory())) : !canonicalPath.startsWith(m240914h(b2))) {
                        Context a = C1879e.m5131a(context);
                        if (a == null || (b = C1879e.m5132b(a)) == null || !canonicalPath.startsWith(m240914h(b))) {
                            File[] l = m240918l(new C147801b(context));
                            int length = l.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    File file = l[i];
                                    if (file != null && canonicalPath.startsWith(m240914h(file))) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    File[] l2 = m240918l(new C147802c(context));
                                    int length2 = l2.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < length2) {
                                            File file2 = l2[i2];
                                            if (file2 != null && canonicalPath.startsWith(m240914h(file2))) {
                                                break;
                                            }
                                            i2++;
                                        } else {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (z == fVar.f398781c) {
                        return;
                    }
                }
            }
            throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
        } else {
            throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
        }
    }

    /* renamed from: k */
    private static boolean m240917k(Context context, Uri uri, int i, C147805f fVar) {
        int i2;
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                C147805f fVar2 = C147805f.f398779a;
                return !fVar.f398781c;
            }
        }
        C147812m mVar = new C147812m(resolveContentProvider);
        C147805f fVar3 = C147805f.f398779a;
        C58485gu guVar = fVar.f398783e;
        int i3 = ((C58724pq) guVar).f156474d;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                i2 = 3;
                break;
            }
            int a = ((C147813n) guVar.get(i4)).mo124472a(context, mVar, fVar.f398781c);
            int i5 = a - 1;
            if (a != 0) {
                i4++;
                if (i5 != 0) {
                    if (i5 == 1) {
                        i2 = 2;
                        break;
                    }
                } else {
                    i2 = 1;
                    break;
                }
            } else {
                throw null;
            }
        }
        int i6 = i2 - 1;
        if (i6 == 0) {
            return true;
        }
        if (i6 == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            return fVar.f398781c;
        }
        if (fVar.f398781c) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0 && resolveContentProvider.exported) {
            String[] strArr = f398785b;
            int length = strArr.length;
            for (int i7 = 0; i7 < 2; i7++) {
                if (strArr[i7].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = f398786c;
            int length2 = strArr2.length;
            for (int i8 = 0; i8 < 3; i8++) {
                if (strArr2[i8].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = f398784a;
            for (int i9 = 0; i9 < 6; i9++) {
                String str = strArr3[i9];
                if (str.charAt(str.length() - 1) == '.') {
                    if (resolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (resolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: l */
    private static File[] m240918l(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: m */
    private static void m240919m(Object obj) {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }
}
