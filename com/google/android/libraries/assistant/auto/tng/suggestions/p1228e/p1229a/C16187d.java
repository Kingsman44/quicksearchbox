package com.google.android.libraries.assistant.auto.tng.suggestions.p1228e.p1229a;

import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16115bn;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1228e.C16183a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1240g.C16213a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.e.a.d */
/* compiled from: PG */
public final class C16187d implements C16183a {

    /* renamed from: a */
    public final C16002a f47747a;

    /* renamed from: b */
    public final Executor f47748b;

    /* renamed from: c */
    public final C15973f f47749c;

    /* renamed from: d */
    private final C58833ax f47750d;

    public C16187d(C16002a aVar, Executor executor, C15973f fVar, C58833ax axVar) {
        this.f47747a = aVar;
        this.f47748b = executor;
        this.f47749c = fVar;
        this.f47750d = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo22845a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C16186c cVar = new C16186c(this, str, z);
        return C60856cj.m92905n(C47810es.m84965e(cVar), this.f47748b);
    }

    /* renamed from: b */
    public final C58833ax mo22846b(C16115bn bnVar, boolean z) {
        if (bnVar == null) {
            return C58836b.f156633a;
        }
        C16330ad a = bnVar.mo22773a();
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            ((C16213a) ((C58847bk) this.f47750d).f156646a).mo22853d(bnVar, C28442l.m53142h().mo33894a());
        }
        return C58833ax.m90834k(a);
    }

    /* renamed from: c */
    public final C58833ax mo22847c(C16143co coVar, boolean z) {
        if (coVar == null) {
            return C58836b.f156633a;
        }
        C16330ad b = coVar.mo22798b();
        C58976aa aaVar = C58975e.f156826a;
        C46459k.m82829b(this.f47747a.mo22645b(coVar.mo22800d()), "Failed to update CandidateSuggestionMetrics on interaction", new Object[0]);
        if (z) {
            ((C16213a) ((C58847bk) this.f47750d).f156646a).mo22854e(coVar, C28442l.m53142h().mo33894a());
        }
        return C58833ax.m90834k(b);
    }
}
