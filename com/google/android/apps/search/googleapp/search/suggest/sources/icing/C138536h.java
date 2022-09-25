package com.google.android.apps.search.googleapp.search.suggest.sources.icing;

import android.content.Context;
import android.content.Intent;
import android.content.pm.LauncherActivityInfo;
import android.os.Bundle;
import android.os.Process;
import com.google.android.apps.search.googleapp.search.suggest.C138020al;
import com.google.android.apps.search.googleapp.search.suggest.C138021am;
import com.google.android.apps.search.googleapp.search.suggest.C138022an;
import com.google.android.apps.search.googleapp.search.suggest.C138025aq;
import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138515d;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138518g;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138519h;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138520i;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138521j;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138523l;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138526n;
import com.google.android.enterprise.connectedapps.C142563c;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142586k;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.h */
/* compiled from: PG */
public final /* synthetic */ class C138536h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138537i f376791a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f376792b;

    public /* synthetic */ C138536h(C138537i iVar, C138133o oVar) {
        this.f376791a = iVar;
        this.f376792b = oVar;
    }

    public final C60870cx apply(Object obj) {
        C138030av avVar;
        C138537i iVar = this.f376791a;
        C138133o oVar = this.f376792b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(C138678v.f377195e);
        }
        if (oVar.f375825b.isEmpty()) {
            C138543u uVar = (C138543u) C138678v.f377195e.createBuilder();
            for (String str : iVar.f376796d) {
                List<LauncherActivityInfo> activityList = iVar.f376797e.getActivityList(str, Process.myUserHandle());
                if (activityList.size() != 1) {
                    avVar = null;
                } else {
                    LauncherActivityInfo launcherActivityInfo = activityList.get(0);
                    String uri = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setComponent(launcherActivityInfo.getComponentName()).toUri(1);
                    C138027as asVar = (C138027as) C138030av.f375536m.createBuilder();
                    String obj2 = launcherActivityInfo.getLabel().toString();
                    asVar.copyOnWrite();
                    C138030av avVar2 = (C138030av) asVar.instance;
                    obj2.getClass();
                    avVar2.f375538a |= 1;
                    avVar2.f375539b = obj2;
                    C138029au auVar = C138029au.ON_DEVICE_APP;
                    asVar.copyOnWrite();
                    C138030av avVar3 = (C138030av) asVar.instance;
                    avVar3.f375541d = auVar.f375534n;
                    avVar3.f375538a |= 4;
                    asVar.mo114079a(C64369b.SUBTYPE_ZERO_PREFIX_ICING);
                    C138032ax axVar = C138032ax.APP_STRIP;
                    asVar.copyOnWrite();
                    C138030av avVar4 = (C138030av) asVar.instance;
                    avVar4.f375547k = axVar.f375579B;
                    avVar4.f375538a |= 128;
                    asVar.copyOnWrite();
                    C138030av avVar5 = (C138030av) asVar.instance;
                    avVar5.f375538a |= 64;
                    avVar5.f375546j = 1;
                    C138034az azVar = C138034az.ICING;
                    asVar.copyOnWrite();
                    C138030av avVar6 = (C138030av) asVar.instance;
                    avVar6.f375545i = azVar.f375590i;
                    avVar6.f375538a |= 32;
                    C138020al alVar = (C138020al) C138025aq.f375512e.createBuilder();
                    C138021am amVar = (C138021am) C138022an.f375501e.createBuilder();
                    amVar.copyOnWrite();
                    C138022an anVar = (C138022an) amVar.instance;
                    uri.getClass();
                    anVar.f375503a |= 2;
                    anVar.f375505c = uri;
                    amVar.copyOnWrite();
                    C138022an anVar2 = (C138022an) amVar.instance;
                    str.getClass();
                    anVar2.f375503a |= 4;
                    anVar2.f375506d = str;
                    alVar.copyOnWrite();
                    C138025aq aqVar = (C138025aq) alVar.instance;
                    C138022an anVar3 = (C138022an) amVar.build();
                    anVar3.getClass();
                    aqVar.f375516c = anVar3;
                    aqVar.f375514a |= 2;
                    asVar.copyOnWrite();
                    C138030av avVar7 = (C138030av) asVar.instance;
                    C138025aq aqVar2 = (C138025aq) alVar.build();
                    aqVar2.getClass();
                    avVar7.f375548l = aqVar2;
                    avVar7.f375538a |= 256;
                    avVar = (C138030av) asVar.build();
                }
                if (avVar != null) {
                    uVar.mo114311c(avVar);
                }
            }
            return C60856cj.m92900i((C138678v) uVar.build());
        }
        C138509a aVar = iVar.f376793a;
        String str2 = iVar.f376794b;
        String str3 = iVar.f376795c;
        C138523l lVar = (C138523l) aVar;
        C138526n nVar = lVar.f376778d;
        Context context = ((C142563c) nVar.f376781a).f386843a;
        C138518g gVar = C138518g.f376764a;
        C60870cx a = new C138515d(C138518g.m224953a(((C142563c) nVar.f376781a).f386843a)).f376763a.mo114301a(oVar, str2, str3);
        C138520i a2 = lVar.f376778d.mo114307a();
        C138543u uVar2 = (C138543u) C138678v.f377195e.createBuilder();
        String str4 = oVar.f375825b;
        uVar2.copyOnWrite();
        C138678v vVar = (C138678v) uVar2.instance;
        str4.getClass();
        vVar.f377197a |= 1;
        vVar.f377198b = str4;
        C142568e eVar = new C142568e(C138518g.f376765b, BundlerType.m231188a("com.google.android.apps.search.googleapp.search.suggest.SuggestResponseProto.SuggestResponse"));
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C138518g.f376765b.mo86971c(bundle, "suggestRequest", oVar, BundlerType.m231188a("com.google.android.apps.search.googleapp.search.suggest.SuggestRequestProto.SuggestRequest"));
        C138518g.f376765b.mo86971c(bundle, "stSortingSpec", str2, BundlerType.m231188a("java.lang.String"));
        C138518g.f376765b.mo86971c(bundle, "icingCorpusOverride", str3, BundlerType.m231188a("java.lang.String"));
        C142568e eVar2 = new C142568e(C138518g.f376765b, BundlerType.m231188a("com.google.android.apps.search.googleapp.search.suggest.SuggestResponseProto.SuggestResponse"));
        ((C138519h) a2).f376767a.mo117175b().mo117153e(1391980638012389919L, 0, bundle, eVar2, eVar2.f386859a);
        C142568e.m231170f(eVar2.f386859a, new C142586k(eVar, (C138678v) uVar2.build()));
        SettableFuture settableFuture = eVar.f386859a;
        return C47638k.m84751b(a, settableFuture).mo51520a(new C138521j(lVar, oVar, a, settableFuture), lVar.f376776b);
    }
}
