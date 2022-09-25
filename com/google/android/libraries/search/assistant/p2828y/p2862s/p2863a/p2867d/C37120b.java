package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2867d;

import android.database.Cursor;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69571i;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5482l.C69733m;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.topcontactparams.impl.util.CursorUtil$transformAndCloseCursor$2$1", mo61344c = "CursorUtil.kt", mo61345d = "invokeSuspend", mo61346e = {36})
/* renamed from: com.google.android.libraries.search.assistant.y.s.a.d.b */
/* compiled from: PG */
final class C37120b extends C69571i implements C69630p {

    /* renamed from: a */
    int f96686a;

    /* renamed from: b */
    final /* synthetic */ Cursor f96687b;

    /* renamed from: c */
    final /* synthetic */ C69626l f96688c;

    /* renamed from: d */
    private /* synthetic */ Object f96689d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37120b(Cursor cursor, C69626l lVar, C69577g gVar) {
        super(gVar);
        this.f96687b = cursor;
        this.f96688c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37120b) mo5194c((C69733m) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r5.f96687b.moveToNext() == false) goto L_0x0042;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r4.f96686a
            if (r1 == 0) goto L_0x000f
            java.lang.Object r1 = r4.f96689d
            h.l.m r1 = (p5462h.p5482l.C69733m) r1
            p5462h.C69714l.m101134b(r5)
            r5 = r4
            goto L_0x0039
        L_0x000f:
            p5462h.C69714l.m101134b(r5)
            java.lang.Object r5 = r4.f96689d
            h.l.m r5 = (p5462h.p5482l.C69733m) r5
            android.database.Cursor r1 = r4.f96687b
            if (r1 == 0) goto L_0x0045
            boolean r1 = r1.moveToFirst()
            if (r1 == 0) goto L_0x0042
            r1 = r5
            r5 = r4
        L_0x0022:
            h.f.a.l r2 = r5.f96688c
            android.database.Cursor r3 = r5.f96687b
            java.lang.Object r2 = r2.mo5761a(r3)
            if (r2 != 0) goto L_0x002d
            goto L_0x0039
        L_0x002d:
            r5.f96689d = r1
            r3 = 1
            r5.f96686a = r3
            java.lang.Object r2 = r1.mo61426a(r2, r5)
            if (r2 != r0) goto L_0x0039
            return r0
        L_0x0039:
            android.database.Cursor r2 = r5.f96687b
            boolean r2 = r2.moveToNext()
            if (r2 == 0) goto L_0x0042
            goto L_0x0022
        L_0x0042:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x0045:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r5.<init>(r0)
            goto L_0x004e
        L_0x004d:
            throw r5
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2867d.C37120b.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C37120b bVar = new C37120b(this.f96687b, this.f96688c, gVar);
        bVar.f96689d = obj;
        return bVar;
    }
}
