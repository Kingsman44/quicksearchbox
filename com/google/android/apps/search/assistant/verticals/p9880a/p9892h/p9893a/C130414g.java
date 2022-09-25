package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9893a;

import android.content.pm.LauncherApps;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130333h;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130334i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3825an.p3830c.p3831a.C49264aj;
import com.google.assistant.p3825an.p3830c.p3831a.C49265ak;
import com.google.assistant.p3825an.p3830c.p3831a.C49274at;
import com.google.assistant.p3825an.p3830c.p3831a.C49275au;
import com.google.assistant.p3825an.p3830c.p3831a.C49277aw;
import com.google.assistant.p3825an.p3830c.p3831a.C49279ay;
import com.google.assistant.p3825an.p3830c.p3831a.C49319ck;
import com.google.assistant.p3825an.p3830c.p3831a.C49320cl;
import com.google.assistant.p3825an.p3830c.p3831a.C49329f;
import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.a.g */
/* compiled from: PG */
public final class C130414g {

    /* renamed from: a */
    public static final C58974d f357366a = C58974d.m91136j();

    /* renamed from: b */
    public final LauncherApps f357367b;

    /* renamed from: c */
    private final C60887da f357368c;

    /* renamed from: d */
    private final Executor f357369d;

    /* renamed from: e */
    private final C130333h f357370e;

    public C130414g(LauncherApps launcherApps, C60887da daVar, Executor executor, C130333h hVar) {
        this.f357367b = launcherApps;
        this.f357368c = daVar;
        this.f357369d = executor;
        this.f357370e = hVar;
    }

    /* renamed from: c */
    public static Optional m212853c(ShortcutInfo shortcutInfo) {
        if (shortcutInfo == null) {
            return Optional.empty();
        }
        C49329f fVar = (C49329f) C49330g.f127488o.createBuilder();
        String str = shortcutInfo.getPackage();
        fVar.copyOnWrite();
        C49330g gVar = (C49330g) fVar.instance;
        str.getClass();
        gVar.f127490a |= 1;
        gVar.f127491b = str;
        String id = shortcutInfo.getId();
        fVar.copyOnWrite();
        C49330g gVar2 = (C49330g) fVar.instance;
        id.getClass();
        gVar2.f127490a |= 32;
        gVar2.f127496g = id;
        C49274at atVar = (C49274at) C49275au.f127371c.createBuilder();
        String id2 = shortcutInfo.getId();
        atVar.copyOnWrite();
        C49275au auVar = (C49275au) atVar.instance;
        id2.getClass();
        auVar.f127373a = 1;
        auVar.f127374b = id2;
        fVar.copyOnWrite();
        C49330g gVar3 = (C49330g) fVar.instance;
        C49275au auVar2 = (C49275au) atVar.build();
        auVar2.getClass();
        gVar3.f127495f = auVar2;
        gVar3.f127490a |= 16;
        int i = ((Build.VERSION.SDK_INT < 30 || !shortcutInfo.isCached()) && !shortcutInfo.isDynamic()) ? 3 : 4;
        fVar.copyOnWrite();
        C49330g gVar4 = (C49330g) fVar.instance;
        gVar4.f127498i = C49279ay.m85401a(i);
        gVar4.f127490a |= 128;
        fVar.copyOnWrite();
        C49330g gVar5 = (C49330g) fVar.instance;
        gVar5.f127499j = C49277aw.m85399a(3);
        gVar5.f127490a |= 256;
        CharSequence shortLabel = shortcutInfo.getShortLabel();
        if (shortLabel != null) {
            String obj = shortLabel.toString();
            fVar.copyOnWrite();
            C49330g gVar6 = (C49330g) fVar.instance;
            obj.getClass();
            gVar6.f127490a |= 2;
            gVar6.f127492c = obj;
            String obj2 = shortLabel.toString();
            fVar.copyOnWrite();
            C49330g gVar7 = (C49330g) fVar.instance;
            obj2.getClass();
            gVar7.f127490a |= 8;
            gVar7.f127494e = obj2;
        }
        CharSequence longLabel = shortcutInfo.getLongLabel();
        if (longLabel != null) {
            String obj3 = longLabel.toString();
            fVar.copyOnWrite();
            C49330g gVar8 = (C49330g) fVar.instance;
            obj3.getClass();
            gVar8.f127490a |= 4;
            gVar8.f127493d = obj3;
        }
        C58480gp gpVar = new C58480gp(4);
        C58800sl lA = ((C58528ij) Collection.EL.stream((Set) Optional.ofNullable(shortcutInfo.getCategories()).orElse(C58733pz.f156496a)).filter(C130413f.f357365a).collect(C58370cn.f155947b)).iterator();
        while (lA.hasNext()) {
            String str2 = (String) lA.next();
            C49264aj ajVar = (C49264aj) C49265ak.f127342c.createBuilder();
            ajVar.copyOnWrite();
            str2.getClass();
            ((C49265ak) ajVar.instance).f127344a = str2;
            PersistableBundle extras = shortcutInfo.getExtras();
            if (extras == null) {
                gpVar.mo55395g((C49265ak) ajVar.build());
            } else {
                String[] stringArray = extras.getStringArray(str2);
                if (stringArray == null) {
                    gpVar.mo55395g((C49265ak) ajVar.build());
                } else {
                    for (String str3 : stringArray) {
                        String[] stringArray2 = extras.getStringArray(str2 + "/" + str3);
                        if (stringArray2 == null) {
                            C49319ck ckVar = (C49319ck) C49320cl.f127467c.createBuilder();
                            ckVar.copyOnWrite();
                            str3.getClass();
                            ((C49320cl) ckVar.instance).f127469a = str3;
                            ajVar.mo53224a(ckVar);
                        } else {
                            C49319ck ckVar2 = (C49319ck) C49320cl.f127467c.createBuilder();
                            ckVar2.copyOnWrite();
                            str3.getClass();
                            ((C49320cl) ckVar2.instance).f127469a = str3;
                            ckVar2.mo53231a(Arrays.asList(stringArray2));
                            ajVar.mo53224a(ckVar2);
                        }
                    }
                    gpVar.mo55395g((C49265ak) ajVar.build());
                }
            }
        }
        C58485gu f = gpVar.mo55394f();
        if (!f.isEmpty()) {
            fVar.mo53232a(f);
        }
        return Optional.m71637of((C49330g) fVar.build());
    }

