package com.google.android.apps.gsa.staticplugins.opa.worker.p8607b;

import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import androidx.core.content.p090a.C1846a;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.assistant.shared.appactions.b.e;
import com.google.android.apps.gsa.assistant.shared.appactions.b.m;
import com.google.android.apps.gsa.assistant.shared.appactions.b.u;
import com.google.android.apps.gsa.assistant.shared.appactions.b.v;
import com.google.android.apps.gsa.assistant.shared.appactions.g.f;
import com.google.android.apps.gsa.assistant.shared.appactions.p5803b.C73805b;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.assistant.shared.appactions.p5807g.C73821h;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84920a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87692aa;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88339y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.permissions.ProxyActivity;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36262a;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36264c;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p3745ab.C48363o;
import com.google.assistant.p3745ab.C48381q;
import com.google.assistant.p3745ab.C48384r;
import com.google.assistant.p3825an.p3830c.p3831a.C49255aa;
import com.google.assistant.p3861at.C49817ad;
import com.google.assistant.p3861at.C49819ae;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49829an;
import com.google.assistant.p3861at.C49830ao;
import com.google.assistant.p3861at.C49840ay;
import com.google.assistant.p3861at.C49845bc;
import com.google.assistant.p3861at.C50436x;
import com.google.assistant.p3861at.C50463y;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.b.k */
/* compiled from: PG */
public final class C114274k extends C86734a implements C84920a {

    /* renamed from: a */
    public static final C59071e f316869a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.b.k");

    /* renamed from: k */
    private static final UriMatcher f316870k;

    /* renamed from: b */
    public final C86124t f316871b;

    /* renamed from: c */
    public final Context f316872c;

    /* renamed from: f */
    public final u f316873f;

    /* renamed from: g */
    public final C22871g f316874g;

    /* renamed from: h */
    public final C85005h f316875h;

    /* renamed from: i */
    public final C68214a f316876i;

    /* renamed from: j */
    public final f f316877j;

    /* renamed from: l */
    private final C90479a f316878l;

    /* renamed from: m */
    private final C91097g f316879m;

    /* renamed from: n */
    private final l f316880n;

    /* renamed from: o */
    private final C22871g f316881o;

    /* renamed from: p */
    private final C86054o f316882p;

    /* renamed from: q */
    private final C68214a f316883q;

    /* renamed from: r */
    private final Optional f316884r;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("assistant.google.com", "/shortcuts/new/uid/*", 1);
        uriMatcher.addURI("assistant.google.com", "/shortcuts/new/package/*", 1);
        uriMatcher.addURI("assistant.google.com", "/shortcuts/view/uid/*", 2);
        uriMatcher.addURI("assistant.google.com", "/shortcuts/view/package/*", 2);
        uriMatcher.addURI("assistant.google.com", "/shortcuts/view/all", 3);
        f316870k = uriMatcher;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114274k(C90479a aVar, C86124t tVar, C91097g gVar, Context context, C85005h hVar, l lVar, i iVar, C73805b bVar, v vVar, C22871g gVar2, C86054o oVar, C22871g gVar3, C68214a aVar2, C68214a aVar3, Optional optional, f fVar) {
        super(C118575h.WORKER_DEEPLINK, "opaappactions");
        this.f316878l = aVar;
        this.f316871b = tVar;
        this.f316879m = gVar;
        this.f316875h = hVar;
        this.f316872c = context;
        this.f316880n = lVar;
        i iVar2 = iVar;
        C73805b bVar2 = bVar;
        v vVar2 = vVar;
        this.f316873f = vVar.a(iVar, bVar);
        this.f316874g = gVar2;
        this.f316882p = oVar;
        this.f316881o = gVar3;
        this.f316883q = aVar2;
        this.f316876i = aVar3;
        this.f316884r = optional;
        this.f316877j = fVar;
    }

    /* renamed from: h */
    public static C47875i m189538h(String str, Uri uri) {
        C47873g gVar = (C47873g) C47875i.f123945g.createBuilder();
        gVar.copyOnWrite();
        C47875i iVar = (C47875i) gVar.instance;
        str.getClass();
        iVar.f123947a = 1;
        iVar.f123948b = str;
        C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
        aVar.mo51701a(uri.toString());
        gVar.copyOnWrite();
        C47868b bVar = (C47868b) aVar.build();
        bVar.getClass();
        ((C47875i) gVar.instance).f123950d = bVar;
        return (C47875i) gVar.build();
    }

