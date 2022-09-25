package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.C75871f;
import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75776e;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80227bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80251f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81344a;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81374h;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81375i;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81376j;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81380n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.g */
/* compiled from: PG */
public final class C75948g implements C75909j, C75864b {

    /* renamed from: a */
    private final C75910k f210723a;

    /* renamed from: b */
    private final C81376j f210724b;

    /* renamed from: c */
    private final C75911l f210725c;

    /* renamed from: d */
    private final C91142g f210726d;

    /* renamed from: e */
    private final C75871f f210727e;

    public C75948g(C75910k kVar, C81376j jVar, C75911l lVar, C91142g gVar, C75871f fVar) {
        this.f210723a = kVar;
        this.f210724b = jVar;
        this.f210725c = lVar;
        this.f210726d = gVar;
        this.f210727e = fVar;
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        C80227bu buVar;
        if (axVar.f220049a == 4) {
            try {
                C58528ij a = this.f210727e.mo71920a();
                if ((!this.f210726d.mo85405j(C90126fx.f251346hA) || !a.contains(C80251f.CORNER_SWIPE)) && (!this.f210726d.mo85405j(C90126fx.f251397hz) || !a.contains(C80251f.HOME_BUTTON))) {
                    C81380n d = C81381o.m129461d();
                    d.mo75043b(C80265t.ASSISTANT_TRIGGER_NOT_AVAILABLE);
                    d.mo75044c(C80267v.APP_OPEN);
                    d.mo75045d(9);
                    throw d.mo75042a();
                }
                if (!a.contains(C80251f.HOTWORD)) {
                    if (this.f210726d.mo85405j(C90126fx.f251619mI) || this.f210726d.mo85405j(C90126fx.f251623mM)) {
                        C81380n d2 = C81381o.m129461d();
                        d2.mo75043b(C80265t.TRIGGER_OPEN_APP_HOTWORD_NOT_ENABLED);
                        d2.mo75044c(C80267v.APP_OPEN);
                        d2.mo75045d(9);
                        throw d2.mo75042a();
                    }
                }
                if (this.f210726d.mo85405j(C90126fx.f251636mZ)) {
                    if (axVar.f220049a == 4) {
                        buVar = (C80227bu) axVar.f220050b;
                    } else {
                        buVar = C80227bu.f220106d;
                    }
                    int i = 1;
                    int i2 = true != this.f210726d.mo85405j(C90126fx.f251622mL) ? 1 : 2;
                    if (true == this.f210726d.mo85405j(C90126fx.f251619mI)) {
                        i2 = 3;
                    }
                    Bundle bundle = new Bundle();
                    C81377k.m129445c(bundle, C80267v.APP_OPEN);
                    C75776e.m122138e(bundle, buVar.f220109b, buVar.f220110c, i2);
                    C81344a j = C81374h.m129431j();
                    j.f222639a = bundle;
                    j.mo75017g(R.string.nga_pie_notification_app_open_title);
                    j.mo75013c(R.string.nga_pie_notification_app_open_description);
                    j.mo75016f(C58485gu.m89846n(buVar.f220109b));
                    j.f222641c = 9;
                    j.mo75014d(this.f210726d.mo85405j(C90126fx.f251384hm));
                    int d3 = (int) this.f210726d.mo85399d(C90126fx.f251621mK);
                    if (d3 >= 0) {
                        C81375i.m129441a();
                        if (d3 < 3) {
                            i = C81375i.m129441a()[d3];
                        }
                    }
                    this.f210724b.mo71958a(j.mo75011a(), i);
                    return;
                }
                C81380n d4 = C81381o.m129461d();
                d4.mo75043b(C80265t.TRIGGER_UI_NOT_SUPPORTED);
                d4.mo75044c(C80267v.APP_OPEN);
                d4.mo75045d(9);
                throw d4.mo75042a();
            } catch (C81381o e) {
                this.f210725c.mo71913b(e, false);
            }
        }
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210723a.mo71909a(this);
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210723a.mo71911c(this);
    }
}
