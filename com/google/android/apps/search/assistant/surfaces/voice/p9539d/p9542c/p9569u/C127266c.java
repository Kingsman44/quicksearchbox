package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9569u;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127361i;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.C127904h;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51485jl;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.u.c */
/* compiled from: PG */
public final class C127266c implements C127369n {

    /* renamed from: a */
    public static final C32836cd f350491a;

    /* renamed from: b */
    public static final C33476a f350492b = new C33476a("assistant.api.params.NgaParam", C51485jl.f134149c);

    /* renamed from: c */
    public final C127361i f350493c;

    /* renamed from: d */
    private final C71422aw f350494d;

    /* renamed from: e */
    private final C127904h f350495e;

    /* renamed from: f */
    private final C59071e f350496f = C59071e.m91331h();

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.nga_params");
        a.mo38319b(a2.mo38298a());
        f350491a = a.mo38318a();
    }

    public C127266c(C71422aw awVar, C127904h hVar, C127361i iVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(iVar, "ngaContextStore");
        this.f350494d = awVar;
        this.f350495e = hVar;
        this.f350493c = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350494d, (C71424ay) null, new C127264a(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[Catch:{ Exception -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[Catch:{ Exception -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108006b(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9569u.C127265b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.d.c.u.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9569u.C127265b) r0
            int r1 = r0.f350490d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f350490d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.u.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.d.c.u.b
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f350488b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f350490d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.f350487a
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0051
        L_0x0029:
            r7 = move-exception
            goto L_0x006e
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.h.b.h r7 = r6.f350495e     // Catch:{ Exception -> 0x006c }
            kotlinx.coroutines.aw r2 = r7.f352066a     // Catch:{ Exception -> 0x006c }
            com.google.android.apps.search.assistant.surfaces.voice.h.b.f r4 = new com.google.android.apps.search.assistant.surfaces.voice.h.b.f     // Catch:{ Exception -> 0x006c }
            r5 = 0
            r4.<init>(r7, r5)     // Catch:{ Exception -> 0x006c }
            r7 = 3
            com.google.common.util.concurrent.cx r7 = kotlinx.coroutines.p5578d.C71663i.m104692e(r2, r5, r4, r7)     // Catch:{ Exception -> 0x006c }
            r0.f350487a = r6     // Catch:{ Exception -> 0x006c }
            r0.f350490d = r3     // Catch:{ Exception -> 0x006c }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)     // Catch:{ Exception -> 0x006c }
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r6
        L_0x0051:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r7     // Catch:{ Exception -> 0x0029 }
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.voice.d.c.u.c r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9569u.C127266c) r1     // Catch:{ Exception -> 0x0029 }
            com.google.common.f.e r1 = r1.f350496f     // Catch:{ Exception -> 0x0029 }
            int r1 = r7.f352149a     // Catch:{ Exception -> 0x0029 }
            if (r1 != r3) goto L_0x0069
            java.lang.Object r7 = r7.f352150b     // Catch:{ Exception -> 0x0029 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x0029 }
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x0029 }
            if (r7 == 0) goto L_0x0069
            com.google.assistant.e.i.a.jk r7 = com.google.assistant.p3897e.p3917i.p3918a.C51484jk.NGA     // Catch:{ Exception -> 0x0029 }
            goto L_0x0090
        L_0x0069:
            com.google.assistant.e.i.a.jk r7 = com.google.assistant.p3897e.p3917i.p3918a.C51484jk.OPA     // Catch:{ Exception -> 0x0029 }
            goto L_0x0090
        L_0x006c:
            r7 = move-exception
            r0 = r6
        L_0x006e:
            com.google.android.apps.search.assistant.surfaces.voice.d.c.u.c r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9569u.C127266c) r0
            com.google.common.f.e r0 = r0.f350496f
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r7 = r0.mo56382g(r7)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 37276(0x919c, float:5.2235E-41)
            r0.<init>(r1)
            r7.mo56379ah(r0)
            java.lang.String r0 = "Error while figuring out ui mode, use NGA as default"
            r7.mo56386p(r0)
            com.google.assistant.e.i.a.jk r7 = com.google.assistant.p3897e.p3917i.p3918a.C51484jk.NGA
        L_0x0090:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9569u.C127266c.mo108006b(h.c.g):java.lang.Object");
    }
}
