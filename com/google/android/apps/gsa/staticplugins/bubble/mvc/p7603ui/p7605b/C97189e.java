package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b;

import android.content.Context;
import android.util.LruCache;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32064g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.e */
/* compiled from: PG */
public final class C97189e implements C32064g {

    /* renamed from: a */
    public static final C59071e f271538a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.e");

    /* renamed from: b */
    private final Context f271539b;

    /* renamed from: c */
    private final C91189au f271540c;

    /* renamed from: d */
    private final C22871g f271541d;

    /* renamed from: e */
    private final LruCache f271542e = new LruCache(4);

    public C97189e(Context context, C91189au auVar, C22871g gVar) {
        this.f271539b = context;
        this.f271540c = auVar;
        this.f271541d = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37849a(com.google.p4283bv.p4354e.p4367c.p4368a.C57414cl r6, com.google.android.libraries.p2460r.p2464b.p2465a.C32051a r7) {
        /*
            r5 = this;
            com.google.protobuf.cq r0 = r6.f153382a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e6
            com.google.protobuf.cq r6 = r6.f153382a
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            com.google.bv.e.c.a.cn r6 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57416cn) r6
            java.lang.String r1 = r6.f153387b
            java.lang.String r2 = "asset://"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x009c
            java.lang.String r6 = r6.f153387b
            r1 = 8
            java.lang.String r6 = r6.substring(r1)
            int r1 = r6.hashCode()
            r2 = -811245322(0xffffffffcfa560f6, float:-5.5491901E9)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x004d
            r2 = 314789334(0x12c34dd6, float:1.2325418E-27)
            if (r1 == r2) goto L_0x0043
            r2 = 1459403117(0x56fcb96d, float:1.38936664E14)
            if (r1 == r2) goto L_0x0039
            goto L_0x0057
        L_0x0039:
            java.lang.String r1 = "bubble_ic_red_card_right"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0043:
            java.lang.String r1 = "bubble_ic_inverse_crest"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0057
            r1 = 2
            goto L_0x0058
        L_0x004d:
            java.lang.String r1 = "bubble_ic_error"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0057
            r1 = 0
            goto L_0x0058
        L_0x0057:
            r1 = -1
        L_0x0058:
            if (r1 == 0) goto L_0x008d
            if (r1 == r4) goto L_0x0089
            if (r1 == r3) goto L_0x0085
            com.google.common.f.e r1 = f271538a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Falling back to default case to get bundled drawable resource [%s]. In orderto not hurt performance, any common asset should be added to the switch statement."
            r3 = 18442(0x480a, float:2.5843E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r6)
            java.lang.Class<com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.aq> r1 = com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97145aq.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0077 }
            r2 = 0
            int r0 = r1.getInt(r2)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0090
        L_0x0077:
            com.google.common.f.e r1 = f271538a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Couldn't find resource for [%s]"
            r3 = 18443(0x480b, float:2.5844E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r6)
            goto L_0x0090
        L_0x0085:
            r0 = 2131231513(0x7f080319, float:1.807911E38)
            goto L_0x0090
        L_0x0089:
            r0 = 2131231514(0x7f08031a, float:1.8079111E38)
            goto L_0x0090
        L_0x008d:
            r0 = 2131231510(0x7f080316, float:1.8079103E38)
        L_0x0090:
            if (r0 == 0) goto L_0x009b
            android.content.Context r6 = r5.f271539b
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r0)
            r7.mo37836a(r6)
        L_0x009b:
            return
        L_0x009c:
            java.lang.String r6 = r6.f153387b
            android.util.LruCache r0 = r5.f271542e
            java.lang.Object r0 = r0.get(r6)
            com.google.common.util.concurrent.cx r0 = (com.google.common.util.concurrent.C60870cx) r0
            if (r0 == 0) goto L_0x00b9
            boolean r1 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148480n(r0)
            if (r1 != 0) goto L_0x00af
            goto L_0x00b9
        L_0x00af:
            java.lang.Object r6 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148474h(r0)
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r7.mo37836a(r6)
            return
        L_0x00b9:
            if (r0 != 0) goto L_0x00cc
            android.net.Uri r0 = android.net.Uri.parse(r6)
            com.google.android.apps.gsa.shared.y.au r1 = r5.f271540c
            r2 = 55
            com.google.common.util.concurrent.cx r0 = r1.mo85418e(r0, r2)
            android.util.LruCache r1 = r5.f271542e
            r1.put(r6, r0)
        L_0x00cc:
            com.google.android.libraries.gsa.k.g r1 = r5.f271541d
            p3186j$.util.Objects.requireNonNull(r7)
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.c r2 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.c
            r2.<init>(r7)
            com.google.android.apps.gsa.shared.util.c.ag r7 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r3 = "Image load"
            r7.<init>(r0, r1, r3, r2)
            com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.d r0 = new com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.d
            r0.<init>(r6)
            r7.mo85223a(r0)
            return
        L_0x00e6:
            com.google.common.f.e r6 = f271538a
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r7 = "Got empty source list"
            r0 = 18444(0x480c, float:2.5846E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56386p(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.C97189e.mo37849a(com.google.bv.e.c.a.cl, com.google.android.libraries.r.b.a.a):void");
    }
}
