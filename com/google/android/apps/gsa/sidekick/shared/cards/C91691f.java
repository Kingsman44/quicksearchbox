package com.google.android.apps.gsa.sidekick.shared.cards;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.p7138b.C90489e;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7174l.C91053a;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91670i;
import com.google.android.apps.gsa.sidekick.shared.p7242k.C91753a;
import com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper;
import com.google.android.apps.gsa.sidekick.shared.util.C91973ax;
import com.google.android.apps.gsa.sidekick.shared.util.C91988g;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9178bn;
import com.google.android.apps.p489g.p494d.C9230dl;
import com.google.android.apps.p489g.p494d.C9253eh;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.p1646ay.C19601c;
import com.google.android.libraries.search.assistant.proactive.p2779j.C36326c;
import com.google.android.libraries.search.assistant.proactive.p2779j.C36327d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.common.p4552o.ajz;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C7878nh;
import com.google.p375ai.p378b.C7886np;
import com.google.p375ai.p378b.C7891nu;
import java.util.ArrayList;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.f */
/* compiled from: PG */
public abstract class C91691f {

    /* renamed from: c */
    private static final C59071e f255777c = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.cards.f");

    /* renamed from: a */
    protected final Context f255778a;

    /* renamed from: b */
    protected final C91692g f255779b;

    protected C91691f(Context context, C91692g gVar) {
        this.f255778a = context;
        this.f255779b = gVar;
    }

