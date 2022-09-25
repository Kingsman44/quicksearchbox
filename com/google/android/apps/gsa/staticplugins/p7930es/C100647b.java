package com.google.android.apps.gsa.staticplugins.p7930es;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.libraries.p1646ay.C19602d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.b */
/* compiled from: PG */
public final class C100647b extends C19602d {

    /* renamed from: a */
    public static final C59071e f281445a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.es.b");

    /* renamed from: b */
    private final Context f281446b;

    public C100647b(Context context) {
        this.f281446b = context;
    }

    /* renamed from: g */
    static File m166803g(String str, Context context) {
        return new File(new File(context.getCacheDir(), "rawmms"), str);
    }

    /* renamed from: h */
    public static boolean m166804h(String str) {
        return str.matches("\\d+");
    }

    /* renamed from: a */
    public final String mo24914a(Uri uri) {
        return null;
    }

    /* renamed from: b */
    public final Cursor mo24915b(Uri uri, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final Uri mo24916c(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final ParcelFileDescriptor mo24917d(Uri uri, String str) {
        C74507e.m120470f(23);
        try {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null || !m166804h(lastPathSegment)) {
                ((C59052c) ((C59052c) f281445a.mo56225c()).mo56372aa(33913)).mo56389s("invalid file id = %s", lastPathSegment);
                throw new IllegalArgumentException("Invalid file id");
            }
            return ParcelFileDescriptor.open(m166803g(lastPathSegment, this.f281446b), true != TextUtils.equals(str, C33259r.f88929b) ? 603979776 : 268435456);
        } catch (FileNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f281445a.mo56225c()).mo56382g(e)).mo56372aa(33914)).mo56386p("Failed to get a ParcelFileDescriptor.");
            throw new IllegalArgumentException("File not found");
        }
    }

    /* renamed from: k */
    public final int mo24918k(Uri uri) {
        C74507e.m120468d(23);
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || !m166804h(lastPathSegment) || !m166803g(lastPathSegment, this.f281446b).delete()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: l */
    public final int mo24919l() {
        C74507e.m120472h(23);
        return 0;
    }
}
