package com.google.android.apps.gsa.staticplugins.p7960g.p7963c;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.p7008az.C89333b;
import com.google.android.apps.gsa.shared.p7008az.C89334c;
import com.google.android.libraries.p1646ay.C19602d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.c.b */
/* compiled from: PG */
public final class C101281b extends C19602d {

    /* renamed from: a */
    public static final C58485gu f282662a = C58485gu.m89832B("_data", "title", "_display_name", "datetaken", "date_added", "date_modified", "mime_type", "width", "height", "_size");

    /* renamed from: b */
    public static final C58528ij f282663b = C58528ij.m90013M(0, 1, 2, 6);

    /* renamed from: c */
    public static final C58528ij f282664c = C58528ij.m90012L(3, 4, 5);

    /* renamed from: d */
    private static final C59071e f282665d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.g.c.b");

    /* renamed from: e */
    private boolean f282666e = false;

    /* renamed from: f */
    private C101280a f282667f;

    /* renamed from: g */
    private C101280a f282668g;

    /* renamed from: h */
    private final Context f282669h;

    /* renamed from: i */
    private final SharedPreferences f282670i;

    /* renamed from: j */
    private final C89333b f282671j;

    public C101281b(Context context, SharedPreferences sharedPreferences, C89334c cVar) {
        this.f282669h = context;
        this.f282670i = sharedPreferences;
        this.f282671j = cVar.mo83282a("assist", "com.google.android.apps.gsa.staticplugins.assist.screenshot.ScreenshotProvider");
    }

