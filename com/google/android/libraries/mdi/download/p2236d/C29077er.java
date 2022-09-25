package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28812d;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.er */
/* compiled from: PG */
public final /* synthetic */ class C29077er implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78915a;

    /* renamed from: b */
    public final /* synthetic */ List f78916b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f78917c;

    /* renamed from: d */
    public final /* synthetic */ C29334dr f78918d;

    /* renamed from: e */
    public final /* synthetic */ boolean f78919e;

    public /* synthetic */ C29077er(C29117fe feVar, List list, C29392ep epVar, C29334dr drVar, boolean z) {
        this.f78915a = feVar;
        this.f78916b = list;
        this.f78917c = epVar;
        this.f78918d = drVar;
        this.f78919e = z;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78915a;
        List list = this.f78916b;
        C29392ep epVar = this.f78917c;
        C29334dr drVar = this.f78918d;
        boolean z = this.f78919e;
        C29116fd fdVar = (C29116fd) obj;
        C28812d.m53784d(list, C58836b.f156633a, "Failed to import files, %d attempted", Integer.valueOf(list.size()));
        if (fdVar == C29116fd.DOWNLOADED) {
            C29037d dVar = feVar.f78973b;
            C60125aq aqVar = (C60125aq) C60126ar.f162612j.createBuilder();
            String str = epVar.f79682b;
            aqVar.copyOnWrite();
            C60126ar arVar = (C60126ar) aqVar.instance;
            str.getClass();
            arVar.f162614a = 1 | arVar.f162614a;
            arVar.f162615b = str;
            String str2 = epVar.f79683c;
            aqVar.copyOnWrite();
            C60126ar arVar2 = (C60126ar) aqVar.instance;
            str2.getClass();
            arVar2.f162614a |= 4;
            arVar2.f162617d = str2;
            int i = drVar.f79503e;
            aqVar.copyOnWrite();
            C60126ar arVar3 = (C60126ar) aqVar.instance;
            arVar3.f162614a |= 2;
            arVar3.f162616c = i;
            long j = drVar.f79516r;
            aqVar.copyOnWrite();
            C60126ar arVar4 = (C60126ar) aqVar.instance;
            arVar4.f162614a |= 64;
            arVar4.f162621h = j;
            String str3 = drVar.f79517s;
            aqVar.copyOnWrite();
            C60126ar arVar5 = (C60126ar) aqVar.instance;
            str3.getClass();
            arVar5.f162614a |= 128;
            arVar5.f162622i = str3;
            dVar.mo34546k(3, (C60126ar) aqVar.build());
            return C60866ct.f164955a;
        }
        C29118ff ffVar = feVar.f78975d;
        C29391eo eoVar = (C29391eo) epVar.toBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        epVar2.f79681a |= 8;
        epVar2.f79685e = z;
        return C60922j.m93045h(ffVar.mo34607l((C29392ep) eoVar.build(), drVar), C47810es.m84966f(new C28891bf(feVar)), feVar.f78980i);
    }
}
