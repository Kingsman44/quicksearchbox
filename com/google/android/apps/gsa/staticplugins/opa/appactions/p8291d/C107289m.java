package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.core.content.p090a.C1846a;
import com.google.android.apps.gsa.staticplugins.opa.appactions.C107308i;
import com.google.assistant.p3745ab.C48363o;
import com.google.assistant.p3745ab.C48381q;
import com.google.assistant.p3745ab.C48384r;
import com.google.assistant.p3825an.p3830c.p3831a.C49255aa;
import com.google.assistant.p3861at.C49817ad;
import com.google.assistant.p3861at.C49819ae;
import com.google.assistant.p3861at.C49829an;
import com.google.assistant.p3861at.C49830ao;
import com.google.assistant.p3861at.C49840ay;
import com.google.assistant.p3861at.C49845bc;
import com.google.assistant.p3861at.C49851bi;
import com.google.assistant.p3861at.C49860br;
import com.google.assistant.p3861at.C49861bs;
import com.google.assistant.p3861at.C49862bt;
import com.google.assistant.p3861at.C49863bu;
import com.google.assistant.p3861at.C50436x;
import com.google.assistant.p3861at.C50463y;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.m */
/* compiled from: PG */
public final class C107289m implements C107279c {

    /* renamed from: a */
    private static final C59071e f298598a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appactions.d.m");

    /* renamed from: b */
    private final Context f298599b;

    public C107289m(Context context) {
        this.f298599b = context;
    }

    /* renamed from: c */
    private final Optional m178099c(C107308i iVar) {
        if (iVar.mo95855f().isEmpty()) {
            return Optional.empty();
        }
        try {
            PackageInfo packageInfo = this.f298599b.getPackageManager().getPackageInfo((String) iVar.mo95855f().get(), 0);
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            String str = packageInfo.packageName;
            esVar.copyOnWrite();
            C51058ev evVar = (C51058ev) esVar.instance;
            str.getClass();
            evVar.f132943a |= 1;
            evVar.f132944b = str;
            long a = C1846a.m5060a(packageInfo);
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            evVar2.f132943a |= 4;
            evVar2.f132946d = a;
            return Optional.m71637of((C51058ev) esVar.build());
        } catch (PackageManager.NameNotFoundException e) {
            C59104x d = f298598a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ShortcutRequestBuilder");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(23559)).mo56389s("Could not get info about shortcut deeplink caller app: %s", iVar.mo95855f());
            return Optional.empty();
        }
    }

    /* renamed from: d */
    private static Optional m178100d(C107308i iVar) {
        return iVar.mo95862l().map(new C107284h(iVar));
    }

