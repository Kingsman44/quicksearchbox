package com.google.android.libraries.web.webview.p3487i.p3490b;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.web.profile.C44071f;
import com.google.android.libraries.web.profile.C44072g;
import com.google.android.libraries.web.profile.p3431a.p3432a.p3433a.C43979a;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import kotlinx.coroutines.C71423ax;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.i.b.m */
/* compiled from: PG */
public final class C44447m implements C44071f {

    /* renamed from: a */
    public static final C44435a f115533a = new C44435a();

    /* renamed from: b */
    public final C43979a f115534b;

    /* renamed from: c */
    public final C69585o f115535c;

    /* renamed from: d */
    public final C69585o f115536d;

    /* renamed from: e */
    public final Context f115537e;

    public C44447m(C43979a aVar, C69585o oVar, C69585o oVar2, Context context) {
        this.f115534b = aVar;
        this.f115535c = oVar;
        this.f115536d = oVar2;
        this.f115537e = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo47028a() {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Intent mo47029b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C44072g mo47030c() {
        throw new UnsupportedOperationException("#settingsManager is not supported on WebView");
    }

    /* renamed from: d */
    public final C60870cx mo47031d(Set set) {
        C69664n.m101061g(set, "persistenceIds");
        throw new UnsupportedOperationException("#removeWebLayerPersistenceStorageForJava is not supported on WebView");
    }

    /* renamed from: e */
    public final Object mo47032e(C44082a aVar, Set set, C69577g gVar) {
        if (aVar != null) {
            Object a = C71423ax.m104196a(new C44438d(set, this, (C69577g) null), gVar);
            return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        p5462h.p5472e.C69598b.m101013a(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo47305f(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.libraries.web.webview.p3487i.p3490b.C44442h
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.libraries.web.webview.i.b.h r0 = (com.google.android.libraries.web.webview.p3487i.p3490b.C44442h) r0
            int r1 = r0.f115524d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f115524d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.web.webview.i.b.h r0 = new com.google.android.libraries.web.webview.i.b.h
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f115522b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f115524d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r9)
            goto L_0x0077
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0033:
            java.lang.Object r2 = r0.f115521a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0063
        L_0x0039:
            p5462h.C69714l.m101134b(r9)
            android.webkit.CookieManager r9 = android.webkit.CookieManager.getInstance()
            java.lang.String r2 = "WebX CookieManager hasCookies"
            com.google.apps.tiktok.tracing.bi r2 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r2)
            boolean r6 = r9.hasCookies()     // Catch:{ all -> 0x007a }
            p5462h.p5472e.C69598b.m101013a(r2, r5)
            if (r6 == 0) goto L_0x0062
            com.google.android.libraries.web.webview.i.b.k r2 = new com.google.android.libraries.web.webview.i.b.k
            r2.<init>(r9, r8, r5)
            r0.f115521a = r8
            r0.f115524d = r4
            r6 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r9 = kotlinx.coroutines.C71745ea.m104929a(r6, r2, r0)
            if (r9 == r1) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            return r1
        L_0x0062:
            r2 = r8
        L_0x0063:
            com.google.android.libraries.web.webview.i.b.m r2 = (com.google.android.libraries.web.webview.p3487i.p3490b.C44447m) r2
            h.c.o r9 = r2.f115536d
            com.google.android.libraries.web.webview.i.b.l r4 = new com.google.android.libraries.web.webview.i.b.l
            r4.<init>(r2, r5)
            r0.f115521a = r5
            r0.f115524d = r3
            java.lang.Object r9 = kotlinx.coroutines.C71803m.m105040a(r9, r4, r0)
            if (r9 != r1) goto L_0x0077
            return r1
        L_0x0077:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x007a:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.webview.p3487i.p3490b.C44447m.mo47305f(h.c.g):java.lang.Object");
    }
}
