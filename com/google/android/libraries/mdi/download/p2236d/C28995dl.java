package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29330dn;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29035b;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.p4552o.p4566l.C60133ay;
import com.google.common.p4552o.p4566l.C60134az;

/* renamed from: com.google.android.libraries.mdi.download.d.dl */
/* compiled from: PG */
public final /* synthetic */ class C28995dl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29035b f78723a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78724b;

    public /* synthetic */ C28995dl(C29035b bVar, C29334dr drVar) {
        this.f78723a = bVar;
        this.f78724b = drVar;
    }

    public final Object apply(Object obj) {
        C29035b bVar = this.f78723a;
        C29334dr drVar = this.f78724b;
        Void voidR = (Void) obj;
        if (bVar.f78828b - 1 != 0) {
            bVar.mo34557d(1114, drVar);
        } else {
            bVar.mo34557d(1009, drVar);
            if (bVar.f78828b == 1) {
                C60125aq aqVar = (C60125aq) C60126ar.f162612j.createBuilder();
                String str = drVar.f79502d;
                aqVar.copyOnWrite();
                C60126ar arVar = (C60126ar) aqVar.instance;
                str.getClass();
                arVar.f162614a |= 4;
                arVar.f162617d = str;
                String str2 = drVar.f79501c;
                aqVar.copyOnWrite();
                C60126ar arVar2 = (C60126ar) aqVar.instance;
                str2.getClass();
                arVar2.f162614a |= 1;
                arVar2.f162615b = str2;
                int i = drVar.f79503e;
                aqVar.copyOnWrite();
                C60126ar arVar3 = (C60126ar) aqVar.instance;
                arVar3.f162614a |= 2;
                arVar3.f162616c = i;
                int size = drVar.f79512n.size();
                aqVar.copyOnWrite();
                C60126ar arVar4 = (C60126ar) aqVar.instance;
                arVar4.f162614a |= 8;
                arVar4.f162618e = size;
                long j = drVar.f79516r;
                aqVar.copyOnWrite();
                C60126ar arVar5 = (C60126ar) aqVar.instance;
                arVar5.f162614a |= 64;
                arVar5.f162621h = j;
                String str3 = drVar.f79517s;
                aqVar.copyOnWrite();
                C60126ar arVar6 = (C60126ar) aqVar.instance;
                str3.getClass();
                arVar6.f162614a |= 128;
                arVar6.f162622i = str3;
                C60126ar arVar7 = (C60126ar) aqVar.build();
                C29330dn dnVar = drVar.f79500b;
                if (dnVar == null) {
                    dnVar = C29330dn.f79488g;
                }
                long j2 = dnVar.f79492c;
                long j3 = dnVar.f79494e;
                long j4 = dnVar.f79493d;
                C60133ay ayVar = (C60133ay) C60134az.f162663e.createBuilder();
                int i2 = dnVar.f79495f;
                ayVar.copyOnWrite();
                C60134az azVar = (C60134az) ayVar.instance;
                azVar.f162665a = 1 | azVar.f162665a;
                azVar.f162666b = i2;
                ayVar.copyOnWrite();
                C60134az azVar2 = (C60134az) ayVar.instance;
                azVar2.f162665a |= 2;
                azVar2.f162667c = j4 - j3;
                ayVar.copyOnWrite();
                C60134az azVar3 = (C60134az) ayVar.instance;
                azVar3.f162665a |= 4;
                azVar3.f162668d = j4 - j2;
                bVar.f78827a.mo34540e(arVar7, (C60134az) ayVar.build());
            }
        }
        return C29116fd.DOWNLOADED;
    }
}
