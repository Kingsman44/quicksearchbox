package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9986o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83731ac;
import com.google.android.apps.gsa.opa.smartspace.C83734af;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m.C131428a;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53700ay;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4479cg.C58079k;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.o.c */
/* compiled from: PG */
public final class C131525c implements C131258a {

    /* renamed from: a */
    private final C58974d f359390a;

    /* renamed from: b */
    private final Context f359391b;

    /* renamed from: c */
    private final C131428a f359392c;

    /* renamed from: d */
    private final boolean f359393d;

    /* renamed from: e */
    private final Long f359394e;

    /* renamed from: f */
    private final Long f359395f;

    public C131525c(C130603a aVar, Context context, C131428a aVar2, boolean z, Long l, Long l2) {
        this.f359390a = aVar.mo109740b(this);
        this.f359391b = context;
        this.f359392c = aVar2;
        this.f359393d = z;
        this.f359394e = l;
        this.f359395f = l2;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(C50794cr.SHOPPING_LIST);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        Optional optional;
        String str;
        Void voidR = (Void) obj;
        if (!this.f359393d) {
            return C60856cj.m92900i(Optional.empty());
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(hVar.f297214i).map(C131523a.f359388a).filter(C131524b.f359389a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) this.f359390a.mo56224b()).mo56372aa(39302)).mo56386p("No stores nearby.");
            optional = Optional.empty();
        } else {
            ((C58970a) ((C58970a) this.f359390a.mo56224b()).mo56372aa(39300)).mo56387q("%d supported places nearby.", guVar.size());
            C53692aq aqVar = (C53692aq) guVar.get(0);
            if ((aqVar.f140939a & 4096) == 0 || ((long) aqVar.f140948j) >= this.f359395f.longValue()) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                C53700ay ayVar = aqVar.f140945g;
                if (ayVar == null) {
                    ayVar = C53700ay.f140964d;
                }
                C58079k kVar = ayVar.f140966a;
                if (kVar == null) {
                    kVar = C58079k.f155250c;
                }
                objArr[0] = Double.valueOf(kVar.f155252a);
                C53700ay ayVar2 = aqVar.f140945g;
                if (ayVar2 == null) {
                    ayVar2 = C53700ay.f140964d;
                }
                C58079k kVar2 = ayVar2.f140966a;
                if (kVar2 == null) {
                    kVar2 = C58079k.f155250c;
                }
                objArr[1] = Double.valueOf(kVar2.f155253b);
                objArr[2] = this.f359394e;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "geo:%f,%f?z=%d", objArr)));
                intent.setPackage("com.google.android.apps.maps");
                C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
                String string = this.f359391b.getString(R.string.assistant_shopping_mall_title);
                abVar.copyOnWrite();
                C83739ak akVar = (C83739ak) abVar.instance;
                string.getClass();
                akVar.f228232a |= 2;
                akVar.f228234c = string;
                if (aqVar.f140944f.isEmpty()) {
                    str = this.f359391b.getString(R.string.assistant_at_shopping_mall);
                } else {
                    str = aqVar.f140944f;
                }
                abVar.copyOnWrite();
                C83739ak akVar2 = (C83739ak) abVar.instance;
                str.getClass();
                akVar2.f228232a |= 4;
                akVar2.f228235d = str;
                C50794cr crVar = C50794cr.SHOPPING_LIST;
                abVar.copyOnWrite();
                C83739ak akVar3 = (C83739ak) abVar.instance;
                akVar3.f228239h = crVar.f132222T;
                akVar3.f228232a |= 64;
                C49156z a = this.f359392c.mo110159a();
                abVar.copyOnWrite();
                C83739ak akVar4 = (C83739ak) abVar.instance;
                a.getClass();
                akVar4.f228240i = a;
                akVar4.f228232a |= 128;
                abVar.copyOnWrite();
                C83739ak akVar5 = (C83739ak) abVar.instance;
                akVar5.f228232a |= 256;
                akVar5.f228241j = false;
                String uri = intent.toUri(1);
                abVar.copyOnWrite();
                C83739ak akVar6 = (C83739ak) abVar.instance;
                uri.getClass();
                akVar6.f228232a |= 32;
                akVar6.f228238g = uri;
                C83731ac acVar = (C83731ac) C83734af.f228216e.createBuilder();
                acVar.copyOnWrite();
                C83734af afVar = (C83734af) acVar.instance;
                afVar.f228218a |= 1;
                afVar.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_white_24dp.png";
                acVar.copyOnWrite();
                C83734af afVar2 = (C83734af) acVar.instance;
                afVar2.f228220c = 2;
                afVar2.f228218a |= 2;
                acVar.copyOnWrite();
                C83734af afVar3 = (C83734af) acVar.instance;
                afVar3.f228218a |= 4;
                afVar3.f228221d = true;
                abVar.mo77053a(acVar);
                C83731ac acVar2 = (C83731ac) C83734af.f228216e.createBuilder();
                acVar2.copyOnWrite();
                C83734af afVar4 = (C83734af) acVar2.instance;
                afVar4.f228218a |= 1;
                afVar4.f228219b = "https://www.gstatic.com/images/icons/material/system_gm/2x/place_black_24dp.png";
                acVar2.copyOnWrite();
                C83734af afVar5 = (C83734af) acVar2.instance;
                afVar5.f228220c = 1;
                afVar5.f228218a |= 2;
                acVar2.copyOnWrite();
                C83734af afVar6 = (C83734af) acVar2.instance;
                afVar6.f228218a |= 4;
                afVar6.f228221d = true;
                abVar.mo77053a(acVar2);
                optional = Optional.m71637of((C83739ak) abVar.build());
            } else {
                ((C58970a) ((C58970a) this.f359390a.mo56224b()).mo56372aa(39301)).mo56359L("The shopping mall %s has %d child, less than the threshold: %d", aqVar.f140944f, Integer.valueOf(aqVar.f140948j), this.f359395f);
                optional = Optional.empty();
            }
        }
        return C60856cj.m92900i(optional);
    }
}
