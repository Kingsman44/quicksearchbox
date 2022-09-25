package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83883aq;
import com.google.android.apps.gsa.opaonboarding.C83884ar;
import com.google.android.apps.gsa.opaonboarding.C83944k;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83924k;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83925l;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109789ai;
import com.google.assistant.p3861at.aef;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.al */
/* compiled from: PG */
public final class C108828al extends C84036z {

    /* renamed from: a */
    private final int f302597a;

    /* renamed from: b */
    private final C68214a f302598b;

    /* renamed from: c */
    private final C68214a f302599c;

    /* renamed from: d */
    private final int f302600d;

    /* renamed from: e */
    private final C91123v f302601e;

    public C108828al(Bundle bundle, C68214a aVar, C68214a aVar2, C91123v vVar) {
        this.f302597a = bundle.getInt("seq_arg_surface", 0);
        this.f302600d = aef.m85735a(bundle.getInt("flow_id", 0));
        this.f302598b = aVar;
        this.f302599c = aVar2;
        this.f302601e = vVar;
    }

    /* renamed from: b */
    private final int m181028b() {
        int i = this.f302597a;
        if (i == 1) {
            return 6;
        }
        if (i != 2) {
            return 1;
        }
        int i2 = this.f302600d;
        if (i2 != 1) {
            return i2;
        }
        return 7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C83956t tVar = (C83956t) this.f302598b.mo27525b();
        C109789ai aiVar = (C109789ai) this.f302599c.mo27525b();
        C83883aq o = C83884ar.m133585o();
        int i = this.f302597a;
        ((C83944k) o).f228637d = i != 1 ? i != 2 ? 1 : 7 : 6;
        o.mo77255j(m181028b());
        if (m181028b() == 32) {
            o.mo77251f(false);
            C83924k kVar = (C83924k) C83925l.f228575d.createBuilder();
            kVar.copyOnWrite();
            C83925l lVar = (C83925l) kVar.instance;
            lVar.f228577a |= 1;
            lVar.f228578b = false;
            kVar.copyOnWrite();
            C83925l lVar2 = (C83925l) kVar.instance;
            lVar2.f228577a = 2 | lVar2.f228577a;
            lVar2.f228579c = true;
            o.mo77247b((C83925l) kVar.build());
        }
        if (this.f302601e.mo85390b()) {
            o.mo77249d(false);
            o.mo77250e(false);
        }
        return C58485gu.m89847o(tVar, aiVar.mo98123a(o.mo77246a()));
    }
}
