package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a.C111914h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a.C111929w;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.ag */
/* compiled from: PG */
public final /* synthetic */ class C111939ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C111943ak f310975a;

    /* renamed from: b */
    public final /* synthetic */ Duration f310976b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f310977c;

    /* renamed from: d */
    public final /* synthetic */ C111970bk f310978d;

    public /* synthetic */ C111939ag(C111943ak akVar, Duration duration, C113405ep epVar, C111970bk bkVar) {
        this.f310975a = akVar;
        this.f310976b = duration;
        this.f310977c = epVar;
        this.f310978d = bkVar;
    }

    public final void run() {
        String str;
        String str2;
        C58485gu guVar;
        Duration duration;
        String str3;
        Optional optional;
        Optional optional2;
        C58485gu j;
        C111943ak akVar = this.f310975a;
        Duration duration2 = this.f310976b;
        C113405ep epVar = this.f310977c;
        C111970bk bkVar = this.f310978d;
        if (bkVar == null) {
            str = "miss";
        } else {
            str = bkVar.mo99320g() ? "hit_ready" : "hit_delayed";
        }
        C111943ak.f310986b.mo105240i("overall_".concat(str));
        C111943ak.f310986b.mo105240i((true != TextUtils.isEmpty(C113190cu.m187215c(epVar.mo100033p())) ? "non_zero_" : "zero_").concat(str));
        if (akVar.f310987c.mo79746e(C90063do.f249411cy)) {
            switch (epVar.mo100033p().length()) {
                case 0:
                    str2 = "L0";
                    break;
                case 1:
                    str2 = "L1";
                    break;
                case 2:
                    str2 = "L2";
                    break;
                case 3:
                    str2 = "L3";
                    break;
                case 4:
                    str2 = "L4";
                    break;
                case 5:
                    str2 = "L5";
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    str2 = "L5to10";
                    break;
                default:
                    str2 = "L10plus";
                    break;
            }
            List list = (List) akVar.f310991g.f310912e.f310943a.get(C113190cu.m187216d(C58890d.m90988c(epVar.mo100033p())));
            if (list == null) {
                guVar = C58485gu.m89845m();
            } else {
                synchronized (list) {
                    j = C58485gu.m89842j(list);
                }
                guVar = j;
            }
            C58485gu a = C111943ak.m185791a(guVar);
            Duration minus = duration2.minus(C111971bl.f311054b);
            if (bkVar == null || !bkVar.mo99320g()) {
                duration = minus.minus(Duration.ofSeconds(1));
            } else {
                if (bkVar.mo99320g()) {
                    optional2 = Optional.m71637of(Duration.ofNanos(((Long) C90877ak.m148474h(bkVar.mo99279e())).longValue()));
                } else {
                    optional2 = Optional.empty();
                }
                duration = duration2.minus((Duration) optional2.get());
            }
            C58485gu a2 = C111943ak.m185791a(akVar.f310991g.mo99290a());
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                String str4 = (String) a2.get(i);
                Optional min = Collection.EL.stream(a).filter(new C111940ah(str4, minus)).min(Comparator.CC.comparing(C111941ai.f310981a));
                if (min.isEmpty()) {
                    str3 = "miss";
                } else {
                    str3 = ((C111914h) min.get()).mo99284b().compareTo(duration) <= 0 ? "hit_ready" : "hit_delayed";
                }
                if (min.isPresent()) {
                    optional = Optional.m71637of(((C111914h) min.get()).mo99285c());
                } else {
                    C111929w wVar = (C111929w) akVar.f310991g.f310913f.get(str4);
                    if (wVar == null) {
                        optional = Optional.empty();
                    } else {
                        optional = wVar.mo99300b();
                    }
                }
                if (!optional.isEmpty()) {
                    String concat = ((String) optional.get()).isEmpty() ? BuildConfig.FLAVOR : "_".concat(String.valueOf((String) optional.get()));
                    C121537f fVar = C111943ak.f310986b;
                    fVar.mo105240i("model_" + str4 + concat + "_" + str3);
                    C121537f fVar2 = C111943ak.f310986b;
                    fVar2.mo105240i("model_" + str4 + concat + "_en_" + str3);
                    C121537f fVar3 = C111943ak.f310986b;
                    fVar3.mo105240i("model_" + str4 + concat + "_" + str2 + "_" + str3);
                    C121537f fVar4 = C111943ak.f310986b;
                    fVar4.mo105240i("model_" + str4 + concat + "_" + str2 + "_en_" + str3);
                    min.ifPresent(new C111942aj(str4, concat, str3));
                }
            }
        }
    }
}
