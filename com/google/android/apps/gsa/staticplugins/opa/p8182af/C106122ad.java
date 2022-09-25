package com.google.android.apps.gsa.staticplugins.opa.p8182af;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90044cw;
import com.google.android.apps.gsa.staticplugins.opa.C108783dq;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28289g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.af.ad */
/* compiled from: PG */
public final class C106122ad extends C0640fb implements C28289g {

    /* renamed from: m */
    private static final C59071e f296143m = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.af.ad");

    /* renamed from: a */
    public final Context f296144a;

    /* renamed from: b */
    public final C86124t f296145b;

    /* renamed from: c */
    public final ae f296146c;

    /* renamed from: d */
    public final C68214a f296147d;

    /* renamed from: e */
    public final l f296148e;

    /* renamed from: f */
    public final Account f296149f;

    /* renamed from: g */
    public final Activity f296150g;

    /* renamed from: h */
    public boolean f296151h = false;

    /* renamed from: i */
    public final C28293k f296152i;

    /* renamed from: j */
    public final C58833ax f296153j;

    /* renamed from: k */
    public final Map f296154k;

    /* renamed from: l */
    public final C108783dq f296155l;

    /* renamed from: n */
    private final ArrayList f296156n;

    public C106122ad(C108783dq dqVar, ArrayList arrayList, C86054o oVar, Context context, Activity activity, C86124t tVar, ae aeVar, C68214a aVar, l lVar, C58833ax axVar) {
        this.f296156n = arrayList;
        this.f296144a = context;
        Account a = oVar.mo79668a();
        a.getClass();
        this.f296149f = a;
        this.f296145b = tVar;
        this.f296146c = aeVar;
        this.f296147d = aVar;
        this.f296148e = lVar;
        this.f296153j = axVar;
        this.f296150g = activity;
        this.f296155l = dqVar;
        C58495hd r = tVar.mo79752r(C90044cw.f248732g);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            int parseInt = Integer.parseInt((String) Map.EL.getOrDefault(r, ((C106124af) arrayList.get(i)).f296165a, "-1"));
            C28292j jVar = new C28292j(87424);
            aqp aqp = jVar.f76974b;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs aqs2 = aqs.f159780k;
            aqs.f159782a |= 2;
            aqs.f159784c = parseInt;
            jVar.mo33794h(1);
            jVar.mo33795i(5);
            arrayList2.add(C28293k.m52908e(jVar, new C28293k[0]));
        }
        C28292j jVar2 = new C28292j(87423);
        jVar2.mo33794h(1);
        this.f296152i = C28293k.m52907d(jVar2, arrayList2);
        this.f296154k = tVar.mo79752r(C90044cw.f248741p);
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return this.f296152i;
    }

    public final int getItemCount() {
        return this.f296156n.size();
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C106121ac acVar = (C106121ac) ghVar;
        if (i < 0 || i >= this.f296156n.size()) {
            ((C59052c) ((C59052c) f296143m.mo56226d()).mo56372aa(24719)).mo56393w("#onBindViewHolder(): Invalid position specified: %d. item list size: %d.", i, this.f296156n.size());
            return;
        }
        C106124af afVar = (C106124af) this.f296156n.get(i);
        Locale forLanguageTag = Locale.forLanguageTag(afVar.f296165a);
        acVar.f296140a.setText(forLanguageTag.getDisplayLanguage(forLanguageTag));
        acVar.f296140a.setTextColor(Color.parseColor(afVar.f296166b));
        if (!TextUtils.equals(forLanguageTag.getLanguage(), "en")) {
            acVar.f296141b.setText(forLanguageTag.getDisplayLanguage(Locale.ENGLISH));
            acVar.f296141b.setTextColor(Color.parseColor(afVar.f296166b));
            acVar.f296141b.setVisibility(0);
        } else {
            acVar.f296141b.setVisibility(8);
        }
        ((GradientDrawable) ((RippleDrawable) acVar.f296142c.getBackground()).getDrawable(0)).setColor(Color.parseColor(afVar.f296167c));
        C28295m.m52919e(acVar.f296142c, ((C28293k) ((C28257a) this.f296152i).f76909b.get(i)).mo33745a());
        acVar.f296142c.setOnClickListener(new C89943l(new C106119aa(this, afVar)));
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C106121ac(LayoutInflater.from(this.f296144a).inflate(R.layout.blocking_language_picker_view_item, viewGroup, false));
    }
}
