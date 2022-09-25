package com.google.android.apps.gsa.search.core.google;

import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.p6501ad.C84414a;
import com.google.android.apps.gsa.search.core.p6501ad.C84415b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1646ay.C19602d;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.google.ae */
/* compiled from: PG */
public final class C85847ae extends C19602d {

    /* renamed from: a */
    private final UriMatcher f232120a;

    /* renamed from: b */
    private final C68214a f232121b;

    public C85847ae(C68214a aVar) {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.google.android.googlequicksearchbox.google", "search_suggest_query", 0);
        uriMatcher.addURI("com.google.android.googlequicksearchbox.google", "search_suggest_query/*", 0);
        uriMatcher.addURI("com.google.android.googlequicksearchbox.google", "search_suggest_shortcut", 1);
        uriMatcher.addURI("com.google.android.googlequicksearchbox.google", "search_suggest_shortcut/*", 1);
        this.f232120a = uriMatcher;
        this.f232121b = aVar;
    }

    /* renamed from: a */
    public final String mo24914a(Uri uri) {
        return "vnd.android.cursor.dir/vnd.android.search.suggest";
    }

    /* renamed from: b */
    public final Cursor mo24915b(Uri uri, String[] strArr) {
        Query query;
        C74507e.m120471g(16);
        int match = this.f232120a.match(uri);
        if (match == 0) {
            if (uri.getPathSegments().size() > 1) {
                query = Query.f252741b.mo84268aE(uri.getLastPathSegment(), false);
            } else {
                query = Query.f252741b;
            }
            C84414a b = ((C85974dt) this.f232121b.mo27525b()).mo79505b(query.mo84352bk());
            if (b == null) {
                b = new C84414a(((C85974dt) this.f232121b.mo27525b()).mo79504a(), query);
            }
            return new C84415b(b);
        } else if (match == 1) {
            return null;
        } else {
            throw new IllegalArgumentException("Unknown URI ".concat(String.valueOf(String.valueOf(uri))));
        }
    }
}
