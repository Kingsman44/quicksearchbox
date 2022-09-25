package com.google.android.apps.search.googleapp.search.p10420k;

import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137541c;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.p10435e.C137769at;
import com.google.android.libraries.p1730f.C21370a;
import java.util.HashSet;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.k.e */
/* compiled from: PG */
public final class C137546e {

    /* renamed from: a */
    public final C21370a f374099a;

    /* renamed from: b */
    private final C136832c f374100b;

    /* renamed from: c */
    private final boolean f374101c;

    public C137546e(C21370a aVar, C136832c cVar, boolean z) {
        this.f374099a = aVar;
        this.f374100b = cVar;
        this.f374101c = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0044  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137541c m223427d(com.google.android.apps.search.googleapp.search.p10409e.C137416e r10) {
        /*
            r9 = this;
            com.google.android.apps.search.googleapp.search.k.a.d r0 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d.f374085g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.k.a.c r0 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137541c) r0
            com.google.android.libraries.f.a r1 = r9.f374099a
            long r1 = r1.mo26870b()
            com.google.protobuf.bv r3 = r10.build()
            com.google.android.apps.search.googleapp.search.e.g r3 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r3
            int r4 = r3.f373769a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0029
            long r4 = r3.f373772d
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0029
            com.google.android.libraries.f.a r1 = r9.f374099a
            long r1 = com.google.android.libraries.p1730f.C21383f.m40448a(r1, r4)
            goto L_0x003e
        L_0x0029:
            com.google.android.libraries.f.a r4 = r9.f374099a
            long r4 = r4.mo26871c()
            r10.copyOnWrite()
            com.google.protobuf.bv r6 = r10.instance
            com.google.android.apps.search.googleapp.search.e.g r6 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r6
            int r7 = r6.f373769a
            r7 = r7 | 4
            r6.f373769a = r7
            r6.f373772d = r4
        L_0x003e:
            int r4 = r3.f373769a
            r4 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r4 != 0) goto L_0x0060
            java.util.Random r4 = com.google.common.base.C58851bo.f156649a
            long r4 = r4.nextLong()
            java.lang.String r4 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r4)
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.android.apps.search.googleapp.search.e.g r5 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r5
            r4.getClass()
            int r6 = r5.f373769a
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            r5.f373769a = r6
            r5.f373783o = r4
        L_0x0060:
            int r4 = r3.f373769a
            r4 = r4 & 8
            r5 = 2
            if (r4 == 0) goto L_0x0068
            goto L_0x00d3
        L_0x0068:
            com.google.protobuf.dn r4 = r3.f373773e
            java.lang.String r6 = "gsas"
            boolean r7 = r4.containsKey(r6)
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x007b
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x007c
        L_0x007b:
            r4 = r8
        L_0x007c:
            java.lang.String r7 = "4"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x0095
            r10.copyOnWrite()
            com.google.protobuf.bv r3 = r10.instance
            com.google.android.apps.search.googleapp.search.e.g r3 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r3
            r4 = 1
            r3.f373774f = r4
            int r4 = r3.f373769a
            r4 = r4 | 8
            r3.f373769a = r4
            goto L_0x00d3
        L_0x0095:
            com.google.protobuf.dn r4 = r3.f373773e
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L_0x00a4
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00a5
        L_0x00a4:
            r4 = r8
        L_0x00a5:
            java.lang.String r6 = "1"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x00c4
            com.google.protobuf.dn r3 = r3.f373773e
            java.lang.String r4 = "ibp"
            boolean r6 = r3.containsKey(r4)
            if (r6 == 0) goto L_0x00be
            java.lang.Object r3 = r3.get(r4)
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
        L_0x00be:
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x00d3
        L_0x00c4:
            r10.copyOnWrite()
            com.google.protobuf.bv r3 = r10.instance
            com.google.android.apps.search.googleapp.search.e.g r3 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r3
            r3.f373774f = r5
            int r4 = r3.f373769a
            r4 = r4 | 8
            r3.f373769a = r4
        L_0x00d3:
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.googleapp.search.k.a.d r3 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r3
            int r4 = r3.f374087a
            r4 = r4 | r5
            r3.f374087a = r4
            r3.f374089c = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.googleapp.search.k.a.d r1 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r1
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.apps.search.googleapp.search.e.g r10 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r10
            r10.getClass()
            r1.f374092f = r10
            int r10 = r1.f374087a
            r10 = r10 | 16
            r1.f374087a = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.p10420k.C137546e.m223427d(com.google.android.apps.search.googleapp.search.e.e):com.google.android.apps.search.googleapp.search.k.a.c");
    }

    /* renamed from: a */
    public final C137542d mo113806a(C137418g gVar, boolean z, int i, Map map) {
        C137416e eVar = (C137416e) gVar.toBuilder();
        Map.EL.forEach(map, new C137545d(eVar));
        C137541c d = m223427d(eVar);
        d.copyOnWrite();
        C137542d dVar = (C137542d) d.instance;
        C137542d dVar2 = C137542d.f374085g;
        dVar.f374088b = i - 1;
        dVar.f374087a |= 1;
        d.copyOnWrite();
        C137542d dVar3 = (C137542d) d.instance;
        C137418g gVar2 = (C137418g) eVar.build();
        gVar2.getClass();
        dVar3.f374092f = gVar2;
        dVar3.f374087a |= 16;
        d.copyOnWrite();
        C137542d dVar4 = (C137542d) d.instance;
        dVar4.f374087a |= 4;
        dVar4.f374090d = z;
        return (C137542d) d.build();
    }

    /* renamed from: b */
    public final C137542d mo113807b(String str, boolean z, String str2, int i, java.util.Map map) {
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        str.getClass();
        gVar.f373769a |= 1;
        gVar.f373770b = str;
        eVar.copyOnWrite();
        C137418g gVar2 = (C137418g) eVar.instance;
        str2.getClass();
        gVar2.f373769a |= 2;
        gVar2.f373771c = str2;
        return mo113806a((C137418g) eVar.build(), z, i, map);
    }

    /* renamed from: c */
    public final C137542d mo113808c(Uri uri, int i, boolean z) {
        String queryParameter;
        if (uri.isOpaque()) {
            return null;
        }
        if (!this.f374101c ? !this.f374100b.mo113404j(uri) : !this.f374100b.mo113403i(uri)) {
            return null;
        }
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        C69664n.m101061g(uri, "uri");
        boolean isHierarchical = uri.isHierarchical();
        String str = BuildConfig.FLAVOR;
        if (isHierarchical && (queryParameter = uri.getQueryParameter("tbm")) != null) {
            str = queryParameter;
        }
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        gVar.f373769a |= 2;
        gVar.f373771c = str;
        if (this.f374100b.mo113404j(uri) || !this.f374101c) {
            String queryParameter2 = uri.getQueryParameter("q");
            queryParameter2.getClass();
            eVar.copyOnWrite();
            C137418g gVar2 = (C137418g) eVar.instance;
            gVar2.f373769a |= 1;
            gVar2.f373770b = queryParameter2;
        } else {
            HashSet hashSet = new HashSet(uri.getQueryParameterNames());
            hashSet.retainAll(C137769at.f374787a);
            if (hashSet.isEmpty()) {
                return null;
            }
            String uri2 = uri.toString();
            eVar.copyOnWrite();
            C137418g gVar3 = (C137418g) eVar.instance;
            uri2.getClass();
            gVar3.f373769a |= 16;
            gVar3.f373775g = uri2;
        }
        Collection.EL.stream(uri.getQueryParameterNames()).forEach(new C137544c(uri, eVar));
        C137541c d = m223427d(eVar);
        d.copyOnWrite();
        C137542d dVar = (C137542d) d.instance;
        C137542d dVar2 = C137542d.f374085g;
        dVar.f374087a |= 4;
        dVar.f374090d = z;
        d.copyOnWrite();
        C137542d dVar3 = (C137542d) d.instance;
        dVar3.f374088b = i - 1;
        dVar3.f374087a |= 1;
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment)) {
            d.copyOnWrite();
            C137542d dVar4 = (C137542d) d.instance;
            encodedFragment.getClass();
            dVar4.f374087a |= 8;
            dVar4.f374091e = encodedFragment;
        }
        return (C137542d) d.build();
    }
}
