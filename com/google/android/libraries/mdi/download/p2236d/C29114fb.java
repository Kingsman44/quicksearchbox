package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.p4552o.p4566l.C60131aw;
import com.google.common.p4552o.p4566l.C60132ax;
import com.google.common.p4552o.p4566l.C60182ct;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.fb */
/* compiled from: PG */
public final /* synthetic */ class C29114fb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78961a;

    /* renamed from: b */
    public final /* synthetic */ C29328dl f78962b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78963c;

    /* renamed from: d */
    public final /* synthetic */ long f78964d;

    /* renamed from: e */
    public final /* synthetic */ int f78965e;

    public /* synthetic */ C29114fb(C29117fe feVar, C29328dl dlVar, C29334dr drVar, int i, long j) {
        this.f78961a = feVar;
        this.f78962b = dlVar;
        this.f78963c = drVar;
        this.f78965e = i;
        this.f78964d = j;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78961a;
        C29328dl dlVar = this.f78962b;
        C29334dr drVar = this.f78963c;
        int i = this.f78965e;
        long j = this.f78964d;
        if (!((Boolean) obj).booleanValue()) {
            C29045l.m53937i("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", dlVar.f79473b, drVar.f79501c);
            C29117fe.m54054w(feVar.f78973b, drVar, dlVar, 15);
            return C60856cj.m92900i(false);
        }
        C29037d dVar = feVar.f78973b;
        C60131aw awVar = (C60131aw) C60132ax.f162652j.createBuilder();
        awVar.copyOnWrite();
        C60132ax axVar = (C60132ax) awVar.instance;
        axVar.f162655b = C60182ct.m92532a(i);
        axVar.f162654a |= 1;
        String str = drVar.f79501c;
        awVar.copyOnWrite();
        C60132ax axVar2 = (C60132ax) awVar.instance;
        str.getClass();
        axVar2.f162654a = 2 | axVar2.f162654a;
        axVar2.f162656c = str;
        int i2 = drVar.f79503e;
        awVar.copyOnWrite();
        C60132ax axVar3 = (C60132ax) awVar.instance;
        axVar3.f162654a |= 4;
        axVar3.f162657d = i2;
        long j2 = drVar.f79516r;
        awVar.copyOnWrite();
        C60132ax axVar4 = (C60132ax) awVar.instance;
        axVar4.f162654a |= 128;
        axVar4.f162661h = j2;
        String str2 = drVar.f79517s;
        awVar.copyOnWrite();
        C60132ax axVar5 = (C60132ax) awVar.instance;
        str2.getClass();
        axVar5.f162654a |= 256;
        axVar5.f162662i = str2;
        String str3 = dlVar.f79473b;
        awVar.copyOnWrite();
        C60132ax axVar6 = (C60132ax) awVar.instance;
        str3.getClass();
        axVar6.f162654a |= 8;
        axVar6.f162658e = str3;
        awVar.copyOnWrite();
        C60132ax axVar7 = (C60132ax) awVar.instance;
        axVar7.f162654a |= 16;
        axVar7.f162659f = true;
        awVar.copyOnWrite();
        C60132ax axVar8 = (C60132ax) awVar.instance;
        axVar8.f162654a |= 32;
        axVar8.f162660g = j;
        dVar.mo34539d((C60132ax) awVar.build());
        return C60856cj.m92900i(true);
    }
}
