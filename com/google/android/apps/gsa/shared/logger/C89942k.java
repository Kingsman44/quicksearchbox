package com.google.android.apps.gsa.shared.logger;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C59832gy;
import com.google.common.p4552o.C59833gz;
import com.google.common.p4552o.C60475rg;
import com.google.common.p4552o.C60508sm;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.common.p4552o.p4570p.C60368ax;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.logger.k */
/* compiled from: PG */
public final /* synthetic */ class C89942k implements C90991b {

    /* renamed from: a */
    public static final /* synthetic */ C89942k f246435a = new C89942k();

    private /* synthetic */ C89942k() {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C89957y yVar;
        C60555uf ufVar;
        C21370a aVar = C89947o.f246445a.f246460j;
        long currentTimeMillis = System.currentTimeMillis();
        C21370a aVar2 = C89947o.f246445a.f246460j;
        long elapsedRealtime = currentTimeMillis - SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        synchronized (C89947o.f246445a.f246457g) {
            for (C89948p pVar : C89947o.f246445a.f246457g) {
                C89929j jVar = pVar.f246446a;
                String str = pVar.f246448c;
                C59832gy gyVar = (C59832gy) C59833gz.f161685o.createBuilder();
                if (!(jVar == null || (ufVar = jVar.f246379a) == null)) {
                    String str2 = ufVar.f164259n;
                    if (!TextUtils.isEmpty(str2)) {
                        gyVar.copyOnWrite();
                        C59833gz gzVar = (C59833gz) gyVar.instance;
                        str2.getClass();
                        gzVar.f161687a |= 4;
                        gzVar.f161690d = str2;
                    }
                    C60555uf ufVar2 = jVar.f246379a;
                    if ((ufVar2.f164093a & 16) != 0) {
                        long j = ufVar2.f164261p;
                        gyVar.copyOnWrite();
                        C59833gz gzVar2 = (C59833gz) gyVar.instance;
                        gzVar2.f161687a |= 1024;
                        gzVar2.f161697k = j;
                    }
                    C60555uf ufVar3 = jVar.f246379a;
                    if ((ufVar3.f164146b & 8) != 0) {
                        amo a = amo.m92435a(ufVar3.f164070D);
                        if (a == null) {
                            a = amo.UNKNOWN;
                        }
                        int i = a.f159234au;
                        gyVar.copyOnWrite();
                        C59833gz gzVar3 = (C59833gz) gyVar.instance;
                        gzVar3.f161687a |= 8;
                        gzVar3.f161691e = i;
                    }
                    C59753ej ejVar = jVar.f246379a.f164076J;
                    if (ejVar == null) {
                        ejVar = C59753ej.f161449e;
                    }
                    if ((ejVar.f161451a & 1) != 0) {
                        C59753ej ejVar2 = jVar.f246379a.f164076J;
                        if (ejVar2 == null) {
                            ejVar2 = C59753ej.f161449e;
                        }
                        int i2 = ejVar2.f161452b;
                        gyVar.copyOnWrite();
                        C59833gz gzVar4 = (C59833gz) gyVar.instance;
                        gzVar4.f161687a |= 16;
                        gzVar4.f161692f = i2;
                    }
                    C60475rg rgVar = jVar.f246379a.f164265t;
                    if (rgVar == null) {
                        rgVar = C60475rg.f163673c;
                    }
                    if ((rgVar.f163675a & 1) != 0) {
                        C60475rg rgVar2 = jVar.f246379a.f164265t;
                        if (rgVar2 == null) {
                            rgVar2 = C60475rg.f163673c;
                        }
                        int i3 = rgVar2.f163676b;
                        gyVar.copyOnWrite();
                        C59833gz gzVar5 = (C59833gz) gyVar.instance;
                        gzVar5.f161687a |= 2048;
                        gzVar5.f161698l = i3;
                    }
                    C60508sm smVar = jVar.f246379a.f164116aW;
                    if (smVar == null) {
                        smVar = C60508sm.f163805c;
                    }
                    if ((smVar.f163807a & 1) != 0) {
                        C60508sm smVar2 = jVar.f246379a.f164116aW;
                        if (smVar2 == null) {
                            smVar2 = C60508sm.f163805c;
                        }
                        String str3 = smVar2.f163808b;
                        gyVar.copyOnWrite();
                        C59833gz gzVar6 = (C59833gz) gyVar.instance;
                        str3.getClass();
                        gzVar6.f161687a |= 4096;
                        gzVar6.f161699m = str3;
                    }
                    int i4 = jVar.f246379a.f164258m;
                    gyVar.copyOnWrite();
                    C59833gz gzVar7 = (C59833gz) gyVar.instance;
                    gzVar7.f161687a |= 2;
                    gzVar7.f161689c = i4;
                    gyVar.copyOnWrite();
                    C59833gz gzVar8 = (C59833gz) gyVar.instance;
                    gzVar8.f161687a |= 1;
                    gzVar8.f161688b = pVar.f246447b + elapsedRealtime;
                    C60555uf ufVar4 = jVar.f246379a;
                    if ((ufVar4.f164249d & 2) != 0) {
                        C60368ax axVar = ufVar4.f164132am;
                        if (axVar == null) {
                            axVar = C60368ax.f163383j;
                        }
                        gyVar.copyOnWrite();
                        C59833gz gzVar9 = (C59833gz) gyVar.instance;
                        axVar.getClass();
                        gzVar9.f161696j = axVar;
                        gzVar9.f161687a |= 512;
                    }
                }
                if (!(jVar == null || (yVar = jVar.f246380b) == null)) {
                    String str4 = yVar.f246475c;
                    if (str4 != null) {
                        gyVar.copyOnWrite();
                        C59833gz gzVar10 = (C59833gz) gyVar.instance;
                        gzVar10.f161687a |= 4;
                        gzVar10.f161690d = str4;
                    }
                    Integer num = jVar.f246380b.f246476d;
                    if (num != null) {
                        int intValue = num.intValue();
                        gyVar.copyOnWrite();
                        C59833gz gzVar11 = (C59833gz) gyVar.instance;
                        gzVar11.f161687a |= 32;
                        gzVar11.f161693g = intValue;
                    }
                    String str5 = jVar.f246380b.f246480h;
                    if (str5 != null) {
                        gyVar.copyOnWrite();
                        C59833gz gzVar12 = (C59833gz) gyVar.instance;
                        gzVar12.f161687a |= 64;
                        gzVar12.f161694h = str5;
                    }
                    int i5 = jVar.f246380b.f246481i;
                    gyVar.copyOnWrite();
                    C59833gz gzVar13 = (C59833gz) gyVar.instance;
                    gzVar13.f161687a |= 2;
                    gzVar13.f161689c = i5;
                    gyVar.copyOnWrite();
                    C59833gz gzVar14 = (C59833gz) gyVar.instance;
                    gzVar14.f161687a |= 1;
                    gzVar14.f161688b = pVar.f246447b + elapsedRealtime;
                }
                if (!TextUtils.isEmpty(str)) {
                    gyVar.copyOnWrite();
                    C59833gz gzVar15 = (C59833gz) gyVar.instance;
                    str.getClass();
                    gzVar15.f161687a |= 256;
                    gzVar15.f161695i = str;
                }
                C89851ag agVar = pVar.f246449d;
                if (agVar != null) {
                    gyVar.copyOnWrite();
                    C59833gz gzVar16 = (C59833gz) gyVar.instance;
                    gzVar16.f161700n = agVar.f246200fb;
                    gzVar16.f161687a |= 8192;
                }
                arrayList.add((C59833gz) gyVar.build());
            }
        }
        C59795fw fwVar = fVar.f254236a;
        fwVar.copyOnWrite();
        C59796fx fxVar = C59796fx.f161580r;
        ((C59796fx) fwVar.instance).f161590i = C59796fx.emptyProtobufList();
        fwVar.copyOnWrite();
        C59796fx fxVar2 = (C59796fx) fwVar.instance;
        C62971cq cqVar = fxVar2.f161590i;
        if (!cqVar.mo58948c()) {
            fxVar2.f161590i = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) fxVar2.f161590i);
    }
}
