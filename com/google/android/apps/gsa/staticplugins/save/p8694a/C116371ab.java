package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116423b;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57563ag;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57565ai;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57582az;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57588be;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57591bh;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57602bs;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57626cp;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57636cz;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.ab */
/* compiled from: PG */
public final class C116371ab {
    /* renamed from: a */
    public static C116424c m193010a(C57578av avVar) {
        String str;
        C57566aj ajVar = avVar.f153824a;
        if (ajVar == null) {
            ajVar = C57566aj.f153791e;
        }
        String str2 = ajVar.f153793a;
        int b = C57602bs.m88505b(avVar.f153825b);
        boolean z = true;
        if (b == 0) {
            b = 1;
        }
        C116423b bVar = (C116423b) C116424c.f322815o.createBuilder();
        bVar.copyOnWrite();
        C116424c cVar = (C116424c) bVar.instance;
        str2.getClass();
        cVar.f322817a = 1;
        cVar.f322818b = str2;
        String str3 = avVar.f153828e;
        bVar.copyOnWrite();
        str3.getClass();
        ((C116424c) bVar.instance).f322820d = str3;
        bVar.copyOnWrite();
        str2.getClass();
        ((C116424c) bVar.instance).f322819c = str2;
        C57563ag a = C57563ag.m88496a(ajVar.f153794b);
        if (a == null) {
            a = C57563ag.UNRECOGNIZED;
        }
        bVar.copyOnWrite();
        ((C116424c) bVar.instance).f322821e = a.getNumber();
        C62963cj<C57665z> cjVar = new C62963cj(ajVar.f153795c, C57566aj.f153790d);
        bVar.copyOnWrite();
        C116424c cVar2 = (C116424c) bVar.instance;
        C62961ch chVar = cVar2.f322822f;
        if (!chVar.mo58948c()) {
            cVar2.f322822f = C62942bv.mutableCopy(chVar);
        }
        for (C57665z number : cjVar) {
            cVar2.f322822f.mo58916g(number.getNumber());
        }
        bVar.copyOnWrite();
        ((C116424c) bVar.instance).f322826k = C57602bs.m88504a(b);
        C57626cp cpVar = avVar.f153830g;
        if (cpVar == null) {
            cpVar = C57626cp.f153922b;
        }
        bVar.copyOnWrite();
        cpVar.getClass();
        ((C116424c) bVar.instance).f322828m = cpVar;
        bVar.copyOnWrite();
        ((C116424c) bVar.instance).f322823h = false;
        bVar.copyOnWrite();
        ((C116424c) bVar.instance).f322824i = false;
        if (b == 4) {
            bVar.copyOnWrite();
            ((C116424c) bVar.instance).f322823h = true;
            b = 4;
        }
        C57636cz czVar = avVar.f153827d;
        if (czVar != null && !czVar.f153935a.isEmpty()) {
            C57636cz czVar2 = avVar.f153827d;
            if (czVar2 == null) {
                czVar2 = C57636cz.f153933b;
            }
            String str4 = czVar2.f153935a;
            bVar.copyOnWrite();
            str4.getClass();
            ((C116424c) bVar.instance).f322829n = str4;
        }
        C57582az azVar = avVar.f153826c;
        if (azVar != null) {
            bVar.copyOnWrite();
            ((C116424c) bVar.instance).f322827l = azVar;
            if (b == 4 && (str = (String) Collections.unmodifiableMap(azVar.f153839c).get(3)) != null) {
                bVar.copyOnWrite();
                ((C116424c) bVar.instance).f322825j = str;
            }
            int a2 = C57588be.m88502a(azVar.f153837a);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 == 4 || a2 == 5) {
                bVar.copyOnWrite();
                ((C116424c) bVar.instance).f322823h = true;
                int a3 = C57591bh.m88503a(azVar.f153838b);
                if (a3 == 0 || a3 != 4) {
                    z = false;
                }
                bVar.copyOnWrite();
                ((C116424c) bVar.instance).f322824i = z;
            }
        }
        return (C116424c) bVar.build();
    }

    /* renamed from: b */
    public static C57566aj m193011b(C116424c cVar) {
        int i = cVar.f322817a;
        String str = BuildConfig.FLAVOR;
        if (!(i == 1 ? (String) cVar.f322818b : str).isEmpty()) {
            C57565ai aiVar = (C57565ai) C57566aj.f153791e.createBuilder();
            if (cVar.f322817a == 1) {
                str = (String) cVar.f322818b;
            }
            aiVar.copyOnWrite();
            str.getClass();
            ((C57566aj) aiVar.instance).f153793a = str;
            aiVar.mo54516a(new C62963cj(cVar.f322822f, C116424c.f322814g));
            return (C57566aj) aiVar.build();
        }
        C57565ai aiVar2 = (C57565ai) C57566aj.f153791e.createBuilder();
        C57563ag a = C57563ag.m88496a(cVar.f322821e);
        if (a == null) {
            a = C57563ag.UNRECOGNIZED;
        }
        aiVar2.copyOnWrite();
        ((C57566aj) aiVar2.instance).f153794b = a.getNumber();
        aiVar2.mo54516a(new C62963cj(cVar.f322822f, C116424c.f322814g));
        return (C57566aj) aiVar2.build();
    }
}
