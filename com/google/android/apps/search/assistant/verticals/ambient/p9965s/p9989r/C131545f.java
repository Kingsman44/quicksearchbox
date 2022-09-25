package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9989r;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83735ag;
import com.google.android.apps.gsa.opa.smartspace.C83736ah;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m.C131428a;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53691ap;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.r.f */
/* compiled from: PG */
public final class C131545f implements C131258a {

    /* renamed from: a */
    public final Context f359424a;

    /* renamed from: b */
    private final C58974d f359425b;

    /* renamed from: c */
    private final C131428a f359426c;

    /* renamed from: d */
    private final boolean f359427d;

    /* renamed from: e */
    private final Set f359428e;

    public C131545f(C130603a aVar, Context context, C131428a aVar2, boolean z, C65603f fVar) {
        this.f359425b = aVar.mo109740b(this);
        this.f359424a = context;
        this.f359426c = aVar2;
        this.f359427d = z;
        this.f359428e = C58528ij.m90006F(fVar.f178307a);
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(C50794cr.ORDER_COFFEE);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        Void voidR = (Void) obj;
        if (!this.f359427d) {
            ((C58970a) ((C58970a) this.f359425b.mo56224b()).mo56372aa(39310)).mo56386p("Cafe card is disabled.");
            return C60856cj.m92900i(Optional.empty());
        }
        Optional findFirst = Collection.EL.stream(hVar.f297214i).map(C131541b.f359420a).filter(new C131542c(C58528ij.m90011K(C53691ap.CAFE, C53691ap.RESTAURANT))).filter(C131543d.f359422a).findFirst();
        if (findFirst.isEmpty()) {
            ((C58970a) ((C58970a) this.f359425b.mo56224b()).mo56372aa(39309)).mo56386p("No cafe nearby.");
            return C60856cj.m92900i(Optional.empty());
        }
        ((C58970a) ((C58970a) this.f359425b.mo56224b()).mo56372aa(39307)).mo56386p("Found a cafe nearby.");
        Optional findFirst2 = Collection.EL.stream(this.f359428e).filter(new C131540a(this)).findFirst();
        if (findFirst2.isPresent()) {
            C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
            C50794cr crVar = C50794cr.ORDER_COFFEE;
            abVar.copyOnWrite();
            C83739ak akVar = (C83739ak) abVar.instance;
            akVar.f228239h = crVar.f132222T;
            akVar.f228232a |= 64;
            String string = this.f359424a.getString(R.string.assistant_aa_pay_cafe_title);
            abVar.copyOnWrite();
            C83739ak akVar2 = (C83739ak) abVar.instance;
            string.getClass();
            akVar2.f228232a |= 2;
            akVar2.f228234c = string;
            String str = ((C53692aq) findFirst.get()).f140944f;
            abVar.copyOnWrite();
            C83739ak akVar3 = (C83739ak) abVar.instance;
            str.getClass();
            akVar3.f228232a |= 4;
            akVar3.f228235d = str;
            C49156z a = this.f359426c.mo110159a();
            abVar.copyOnWrite();
            C83739ak akVar4 = (C83739ak) abVar.instance;
            a.getClass();
            akVar4.f228240i = a;
            akVar4.f228232a |= 128;
            abVar.copyOnWrite();
            C83739ak akVar5 = (C83739ak) abVar.instance;
            akVar5.f228232a |= 256;
            akVar5.f228241j = false;
            String str2 = (String) Optional.ofNullable(this.f359424a.getPackageManager().getLaunchIntentForPackage((String) findFirst2.get())).map(C131544e.f359423a).orElse(BuildConfig.FLAVOR);
            abVar.copyOnWrite();
            C83739ak akVar6 = (C83739ak) abVar.instance;
            str2.getClass();
            akVar6.f228232a |= 32;
            akVar6.f228238g = str2;
            C83735ag agVar = (C83735ag) C83736ah.f228222c.createBuilder();
            String str3 = (String) findFirst2.get();
            agVar.copyOnWrite();
            C83736ah ahVar = (C83736ah) agVar.instance;
            str3.getClass();
            ahVar.f228224a = 2;
            ahVar.f228225b = str3;
            abVar.copyOnWrite();
            C83739ak akVar7 = (C83739ak) abVar.instance;
            C83736ah ahVar2 = (C83736ah) agVar.build();
            ahVar2.getClass();
            akVar7.f228247p = ahVar2;
            akVar7.f228232a |= 8192;
            return C60856cj.m92900i(Optional.m71637of((C83739ak) abVar.build()));
        }
        ((C58970a) ((C58970a) this.f359425b.mo56224b()).mo56372aa(39308)).mo56386p("No cafe app installed.");
        return C60856cj.m92900i(Optional.empty());
    }
}
