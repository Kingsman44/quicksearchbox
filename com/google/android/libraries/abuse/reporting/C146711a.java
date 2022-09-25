package com.google.android.libraries.abuse.reporting;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.p060c.C0984n;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142915o;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.tasks.C146021aq;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* renamed from: com.google.android.libraries.abuse.reporting.a */
/* compiled from: PG */
public final class C146711a {

    /* renamed from: a */
    public static final C0984n f396197a;

    /* renamed from: b */
    public final Executor f396198b;

    /* renamed from: c */
    public final C146740i f396199c;

    /* renamed from: d */
    public final Uri f396200d;

    /* renamed from: e */
    private final String f396201e;

    /* renamed from: f */
    private final Context f396202f;

    /* renamed from: g */
    private final C142915o f396203g;

    static {
        C0984n nVar = new C0984n(0);
        f396197a = nVar;
        nVar.put("User-Agent", "Report abuse Google-API-Java-Client Google-HTTP-Java-Client/1.22.0-SNAPSHOT (gzip)");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086 A[LOOP:0: B:25:0x0082->B:27:0x0086, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C146711a(com.google.android.gms.auth.C142915o r4, android.content.Context r5, java.util.concurrent.Executor r6, com.google.android.libraries.abuse.reporting.C146740i r7, java.lang.String r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.f396203g = r4
            r4.getClass()
            r3.f396202f = r5
            r3.f396198b = r6
            r3.f396199c = r7
            int r4 = r8.hashCode()
            r6 = -1897523141(0xffffffff8ee6183b, float:-5.672271E-30)
            r7 = 0
            r0 = 2
            r1 = -1
            r2 = 1
            if (r4 == r6) goto L_0x003a
            r6 = 3449687(0x34a357, float:4.834041E-39)
            if (r4 == r6) goto L_0x0030
            r6 = 3556498(0x364492, float:4.983715E-39)
            if (r4 == r6) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            java.lang.String r4 = "test"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0044
            r4 = 0
            goto L_0x0045
        L_0x0030:
            java.lang.String r4 = "prod"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0044
            r4 = 2
            goto L_0x0045
        L_0x003a:
            java.lang.String r4 = "staging"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0044
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = -1
        L_0x0045:
            if (r4 == 0) goto L_0x0059
            if (r4 == r2) goto L_0x0056
            if (r4 != r0) goto L_0x004e
            java.lang.String r4 = "abusereporting-pa.googleapis.com"
            goto L_0x005b
        L_0x004e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Environment can only be test, staging or prod"
            r4.<init>(r5)
            throw r4
        L_0x0056:
            java.lang.String r4 = "staging-abusereporting-pa.sandbox.googleapis.com"
            goto L_0x005b
        L_0x0059:
            java.lang.String r4 = "test-abusereporting-pa.corp.googleapis.com"
        L_0x005b:
            android.net.Uri$Builder r6 = new android.net.Uri$Builder
            r6.<init>()
            java.lang.String r8 = "https"
            android.net.Uri$Builder r6 = r6.scheme(r8)
            android.net.Uri$Builder r4 = r6.authority(r4)
            android.net.Uri r4 = r4.build()
            r3.f396200d = r4
            android.content.res.Resources r4 = r5.getResources()
            r5 = 2130903052(0x7f03000c, float:1.7412911E38)
            java.lang.String[] r4 = r4.getStringArray(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "oauth2:"
            r5.<init>(r6)
        L_0x0082:
            int r6 = r4.length
            int r6 = r6 + r1
            if (r7 >= r6) goto L_0x0098
            r6 = r4[r7]
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = " "
            java.lang.String r6 = r6.concat(r8)
            r5.append(r6)
            int r7 = r7 + 1
            goto L_0x0082
        L_0x0098:
            r4 = r4[r6]
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.f396201e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.C146711a.<init>(com.google.android.gms.auth.o, android.content.Context, java.util.concurrent.Executor, com.google.android.libraries.abuse.reporting.i, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo123541a(UrlRequest.Builder builder, String str) {
        if (str != null) {
            try {
                builder.addHeader("Authorization", "Bearer ".concat(String.valueOf(((TokenData) C146021aq.m237852f(this.f396203g.mo117812c(new Account(str, "com.google"), this.f396201e, (Bundle) null))).f387646b)));
            } catch (ExecutionException e) {
                if (e.getCause() instanceof C142903e) {
                    throw ((C142903e) e.getCause());
                }
                throw new IOException(e);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IOException(e2);
            }
        }
    }
}
