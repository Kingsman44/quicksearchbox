package com.google.android.apps.gsa.staticplugins.publiccontent;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.contentprovider.a;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.p7008az.C89333b;
import com.google.android.apps.gsa.shared.search.C90494d;
import com.google.apps.tiktok.inject.C47266f;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class GsaPublicContentProvider extends C90494d {

    /* renamed from: a */
    public Map f321676a;

    /* renamed from: b */
    public a f321677b;

    /* renamed from: c */
    private boolean f321678c = false;

    /* renamed from: com.google.android.apps.gsa.staticplugins.publiccontent.GsaPublicContentProvider$a */
    /* compiled from: PG */
    public interface C116007a {
        /* renamed from: qY */
        void mo102405qY(GsaPublicContentProvider gsaPublicContentProvider);
    }

    /* renamed from: b */
    private final Uri m192325b(Uri uri) {
        if (uri.getQueryParameter("calling_package_name") != null) {
            return null;
        }
        String callingPackage = getCallingPackage();
        return !TextUtils.isEmpty(callingPackage) ? uri.buildUpon().appendQueryParameter("calling_package_name", callingPackage).build() : uri;
    }

    /* renamed from: c */
    private final synchronized void m192326c() {
        if (!this.f321678c) {
            ((C116007a) C47266f.m84076a(getContext().getApplicationContext(), C116007a.class)).mo102405qY(this);
            this.f321678c = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Uri mo102398a(Uri uri) {
        String str;
        if ("com.google.android.googlequicksearchbox.ExternalExperimentInfoProvider".equals(uri.getAuthority())) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.authority("com.google.android.googlequicksearchbox.GsaPublicContentProvider");
            buildUpon.path("publicvalue".concat(String.valueOf(uri.getPath())));
            uri = buildUpon.build();
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            str = null;
        } else {
            str = pathSegments.get(0);
        }
        C89333b bVar = (C89333b) this.f321676a.get(str);
        if (bVar != null) {
            Uri.Builder buildUpon2 = uri.buildUpon();
            buildUpon2.authority(bVar.f242198a);
            List<String> pathSegments2 = uri.getPathSegments();
            buildUpon2.path(BuildConfig.FLAVOR);
            for (int i = 1; i < pathSegments2.size(); i++) {
                buildUpon2.appendPath(pathSegments2.get(i));
            }
            return bVar.mo83278a(buildUpon2.build());
        }
        throw new IllegalArgumentException("URI does not contain a valid semantic path");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        C74507e.m120468d(11);
        m192326c();
        return this.f321677b.a(mo102398a(uri), str, strArr);
    }

    public final String getType(Uri uri) {
        m192326c();
        return this.f321677b.e(mo102398a(uri));
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        C74507e.m120469e(11);
        m192326c();
        if (m192325b(uri) == null) {
            return Uri.EMPTY;
        }
        return this.f321677b.b(mo102398a(uri), contentValues);
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        C74507e.m120470f(11);
        m192326c();
        Uri b = m192325b(uri);
        if (b == null) {
            return null;
        }
        return this.f321677b.c(mo102398a(b), str);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C74507e.m120471g(11);
        m192326c();
        Uri b = m192325b(uri);
        if (b == null) {
            return null;
        }
        return this.f321677b.g(mo102398a(b), strArr, str, strArr2, str2);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
