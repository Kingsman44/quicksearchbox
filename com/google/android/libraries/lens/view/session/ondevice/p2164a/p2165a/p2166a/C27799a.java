package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a;

import android.util.Size;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.lens.ondevice.p2037n.C24788au;
import com.google.android.libraries.lens.ondevice.p2037n.C24790aw;
import com.google.android.libraries.lens.ondevice.p2037n.C24794e;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24813x;
import com.google.android.libraries.lens.ondevice.p2037n.C24814y;
import com.google.android.libraries.lens.view.p2069am.C25346v;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27898o;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.lens.p4701g.C62252ab;
import com.google.lens.p4701g.C62253ac;
import com.google.lens.p4701g.C62277b;
import com.google.lens.p4709l.p4710a.C62616d;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C27799a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C27800b f75847a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f75848b;

    /* renamed from: c */
    public final /* synthetic */ C25346v f75849c;

    /* renamed from: d */
    public final /* synthetic */ Size f75850d;

    /* renamed from: e */
    public final /* synthetic */ int f75851e;

    /* renamed from: f */
    public final /* synthetic */ int f75852f;

    /* renamed from: g */
    public final /* synthetic */ C58833ax f75853g;

    public /* synthetic */ C27799a(C27800b bVar, C58833ax axVar, C25346v vVar, Size size, int i, int i2, C58833ax axVar2) {
        this.f75847a = bVar;
        this.f75848b = axVar;
        this.f75849c = vVar;
        this.f75850d = size;
        this.f75851e = i;
        this.f75852f = i2;
        this.f75853g = axVar2;
    }

    public final Object apply(Object obj) {
        C27800b bVar = this.f75847a;
        C58833ax axVar = this.f75848b;
        C25346v vVar = this.f75849c;
        Size size = this.f75850d;
        int i = this.f75851e;
        int i2 = this.f75852f;
        C58833ax axVar2 = this.f75853g;
        C24794e eVar = (C24794e) C24795f.f67747l.createBuilder();
        int a = C62277b.m94763a(((C62616d) obj).f169064d);
        if (a == 0) {
            a = 1;
        }
        eVar.copyOnWrite();
        C24795f fVar = (C24795f) eVar.instance;
        fVar.f67750b = a - 1;
        fVar.f67749a |= 1;
        C24813x b = C27898o.m51955b(axVar, vVar);
        eVar.copyOnWrite();
        C24795f fVar2 = (C24795f) eVar.instance;
        C24814y yVar = (C24814y) b.build();
        yVar.getClass();
        fVar2.f67751c = yVar;
        fVar2.f67749a |= 2;
        C62252ab abVar = (C62252ab) C62253ac.f168064l.createBuilder();
        int i3 = bVar.f75854a;
        abVar.copyOnWrite();
        C62253ac acVar = (C62253ac) abVar.instance;
        acVar.f168066a |= 2;
        acVar.f168068c = i3;
        abVar.copyOnWrite();
        C62253ac acVar2 = (C62253ac) abVar.instance;
        acVar2.f168066a |= 4;
        acVar2.f168069d = true;
        abVar.copyOnWrite();
        C62253ac acVar3 = (C62253ac) abVar.instance;
        acVar3.f168066a |= 32;
        acVar3.f168070e = 8;
        boolean z = bVar.f75855b;
        abVar.copyOnWrite();
        C62253ac acVar4 = (C62253ac) abVar.instance;
        acVar4.f168066a |= 16384;
        acVar4.f168071f = z;
        int height = size.getHeight();
        abVar.copyOnWrite();
        C62253ac acVar5 = (C62253ac) abVar.instance;
        acVar5.f168066a |= 32768;
        acVar5.f168072g = height;
        int width = size.getWidth();
        abVar.copyOnWrite();
        C62253ac acVar6 = (C62253ac) abVar.instance;
        acVar6.f168066a |= 65536;
        acVar6.f168073h = width;
        abVar.copyOnWrite();
        C62253ac acVar7 = (C62253ac) abVar.instance;
        acVar7.f168066a |= C89885b.HTTP_VALUE;
        acVar7.f168075j = i;
        abVar.copyOnWrite();
        C62253ac acVar8 = (C62253ac) abVar.instance;
        acVar8.f168066a |= C89885b.S3REQUEST_VALUE;
        acVar8.f168074i = i2;
        int i4 = bVar.f75856c;
        abVar.copyOnWrite();
        C62253ac acVar9 = (C62253ac) abVar.instance;
        acVar9.f168066a |= 524288;
        acVar9.f168076k = i4;
        eVar.copyOnWrite();
        C24795f fVar3 = (C24795f) eVar.instance;
        C62253ac acVar10 = (C62253ac) abVar.build();
        acVar10.getClass();
        fVar3.f67757i = acVar10;
        fVar3.f67749a |= 128;
        if (axVar.mo56113h() && axVar2.mo56113h()) {
            C24788au c = C27898o.m51956c((String) axVar.mo56107c(), (String) axVar2.mo56107c());
            eVar.copyOnWrite();
            C24795f fVar4 = (C24795f) eVar.instance;
            C24790aw awVar = (C24790aw) c.build();
            awVar.getClass();
            fVar4.f67755g = awVar;
            fVar4.f67749a |= 32;
        }
        return (C24795f) eVar.build();
    }
}
