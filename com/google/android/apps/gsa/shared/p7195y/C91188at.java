package com.google.android.apps.gsa.shared.p7195y;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.StrictMode;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import androidx.annotation.C0826b;
import com.bumptech.glide.C5514ad;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.C6003v;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.C5959r;
import com.bumptech.glide.load.p293a.C5731x;
import com.bumptech.glide.load.p297b.C5750ab;
import com.bumptech.glide.load.p299c.p300a.C5873v;
import com.bumptech.glide.p287f.C5558a;
import com.bumptech.glide.p287f.C5593j;
import com.google.android.apps.gsa.shared.util.p7159c.C90879am;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7167e.C91034a;
import com.google.android.libraries.glide.fife.C22012b;
import com.google.android.libraries.glide.fife.C22014d;
import com.google.android.libraries.glide.fife.C22015e;
import com.google.android.libraries.glide.p1823b.C22004a;
import com.google.android.libraries.glide.p1823b.C22006c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.shared.y.at */
/* compiled from: PG */
public final class C91188at extends C91189au implements C91034a {

    /* renamed from: a */
    static final C5959r f254564a = C5959r.m15374a("agsa.traffic_tag");

    /* renamed from: b */
    public static final C59071e f254565b = C59071e.m91332i("com.google.android.apps.gsa.shared.y.at");

    /* renamed from: g */
    private static boolean f254566g;

    /* renamed from: h */
    private static final Object f254567h = new Object();

    /* renamed from: c */
    public final C5514ad f254568c;

    /* renamed from: d */
    public final C5543d f254569d;

    /* renamed from: e */
    public final C5593j f254570e;

    /* renamed from: i */
    private final Context f254571i;

    /* renamed from: j */
    private final C69464a f254572j;

    /* renamed from: k */
    private final C90931ca f254573k;

    /* renamed from: l */
    private final C22871g f254574l;

    /* renamed from: m */
    private final C5593j f254575m;

    /* renamed from: n */
    private final C5873v f254576n;

    private C91188at(Context context, Context context2, C69464a aVar, C90931ca caVar, C22871g gVar, C5593j jVar, C91192ax axVar) {
        super(axVar);
        C5731x xVar;
        synchronized (f254567h) {
            if (!f254566g) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    C5543d a = C5543d.m14321a(context);
                    if (a != null) {
                        C6003v a2 = a.f16789b.mo12092a();
                        C91180al alVar = new C91180al(aVar);
                        a2.f17680a.mo12274d(C5750ab.class, InputStream.class, alVar);
                        C91214f fVar = new C91214f(a.f16788a);
                        a2.f17682c.mo11945e(fVar, InputStream.class, FrameSequenceDrawable.class);
                        C22014d dVar = new C22014d((byte[]) null);
                        a2.f17680a.mo12274d(C22012b.class, ByteBuffer.class, dVar);
                        C22015e eVar = new C22015e((byte[]) null);
                        a2.f17680a.mo12274d(C22012b.class, InputStream.class, eVar);
                        C91198bc bcVar = new C91198bc();
                        a2.f17680a.mo12274d(C91197bb.class, InputStream.class, bcVar);
                        C22006c cVar = new C22006c();
                        a2.f17680a.mo12275e(C22004a.class, ByteBuffer.class, cVar);
                        f254566g = true;
                    }
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
        }
        this.f254571i = context2;
        this.f254572j = aVar;
        this.f254573k = caVar;
        this.f254574l = gVar;
        this.f254568c = C5543d.m14323c(context2).mo12423b(context2);
        this.f254569d = C5543d.m14321a(context2);
        C5593j jVar2 = (C5593j) ((C5593j) jVar.mo11967T(new C91182an())).mo11988y();
        this.f254570e = jVar2;
        if (!C5558a.m14350aa(jVar.f16814a, 4)) {
            if (axVar.mo85442e()) {
                xVar = C5731x.f17283b;
            } else {
                xVar = C5731x.f17285d;
            }
            jVar2.mo11989z(xVar);
        }
        C5593j jVar3 = (C5593j) jVar2.clone();
        jVar3.mo11976ad();
        this.f254575m = jVar3;
        this.f254576n = m148980x(axVar.mo85438a());
    }