    /* renamed from: d */
    private static int m212854d() {
        return Build.VERSION.SDK_INT >= 30 ? 27 : 11;
    }

    /* renamed from: e */
    private final C60870cx m212855e(LauncherApps.ShortcutQuery shortcutQuery) {
        LauncherApps launcherApps = this.f357367b;
        if (launcherApps == null) {
            ((C58970a) ((C58970a) f357366a.mo56226d()).mo56372aa(39435)).mo56386p("LauncherApps handle is null");
            return C60856cj.m92900i(C58485gu.m89845m());
        } else if (!launcherApps.hasShortcutHostPermission()) {
            ((C58970a) ((C58970a) f357366a.mo56226d()).mo56372aa(39434)).mo56386p("AndroidShortcutFetcher is not being called from a package that has permissions to access shortcuts.");
            return C60856cj.m92900i(C58485gu.m89845m());
        } else {
            C130410c cVar = new C130410c(this, shortcutQuery);
            return C60856cj.m92904m(C47810es.m84978r(cVar), this.f357369d);
        }
    }

    /* renamed from: f */
    private final C60870cx m212856f(C60870cx cxVar) {
        C60870cx d = ((C130334i) this.f357370e).f357233a.mo46042d();
        return C47638k.m84753d(d, cxVar).mo51520a(new C130412e(d, cxVar), this.f357368c);
    }

    /* renamed from: a */
    public final C60870cx mo109692a() {
        return m212856f(m212855e(new LauncherApps.ShortcutQuery().setQueryFlags(m212854d())));
    }

    /* renamed from: b */
    public final C60870cx mo109693b(C58528ij ijVar) {
        C60870cx e = m212855e(new LauncherApps.ShortcutQuery().setQueryFlags(m212854d()));
        C130409b bVar = new C130409b(ijVar);
        return m212856f(C60922j.m93044g(e, C47810es.m84963c(bVar), this.f357368c));
    }
}
