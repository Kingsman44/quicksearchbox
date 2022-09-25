package com.google.android.apps.gsa.staticplugins.recently.monet.p8686a;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84836c;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87360a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6909a.C87361b;
import com.google.android.apps.gsa.search.core.preferences.C86291ag;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7103t.C90283b;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116128a;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116129b;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116132e;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.SnackbarData;
import com.google.android.apps.gsa.staticplugins.recently.p8682e.C116075c;
import com.google.android.apps.gsa.staticplugins.recently.p8683f.C116080a;
import com.google.android.apps.gsa.staticplugins.recently.p8683f.C116083d;
import com.google.android.apps.gsa.staticplugins.recently.p8683f.C116085f;
import com.google.android.apps.gsa.staticplugins.recently.p8683f.C116087h;
import com.google.android.apps.gsa.staticplugins.recently.p8683f.C116088i;
import com.google.android.apps.gsa.staticplugins.recently.p8684g.C116090a;
import com.google.android.apps.gsa.staticplugins.recently.timeline.C116199b;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Group;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1875j.C22834e;
import com.google.android.libraries.gsa.p1875j.C22838i;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.gsa.p1875j.C22844o;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4570p.C60345aa;
import com.google.common.p4552o.p4570p.C60346ab;
import com.google.common.p4552o.p4570p.C60398s;
import com.google.common.p4552o.p4570p.C60399t;
import com.google.common.p4552o.p4570p.C60401v;
import com.google.common.p4552o.p4570p.C60403x;
import com.google.common.p4552o.p4570p.C60405z;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p3186j$.net.URLEncoder;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.a.aa */
/* compiled from: PG */
public final class C116100aa extends C23056g implements C116129b, C87360a, C87361b {

    /* renamed from: a */
    public static final C59071e f321929a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.monet.a.aa");

    /* renamed from: b */
    public static final long f321930b = (-TimeUnit.DAYS.toMicros(7));

    /* renamed from: t */
    private static final ClassLoader f321931t = C116100aa.class.getClassLoader();

    /* renamed from: c */
    public final C116132e f321932c;

    /* renamed from: d */
    public final SharedPreferences f321933d;

    /* renamed from: e */
    public final Context f321934e;

    /* renamed from: f */
    public final C86124t f321935f;

    /* renamed from: g */
    public final C22871g f321936g;

    /* renamed from: h */
    public final C116075c f321937h;

    /* renamed from: i */
    public final C116087h f321938i;

    /* renamed from: j */
    public final C85089a f321939j;

    /* renamed from: k */
    public final C84836c f321940k;

    /* renamed from: l */
    public final C86054o f321941l;

    /* renamed from: m */
    public final C116102ac f321942m;

    /* renamed from: n */
    public final C116115n f321943n;

    /* renamed from: o */
    public final C91748d f321944o;

    /* renamed from: p */
    public final C116090a f321945p;

    /* renamed from: q */
    public C60870cx f321946q;

    /* renamed from: r */
    public C60870cx f321947r;

    /* renamed from: s */
    public long f321948s;

    /* renamed from: u */
    private final C22871g f321949u;

    /* renamed from: v */
    private final C89037bh f321950v;

    /* renamed from: w */
    private final C58833ax f321951w;

