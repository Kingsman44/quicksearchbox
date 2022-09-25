package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9205d;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121248l;
import com.google.assistant.p3781ad.p3789d.p3790a.C48552e;
import com.google.assistant.p3781ad.p3789d.p3790a.C48553f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48687av;
import com.google.assistant.p3781ad.p3789d.p3791b.C48688aw;
import com.google.assistant.p3781ad.p3789d.p3791b.C48695bc;
import com.google.assistant.p3781ad.p3789d.p3791b.C48696bd;
import com.google.assistant.p3781ad.p3789d.p3791b.C48701bi;
import com.google.assistant.p3781ad.p3789d.p3791b.C48702bj;
import com.google.assistant.p3781ad.p3789d.p3791b.C48705bm;
import com.google.assistant.p3781ad.p3789d.p3791b.C48706bn;
import com.google.assistant.p3781ad.p3789d.p3791b.C48707bo;
import com.google.assistant.p3781ad.p3789d.p3791b.C48708bp;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.d.m */
/* compiled from: PG */
public final /* synthetic */ class C121362m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C121365p f336987a;

    public /* synthetic */ C121362m(C121365p pVar) {
        this.f336987a = pVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C121365p pVar = this.f336987a;
        String str = ((C121248l) obj).f336799d;
        try {
            C48552e eVar = (C48552e) C48553f.f125431e.createBuilder();
            eVar.copyOnWrite();
            C48553f fVar = (C48553f) eVar.instance;
            fVar.f125436d = 3;
            fVar.f125433a |= 4;
            eVar.copyOnWrite();
            C48553f fVar2 = (C48553f) eVar.instance;
            str.getClass();
            fVar2.f125434b = 2;
            fVar2.f125435c = str;
            C48553f fVar3 = (C48553f) eVar.build();
            C48701bi biVar = (C48701bi) C48702bj.f125992e.createBuilder();
            biVar.copyOnWrite();
            C48702bj bjVar = (C48702bj) biVar.instance;
            str.getClass();
            bjVar.f125994a = 2 | bjVar.f125994a;
            bjVar.f125996c = str;
            biVar.copyOnWrite();
            C48702bj bjVar2 = (C48702bj) biVar.instance;
            fVar3.getClass();
            bjVar2.f125997d = fVar3;
            bjVar2.f125994a |= 4;
            PackageManager packageManager = pVar.f336991b;
            String obj2 = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            biVar.copyOnWrite();
            C48702bj bjVar3 = (C48702bj) biVar.instance;
            obj2.getClass();
            bjVar3.f125994a |= 1;
            bjVar3.f125995b = obj2;
            C48702bj bjVar4 = (C48702bj) biVar.build();
            C48705bm bmVar = (C48705bm) C48706bn.f126002f.createBuilder();
            bmVar.copyOnWrite();
            C48706bn bnVar = (C48706bn) bmVar.instance;
            bjVar4.getClass();
            bnVar.f126005b = bjVar4;
            bnVar.f126004a |= 1;
            C48706bn bnVar2 = (C48706bn) bmVar.build();
            Intent launchIntentForPackage = pVar.f336991b.getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return Optional.empty();
            }
            C48687av avVar = (C48687av) C48688aw.f125962c.createBuilder();
            String uri = launchIntentForPackage.toUri(0);
            avVar.copyOnWrite();
            C48688aw awVar = (C48688aw) avVar.instance;
            uri.getClass();
            awVar.f125964a |= 1;
            awVar.f125965b = uri;
            C48688aw awVar2 = (C48688aw) avVar.build();
            C48695bc bcVar = (C48695bc) C48696bd.f125977e.createBuilder();
            bcVar.copyOnWrite();
            C48696bd bdVar = (C48696bd) bcVar.instance;
            awVar2.getClass();
            bdVar.f125980b = awVar2;
            bdVar.f125979a |= 1;
            C48696bd bdVar2 = (C48696bd) bcVar.build();
            C48707bo boVar = (C48707bo) C48708bp.f126010g.createBuilder();
            C48672ag agVar = C48672ag.APPS_NICKNAME;
            boVar.copyOnWrite();
            C48708bp bpVar = (C48708bp) boVar.instance;
            bpVar.f126013b = agVar.f125915O;
            bpVar.f126012a |= 1;
            boVar.copyOnWrite();
            C48708bp bpVar2 = (C48708bp) boVar.instance;
            bnVar2.getClass();
            bpVar2.f126016e = bnVar2;
            bpVar2.f126012a |= 8;
            boVar.copyOnWrite();
            C48708bp bpVar3 = (C48708bp) boVar.instance;
            bdVar2.getClass();
            bpVar3.f126017f = bdVar2;
            bpVar3.f126012a |= 16;
            return Optional.m71637of((C48708bp) boVar.build());
        } catch (PackageManager.NameNotFoundException unused) {
            return Optional.empty();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
