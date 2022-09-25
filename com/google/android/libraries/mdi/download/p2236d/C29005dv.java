package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28812d;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.dv */
/* compiled from: PG */
public final /* synthetic */ class C29005dv implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78757a;

    /* renamed from: b */
    public final /* synthetic */ List f78758b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78759c;

    /* renamed from: d */
    public final /* synthetic */ C29392ep f78760d;

    public /* synthetic */ C29005dv(C29117fe feVar, List list, C29334dr drVar, C29392ep epVar) {
        this.f78757a = feVar;
        this.f78758b = list;
        this.f78759c = drVar;
        this.f78760d = epVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78757a;
        List list = this.f78758b;
        C29334dr drVar = this.f78759c;
        C29392ep epVar = this.f78760d;
        if (((C29116fd) obj) == C29116fd.DOWNLOADED) {
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
            return C60856cj.m92900i(drVar);
        }
        C29045l.m53937i("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", epVar.f79682b, epVar.f79683c);
        C28812d.m53784d(list, C58836b.f156633a, "Failed to download file group %s", epVar.f79682b);
        C29045l.m53935g("%s: An unknown error has occurred during download", "FileGroupManager");
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = C28737bo.UNKNOWN_ERROR;
        throw bnVar.mo34334a();
    }
}