    /* renamed from: q */
    public static Object m148979q(Uri uri) {
        if ("data".equals(uri.getScheme())) {
            return uri.toString();
        }
        String uri2 = uri.toString();
        if (uri2.length() != 0) {
            int i = 1;
            if (uri2.charAt(0) == '-' || Character.isDigit(uri2.charAt(0))) {
                while (i < uri2.length()) {
                    if (Character.isDigit(uri2.charAt(i))) {
                        i++;
                    }
                }
                return Integer.valueOf(Integer.parseInt(uri.toString()));
            }
        }
        return uri;
    }

    /* renamed from: x */
    private static C5873v m148980x(C91230v vVar) {
        if (vVar == C91230v.f254646a) {
            return C5873v.f17472c;
        }
        return new C91226r(vVar);
    }

    /* renamed from: y */
    private static C5593j m148981y(C5593j jVar, Object obj, C91186ar arVar) {
        return obj != null ? arVar.mo85409a(jVar, obj) : jVar;
    }

    /* renamed from: z */
    private final void m148982z(String str, C22869e eVar) {
        if (C22872h.m42744d(C0826b.class)) {
            eVar.run();
        } else {
            this.f254574l.mo28212l(str, eVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.google.android.apps.gsa.shared.y.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.google.android.libraries.glide.fife.b} */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.bumptech.glide.f.a] */
    /* JADX WARNING: type inference failed for: r0v17, types: [com.bumptech.glide.f.a] */
    /* JADX WARNING: type inference failed for: r0v18, types: [com.bumptech.glide.f.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0273  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.C6007z mo85413a(com.google.android.apps.gsa.shared.p7195y.C91196ba r14, android.widget.ImageView r15) {
        /*
            r13 = this;
            java.lang.String r0 = r14.mo85468m()
            r1 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r14.mo85468m()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r14.mo85468m()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.Object r0 = m148979q(r0)
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            boolean r2 = r0 instanceof android.net.Uri
            if (r2 == 0) goto L_0x0079
            java.lang.String r2 = r0.toString()
            boolean r2 = com.google.android.libraries.social.p3267c.p3268a.C41921c.m73452a(r2)
            if (r2 == 0) goto L_0x0058
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = r14.mo85463h()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0047
            java.lang.Boolean r2 = r14.mo85463h()
            if (r2 != 0) goto L_0x0058
            com.google.android.apps.gsa.shared.y.ax r2 = r13.f254577f
            boolean r2 = r2.mo85439b()
            if (r2 == 0) goto L_0x0058
        L_0x0047:
            com.google.android.libraries.glide.fife.b r2 = new com.google.android.libraries.glide.fife.b
            java.lang.String r0 = r0.toString()
            com.google.android.libraries.glide.fife.g r3 = new com.google.android.libraries.glide.fife.g
            r3.<init>()
            r2.<init>(r0, r3)
            com.google.android.libraries.glide.fife.g r0 = r2.f60724b
            goto L_0x007b
        L_0x0058:
            r2 = r0
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "http://www.google.com/maps/vt/"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0079
            com.google.android.apps.gsa.shared.y.ax r2 = r13.f254577f
            boolean r2 = r2.mo85440c()
            if (r2 == 0) goto L_0x0079
            java.lang.String r0 = r0.toString()
            com.google.android.apps.gsa.shared.y.p r2 = new com.google.android.apps.gsa.shared.y.p
            r2.<init>(r0)
            goto L_0x007a
        L_0x0079:
            r2 = r0
        L_0x007a:
            r0 = r1
        L_0x007b:
            com.bumptech.glide.f.j r3 = r13.f254575m
            com.bumptech.glide.f.a r3 = r3.clone()
            com.bumptech.glide.f.j r3 = (com.bumptech.glide.p287f.C5593j) r3
            android.util.Size r4 = r14.mo85458c()
            com.google.android.apps.gsa.shared.y.ab r5 = com.google.android.apps.gsa.shared.p7195y.C91170ab.f254541a
            com.bumptech.glide.f.j r3 = m148981y(r3, r4, r5)
            java.lang.Integer r4 = r14.mo85467l()
            com.google.android.apps.gsa.shared.y.ac r5 = com.google.android.apps.gsa.shared.p7195y.C91171ac.f254542a
            com.bumptech.glide.f.j r3 = m148981y(r3, r4, r5)
            boolean r4 = r14.mo85469n()
            com.bumptech.glide.f.a r3 = r3.mo11956I(r4)
            com.bumptech.glide.f.j r3 = (com.bumptech.glide.p287f.C5593j) r3
            java.lang.Boolean r4 = r14.mo85464i()
            if (r4 == 0) goto L_0x00bf
            java.lang.Boolean r4 = r14.mo85464i()
            r4.getClass()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00b7
            com.bumptech.glide.load.a.x r4 = com.bumptech.glide.load.p293a.C5731x.f17283b
            goto L_0x00b9
        L_0x00b7:
            com.bumptech.glide.load.a.x r4 = com.bumptech.glide.load.p293a.C5731x.f17285d
        L_0x00b9:
            com.bumptech.glide.f.a r3 = r3.mo11989z(r4)
            com.bumptech.glide.f.j r3 = (com.bumptech.glide.p287f.C5593j) r3
        L_0x00bf:
            android.graphics.drawable.Drawable r4 = r14.mo85457b()
            com.google.android.apps.gsa.shared.y.ad r5 = com.google.android.apps.gsa.shared.p7195y.C91172ad.f254543a
            com.bumptech.glide.f.j r3 = m148981y(r3, r4, r5)
            java.lang.Integer r4 = r14.mo85466k()
            com.google.android.apps.gsa.shared.y.ae r5 = com.google.android.apps.gsa.shared.p7195y.C91173ae.f254544a
            com.bumptech.glide.f.j r3 = m148981y(r3, r4, r5)
            android.graphics.drawable.Drawable r4 = r14.mo85456a()
            com.google.android.apps.gsa.shared.y.af r5 = com.google.android.apps.gsa.shared.p7195y.C91174af.f254545a
            com.bumptech.glide.f.j r3 = m148981y(r3, r4, r5)
            java.lang.Integer r4 = r14.mo85465j()
            com.google.android.apps.gsa.shared.y.ag r5 = com.google.android.apps.gsa.shared.p7195y.C91175ag.f254546a
            com.bumptech.glide.f.j r3 = m148981y(r3, r4, r5)
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89837e()
            int[] r5 = com.google.android.apps.gsa.shared.p7195y.C91181am.f254553a
            com.google.android.apps.gsa.shared.y.bo r6 = r14.mo85462g()
            int r6 = r6.mo85479a()
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x0273
            r5 = r5[r7]
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            if (r5 == r9) goto L_0x0169
            if (r5 == r8) goto L_0x014e
            if (r5 == r7) goto L_0x0135
            if (r5 == r6) goto L_0x0120
            r10 = 6
            if (r5 == r10) goto L_0x010b
            goto L_0x0179
        L_0x010b:
            com.google.android.apps.gsa.shared.y.bo r5 = r14.mo85462g()
            com.google.android.apps.gsa.shared.y.bm r5 = r5.mo85482d()
            com.google.android.apps.gsa.shared.y.bh r10 = new com.google.android.apps.gsa.shared.y.bh
            android.graphics.RectF r5 = r5.mo85477a()
            r10.<init>(r5)
            r4.mo55395g(r10)
            goto L_0x0179
        L_0x0120:
            com.google.android.apps.gsa.shared.y.bo r5 = r14.mo85462g()
            com.google.android.apps.gsa.shared.y.bn r5 = r5.mo85483e()
            com.google.android.apps.gsa.shared.y.bi r10 = new com.google.android.apps.gsa.shared.y.bi
            int r5 = r5.mo85478a()
            r10.<init>(r5)
            r4.mo55395g(r10)
            goto L_0x0179
        L_0x0135:
            if (r0 == 0) goto L_0x013d
            r5 = 8
            r0.mo27321b(r5)
            goto L_0x0179
        L_0x013d:
            com.google.android.apps.gsa.shared.y.bo r5 = r14.mo85462g()
            android.graphics.RectF r5 = r5.mo85480b()
            com.google.android.apps.gsa.shared.y.bj r10 = new com.google.android.apps.gsa.shared.y.bj
            r10.<init>(r5)
            r4.mo55395g(r10)
            goto L_0x0179
        L_0x014e:
            com.google.android.apps.gsa.shared.y.bo r5 = r14.mo85462g()
            com.google.android.apps.gsa.shared.y.bk r5 = r5.mo85481c()
            com.google.android.apps.gsa.shared.y.q r10 = new com.google.android.apps.gsa.shared.y.q
            android.content.Context r11 = r13.f254571i
            float r12 = r5.mo85475a()
            float r5 = r5.mo85476b()
            r10.<init>(r11, r12, r5)
            r4.mo55395g(r10)
            goto L_0x0179
        L_0x0169:
            if (r0 == 0) goto L_0x0171
            r5 = 4194304(0x400000, float:5.877472E-39)
            r0.mo27321b(r5)
            goto L_0x0179
        L_0x0171:
            com.bumptech.glide.load.c.a.k r5 = new com.bumptech.glide.load.c.a.k
            r5.<init>()
            r4.mo55395g(r5)
        L_0x0179:
            r5 = 1
            if (r15 == 0) goto L_0x01c5
            android.widget.ImageView$ScaleType r10 = r15.getScaleType()
            if (r10 == 0) goto L_0x01c5
            com.google.android.apps.gsa.shared.y.bo r10 = r14.mo85462g()
            int r10 = r10.mo85479a()
            if (r10 == r9) goto L_0x01c5
            int[] r10 = com.google.android.apps.gsa.shared.p7195y.C91181am.f254554b
            android.widget.ImageView$ScaleType r11 = r15.getScaleType()
            int r11 = r11.ordinal()
            r10 = r10[r11]
            if (r10 == r5) goto L_0x01b5
            if (r10 == r9) goto L_0x01ac
            if (r10 == r8) goto L_0x01a3
            if (r10 == r7) goto L_0x01a3
            if (r10 == r6) goto L_0x01a3
            goto L_0x01c5
        L_0x01a3:
            com.bumptech.glide.load.c.a.ad r0 = new com.bumptech.glide.load.c.a.ad
            r0.<init>()
            r4.mo55395g(r0)
            goto L_0x01c5
        L_0x01ac:
            com.bumptech.glide.load.c.a.j r0 = new com.bumptech.glide.load.c.a.j
            r0.<init>()
            r4.mo55395g(r0)
            goto L_0x01c5
        L_0x01b5:
            if (r0 == 0) goto L_0x01bd
            r6 = 33554432(0x2000000, float:9.403955E-38)
            r0.mo27321b(r6)
            goto L_0x01c5
        L_0x01bd:
            com.bumptech.glide.load.c.a.i r0 = new com.bumptech.glide.load.c.a.i
            r0.<init>()
            r4.mo55395g(r0)
        L_0x01c5:
            com.google.common.b.gu r0 = r4.mo55394f()
            com.google.android.apps.gsa.shared.y.bo r4 = r14.mo85462g()
            int r4 = r4.mo85479a()
            if (r4 != r9) goto L_0x01f9
            com.bumptech.glide.f.a r0 = r3.mo11948A()
            com.bumptech.glide.f.j r0 = (com.bumptech.glide.p287f.C5593j) r0
            com.google.android.apps.gsa.shared.y.v r3 = r14.mo85459d()
            if (r3 == 0) goto L_0x01ef
            com.google.android.apps.gsa.shared.y.v r3 = r14.mo85459d()
            com.bumptech.glide.load.c.a.v r3 = m148980x(r3)
            com.bumptech.glide.f.a r0 = r0.mo11949B(r3)
            r3 = r0
            com.bumptech.glide.f.j r3 = (com.bumptech.glide.p287f.C5593j) r3
            goto L_0x020b
        L_0x01ef:
            com.bumptech.glide.load.c.a.v r3 = r13.f254576n
            com.bumptech.glide.f.a r0 = r0.mo11949B(r3)
            r3 = r0
            com.bumptech.glide.f.j r3 = (com.bumptech.glide.p287f.C5593j) r3
            goto L_0x020b
        L_0x01f9:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x020b
            com.bumptech.glide.load.o r4 = new com.bumptech.glide.load.o
            r4.<init>((java.util.Collection) r0)
            com.bumptech.glide.f.a r0 = r3.mo11969V(r4)
            r3 = r0
            com.bumptech.glide.f.j r3 = (com.bumptech.glide.p287f.C5593j) r3
        L_0x020b:
            java.lang.String r0 = r14.mo85468m()
            if (r0 == 0) goto L_0x0226
            java.lang.String r0 = r14.mo85468m()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0226
            com.bumptech.glide.ad r0 = r13.f254568c
            com.bumptech.glide.z r0 = r0.mo11872j(r2)
            com.bumptech.glide.z r0 = r0.mo11982o(r3)
            goto L_0x0234
        L_0x0226:
            com.bumptech.glide.ad r0 = r13.f254568c
            byte[] r2 = r14.mo85470o()
            com.bumptech.glide.z r0 = r0.mo11874l(r2)
            com.bumptech.glide.z r0 = r0.mo11982o(r3)
        L_0x0234:
            int[] r2 = com.google.android.apps.gsa.shared.p7195y.C91181am.f254555c
            int r3 = r14.mo85471p()
            int r4 = r3 + -1
            if (r3 == 0) goto L_0x0272
            r1 = r2[r4]
            if (r1 == r5) goto L_0x0243
            goto L_0x0256
        L_0x0243:
            com.bumptech.glide.load.c.c.g r1 = new com.bumptech.glide.load.c.c.g
            r1.<init>()
            com.bumptech.glide.f.b.a r2 = new com.bumptech.glide.f.b.a
            r3 = 300(0x12c, float:4.2E-43)
            r4 = 0
            r2.<init>(r3, r4)
            r1.mo11893b(r2)
            r0.mo12452n(r1)
        L_0x0256:
            com.google.android.apps.gsa.shared.y.az r1 = r14.mo85460e()
            if (r1 == 0) goto L_0x0264
            com.google.android.apps.gsa.shared.y.ai r2 = new com.google.android.apps.gsa.shared.y.ai
            r2.<init>(r1)
            r0.mo12442d(r2)
        L_0x0264:
            com.google.android.apps.gsa.shared.y.ba r14 = r14.mo85461f()
            if (r14 == 0) goto L_0x0271
            com.bumptech.glide.z r14 = r13.mo85413a(r14, r15)
            r0.mo12451m(r14)
        L_0x0271:
            return r0
        L_0x0272:
            throw r1
        L_0x0273:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7195y.C91188at.mo85413a(com.google.android.apps.gsa.shared.y.ba, android.widget.ImageView):com.bumptech.glide.z");
    }

    /* renamed from: b */
    public final C6007z mo85414b(Object obj, ImageView imageView) {
        C6007z b = this.f254568c.mo11872j(obj).mo11982o(this.f254570e);
        imageView.getClass();
        C5593j jVar = this.f254570e;
        if (!C5558a.m14350aa(jVar.f16814a, 2048) && jVar.f16827n && imageView.getScaleType() != null) {
            C5593j jVar2 = (C5593j) this.f254570e.clone();
            int i = C91181am.f254554b[imageView.getScaleType().ordinal()];
            if (i == 1) {
                jVar2.mo11957J();
            } else if (i == 2) {
                jVar2.mo11958K();
            } else if (i == 3 || i == 4 || i == 5) {
                jVar2.mo11959L();
            }
            b.mo11982o(jVar2);
        }
        return b;
    }

    /* renamed from: c */
    public final C91189au clone() {
        Context context = this.f254571i;
        C91192ax axVar = this.f254577f;
        return new C91188at(context.getApplicationContext(), context, this.f254572j, this.f254573k, this.f254574l, (C5593j) this.f254570e.clone(), axVar);
    }

    /* renamed from: d */
    public final C60870cx mo85417d(Uri uri) {
        return mo85426n(uri, (C5593j) null);
    }

    /* renamed from: e */
    public final C60870cx mo85418e(Uri uri, int i) {
        if (i == 7) {
            return mo85426n(uri, (C5593j) null);
        }
        return mo85426n(uri, (C5593j) new C5593j().mo11966S(f254564a, Integer.valueOf(i)));
    }

    /* renamed from: g */
    public final C60870cx mo85419g(Uri uri, ImageView imageView) {
        return mo85427p(mo85414b(m148979q(uri), imageView), imageView);
    }

    /* renamed from: h */
    public final C60870cx mo85420h(C91196ba baVar, ImageView imageView) {
        return mo85427p(mo85413a(baVar, imageView), imageView);
    }

    /* renamed from: i */
    public final C60870cx mo85421i(String str, ImageView imageView) {
        return mo85427p(mo85414b(m148979q(Uri.parse(str)), imageView), imageView);
    }

    /* renamed from: j */
    public final C60870cx mo85422j(byte[] bArr, ImageView imageView) {
        return mo85427p(mo85414b(bArr, imageView), imageView);
    }

    /* renamed from: k */
    public final C60870cx mo85423k(String str, byte[] bArr, ImageView imageView) {
        return mo85427p(mo85414b(new C22004a(str, bArr), imageView), imageView);
    }

    /* renamed from: l */
    public final C60870cx mo85424l(Uri uri, C58833ax axVar) {
        return mo85425m(uri, axVar, 7);
    }

    /* renamed from: m */
    public final C60870cx mo85425m(Uri uri, C58833ax axVar, int i) {
        C5593j jVar = (C5593j) new C5593j().mo11966S(f254564a, Integer.valueOf(i));
        if (axVar.mo56113h()) {
            jVar.mo11950C((Bitmap.CompressFormat) axVar.mo56107c());
        }
        C91185aq aqVar = new C91185aq(this);
        C6007z b = this.f254568c.mo11866d().mo12447i(m148979q(uri)).mo11982o(this.f254570e);
        if (jVar != null) {
            b.mo11982o(jVar);
        }
        m148982z("GlideLoadImage", new C91234z(b, aqVar));
        return this.f254573k.mo85141f(aqVar.f254561a, new C91178aj());
    }

    /* renamed from: n */
    public final C60870cx mo85426n(Uri uri, C5593j jVar) {
        Object q = m148979q(uri);
        C91185aq aqVar = new C91185aq(this);
        C6007z b = this.f254568c.mo11865c().mo12447i(q).mo11982o(this.f254570e);
        if (jVar != null) {
            b.mo11982o(jVar);
        }
        m148982z("GlideLoadImage", new C91176ah(b, aqVar));
        return aqVar.f254561a;
    }

    /* renamed from: o */
    public final C60870cx mo85316o() {
        return this.f254573k.mo85138c(new C90879am("GlideImageLoader#onTrimDisk", 2, 8, new C91232x(this)));
    }

    /* renamed from: p */
    public final C60870cx mo85427p(C6007z zVar, ImageView imageView) {
        SettableFuture settableFuture = new SettableFuture();
        m148982z("GlideLoadImage", new C91233y(this, zVar, imageView, settableFuture));
        return settableFuture;
    }

    /* renamed from: r */
    public final void mo85428r(C60870cx cxVar, String str, C22868d dVar) {
        if (!C22872h.m42744d(C0826b.class) || !cxVar.isDone()) {
            this.f254574l.mo28211k(cxVar, str, dVar);
            return;
        }
        try {
            dVar.mo17702gm(C60856cj.m92909r(cxVar));
        } catch (ExecutionException e) {
            C59104x c = f254565b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GlideImageLoader");
            ((C59052c) ((C59052c) c).mo56372aa(10632)).mo56386p("Failed to get value from done Future");
            dVar.mo17701gl(e);
        }
    }

    /* renamed from: s */
    public final void mo85429s(ImageView imageView) {
        this.f254568c.mo11876n(imageView);
    }

    /* renamed from: t */
    public final void mo85430t() {
        C5543d dVar = this.f254569d;
        Objects.requireNonNull(dVar);
        m148982z("GlideClearCache", new C91169aa(dVar));
    }

    /* renamed from: u */
    public final void mo85431u(Uri uri) {
        C6007z b = this.f254568c.mo11870h(uri).mo11982o(this.f254570e);
        Objects.requireNonNull(b);
        m148982z("GlidePreCache", new C91231w(b));
    }

    /* renamed from: v */
    public final void mo85432v() {
    }

    /* renamed from: w */
    public final C60870cx mo85433w(Uri uri, String str) {
        return mo85426n(uri, (C5593j) new C5593j().mo11967T(new C91187as(str)));
    }

    public C91188at(Context context, Context context2, C69464a aVar, C90931ca caVar, C22871g gVar, C91192ax axVar) {
        this(context, context2, aVar, caVar, gVar, new C5593j(), axVar);
    }
}
