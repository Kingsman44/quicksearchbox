package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a.C9861b;
import com.google.android.apps.gsa.assistant.settings.shared.e.b;
import com.google.android.apps.gsa.assistant.settings.shared.e.c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.chip.Chip;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.p3638c.C46752i;
import com.google.apps.tiktok.dataservice.p3638c.C46753j;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.assistant.p3861at.C50264qq;
import com.google.assistant.p3861at.C50266qs;
import com.google.assistant.p3861at.C50270qw;
import com.google.assistant.p3861at.C50272qy;
import com.google.assistant.p3861at.C50282rh;
import com.google.assistant.p3861at.C50286rl;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58819aj;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.text.Collator;
import java.util.HashMap;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ac */
/* compiled from: PG */
public final class C9889ac {

    /* renamed from: a */
    public static final C59071e f33937a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.ae.ac");

    /* renamed from: b */
    public final C9974r f33938b;

    /* renamed from: c */
    public final c f33939c;

    /* renamed from: d */
    public final C86124t f33940d;

    /* renamed from: e */
    public final C69464a f33941e;

    /* renamed from: f */
    public final C9861b f33942f;

    /* renamed from: g */
    public final C46801dp f33943g;

    /* renamed from: h */
    public final C46755l f33944h;

    /* renamed from: i */
    public final C46755l f33945i;

    /* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ac$a */
    /* compiled from: PG */
    final class C9890a implements C46792di {

        /* renamed from: a */
        private final C9889ac f33946a;

        /* renamed from: b */
        private final b f33947b;

        public C9890a(C9889ac acVar, b bVar) {
            this.f33946a = acVar;
            this.f33947b = bVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) C9889ac.f33937a.mo56224b()).mo56372aa(949)).mo56386p("#onError");
            this.f33947b.b(1);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C50264qq qqVar;
            C50264qq qqVar2;
            C50286rl rlVar;
            C50264qq qqVar3;
            ((C59052c) ((C59052c) C9889ac.f33937a.mo56224b()).mo56372aa(950)).mo56386p("#onNewData");
            C9889ac acVar = this.f33946a;
            HashMap hashMap = new HashMap();
            C50282rh rhVar = ((act) obj).f128876C;
            if (rhVar == null) {
                rhVar = C50282rh.f130762c;
            }
            for (C50270qw qwVar : rhVar.f130765b) {
                for (C50272qy qyVar : qwVar.f130730c) {
                    if (qyVar.f130734a == 1) {
                        qqVar = (C50264qq) qyVar.f130735b;
                    } else {
                        qqVar = C50264qq.f130709f;
                    }
                    C50266qs qsVar = qqVar.f130715e;
                    if (qsVar == null) {
                        qsVar = C50266qs.f130716c;
                    }
                    if (qsVar.f130718a == 1) {
                        if (qyVar.f130734a == 1) {
                            qqVar2 = (C50264qq) qyVar.f130735b;
                        } else {
                            qqVar2 = C50264qq.f130709f;
                        }
                        C50266qs qsVar2 = qqVar2.f130715e;
                        if (qsVar2 == null) {
                            qsVar2 = C50266qs.f130716c;
                        }
                        if (qsVar2.f130718a == 1) {
                            rlVar = C50286rl.m85798a(((Integer) qsVar2.f130719b).intValue());
                            if (rlVar == null) {
                                rlVar = C50286rl.PAGE_ID_UNSPECIFIED;
                            }
                        } else {
                            rlVar = C50286rl.PAGE_ID_UNSPECIFIED;
                        }
                        String name = rlVar.name();
                        if (qyVar.f130734a == 1) {
                            qqVar3 = (C50264qq) qyVar.f130735b;
                        } else {
                            qqVar3 = C50264qq.f130709f;
                        }
                        hashMap.put(name, qqVar3);
                    }
                }
            }
            C46755l lVar = acVar.f33944h;
            Stream stream = Collection.EL.stream(acVar.f33940d.mo79745c(C90059dk.f249062aY));
            Objects.requireNonNull(hashMap);
            lVar.mo50772a((List) stream.map(new C9980x(hashMap)).filter(C9981y.f34164a).collect(C58370cn.f155946a));
            acVar.f33945i.mo50772a((List) Collection.EL.stream(hashMap.values()).sorted(Comparator.CC.comparing(C9982z.f34165a, Collator.getInstance())).collect(C58370cn.f155946a));
            this.f33947b.b(0);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C9889ac(C9974r rVar, c cVar, C86124t tVar, C69464a aVar, C9861b bVar, C46801dp dpVar, C9912ay ayVar) {
        this.f33938b = rVar;
        this.f33939c = cVar;
        this.f33940d = tVar;
        this.f33941e = aVar;
        this.f33942f = bVar;
        this.f33943g = dpVar;
        C46753j jVar = new C46753j();
        jVar.f122102a = new C58819aj(ayVar.mo18115a("settings_main_all_section"));
        jVar.mo50771b(C9977u.f34160a);
        jVar.f122103b = new C46752i();
        this.f33945i = jVar.mo50770a();
        C46753j jVar2 = new C46753j();
        jVar2.f122102a = new C58819aj(ayVar.mo18115a("settings_main_top_section"));
        jVar2.mo50771b(C9978v.f34161a);
        jVar2.f122103b = new C46752i();
        this.f33944h = jVar2.mo50770a();
    }

    /* renamed from: a */
    public final void mo18095a() {
        View findViewById = this.f33938b.requireView().findViewById(R.id.all_settings_section);
        TextView textView = (TextView) this.f33938b.requireView().findViewById(R.id.all_settings_title);
        Chip chip = (Chip) this.f33938b.requireView().findViewById(R.id.all_settings_chip);
        if (findViewById.getVisibility() == 8) {
            textView.setVisibility(0);
            findViewById.setVisibility(0);
            chip.setText(R.string.view_less_text);
            chip.mo47725z(R.drawable.quantum_gm_ic_expand_less_gm_grey_24);
            return;
        }
        textView.setVisibility(8);
        findViewById.setVisibility(8);
        chip.setText(R.string.view_more_text);
        chip.mo47725z(R.drawable.quantum_gm_ic_expand_more_gm_grey_24);
    }
}
