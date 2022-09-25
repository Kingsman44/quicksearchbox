package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20172r;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20173s;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20174t;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20175u;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20176v;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20177w;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20178x;

/* renamed from: com.google.android.libraries.componentview.components.c.x */
/* compiled from: PG */
final class C20322x implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C20324z f57110a;

    public C20322x(C20324z zVar) {
        this.f57110a = zVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String g = this.f57110a.f57112a.mo25267g(i);
        C20324z zVar = this.f57110a;
        if (!zVar.f57118g && !g.equals(zVar.f57112a.mo25269i())) {
            if (g.equals(this.f57110a.f57112a.mo25270j())) {
                C20324z zVar2 = this.f57110a;
                zVar2.mo25370m(true);
                C20183ac acVar = zVar2.f57112a;
                C20177w wVar = acVar.f56639a;
                C20176v vVar = ((C20178x) wVar.instance).f56613b;
                if (vVar == null) {
                    vVar = C20176v.f56604d;
                }
                C20175u uVar = (C20175u) vVar.toBuilder();
                C20176v vVar2 = ((C20178x) acVar.f56639a.instance).f56613b;
                if (vVar2 == null) {
                    vVar2 = C20176v.f56604d;
                }
                double d = vVar2.f56607b;
                uVar.copyOnWrite();
                C20176v vVar3 = (C20176v) uVar.instance;
                vVar3.f56606a |= 1;
                vVar3.f56607b = 1.0d / d;
                wVar.copyOnWrite();
                C20178x xVar = (C20178x) wVar.instance;
                C20176v vVar4 = (C20176v) uVar.build();
                vVar4.getClass();
                xVar.f56613b = vVar4;
                xVar.f56612a |= 1;
                C20174t tVar = ((C20178x) acVar.f56639a.instance).f56616e;
                if (tVar == null) {
                    tVar = C20174t.f56599d;
                }
                String str = tVar.f56603c;
                C20177w wVar2 = acVar.f56639a;
                C20174t tVar2 = ((C20178x) wVar2.instance).f56616e;
                if (tVar2 == null) {
                    tVar2 = C20174t.f56599d;
                }
                C20173s sVar = (C20173s) tVar2.toBuilder();
                C20174t tVar3 = ((C20178x) acVar.f56639a.instance).f56615d;
                if (tVar3 == null) {
                    tVar3 = C20174t.f56599d;
                }
                String str2 = tVar3.f56603c;
                sVar.copyOnWrite();
                C20174t tVar4 = (C20174t) sVar.instance;
                str2.getClass();
                tVar4.f56601a |= 2;
                tVar4.f56603c = str2;
                wVar2.copyOnWrite();
                C20178x xVar2 = (C20178x) wVar2.instance;
                C20174t tVar5 = (C20174t) sVar.build();
                tVar5.getClass();
                xVar2.f56616e = tVar5;
                xVar2.f56612a |= 4;
                C20177w wVar3 = acVar.f56639a;
                C20174t tVar6 = ((C20178x) wVar3.instance).f56615d;
                if (tVar6 == null) {
                    tVar6 = C20174t.f56599d;
                }
                C20173s sVar2 = (C20173s) tVar6.toBuilder();
                sVar2.copyOnWrite();
                C20174t tVar7 = (C20174t) sVar2.instance;
                str.getClass();
                tVar7.f56601a |= 2;
                tVar7.f56603c = str;
                wVar3.copyOnWrite();
                C20178x xVar3 = (C20178x) wVar3.instance;
                C20174t tVar8 = (C20174t) sVar2.build();
                tVar8.getClass();
                xVar3.f56615d = tVar8;
                xVar3.f56612a |= 2;
                acVar.f56643e.add(0, acVar.f56641c);
                acVar.f56641c = (C20172r) acVar.f56643e.remove(1);
                zVar2.f57115d.mo25169D(C20183ac.m37980n(zVar2.f57112a.f56643e));
                zVar2.mo25371n();
                zVar2.mo25370m(false);
                return;
            }
            this.f57110a.mo25369i();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
