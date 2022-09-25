package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111584i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113143ba;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113255ah;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113300by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113362dc;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113363dd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113365df;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4948ba.C64373c;
import com.google.protos.p4948ba.C64374d;
import com.google.protos.p4985f.p5046x.C65379d;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.fn */
/* compiled from: PG */
final class C112869fn extends C112920hk {

    /* renamed from: a */
    static final C113286bk f312828a = new C113255ah(R.drawable.quantum_ic_search_grey600_24);

    /* renamed from: b */
    public static final C59071e f312829b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.fn");

    /* renamed from: c */
    public final C68214a f312830c;

    /* renamed from: d */
    public final C113251ad f312831d;

    /* renamed from: e */
    public final C86124t f312832e;

    /* renamed from: f */
    public final int f312833f;

    /* renamed from: g */
    private final Context f312834g;

    /* renamed from: h */
    private final C112694be f312835h;

    /* renamed from: i */
    private final C113367dh f312836i;

    /* renamed from: j */
    private final C22871g f312837j;

    /* renamed from: k */
    private final C104149a f312838k;

    public C112869fn(Context context, C68214a aVar, C112694be beVar, C113367dh dhVar, C113251ad adVar, C22871g gVar, C86124t tVar, C104149a aVar2) {
        this.f312834g = context;
        this.f312830c = aVar;
        this.f312835h = beVar;
        this.f312836i = dhVar;
        this.f312831d = adVar;
        this.f312837j = gVar;
        this.f312832e = tVar;
        this.f312833f = context.getResources().getDimensionPixelOffset(R.dimen.personalized_query_generic_icon_padding);
        this.f312838k = aVar2;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 89118;
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        this.f312835h.mo99653d(ghVar.itemView);
        if (ezVar.mo100188A().isEmpty()) {
            C59104x d = f312829b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PQSIR");
            ((C59052c) ((C59052c) d).mo56372aa(27817)).mo56386p("Not handling click because fulfillment method is missing!");
            return;
        }
        C113300by byVar = C113300by.INTERPRETATION;
        int ordinal = ((C113300by) ezVar.mo100188A().get()).ordinal();
        if (ordinal == 0) {
            ezVar.mo100195H().flatMap(C112863fh.f312821a).ifPresent(new C112864fi(this));
        } else if (ordinal == 1) {
            ((C112880fy) this.f312830c.mo27525b()).mo99775c(ezVar.mo100199L(), esVar, ezVar, 10);
        }
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        ((C112880fy) this.f312830c.mo27525b()).mo99774b(ezVar, view.findViewById(R.id.suggestion_item_content));
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        int i;
        if (ezVar.mo100188A().isEmpty()) {
            C59104x d = f312829b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PQSIR");
            ((C59052c) ((C59052c) d).mo56372aa(27819)).mo56386p("Not rendering query because fulfillment method is missing!");
            return;
        }
        C112919hj hjVar = (C112919hj) ghVar;
        String p = esVar.mo100118a().mo100033p();
        if (this.f312838k.mo93970a()) {
            i = C19391a.m36980a(this.f312834g, R.attr.TapasPersonalizedQueryTextMatching);
        } else {
            i = this.f312834g.getResources().getColor(R.color.tapas_personalized_query_text_matching);
        }
        if (ezVar.mo100192E().isPresent()) {
            hjVar.f312954b.setText(C112883ga.m186806b(i, ((C65379d) ezVar.mo100192E().get()).f177779b, p));
        } else {
            String str = (String) ezVar.mo100195H().map(C112860fe.f312817a).filter(C112857fb.f312813a).orElse(ezVar.mo100199L());
            List<C64374d> arrayList = new ArrayList<>();
            if (ezVar.mo100195H().isPresent()) {
                arrayList = (List) C113148bf.m187161h((C48578al) ezVar.mo100195H().get()).findFirst().map(C113143ba.f313460a).orElse(C58485gu.m89845m());
            }
            if (!arrayList.isEmpty()) {
                TextView textView = hjVar.f312954b;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (C64374d dVar : arrayList) {
                    String str2 = dVar.f174590a;
                    int a = C64373c.m96394a(dVar.f174591b);
                    if (a == 0 || a == 1) {
                        spannableStringBuilder.append(C112883ga.m186805a(i, str2, str2.length()));
                    } else {
                        spannableStringBuilder.append(str2);
                    }
                }
                textView.setText(spannableStringBuilder);
            } else {
                hjVar.f312954b.setText(C112883ga.m186806b(i, str, p));
            }
        }
        hjVar.f312954b.setVisibility(0);
        hjVar.f312953a.setVisibility(4);
        if (this.f312832e.mo79746e(C90063do.f249262aH)) {
            Optional flatMap = ezVar.mo100195H().flatMap(C112863fh.f312821a).flatMap(new C112854ez(this));
            C58528ij ijVar = C111584i.f310320a;
            Objects.requireNonNull(ijVar);
            if (((Boolean) flatMap.map(new C112856fa(ijVar)).orElse(false)).booleanValue()) {
                C58485gu l = ezVar.mo100212l();
                String str3 = (String) ezVar.mo100195H().map(C112860fe.f312817a).orElse(BuildConfig.FLAVOR);
                if (str3.startsWith("open")) {
                    str3 = str3.substring(4).trim();
                }
                C60870cx g = C60922j.m93044g(C60856cj.m92906o((Iterable) Collection.EL.stream(l).map(new C112861ff(this, str3)).collect(C58370cn.f155946a)), C112862fg.f312820a, C60826bg.f164896a);
                if (C90877ak.m148480n(g)) {
                    mo99766j(hjVar.f312953a, (C58485gu) C90877ak.m148474h(g));
                    return;
                } else {
                    new C90873ag(g, this.f312837j, "Render valid icon candidates", new C112858fc(this, hjVar)).mo85223a(C112859fd.f312816a);
                    return;
                }
            }
        }
        mo99766j(hjVar.f312953a, ezVar.mo100212l());
    }

    /* renamed from: i */
    public final boolean mo99718i() {
        return true;
    }

    /* renamed from: j */
    public final void mo99766j(ImageView imageView, C58485gu guVar) {
        C113367dh dhVar = this.f312836i;
        C113362dc d = C113363dd.m187554d();
        d.mo99986c((List) Collection.EL.stream(guVar).map(new C112853ey(this)).collect(C58370cn.f155946a));
        d.mo99985b().mo55395g(C113365df.m187559d(f312828a, this.f312833f));
        dhVar.mo100144d(imageView, d.mo99984a());
    }
}
