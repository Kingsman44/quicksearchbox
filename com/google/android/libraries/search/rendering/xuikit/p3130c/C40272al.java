package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.android.libraries.search.rendering.xuikit.p3097a.C40085y;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40451k;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.al */
/* compiled from: PG */
public final class C40272al {

    /* renamed from: a */
    public static final C59071e f105784a = C59071e.m91331h();

    /* renamed from: b */
    public final C40085y f105785b;

    /* renamed from: c */
    public final Executor f105786c;

    /* renamed from: d */
    public final C71422aw f105787d;

    /* renamed from: e */
    public final C60950i f105788e;

    /* renamed from: f */
    public final C47449e f105789f;

    /* renamed from: g */
    private final C40451k f105790g;

    /* renamed from: h */
    private final C57695ab f105791h;

    /* renamed from: i */
    private final C40301y f105792i;

    /* renamed from: j */
    private final C40358k f105793j;

    /* renamed from: k */
    private final C40358k f105794k;

    public C40272al(C40451k kVar, C57695ab abVar, C40301y yVar, C40085y yVar2, Executor executor, C71422aw awVar, C60950i iVar, C40358k kVar2, C47449e eVar) {
        this.f105790g = kVar;
        this.f105791h = abVar;
        this.f105792i = yVar;
        this.f105785b = yVar2;
        this.f105786c = executor;
        this.f105787d = awVar;
        this.f105788e = iVar;
        this.f105793j = kVar2;
        this.f105789f = eVar;
        this.f105794k = kVar2.mo42414a(abVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: j$.time.Instant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: j$.time.Instant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: j$.time.Instant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42368a(java.lang.String r12, p5462h.p5466c.C69577g r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.libraries.search.rendering.xuikit.p3130c.C40268ah
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.libraries.search.rendering.xuikit.c.ah r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40268ah) r0
            int r1 = r0.f105776f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105776f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.c.ah r0 = new com.google.android.libraries.search.rendering.xuikit.c.ah
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f105774d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f105776f
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r12 = r0.f105773c
            java.lang.Object r1 = r0.f105772b
            java.lang.Object r0 = r0.f105771a
            p5462h.C69714l.m101134b(r13)
            r10 = r13
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r10
            goto L_0x0067
        L_0x0032:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003a:
            p5462h.C69714l.m101134b(r13)
            com.google.common.v.i r13 = r11.f105788e
            j$.time.Instant r13 = r13.mo57444a()
            java.lang.String r2 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            com.google.android.libraries.search.rendering.xuikit.c.y r6 = r11.f105792i
            com.google.android.libraries.search.rendering.xuikit.d.j.k r8 = r11.f105790g
            com.google.bv.j.b.a.ab r7 = r11.f105791h
            r0.f105771a = r11
            r0.f105772b = r12
            r0.f105773c = r13
            r0.f105776f = r3
            h.c.o r2 = r6.f105877c
            com.google.android.libraries.search.rendering.xuikit.c.r r3 = new com.google.android.libraries.search.rendering.xuikit.c.r
            r9 = 0
            r4 = r3
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r0 = kotlinx.coroutines.C71803m.m105040a(r2, r3, r0)
            if (r0 == r1) goto L_0x00f7
            r1 = r11
        L_0x0067:
            com.google.android.libraries.search.rendering.xuikit.c.o r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40291o) r0
            java.lang.String r2 = "'"
            java.lang.String r3 = "Failed to retrieve Typeface from '"
            if (r0 == 0) goto L_0x00e0
            java.io.File r4 = r0.f105841b
            r5 = 0
            if (r4 == 0) goto L_0x0098
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r4)     // Catch:{ RuntimeException -> 0x0079 }
            goto L_0x0098
        L_0x0079:
            r6 = move-exception
            com.google.common.f.e r7 = f105784a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.x r6 = r7.mo56382g(r6)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 53323(0xd04b, float:7.4721E-41)
            r7.<init>(r8)
            r6.mo56379ah(r7)
            java.lang.String r7 = "Failed to read '%s'"
            r6.mo56389s(r7, r4)
        L_0x0098:
            java.lang.String r4 = "between(startTime, timeSource.now())"
            if (r5 == 0) goto L_0x00b3
            com.google.android.libraries.search.rendering.xuikit.c.ag r12 = r0.f105840a
            com.google.android.libraries.search.rendering.xuikit.c.al r1 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40272al) r1
            com.google.common.v.i r0 = r1.f105788e
            j$.time.Instant r0 = r0.mo57444a()
            j$.time.Duration r13 = p3186j$.time.Duration.between(r13, r0)
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r4)
            java.lang.String r12 = r12.f105769g
            r1.mo42369b(r12, r13)
            return r5
        L_0x00b3:
            com.google.android.libraries.search.rendering.xuikit.c.ag r0 = r0.f105840a
            com.google.android.libraries.search.rendering.xuikit.c.al r1 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40272al) r1
            com.google.common.v.i r5 = r1.f105788e
            j$.time.Instant r5 = r5.mo57444a()
            j$.time.Duration r13 = p3186j$.time.Duration.between(r13, r5)
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r4)
            java.lang.String r0 = r0.f105770h
            r1.mo42369b(r0, r13)
            com.google.android.libraries.search.rendering.xuikit.c.aq r13 = new com.google.android.libraries.search.rendering.xuikit.c.aq
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r12 = (java.lang.String) r12
            r0.append(r12)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x00e0:
            com.google.android.libraries.search.rendering.xuikit.c.aq r13 = new com.google.android.libraries.search.rendering.xuikit.c.aq
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r12 = (java.lang.String) r12
            r0.append(r12)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x00f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40272al.mo42368a(java.lang.String, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo42369b(String str, Duration duration) {
        if (str != null) {
            this.f105794k.mo42418e(str, duration.toMillis());
        }
    }

    /* renamed from: c */
    public final void mo42370c(C40267ag agVar) {
        this.f105794k.mo42417d("PreregisteredResources.PrefetchRequest.Count", agVar.f105768f);
    }
}
