package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14391hm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.u */
/* compiled from: PG */
public final class C14720u implements C14653a {

    /* renamed from: a */
    public static final C59071e f44487a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.u");

    /* renamed from: b */
    public final C86124t f44488b;

    /* renamed from: c */
    public boolean f44489c = true;

    /* renamed from: d */
    public boolean f44490d = false;

    public C14720u(C86124t tVar) {
        this.f44488b = tVar;
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
        this.f44489c = true;
        this.f44490d = false;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final boolean mo21623h(C14492lf lfVar, C14324f fVar, C14938e eVar, C14749d dVar) {
        C14391hm hmVar;
        C14219bc bcVar;
        if (lfVar.f43800c == 22) {
            hmVar = (C14391hm) lfVar.f43801d;
        } else {
            hmVar = C14391hm.f43529d;
        }
        int i = hmVar.f43531a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 2;
        if (i3 == 1) {
            this.f44490d = hmVar.f43533c;
            this.f44489c = hmVar.f43532b;
            if (!this.f44488b.mo79746e(C90051dc.f248777L) || this.f44490d) {
                C0027c a = C0027c.m9a(fVar.f43332a);
                if (a == null) {
                    a = C0027c.UNRECOGNIZED;
                }
                if (!a.equals(C0027c.MICRO)) {
                    dVar.mo21716c(C14984b.m31519q(this.f44489c));
                }
            } else {
                C59104x b = f44487a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "Morris.DndCtrl");
                ((C59052c) ((C59052c) b).mo56372aa(45354)).mo56386p("DND while driving disabled in user settings, not changing policy.");
            }
        } else if (i3 == 2) {
            this.f44490d = hmVar.f43533c;
            this.f44489c = hmVar.f43532b;
            if (this.f44488b.mo79746e(C90051dc.f248777L)) {
                if (this.f44490d) {
                    bcVar = C14984b.m31519q(this.f44489c);
                } else {
                    bcVar = C14984b.m31513k();
                }
                dVar.mo21716c(bcVar);
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
        if (aVar.mo21708b() && !aVar.mo21710d() && !aVar.mo21709c()) {
            C0027c a = C0027c.m9a(fVar.f43332a);
            if (a == null) {
                a = C0027c.UNRECOGNIZED;
            }
            if (a.equals(C0027c.MICRO)) {
                dVar.mo21716c(C14984b.m31513k());
            } else if (!this.f44488b.mo79746e(C90051dc.f248777L) || this.f44490d) {
                dVar.mo21716c(C14984b.m31519q(this.f44489c));
            }
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
    }
}
