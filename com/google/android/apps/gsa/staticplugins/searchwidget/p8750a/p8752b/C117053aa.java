package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8752b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p6995aq.C89269l;
import com.google.android.apps.gsa.shared.p6995aq.C89283z;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117096h;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.b.aa */
/* compiled from: PG */
public final class C117053aa extends C23056g {

    /* renamed from: a */
    public C117057ae f324994a;

    /* renamed from: b */
    private final C117096h f324995b;

    public C117053aa(C23052c cVar, C117096h hVar) {
        super(cVar);
        this.f324995b = hVar;
    }

    /* renamed from: N */
    public final void mo28493N(String str, String str2, Parcelable parcelable) {
        if ("CLOSE".equals(str)) {
            C117057ae aeVar = this.f324994a;
            aeVar.getClass();
            aeVar.f324998a.mo103124f();
        } else if ("UPDATE_BAR_RADIUS".equals(str)) {
            mo103122e(((Bundle) parcelable).getInt("BAR_RADIUS"));
        }
    }

    /* renamed from: e */
    public final void mo103122e(int i) {
        C23251a aVar = ((C117075m) this.f324995b).f325050a;
        Integer valueOf = Integer.valueOf(i);
        aVar.mo28730f(valueOf, false);
        C117057ae aeVar = this.f324994a;
        aeVar.getClass();
        ((C117077o) aeVar.f324998a.f325004d.f325094b.f325013a).f325067e.mo28730f(valueOf, false);
        C117060ah ahVar = aeVar.f324998a;
        ((C117076n) ahVar.f325001a).f325061j.mo28730f(Boolean.valueOf(ahVar.f325004d.f325094b.mo103125e()), false);
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        int i = 1;
        C89283z zVar = (C89283z) C23245b.m43557b(protoParcelable, C89283z.f242073n.getParserForType(), C62921ba.m95368a(), true);
        C23251a aVar = ((C117075m) this.f324995b).f325050a;
        zVar.getClass();
        int a = C89269l.m145214a(zVar.f242077c);
        if (a != 0) {
            i = a;
        }
        aVar.mo28730f(Integer.valueOf(i - 1), false);
    }
}