    /* renamed from: h */
    private final void mo94057h(C9141ad adVar) {
        byte[] bArr;
        C58976aa aaVar = C58975e.f156826a;
        Uri parse = Uri.parse(adVar.f31550p);
        String queryParameter = parse.getQueryParameter("groupingkey");
        if (TextUtils.isEmpty(queryParameter)) {
            C59104x c = f255777c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) c).mo56372aa(11826)).mo56386p("URI missing the grouping key parameter.");
            return;
        }
        String queryParameter2 = parse.getQueryParameter("opaquetoken");
        if (!TextUtils.isEmpty(queryParameter2)) {
            C59104x c2 = f255777c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) c2).mo56372aa(11825)).mo56386p("URI missing the notification id parameter.");
            bArr = C59326i.f157517e.mo56836k(queryParameter2);
        } else {
            bArr = null;
        }
        try {
            PendingIntent a = C36327d.m64817a(this.f255778a, C58485gu.m89846n(queryParameter), bArr, (String) null, (ajz) null, C58836b.f156633a, (String) null, Instant.EPOCH, 0, false);
            if (a != null) {
                a.send();
                return;
            }
            C59104x c3 = f255777c.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) c3).mo56372aa(11823)).mo56386p("Failed to start OPA intent, got null pendingIntent");
        } catch (PendingIntent.CanceledException e) {
            C59104x c4 = f255777c.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e)).mo56372aa(11824)).mo56386p("Failed to start OPA intent");
        }
    }

    /* renamed from: i */
    private final void mo94058i(C9141ad adVar) {
        Uri parse = Uri.parse(adVar.f31550p);
        try {
            Integer.parseInt(parse.getQueryParameter("grouptype"));
        } catch (NullPointerException | NumberFormatException | UnsupportedOperationException e) {
            C59104x c = f255777c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11831)).mo56389s("Unexpected query parameter value: %s", parse);
        }
        String queryParameter = parse.getQueryParameter("closetPageId");
        InterestLauncherHelper.Options options = new InterestLauncherHelper.Options();
        if (queryParameter != null && !queryParameter.isEmpty()) {
            options.f256343a = queryParameter;
        }
        Context context = this.f255778a;
        C90476a aVar = C91018d.f254254a;
        context.startActivity(InterestLauncherHelper.m150800a(options));
    }

    /* renamed from: j */
    private final void mo94059j(C9141ad adVar) {
        C58976aa aaVar = C58975e.f156826a;
        Uri parse = Uri.parse(adVar.f31550p);
        String queryParameter = parse.getQueryParameter("opaquetoken");
        if (TextUtils.isEmpty(queryParameter)) {
            C59104x c = f255777c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) c).mo56372aa(11835)).mo56386p("URI missing the notification id parameter.");
            return;
        }
        byte[] k = C59326i.f157517e.mo56836k(queryParameter);
        String queryParameter2 = parse.getQueryParameter("groupingkey");
        try {
            C36326c cVar = new C36326c(this.f255778a);
            cVar.f94841a = k;
            cVar.f94844d = queryParameter2;
            PendingIntent a = cVar.mo40105a();
            if (a == null) {
                C59104x c2 = f255777c.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "ClientActionHandler");
                ((C59052c) ((C59052c) c2).mo56372aa(11834)).mo56386p("Failed to build PendingIntent.");
                return;
            }
            a.send();
        } catch (PendingIntent.CanceledException e) {
            C59104x c3 = f255777c.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(11833)).mo56386p("Failed to start OPA intent");
        }
    }

    /* renamed from: a */
    public abstract void mo86194a(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo86195b(C9141ad adVar) {
        C58833ax n = this.f255779b.mo86176n();
        if (n.mo56113h()) {
            ((C91670i) n.mo56107c()).mo86095d(adVar.f31550p);
            return;
        }
        C59104x d = f255777c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ClientActionHandler");
        ((C59052c) ((C59052c) d).mo56372aa(11827)).mo56386p("In handleOpenAmpViewer - amp launcher not found, using handleOpenUrl");
        String a = C91710y.m150215a("now-amp", adVar.f31550p, "amp_url");
        if (a != null) {
            mo86196c(C91988g.m150967d(a, (String) null, C7681g.m22802a(adVar.f31538d), 0));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo86196c(C9141ad adVar) {
        new C91678ag(this.f255779b.mo86171i(), this.f255778a).mo86157b(adVar);
    }

    /* renamed from: d */
    public abstract void mo86197d(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo86198e(C9141ad adVar) {
        new C91679ah(this.f255779b.mo86163c(), this.f255779b.mo86175m()).mo86157b(adVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo86199f(C9141ad adVar) {
        int i;
        String str;
        Uri parse = Uri.parse(adVar.f31550p);
        try {
            i = Integer.parseInt(parse.getQueryParameter("surface"));
        } catch (NumberFormatException | UnsupportedOperationException e) {
            C59104x c = f255777c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11830)).mo56389s("Unexpected surface query parameter value: %s", parse);
            i = 0;
        }
        String str2 = null;
        try {
            str = parse.getQueryParameter("feature");
        } catch (UnsupportedOperationException e2) {
            C59104x c2 = f255777c.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(11829)).mo56389s("Unexpected feature query parameter value: %s", parse);
            str = null;
        }
        try {
            str2 = parse.getQueryParameter("feature_action");
        } catch (UnsupportedOperationException e3) {
            C59104x c3 = f255777c.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(11828)).mo56389s("Unexpected feature action query parameter value: %s", parse);
        }
        C18509a c4 = C18522b.m35986c();
        if (i != 0) {
            c4.mo24027i(Integer.valueOf(i));
        }
        if (str != null) {
            ((C18523c) c4).f52492a = str;
        }
        if (str2 != null) {
            c4.mo24025g(str2);
        }
        Intent a = c4.mo24020b().mo24031a();
        C91097g b = this.f255779b.mo86163c().mo86021b();
        if (b != null) {
            b.mo65090b(a, new C91095e());
        }
    }

    /* renamed from: g */
    public boolean mo86200g(C9141ad adVar) {
        if ((adVar.f31535a & 1) != 0) {
            C9140ac acVar = C9140ac.OPEN_URL;
            C9140ac a = C9140ac.m23674a(adVar.f31537c);
            if (a == null) {
                a = C9140ac.OPEN_URL;
            }
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                mo86196c(adVar);
                return true;
            } else if (ordinal == 1) {
                mo86198e(adVar);
                return true;
            } else if (ordinal == 6) {
                this.f255779b.mo86165e().mo86207a();
                return true;
            } else if (ordinal == 12) {
                new C91686ao(this.f255779b.mo86171i(), this.f255778a).mo86157b(adVar);
                return true;
            } else if (ordinal == 19) {
                Uri parse = Uri.parse(adVar.f31550p);
                String queryParameter = parse.getQueryParameter("q");
                if (!TextUtils.isEmpty(queryParameter)) {
                    String queryParameter2 = parse.getQueryParameter("stick");
                    String queryParameter3 = parse.getQueryParameter("corpus");
                    String queryParameter4 = parse.getQueryParameter("ludocid");
                    String fragment = parse.getFragment();
                    C90489e eVar = (C90489e) C90491g.f252884z.createBuilder();
                    if (queryParameter2 != null) {
                        eVar.copyOnWrite();
                        C90491g gVar = (C90491g) eVar.instance;
                        gVar.f252886a |= 2;
                        gVar.f252888c = queryParameter2;
                    }
                    if (queryParameter3 != null) {
                        eVar.copyOnWrite();
                        C90491g gVar2 = (C90491g) eVar.instance;
                        gVar2.f252886a |= 64;
                        gVar2.f252892g = queryParameter3;
                    }
                    if (queryParameter4 != null) {
                        eVar.copyOnWrite();
                        C90491g gVar3 = (C90491g) eVar.instance;
                        gVar3.f252886a |= 256;
                        gVar3.f252894i = queryParameter4;
                    }
                    if (fragment != null) {
                        eVar.copyOnWrite();
                        C90491g gVar4 = (C90491g) eVar.instance;
                        gVar4.f252886a |= 4;
                        gVar4.f252889d = fragment;
                    }
                    this.f255779b.mo86163c().mo85916a(queryParameter, (C90491g) eVar.build());
                }
                return true;
            } else if (ordinal != 38) {
                if (ordinal != 55) {
                    if (ordinal != 61) {
                        int i = 5;
                        if (ordinal == 15) {
                            ArrayList arrayList = new ArrayList();
                            Uri parse2 = Uri.parse(adVar.f31550p);
                            try {
                                int parseInt = Integer.parseInt(parse2.getQueryParameter("source"));
                                int a2 = C7878nh.m22883a(Integer.parseInt(parse2.getQueryParameter("mode")));
                                if (a2 != 0) {
                                    i = a2;
                                }
                                String queryParameter5 = parse2.getQueryParameter("settings");
                                if (!TextUtils.isEmpty(queryParameter5)) {
                                    String[] split = queryParameter5.split(",");
                                    for (int i2 = 0; i2 < split.length; i2++) {
                                        C7886np a3 = C7886np.m22886a(Integer.parseInt(split[i2]));
                                        if (a3 == null) {
                                            C59104x c = f255777c.mo56225c();
                                            c.mo56378ag(C58975e.f156826a, "ClientActionHandler");
                                            ((C59052c) ((C59052c) c).mo56372aa(11837)).mo56387q("Error getting OptInSettingId for number %d", Integer.parseInt(split[i2]));
                                        } else {
                                            arrayList.add(a3);
                                        }
                                    }
                                }
                                C7891nu a4 = C7891nu.m22887a(parseInt);
                                if (a4 == null) {
                                    a4 = C7891nu.UNKNOWN_OPT_IN_SOURCE;
                                }
                                C91973ax axVar = new C91973ax(a4);
                                axVar.f256475g = i;
                                axVar.f256472d = arrayList;
                                axVar.f256474f = false;
                                mo86197d(axVar.mo86664a());
                            } catch (NumberFormatException unused) {
                                C59104x d = f255777c.mo56226d();
                                d.mo56378ag(C58975e.f156826a, "ClientActionHandler");
                                ((C59052c) ((C59052c) d).mo56372aa(11836)).mo56389s("Unexpected query parameter value: %s", parse2);
                            }
                            return true;
                        } else if (ordinal == 16) {
                            mo94058i(adVar);
                            return true;
                        } else if (ordinal == 34) {
                            Uri parse3 = Uri.parse(adVar.f31550p);
                            if (!parse3.isHierarchical()) {
                                C59104x d2 = f255777c.mo56226d();
                                d2.mo56378ag(C58975e.f156826a, "ClientActionHandler");
                                ((C59052c) ((C59052c) d2).mo56372aa(11840)).mo56389s("Url is not hierarchical: %s", parse3);
                            } else {
                                String queryParameter6 = parse3.getQueryParameter("content");
                                String string = this.f255778a.getString(R.string.copied_to_clipboard);
                                ((ClipboardManager) this.f255778a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(string, queryParameter6));
                                Toast.makeText(this.f255778a, string, 0).show();
                            }
                            return true;
                        } else if (ordinal == 35) {
                            mo86195b(adVar);
                            return true;
                        } else if (ordinal == 41) {
                            mo94059j(adVar);
                            return true;
                        } else if (ordinal != 42) {
                            switch (ordinal) {
                                case 24:
                                    C74554t i3 = C74555u.m120572i();
                                    i3.mo70869c(C9439b.NOW_HOTWORD_CARD);
                                    mo86194a(i3.mo70882h());
                                    return true;
                                case 25:
                                    break;
                                case 26:
                                    ArrayList arrayList2 = new ArrayList();
                                    Uri parse4 = Uri.parse(adVar.f31550p);
                                    try {
                                        int parseInt2 = Integer.parseInt(parse4.getQueryParameter("source"));
                                        int a5 = C7878nh.m22883a(Integer.parseInt(parse4.getQueryParameter("mode")));
                                        if (a5 != 0) {
                                            i = a5;
                                        }
                                        String queryParameter7 = parse4.getQueryParameter("settings");
                                        if (!TextUtils.isEmpty(queryParameter7)) {
                                            String[] split2 = queryParameter7.split(",");
                                            for (int i4 = 0; i4 < split2.length; i4++) {
                                                C7886np a6 = C7886np.m22886a(Integer.parseInt(split2[i4]));
                                                if (a6 == null) {
                                                    C59104x c2 = f255777c.mo56225c();
                                                    c2.mo56378ag(C58975e.f156826a, "ClientActionHandler");
                                                    ((C59052c) ((C59052c) c2).mo56372aa(11839)).mo56387q("Error getting OptInSettingId for number %d", Integer.parseInt(split2[i4]));
                                                } else {
                                                    arrayList2.add(a6);
                                                }
                                            }
                                        }
                                        C7891nu a7 = C7891nu.m22887a(parseInt2);
                                        if (a7 == null) {
                                            a7 = C7891nu.UNKNOWN_OPT_IN_SOURCE;
                                        }
                                        C91973ax axVar2 = new C91973ax(a7);
                                        axVar2.f256475g = i;
                                        axVar2.f256472d = arrayList2;
                                        axVar2.f256474f = false;
                                        Intent a8 = axVar2.mo86664a();
                                        a8.addFlags(268435456);
                                        this.f255779b.mo86171i().mo86240d(this.f255778a, a8);
                                        break;
                                    } catch (NumberFormatException unused2) {
                                        C59104x d3 = f255777c.mo56226d();
                                        d3.mo56378ag(C58975e.f156826a, "ClientActionHandler");
                                        ((C59052c) ((C59052c) d3).mo56372aa(11838)).mo56389s("Unexpected query parameter value: %s", parse4);
                                        break;
                                    }
                                case 27:
                                    if ((adVar.f31535a & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                        C9178bn bnVar = adVar.f31528F;
                                        if (bnVar == null) {
                                            bnVar = C9178bn.f31697c;
                                        }
                                        Context context = this.f255778a;
                                        context.startActivity(C91753a.m150311a(bnVar, context));
                                    }
                                    return true;
                                case 28:
                                    C91690e eVar2 = new C91690e(this);
                                    C9230dl[] dlVarArr = new C9230dl[1];
                                    C9230dl dlVar = adVar.f31547m;
                                    if (dlVar == null) {
                                        dlVar = C9230dl.f31903f;
                                    }
                                    dlVarArr[0] = dlVar;
                                    eVar2.execute(dlVarArr);
                                    return true;
                                case 29:
                                    InterestLauncherHelper.Options options = new InterestLauncherHelper.Options();
                                    Context context2 = this.f255778a;
                                    C90476a aVar = C91018d.f254254a;
                                    context2.startActivity(InterestLauncherHelper.m150800a(options));
                                    return true;
                                case 30:
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    intent.putExtra("log_event", "GoogleNowWeatherCard");
                                    C9253eh ehVar = adVar.f31552r;
                                    if (ehVar == null) {
                                        ehVar = C9253eh.f31995d;
                                    }
                                    if ((ehVar.f31997a & 1) != 0) {
                                        C9253eh ehVar2 = adVar.f31552r;
                                        if (ehVar2 == null) {
                                            ehVar2 = C9253eh.f31995d;
                                        }
                                        C7805kp kpVar = ehVar2.f31998b;
                                        if (kpVar == null) {
                                            kpVar = C7805kp.f27284h;
                                        }
                                        intent.putExtra("location", kpVar.toByteArray());
                                    }
                                    intent.addFlags(268435456);
                                    C9253eh ehVar3 = adVar.f31552r;
                                    if (((ehVar3 == null ? C9253eh.f31995d : ehVar3).f31997a & 2) != 0) {
                                        if (ehVar3 == null) {
                                            ehVar3 = C9253eh.f31995d;
                                        }
                                        intent.putExtra("source", C91053a.m148741a("and.now", ehVar3.f31999c));
                                    }
                                    this.f255778a.startActivity(C19601c.m37394a("WeatherActivity", intent, new ComponentName(this.f255778a, "com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity"), true));
                                    return true;
                                default:
                                    C59104x c3 = f255777c.mo56225c();
                                    c3.mo56378ag(C58975e.f156826a, "ClientActionHandler");
                                    C59052c cVar = (C59052c) ((C59052c) c3).mo56372aa(11841);
                                    C9140ac a9 = C9140ac.m23674a(adVar.f31537c);
                                    if (a9 == null) {
                                        a9 = C9140ac.OPEN_URL;
                                    }
                                    cVar.mo56389s("Unknown client action type in BaseClientActionHandler: %s", a9);
                                    return false;
                            }
                            return true;
                        } else {
                            mo94057h(adVar);
                            return true;
                        }
                    } else {
                        new C91706u(this.f255778a, this.f255779b.mo86171i()).mo86157b(adVar);
                    }
                }
                return true;
            } else {
                mo86199f(adVar);
                return true;
            }
        } else {
            C59104x c4 = f255777c.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "ClientActionHandler");
            ((C59052c) ((C59052c) c4).mo56372aa(11842)).mo56386p("Client action without a type was specified.");
            return false;
        }
    }
}
