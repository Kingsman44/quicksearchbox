package com.google.android.apps.gsa.p8839t.p8846g;

import com.google.android.apps.gsa.g.e.e;
import com.google.android.apps.gsa.shared.p7066m.C90042cu;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123754bu;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3994s.p3995a.C53272ht;
import com.google.assistant.p3994s.p3995a.C53274hv;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.t.g.a */
/* compiled from: PG */
public final /* synthetic */ class C118367a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118378l f328550a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f328551b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f328552c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f328553d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f328554e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f328555f;

    /* renamed from: g */
    public final /* synthetic */ C123754bu f328556g;

    public /* synthetic */ C118367a(C118378l lVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C60870cx cxVar5, C123754bu buVar) {
        this.f328550a = lVar;
        this.f328551b = cxVar;
        this.f328552c = cxVar2;
        this.f328553d = cxVar3;
        this.f328554e = cxVar4;
        this.f328555f = cxVar5;
        this.f328556g = buVar;
    }

    public final Object call() {
        C58833ax axVar;
        C118378l lVar = this.f328550a;
        C60870cx cxVar = this.f328551b;
        C60870cx cxVar2 = this.f328552c;
        C60870cx cxVar3 = this.f328553d;
        C60870cx cxVar4 = this.f328554e;
        C60870cx cxVar5 = this.f328555f;
        C123754bu buVar = this.f328556g;
        C54188e eVar = (C54188e) C60856cj.m92909r(cxVar);
        C58833ax axVar2 = (C58833ax) C60856cj.m92909r(cxVar2);
        C58833ax axVar3 = (C58833ax) C60856cj.m92909r(cxVar3);
        C51303cs csVar = (C51303cs) C60856cj.m92909r(cxVar4);
        C51715bm bmVar = (C51715bm) C60856cj.m92909r(cxVar5);
        buVar.copyOnWrite();
        C123755bv bvVar = (C123755bv) buVar.instance;
        C123755bv bvVar2 = C123755bv.f341837o;
        eVar.getClass();
        bvVar.f341841c = eVar;
        bvVar.f341839a |= 2;
        if (axVar2.mo56113h()) {
            C51270bm bmVar2 = (C51270bm) axVar2.mo56107c();
            buVar.copyOnWrite();
            C123755bv bvVar3 = (C123755bv) buVar.instance;
            bmVar2.getClass();
            bvVar3.f341843e = bmVar2;
            bvVar3.f341839a |= 4;
        }
        if (axVar3.mo56113h()) {
            e eVar2 = (e) axVar3.mo56107c();
            if (eVar2 == null) {
                axVar = C58836b.f156633a;
            } else {
                C53272ht htVar = (C53272ht) C53274hv.f139676c.createBuilder();
                htVar.mo53975a(Collections.unmodifiableMap(eVar2.a).keySet());
                for (Map.Entry entry : lVar.f328570d.mo79752r(C90042cu.f248712m).entrySet()) {
                    try {
                        htVar.mo53976b((String) entry.getKey(), Integer.parseInt((String) entry.getValue()));
                    } catch (NumberFormatException unused) {
                        C58976aa aaVar = C58975e.f156826a;
                        entry.getValue();
                    }
                }
                axVar = C58833ax.m90834k((C53274hv) htVar.build());
            }
            if (axVar.mo56113h()) {
                C53274hv hvVar = (C53274hv) axVar.mo56107c();
                buVar.copyOnWrite();
                C123755bv bvVar4 = (C123755bv) buVar.instance;
                hvVar.getClass();
                bvVar4.f341844f = hvVar;
                bvVar4.f341839a |= 8;
            }
        }
        C51334dw dwVar = (C51334dw) csVar.build();
        buVar.copyOnWrite();
        C123755bv bvVar5 = (C123755bv) buVar.instance;
        dwVar.getClass();
        bvVar5.f341851m = dwVar;
        bvVar5.f341839a |= 1024;
        buVar.copyOnWrite();
        C123755bv bvVar6 = (C123755bv) buVar.instance;
        bmVar.getClass();
        bvVar6.f341852n = bmVar;
        bvVar6.f341839a |= 2048;
        return (C123755bv) buVar.build();
    }
}
