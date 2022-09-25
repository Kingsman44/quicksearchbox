package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24439aa;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24441ac;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24442ad;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.p1657ba.p1664c.p1665a.C19645b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.q.aq */
/* compiled from: PG */
public final /* synthetic */ class C27596aq implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C27608bb f75406a;

    /* renamed from: b */
    public final /* synthetic */ List f75407b;

    public /* synthetic */ C27596aq(C27608bb bbVar, List list) {
        this.f75406a = bbVar;
        this.f75407b = list;
    }

    public final Object call() {
        C58833ax axVar;
        C27608bb bbVar = this.f75406a;
        List<C24465t> list = this.f75407b;
        ArrayList arrayList = new ArrayList();
        C27652z zVar = bbVar.f75434j;
        if (C27652z.f75505b) {
            arrayList = new ArrayList();
            for (C24465t tVar : list) {
                if (zVar.f75507d.mo31240b().values().contains(tVar.f66967b)) {
                    String str = zVar.f75506c.getApplicationInfo().dataDir + File.separator + "model_dir";
                    String concat = tVar.f66969d.concat("_trans");
                    File file = new File(str);
                    if (!file.exists() || !file.isDirectory()) {
                        String str2 = tVar.f66967b;
                        axVar = C58836b.f156633a;
                    } else {
                        C24439aa aaVar = (C24439aa) C24440ab.f66917g.createBuilder();
                        aaVar.copyOnWrite();
                        C24440ab abVar = (C24440ab) aaVar.instance;
                        tVar.getClass();
                        abVar.f66920b = tVar;
                        abVar.f66919a |= 1;
                        C24446ah ahVar = C24446ah.STATUS_DOWNLOADED;
                        aaVar.copyOnWrite();
                        C24440ab abVar2 = (C24440ab) aaVar.instance;
                        abVar2.f66922d = ahVar.f66939g;
                        abVar2.f66919a |= 2;
                        aaVar.copyOnWrite();
                        C24440ab abVar3 = (C24440ab) aaVar.instance;
                        abVar3.f66924f = 0;
                        abVar3.f66919a |= 8;
                        C24441ac acVar = (C24441ac) C24442ad.f66925d.createBuilder();
                        acVar.copyOnWrite();
                        C24442ad adVar = (C24442ad) acVar.instance;
                        concat.getClass();
                        adVar.f66927a |= 1;
                        adVar.f66928b = concat;
                        acVar.copyOnWrite();
                        C24442ad adVar2 = (C24442ad) acVar.instance;
                        adVar2.f66927a |= 2;
                        adVar2.f66929c = str;
                        aaVar.mo29894a((C24442ad) acVar.build());
                        String str3 = tVar.f66967b;
                        axVar = C58833ax.m90834k((C24440ab) aaVar.build());
                    }
                } else {
                    String str4 = tVar.f66967b;
                    try {
                        String[] list2 = zVar.f75506c.getAssets().list(str4);
                        if (list2 != null && list2.length > 0) {
                            C24439aa aaVar2 = (C24439aa) C24440ab.f66917g.createBuilder();
                            aaVar2.copyOnWrite();
                            C24440ab abVar4 = (C24440ab) aaVar2.instance;
                            tVar.getClass();
                            abVar4.f66920b = tVar;
                            abVar4.f66919a |= 1;
                            C24446ah ahVar2 = C24446ah.STATUS_DOWNLOADED;
                            aaVar2.copyOnWrite();
                            C24440ab abVar5 = (C24440ab) aaVar2.instance;
                            abVar5.f66922d = ahVar2.f66939g;
                            abVar5.f66919a |= 2;
                            aaVar2.copyOnWrite();
                            C24440ab abVar6 = (C24440ab) aaVar2.instance;
                            abVar6.f66924f = 0;
                            abVar6.f66919a |= 8;
                            String a = C19645b.m37474a(zVar.f75506c, str4);
                            C24441ac acVar2 = (C24441ac) C24442ad.f66925d.createBuilder();
                            acVar2.copyOnWrite();
                            C24442ad adVar3 = (C24442ad) acVar2.instance;
                            str4.getClass();
                            adVar3.f66927a |= 1;
                            adVar3.f66928b = str4;
                            acVar2.copyOnWrite();
                            C24442ad adVar4 = (C24442ad) acVar2.instance;
                            adVar4.f66927a |= 2;
                            adVar4.f66929c = a;
                            aaVar2.mo29894a((C24442ad) acVar2.build());
                            axVar = C58833ax.m90834k((C24440ab) aaVar2.build());
                        }
                    } catch (IOException e) {
                        ((C58970a) ((C58970a) ((C58970a) C27652z.f75504a.mo56225c()).mo56382g(e)).mo56372aa(49313)).mo56386p("copyBundledModelFromAssets threw exception");
                    }
                    axVar = C58836b.f156633a;
                }
                if (axVar.mo56113h()) {
                    arrayList.add((C24440ab) axVar.mo56107c());
                }
            }
            arrayList.isEmpty();
        }
        arrayList.size();
        return arrayList;
    }
}
