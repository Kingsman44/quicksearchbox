package com.google.android.libraries.surveys.internal.view;

import com.google.android.libraries.surveys.internal.p3328e.C43054c;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.p4281bu.p4282a.C56504ao;
import com.google.p4281bu.p4282a.C56509at;
import com.google.p4281bu.p4282a.C56510au;
import com.google.p4281bu.p4282a.C56511av;
import com.google.p4281bu.p4282a.C56512aw;
import com.google.p4281bu.p4282a.C56513ax;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56546cc;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68385j;

/* renamed from: com.google.android.libraries.surveys.internal.view.aj */
/* compiled from: PG */
public final /* synthetic */ class C43081aj implements C43107bi {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112667a;

    /* renamed from: b */
    public final /* synthetic */ C56546cc f112668b;

    public /* synthetic */ C43081aj(C43091at atVar, C56546cc ccVar) {
        this.f112667a = atVar;
        this.f112668b = ccVar;
    }

    /* renamed from: a */
    public final void mo46133a(int i) {
        C43091at atVar = this.f112667a;
        C56546cc ccVar = this.f112668b;
        if (atVar.f112685b.getActivity() != null) {
            C56504ao aoVar = (C56504ao) C56517ba.f150934d.createBuilder();
            String num = Integer.toString(i);
            if (atVar.f112691h.mo46091c()) {
                C56512aw awVar = (C56512aw) C56513ax.f150922d.createBuilder();
                awVar.copyOnWrite();
                ((C56513ax) awVar.instance).f150925b = i;
                awVar.copyOnWrite();
                num.getClass();
                ((C56513ax) awVar.instance).f150926c = num;
                awVar.copyOnWrite();
                ((C56513ax) awVar.instance).f150924a = C56511av.m88208a(3);
                C56513ax axVar = (C56513ax) awVar.build();
                C56509at atVar2 = (C56509at) C56510au.f150919b.createBuilder();
                atVar2.copyOnWrite();
                axVar.getClass();
                ((C56510au) atVar2.instance).f150921a = axVar;
                C56510au auVar = (C56510au) atVar2.build();
                int i2 = ccVar.f150995c;
                aoVar.copyOnWrite();
                ((C56517ba) aoVar.instance).f150938c = i2;
                aoVar.copyOnWrite();
                C56517ba baVar = (C56517ba) aoVar.instance;
                auVar.getClass();
                baVar.f150937b = auVar;
                baVar.f150936a = 4;
                if (num != null) {
                    int i3 = C43066o.f112626a;
                }
            }
            C56517ba baVar2 = (C56517ba) aoVar.build();
            if (baVar2 != null) {
                atVar.f112686c.f112629a = baVar2;
            }
            atVar.mo46146a(ccVar);
            if (!C43054c.m75960c(C68385j.m98771d(C43054c.f112610b))) {
                atVar.f112698o = 1;
            } else if (atVar.f112698o <= 1) {
                int a = new C43093av(C43091at.f112684a, atVar.f112690g.f150969e.size()).mo46157a(i, ccVar);
                if (a == -1) {
                    atVar.f112698o = 1;
                } else {
                    atVar.f112698o = a;
                }
            }
            atVar.mo46147b();
        }
    }
}
