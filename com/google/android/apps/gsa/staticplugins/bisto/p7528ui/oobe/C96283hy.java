package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.hy */
/* compiled from: PG */
public final class C96283hy extends C83870ad {

    /* renamed from: e */
    private static final C59071e f269448e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.hy");

    /* renamed from: a */
    public final String f269449a;

    /* renamed from: b */
    public final C68214a f269450b;

    /* renamed from: c */
    public final C68214a f269451c;

    /* renamed from: d */
    public BluetoothDevice f269452d;

    /* renamed from: f */
    private final ArrayDeque f269453f = new ArrayDeque();

    /* renamed from: g */
    private final C96260hb f269454g;

    /* renamed from: h */
    private boolean f269455h;

    public C96283hy(C96094ay ayVar, C68214a aVar, C68214a aVar2, C96260hb hbVar) {
        this.f269450b = aVar;
        this.f269451c = aVar2;
        this.f269454g = hbVar;
        this.f269449a = ayVar.f269039a;
    }

    /* renamed from: a */
    public final void mo90046a(int i) {
        if (i == 0) {
            this.f269453f.add(C83875ai.m133541f(new C96255gx(), new Bundle(), new C96277hs(this)));
        } else if (i != 1) {
            if (i == 2) {
                this.f269453f.add(C83875ai.m133541f(new C96276hr(), new Bundle(), new C96279hu(this)));
            } else if (i == 3) {
                this.f269453f.add(C83875ai.m133541f(new C96273ho(), new Bundle(), new C96280hv(this)));
            } else if (i == 4) {
                this.f269453f.add(C83875ai.m133541f(new C96248gq(), new Bundle(), new C96281hw(this)));
            } else if (i == 5) {
                this.f269453f.add(C83875ai.m133541f(new C96263he(), new Bundle(), new C96282hx(this)));
            } else if (i == 7) {
                this.f269453f.add(this.f269454g);
            }
        } else if (this.f269452d == null) {
            C59104x c = f269448e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HerbieSequence");
            ((C59052c) ((C59052c) c).mo56372aa(17046)).mo56386p("Null device. Should never happen");
            mo90046a(8);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("bt_name_tag", this.f269452d.getName());
            this.f269453f.add(C83875ai.m133541f(new C96266hh(), bundle, new C96278ht(this)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        C124548d b;
        if (!this.f269455h) {
            this.f269455h = true;
            if (!(this.f269449a == null || (b = ((C89492cd) this.f269450b.mo27525b()).mo83401b(this.f269449a)) == null || b.mo106513k() != C124719q.CAR_ACCESSORY)) {
                ((C89492cd) this.f269450b.mo27525b()).mo83378T(this.f269449a, true);
                mo90046a(0);
            }
        }
        return !this.f269453f.isEmpty() ? C58833ax.m90834k((C83956t) this.f269453f.remove()) : C58836b.f156633a;
    }
}
