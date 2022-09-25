package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.support.p031v4.media.RatingCompat;
import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13921e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52198iw;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.t */
/* compiled from: PG */
public final /* synthetic */ class C13966t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13968v f42523a;

    /* renamed from: b */
    public final /* synthetic */ String f42524b;

    /* renamed from: c */
    public final /* synthetic */ C52198iw f42525c;

    public /* synthetic */ C13966t(C13968v vVar, String str, C52198iw iwVar) {
        this.f42523a = vVar;
        this.f42524b = str;
        this.f42525c = iwVar;
    }

    public final C60870cx apply(Object obj) {
        C13968v vVar = this.f42523a;
        String str = this.f42524b;
        C52198iw iwVar = this.f42525c;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60856cj.m92900i(C13976a.m30267b(str));
        }
        C0320v vVar2 = (C0320v) optional.get();
        if (C13983h.m30278e(vVar2)) {
            return C60856cj.m92900i(C13976a.m30269d(str, C52179id.AUTHENTICATION_EXPIRED, vVar2.mo1038f().f1000g));
        }
        RatingCompat a = C13983h.m30274a(iwVar, vVar2);
        if (a == null) {
            return C60856cj.m92900i(C13976a.m30266a(C52235kf.INVALID_ARGUMENT, "No valid rating type."));
        }
        C58976aa aaVar = C58975e.f156826a;
        if (((Boolean) vVar.f42533g.mo17428b()).booleanValue()) {
            return ((C36082f) vVar.f42529c.mo17428b()).mo39960a("media.SET_RATING", new C13954h(a), vVar2);
        }
        return ((C13921e) vVar.f42528b.mo27525b()).mo21349a("media.SET_RATING", new C13955i(a), vVar2);
    }
}
