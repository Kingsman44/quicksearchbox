package com.google.android.apps.gsa.staticplugins.p8163o;

import android.net.Uri;
import androidx.media3.p132b.C2484ac;
import androidx.media3.p132b.C2487af;
import androidx.media3.p132b.C2488ag;
import androidx.media3.p132b.C2499c;
import androidx.media3.p132b.C2510n;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89051g;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59071e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URL;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.y */
/* compiled from: PG */
public final class C105853y extends C2499c implements C2488ag {

    /* renamed from: b */
    private static final C59071e f295349b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.o.y");

    /* renamed from: c */
    private static final Pattern f295350c = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: a */
    final C2487af f295351a = new C2487af();

    /* renamed from: d */
    private final C86124t f295352d;

    /* renamed from: e */
    private final C89012aj f295353e;

    /* renamed from: f */
    private final C2487af f295354f;

    /* renamed from: g */
    private C2510n f295355g;

    /* renamed from: h */
    private C89068x f295356h;

    /* renamed from: i */
    private C89051g f295357i;

    /* renamed from: j */
    private URL f295358j = null;

    /* renamed from: k */
    private C89022at f295359k;

    /* renamed from: l */
    private int f295360l;

    /* renamed from: m */
    private int f295361m;

    /* renamed from: n */
    private int f295362n;

