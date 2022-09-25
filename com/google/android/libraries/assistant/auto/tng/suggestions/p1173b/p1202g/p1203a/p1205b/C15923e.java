package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.p1205b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15924c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15933d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15937g;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.C15944b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.C16237a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.b.e */
/* compiled from: PG */
public final class C15923e implements C15933d {

    /* renamed from: a */
    public final C16237a f47270a;

    /* renamed from: b */
    public final C15944b f47271b;

    /* renamed from: c */
    private final Executor f47272c;

    /* renamed from: d */
    private final C15973f f47273d;

    public C15923e(C16237a aVar, C15944b bVar, Executor executor, C15973f fVar) {
        this.f47270a = aVar;
        this.f47271b = bVar;
        this.f47272c = executor;
        this.f47273d = fVar;
    }

    /* renamed from: a */
    public final C15924c mo22612a() {
        return C15924c.PCP_FETCH;
    }

    /* renamed from: b */
    public final C60870cx mo22613b(C15938h hVar) {
        C60870cx cxVar;
        if (!hVar.mo22606b().mo56113h()) {
            cxVar = C47636i.m84745d((Iterable) Collection.EL.stream(this.f47273d.mo22633h()).map(C15919a.f47265a).distinct().map(new C15920b(this)).collect(C58370cn.f155946a)).mo51518a(C15921c.f47267a, this.f47272c);
        } else {
            cxVar = this.f47270a.mo22860a(C53270hr.FOREGROUND, ((C16090ap) hVar.mo22606b().mo56107c()).mo22725b());
        }
        if (hVar.mo22605a().equals(C15937g.UNKNOWN)) {
            return cxVar;
        }
        C15922d dVar = new C15922d(this, hVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(dVar), this.f47272c);
    }
}
