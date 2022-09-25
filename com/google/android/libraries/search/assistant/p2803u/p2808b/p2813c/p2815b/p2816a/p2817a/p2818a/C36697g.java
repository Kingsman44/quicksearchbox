package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.p2818a;

import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b.C36676d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3861at.C49842b;
import com.google.assistant.p3861at.C50137ly;
import com.google.assistant.p3861at.C50151ml;
import com.google.assistant.p3861at.C50153mn;
import com.google.assistant.p3861at.C50359ud;
import com.google.assistant.p3861at.C50362ug;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C36697g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36701k f95590a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f95591b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f95592c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f95593d;

    public /* synthetic */ C36697g(C36701k kVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f95590a = kVar;
        this.f95591b = cxVar;
        this.f95592c = cxVar2;
        this.f95593d = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C58833ax axVar;
        int a;
        C36701k kVar = this.f95590a;
        C60870cx cxVar = this.f95591b;
        C60870cx cxVar2 = this.f95592c;
        C60870cx cxVar3 = this.f95593d;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        C50137ly lyVar = (C50137ly) C60856cj.m92909r(cxVar2);
        act act = lyVar.f130342b;
        if (act == null) {
            act = act.f128872P;
        }
        C50362ug ugVar = act.f128917x;
        if (ugVar == null) {
            ugVar = C50362ug.f131096h;
        }
        C50153mn mnVar = lyVar.f130343c;
        if (mnVar == null) {
            mnVar = C50153mn.f130384d;
        }
        C50359ud udVar = ugVar.f131100c;
        if (udVar == null) {
            udVar = C50359ud.f131080h;
        }
        boolean z = true;
        int i = udVar.f131082a & 1;
        C58976aa aaVar = C58975e.f156826a;
        boolean z2 = ugVar.f131101d.size() > 0 && (((C50359ud) ugVar.f131101d.get(0)).f131082a & 1) != 0;
        boolean z3 = i != 0 && ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        boolean z4 = z2 && ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        if (!z2 && i == 0) {
            kVar.mo40333b(true);
        }
        if ((mnVar.f130386a & 2) == 0 || (a = C50151ml.m85780a(mnVar.f130388c)) == 0 || a != 2) {
            z = false;
        }
        if ((act.f128894a & 16) != 0) {
            C49842b bVar = act.f128899f;
            if (bVar == null) {
                bVar = C49842b.f129519l;
            }
            axVar = C58833ax.m90834k(bVar.f129528h);
        } else {
            axVar = C58836b.f156633a;
        }
        C58833ax axVar2 = axVar;
        C50362ug ugVar2 = act.f128917x;
        if (ugVar2 == null) {
            ugVar2 = C50362ug.f131096h;
        }
        int size = ugVar2.f131101d.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            C36676d.m65267b(ugVar2, i2).ifPresent(new C36694d(kVar, arrayList));
        }
        return C60922j.m93044g(C47638k.m84752c(arrayList).mo51520a(new C36695e(arrayList), C60826bg.f164896a), C47810es.m84963c(new C36691a(kVar, act, z3, z4, booleanValue, axVar2, z)), C60826bg.f164896a);
    }
}
