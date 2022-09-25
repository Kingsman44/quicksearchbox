package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import android.content.Context;
import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137975a;
import com.google.android.apps.search.googleapp.search.suggest.p10453e.C138079a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4073d.p4074a.C54214ac;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54227ap;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4932ax.p4933a.C64267g;
import com.google.protos.p4932ax.p4933a.C64269i;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.ck */
/* compiled from: PG */
public final class C138463ck implements C137975a {

    /* renamed from: a */
    private final Context f376630a;

    /* renamed from: b */
    private final boolean f376631b;

    static {
        C58974d.m91134h("SeeMoreTwiddler");
    }

    public C138463ck(Context context, boolean z) {
        C69664n.m101061g(context, "context");
        this.f376630a = context;
        this.f376631b = z;
    }

    /* renamed from: a */
    public final int mo114065a() {
        return 5000;
    }

    /* renamed from: b */
    public final C60870cx mo114066b(C138133o oVar, List list, C138134p pVar) {
        C69664n.m101061g(oVar, "request");
        C69664n.m101061g(list, "suggestions");
        C69664n.m101061g(pVar, "responseParameters");
        if (list.isEmpty() || !C138079a.m224413b((C138030av) list.get(0))) {
            return C60856cj.m92900i(list);
        }
        if (this.f376631b) {
            C62934bn builder = ((C138030av) list.get(0)).toBuilder();
            C69664n.m101060f(builder, "suggestions[0].toBuilder()");
            C138027as asVar = (C138027as) builder;
            C54228aq aqVar = ((C138030av) asVar.instance).f375543g;
            if (aqVar == null) {
                aqVar = C54228aq.f142328w;
            }
            C62934bn builder2 = aqVar.toBuilder();
            C69664n.m101060f(builder2, "suggestionBuilder.serverSuggestResult.toBuilder()");
            C54227ap apVar = (C54227ap) builder2;
            C54216ae aeVar = ((C54228aq) apVar.instance).f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            C62934bn builder3 = aeVar.toBuilder();
            C69664n.m101060f(builder3, "suggestResultBuilder.sharedParameters.toBuilder()");
            C54214ac acVar = (C54214ac) builder3;
            String string = this.f376630a.getString(R.string.googleapp_onesearch_see_more_enhancement);
            C69664n.m101060f(string, "context.getString(R.stri…rch_see_more_enhancement)");
            C64267g gVar = (C64267g) C64269i.f173763g.createBuilder();
            gVar.copyOnWrite();
            C64269i iVar = (C64269i) gVar.instance;
            string.getClass();
            iVar.f173765a |= 1;
            iVar.f173766b = string;
            String str = ((C138030av) asVar.instance).f375539b;
            gVar.copyOnWrite();
            C64269i iVar2 = (C64269i) gVar.instance;
            str.getClass();
            iVar2.f173765a |= 2;
            iVar2.f173767c = str;
            gVar.mo59266a(C64369b.SUBTYPE_ANSWERS_SEE_MORE);
            gVar.mo59266a(C64369b.SUBTYPE_ENHANCEMENT_0);
            acVar.copyOnWrite();
            C54216ae aeVar2 = (C54216ae) acVar.instance;
            C64269i iVar3 = (C64269i) gVar.build();
            iVar3.getClass();
            C62971cq cqVar = aeVar2.f142288B;
            if (!cqVar.mo58948c()) {
                aeVar2.f142288B = C62942bv.mutableCopy(cqVar);
            }
            aeVar2.f142288B.add(iVar3);
            apVar.copyOnWrite();
            C54228aq aqVar2 = (C54228aq) apVar.instance;
            C54216ae aeVar3 = (C54216ae) acVar.build();
            aeVar3.getClass();
            aqVar2.f142334f = aeVar3;
            aqVar2.f142330a |= 4;
            asVar.copyOnWrite();
            C138030av avVar = (C138030av) asVar.instance;
            C54228aq aqVar3 = (C54228aq) apVar.build();
            aqVar3.getClass();
            avVar.f375543g = aqVar3;
            avVar.f375538a |= 8;
            C62942bv build = asVar.build();
            C69664n.m101060f(build, "suggestionBuilder.build()");
            list.set(0, build);
        }
        return C60856cj.m92900i(list);
    }
}
