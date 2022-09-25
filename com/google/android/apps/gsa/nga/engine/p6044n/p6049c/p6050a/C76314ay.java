package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80344cl;
import com.google.android.apps.gsa.nga.shared.p6307af.C80596g;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C76314ay implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C76315az f211377a;

    /* renamed from: b */
    public final /* synthetic */ C80295aq f211378b;

    /* renamed from: c */
    public final /* synthetic */ C65475b f211379c;

    public /* synthetic */ C76314ay(C76315az azVar, C80295aq aqVar, C65475b bVar) {
        this.f211377a = azVar;
        this.f211378b = aqVar;
        this.f211379c = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C80344cl clVar;
        C80344cl clVar2;
        C76315az azVar = this.f211377a;
        C80295aq aqVar = this.f211378b;
        C65475b bVar = this.f211379c;
        if (aqVar.f220359a == 22) {
            clVar = (C80344cl) aqVar.f220360b;
        } else {
            clVar = C80344cl.f220460d;
        }
        C80590x a = C80590x.m128211a(clVar.f220463b);
        if (a == null) {
            a = C80590x.UNRECOGNIZED;
        }
        C80596g gVar = (C80596g) ((Map) azVar.f211381b.mo27525b()).get(a);
        if (gVar != null) {
            if (aqVar.f220359a == 22) {
                clVar2 = (C80344cl) aqVar.f220360b;
            } else {
                clVar2 = C80344cl.f220460d;
            }
            C83320io ioVar = bVar.f177980a;
            if (ioVar == null) {
                ioVar = C83320io.f227132d;
            }
            return gVar.mo71389b(a, clVar2, ioVar);
        }
        ((C58970a) ((C58970a) C76315az.f211380a.mo56225c()).mo56372aa(3531)).mo56387q("Couldn't find click handler for suggestion type %d", a.getNumber());
        int number = a.getNumber();
        return C60856cj.m92899h(new RuntimeException("Missing suggestion handler for " + number));
    }
}