    /* renamed from: i */
    public static void m189539i(C49829an anVar, C49826ak akVar, C49845bc bcVar) {
        C49840ay a = C73821h.m108390a(akVar);
        anVar.copyOnWrite();
        C49830ao aoVar = (C49830ao) anVar.instance;
        C49830ao aoVar2 = C49830ao.f129482j;
        a.getClass();
        aoVar.f129492i = a;
        aoVar.f129484a |= 256;
        C49817ad adVar = (C49817ad) C49819ae.f129086e.createBuilder();
        adVar.copyOnWrite();
        C49819ae aeVar = (C49819ae) adVar.instance;
        bcVar.getClass();
        aeVar.f129091d = bcVar;
        aeVar.f129088a |= 2;
        anVar.copyOnWrite();
        C49830ao aoVar3 = (C49830ao) anVar.instance;
        C49819ae aeVar2 = (C49819ae) adVar.build();
        aeVar2.getClass();
        aoVar3.f129486c = aeVar2;
        aoVar3.f129485b = 6;
    }

    /* renamed from: l */
    private final void m189540l(Uri uri) {
        ((C59052c) ((C59052c) f316869a.mo56226d()).mo56372aa(28889)).mo56389s("Unrecognized URI pattern: %s", uri);
        ((C73812a) this.f316883q.mo27525b()).mo65294a(C89849ae.APP_ACTIONS_DEEPLINK_ERROR);
        this.f316881o.mo28212l("Shortcut deeplink error toast", new C114273j(this));
    }

    /* renamed from: m */
    private final void m189541m(Bundle bundle) {
        C91097g gVar = this.f316879m;
        Intent intent = new Intent(this.f316872c, ProxyActivity.class);
        C18509a c = C18522b.m35986c();
        C18523c cVar = (C18523c) c;
        cVar.f52492a = "app_actions";
        cVar.f52493b = bundle;
        gVar.mo65089a(intent.putExtra("android.intent.extra.INTENT", c.mo24020b().mo24031a()));
    }

    /* renamed from: a */
    public final C60870cx mo78586a(C87693ab abVar) {
        int a = C88339y.m142797a(abVar.f237122f);
        if (a != 0 && a == 2) {
            return C2169h.m6027a(new C114272i(this, abVar));
        }
        return C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: b */
    public final C60870cx mo78587b(Uri uri, String str) {
        Optional optional;
        Optional optional2;
        int size;
        ((C59052c) ((C59052c) f316869a.mo56224b()).mo56372aa(28883)).mo56354G("handling deeplink from %s with URI: %s", str, uri);
        if (!this.f316878l.mo84226a() || !this.f316871b.mo79746e(C90014bt.f247173cE)) {
            return C60856cj.m92900i(Optional.empty());
        }
        ((C73812a) this.f316883q.mo27525b()).mo65296c(C89849ae.APP_ACTIONS_DEEPLINK_START);
        int match = f316870k.match(uri);
        if (match == 1) {
            return C60856cj.m92900i(Optional.m71637of(new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.appactions.AppShortcutActivity").setData(uri).putExtra("shortcut_deeplink_calling_package", str)));
        }
        if (match == 2) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null || (size = pathSegments.size()) <= 1 || !pathSegments.get(size - 2).equals("uid")) {
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of("uid/".concat(String.valueOf(pathSegments.get(size - 1))));
            }
            List<String> pathSegments2 = uri.getPathSegments();
            int indexOf = pathSegments2.indexOf("package");
            if (indexOf < 0 || indexOf >= pathSegments2.size() - 1) {
                optional2 = Optional.empty();
            } else {
                optional2 = Optional.m71637of(pathSegments2.get(indexOf + 1));
            }
            if (optional.isPresent()) {
                Bundle bundle = new Bundle();
                bundle.putString("assistant_settings_app_shortcut_agent_url_suffix_extra", (String) optional.get());
                m189541m(bundle);
            } else if (optional2.isPresent()) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("assistant_settings_app_shortcut_package_name_extra", (String) optional2.get());
                m189541m(bundle2);
            } else {
                m189540l(uri);
            }
        } else if (match != 3) {
            m189540l(uri);
        } else {
            m189541m(new Bundle());
        }
        return C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: c */
    public final C60870cx mo78588c(C87693ab abVar) {
        C60870cx cxVar;
        int a = C88339y.m142797a(abVar.f237122f);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            C22871g gVar = this.f316874g;
            u uVar = this.f316873f;
            C49826ak akVar = abVar.f237119c;
            if (akVar == null) {
                akVar = C49826ak.f129462q;
            }
            String str = akVar.f129471h;
            String str2 = abVar.f237120d;
            Optional ofNullable = Optional.ofNullable(this.f316882p.mo79659F());
            C49826ak akVar2 = abVar.f237119c;
            if (akVar2 == null) {
                akVar2 = C49826ak.f129462q;
            }
            return gVar.mo28210j(uVar.f(str, str2, ofNullable, akVar2.f129476m), "App Shortcut Notification", new C114268e(this, abVar));
        } else if (i == 2 || i == 3) {
            C22871g gVar2 = this.f316874g;
            u uVar2 = this.f316873f;
            String str3 = abVar.f237123g;
            if (str3.isEmpty()) {
                cxVar = C60856cj.m92900i(false);
            } else if (!uVar2.c.mo65287c()) {
                cxVar = C60856cj.m92900i(true);
            } else {
                cxVar = uVar2.a.mo28209i(((C42876ab) uVar2.b.mo27525b()).mo46042d(), "shouldLaunchNotification", new m(uVar2, str3));
            }
            return gVar2.mo28210j(cxVar, "Headsup Notification", new C114269f(this, abVar));
        } else {
            throw new AssertionError("Unknown Type");
        }
    }

