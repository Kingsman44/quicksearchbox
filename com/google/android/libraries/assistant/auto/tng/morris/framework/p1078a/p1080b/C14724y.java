package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14242bz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14396hr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15383k;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.y */
/* compiled from: PG */
public final class C14724y implements C14653a {

    /* renamed from: a */
    public final Context f44504a;

    /* renamed from: b */
    public Optional f44505b = Optional.empty();

    /* renamed from: c */
    private final C86124t f44506c;

    /* renamed from: d */
    private final C15383k f44507d;

    public C14724y(Context context, C86124t tVar, C15383k kVar) {
        this.f44504a = context;
        this.f44506c = tVar;
        this.f44507d = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        this.f44505b = Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final boolean mo21623h(C14492lf lfVar, C14324f fVar, C14938e eVar, C14749d dVar) {
        C14396hr hrVar;
        if (lfVar.f43800c == 19) {
            hrVar = (C14396hr) lfVar.f43801d;
        } else {
            hrVar = C14396hr.f43557b;
        }
        int i = hrVar.f43559a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 4 ? 0 : 6 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            this.f44504a.startActivity(intent);
            return false;
        } else if (i3 == 2) {
            this.f44505b = Optional.m71637of(C14496lj.CONFIRM_NOT_DRIVING_TASK);
            return true;
        } else if (i3 != 4) {
            return false;
        } else {
            this.f44505b = Optional.empty();
            return true;
        }
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
        if (!this.f44507d.mo22276b() && this.f44506c.mo79746e(C90051dc.f248814aV)) {
            C0027c a = C0027c.m9a(fVar.f43332a);
            if (a == null) {
                a = C0027c.UNRECOGNIZED;
            }
            if (!a.equals(C0027c.MICRO)) {
                dbVar.mo21541a(C14242bz.HOME_ICON);
            }
        }
        if (!this.f44505b.isPresent()) {
            return;
        }
        if (aVar.mo21708b()) {
            this.f44505b = Optional.empty();
        } else {
            dbVar.mo21542b((C14496lj) this.f44505b.get());
        }
    }

    /* renamed from: j */
    public final void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
        if (this.f44505b.isPresent() && ((C14496lj) this.f44505b.get()).equals(ljVar)) {
            this.f44505b = Optional.empty();
        }
    }
}
