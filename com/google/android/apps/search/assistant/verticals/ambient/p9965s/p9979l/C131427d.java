package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9979l;

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
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.p4479cg.C58079k;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.l.d */
/* compiled from: PG */
public final class C131427d implements C131258a {

    /* renamed from: a */
    private final C58974d f359240a;

    /* renamed from: b */
    private final C131428a f359241b;

    /* renamed from: c */
    private final Context f359242c;

    /* renamed from: d */
    private final boolean f359243d;

    public C131427d(C130603a aVar, C131428a aVar2, Context context, boolean z) {
        this.f359240a = aVar.mo109740b(this);
        this.f359241b = aVar2;
        this.f359242c = context;
        this.f359243d = z;
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(C50794cr.RESTAURANT);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        Optional optional;
        Optional optional2;
        Void voidR = (Void) obj;
        if (!this.f359243d) {
            ((C58970a) ((C58970a) this.f359240a.mo56224b()).mo56372aa(39251)).mo56386p("Restaurant producer is disabled.");
            return C60856cj.m92900i(Optional.empty());
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(hVar.f297214i).map(C131424a.f359237a).filter(C131425b.f359238a).filter(C131426c.f359239a).collect(C58370cn.f155946a);
        if (guVar.size() != 1) {
            ((C58970a) ((C58970a) this.f359240a.mo56224b()).mo56372aa(39250)).mo56386p(true != guVar.isEmpty() ? "Too many restaurants are nearby" : "No restaurants nearby.");
            return C60856cj.m92900i(Optional.empty());
        }
        C53692aq aqVar = (C53692aq) guVar.get(0);
        ((C58970a) ((C58970a) this.f359240a.mo56224b()).mo56372aa(39252)).mo56389s("Generating a card for %s", aqVar);
        C8242v vVar = aqVar.f140942d;
        if (vVar == null) {
            vVar = C8242v.f28952d;
        }
        C53700ay ayVar = aqVar.f140945g;
        if (ayVar == null) {
            ayVar = C53700ay.f140964d;
        }
        C58079k kVar = ayVar.f140966a;
        if (kVar == null) {
            kVar = C58079k.f155250c;
        }
        Intent data = new Intent("android.intent.action.VIEW").setPackage("com.google.android.apps.maps").setData(Uri.parse(String.format(Locale.US, "https://www.google.com/maps/@%f,%f/data=!4m2!3m1!1s%s", new Object[]{Double.valueOf(kVar.f155252a), Double.valueOf(kVar.f155253b), String.format("0x%x:0x%x", new Object[]{Long.valueOf(vVar.f28955b), Long.valueOf(vVar.f28956c)})})));
        if (data.resolveActivity(this.f359242c.getPackageManager()) == null) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(data);
        }
        if (optional.isEmpty()) {
            ((C58970a) ((C58970a) this.f359240a.mo56224b()).mo56372aa(39253)).mo56386p("Could not generate Google Maps intent");
            optional2 = Optional.empty();
        } else {
            C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
            C50794cr crVar = C50794cr.RESTAURANT;
            abVar.copyOnWrite();
            C83739ak akVar = (C83739ak) abVar.instance;
            akVar.f228239h = crVar.f132222T;
            akVar.f228232a |= 64;
            String str = aqVar.f140944f;
            abVar.copyOnWrite();
            C83739ak akVar2 = (C83739ak) abVar.instance;
            str.getClass();
            akVar2.f228232a |= 2;
            akVar2.f228234c = str;
            abVar.copyOnWrite();
            C83739ak akVar3 = (C83739ak) abVar.instance;
            akVar3.f228232a |= 256;
            akVar3.f228241j = false;
            C49156z a = this.f359241b.mo110159a();
            abVar.copyOnWrite();
            C83739ak akVar4 = (C83739ak) abVar.instance;
            a.getClass();
            akVar4.f228240i = a;
            akVar4.f228232a |= 128;
            String uri = ((Intent) optional.get()).toUri(1);
            abVar.copyOnWrite();
            C83739ak akVar5 = (C83739ak) abVar.instance;
            uri.getClass();
            akVar5.f228232a |= 32;
            akVar5.f228238g = uri;
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
            optional2 = Optional.m71637of((C83739ak) abVar.build());
        }
        return C60856cj.m92900i(optional2);
    }
}
