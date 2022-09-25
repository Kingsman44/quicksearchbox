package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

import android.net.Uri;
import android.util.Base64;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58487gw;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64134c;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64137f;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64139h;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64141j;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64147p;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64150s;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64153v;
import java.util.Arrays;
import p5591n.p5594b.p5595a.p5596a.p5597a.p5598a.p5599a.p5600a.p5601a.C71857b;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.p */
/* compiled from: PG */
public final class C40456p implements C40452l {

    /* renamed from: a */
    static final C40447g f106178a;

    /* renamed from: b */
    public static final /* synthetic */ int f106179b = 0;

    /* renamed from: c */
    private static final C40447g f106180c = C40447g.m70146b("X-Protobuffer-Request-Payload");

    /* renamed from: d */
    private static final C58487gw f106181d;

    /* renamed from: e */
    private final C40451k f106182e;

    /* renamed from: f */
    private final C60887da f106183f;

    static {
        C40447g b = C40447g.m70146b("Content-Type");
        f106178a = b;
        f106181d = C58487gw.m89867e(b, "application/x-protobuf");
    }

    public C40456p(C40451k kVar, C60887da daVar) {
        this.f106182e = kVar;
        this.f106183f = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo42453a(C71857b bVar, C64137f fVar) {
        C40451k kVar = this.f106182e;
        Uri.Builder appendEncodedPath = new Uri.Builder().scheme(fVar.f173407d).authority(fVar.f173408e).appendEncodedPath(fVar.f173409f);
        for (C64147p pVar : fVar.f173411h) {
            appendEncodedPath.appendQueryParameter(pVar.f173438a, pVar.f173439b);
        }
        Uri build = appendEncodedPath.build();
        C58331bb bbVar = new C58331bb();
        for (C64139h hVar : fVar.f173410g) {
            bbVar.mo54920x(C40447g.m70146b(hVar.f173416a), hVar.f173417b);
        }
        int i = fVar.f173405b;
        int i2 = 1;
        if (i == 100) {
            C64150s sVar = (C64150s) fVar.f173406c;
            int i3 = sVar.f173445b;
            bbVar.mo54920x(C40447g.m70146b(sVar.f173444a), Base64.encodeToString(bVar.toByteArray(), 11));
        } else if (i == 101) {
            int i4 = ((C64153v) fVar.f173406c).f173450a;
            bbVar.mo55279i(f106178a, Arrays.asList(new String[]{"application/x-protobuf"}));
        }
        C58487gw d = C58487gw.m89866d(bbVar);
        C63088z byteString = fVar.f173405b == 101 ? bVar.toByteString() : null;
        int a = C64134c.m96364a(fVar.f173412i);
        if (a != 0) {
            i2 = a;
        }
        int i5 = i2 - 1;
        return C60922j.m93044g(kVar.mo42452d(build, d, byteString, false, i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? C40448h.GET : C40448h.HEAD : C40448h.DELETE : C40448h.PUT : C40448h.POST), C47810es.m84963c(new C40454n(fVar)), this.f106183f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo42454b(com.google.p4017at.p4060h.p4061a.p4062a.p4067e.C54177b r4, com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64145n r5) {
        /*
            r3 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r5.f173429b
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = r5.f173430c
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r1 = "httpservice"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            int r1 = r5.f173433f
            int r1 = com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a.C64143l.m96366a(r1)
            r2 = 1
            if (r1 != 0) goto L_0x0021
            r1 = 1
        L_0x0021:
            if (r1 != r2) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            r2 = 2
            if (r1 == r2) goto L_0x0030
            r2 = 3
            if (r1 == r2) goto L_0x002d
        L_0x002a:
            java.lang.String r1 = "NORETRY"
            goto L_0x0032
        L_0x002d:
            java.lang.String r1 = "RETRY"
            goto L_0x0032
        L_0x0030:
            java.lang.String r1 = "WEB"
        L_0x0032:
            java.lang.String r1 = com.google.common.base.C58890d.m90988c(r1)
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = r5.f173431d
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = r5.f173432e
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = r5.f173435h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = "pf"
            java.lang.String r2 = r5.f173435h
            r0.appendQueryParameter(r1, r2)
        L_0x0055:
            java.lang.String r1 = r5.f173434g
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = "ved"
            java.lang.String r5 = r5.f173434g
            r0.appendQueryParameter(r1, r5)
        L_0x0064:
            android.net.Uri r5 = r0.build()
            byte[] r4 = r4.toByteArray()
            r0 = 11
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r0)
            com.google.android.libraries.search.rendering.xuikit.d.j.g r0 = f106180c
            com.google.common.b.gw r4 = com.google.common.p4522b.C58487gw.m89867e(r0, r4)
            com.google.android.libraries.search.rendering.xuikit.d.j.k r0 = r3.f106182e
            r1 = 0
            r2 = 0
            com.google.common.util.concurrent.cx r4 = r0.mo42451c(r5, r4, r1, r2)
            com.google.android.libraries.search.rendering.xuikit.d.j.m r5 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40453m.f106175a
            com.google.common.base.ah r5 = com.google.apps.tiktok.tracing.C47810es.m84963c(r5)
            com.google.common.util.concurrent.da r0 = r3.f106183f
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60922j.m93044g(r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40456p.mo42454b(com.google.at.h.a.a.e.b, com.google.protos.aw.c.a.a.a.b.a.a.n):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo42455c(C71857b bVar, C64141j jVar) {
        C40451k kVar = this.f106182e;
        Uri.Builder appendEncodedPath = new Uri.Builder().scheme(jVar.f173422b).authority(jVar.f173423c).appendEncodedPath(jVar.f173424d);
        appendEncodedPath.appendQueryParameter("alt", "proto");
        return C60922j.m93044g(kVar.mo42451c(appendEncodedPath.build(), f106181d, bVar.toByteString(), false), C47810es.m84963c(C40455o.f106177a), this.f106183f);
    }
}
