package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1137b.p1138a.C15588a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1137b.p1138a.C15589b;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.aj */
/* compiled from: PG */
public final class C12247aj extends C68247h {

    /* renamed from: a */
    private final C68283d f39000a;

    /* renamed from: c */
    private final C68283d f39001c;

    /* renamed from: d */
    private final C68283d f39002d;

    public C12247aj(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12247aj.class), aVar);
        this.f39000a = C68236af.m98549d(dVar);
        this.f39001c = C68236af.m98549d(dVar2);
        this.f39002d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        String str;
        C52081en enVar;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C52081en enVar2 = (C52081en) list.get(1);
        long longValue = ((Long) list.get(2)).longValue();
        C15588a aVar = new C15588a();
        aVar.f46623b = BuildConfig.FLAVOR;
        aVar.mo22407b(-1);
        aVar.mo22406a(C52081en.f136679i);
        if (axVar.mo56113h()) {
            String str2 = (String) axVar.mo56107c();
            if (str2 != null) {
                aVar.f46623b = str2;
                aVar.mo22407b(longValue);
            } else {
                throw new NullPointerException("Null queryString");
            }
        }
        aVar.mo22406a(enVar2);
        if (aVar.f46625d == 1 && (str = aVar.f46623b) != null && (enVar = aVar.f46624c) != null) {
            return C60856cj.m92900i(new C15589b(aVar.f46622a, str, enVar));
        }
        StringBuilder sb = new StringBuilder();
        if (aVar.f46625d == 0) {
            sb.append(" requestID");
        }
        if (aVar.f46623b == null) {
            sb.append(" queryString");
        }
        if (aVar.f46624c == null) {
            sb.append(" conversationDelta");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39000a.mo60297gq(), this.f39001c.mo60297gq(), this.f39002d.mo60297gq());
    }
}
