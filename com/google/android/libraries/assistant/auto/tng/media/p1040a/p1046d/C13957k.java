package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13920d;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13921e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.k */
/* compiled from: PG */
public final /* synthetic */ class C13957k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13968v f42508a;

    /* renamed from: b */
    public final /* synthetic */ String f42509b;

    /* renamed from: c */
    public final /* synthetic */ String f42510c;

    /* renamed from: d */
    public final /* synthetic */ C13920d f42511d;

    public /* synthetic */ C13957k(C13968v vVar, String str, String str2, C13920d dVar) {
        this.f42508a = vVar;
        this.f42509b = str;
        this.f42510c = str2;
        this.f42511d = dVar;
    }

    public final C60870cx apply(Object obj) {
        C13968v vVar = this.f42508a;
        String str = this.f42509b;
        String str2 = this.f42510c;
        C13920d dVar = this.f42511d;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60856cj.m92900i(C13976a.m30267b(str));
        }
        C0320v vVar2 = (C0320v) optional.get();
        if (C13983h.m30278e(vVar2)) {
            return C60856cj.m92900i(C13976a.m30269d(str, C52179id.AUTHENTICATION_EXPIRED, vVar2.mo1038f().f1000g));
        }
        C58976aa aaVar = C58975e.f156826a;
        vVar.f42536j.mo22352b(C37179a.f97459ae);
        if (!((Boolean) vVar.f42533g.mo17428b()).booleanValue()) {
            return ((C13921e) vVar.f42528b.mo27525b()).mo21349a(str2, dVar, vVar2);
        }
        Objects.requireNonNull(dVar);
        return ((C36082f) vVar.f42529c.mo17428b()).mo39960a(str2, new C13949c(dVar), vVar2);
    }
}
