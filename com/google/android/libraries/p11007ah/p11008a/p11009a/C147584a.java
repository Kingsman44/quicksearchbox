package com.google.android.libraries.p11007ah.p11008a.p11009a;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.tips.configuration.C131678c;

/* renamed from: com.google.android.libraries.ah.a.a.a */
/* compiled from: PG */
public abstract class C147584a extends ContentProvider {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C147589f mo110252a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C131678c mo110253b();

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle call(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            int r5 = android.os.Binder.getCallingUid()
            int r0 = android.os.Process.myUid()
            if (r5 == r0) goto L_0x0021
            android.content.Context r0 = r2.getContext()
            com.google.android.gms.common.ac r0 = com.google.android.gms.common.C143701ac.m233450a(r0)
            boolean r5 = r0.mo119085d(r5)
            if (r5 == 0) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            java.lang.SecurityException r3 = new java.lang.SecurityException
            java.lang.String r4 = "Unauthorized usage."
            r3.<init>(r4)
            throw r3
        L_0x0021:
            int r5 = r3.hashCode()
            r0 = -1906941595(0xffffffff8e566165, float:-2.642443E-30)
            r1 = 1
            if (r5 == r0) goto L_0x003b
            r0 = 885859434(0x34cd246a, float:3.821072E-7)
            if (r5 == r0) goto L_0x0031
            goto L_0x0045
        L_0x0031:
            java.lang.String r5 = "getVisibilityConfig"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0045
            r5 = 0
            goto L_0x0046
        L_0x003b:
            java.lang.String r5 = "getContentConfig"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0045
            r5 = 1
            goto L_0x0046
        L_0x0045:
            r5 = -1
        L_0x0046:
            r0 = 0
            if (r5 == 0) goto L_0x009e
            if (r5 != r1) goto L_0x0085
            r4.getClass()
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.tips.configuration.c r3 = r2.mo110253b()
            if (r3 == 0) goto L_0x0073
            com.google.android.libraries.ah.a.a.c r3 = com.google.android.libraries.p11007ah.p11008a.p11009a.C147586c.f398384c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.ah.a.a.b r3 = (com.google.android.libraries.p11007ah.p11008a.p11009a.C147585b) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.libraries.ah.a.a.c r4 = (com.google.android.libraries.p11007ah.p11008a.p11009a.C147586c) r4
            int r5 = r4.f398386a
            r5 = r5 | r1
            r4.f398386a = r5
            java.lang.String r5 = "settingIsEnabled"
            r4.f398387b = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.ah.a.a.c r3 = (com.google.android.libraries.p11007ah.p11008a.p11009a.C147586c) r3
            goto L_0x0074
        L_0x0073:
            r3 = r0
        L_0x0074:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            if (r3 == 0) goto L_0x007f
            byte[] r0 = r3.toByteArray()
        L_0x007f:
            java.lang.String r3 = "article_content_config"
            r4.putByteArray(r3, r0)
            return r4
        L_0x0085:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported operation '"
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = "' for Tips gateway 1.0"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x009e:
            r4.getClass()
            com.google.android.libraries.ah.a.a.f r3 = r2.mo110252a(r4)
            if (r3 == 0) goto L_0x00ac
            com.google.android.libraries.ah.a.a.e r3 = r3.mo110257a()
            goto L_0x00ad
        L_0x00ac:
            r3 = r0
        L_0x00ad:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            if (r3 == 0) goto L_0x00b8
            byte[] r0 = r3.toByteArray()
        L_0x00b8:
            java.lang.String r3 = "article_visibility_config"
            r4.putByteArray(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p11007ah.p11008a.p11009a.C147584a.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("'delete' operation not supported in Tips gateway 1.0");
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("'insert' operation not supported in Tips gateway 1.0");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("'update' operation not supported in Tips gateway 1.0");
    }
}