    /* renamed from: d */
    public final void mo78589d(Intent intent) {
        Optional optional;
        String stringExtra = intent.getStringExtra("appActionsNotificationsInfo");
        if (!C58837ba.m90859h(stringExtra)) {
            try {
                optional = Optional.m71637of((C36265d) C62942bv.parseFrom((C62942bv) C36265d.f94713k, Base64.decode(stringExtra, 10), C62921ba.m95368a()));
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f316869a.mo56226d()).mo56382g(e)).mo56372aa(28888)).mo56386p("Malformed AppActionsNotifications proto");
                optional = Optional.empty();
            }
            if (!optional.isEmpty()) {
                C36265d dVar = (C36265d) optional.get();
                int a = C36264c.m64730a(dVar.f94718d);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i == 1) {
                    C73812a aVar = (C73812a) this.f316883q.mo27525b();
                    aVar.mo65296c(C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_SAVE_CLICKED);
                    C49826ak akVar = dVar.f94716b;
                    if (akVar == null) {
                        akVar = C49826ak.f129462q;
                    }
                    C49829an anVar = (C49829an) C49830ao.f129482j.createBuilder();
                    C63088z zVar = akVar.f129473j;
                    anVar.copyOnWrite();
                    C49830ao aoVar = (C49830ao) anVar.instance;
                    zVar.getClass();
                    aoVar.f129484a |= 64;
                    aoVar.f129490g = zVar;
                    anVar.mo53365a(akVar.f129471h);
                    anVar.copyOnWrite();
                    C49830ao aoVar2 = (C49830ao) anVar.instance;
                    aoVar2.f129487d = C49255aa.m85392a(4);
                    aoVar2.f129484a = 1 | aoVar2.f129484a;
                    C51058ev f = mo101291f(dVar.f94717c);
                    anVar.copyOnWrite();
                    C49830ao aoVar3 = (C49830ao) anVar.instance;
                    f.getClass();
                    aoVar3.f129488e = f;
                    aoVar3.f129484a |= 4;
                    C48363o oVar = (C48363o) C48384r.f125066b.createBuilder();
                    oVar.copyOnWrite();
                    ((C48384r) oVar.instance).f125068a = C48381q.m85221a(4);
                    C48384r rVar = (C48384r) oVar.build();
                    anVar.copyOnWrite();
                    C49830ao aoVar4 = (C49830ao) anVar.instance;
                    rVar.getClass();
                    aoVar4.f129491h = rVar;
                    aoVar4.f129484a |= 128;
                    if ((dVar.f94715a & 128) != 0) {
                        C49845bc bcVar = dVar.f94723i;
                        if (bcVar == null) {
                            bcVar = C49845bc.f129538c;
                        }
                        m189539i(anVar, akVar, bcVar);
                    }
                    new C90873ag(mo101292g((C49830ao) anVar.build()), this.f316874g, "third-party shortcut creation", new C114266c(this, aVar, dVar)).mo85223a(new C114267d(this, aVar, dVar));
                } else if (i == 2) {
                    ((C73812a) this.f316883q.mo27525b()).mo65296c(C89849ae.APP_ACTIONS_NOTIFICATION_SHORTCUT_VIEW_CLICKED);
                    mo101294k(dVar, false);
                } else if (i == 3) {
                    Context context = this.f316872c;
                    C87565h hVar = new C87565h();
                    hVar.f236546aq = true;
                    hVar.f236547ar = dVar.f94719e;
                    ((C87568k) this.f316884r.get()).mo81688b(context, hVar.mo81685a());
                    mo101293j(this.f316873f.b(new e(dVar.f94721g)), "appActionsUsageController#onEducationTried fails.");
                } else if (i == 4) {
                    mo101293j(this.f316873f.c(dVar.f94717c), "appActionsUsageController#onNotificationCancelled fails.");
                } else if (i != 5) {
                    throw new AssertionError("Unknown Type");
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo78590e(C87693ab abVar) {
        int a = C88339y.m142797a(abVar.f237122f);
        if (a != 0 && a == 2) {
            C36262a aVar = (C36262a) C36265d.f94713k.createBuilder();
            aVar.copyOnWrite();
            C36265d dVar = (C36265d) aVar.instance;
            dVar.f94718d = 2;
            dVar.f94715a |= 4;
            C49826ak akVar = abVar.f237119c;
            if (akVar == null) {
                akVar = C49826ak.f129462q;
            }
            aVar.copyOnWrite();
            C36265d dVar2 = (C36265d) aVar.instance;
            akVar.getClass();
            dVar2.f94716b = akVar;
            dVar2.f94715a |= 1;
            String str = abVar.f237120d;
            aVar.copyOnWrite();
            C36265d dVar3 = (C36265d) aVar.instance;
            str.getClass();
            dVar3.f94715a = 2 | dVar3.f94715a;
            dVar3.f94717c = str;
            C87692aa aaVar = abVar.f237118b;
            if (aaVar == null) {
                aaVar = C87692aa.f237046e;
            }
            String str2 = aaVar.f237050c;
            aVar.copyOnWrite();
            C36265d dVar4 = (C36265d) aVar.instance;
            str2.getClass();
            dVar4.f94715a |= 16;
            dVar4.f94720f = str2;
            C48384r rVar = abVar.f237124h;
            if (rVar == null) {
                rVar = C48384r.f125066b;
            }
            aVar.copyOnWrite();
            C36265d dVar5 = (C36265d) aVar.instance;
            rVar.getClass();
            dVar5.f94722h = rVar;
            dVar5.f94715a |= 64;
            if ((abVar.f237117a & 128) != 0) {
                C49845bc bcVar = abVar.f237125i;
                if (bcVar == null) {
                    bcVar = C49845bc.f129538c;
                }
                aVar.copyOnWrite();
                C36265d dVar6 = (C36265d) aVar.instance;
                bcVar.getClass();
                dVar6.f94723i = bcVar;
                dVar6.f94715a |= 128;
            }
            mo101294k((C36265d) aVar.build(), false);
        }
    }

    /* renamed from: f */
    public final C51058ev mo101291f(String str) {
        try {
            PackageInfo packageInfo = this.f316872c.getPackageManager().getPackageInfo(str, 128);
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            String str2 = packageInfo.packageName;
            esVar.copyOnWrite();
            C51058ev evVar = (C51058ev) esVar.instance;
            str2.getClass();
            evVar.f132943a |= 1;
            evVar.f132944b = str2;
            long a = C1846a.m5060a(packageInfo);
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            evVar2.f132943a |= 4;
            evVar2.f132946d = a;
            return (C51058ev) esVar.build();
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f316869a.mo56226d()).mo56382g(e)).mo56372aa(28881)).mo56386p("Invalid Package Name");
            return C51058ev.f132941o;
        }
    }

    /* renamed from: g */
    public final C60870cx mo101292g(C49830ao aoVar) {
        acw acw = (acw) acx.f128971H.createBuilder();
        C50436x xVar = (C50436x) C50463y.f131328c.createBuilder();
        xVar.copyOnWrite();
        C50463y yVar = (C50463y) xVar.instance;
        aoVar.getClass();
        yVar.f131331b = aoVar;
        yVar.f131330a = 1;
        C50463y yVar2 = (C50463y) xVar.build();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        yVar2.getClass();
        acx.f129009z = yVar2;
        acx.f128985b |= 512;
        return this.f316880n.d(this.f316882p.mo79668a(), (acx) acw.build(), 5, TimeUnit.SECONDS, getClass().getSimpleName());
    }

    /* renamed from: j */
    public final void mo101293j(C60870cx cxVar, String str) {
        new C90873ag(cxVar, this.f316874g, "maybeLogError", C114270g.f316864a).mo85223a(new C114271h(str));
    }

    /* renamed from: k */
    public final void mo101294k(C36265d dVar, Boolean bool) {
        Intent className = new Intent().setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.appactions.AppShortcutActivity");
        ProtoParsers.m95531n(className, "app_actions_notifications_key", dVar);
        int a = C36264c.m64730a(dVar.f94718d);
        if (a != 0 && a == 2) {
            className.putExtra("has_app_actions_failure_key", bool);
        }
        this.f316879m.mo65089a(new Intent(this.f316872c, ProxyActivity.class).putExtra("android.intent.extra.INTENT", className));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
