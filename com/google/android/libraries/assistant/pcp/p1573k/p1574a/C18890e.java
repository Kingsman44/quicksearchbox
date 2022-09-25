package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123727au;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.libraries.assistant.p1363c.p1451h.C17590a;
import com.google.assistant.p3897e.p3902c.p3907c.C51015df;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.C63618g;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.e */
/* compiled from: PG */
public final /* synthetic */ class C18890e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18890e f53169a = new C18890e();

    private /* synthetic */ C18890e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        C123727au auVar = (C123727au) C123728av.f341753l.createBuilder();
        String packageName = componentName.getPackageName();
        auVar.copyOnWrite();
        C123728av avVar = (C123728av) auVar.instance;
        packageName.getClass();
        avVar.f341755a |= 1;
        avVar.f341756b = packageName;
        String className = componentName.getClassName();
        auVar.copyOnWrite();
        C123728av avVar2 = (C123728av) auVar.instance;
        className.getClass();
        avVar2.f341755a |= 2;
        avVar2.f341757c = className;
        auVar.copyOnWrite();
        C123728av avVar3 = (C123728av) auVar.instance;
        avVar3.f341761g = 1;
        avVar3.f341755a |= 16;
        auVar.copyOnWrite();
        C123728av avVar4 = (C123728av) auVar.instance;
        avVar4.f341762h = 3;
        avVar4.f341755a |= 32;
        C52559wf wfVar = (C52559wf) C52560wg.f137943j.createBuilder();
        C51015df dfVar = (C51015df) C51016dg.f132827g.createBuilder();
        String packageName2 = componentName.getPackageName();
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "Play_media";
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        hVar.f166793a |= 2;
        hVar.f166796d = "app";
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C63618g gVar2 = (C63618g) C63624h.f172070b.createBuilder();
        C63772a aVar = (C63772a) C63775d.f172518h.createBuilder();
        aVar.copyOnWrite();
        C63775d dVar = (C63775d) aVar.instance;
        packageName2.getClass();
        dVar.f172520a |= 4;
        dVar.f172523d = packageName2;
        gVar2.mo59221b(aVar);
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        C63624h hVar2 = (C63624h) gVar2.build();
        hVar2.getClass();
        jVar.f166803b = hVar2;
        jVar.f166802a = 15;
        gVar.copyOnWrite();
        C61746h hVar3 = (C61746h) gVar.instance;
        C61748j jVar2 = (C61748j) iVar.build();
        jVar2.getClass();
        hVar3.f166797e = jVar2;
        hVar3.f166793a |= 4;
        mVar.mo58184c(gVar);
        C61745g gVar3 = (C61745g) C61746h.f166791g.createBuilder();
        gVar3.copyOnWrite();
        C61746h hVar4 = (C61746h) gVar3.instance;
        hVar4.f166793a |= 2;
        hVar4.f166796d = "media_object";
        C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
        C61751m mVar2 = (C61751m) C61752n.f166808f.createBuilder();
        mVar2.copyOnWrite();
        C61752n nVar2 = (C61752n) mVar2.instance;
        nVar2.f166810a |= 4;
        nVar2.f166811b = "Song";
        iVar2.copyOnWrite();
        C61748j jVar3 = (C61748j) iVar2.instance;
        C61752n nVar3 = (C61752n) mVar2.build();
        nVar3.getClass();
        jVar3.f166803b = nVar3;
        jVar3.f166802a = 2;
        gVar3.copyOnWrite();
        C61746h hVar5 = (C61746h) gVar3.instance;
        C61748j jVar4 = (C61748j) iVar2.build();
        jVar4.getClass();
        hVar5.f166797e = jVar4;
        hVar5.f166793a |= 4;
        mVar.mo58184c(gVar3);
        C51805du a = C17590a.m34882a((C61752n) mVar.build());
        dfVar.copyOnWrite();
        C51016dg dgVar = (C51016dg) dfVar.instance;
        a.getClass();
        dgVar.f132833e = a;
        dgVar.f132829a |= 8;
        wfVar.copyOnWrite();
        C52560wg wgVar = (C52560wg) wfVar.instance;
        C51016dg dgVar2 = (C51016dg) dfVar.build();
        dgVar2.getClass();
        wgVar.f137947c = dgVar2;
        wgVar.f137946b = 16;
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String packageName3 = componentName.getPackageName();
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        packageName3.getClass();
        evVar.f132943a |= 1;
        evVar.f132944b = packageName3;
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar2 = (C51058ev) esVar.build();
        evVar2.getClass();
        ghVar.f133013c = evVar2;
        ghVar.f133012b = 1;
        wfVar.copyOnWrite();
        C52560wg wgVar2 = (C52560wg) wfVar.instance;
        C51098gh ghVar2 = (C51098gh) ggVar.build();
        ghVar2.getClass();
        wgVar2.f137949e = ghVar2;
        wgVar2.f137945a |= 4;
        auVar.copyOnWrite();
        C123728av avVar5 = (C123728av) auVar.instance;
        C52560wg wgVar3 = (C52560wg) wfVar.build();
        wgVar3.getClass();
        avVar5.mo106113a();
        avVar5.f341758d.add(wgVar3);
        return (C123728av) auVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
