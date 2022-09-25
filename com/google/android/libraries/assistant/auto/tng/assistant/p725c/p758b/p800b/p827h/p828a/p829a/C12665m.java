package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.C12692e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13016ad;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13017ae;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16685ar;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1210c.p1211a.C15948d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.m */
/* compiled from: PG */
public final class C12665m extends C68247h {

    /* renamed from: a */
    private final C68283d f39702a;

    /* renamed from: c */
    private final C68283d f39703c;

    /* renamed from: d */
    private final C68283d f39704d;

    /* renamed from: e */
    private final C68283d f39705e;

    /* renamed from: f */
    private final C68283d f39706f;

    /* renamed from: g */
    private final C68283d f39707g;

    public C12665m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C12665m.class), aVar);
        this.f39702a = C68236af.m98549d(dVar);
        this.f39703c = C68236af.m98549d(dVar2);
        this.f39704d = C68236af.m98549d(dVar3);
        this.f39705e = C68236af.m98549d(dVar4);
        this.f39706f = C68236af.m98549d(dVar5);
        this.f39707g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        boolean z;
        Object obj2;
        List list = (List) obj;
        C15948d dVar = (C15948d) list.get(1);
        Executor executor = (Executor) list.get(2);
        boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(4)).booleanValue();
        boolean booleanValue3 = ((Boolean) list.get(5)).booleanValue();
        C57987f fVar = new C57987f();
        C12991i b = ((C12692e) list.get(0)).mo20721b();
        C12989g gVar = C12989g.AUTO_PROJECTED;
        C12989g a = C12989g.m29225a(b.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (gVar.equals(a) && b.f40384c) {
            C62940bt r8 = C62942bv.checkIsLite(C13042d.f40481n);
            b.mo58887l(r8);
            Object l = b.f169962ag.mo58854l(r8.f169971d);
            if (l == null) {
                obj2 = r8.f169969b;
            } else {
                obj2 = r8.mo58889c(l);
            }
            if (((C13042d) obj2).f40492j) {
                z = true;
                if (!booleanValue3 && z) {
                    C60856cj.m92911t(dVar.mo22622a(), C47810es.m84974n(new C12663k(fVar)), executor);
                } else if (booleanValue || !z) {
                    fVar.f155056f.mo54589f(false);
                } else {
                    C13016ad adVar = (C13016ad) C13017ae.f40434c.createBuilder();
                    C16662b a2 = C16685ar.m33751a(booleanValue2);
                    adVar.copyOnWrite();
                    C13017ae aeVar = (C13017ae) adVar.instance;
                    a2.getClass();
                    aeVar.f40437b = a2;
                    aeVar.f40436a |= 1;
                    fVar.f155056f.mo54591h((C13017ae) adVar.build());
                    fVar.f155056f.mo54589f(false);
                }
                return C60856cj.m92900i(fVar);
            }
        }
        z = false;
        if (!booleanValue3) {
        }
        if (booleanValue) {
        }
        fVar.f155056f.mo54589f(false);
        return C60856cj.m92900i(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39702a.mo60297gq(), this.f39703c.mo60297gq(), this.f39704d.mo60297gq(), this.f39705e.mo60297gq(), this.f39706f.mo60297gq(), this.f39707g.mo60297gq());
    }
}