    /* renamed from: i */
    private final File m167548i(Uri uri) {
        if (uri.equals(Uri.EMPTY)) {
            return null;
        }
        File filesDir = this.f282669h.getFilesDir();
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null) {
            return null;
        }
        File file = new File(filesDir, Uri.decode(encodedPath));
        try {
            File canonicalFile = file.getCanonicalFile();
            try {
                if (canonicalFile.getPath().startsWith(filesDir.getCanonicalFile().getPath())) {
                    File parentFile = canonicalFile.getParentFile();
                    if (parentFile == null) {
                        return null;
                    }
                    String name = parentFile.getName();
                    if (name.equals("ScreenAssistScreenshots") || name.equals("ScreenAssistCropScreenshots")) {
                        return parentFile;
                    }
                    throw new FileNotFoundException("Inaccessible directory: ".concat(String.valueOf(String.valueOf(uri))));
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(String.valueOf(filesDir))), e);
            }
        } catch (IOException e2) {
            throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file.toString()), e2);
        }
    }

    /* renamed from: j */
    private static boolean m167549j(Uri uri) {
        if (uri.equals(Uri.EMPTY)) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments.get(pathSegments.size() - 2).equals("ScreenAssistCropScreenshots");
    }

    /* renamed from: a */
    public final String mo24914a(Uri uri) {
        mo92215f(uri);
        C101280a e = mo92214e(uri);
        return (e == null || !e.f282660a.equals(this.f282671j.mo83278a(uri))) ? BuildConfig.FLAVOR : "image/png";
    }

    /* renamed from: b */
    public final Cursor mo24915b(Uri uri, String[] strArr) {
        C74507e.m120471g(17);
        mo92215f(uri);
        C101280a e = mo92214e(uri);
        Uri a = this.f282671j.mo83278a(uri);
        if (e == null || !e.f282660a.equals(a)) {
            throw new IllegalArgumentException("Invalid uri: ".concat(String.valueOf(String.valueOf(a))));
        }
        C58485gu guVar = f282662a;
        MatrixCursor matrixCursor = new MatrixCursor((String[]) guVar.toArray(new String[((C58724pq) guVar).f156474d]), 1);
        matrixCursor.addRow(e.f282661b);
        return matrixCursor;
    }

    /* renamed from: c */
    public final Uri mo24916c(Uri uri, ContentValues contentValues) {
        C74507e.m120469e(17);
        boolean j = m167549j(uri);
        if (j) {
            mo92216g((C101280a) null);
        } else {
            mo92217h((C101280a) null);
        }
        int i = 0;
        try {
            File i2 = m167548i(uri);
            if (i2 != null && i2.exists() && i2.isDirectory()) {
                String name = new File(uri.toString()).getName();
                File[] listFiles = i2.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isFile() && !file.getName().equals(name)) {
                            file.delete();
                        }
                    }
                }
            }
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f282665d.mo56226d()).mo56382g(e)).mo56372aa(13850)).mo56386p("Failed to delete screenshot files.");
        }
        this.f282670i.edit().putString("screen_assist_screenshot_uri", contentValues.getAsString("_data")).putLong("screen_assist_screenshot_timestamp", contentValues.getAsLong("datetaken").longValue()).putInt("screen_assist_screenshot_width", contentValues.getAsInteger("width").intValue()).putInt("screen_assist_screenshot_height", contentValues.getAsInteger("height").intValue()).apply();
        Object[] objArr = new Object[((C58724pq) f282662a).f156474d];
        while (true) {
            C58485gu guVar = f282662a;
            if (i >= ((C58724pq) guVar).f156474d) {
                break;
            }
            C58528ij ijVar = f282663b;
            Integer valueOf = Integer.valueOf(i);
            if (ijVar.contains(valueOf)) {
                objArr[i] = contentValues.getAsString((String) guVar.get(i));
            } else if (f282664c.contains(valueOf)) {
                objArr[i] = contentValues.getAsLong((String) guVar.get(i));
            } else {
                objArr[i] = contentValues.getAsInteger((String) guVar.get(i));
            }
            i++;
        }
        if (j) {
            mo92216g(new C101280a(uri, objArr));
        } else {
            mo92217h(new C101280a(uri, objArr));
        }
        return uri;
    }

    /* renamed from: d */
    public final ParcelFileDescriptor mo24917d(Uri uri, String str) {
        C74507e.m120470f(17);
        mo92215f(uri);
        File i = m167548i(uri);
        if (i != null) {
            i.mkdirs();
            return ParcelFileDescriptor.open(new File(i, uri.getLastPathSegment()), ParcelFileDescriptor.parseMode(str.toLowerCase(Locale.getDefault())));
        }
        ((C59052c) ((C59052c) f282665d.mo56225c()).mo56372aa(13851)).mo56389s("Path not found for uri %s", uri);
        throw new FileNotFoundException("Path not found for uri ".concat(String.valueOf(uri.toString())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized C101280a mo92214e(Uri uri) {
        if (m167549j(uri)) {
            return this.f282668g;
        }
        return this.f282667f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo92215f(Uri uri) {
        if (!this.f282666e) {
            String string = this.f282670i.getString("screen_assist_screenshot_uri", (String) null);
            if (string == null) {
                this.f282666e = true;
                return;
            }
            Uri parse = Uri.parse(string);
            String lastPathSegment = parse.getLastPathSegment();
            if (lastPathSegment.equals(uri.getLastPathSegment())) {
                long j = this.f282670i.getLong("screen_assist_screenshot_timestamp", 0);
                int i = this.f282670i.getInt("screen_assist_screenshot_width", 0);
                int i2 = this.f282670i.getInt("screen_assist_screenshot_height", 0);
                Long valueOf = Long.valueOf(j / 1000);
                Object[] objArr = {parse.toString(), lastPathSegment, lastPathSegment, Long.valueOf(j), valueOf, valueOf, "image/png", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(new File(parse.toString()).length())};
                if (m167549j(parse)) {
                    mo92216g(new C101280a(parse, objArr));
                } else {
                    mo92217h(new C101280a(parse, objArr));
                }
                this.f282666e = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo92216g(C101280a aVar) {
        this.f282668g = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized void mo92217h(C101280a aVar) {
        this.f282667f = aVar;
    }
}
