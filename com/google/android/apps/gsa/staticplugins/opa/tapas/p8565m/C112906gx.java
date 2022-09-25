package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.content.Intent;
import android.support.p033v7.widget.C0673gh;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111585j;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111055e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8532b.C111791c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113286bk;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113421fb;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113496i;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59545do;
import com.google.common.p4552o.p4553a.C59546dp;
import dagger.C68214a;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.gx */
/* compiled from: PG */
class C112906gx extends C112920hk {

    /* renamed from: a */
    private static final C59071e f312921a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.gx");

    /* renamed from: b */
    private final Context f312922b;

    /* renamed from: c */
    private final C111055e f312923c;

    /* renamed from: d */
    private final C68214a f312924d;

    /* renamed from: e */
    private final C111585j f312925e;

    /* renamed from: f */
    private final C112925hp f312926f;

    /* renamed from: g */
    private final int f312927g;

    /* renamed from: h */
    private final Optional f312928h;

    public C112906gx(Context context, C111055e eVar, C68214a aVar, C111585j jVar, C112925hp hpVar, int i, Optional optional) {
        this.f312922b = context;
        this.f312923c = eVar;
        this.f312924d = aVar;
        this.f312925e = jVar;
        this.f312926f = hpVar;
        this.f312927g = i;
        this.f312928h = optional;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return this.f312927g;
    }

    /* renamed from: d */
    public Optional mo99715d(C113415ez ezVar) {
        Optional p = ezVar.mo100216p();
        C59545do doVar = (C59545do) C59546dp.f158007d.createBuilder();
        Optional optional = this.f312928h;
        Objects.requireNonNull(doVar);
        optional.ifPresent(new C112899gq(doVar));
        return p.map(new C112900gr(doVar));
    }

    /* renamed from: f */
    public void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        Optional p = ezVar.mo100216p();
        if (p.isEmpty()) {
            C59104x d = f312921a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "StdTxtIconItemRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(27828)).mo56386p("#handleOnClick: fulfillmentParams not present");
            return;
        }
        Optional a = ((C113496i) p.get()).mo99951a();
        if (a.isEmpty() || TextUtils.isEmpty((CharSequence) a.get())) {
            C59104x d2 = f312921a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "StdTxtIconItemRenderer");
            ((C59052c) ((C59052c) d2).mo56372aa(27827)).mo56386p("#handleOnClick: no fulfillment URL found");
            return;
        }
        C111055e eVar = this.f312923c;
        Optional a2 = C111055e.m184831a((String) ((C113496i) p.get()).mo99951a().get(), ((C113496i) p.get()).mo99952b());
        if (!a2.isEmpty()) {
            if (eVar.f309274b.mo79746e(C90063do.f249406ct)) {
                eVar.f309273a.mo99229a(C58485gu.m89846n(C111791c.m185631a((Intent) a2.get())));
            } else {
                eVar.f309275c.i((Intent) a2.get());
            }
        }
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        ((C112880fy) this.f312924d.mo27525b()).mo99774b(ezVar, view);
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112919hj hjVar = (C112919hj) ghVar;
        Optional I = ezVar.mo100196I();
        if (I.isEmpty()) {
            C59104x d = f312921a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "StdTxtIconItemRenderer");
            ((C59052c) ((C59052c) d).mo56372aa(27831)).mo56386p("#renderView: no text item rendering params");
            hjVar.itemView.setVisibility(8);
            return;
        }
        Optional d2 = ((C113421fb) I.get()).mo100066d();
        Optional e = ((C113421fb) I.get()).mo100067e();
        Optional c = ((C113421fb) I.get()).mo100065c();
        Optional b = ((C113421fb) I.get()).mo100064b();
        Optional a = ((C113421fb) I.get()).mo100063a();
        if (d2.isEmpty() || TextUtils.isEmpty((CharSequence) d2.get()) || e.isEmpty() || TextUtils.isEmpty((CharSequence) e.get())) {
            C59104x d3 = f312921a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "StdTxtIconItemRenderer");
            ((C59052c) ((C59052c) d3).mo56372aa(27829)).mo56386p("#renderView: at least one param value missing");
            hjVar.itemView.setVisibility(8);
            return;
        }
        Optional empty = Optional.empty();
        if (a.isPresent()) {
            empty = a.map(C112902gt.f312917a);
        } else if (c.isPresent() && !TextUtils.isEmpty((CharSequence) c.get())) {
            C111585j jVar = this.f312925e;
            Objects.requireNonNull(jVar);
            empty = c.map(new C112903gu(jVar));
        } else if (b.isPresent() && !TextUtils.isEmpty((CharSequence) b.get())) {
            empty = b.map(C112904gv.f312919a);
        }
        if (empty.isEmpty()) {
            C59104x d4 = f312921a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "StdTxtIconItemRenderer");
            ((C59052c) ((C59052c) d4).mo56372aa(27830)).mo56386p("#renderView: can't derive an IconSource instance");
            hjVar.itemView.setVisibility(8);
            return;
        }
        int a2 = C1878d.m5128a(this.f312922b, R.color.translucent_white_placeholder);
        C112725ae aeVar = new C112725ae();
        aeVar.f312483a = hjVar.f312954b;
        aeVar.f312484b = hjVar.f312953a;
        aeVar.f312486d = Optional.m71637of((C113286bk) empty.get());
        aeVar.mo99702b((String) ((C113421fb) I.get()).mo100066d().get());
        Optional e2 = ((C113421fb) I.get()).mo100067e();
        Objects.requireNonNull(aeVar);
        e2.ifPresent(new C112905gw(aeVar));
        C112925hp hpVar = this.f312926f;
        C112924ho a3 = aeVar.mo99701a();
        a3.mo99704b().setText(hpVar.mo99782a(a3));
        a3.mo99705c().ifPresent(new C112921hl(hpVar, a3, a2));
        hjVar.itemView.setVisibility(0);
    }
}