    /* renamed from: x */
    private final C86052m f321952x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116100aa(C23052c cVar, C116132e eVar, SharedPreferences sharedPreferences, Context context, C22871g gVar, C22871g gVar2, C85089a aVar, C84836c cVar2, C86054o oVar, C116102ac acVar, C89037bh bhVar, C116115n nVar, C116090a aVar2, C86124t tVar, C86291ag agVar, C116087h hVar, C58833ax axVar, C91748d dVar, C84486a aVar3) {
        super(cVar);
        C22871g gVar3 = gVar;
        C86054o oVar2 = oVar;
        C86124t tVar2 = tVar;
        C116087h hVar2 = hVar;
        this.f321932c = eVar;
        this.f321933d = sharedPreferences;
        this.f321934e = context;
        this.f321935f = tVar2;
        this.f321936g = gVar3;
        this.f321949u = gVar2;
        this.f321939j = aVar;
        this.f321940k = cVar2;
        this.f321941l = oVar2;
        this.f321942m = acVar;
        this.f321950v = bhVar;
        this.f321943n = nVar;
        this.f321945p = aVar2;
        this.f321951w = axVar;
        this.f321938i = hVar2;
        this.f321944o = dVar;
        C58833ax.m90834k(tVar);
        C116126y yVar = new C116126y(this, gVar3, eVar);
        this.f321952x = yVar;
        oVar2.mo79675i(yVar);
        C23052c cVar3 = cVar;
        C116075c cVar4 = new C116075c(context, new C116118q(this, cVar), aVar3.mo78205l() || aVar3.mo78207n());
        this.f321937h = cVar4;
        cVar4.mo102457b(hVar2);
        cVar4.mo102457b(new C116080a());
        if (!agVar.f233331b.getBoolean("use_recently", true)) {
            cVar4.mo102457b(new C116088i());
        }
        ((C23251a) eVar.mo102505d()).mo28730f(Long.valueOf(TimeUnit.DAYS.toMillis(tVar2.mo79743a(C90110fh.f250671ba))), false);
        ((C23251a) eVar.mo102509h()).mo28730f(-1, false);
        ((C23251a) eVar.mo102506e()).mo28730f(-1, false);
    }

    /* renamed from: p */
    private final String m192513p() {
        Account a = this.f321941l.mo79668a();
        if (a != null) {
            return a.name;
        }
        return null;
    }

    /* renamed from: q */
    private final void m192514q(int i) {
        this.f321949u.mo28212l("showToastMessage", new C116119r(this, i));
    }

    /* renamed from: a */
    public final void mo81029a() {
        mo102492i(m192513p());
    }

