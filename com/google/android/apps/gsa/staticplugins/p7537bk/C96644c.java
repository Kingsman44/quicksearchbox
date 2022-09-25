package com.google.android.apps.gsa.staticplugins.p7537bk;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.p6519al.p6566aw.C84753a;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7195y.C91200be;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.p1646ay.C19602d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bk.c */
/* compiled from: PG */
public final class C96644c extends C19602d {

    /* renamed from: a */
    private static final C59071e f270376a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bk.c");

    /* renamed from: b */
    private final C84753a f270377b;

    /* renamed from: c */
    private final C86338r f270378c;

    /* renamed from: d */
    private final UriMatcher f270379d;

    public C96644c(C84753a aVar, C86338r rVar) {
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f270379d = uriMatcher;
        uriMatcher.addURI("com.google.android.googlequicksearchbox.NetworkImageLoaderContentProvider", "icon", 1);
        uriMatcher.addURI("com.google.android.googlequicksearchbox.NetworkImageLoaderContentProvider", "stream_image", 2);
        this.f270377b = aVar;
        this.f270378c = rVar;
    }

    /* renamed from: a */
    public final String mo24914a(Uri uri) {
        int match = this.f270379d.match(uri);
        if (match == 1 || match == 2) {
            return "vnd.android.cursor.item/fetchCode";
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
        C74507e.m120470f(18);
        C58976aa aaVar = C58975e.f156826a;
        List<String> pathSegments = uri.getPathSegments();
        if (!pathSegments.isEmpty()) {
            String str2 = pathSegments.get(0);
            if (C91200be.f254584a.containsKey(str2)) {
                Uri.Builder buildUpon = Uri.parse(this.f270378c.getString((String) C91200be.f254584a.get(str2), (String) null)).buildUpon();
                for (String next : uri.getQueryParameterNames()) {
                    buildUpon.appendQueryParameter(next, uri.getQueryParameter(next));
                }
                uri = buildUpon.build();
            }
        }
        try {
            if (this.f270379d.match(uri) == 1) {
                return (ParcelFileDescriptor) C90877ak.m148472f(this.f270377b.mo78461a(uri, false));
            }
            if (this.f270379d.match(uri) == 2) {
                return (ParcelFileDescriptor) C90877ak.m148472f(this.f270377b.mo78461a(uri, true));
            }
            throw new IllegalArgumentException("Unknown URI: ".concat(String.valueOf(String.valueOf(uri))));
        } catch (InterruptedException | ExecutionException e) {
            C59104x c = f270376a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NetworkImageLoaderConte");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(20743)).mo56386p("Failed to get ParcelFileDescriptor from NetworkImageLoaderWork.");
        }
    }

    /* renamed from: k */
    public final int mo24918k(Uri uri) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    public final int mo24919l() {
        throw new UnsupportedOperationException();
    }
}
