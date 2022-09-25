package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13921e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52194is;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.d */
/* compiled from: PG */
public final /* synthetic */ class C13950d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13968v f42496a;

    /* renamed from: b */
    public final /* synthetic */ String f42497b;

    /* renamed from: c */
    public final /* synthetic */ C52194is f42498c;

    public /* synthetic */ C13950d(C13968v vVar, String str, C52194is isVar) {
        this.f42496a = vVar;
        this.f42497b = str;
        this.f42498c = isVar;
    }

    public final C60870cx apply(Object obj) {
        C13968v vVar = this.f42496a;
        String str = this.f42497b;
        C52194is isVar = this.f42498c;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60856cj.m92900i(C13976a.m30267b(str));
        }
        C0320v vVar2 = (C0320v) optional.get();
        if (C13983h.m30278e(vVar2)) {
            return C60856cj.m92900i(C13976a.m30269d(str, C52179id.AUTHENTICATION_EXPIRED, vVar2.mo1038f().f1000g));
        }
        if ((isVar.f136990a & 4) != 0) {
            float f = vVar2.mo1038f().f997d;
            double d = isVar.f136993d;
        } else {
            double d2 = isVar.f136992c;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (((Boolean) vVar.f42533g.mo17428b()).booleanValue()) {
            return ((C36082f) vVar.f42529c.mo17428b()).mo39960a("media.SET_PLAYBACK_RATE", C13958l.f42512a, vVar2);
        }
        return ((C13921e) vVar.f42528b.mo27525b()).mo21349a("media.SET_PLAYBACK_RATE", C13960n.f42514a, vVar2);
    }
}
