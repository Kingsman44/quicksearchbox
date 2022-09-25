package com.google.android.libraries.search.assistant.performer.p2757g;

import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52198iw;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.v */
/* compiled from: PG */
public final /* synthetic */ class C36104v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36108z f94430a;

    /* renamed from: b */
    public final /* synthetic */ String f94431b;

    /* renamed from: c */
    public final /* synthetic */ C52198iw f94432c;

    public /* synthetic */ C36104v(C36108z zVar, String str, C52198iw iwVar) {
        this.f94430a = zVar;
        this.f94431b = str;
        this.f94432c = iwVar;
    }

    public final C60870cx apply(Object obj) {
        C36108z zVar = this.f94430a;
        String str = this.f94431b;
        C52198iw iwVar = this.f94432c;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            C0320v vVar = (C0320v) optional.get();
            if (C18434a.m35906b(vVar)) {
                return C60856cj.m92900i(C36089g.m64501d(str, C52179id.AUTHENTICATION_EXPIRED, vVar.mo1038f().f1000g));
            }
            Optional a = C18434a.m35905a(iwVar, vVar);
            if (a.isEmpty()) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "No valid rating type."));
            }
            C58976aa aaVar = C58975e.f156826a;
            return ((C36082f) zVar.f94437b.mo27525b()).mo39960a("media.SET_RATING", new C36093k(a), vVar);
        } else if (str == null) {
            return C60856cj.m92900i(C36089g.m64500c());
        } else {
            return C60856cj.m92900i(C36089g.m64498a(str));
        }
    }
}