    /* renamed from: b */
    public final void mo81030b() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f321932c.mo102512k()).f63720e;
        if (axVar.mo56113h() && ((SnackbarData) axVar.mo56107c()).f322030a) {
            mo102493j();
        }
    }

    /* renamed from: e */
    public final void mo102489e() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f321932c.mo102512k()).f63720e;
        if (axVar.mo56113h()) {
            SnackbarData snackbarData = (SnackbarData) axVar.mo56107c();
            ((C23251a) this.f321932c.mo102512k()).mo28730f(C58833ax.m90834k(new SnackbarData(false, snackbarData.f322031b, snackbarData.f322032c, snackbarData.f322033d, snackbarData.f322034e, snackbarData.f322035f)), false);
        }
    }

    /* renamed from: f */
    public final void mo102490f(String str, Bundle bundle) {
        C22845p pVar;
        bundle.setClassLoader(f321931t);
        int i = 0;
        if ("ACTION_REMOVE_GROUP".equals(str)) {
            ArrayList arrayList = new ArrayList();
            C116199b bVar = new C116199b((Group) bundle.getParcelable("KEY_SNACKBAR_DATA"));
            while (bVar.hasNext()) {
                C22845p a = bVar.next();
                if (Timeline.m192672c(a)) {
                    arrayList.add(Long.valueOf(a.f62893b));
                }
            }
            C85089a aVar = this.f321939j;
            long[] jArr = new long[arrayList.size()];
            while (i < arrayList.size()) {
                jArr[i] = ((Long) arrayList.get(i)).longValue();
                i++;
            }
            aVar.mo78704h(jArr, m192513p());
        } else if ("ACTION_REMOVE_ENTRY".equals(str)) {
            C22845p pVar2 = (C22845p) C23245b.m43557b((ProtoParcelable) bundle.getParcelable("KEY_SNACKBAR_DATA"), C22845p.f62890o.getParserForType(), C62921ba.m95368a(), true);
            if (pVar2 != null && Timeline.m192672c(pVar2)) {
                this.f321939j.mo78704h(new long[]{pVar2.f62893b}, m192513p());
            }
        } else if ("ACTION_ADD_GROUP".equals(str)) {
            Group group = (Group) bundle.getParcelable("KEY_SNACKBAR_DATA");
            if (C116087h.m192471h(group)) {
                this.f321938i.mo102474d(new C116085f(group));
            } else {
                C116075c cVar = this.f321937h;
                C116199b bVar2 = new C116199b(group);
                while (bVar2.hasNext()) {
                    C22845p a2 = bVar2.next();
                    if (Timeline.m192672c(a2)) {
                        cVar.mo102456a(a2);
                        i = 1;
                    }
                }
                if (i != 0) {
                    cVar.mo102460e();
                }
            }
        } else if ("ACTION_ADD_ENTRY".equals(str) && (pVar = (C22845p) C23245b.m43557b((ProtoParcelable) bundle.getParcelable("KEY_SNACKBAR_DATA"), C22845p.f62890o.getParserForType(), C62921ba.m95368a(), true)) != null) {
            if (Timeline.m192672c(pVar)) {
                C116075c cVar2 = this.f321937h;
                cVar2.mo102456a(pVar);
                cVar2.mo102460e();
            } else if (C116087h.m192468e(pVar)) {
                this.f321938i.mo102474d(new C116083d(pVar));
            }
        }
        mo102489e();
    }

    /* renamed from: h */
    public final void mo102491h() {
        if (!this.f321933d.getBoolean("has_shown_remove_item_dialog", false)) {
            ((C23251a) this.f321932c.mo102504c()).mo28730f(C58833ax.m90834k(C116128a.REMOVE_ITEM_DIALOG), false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo102492i(String str) {
        this.f321948s = SystemClock.uptimeMillis();
        new C90873ag(this.f321939j.mo78699c(str), this.f321936g, "On Recently data loaded", new C116116o(this)).mo85223a(new C116117p(this));
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        C58833ax axVar = (C58833ax) ((C23251a) this.f321932c.mo102513l()).f63720e;
        if (axVar.mo56113h()) {
            Timeline timeline = (Timeline) axVar.mo56107c();
            int i = 0;
            while (true) {
                Group[] groupArr = timeline.f322178a;
                if (i < groupArr.length) {
                    C116075c cVar = this.f321937h;
                    Group group = groupArr[i];
                    cVar.mo102459d(group, group.f322176g);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        ((C59052c) ((C59052c) f321929a.mo56224b()).mo56372aa(30899)).mo56386p("onCreate");
        C90283b bVar = C90283b.f252156c;
        try {
            bVar = (C90283b) C62942bv.parseFrom((C62942bv) C90283b.f252156c, protoParcelable.mo28513b());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f321929a.mo56225c()).mo56382g(e)).mo56372aa(30894)).mo56386p("Failure parsing ProtoParcelable in onCreate");
        }
        if ((bVar.f252158a & 1) != 0) {
            int i = bVar.f252159b;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = i;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        ((C23251a) this.f321932c.mo102511j()).mo28730f(false, false);
        C60870cx b = this.f321939j.mo78698b();
        C22871g gVar = this.f321936g;
        C23251a aVar = (C23251a) this.f321932c.mo102508g();
        Objects.requireNonNull(aVar);
        new C90873ag(b, gVar, "On screenshot directory loaded", new C116120s(aVar)).mo85223a(C116121t.f322017a);
        String p = m192513p();
        C23251a aVar2 = (C23251a) this.f321932c.mo102503b();
        if (p == null) {
            p = "notLoggedIn";
        }
        aVar2.mo28730f(p, false);
        if (!this.f321935f.mo79746e(C90110fh.f250675be) && !TextUtils.isEmpty(this.f321935f.mo79758x(C90110fh.f250674bd))) {
            ((C23251a) this.f321932c.mo102510i()).mo28730f(true, false);
        }
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        mo102492i(m192513p());
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f321943n.mo102514a();
        C58833ax axVar = (C58833ax) ((C23251a) this.f321932c.mo102512k()).f63720e;
        if (axVar.mo56113h()) {
            SnackbarData snackbarData = (SnackbarData) axVar.mo56107c();
            if (snackbarData.f322030a) {
                mo102490f(snackbarData.f322034e, snackbarData.f322035f);
            }
        }
        this.f321941l.mo79681o(this.f321952x);
        mo102495l();
    }

    /* renamed from: j */
    public final void mo102493j() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f321932c.mo102512k()).f63720e;
        if (axVar.mo56113h() && ((SnackbarData) axVar.mo56107c()).f322030a) {
            SnackbarData snackbarData = (SnackbarData) axVar.mo56107c();
            mo102490f(snackbarData.f322034e, snackbarData.f322035f);
        }
    }

    /* renamed from: k */
    public final void mo102494k(C22845p pVar) {
        Intent intent;
        Intent intent2;
        String str;
        int a;
        int a2;
        int a3;
        if (!Timeline.m192671b(pVar)) {
            C89062r b = this.f321950v.mo27377b();
            if (b == null || !b.mo83040a()) {
                int a4 = C22840k.m42693a(pVar.f62894c);
                if (a4 == 0) {
                    a4 = 1;
                }
                int i = a4 - 1;
                if (i == 1 ? (a3 = C22834e.m42692a(pVar.f62902k)) == 0 || a3 != 3 : i != 12) {
                    m192514q(R.string.recently_entry_interaction_offline);
                    return;
                }
            }
            if ((pVar.f62892a & 8) == 0) {
                m192514q(R.string.recently_entry_interaction_voice_query);
            } else if (!this.f321951w.mo56113h() || !((a = C22840k.m42693a(pVar.f62894c)) == 0 || a == 1 || ((a2 = C22840k.m42693a(pVar.f62894c)) != 0 && a2 == 12))) {
                C116102ac acVar = this.f321942m;
                int i2 = pVar.f62894c;
                int a5 = C22840k.m42693a(i2);
                if (a5 == 0) {
                    a5 = 1;
                }
                int i3 = a5 - 1;
                if (i3 != 0) {
                    if (i3 != 1) {
                        switch (i3) {
                            case 10:
                                C22838i iVar = pVar.f62901j;
                                if (iVar == null) {
                                    iVar = C22838i.f62869h;
                                }
                                if (iVar.f62877g != 4 || (iVar.f62871a & 8) == 0) {
                                    C91097g gVar = acVar.f321971c;
                                    if (((C84486a) acVar.f321972d.mo27525b()).mo78207n()) {
                                        intent2 = acVar.mo102499b(pVar.f62896e, (String) null);
                                    } else {
                                        intent2 = C116102ac.m192534a(pVar.f62896e, (String) null);
                                    }
                                    gVar.mo65089a(intent2);
                                    return;
                                }
                                C91097g gVar2 = acVar.f321971c;
                                Uri parse = Uri.parse(iVar.f62875e);
                                int i4 = iVar.f62876f;
                                Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                                intent3.putExtra("full_screen", true);
                                intent3.putExtra("hide_status_bar", true);
                                intent3.putExtra("screen_orientation", i4);
                                gVar2.mo65089a(C87574a.f236603a.mo83277a(intent3));
                                return;
                            case 11:
                                break;
                            case 12:
                                return;
                            default:
                                int a6 = C22840k.m42693a(i2);
                                if (a6 != 0) {
                                    switch (a6) {
                                        case 1:
                                            break;
                                        case 2:
                                            str = "WEBPAGE";
                                            break;
                                        case 4:
                                            str = "ONBOARDING_INTRO";
                                            break;
                                        case 5:
                                            str = "ONBOARDING_FIND";
                                            break;
                                        case 6:
                                            str = "ONBOARDING_COMPARE";
                                            break;
                                        case 7:
                                            str = "ONBOARDING_SWIPE_UP";
                                            break;
                                        case 8:
                                            str = "ONBOARDING_SEARCH_ON";
                                            break;
                                        case 9:
                                            str = "MY_ACTIVITY";
                                            break;
                                        case 11:
                                            str = "DOODLE";
                                            break;
                                        case 12:
                                            str = "PENDING_SRP";
                                            break;
                                        case 13:
                                            str = "UNREAD_SRP";
                                            break;
                                        case 14:
                                            str = "RECENTLY_DISABLED";
                                            break;
                                        case 16:
                                            str = "CCT_ACCOUNT_MISMATCH";
                                            break;
                                        default:
                                            str = "null";
                                            break;
                                    }
                                }
                                str = "SRP";
                                throw new IllegalStateException("All cases should be handled. Unknown entry type: ".concat(str));
                        }
                    } else {
                        C91097g gVar3 = acVar.f321971c;
                        C22844o oVar = pVar.f62897f;
                        if (oVar == null) {
                            oVar = C22844o.f62884e;
                        }
                        String str2 = oVar.f62887b;
                        String str3 = pVar.f62896e;
                        Intent intent4 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                        intent4.addCategory("android.intent.category.BROWSABLE");
                        intent4.putExtra("recently_webpage_query", str3);
                        intent4.putExtra("com.google.android.apps.gsa.customtabs.SOURCE", 10);
                        gVar3.mo65089a(intent4);
                        return;
                    }
                }
                C91097g gVar4 = acVar.f321971c;
                if (((C84486a) acVar.f321972d.mo27525b()).mo78207n()) {
                    intent = acVar.mo102499b(pVar.f62896e, acVar.mo102500c(pVar));
                } else {
                    intent = C116102ac.m192534a(pVar.f62896e, acVar.mo102500c(pVar));
                }
                gVar4.mo65089a(intent);
            } else {
                String c = this.f321942m.mo102500c(pVar);
                Query aE = Query.f252741b.mo84268aE(pVar.f62896e, false);
                if (c != null) {
                    aE = aE.mo84305aq(c);
                }
                ((C87348a) this.f321951w.mo56107c()).mo81004c(aE);
            }
        }
    }

    /* renamed from: l */
    public final void mo102495l() {
        C60870cx cxVar = this.f321946q;
        if (cxVar != null) {
            this.f321940k.mo78520a(cxVar);
            this.f321946q = null;
        }
        C60870cx cxVar2 = this.f321947r;
        if (cxVar2 != null) {
            this.f321940k.mo78520a(cxVar2);
            this.f321947r = null;
        }
    }

    /* renamed from: m */
    public final void mo102496m(String str) {
        String str2;
        C116090a aVar = this.f321945p;
        C60345aa aaVar = (C60345aa) C60346ab.f163331j.createBuilder();
        aaVar.copyOnWrite();
        C60346ab abVar = (C60346ab) aaVar.instance;
        abVar.f163338f = 3;
        abVar.f163333a |= 64;
        C60398s sVar = C60398s.f163445a;
        aaVar.copyOnWrite();
        C60346ab abVar2 = (C60346ab) aaVar.instance;
        sVar.getClass();
        abVar2.f163336d = sVar;
        abVar2.f163333a |= 4;
        aVar.mo102476b((C60346ab) aaVar.build());
        ((C23251a) this.f321932c.mo102504c()).mo28730f(C58833ax.m90834k(C116128a.SIGN_IN_DIALOG), false);
        C116115n nVar = this.f321943n;
        C116124w wVar = new C116124w(this);
        if (nVar.f322009d == null) {
            Account a = nVar.f322007b.mo79668a();
            if (a == null) {
                nVar.mo102515b((Account) null, (String) null, str, wVar);
                return;
            }
            C86054o oVar = nVar.f322007b;
            if (TextUtils.isEmpty(str)) {
                str2 = BuildConfig.FLAVOR;
            } else {
                str2 = String.format("?q=%s", new Object[]{URLEncoder.encode(str)});
            }
            nVar.f322009d = oVar.mo79671e("weblogin:" + URLEncoder.encode("service=hist&continue=".concat(String.valueOf(URLEncoder.encode("https://myactivity.google.com".concat(String.valueOf(str2)))))) + "&de=1", a, new C91032p());
            new C90873ag(nVar.f322009d, nVar.f322008c, "Get token", new C116113l(nVar, a, str, wVar)).mo85223a(new C116114m(nVar, a, str, wVar));
        }
    }

    /* renamed from: n */
    public final void mo102497n(int i, int i2, int i3) {
        int i4;
        int a;
        int i5 = i2;
        int i6 = i3;
        C58833ax axVar = (C58833ax) ((C23251a) this.f321932c.mo102513l()).f63720e;
        if (axVar.mo56113h()) {
            Group[] groupArr = ((Timeline) axVar.mo56107c()).f322178a;
            Group group = groupArr[i5];
            C116090a aVar = this.f321945p;
            C22845p[] pVarArr = group.f322177h;
            C22845p pVar = pVarArr[i6];
            int length = groupArr.length;
            int length2 = pVarArr.length;
            long minutes = pVar != null ? TimeUnit.MILLISECONDS.toMinutes(aVar.f321889b.mo26870b() - pVar.f62895d) : 0;
            int a2 = C22840k.m42693a(pVar.f62894c);
            if (a2 == 0) {
                a2 = 1;
            }
            switch (a2 - 1) {
                case 0:
                    i4 = 2;
                    break;
                case 1:
                    i4 = 3;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i4 = 5;
                    break;
                case 8:
                    i4 = 6;
                    break;
                case 10:
                    C22838i iVar = pVar.f62901j;
                    if (iVar == null) {
                        iVar = C22838i.f62869h;
                    }
                    switch (iVar.f62877g) {
                        case 1:
                            i4 = 8;
                            break;
                        case 2:
                            i4 = 14;
                            break;
                        case 3:
                            i4 = 10;
                            break;
                        case 4:
                            i4 = 12;
                            break;
                        case 5:
                            i4 = 13;
                            break;
                        case 6:
                            i4 = 11;
                            break;
                        case 7:
                            i4 = 9;
                            break;
                        default:
                            i4 = 15;
                            break;
                    }
                case 11:
                    i4 = 16;
                    break;
                case 12:
                    i4 = 17;
                    break;
                default:
                    C59052c cVar = (C59052c) ((C59052c) C116090a.f321888a.mo56226d()).mo56372aa(30957);
                    int a3 = C22840k.m42693a(pVar.f62894c);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    cVar.mo56387q("Unknown entry type: %d", a3 - 1);
                    int i7 = C90755l.f253831a;
                    i4 = 1;
                    break;
            }
            boolean z = (pVar == null || (a = C22834e.m42692a(pVar.f62902k)) == 0 || a != 3) ? false : true;
            int i8 = pVar != null ? pVar.f62900i : 0;
            C60399t tVar = (C60399t) C60401v.f163448n.createBuilder();
            tVar.copyOnWrite();
            C60401v vVar = (C60401v) tVar.instance;
            vVar.f163451b = i - 1;
            vVar.f163450a |= 1;
            tVar.copyOnWrite();
            C60401v vVar2 = (C60401v) tVar.instance;
            vVar2.f163450a |= 2;
            vVar2.f163452c = minutes;
            tVar.copyOnWrite();
            C60401v vVar3 = (C60401v) tVar.instance;
            vVar3.f163453d = i4 - 1;
            vVar3.f163450a |= 4;
            tVar.copyOnWrite();
            C60401v vVar4 = (C60401v) tVar.instance;
            vVar4.f163450a |= 2048;
            vVar4.f163461l = i8;
            tVar.copyOnWrite();
            C60401v vVar5 = (C60401v) tVar.instance;
            vVar5.f163450a |= 8;
            vVar5.f163454e = i5;
            tVar.copyOnWrite();
            C60401v vVar6 = (C60401v) tVar.instance;
            vVar6.f163450a |= 16;
            vVar6.f163455f = length;
            tVar.copyOnWrite();
            C60401v vVar7 = (C60401v) tVar.instance;
            vVar7.f163450a |= 32;
            vVar7.f163456g = i6;
            tVar.copyOnWrite();
            C60401v vVar8 = (C60401v) tVar.instance;
            vVar8.f163450a |= 64;
            vVar8.f163457h = length2;
            boolean c = aVar.mo102477c();
            tVar.copyOnWrite();
            C60401v vVar9 = (C60401v) tVar.instance;
            vVar9.f163450a |= 128;
            vVar9.f163458i = c;
            tVar.copyOnWrite();
            C60401v vVar10 = (C60401v) tVar.instance;
            vVar10.f163450a |= 1024;
            vVar10.f163460k = z;
            boolean z2 = (pVar == null || (pVar.f62892a & 128) == 0) ? false : true;
            tVar.copyOnWrite();
            C60401v vVar11 = (C60401v) tVar.instance;
            vVar11.f163450a |= 512;
            vVar11.f163459j = z2;
            tVar.copyOnWrite();
            C60401v vVar12 = (C60401v) tVar.instance;
            vVar12.f163450a |= 4096;
            vVar12.f163462m = false;
            C60345aa aaVar = (C60345aa) C60346ab.f163331j.createBuilder();
            aaVar.copyOnWrite();
            C60346ab abVar = (C60346ab) aaVar.instance;
            abVar.f163338f = 1;
            abVar.f163333a |= 64;
            aaVar.copyOnWrite();
            C60346ab abVar2 = (C60346ab) aaVar.instance;
            C60401v vVar13 = (C60401v) tVar.build();
            vVar13.getClass();
            abVar2.f163334b = vVar13;
            abVar2.f163333a |= 1;
            aVar.mo102476b((C60346ab) aaVar.build());
        }
    }

    /* renamed from: o */
    public final void mo102498o(Timeline timeline, int i, int i2) {
        Group[] groupArr = timeline.f322178a;
        Group group = groupArr[i2];
        C116090a aVar = this.f321945p;
        long j = group.f322172c;
        int length = groupArr.length;
        int length2 = group.f322177h.length;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(aVar.f321889b.mo26870b() - j);
        C60403x xVar = (C60403x) C60405z.f163465h.createBuilder();
        xVar.copyOnWrite();
        C60405z zVar = (C60405z) xVar.instance;
        zVar.f163468b = i - 1;
        zVar.f163467a |= 1;
        xVar.copyOnWrite();
        C60405z zVar2 = (C60405z) xVar.instance;
        zVar2.f163467a |= 2;
        zVar2.f163469c = minutes;
        xVar.copyOnWrite();
        C60405z zVar3 = (C60405z) xVar.instance;
        zVar3.f163467a |= 4;
        zVar3.f163470d = i2;
        xVar.copyOnWrite();
        C60405z zVar4 = (C60405z) xVar.instance;
        zVar4.f163467a |= 8;
        zVar4.f163471e = length;
        boolean c = aVar.mo102477c();
        xVar.copyOnWrite();
        C60405z zVar5 = (C60405z) xVar.instance;
        zVar5.f163467a |= 16;
        zVar5.f163472f = c;
        xVar.copyOnWrite();
        C60405z zVar6 = (C60405z) xVar.instance;
        zVar6.f163467a |= 32;
        zVar6.f163473g = length2;
        C60345aa aaVar = (C60345aa) C60346ab.f163331j.createBuilder();
        aaVar.copyOnWrite();
        C60346ab abVar = (C60346ab) aaVar.instance;
        abVar.f163338f = 2;
        abVar.f163333a |= 64;
        aaVar.copyOnWrite();
        C60346ab abVar2 = (C60346ab) aaVar.instance;
        C60405z zVar7 = (C60405z) xVar.build();
        zVar7.getClass();
        abVar2.f163335c = zVar7;
        abVar2.f163333a |= 2;
        aVar.mo102476b((C60346ab) aaVar.build());
    }
}
