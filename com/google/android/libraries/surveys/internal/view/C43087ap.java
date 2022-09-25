package com.google.android.libraries.surveys.internal.view;

import android.text.TextUtils;
import android.view.View;
import com.google.p4281bu.p4282a.C56504ao;
import com.google.p4281bu.p4282a.C56505ap;
import com.google.p4281bu.p4282a.C56506aq;
import com.google.p4281bu.p4282a.C56511av;
import com.google.p4281bu.p4282a.C56512aw;
import com.google.p4281bu.p4282a.C56513ax;
import com.google.p4281bu.p4282a.C56517ba;
import com.google.p4281bu.p4282a.C56528bl;
import com.google.p4281bu.p4282a.C56546cc;
import com.google.p4281bu.p4282a.C56583i;
import com.google.p4281bu.p4282a.C56585k;
import com.google.p4281bu.p4282a.C56587m;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.surveys.internal.view.ap */
/* compiled from: PG */
public final /* synthetic */ class C43087ap implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43091at f112677a;

    /* renamed from: b */
    public final /* synthetic */ C56546cc f112678b;

    public /* synthetic */ C43087ap(C43091at atVar, C56546cc ccVar) {
        this.f112677a = atVar;
        this.f112678b = ccVar;
    }

    public final void onClick(View view) {
        C56528bl blVar;
        C43091at atVar = this.f112677a;
        C56546cc ccVar = this.f112678b;
        C43154l lVar = atVar.f112689f;
        C56504ao aoVar = (C56504ao) C56517ba.f150934d.createBuilder();
        if (atVar.f112691h.mo46091c()) {
            C56505ap apVar = (C56505ap) C56506aq.f150913b.createBuilder();
            if (ccVar.f150993a == 5) {
                blVar = (C56528bl) ccVar.f150994b;
            } else {
                blVar = C56528bl.f150956b;
            }
            C56587m mVar = blVar.f150958a;
            if (mVar == null) {
                mVar = C56587m.f151083b;
            }
            C62971cq cqVar = mVar.f151085a;
            int i = 0;
            while (true) {
                boolean[] zArr = lVar.f112852b;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    String str = ((C56585k) cqVar.get(i)).f151080c;
                    int a = C56583i.m88215a(((C56585k) cqVar.get(i)).f151078a);
                    int i2 = 4;
                    if (a != 0 && a == 4 && !TextUtils.isEmpty(lVar.f112851a)) {
                        str = lVar.f112851a;
                    }
                    C56512aw awVar = (C56512aw) C56513ax.f150922d.createBuilder();
                    int i3 = ((C56585k) cqVar.get(i)).f151079b;
                    awVar.copyOnWrite();
                    ((C56513ax) awVar.instance).f150925b = i3;
                    awVar.copyOnWrite();
                    str.getClass();
                    ((C56513ax) awVar.instance).f150926c = str;
                    int a2 = C56583i.m88215a(((C56585k) cqVar.get(i)).f151078a);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i4 = a2 - 2;
                    if (i4 == 1) {
                        i2 = 3;
                    } else if (i4 != 2) {
                        i2 = i4 != 3 ? 2 : 5;
                    }
                    awVar.copyOnWrite();
                    ((C56513ax) awVar.instance).f150924a = C56511av.m88208a(i2);
                    apVar.mo54427a((C56513ax) awVar.build());
                    atVar.f112691h.mo46089a();
                }
                int i5 = ccVar.f150995c;
                aoVar.copyOnWrite();
                ((C56517ba) aoVar.instance).f150938c = i5;
                C56506aq aqVar = (C56506aq) apVar.build();
                aoVar.copyOnWrite();
                C56517ba baVar = (C56517ba) aoVar.instance;
                aqVar.getClass();
                baVar.f150937b = aqVar;
                baVar.f150936a = 3;
                i++;
            }
        }
        C56517ba baVar2 = (C56517ba) aoVar.build();
        if (baVar2 != null) {
            atVar.f112686c.f112629a = baVar2;
        }
        atVar.mo46146a(ccVar);
        atVar.mo46147b();
    }
}
