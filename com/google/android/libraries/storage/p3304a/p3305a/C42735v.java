package com.google.android.libraries.storage.p3304a.p3305a;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.storage.p3304a.p3307c.C42763p;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42740a;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42741b;
import com.google.android.libraries.storage.p3304a.p3313g.C42799b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4541l.C59316ad;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.storage.a.a.v */
/* compiled from: PG */
public final class C42735v implements C42799b {

    /* renamed from: a */
    private final C42763p f111993a;

    public C42735v() {
        this.f111993a = new C42763p();
    }

    public C42735v(C42763p pVar) {
        this.f111993a = pVar;
    }

    /* renamed from: a */
    public final long mo45825a(Uri uri) {
        File a = C42733t.m75495a(uri);
        if (a.isDirectory()) {
            return 0;
        }
        return a.length();
    }

    /* renamed from: b */
    public final Pair mo45812b(Uri uri) {
        return C42731r.m75493a(ParcelFileDescriptor.open(C42733t.m75495a(uri), 268435456));
    }

    /* renamed from: c */
    public final C42763p mo45826c() {
        return this.f111993a;
    }

    /* renamed from: d */
    public final File mo45813d(Uri uri) {
        return C42733t.m75495a(uri);
    }

    /* renamed from: e */
    public final InputStream mo45814e(Uri uri) {
        File a = C42733t.m75495a(uri);
        return new C42740a(new FileInputStream(a), a);
    }

    /* renamed from: f */
    public final OutputStream mo45827f(Uri uri) {
        File a = C42733t.m75495a(uri);
        C59316ad.m92162b(a);
        return new C42741b(new FileOutputStream(a, true), a);
    }

    /* renamed from: g */
    public final OutputStream mo45828g(Uri uri) {
        File a = C42733t.m75495a(uri);
        C59316ad.m92162b(a);
        return new C42741b(new FileOutputStream(a), a);
    }

    /* renamed from: h */
    public final Iterable mo45829h(Uri uri) {
        File a = C42733t.m75495a(uri);
        if (a.isDirectory()) {
            File[] listFiles = a.listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    String absolutePath = file.getAbsolutePath();
                    if (file.isDirectory() && !absolutePath.endsWith("/")) {
                        absolutePath = String.valueOf(absolutePath).concat("/");
                    }
                    Uri.Builder path = new Uri.Builder().scheme("file").authority(BuildConfig.FLAVOR).path("/");
                    C58480gp e = C58485gu.m89837e();
                    path.path(absolutePath);
                    arrayList.add(C42732s.m75494a(path, e));
                }
                return arrayList;
            }
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", new Object[]{uri}));
        }
        throw new FileNotFoundException(String.format("%s is not a directory", new Object[]{uri}));
    }

    /* renamed from: i */
    public final String mo45815i() {
        return "file";
    }

    /* renamed from: j */
    public final void mo45830j(Uri uri) {
        if (!C42733t.m75495a(uri).mkdirs()) {
            throw new IOException(String.format("%s could not be created", new Object[]{uri}));
        }
    }

    /* renamed from: k */
    public final void mo45831k(Uri uri) {
        File a = C42733t.m75495a(uri);
        if (!a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", new Object[]{uri}));
        } else if (!a.delete()) {
            throw new IOException(String.format("%s could not be deleted", new Object[]{uri}));
        }
    }

    /* renamed from: l */
    public final void mo45832l(Uri uri) {
        File a = C42733t.m75495a(uri);
        if (a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", new Object[]{uri}));
        } else if (a.delete()) {
        } else {
            if (!a.exists()) {
                throw new FileNotFoundException(String.format("%s does not exist", new Object[]{uri}));
            } else {
                throw new IOException(String.format("%s could not be deleted", new Object[]{uri}));
            }
        }
    }

    /* renamed from: m */
    public final void mo45833m(Uri uri, Uri uri2) {
        File a = C42733t.m75495a(uri);
        File a2 = C42733t.m75495a(uri2);
        C59316ad.m92162b(a2);
        if (!a.renameTo(a2)) {
            throw new IOException(String.format("%s could not be renamed to %s", new Object[]{uri, uri2}));
        }
    }

    /* renamed from: n */
    public final boolean mo45816n(Uri uri) {
        return C42733t.m75495a(uri).exists();
    }

    /* renamed from: o */
    public final boolean mo45834o(Uri uri) {
        return C42733t.m75495a(uri).isDirectory();
    }
}
