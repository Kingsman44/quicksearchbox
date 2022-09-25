package com.google.android.apps.gsa.search.core.udc;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60652xv;
import com.google.common.p4552o.C60653xw;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.udc.af */
/* compiled from: PG */
final class C87202af implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ Account f235609a;

    /* renamed from: b */
    final /* synthetic */ C87204ah f235610b;

    public C87202af(C87204ah ahVar, Account account) {
        this.f235610b = ahVar;
        this.f235609a = account;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean z;
        C60548tz tzVar;
        int a;
        C87197aa aaVar = (C87197aa) obj;
        aaVar.getClass();
        C87204ah ahVar = this.f235610b;
        Account account = this.f235609a;
        Map b = ahVar.mo80836b(account);
        Map c = C87204ah.m141022c(aaVar);
        synchronized (ahVar.f235614d) {
            C86337q b2 = ahVar.f235613c.mo80076b();
            b2.mo80068c("udc_cached_settings_" + account.name, aaVar.toByteArray());
            b2.apply();
            ahVar.f235614d.put(account, c);
        }
        C56116b[] bVarArr = C87204ah.f235612b;
        int length = bVarArr.length;
        ArrayList arrayList = null;
        for (int i = 0; i < 8; i++) {
            C56116b bVar = bVarArr[i];
            C87229y yVar = (C87229y) c.get(bVar);
            if (yVar == null || (a = C87228x.m141058a(yVar.f235653c)) == 0 || a == 1) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(bVar);
            }
        }
        C56116b[] bVarArr2 = C87204ah.f235612b;
        int length2 = bVarArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= 8) {
                z = false;
                break;
            }
            C56116b bVar2 = bVarArr2[i2];
            C87229y yVar2 = (C87229y) b.get(bVar2);
            C87229y yVar3 = (C87229y) c.get(bVar2);
            if (yVar2 != null || yVar3 != null) {
                if (yVar2 == null || yVar3 == null) {
                    break;
                }
                int a2 = C87228x.m141058a(yVar2.f235653c);
                if (a2 == 0) {
                    a2 = 1;
                }
                int a3 = C87228x.m141058a(yVar3.f235653c);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (a2 != a3) {
                    break;
                }
                int a4 = C87226v.m141057a(yVar2.f235654d);
                if (a4 == 0) {
                    a4 = 1;
                }
                int a5 = C87226v.m141057a(yVar3.f235654d);
                if (a5 == 0) {
                    a5 = 1;
                }
                if (a4 != a5) {
                    break;
                }
            }
            i2++;
        }
        z = true;
        if (arrayList == null) {
            tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 591;
            if (z) {
                C60652xv xvVar = (C60652xv) C60653xw.f164546e.createBuilder();
                xvVar.copyOnWrite();
                C60653xw xwVar = (C60653xw) xvVar.instance;
                xwVar.f164548a |= 1;
                xwVar.f164549b = true;
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                C60653xw xwVar2 = (C60653xw) xvVar.build();
                xwVar2.getClass();
                ufVar2.f164100aG = xwVar2;
                ufVar2.f164250e |= 8192;
            }
        } else {
            C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar2.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar2.instance;
            ufVar3.f164093a |= 2;
            ufVar3.f164258m = 590;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(Integer.valueOf(((C56116b) arrayList.get(i3)).f149511l));
            }
            C60652xv xvVar2 = (C60652xv) C60653xw.f164546e.createBuilder();
            xvVar2.copyOnWrite();
            C60653xw xwVar3 = (C60653xw) xvVar2.instance;
            C62961ch chVar = xwVar3.f164551d;
            if (!chVar.mo58948c()) {
                xwVar3.f164551d = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) arrayList2, (List) xwVar3.f164551d);
            if (z) {
                xvVar2.copyOnWrite();
                C60653xw xwVar4 = (C60653xw) xvVar2.instance;
                xwVar4.f164548a |= 1;
                xwVar4.f164549b = true;
            }
            tzVar2.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar2.instance;
            C60653xw xwVar5 = (C60653xw) xvVar2.build();
            xwVar5.getClass();
            ufVar4.f164100aG = xwVar5;
            ufVar4.f164250e |= 8192;
            tzVar = tzVar2;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        return c;
    }
}
