package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.libraries.p1646ay.C19602d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.a */
/* compiled from: PG */
public final class C107131a extends C19602d {

    /* renamed from: a */
    public static final C59071e f298209a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ap.a");

    /* renamed from: b */
    private final Context f298210b;

    public C107131a(Context context) {
        this.f298210b = context;
    }

    /* renamed from: g */
    static File m177852g(String str, Context context) {
        return new File(new File(context.getCacheDir(), "personal_photos"), str);
    }

    /* renamed from: a */
    public final String mo24914a(Uri uri) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
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
        C74507e.m120470f(20);
        try {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                return ParcelFileDescriptor.open(m177852g(lastPathSegment, this.f298210b), true != TextUtils.equals(str, C33259r.f88929b) ? 603979776 : 268435456);
            }
            ((C59052c) ((C59052c) f298209a.mo56225c()).mo56372aa(25328)).mo56389s("Invalid file name = %s", (Object) null);
            throw new IllegalArgumentException("Invalid file id");
        } catch (FileNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f298209a.mo56225c()).mo56382g(e)).mo56372aa(25329)).mo56386p("Failed to get a ParcelFileDescriptor.");
            throw new IllegalArgumentException("File not found");
        }
    }

    /* renamed from: k */
    public final int mo24918k(Uri uri) {
        C74507e.m120468d(20);
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || !m177852g(lastPathSegment, this.f298210b).delete()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: l */
    public final int mo24919l() {
        C74507e.m120472h(20);
        return 0;
    }
}
