package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1248b.p1250b.C16246b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16333ag;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16343aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53308jb;
import com.google.assistant.p3994s.p3995a.C53433ns;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.assistant.p3994s.p3995a.C53436nv;
import com.google.assistant.p3994s.p3995a.C53437nw;
import com.google.assistant.p3994s.p3995a.C53439ny;
import com.google.assistant.p3994s.p3995a.C53446oe;
import com.google.assistant.p3994s.p3995a.C53448og;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.m */
/* compiled from: PG */
public final /* synthetic */ class C16429m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48328a;

    public /* synthetic */ C16429m(C16416ag agVar) {
        this.f48328a = agVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53435nu nuVar;
        long j;
        C16416ag agVar = this.f48328a;
        C16143co coVar = (C16143co) obj;
        C16343aq aqVar = (C16343aq) C16344ar.f48114e.createBuilder();
        C16170n nVar = (C16170n) agVar.f48288c.f47376q.get(coVar.mo22804h());
        if (nVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            nuVar = C16246b.m33289c(coVar);
        } else {
            C16333ag b = nVar.mo22747b();
            Long c = nVar.mo22748c();
            C53433ns nsVar = (C53433ns) C53435nu.f140233n.createBuilder();
            String f = nVar.mo22752f();
            nsVar.copyOnWrite();
            C53435nu nuVar2 = (C53435nu) nsVar.instance;
            f.getClass();
            nuVar2.f140236a |= 1;
            nuVar2.f140239d = f;
            String e = nVar.mo22750e();
            nsVar.copyOnWrite();
            C53435nu nuVar3 = (C53435nu) nsVar.instance;
            e.getClass();
            nuVar3.f140236a |= 2;
            nuVar3.f140240e = e;
            String g = C58837ba.m90858g(nVar.mo22749d());
            nsVar.copyOnWrite();
            C53435nu nuVar4 = (C53435nu) nsVar.instance;
            nuVar4.f140236a |= 8;
            nuVar4.f140242g = g;
            C53436nv nvVar = (C53436nv) C53437nw.f140250i.createBuilder();
            int i = b.f48088m;
            nvVar.copyOnWrite();
            C53437nw nwVar = (C53437nw) nvVar.instance;
            nwVar.f140252a |= 1;
            nwVar.f140253b = i;
            C53446oe oeVar = nVar.mo22747b().f48087l;
            if (oeVar == null) {
                oeVar = C53446oe.f140277b;
            }
            nvVar.copyOnWrite();
            C53437nw nwVar2 = (C53437nw) nvVar.instance;
            oeVar.getClass();
            nwVar2.f140255d = oeVar;
            nwVar2.f140252a |= 4;
            boolean z = nVar.mo22747b().f48077b;
            nvVar.copyOnWrite();
            C53437nw nwVar3 = (C53437nw) nvVar.instance;
            nwVar3.f140252a |= 32;
            nwVar3.f140256e = z;
            C48952az azVar = nVar.mo22747b().f48085j;
            if (azVar == null) {
                azVar = C48952az.f126657c;
            }
            nvVar.copyOnWrite();
            C53437nw nwVar4 = (C53437nw) nvVar.instance;
            azVar.getClass();
            nwVar4.f140254c = azVar;
            nwVar4.f140252a |= 2;
            C16327aa a = C16327aa.m33331a(b.f48080e);
            if (a == null) {
                a = C16327aa.UNKNOWN_ACTION_TYPE;
            }
            int i2 = a.f48064H;
            nvVar.copyOnWrite();
            C53437nw nwVar5 = (C53437nw) nvVar.instance;
            nwVar5.f140252a |= 128;
            nwVar5.f140258g = i2;
            if (c == null) {
                j = 0;
            } else {
                j = c.longValue();
            }
            C63042fg i3 = C62953e.m95484i(j);
            nvVar.copyOnWrite();
            C53437nw nwVar6 = (C53437nw) nvVar.instance;
            i3.getClass();
            nwVar6.f140257f = i3;
            nwVar6.f140252a |= 64;
            C53448og ogVar = nVar.mo22747b().f48086k;
            if (ogVar == null) {
                ogVar = C53448og.f140280h;
            }
            nvVar.copyOnWrite();
            C53437nw nwVar7 = (C53437nw) nvVar.instance;
            ogVar.getClass();
            nwVar7.f140259h = ogVar;
            nwVar7.f140252a |= 256;
            C53437nw nwVar8 = (C53437nw) nvVar.build();
            nsVar.copyOnWrite();
            C53435nu nuVar5 = (C53435nu) nsVar.instance;
            nwVar8.getClass();
            nuVar5.f140247l = nwVar8;
            nuVar5.f140236a |= 1024;
            C16335ai aiVar = b.f48084i;
            if (aiVar == null) {
                aiVar = C16335ai.f48090k;
            }
            C51012dc a2 = C16246b.m33287a(aiVar);
            nsVar.copyOnWrite();
            C53435nu nuVar6 = (C53435nu) nsVar.instance;
            a2.getClass();
            nuVar6.f140244i = a2;
            nuVar6.f140236a |= 32;
            C16335ai aiVar2 = b.f48084i;
            if (aiVar2 == null) {
                aiVar2 = C16335ai.f48090k;
            }
            C51012dc dcVar = aiVar2.f48098g;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            nsVar.copyOnWrite();
            C53435nu nuVar7 = (C53435nu) nsVar.instance;
            dcVar.getClass();
            nuVar7.f140245j = dcVar;
            nuVar7.f140236a |= 64;
            C16335ai aiVar3 = b.f48084i;
            if (aiVar3 == null) {
                aiVar3 = C16335ai.f48090k;
            }
            C53439ny nyVar = aiVar3.f48099h;
            if (nyVar == null) {
                nyVar = C53439ny.f140260c;
            }
            nsVar.copyOnWrite();
            C53435nu nuVar8 = (C53435nu) nsVar.instance;
            nyVar.getClass();
            nuVar8.f140241f = nyVar;
            nuVar8.f140236a |= 4;
            C16335ai aiVar4 = b.f48084i;
            if (aiVar4 == null) {
                aiVar4 = C16335ai.f48090k;
            }
            C53439ny nyVar2 = aiVar4.f48100i;
            if (nyVar2 == null) {
                nyVar2 = C53439ny.f140260c;
            }
            nsVar.copyOnWrite();
            C53435nu nuVar9 = (C53435nu) nsVar.instance;
            nyVar2.getClass();
            nuVar9.f140243h = nyVar2;
            nuVar9.f140236a |= 16;
            C16335ai aiVar5 = b.f48084i;
            if (aiVar5 == null) {
                aiVar5 = C16335ai.f48090k;
            }
            C53308jb b2 = C16246b.m33288b(aiVar5);
            nsVar.copyOnWrite();
            C53435nu nuVar10 = (C53435nu) nsVar.instance;
            b2.getClass();
            nuVar10.f140246k = b2;
            nuVar10.f140236a |= 512;
            C16330ad adVar = b.f48082g;
            if (adVar == null) {
                adVar = C16330ad.f48065f;
            }
            C16246b.m33291e(nsVar, adVar);
            C53433ns nsVar2 = (C53433ns) ((C53435nu) nsVar.build()).toBuilder();
            String h = coVar.mo22804h();
            nsVar2.copyOnWrite();
            C53435nu nuVar11 = (C53435nu) nsVar2.instance;
            h.getClass();
            nuVar11.f140236a |= 1;
            nuVar11.f140239d = h;
            String g2 = coVar.mo22803g();
            nsVar2.copyOnWrite();
            C53435nu nuVar12 = (C53435nu) nsVar2.instance;
            g2.getClass();
            nuVar12.f140236a |= 2;
            nuVar12.f140240e = g2;
            String e2 = coVar.mo22801e();
            nsVar2.copyOnWrite();
            C53435nu nuVar13 = (C53435nu) nsVar2.instance;
            nuVar13.f140236a |= 8;
            nuVar13.f140242g = C58837ba.m90858g(e2);
            C51012dc dcVar2 = nuVar13.f140244i;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            if (dcVar2.f132817c.isEmpty()) {
                C51012dc a3 = C16246b.m33287a(coVar.mo22799c());
                nsVar2.copyOnWrite();
                C53435nu nuVar14 = (C53435nu) nsVar2.instance;
                a3.getClass();
                nuVar14.f140244i = a3;
                nuVar14.f140236a |= 32;
            }
            C51012dc dcVar3 = ((C53435nu) nsVar2.instance).f140245j;
            if (dcVar3 == null) {
                dcVar3 = C51012dc.f132813k;
            }
            if (dcVar3.f132817c.isEmpty()) {
                C51012dc dcVar4 = coVar.mo22799c().f48098g;
                if (dcVar4 == null) {
                    dcVar4 = C51012dc.f132813k;
                }
                nsVar2.copyOnWrite();
                C53435nu nuVar15 = (C53435nu) nsVar2.instance;
                dcVar4.getClass();
                nuVar15.f140245j = dcVar4;
                nuVar15.f140236a |= 64;
            }
            nuVar = (C53435nu) nsVar2.build();
        }
        aqVar.copyOnWrite();
        C16344ar arVar = (C16344ar) aqVar.instance;
        nuVar.getClass();
        arVar.f48117b = nuVar;
        arVar.f48116a |= 1;
        aqVar.copyOnWrite();
        C16344ar arVar2 = (C16344ar) aqVar.instance;
        arVar2.f48118c = 2;
        arVar2.f48116a |= 2;
        return (C16344ar) aqVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
