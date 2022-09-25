package com.google.android.apps.search.googleapp.launcher.p10341b.p10342a;

import com.google.android.apps.search.googleapp.launcher.p10341b.C136456d;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136486h;
import com.google.common.p4552o.C59706cu;
import com.google.common.p4552o.C59708cw;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.a.d */
/* compiled from: PG */
public final class C136428d {

    /* renamed from: a */
    public final UUID f371404a;

    /* renamed from: b */
    public final C59710cy f371405b = ((C59710cy) C59711cz.f160207r.createBuilder());

    /* renamed from: c */
    public final List f371406c = new ArrayList();

    /* renamed from: d */
    public final C59706cu f371407d = ((C59706cu) C59708cw.f160195j.createBuilder());

    public C136428d(UUID uuid) {
        this.f371404a = uuid;
    }

    /* renamed from: a */
    public final void mo113016a(C136456d dVar) {
        int i;
        C136486h hVar = (C136486h) dVar;
        int i2 = hVar.f371591b - 1;
        if (i2 != 0) {
            i = 3;
            if (i2 != 1) {
                i = i2 != 3 ? 1 : 4;
            }
        } else {
            i = 2;
        }
        C59706cu cuVar = this.f371407d;
        cuVar.copyOnWrite();
        C59708cw cwVar = (C59708cw) cuVar.instance;
        C59708cw cwVar2 = C59708cw.f160195j;
        cwVar.f160199c = i - 1;
        cwVar.f160197a = 4 | cwVar.f160197a;
        C59706cu cuVar2 = this.f371407d;
        int i3 = hVar.f371590a;
        cuVar2.copyOnWrite();
        C59708cw cwVar3 = (C59708cw) cuVar2.instance;
        cwVar3.f160197a |= 8;
        cwVar3.f160200d = i3;
    }
}
