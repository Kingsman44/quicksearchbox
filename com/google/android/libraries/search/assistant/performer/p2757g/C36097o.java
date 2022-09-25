package com.google.android.libraries.search.assistant.performer.p2757g;

import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52194is;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.o */
/* compiled from: PG */
public final /* synthetic */ class C36097o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36108z f94416a;

    /* renamed from: b */
    public final /* synthetic */ String f94417b;

    /* renamed from: c */
    public final /* synthetic */ C52194is f94418c;

    public /* synthetic */ C36097o(C36108z zVar, String str, C52194is isVar) {
        this.f94416a = zVar;
        this.f94417b = str;
        this.f94418c = isVar;
    }

    public final C60870cx apply(Object obj) {
        C36108z zVar = this.f94416a;
        String str = this.f94417b;
        C52194is isVar = this.f94418c;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            C0320v vVar = (C0320v) optional.get();
            if (C18434a.m35906b(vVar)) {
                return C60856cj.m92900i(C36089g.m64501d(str, C52179id.AUTHENTICATION_EXPIRED, vVar.mo1038f().f1000g));
            }
            if ((isVar.f136990a & 4) != 0) {
                float f = vVar.mo1038f().f997d;
                double d = isVar.f136993d;
            } else {
                double d2 = isVar.f136992c;
            }
            C58976aa aaVar = C58975e.f156826a;
            return ((C36082f) zVar.f94437b.mo27525b()).mo39960a("media.SET_PLAYBACK_RATE", C36105w.f94433a, vVar);
        } else if (str == null) {
            return C60856cj.m92900i(C36089g.m64500c());
        } else {
            return C60856cj.m92900i(C36089g.m64498a(str));
        }
    }
}
