package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1391d.C17265g;
import com.google.assistant.p3897e.p3921j.alb;
import com.google.assistant.p3897e.p3921j.ald;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.p */
/* compiled from: PG */
public final class C129733p extends C68247h {

    /* renamed from: a */
    private final C68283d f356006a;

    /* renamed from: c */
    private final C68283d f356007c;

    /* renamed from: d */
    private final C68283d f356008d;

    public C129733p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C129733p.class), aVar);
        this.f356006a = C68236af.m98549d(dVar);
        this.f356007c = C68236af.m98549d(dVar2);
        this.f356008d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C17265g gVar = (C17265g) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        ald ald = ((alb) list.get(2)).f135308a;
        if (ald == null) {
            ald = ald.f135310b;
        }
        return C60856cj.m92900i(gVar.mo23255a(ald.f135312a, booleanValue));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f356006a.mo60297gq(), this.f356007c.mo60297gq(), this.f356008d.mo60297gq());
    }
}
