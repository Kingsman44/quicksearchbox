package com.google.android.libraries.search.assistant.performer.p2757g;

import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36081e;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.i */
/* compiled from: PG */
public final /* synthetic */ class C36091i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36108z f94407a;

    /* renamed from: b */
    public final /* synthetic */ String f94408b;

    /* renamed from: c */
    public final /* synthetic */ String f94409c;

    /* renamed from: d */
    public final /* synthetic */ C36081e f94410d;

    public /* synthetic */ C36091i(C36108z zVar, String str, String str2, C36081e eVar) {
        this.f94407a = zVar;
        this.f94408b = str;
        this.f94409c = str2;
        this.f94410d = eVar;
    }

    public final C60870cx apply(Object obj) {
        C36108z zVar = this.f94407a;
        String str = this.f94408b;
        String str2 = this.f94409c;
        C36081e eVar = this.f94410d;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            C0320v vVar = (C0320v) optional.get();
            if (C18434a.m35906b(vVar)) {
                return C60856cj.m92900i(C36089g.m64501d(str, C52179id.AUTHENTICATION_EXPIRED, vVar.mo1038f().f1000g));
            }
            C58976aa aaVar = C58975e.f156826a;
            return ((C36082f) zVar.f94437b.mo27525b()).mo39960a(str2, eVar, vVar);
        } else if (str == null) {
            return C60856cj.m92900i(C36089g.m64500c());
        } else {
            return C60856cj.m92900i(C36089g.m64498a(str));
        }
    }
}
