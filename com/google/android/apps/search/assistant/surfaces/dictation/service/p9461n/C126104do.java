package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.do */
/* compiled from: PG */
final class C126104do extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ boolean f347527a;

    /* renamed from: b */
    final /* synthetic */ C125065at f347528b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126104do(boolean z, C125065at atVar) {
        super(1);
        this.f347527a = z;
        this.f347528b = atVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C125065at atVar;
        C126083cu cuVar;
        C126087cy cyVar = (C126087cy) obj;
        C69664n.m101061g(cyVar, "it");
        C126084cv a = C126084cv.m206171a(cyVar.f347493d, true, false, 2);
        boolean z = this.f347527a;
        if (z) {
            atVar = this.f347528b;
        } else {
            atVar = cyVar.f347496g;
        }
        C125065at atVar2 = atVar;
        if (z) {
            cuVar = new C126083cu((byte[]) null);
        } else {
            cuVar = cyVar.f347498i;
        }
        return C126087cy.m206173e(cyVar, (C126292aa) null, (C60870cx) null, false, a, (C125112cm) null, 0, atVar2, this.f347527a, cuVar, (C58485gu) null, 563);
    }
}
