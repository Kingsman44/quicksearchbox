package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.t */
/* compiled from: PG */
public final class C5945t extends C5942q {

    /* renamed from: a */
    private static final UriMatcher f17602a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f17602a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C5945t(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo12377f(android.net.Uri r4, android.content.ContentResolver r5) {
        /*
            r3 = this;
            android.content.UriMatcher r0 = f17602a
            int r0 = r0.match(r4)
            r1 = 1
            if (r0 == r1) goto L_0x0019
            r2 = 3
            if (r0 == r2) goto L_0x0014
            r2 = 5
            if (r0 == r2) goto L_0x0019
            java.io.InputStream r5 = r5.openInputStream(r4)
            goto L_0x0023
        L_0x0014:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r1)
            goto L_0x0023
        L_0x0019:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4)
            if (r0 == 0) goto L_0x003a
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r0, r1)
        L_0x0023:
            if (r5 == 0) goto L_0x0026
            return r5
        L_0x0026:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "InputStream is null for "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r4)
            throw r5
        L_0x003a:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.C5945t.mo12377f(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ void mo12378g(Object obj) {
        ((InputStream) obj).close();
    }
}
