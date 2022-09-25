package com.google.android.apps.gsa.shared.logger.p7065j;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;

/* renamed from: com.google.android.apps.gsa.shared.logger.j.h */
/* compiled from: PG */
public final /* synthetic */ class C89937h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f246432a;

    public /* synthetic */ C89937h(View.OnClickListener onClickListener) {
        this.f246432a = onClickListener;
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f246432a;
        C60321oe i = C28285c.m52882i(view, 5, (Integer) null);
        if (i != null) {
            C60320od odVar = (C60320od) i.toBuilder();
            C28292j a = C28295m.m52915a(view);
            if (a != null) {
                if (a instanceof C89938i) {
                    if (((C60321oe) odVar.instance).f163228c.size() == 0) {
                        odVar.copyOnWrite();
                        ((C60321oe) odVar.instance).f163228c = C60321oe.emptyProtobufList();
                        aqp aqp = (aqp) aqs.f159780k.createBuilder();
                        aqm aqm = ((C60321oe) odVar.instance).f163230e;
                        if (aqm == null) {
                            aqm = aqm.f159760n;
                        }
                        int i2 = aqm.f159765d;
                        aqp.copyOnWrite();
                        aqs aqs = (aqs) aqp.instance;
                        aqs.f159782a |= 1;
                        aqs.f159783b = i2;
                        odVar.mo57082b(aqp);
                    }
                    odVar.mo57084d(0, C89938i.m146503a(odVar.mo57081a(0), a));
                }
                C89949q.m146521e((C60321oe) odVar.build(), false);
            }
        }
        onClickListener.onClick(view);
    }
}
