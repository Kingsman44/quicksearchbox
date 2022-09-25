package com.google.android.apps.gsa.search.core.service.p6856h.p6857a;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.service.p6856h.p6858b.C86745a;
import com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a.C86763k;
import com.google.android.apps.gsa.search.core.state.p6872d.C86926at;
import com.google.android.apps.gsa.search.core.state.p6872d.C86940bg;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;

@Deprecated
/* renamed from: com.google.android.apps.gsa.search.core.service.h.a.b */
/* compiled from: PG */
public final class C86736b extends C86745a {

    /* renamed from: a */
    public final C86940bg f234296a;

    /* renamed from: b */
    public final C68214a f234297b;

    /* renamed from: c */
    private final C22871g f234298c;

    /* renamed from: f */
    private final C86926at f234299f;

    /* renamed from: g */
    private final C68214a f234300g;

    /* renamed from: h */
    private final C86763k f234301h;

    /* renamed from: i */
    private boolean f234302i;

    public C86736b(C22871g gVar, C86926at atVar, C86940bg bgVar, C68214a aVar, C68214a aVar2, C86763k kVar) {
        super(C118575h.WORKER_MODULE, "module");
        this.f234298c = gVar;
        this.f234299f = atVar;
        this.f234296a = bgVar;
        this.f234297b = aVar;
        this.f234300g = aVar2;
        this.f234301h = kVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79105a(com.google.android.apps.gsa.search.core.state.C87135ic r9) {
        /*
            r8 = this;
            com.google.android.apps.gsa.search.core.state.d.bg r0 = r8.f234296a
            java.util.Set r1 = r0.f234815c
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 5
            r4 = 4
            r5 = 1
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r6 = r0.f234813a
            java.lang.Object r6 = r6.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x002d
            int r7 = r6.intValue()
            if (r7 == r4) goto L_0x002d
            int r4 = r6.intValue()
            if (r4 != r3) goto L_0x0008
        L_0x002d:
            java.util.Map r3 = r0.f234813a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.put(r2, r4)
            goto L_0x0008
        L_0x0037:
            r1 = 2
            java.util.Set r0 = r0.mo80595e(r5, r1)
            java.lang.String r1 = "searchgraphlegacy"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L_0x0050
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>(r0)
            r2.remove(r1)
            r2.addFirst(r1)
            r0 = r2
        L_0x0050:
            java.util.Iterator r0 = r0.iterator()
        L_0x0054:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            dagger.a r2 = r8.f234300g
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.service.h.a.e r2 = (com.google.android.apps.gsa.search.core.service.p6856h.p6857a.C86739e) r2
            com.google.common.util.concurrent.cx r2 = r2.mo80353a(r1)
            com.google.android.libraries.gsa.k.g r6 = r8.f234298c
            com.google.android.apps.gsa.search.core.service.h.a.a r7 = new com.google.android.apps.gsa.search.core.service.h.a.a
            r7.<init>(r8, r1)
            java.lang.String r1 = "Mark worker after loading"
            r6.mo28211k(r2, r1, r7)
            goto L_0x0054
        L_0x0079:
            r0 = 6
            boolean r9 = r9.mo80754a(r0)
            if (r9 == 0) goto L_0x0120
            com.google.android.apps.gsa.search.core.state.d.at r9 = r8.f234299f
            int r0 = r9.f234757a
            r1 = 0
            r9.f234757a = r1
            if (r0 == 0) goto L_0x0120
            com.google.android.apps.gsa.search.core.state.d.bg r9 = r8.f234296a
            java.util.Map r0 = r9.f234813a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0095:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r1.getValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = 3
            if (r6 != r7) goto L_0x0095
            java.util.Set r6 = r9.f234814b
            boolean r6 = r6.contains(r2)
            if (r6 != 0) goto L_0x0095
            java.util.Set r6 = r9.f234815c
            boolean r2 = r6.contains(r2)
            if (r2 != 0) goto L_0x0095
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.setValue(r2)
            goto L_0x0095
        L_0x00cc:
            java.util.Set r9 = r9.mo80595e(r4, r3)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x00d7
            goto L_0x0120
        L_0x00d7:
            java.util.Iterator r9 = r9.iterator()
        L_0x00db:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            dagger.a r1 = r8.f234297b
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.service.h.d r1 = (com.google.android.apps.gsa.search.core.service.p6856h.C86747d) r1
            com.google.common.base.ax r1 = r1.mo80355a(r0)
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x00db
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.search.core.service.h.b r1 = (com.google.android.apps.gsa.search.core.service.p6856h.C86744b) r1
            com.google.android.apps.gsa.search.core.service.i.b.a.a.k r2 = r8.f234301h
            boolean r3 = r2.mo80378c(r1)
            if (r3 == 0) goto L_0x00db
            r2.mo80377b(r1, r5)
            dagger.a r1 = r8.f234297b
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.service.h.d r1 = (com.google.android.apps.gsa.search.core.service.p6856h.C86747d) r1
            r1.mo80360g(r0)
            com.google.android.apps.gsa.search.core.state.d.bg r1 = r8.f234296a
            java.util.Map r2 = r1.f234813a
            r2.remove(r0)
            r1.mo80591ar()
            goto L_0x00db
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.service.p6856h.p6857a.C86736b.mo79105a(com.google.android.apps.gsa.search.core.state.ic):void");
    }

    /* renamed from: c */
    public final boolean mo80352c() {
        return this.f234302i;
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f234302i = true;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
