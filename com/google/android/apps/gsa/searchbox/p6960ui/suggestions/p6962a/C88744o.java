package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88693b;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.o */
/* compiled from: PG */
public final class C88744o extends C88734e implements C89199d {

    /* renamed from: c */
    private static final Pattern f240072c = Pattern.compile("content://com\\.android\\.contacts/contacts/lookup/([\\S]+)/.*");

    public C88744o(Context context, C88693b bVar) {
        super(context, bVar);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 85;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spanned mo82443m(Suggestion suggestion, C88710k kVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Long mo82444n(Suggestion suggestion) {
        String L = C89235z.m73092L(suggestion);
        if (L == null) {
            return null;
        }
        Uri parse = Uri.parse(L);
        if (!ContactsContract.AUTHORITY_URI.getScheme().equals(parse.getScheme()) || !"com.android.contacts".equals(parse.getAuthority())) {
            return null;
        }
        return Long.valueOf(ContentUris.parseId(parse));
    }

    /* renamed from: o */
    public final String mo82445o(Suggestion suggestion) {
        String g = C41670aj.m73074g(suggestion);
        if (TextUtils.isEmpty(g)) {
            return null;
        }
        Matcher matcher = f240072c.matcher(g);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }
}