    public C105853y(C86124t tVar, C89012aj ajVar, C2487af afVar) {
        super(true);
        this.f295352d = tVar;
        this.f295353e = ajVar;
        this.f295354f = afVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m176325k(androidx.media3.p132b.C2510n r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Unable to connect to "
            com.google.android.apps.gsa.shared.aa.x r1 = r10.f295356h
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0012
            com.google.android.apps.gsa.shared.aa.g r1 = r10.f295357i
            if (r1 != 0) goto L_0x0012
            int r1 = r10.f295362n
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            com.google.common.base.C58838bb.m90883r(r1)
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f295352d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90073dy.f249769d
            boolean r1 = r1.mo79746e(r4)
            if (r12 == 0) goto L_0x0024
            if (r1 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            com.google.android.apps.gsa.shared.aa.ar r4 = r10.m176327m(r11, r4)
            com.google.android.apps.gsa.shared.aa.aj r5 = r10.f295353e
            com.google.android.apps.gsa.shared.aa.x r6 = com.google.android.apps.gsa.shared.p6968aa.C89009ag.f241207b
            com.google.android.apps.gsa.shared.aa.v r7 = com.google.android.apps.gsa.shared.p6968aa.C89066v.f241382a
            com.google.android.apps.gsa.shared.aa.q r7 = r5.mo27510b(r7)
            com.google.common.util.concurrent.cx r4 = r5.mo27496g(r4, r6, r7)
            r5 = 2000(0x7d0, float:2.803E-42)
            java.lang.Object r6 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r4)     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            com.google.android.apps.gsa.shared.aa.as r6 = (com.google.android.apps.gsa.shared.p6968aa.C89021as) r6     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            com.google.android.apps.gsa.shared.aa.at r7 = r6.mo82999g()     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            r10.f295359k = r7     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            java.net.URL r8 = r10.f295358j     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            r9 = -1
            if (r8 != 0) goto L_0x005f
            com.google.common.b.gu r7 = r7.f241282d     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            boolean r8 = r7.isEmpty()     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            if (r8 != 0) goto L_0x005f
            int r8 = r7.size()     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            int r8 = r8 + r9
            java.lang.Object r7 = r7.get(r8)     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            java.net.URL r7 = (java.net.URL) r7     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            r10.f295358j = r7     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
        L_0x005f:
            com.google.android.apps.gsa.shared.aa.x r6 = r6.mo82997b()     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            r10.f295356h = r6     // Catch:{ d -> 0x01a1, ak -> 0x018c, ExecutionException -> 0x0176, InterruptedException -> 0x0144 }
            r10.f295355g = r11
            com.google.android.apps.gsa.shared.aa.at r12 = r10.f295359k
            int r0 = r12.f241279a
            r1 = 206(0xce, float:2.89E-43)
            if (r0 == r1) goto L_0x0095
            long r0 = r11.f6896f
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0078
            goto L_0x0095
        L_0x0078:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0081
            int r2 = (int) r0
            goto L_0x0095
        L_0x0081:
            androidx.media3.b.ac r12 = new androidx.media3.b.ac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid position "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r12.<init>((java.lang.String) r0, (androidx.media3.p132b.C2510n) r11, (int) r5, (int) r3)
            throw r12
        L_0x0095:
            r10.f295360l = r2
            com.google.android.apps.gsa.shared.aa.x r0 = r10.f295356h
            r0.getClass()
            int r0 = r0.mo27471a()
            if (r0 >= 0) goto L_0x0129
            java.lang.String r0 = "Content-Length"
            r1 = 0
            java.lang.String r0 = r12.mo83000a(r0, r1)
            java.lang.String r2 = "Content-Range"
            java.lang.String r12 = r12.mo83000a(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00c8
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00ba }
            goto L_0x00c9
        L_0x00ba:
            r1 = move-exception
            com.google.common.f.e r2 = f295349b
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r4 = "Unexpected Content-Length [%s]"
            r5 = 14089(0x3709, float:1.9743E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r5)).mo56389s(r4, r0)
        L_0x00c8:
            r1 = -1
        L_0x00c9:
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto L_0x0128
            java.util.regex.Pattern r2 = f295350c
            java.util.regex.Matcher r2 = r2.matcher(r12)
            boolean r4 = r2.find()
            if (r4 == 0) goto L_0x0128
            r4 = 2
            java.lang.String r4 = r2.group(r4)     // Catch:{ NumberFormatException -> 0x011a }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x011a }
            java.lang.String r5 = r2.group(r3)     // Catch:{ NumberFormatException -> 0x011a }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x011a }
            int r4 = r4 - r5
            int r3 = r3 + r4
            if (r1 >= 0) goto L_0x00f1
            goto L_0x0113
        L_0x00f1:
            if (r1 == r3) goto L_0x0128
            com.google.common.f.e r4 = f295349b     // Catch:{ NumberFormatException -> 0x011a }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ NumberFormatException -> 0x011a }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ NumberFormatException -> 0x011a }
            r5 = 14087(0x3707, float:1.974E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ NumberFormatException -> 0x011a }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ NumberFormatException -> 0x011a }
            java.lang.String r5 = "Inconsistent headers [%s] [%s]"
            r4.mo56354G(r5, r0, r12)     // Catch:{ NumberFormatException -> 0x011a }
            r0 = 3
            java.lang.String r0 = r2.group(r0)     // Catch:{ NumberFormatException -> 0x011a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x011a }
            if (r1 != r0) goto L_0x0115
        L_0x0113:
            r0 = r3
            goto L_0x0129
        L_0x0115:
            int r0 = java.lang.Math.max(r1, r3)     // Catch:{ NumberFormatException -> 0x011a }
            goto L_0x0129
        L_0x011a:
            r0 = move-exception
            com.google.common.f.e r2 = f295349b
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Unexpected Content-Range [%s]"
            r4 = 14088(0x3708, float:1.9741E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56389s(r3, r12)
        L_0x0128:
            r0 = r1
        L_0x0129:
            long r1 = r11.f6897g
            r3 = -1
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x013a
            if (r0 == r9) goto L_0x0139
            int r12 = r10.f295360l
            int r0 = r0 - r12
            r10.f295361m = r0
            goto L_0x013d
        L_0x0139:
            r1 = r3
        L_0x013a:
            int r12 = (int) r1
            r10.f295361m = r12
        L_0x013d:
            r10.mo5930j(r11)
            int r11 = r10.f295361m
            long r11 = (long) r11
            return r11
        L_0x0144:
            r4.cancel(r3)
            boolean r12 = r4.isCancelled()
            if (r12 != 0) goto L_0x015b
            java.lang.Object r12 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r4)     // Catch:{ ak | d | InterruptedException | ExecutionException -> 0x015b }
            com.google.android.apps.gsa.shared.aa.as r12 = (com.google.android.apps.gsa.shared.p6968aa.C89021as) r12     // Catch:{ ak | d | InterruptedException | ExecutionException -> 0x015b }
            com.google.android.apps.gsa.shared.aa.x r12 = r12.mo82997b()     // Catch:{ ak | d | InterruptedException | ExecutionException -> 0x015b }
            r12.mo27475d()     // Catch:{ ak | d | InterruptedException | ExecutionException -> 0x015b }
        L_0x015b:
            androidx.media3.b.ac r12 = new androidx.media3.b.ac
            android.net.Uri r0 = r11.f6891a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException
            r1.<init>()
            java.lang.String r2 = "Interrupted connecting to "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            r12.<init>((java.lang.String) r0, (java.io.IOException) r1, (androidx.media3.p132b.C2510n) r11, (int) r5)
            throw r12
        L_0x0176:
            androidx.media3.b.ac r12 = new androidx.media3.b.ac
            android.net.Uri r0 = r11.f6891a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Error connecting to "
            java.lang.String r0 = r1.concat(r0)
            r12.<init>((java.lang.String) r0, (androidx.media3.p132b.C2510n) r11, (int) r5, (int) r3)
            throw r12
        L_0x018c:
            r12 = move-exception
            androidx.media3.b.ac r1 = new androidx.media3.b.ac
            android.net.Uri r2 = r11.f6891a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r2)
            r1.<init>((java.lang.String) r0, (java.io.IOException) r12, (androidx.media3.p132b.C2510n) r11, (int) r5)
            throw r1
        L_0x01a1:
            r2 = move-exception
            if (r1 == 0) goto L_0x01b2
            if (r12 != 0) goto L_0x01b2
            int r12 = r2.f252687a
            r1 = 262206(0x4003e, float:3.67429E-40)
            if (r12 != r1) goto L_0x01b2
            long r11 = r10.m176325k(r11, r3)
            return r11
        L_0x01b2:
            androidx.media3.b.ac r12 = new androidx.media3.b.ac
            android.net.Uri r1 = r11.f6891a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            r12.<init>((java.lang.String) r0, (java.io.IOException) r2, (androidx.media3.p132b.C2510n) r11, (int) r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8163o.C105853y.m176325k(androidx.media3.b.n, boolean):long");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.shared.p6968aa.C89051g m176326l() {
        /*
            r3 = this;
            com.google.android.apps.gsa.shared.aa.g r0 = r3.f295357i
            if (r0 == 0) goto L_0x001c
            int r1 = r0.f241330b
            r2 = 1
            if (r1 != r2) goto L_0x0019
            int r0 = r0.mo83020a()
            if (r0 <= 0) goto L_0x0010
            goto L_0x0019
        L_0x0010:
            com.google.android.apps.gsa.shared.aa.g r0 = r3.f295357i
            r0.mo83024e()
            r0 = 0
            r3.f295357i = r0
            goto L_0x001c
        L_0x0019:
            com.google.android.apps.gsa.shared.aa.g r0 = r3.f295357i
            return r0
        L_0x001c:
            com.google.android.apps.gsa.shared.aa.x r0 = r3.f295356h     // Catch:{ InterruptedException -> 0x003c, ExecutionException -> 0x002e }
            r0.getClass()
            com.google.common.util.concurrent.cx r0 = r0.mo27472b()     // Catch:{ InterruptedException -> 0x003c, ExecutionException -> 0x002e }
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r0)     // Catch:{ InterruptedException -> 0x003c, ExecutionException -> 0x002e }
            com.google.android.apps.gsa.shared.aa.g r0 = (com.google.android.apps.gsa.shared.p6968aa.C89051g) r0     // Catch:{ InterruptedException -> 0x003c, ExecutionException -> 0x002e }
            r3.f295357i = r0     // Catch:{ InterruptedException -> 0x003c, ExecutionException -> 0x002e }
            return r0
        L_0x002e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0036
            r0 = r1
        L_0x0036:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x003c:
            r0 = move-exception
            r3.mo5882d()
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "interrupted getting chunk: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8163o.C105853y.m176326l():com.google.android.apps.gsa.shared.aa.g");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.shared.p6968aa.C89020ar m176327m(androidx.media3.p132b.C2510n r10, boolean r11) {
        /*
            r9 = this;
            r0 = 1
            java.net.URL r1 = r9.f295358j     // Catch:{ MalformedURLException -> 0x00ba }
            if (r1 != 0) goto L_0x0010
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00ba }
            android.net.Uri r2 = r10.f6891a     // Catch:{ MalformedURLException -> 0x00ba }
            java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x00ba }
            r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x00ba }
        L_0x0010:
            int r2 = r10.f6893c
            com.google.android.apps.gsa.shared.aa.aq r2 = com.google.android.apps.gsa.shared.p6968aa.C89020ar.m144756a()
            r2.f241236b = r1
            r1 = 65537(0x10001, float:9.1837E-41)
            r2.f241245k = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            androidx.media3.b.af r3 = r9.f295354f
            if (r3 == 0) goto L_0x002d
            java.util.Map r3 = r3.mo5922a()
            r1.putAll(r3)
        L_0x002d:
            androidx.media3.b.af r3 = r9.f295351a
            java.util.Map r3 = r3.mo5922a()
            r1.putAll(r3)
            java.util.Map r3 = r10.f6895e
            r1.putAll(r3)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.mo82990b(r4, r3)
            goto L_0x0043
        L_0x005f:
            long r3 = r10.f6896f
            r5 = 0
            r7 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0070
            long r3 = r10.f6897g
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00a1
            r3 = r5
        L_0x0070:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "bytes="
            r1.<init>(r5)
            r1.append(r3)
            java.lang.String r3 = "-"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            long r3 = r10.f6897g
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x009c
            long r5 = r10.f6896f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            long r5 = r5 + r3
            long r5 = r5 + r7
            r10.append(r5)
            java.lang.String r1 = r10.toString()
        L_0x009c:
            java.lang.String r10 = "Range"
            r2.mo82990b(r10, r1)
        L_0x00a1:
            r10 = 3
            int[] r10 = new int[r10]
            r10 = {200, 204, 206} // fill-array
            com.google.android.apps.gsa.shared.aa.bl r1 = new com.google.android.apps.gsa.shared.aa.bl
            r1.<init>(r10)
            r2.f241250p = r1
            if (r11 == 0) goto L_0x00b5
            r10 = 0
            r2.f241244j = r10
            r2.f241240f = r0
        L_0x00b5:
            com.google.android.apps.gsa.shared.aa.ar r10 = r2.mo82989a()
            return r10
        L_0x00ba:
            androidx.media3.b.ac r11 = new androidx.media3.b.ac
            android.net.Uri r1 = r10.f6891a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Malformed URL: "
            java.lang.String r1 = r2.concat(r1)
            r2 = 2000(0x7d0, float:2.803E-42)
            r11.<init>((java.lang.String) r1, (androidx.media3.p132b.C2510n) r10, (int) r2, (int) r0)
            goto L_0x00d3
        L_0x00d2:
            throw r11
        L_0x00d3:
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8163o.C105853y.m176327m(androidx.media3.b.n, boolean):com.google.android.apps.gsa.shared.aa.ar");
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        int i3;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        if (this.f295356h != null) {
            try {
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int i4 = this.f295360l;
                    if (i4 > 0) {
                        int b = m176326l().mo83021b(bArr2, 0, Math.min(i4, 4096));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        } else if (b != -1) {
                            this.f295360l -= b;
                            mo5927g(b);
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        int i5 = this.f295361m;
                        if (i5 == -1) {
                            i3 = m176326l().mo83021b(bArr, i, i2);
                            if (i3 == -1) {
                                return -1;
                            }
                        } else if (i5 == this.f295362n) {
                            return -1;
                        } else {
                            i3 = m176326l().mo83021b(bArr, i, Math.min(i2, this.f295361m - this.f295362n));
                            if (i3 == -1) {
                                throw new EOFException();
                            }
                        }
                        if (i3 > 0) {
                            z = true;
                        }
                        C58838bb.m90883r(z);
                        this.f295362n += i3;
                        mo5927g(i3);
                        return i3;
                    }
                }
            } catch (IOException e) {
                throw new C2484ac(e, this.f295355g, (int) SimpleSnackbar.LENGTH_SHORT, 2);
            }
        } else {
            throw new C2484ac("already closed", this.f295355g, (int) SimpleSnackbar.LENGTH_SHORT, 2);
        }
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        mo5929i(nVar);
        return m176325k(nVar, false);
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        C2510n nVar = this.f295355g;
        if (nVar == null) {
            return null;
        }
        return nVar.f6891a;
    }

    /* renamed from: d */
    public final void mo5882d() {
        C89068x xVar = this.f295356h;
        if (xVar != null) {
            xVar.mo27475d();
            this.f295356h = null;
            mo5928h();
        }
        C89051g gVar = this.f295357i;
        if (gVar != null) {
            gVar.mo83024e();
            this.f295357i = null;
        }
        this.f295360l = 0;
        this.f295361m = 0;
        this.f295362n = 0;
        this.f295359k = null;
    }

    /* renamed from: e */
    public final Map mo5883e() {
        return C58729pv.f156485a;
    }
}
