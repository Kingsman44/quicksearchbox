package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75778g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80251f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6311ah.C80630a;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81344a;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81374h;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81376j;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81380n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.HashMap;
import java.util.Random;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.c */
/* compiled from: PG */
public final /* synthetic */ class C75944c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C75946e f210711a;

    public /* synthetic */ C75944c(C75946e eVar) {
        this.f210711a = eVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C75946e eVar = this.f210711a;
        if (eVar.mo71975d()) {
            Instant ofEpochMilli = Instant.ofEpochMilli(eVar.f210718f.mo26870b());
            int i = C80630a.f221370a;
            ZonedDateTime atZone = ofEpochMilli.atZone(ZoneId.systemDefault());
            if (atZone.getHour() < 21 && atZone.getHour() >= 9) {
                String[] split = eVar.f210717e.mo85403h(C90126fx.f251657mu).split(";", -1);
                HashMap hashMap = new HashMap();
                for (String str : split) {
                    hashMap.put(Integer.valueOf(str.hashCode()), str);
                }
                Stream stream = Collection.EL.stream(eVar.f210716d.mo74900p());
                Objects.requireNonNull(hashMap);
                stream.forEach(new C75914a(hashMap));
                if (!hashMap.isEmpty()) {
                    int intValue = ((Integer) C58485gu.m89842j(hashMap.keySet()).get(((Random) eVar.f210720h.mo6453a()).nextInt(Integer.MAX_VALUE) % hashMap.size())).intValue();
                    String str2 = (String) hashMap.get(Integer.valueOf(intValue));
                    str2.getClass();
                    Bundle bundle = new Bundle();
                    boolean z = true;
                    C75778g.m122142e(bundle, str2, true != eVar.f210717e.mo85405j(C90126fx.f251656mt) ? 1 : 3);
                    C81377k.m129445c(bundle, C80267v.GENERIC_TRY_SAYING);
                    try {
                        C58528ij a = eVar.f210719g.mo71920a();
                        if (!eVar.f210717e.mo85405j(C90126fx.f251381hj) || !a.contains(C80251f.CORNER_SWIPE)) {
                            if (!eVar.f210717e.mo85405j(C90126fx.f251380hi) || !a.contains(C80251f.HOME_BUTTON)) {
                                z = false;
                            }
                        }
                        if (eVar.f210717e.mo85405j(C90126fx.f251656mt)) {
                            z = a.contains(C80251f.HOTWORD);
                        }
                        if (!z) {
                            C81380n d = C81381o.m129461d();
                            d.mo75043b(C80265t.ASSISTANT_TRIGGER_NOT_AVAILABLE);
                            d.mo75044c(C80267v.GENERIC_TRY_SAYING);
                            d.mo75045d(12);
                            throw d.mo75042a();
                        } else if (eVar.f210717e.mo85405j(C90126fx.f251636mZ)) {
                            C81376j jVar = eVar.f210714b;
                            C81344a j = C81374h.m129431j();
                            j.f222641c = 12;
                            j.f222639a = bundle;
                            j.mo75017g(R.string.nga_pie_aggressive_title);
                            j.mo75013c(R.string.nga_pie_aggressive_description);
                            j.mo75012b(C58485gu.m89846n(str2));
                            j.mo75014d(eVar.f210717e.mo85405j(C90126fx.f251379hh));
                            j.f222640b = Optional.m71637of(Integer.valueOf(eVar.f210716d.mo74900p().size()));
                            jVar.mo71958a(j.mo75011a(), 3);
                            C60856cj.m92911t(eVar.f210716d.mo74863K(intValue), new C75945d(), C60826bg.f164896a);
                        } else {
                            C81380n d2 = C81381o.m129461d();
                            d2.mo75043b(C80265t.TRIGGER_UI_NOT_SUPPORTED);
                            d2.mo75044c(C80267v.GENERIC_TRY_SAYING);
                            d2.mo75045d(12);
                            throw d2.mo75042a();
                        }
                    } catch (C81381o e) {
                        eVar.f210715c.mo71913b(e, false);
                    }
                }
            }
        }
        eVar.mo71974c();
        return C118826c.f331422a;
    }
}
