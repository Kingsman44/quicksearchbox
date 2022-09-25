package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109778j;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.assistant.p3861at.C50337ti;
import com.google.assistant.p3861at.C50365uj;
import com.google.assistant.p3861at.C50366uk;
import com.google.assistant.p3861at.C50369un;
import com.google.assistant.p3861at.C50371up;
import com.google.assistant.p3861at.C50372uq;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3861at.acz;
import com.google.assistant.p3861at.adr;
import com.google.assistant.p3861at.aef;
import com.google.assistant.p3861at.aem;
import com.google.assistant.p3861at.aeo;
import com.google.assistant.p3861at.aep;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.av */
/* compiled from: PG */
public final /* synthetic */ class C109802av implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C109805ay f305964a;

    /* renamed from: b */
    public final /* synthetic */ C109778j f305965b;

    public /* synthetic */ C109802av(C109805ay ayVar, C109778j jVar) {
        this.f305964a = ayVar;
        this.f305965b = jVar;
    }

    public final void run() {
        C109805ay ayVar = this.f305964a;
        C109778j jVar = this.f305965b;
        l lVar = ayVar.f305968c;
        Account account = (Account) ayVar.f305967b.mo77278a().mo56107c();
        acw acw = (acw) acx.f128971H.createBuilder();
        int i = 1;
        if ((jVar.f305891a & 2) != 0) {
            C50365uj ujVar = (C50365uj) C50366uk.f131111d.createBuilder();
            int a = aef.m85735a(jVar.f305892b);
            if (a == 0) {
                a = 1;
            }
            ujVar.copyOnWrite();
            C50366uk ukVar = (C50366uk) ujVar.instance;
            ukVar.f131114b = a - 1;
            ukVar.f131113a |= 1;
            C63088z zVar = jVar.f305893c;
            ujVar.copyOnWrite();
            C50366uk ukVar2 = (C50366uk) ujVar.instance;
            zVar.getClass();
            ukVar2.f131113a |= 2;
            ukVar2.f131115c = zVar;
            acw.copyOnWrite();
            acx acx = (acx) acw.instance;
            C50366uk ukVar3 = (C50366uk) ujVar.build();
            ukVar3.getClass();
            acx.f129001r = ukVar3;
            acx.f128984a |= 1048576;
        }
        acz acz = (acz) C90877ak.m148472f(lVar.d(account, (acx) acw.build(), (long) ((int) ayVar.f305971f.mo79743a(C90014bt.f247515ic)), TimeUnit.MILLISECONDS, ayVar.getClass().getSimpleName()));
        int i2 = acz.f129012a;
        String str = "none";
        if ((i2 & 128) != 0) {
            aep aep = acz.f129017f;
            if (aep == null) {
                aep = aep.f129118e;
            }
            int i3 = aep.f129121b;
            int a2 = aeo.m85737a(i3);
            if (a2 == 0 || a2 != 2) {
                int a3 = aeo.m85737a(i3);
                if (a3 != 0) {
                    i = a3;
                }
                int i4 = i - 1;
                if ((aep.f129120a & 4) != 0) {
                    adr adr = aep.f129123d;
                    if (adr == null) {
                        adr = adr.f129068b;
                    }
                    str = adr.f129070a;
                }
                throw new C109804ax(i4, str);
            } else if ((aep.f129120a & 2) != 0) {
                aem aem = aep.f129122c;
                if (aem == null) {
                    aem = aem.f129110e;
                }
                int a4 = ayVar.f305969d.mo98171a(aem);
                ((C59052c) ((C59052c) C109805ay.f305966a.mo56224b()).mo56372aa(25280)).mo56387q("cmsUpdateStatus = %d", a4);
                if (a4 != 0) {
                    throw new C109803aw(a4);
                }
            }
        } else if ((i2 & 1024) != 0) {
            C50372uq uqVar = acz.f129019h;
            if (uqVar == null) {
                uqVar = C50372uq.f131121e;
            }
            int i5 = uqVar.f131124b;
            int a5 = C50371up.m85817a(i5);
            if (a5 != 0 && a5 == 2) {
                C50369un unVar = uqVar.f131125c;
                if (unVar == null) {
                    unVar = C50369un.f131116c;
                }
                if ((unVar.f131118a & 1) != 0) {
                    C50369un unVar2 = uqVar.f131125c;
                    if (unVar2 == null) {
                        unVar2 = C50369un.f131116c;
                    }
                    aem aem2 = unVar2.f131119b;
                    if (aem2 == null) {
                        aem2 = aem.f129110e;
                    }
                    int a6 = ayVar.f305969d.mo98171a(aem2);
                    ((C59052c) ((C59052c) C109805ay.f305966a.mo56224b()).mo56372aa(25279)).mo56387q("cmsUpdateStatus = %d", a6);
                    if (a6 != 0) {
                        throw new C109803aw(a6);
                    }
                }
            } else {
                int a7 = C50371up.m85817a(i5);
                if (a7 != 0) {
                    i = a7;
                }
                int i6 = i - 1;
                if ((uqVar.f131123a & 4) != 0) {
                    C50337ti tiVar = uqVar.f131126d;
                    if (tiVar == null) {
                        tiVar = C50337ti.f131008b;
                    }
                    str = tiVar.f131010a;
                }
                throw new C109804ax(i6, str);
            }
        }
        Account account2 = (Account) ayVar.f305967b.mo77278a().mo56107c();
        if ((jVar.f305891a & 2) != 0) {
            ayVar.f305970e.mo98125g(account2, jVar.f305894d);
        }
    }
}
