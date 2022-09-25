package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import com.google.android.apps.gsa.nga.engine.p6032h.p6033a.C76145b;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.b */
/* compiled from: PG */
public final /* synthetic */ class C76851b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76590bg f212261a;

    /* renamed from: b */
    public final /* synthetic */ Optional f212262b;

    public /* synthetic */ C76851b(C76590bg bgVar, Optional optional) {
        this.f212261a = bgVar;
        this.f212262b = optional;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76590bg bgVar = this.f212261a;
        Optional optional = this.f212262b;
        C58485gu guVar = (C58485gu) obj;
        C58974d dVar = C76857h.f212270a;
        String str = (String) optional.get();
        if (guVar.isEmpty()) {
            return C76857h.m123471e(bgVar, Optional.m71637of(str), C76856g.NAME);
        }
        C76145b bVar = (C76145b) guVar.get(0);
        if (!bVar.mo72085a().isEmpty()) {
            return C76857h.m123471e(bgVar, Optional.m71637of((String) bVar.mo72085a().get(0)), C76856g.EMAIL_ADDRESS);
        }
        ((C58970a) ((C58970a) C76857h.f212270a.mo56226d()).mo56372aa(3764)).mo56386p("No email address for contact.");
        return C76857h.m123471e(bgVar, Optional.m71637of(str), C76856g.NAME);
    }
}
