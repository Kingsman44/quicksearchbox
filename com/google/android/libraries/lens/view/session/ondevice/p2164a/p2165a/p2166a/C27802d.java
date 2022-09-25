package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a;

import com.google.android.libraries.lens.ondevice.p2037n.C24794e;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24813x;
import com.google.android.libraries.lens.ondevice.p2037n.C24814y;
import com.google.android.libraries.lens.view.p2069am.C25345u;
import com.google.android.libraries.lens.view.p2069am.C25346v;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27898o;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27830m;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.lens.p4701g.C62277b;
import com.google.lens.p4709l.p4710a.C62616d;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C27802d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f75860a;

    /* renamed from: b */
    public final /* synthetic */ C27830m f75861b;

    public /* synthetic */ C27802d(C58833ax axVar, C27830m mVar) {
        this.f75860a = axVar;
        this.f75861b = mVar;
    }

    public final Object apply(Object obj) {
        C58833ax axVar = this.f75860a;
        C27830m mVar = this.f75861b;
        C24794e eVar = (C24794e) C24795f.f67747l.createBuilder();
        int a = C62277b.m94763a(((C62616d) obj).f169064d);
        if (a == 0) {
            a = 1;
        }
        eVar.copyOnWrite();
        C24795f fVar = (C24795f) eVar.instance;
        fVar.f67750b = a - 1;
        fVar.f67749a |= 1;
        C25345u uVar = (C25345u) C25346v.f68994b.createBuilder();
        uVar.mo30374a(mVar.mo33322b());
        C24813x b = C27898o.m51955b(axVar, (C25346v) uVar.build());
        eVar.copyOnWrite();
        C24795f fVar2 = (C24795f) eVar.instance;
        C24814y yVar = (C24814y) b.build();
        yVar.getClass();
        fVar2.f67751c = yVar;
        fVar2.f67749a |= 2;
        return (C24795f) eVar.build();
    }
}