    /* renamed from: a */
    public final C50463y mo95891a(C107308i iVar, boolean z) {
        C48384r rVar;
        C49829an anVar = (C49829an) C49830ao.f129482j.createBuilder();
        int p = iVar.mo95866p();
        anVar.copyOnWrite();
        C49830ao aoVar = (C49830ao) anVar.instance;
        aoVar.f129487d = C49255aa.m85392a(p);
        aoVar.f129484a |= 1;
        Optional d = m178100d(iVar);
        Objects.requireNonNull(anVar);
        d.ifPresent(new C107285i(anVar));
        Optional c = m178099c(iVar);
        Objects.requireNonNull(anVar);
        c.ifPresent(new C107286j(anVar));
        Optional o = iVar.mo95865o();
        Objects.requireNonNull(anVar);
        o.ifPresent(new C107287k(anVar));
        if (iVar.mo95856g().isPresent()) {
            rVar = (C48384r) iVar.mo95856g().get();
        } else {
            C48363o oVar = (C48363o) C48384r.f125066b.createBuilder();
            int i = 5;
            if (iVar.mo95866p() != 5) {
                i = 4;
            }
            oVar.copyOnWrite();
            ((C48384r) oVar.instance).f125068a = C48381q.m85221a(i);
            rVar = (C48384r) oVar.build();
        }
        anVar.copyOnWrite();
        C49830ao aoVar2 = (C49830ao) anVar.instance;
        rVar.getClass();
        aoVar2.f129491h = rVar;
        aoVar2.f129484a |= 128;
        if (iVar.mo95859i().isPresent() && iVar.mo95860j().isPresent()) {
            C49840ay ayVar = (C49840ay) iVar.mo95859i().get();
            anVar.copyOnWrite();
            C49830ao aoVar3 = (C49830ao) anVar.instance;
            ayVar.getClass();
            aoVar3.f129492i = ayVar;
            aoVar3.f129484a |= 256;
            C49817ad adVar = (C49817ad) C49819ae.f129086e.createBuilder();
            C49845bc bcVar = (C49845bc) iVar.mo95860j().get();
            adVar.copyOnWrite();
            C49819ae aeVar = (C49819ae) adVar.instance;
            bcVar.getClass();
            aeVar.f129091d = bcVar;
            aeVar.f129088a |= 2;
            C49819ae aeVar2 = (C49819ae) adVar.build();
            anVar.copyOnWrite();
            C49830ao aoVar4 = (C49830ao) anVar.instance;
            aeVar2.getClass();
            aoVar4.f129486c = aeVar2;
            aoVar4.f129485b = 6;
        } else if (iVar.mo95852d().isPresent()) {
            String str = (String) iVar.mo95852d().get();
            anVar.copyOnWrite();
            C49830ao aoVar5 = (C49830ao) anVar.instance;
            str.getClass();
            aoVar5.f129485b = 4;
            aoVar5.f129486c = str;
        } else if (iVar.mo95861k().isPresent()) {
            C49851bi biVar = (C49851bi) iVar.mo95861k().get();
            anVar.copyOnWrite();
            C49830ao aoVar6 = (C49830ao) anVar.instance;
            biVar.getClass();
            aoVar6.f129486c = biVar;
            aoVar6.f129485b = 10;
        }
        if (z) {
            anVar.copyOnWrite();
            ((C49830ao) anVar.instance).f129489f = C62942bv.emptyProtobufList();
            C50436x xVar = (C50436x) C50463y.f131328c.createBuilder();
            C49830ao aoVar7 = (C49830ao) anVar.build();
            xVar.copyOnWrite();
            C50463y yVar = (C50463y) xVar.instance;
            aoVar7.getClass();
            yVar.f131331b = aoVar7;
            yVar.f131330a = 2;
            return (C50463y) xVar.build();
        }
        Optional h = iVar.mo95857h();
        Objects.requireNonNull(anVar);
        h.ifPresent(new C107288l(anVar));
        C50436x xVar2 = (C50436x) C50463y.f131328c.createBuilder();
        C49830ao aoVar8 = (C49830ao) anVar.build();
        xVar2.copyOnWrite();
        C50463y yVar2 = (C50463y) xVar2.instance;
        aoVar8.getClass();
        yVar2.f131331b = aoVar8;
        yVar2.f131330a = 1;
        return (C50463y) xVar2.build();
    }

    /* renamed from: b */
    public final C49863bu mo95892b(C107308i iVar) {
        C49861bs bsVar = (C49861bs) C49862bt.f129566e.createBuilder();
        Optional e = iVar.mo95853e();
        Objects.requireNonNull(bsVar);
        e.ifPresent(new C107280d(bsVar));
        Optional h = iVar.mo95857h();
        Objects.requireNonNull(bsVar);
        h.ifPresent(new C107281e(bsVar));
        Optional d = m178100d(iVar);
        Objects.requireNonNull(bsVar);
        d.ifPresent(new C107282f(bsVar));
        C49860br brVar = (C49860br) C49863bu.f129572f.createBuilder();
        brVar.copyOnWrite();
        C49863bu buVar = (C49863bu) brVar.instance;
        buVar.f129577d = C49255aa.m85392a(5);
        buVar.f129574a |= 1;
        C49862bt btVar = (C49862bt) bsVar.build();
        brVar.copyOnWrite();
        C49863bu buVar2 = (C49863bu) brVar.instance;
        btVar.getClass();
        buVar2.f129576c = btVar;
        buVar2.f129575b = 3;
        Optional c = m178099c(iVar);
        Objects.requireNonNull(brVar);
        c.ifPresent(new C107283g(brVar));
        return (C49863bu) brVar.build();
    }
}
