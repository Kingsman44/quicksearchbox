package com.google.android.libraries.lens.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C73958bn;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.C25897ad;
import com.google.android.libraries.lens.view.filters.C25898ae;
import com.google.android.libraries.lens.view.filters.p2100d.C25972a;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.android.libraries.lens.view.flags.ConfigFlagsImpl;
import com.google.android.libraries.lens.view.main.C27288ae;
import com.google.android.libraries.lens.view.main.C27292ai;
import com.google.android.libraries.lens.view.main.C27384dt;
import com.google.android.libraries.lens.view.onboarding.C27481an;
import com.google.android.libraries.lens.view.p2050aa.C24954b;
import com.google.android.libraries.lens.view.p2050aa.C24965m;
import com.google.android.libraries.lens.view.p2053ad.C24980c;
import com.google.android.libraries.lens.view.p2053ad.C24981d;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2070an.C25439k;
import com.google.android.libraries.lens.view.p2070an.C25454z;
import com.google.android.libraries.lens.view.p2078at.C25519b;
import com.google.android.libraries.lens.view.p2078at.C25540w;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2083aw.p2084a.C25590a;
import com.google.android.libraries.lens.view.p2083aw.p2084a.C25591b;
import com.google.android.libraries.lens.view.p2089b.C25674a;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2096f.C25802e;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26742ak;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26743al;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.session.C27777bm;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60697zm;
import com.google.common.p4552o.C60698zn;
import com.google.common.p4552o.C60700zp;
import com.google.common.p4552o.C60701zq;
import com.google.common.p4552o.C60702zr;
import com.google.common.p4552o.C60703zs;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.acc;
import com.google.common.p4552o.acf;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.common.util.concurrent.C60887da;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62505ea;
import com.google.lens.p4711m.C62632i;
import dagger.C68214a;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.o */
/* compiled from: PG */
public final class C27458o extends C24983ae implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f75121a = new C2393x(this);

    /* renamed from: b */
    private C28206x f75122b;

    /* renamed from: c */
    private Context f75123c;

    /* renamed from: d */
    private final C47515ab f75124d = new C47515ab(this);

    /* renamed from: e */
    private boolean f75125e;

    @Deprecated
    public C27458o() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C28206x mo17754z() {
        C28206x xVar = this.f75122b;
        if (xVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f75125e) {
            return xVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo30200b() {
        return new C47242k(this);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        C28206x a = mo17754z();
        C27658e a2 = C27658e.m51456a(a.f76807r, false);
        a.f76796g.mo30427c(a2);
        a.f76811v.mo30427c(a2);
        try {
            a2.mo33145b(printWriter, str);
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C27658e.f75513a.mo56225c()).mo56382g(e)).mo56372aa(49337)).mo56386p("Unable to write dump()");
        }
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f75123c == null) {
            this.f75123c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f75123c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f75124d.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f75121a;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f75124d.mo51380h(eyVar, z);
    }

    public final void onActivityCreated(Bundle bundle) {
        this.f75124d.mo51381i();
        try {
            super.onActivityCreated(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C47573bx a = this.f75124d.mo51373a("Fragment:onActivityResult");
        try {
            super.onActivityResult(i, i2, intent);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onAttach(Activity activity) {
        this.f75124d.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        C37252a aVar;
        C26742ak akVar;
        this.f75124d.mo51381i();
        try {
            super.onCreate(bundle);
            C28206x a = mo17754z();
            a.f76808s.mo19974a(C37194a.f98642u);
            a.f76806q.mo30191a();
            Fragment c = a.f76791b.getChildFragmentManager().f634a.mo671c("main_fragment");
            if (c != null) {
                C0154a aVar2 = new C0154a(a.f76791b.getChildFragmentManager());
                aVar2.mo516m(c);
                aVar2.mo509f();
            }
            if (bundle == null) {
                C25050av avVar = a.f76809t;
                C60698zn znVar = (C60698zn) C60703zs.f164701f.createBuilder();
                C60700zp zpVar = a.f76797h;
                znVar.copyOnWrite();
                C60703zs zsVar = (C60703zs) znVar.instance;
                zsVar.f164705c = zpVar.f164695f;
                zsVar.f164703a |= 32;
                boolean z = a.f76784F;
                znVar.copyOnWrite();
                C60703zs zsVar2 = (C60703zs) znVar.instance;
                zsVar2.f164703a |= 8;
                zsVar2.f164704b = z;
                Context context = a.f76791b.getContext();
                context.getClass();
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                C60701zq zqVar = (C60701zq) C60702zr.f164696d.createBuilder();
                zqVar.copyOnWrite();
                C60702zr zrVar = (C60702zr) zqVar.instance;
                zrVar.f164698a |= 1;
                zrVar.f164699b = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
                int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
                zqVar.copyOnWrite();
                C60702zr zrVar2 = (C60702zr) zqVar.instance;
                zrVar2.f164698a |= 2;
                zrVar2.f164700c = i;
                C60702zr zrVar3 = (C60702zr) zqVar.build();
                znVar.copyOnWrite();
                C60703zs zsVar3 = (C60703zs) znVar.instance;
                zrVar3.getClass();
                zsVar3.f164707e = zrVar3;
                zsVar3.f164703a |= 128;
                C60697zm zmVar = a.f76798i;
                znVar.copyOnWrite();
                C60703zs zsVar4 = (C60703zs) znVar.instance;
                zsVar4.f164706d = zmVar.f164687e;
                zsVar4.f164703a |= 64;
                C60703zs zsVar5 = (C60703zs) znVar.build();
                String str = (String) a.f76796g.mo32701h().mo56111f();
                C62505ea a2 = C62632i.m94816a(str);
                if (TextUtils.isEmpty(str)) {
                    C58970a aVar3 = (C58970a) C28206x.f76778a.mo56225c();
                    aVar3.mo56378ag(C38505d.f101864b, 216478232);
                    ((C58970a) aVar3.mo56372aa(48978)).mo56386p("Empty client caller package.");
                    if (a.f76807r.mo30940a() || a.f76807r.mo30941b()) {
                        throw new AssertionError("Client caller package must be non-empty.");
                    }
                } else if (a2 == C62505ea.SURFACE_UNSPECIFIED) {
                    C58970a aVar4 = (C58970a) C28206x.f76778a.mo56225c();
                    aVar4.mo56378ag(C38505d.f101864b, 206660595);
                    ((C58970a) aVar4.mo56372aa(48977)).mo56389s("No match found for client caller package: %s", C61301b.m93812a(str));
                    if (a.f76807r.mo30940a() || a.f76807r.mo30941b()) {
                        throw new AssertionError("Client caller package \"" + str + "\" is not correctly handled by LensSurfaceHelper. Returning SURFACE_UNSPECIFIED (which indicates a bug in how the entry point is launching Lens).");
                    }
                }
                acc acc = (acc) acf.f158284h.createBuilder();
                String str2 = (String) a.f76796g.mo32701h().mo56109e(BuildConfig.FLAVOR);
                acc.copyOnWrite();
                acf acf = (acf) acc.instance;
                str2.getClass();
                acf.f158286a |= 1;
                acf.f158287b = str2;
                int a3 = a.f76796g.mo32694a();
                acc.copyOnWrite();
                acf acf2 = (acf) acc.instance;
                acf2.f158286a |= 4;
                acf2.f158289d = a3;
                int i2 = 3;
                int i3 = a.f76796g.mo32694a() == C62433bj.HARDWARE_BUTTON.f168594ao ? 3 : 2;
                acc.copyOnWrite();
                acf acf3 = (acf) acc.instance;
                acf3.f158291f = i3 - 1;
                acf3.f158286a |= 64;
                int number = a2.getNumber();
                acc.copyOnWrite();
                acf acf4 = (acf) acc.instance;
                acf4.f158286a |= 128;
                acf4.f158292g = number;
                if (a.f76796g.mo32695b() != 0) {
                    if (a.f76796g.mo32695b() == 1) {
                        i2 = 2;
                    }
                    acc.copyOnWrite();
                    acf acf5 = (acf) acc.instance;
                    acf5.f158290e = i2 - 1;
                    acf5.f158286a |= 32;
                }
                aar aar = (aar) aas.f158145p.createBuilder();
                aar.copyOnWrite();
                aas aas = (aas) aar.instance;
                zsVar5.getClass();
                aas.f158152f = zsVar5;
                aas.f158147a |= 2048;
                aar.copyOnWrite();
                aas aas2 = (aas) aar.instance;
                acf acf6 = (acf) acc.build();
                acf6.getClass();
                aas2.f158151e = acf6;
                aas2.f158147a |= 256;
                aas aas3 = (aas) aar.build();
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1398;
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                aas3.getClass();
                ufVar2.f164197by = aas3;
                ufVar2.f164253h |= 8;
                avVar.mo30241a((C60555uf) tzVar.build());
                a.f76808s.mo19974a(C37194a.f98538bv);
            }
            boolean z2 = false;
            if (a.f76780B.mo30591a()) {
                C25797f fVar = a.f76803n;
                C46459k.m82829b(C47633f.m84733g(fVar.f70079d.f68662a.f68693b).mo51516i(new C25765e(fVar), fVar.f70080e), "Early LVF init failed", new Object[0]);
            }
            ((C25989d) a.f76802m.mo27525b()).mo31205d(((C25897ad) a.f76781C.f70368d.mo6453a()).mo31004a());
            ((C27288ae) a.f76801l.mo27525b()).mo32840q();
            a.f76800k.mo30494b();
            if (a.f76788J) {
                C28439i b = a.f76785G.mo33918b(a.f76786H.mo33805a(C28427h.m53115a(144882)));
                a.f76785G.mo33920d(b);
                a.f76785G.f77254a.mo33846b();
                ((C27288ae) a.f76801l.mo27525b()).f74683p = a.f76787I.mo33851a(b);
            }
            if (a.f76779A.mo56113h() && !a.f76796g.mo32729F(a.f76793d)) {
                ((C27288ae) a.f76801l.mo27525b()).mo32837n((C27228h) a.f76779A.mo56107c(), (C27777bm) null);
            }
            Bundle bundle2 = a.f76794e;
            if (bundle2 != null && bundle2.containsKey("lensView_intentOpener")) {
                C25519b bVar = (C25519b) a.f76813x.mo27525b();
                Bundle bundle3 = a.f76794e.getBundle("lensView_intentOpener");
                if (bundle3 != null) {
                    int i4 = bundle3.getInt("ActivityIntentOpener_pendingCallbackId");
                    if (i4 < C25802e.f70102h.length) {
                        bVar.f69484a = C25802e.f70102h[i4];
                    }
                }
            }
            C27292ai v = C27384dt.m50982v(a.f76792c, bundle == null);
            C0154a aVar5 = new C0154a(a.f76791b.getChildFragmentManager());
            aVar5.mo689v(R.id.lens_view_container, v, "main_fragment");
            aVar5.mo509f();
            if (a.f76779A.mo56113h() && ((C27288ae) a.f76801l.mo27525b()).f74684q != null) {
                z2 = true;
            }
            C27384dt a4 = v.mo17754z();
            C28055t tVar = a.f76799j;
            Objects.requireNonNull(tVar);
            a4.f74960bd = new C27653r(tVar);
            a4.f74929aY = z2;
            C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
            C60698zn znVar2 = (C60698zn) C60703zs.f164701f.createBuilder();
            C60700zp zpVar2 = a4.f74884F;
            znVar2.copyOnWrite();
            C60703zs zsVar6 = (C60703zs) znVar2.instance;
            zsVar6.f164705c = zpVar2.f164695f;
            zsVar6.f164703a |= 32;
            afVar.copyOnWrite();
            C59898bg bgVar = (C59898bg) afVar.instance;
            C60703zs zsVar7 = (C60703zs) znVar2.build();
            zsVar7.getClass();
            bgVar.f161876h = zsVar7;
            bgVar.f161869a |= 64;
            C59961k a5 = ((C25972a) a4.f75002v.mo27525b()).mo31166a();
            afVar.copyOnWrite();
            C59898bg bgVar2 = (C59898bg) afVar.instance;
            a5.getClass();
            bgVar2.f161871c = a5;
            bgVar2.f161869a = 2 | bgVar2.f161869a;
            C59898bg bgVar3 = (C59898bg) afVar.build();
            if (a4.f74886H.mo32701h().mo56113h()) {
                C59870af afVar2 = (C59870af) bgVar3.toBuilder();
                acc acc2 = (acc) acf.f158284h.createBuilder();
                String str3 = (String) a4.f74886H.mo32701h().mo56107c();
                acc2.copyOnWrite();
                acf acf7 = (acf) acc2.instance;
                str3.getClass();
                acf7.f158286a = 1 | acf7.f158286a;
                acf7.f158287b = str3;
                afVar2.copyOnWrite();
                C59898bg bgVar4 = (C59898bg) afVar2.instance;
                acf acf8 = (acf) acc2.build();
                acf8.getClass();
                bgVar4.f161877i = acf8;
                bgVar4.f161869a |= 128;
                bgVar3 = (C59898bg) afVar2.build();
            }
            C37215b bVar2 = a4.f75001u;
            if (!a4.f74988h) {
                aVar = C37194a.f98542bz.mo40779c();
            } else {
                long longValue = ((Long) a4.f74886H.mo32704j().mo56109e(0L)).longValue();
                if (longValue == 0) {
                    aVar = C37194a.f98466ac.mo40811d(a4.f74991k.toNanos());
                } else if (a4.f74992l.mo30592b()) {
                    aVar = C37194a.f98437a.mo40811d(longValue);
                } else {
                    aVar = C37194a.f98490b.mo40811d(longValue);
                }
            }
            ((C37253b) aVar).mo40792p(C59898bg.f161867w, bgVar3);
            bVar2.mo19974a(aVar);
            a4.f75001u.mo19974a(C37194a.f98509bS.mo40811d(a4.f74991k.toNanos()));
            if (a.f76779A.mo56113h() && !z2) {
                v.mo17754z().f74928aX = (C27228h) a.f76779A.mo56107c();
            }
            a.f76812w.mo30199b(new C27682s(a), C24980c.QUERY_SENT);
            if (bundle == null) {
                C28138v vVar = a.f76782D;
                vVar.f76554c.execute(C47810es.m84977q(new C28094u(vVar, vVar.f76553b.mo26872d())));
            }
            C25591b bVar3 = (C25591b) ((C58833ax) a.f76804o.mo27525b()).mo56111f();
            if (bVar3 != null) {
                ((C58970a) ((C58970a) C28206x.f76778a.mo56224b()).mo56372aa(48981)).mo56386p("Initializing LensViewTestApi");
                a.f76791b.requireActivity();
                bVar3.mo30683d();
                if (a.f76783E.mo56113h()) {
                    if (bVar3.mo30682c()) {
                        akVar = new C27530p(bVar3);
                    } else {
                        akVar = C27548q.f75336a;
                    }
                    a.f76789K = akVar;
                    ((C26743al) a.f76783E.mo56107c()).mo32025a(a.f76789K);
                }
                if (a.f76796g.mo32692B()) {
                    a.f76790L = new C25590a();
                    C25590a aVar6 = a.f76790L;
                    File externalFilesDir = a.f76791b.getContext().getExternalFilesDir((String) null);
                    if (externalFilesDir != null) {
                        if (!externalFilesDir.exists()) {
                            externalFilesDir.mkdirs();
                        }
                    }
                    aVar6.f69625b = C25590a.m47195a(new File(externalFilesDir, "recorded_request.log"));
                    aVar6.f69626c = C25590a.m47195a(new File(externalFilesDir, "recorded_response.log"));
                    bVar3.mo30686g();
                }
            }
            a.f76808s.mo19974a(C37194a.f98643v);
            C47831fm.m85019n();
        } catch (IOException e) {
            throw new IllegalStateException("Failed to create log stream", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C27447n.m51108a(th, th2);
            }
            throw th;
        }
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        this.f75124d.mo51382j(i, i2);
        try {
            Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
            C47831fm.m85019n();
            return onCreateAnimation;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75124d.mo51381i();
        try {
            super.onCreateView(layoutInflater, viewGroup, bundle);
            mo17754z();
            View inflate = layoutInflater.inflate(R.layout.lens_view, viewGroup, false);
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C28206x a;
        C47573bx b = this.f75124d.mo51374b();
        try {
            super.onDestroy();
            a = mo17754z();
            C25590a aVar = a.f76790L;
            if (aVar != null) {
                BufferedOutputStream bufferedOutputStream = aVar.f69625b;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                BufferedOutputStream bufferedOutputStream2 = aVar.f69626c;
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
                ((C25591b) ((C58833ax) a.f76804o.mo27525b()).mo56107c()).mo30687h();
            }
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C25590a.f69624a.mo56226d()).mo56382g(e)).mo56372aa(50186)).mo56386p("Failed to close this LensMessageRecorder!");
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                C27447n.m51108a(th, th2);
            }
            throw th;
        }
        if (a.f76789K != null) {
            ((C26743al) a.f76783E.mo56107c()).mo32029g(a.f76789K);
        }
        C58833ax axVar = (C58833ax) a.f76804o.mo27525b();
        if (axVar.mo56113h()) {
            ((C58970a) ((C58970a) C28206x.f76778a.mo56224b()).mo56372aa(48984)).mo56386p("Destroying LensViewTestApi");
            ((C25591b) axVar.mo56107c()).mo30681b();
        }
        for (C24965m a2 : a.f76810u) {
            a2.mo30190a();
        }
        b.close();
    }

    public final void onDestroyView() {
        C47573bx c = this.f75124d.mo51375c();
        try {
            super.onDestroyView();
            c.close();
            return;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f75124d.mo51376d();
        try {
            super.onDetach();
            this.f75125e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f75124d.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C47573bx a = this.f75124d.mo51373a("Fragment:onOptionsItemSelected");
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            if (a != null) {
                a.close();
            }
            return onOptionsItemSelected;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f75124d.mo51381i();
        try {
            super.onPause();
            C28206x a = mo17754z();
            C25050av avVar = a.f76809t;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1452;
            avVar.mo30241a((C60555uf) tzVar.build());
            C25454z zVar = a.f76800k;
            C19559g.m37304c();
            if (!zVar.f69370f) {
                ((C58970a) ((C58970a) C25454z.f69365a.mo56226d()).mo56372aa(49859)).mo56386p("stop called when not started");
            } else {
                zVar.f69370f = false;
                zVar.f69367c.execute(C47810es.m84977q(new C25439k(zVar)));
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f75124d.mo51377e();
        try {
            super.onResume();
            C28206x a = mo17754z();
            a.f76808s.mo19974a(C37194a.f98646y);
            C28224z zVar = a.f76805p;
            int i = ((C24946a) zVar.f76836b).f68076b;
            boolean z = i != zVar.f76838d;
            if (!z) {
                zVar.mo33730a();
                i = ((C24946a) zVar.f76836b).f68076b;
                ((C58970a) ((C58970a) C28224z.f76835a.mo56224b()).mo56372aa(48995)).mo56393w("***** onResumeRunIndexVerification OVERRIDE %d -> %d", zVar.f76838d, i);
            }
            zVar.f76838d = i;
            if (!z) {
                a.f76806q.mo30191a();
            }
            C25454z zVar2 = a.f76800k;
            if (!zVar2.f69370f) {
                zVar2.mo30494b();
            }
            C25050av avVar = a.f76809t;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1451;
            avVar.mo30241a((C60555uf) tzVar.build());
            ((C25519b) a.f76813x.mo27525b()).mo30553b();
            a.f76808s.mo19974a(C37194a.f98647z);
            e.close();
            return;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f75124d.mo51381i();
        C47831fm.m85019n();
    }

    public final void onStart() {
        this.f75124d.mo51381i();
        try {
            super.onStart();
            C28206x a = mo17754z();
            a.f76808s.mo19974a(C37194a.f98644w);
            a.f76806q.mo30191a();
            a.f76808s.mo19974a(C37194a.f98645x);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f75124d.mo51381i();
        try {
            super.onStop();
            mo17754z().f76805p.mo33730a();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C27447n.m51108a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f75124d.mo51381i();
        C47831fm.m85019n();
    }

    public final void setEnterTransition(Object obj) {
        C47515ab abVar = this.f75124d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setEnterTransition(obj);
    }

    public final void setExitTransition(Object obj) {
        C47515ab abVar = this.f75124d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setExitTransition(obj);
    }

    public final void setReenterTransition(Object obj) {
        C47515ab abVar = this.f75124d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReenterTransition(obj);
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void setReturnTransition(Object obj) {
        C47515ab abVar = this.f75124d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setReturnTransition(obj);
    }

    public final void setSharedElementEnterTransition(Object obj) {
        C47515ab abVar = this.f75124d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementEnterTransition(obj);
    }

    public final void setSharedElementReturnTransition(Object obj) {
        C47515ab abVar = this.f75124d;
        if (abVar != null) {
            abVar.mo51379g(true);
        }
        super.setSharedElementReturnTransition(obj);
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        C27458o oVar = this;
        oVar.f75124d.mo51381i();
        try {
            if (!oVar.f75125e) {
                super.onAttach(context);
                if (oVar.f75122b == null) {
                    Object jN = mo30201d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C27458o) {
                        C27458o oVar2 = (C27458o) fragment;
                        C68225k.m98532d(oVar2);
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        C58833ax axVar = (C58833ax) ((C74176nj) jN).f206836d.f205439u.mo17428b();
                        Bundle a = C24954b.m46187a(((C74176nj) jN).f206836d.mo69013b());
                        C25674a aVar = (C25674a) ((C74176nj) jN).f206836d.f205440v.mo17428b();
                        Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                        if (activity instanceof C28055t) {
                            C28055t tVar = (C28055t) activity;
                            C68225k.m98532d(tVar);
                            C27232l lVar = (C27232l) ((C74176nj) jN).f206836d.f205441w.mo17428b();
                            C60700zp ad = ((C74176nj) jN).f206836d.mo68996ad();
                            C60697zm zmVar = (C60697zm) ((C74176nj) jN).f206836d.f205442x.mo17428b();
                            C58833ax axVar2 = (C58833ax) ((C74176nj) jN).f206836d.f205443y.mo17428b();
                            ConfigFlagsImpl configFlagsImpl = (ConfigFlagsImpl) ((C74176nj) jN).f206836d.f205444z.mo17428b();
                            C25698c cVar = (C25698c) ((C74176nj) jN).f206836d.f205206A.mo17428b();
                            LensConnectivityManager lensConnectivityManager = (LensConnectivityManager) ((C74176nj) jN).f206836d.f205208C.mo17428b();
                            C25454z zVar = (C25454z) ((C74176nj) jN).f206836d.f205226U.mo17428b();
                            C68214a a2 = C68219e.m98518a(((C74176nj) jN).f206836d.f205263ae);
                            C68214a a3 = C68219e.m98518a(((C74176nj) jN).f206836d.f205212G);
                            C69464a aVar2 = ((C74176nj) jN).f206777bu;
                            C25797f fVar = new C25797f(aVar2, ((C74176nj) jN).f206779bw, (C25225bd) ((C74176nj) jN).f206677a.a.f203105jf.mo17428b(), (C60887da) ((C74176nj) jN).f206677a.lB.mo17428b(), (C25540w) ((C74176nj) jN).f206836d.f205269ak.mo17428b(), (C27481an) ((C74176nj) jN).f206836d.f205268aj.mo17428b(), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199555hI.mo17428b()).booleanValue());
                            C28224z zVar2 = (C28224z) ((C74176nj) jN).f206836d.f205209D.mo17428b();
                            C24967ab abVar = (C24967ab) ((C74176nj) jN).f206836d.f205270al.mo17428b();
                            Set set = (Set) ((C74176nj) jN).f206836d.f205265ag.mo17428b();
                            C25799b bVar = (C25799b) ((C74176nj) jN).f206677a.lC.mo17428b();
                            C37215b bVar2 = (C37215b) ((C74176nj) jN).f206730b.f198027a.f199167S.mo17428b();
                            C25050av avVar = (C25050av) ((C74176nj) jN).f206836d.f205210E.mo17428b();
                            C25543z zVar3 = (C25543z) ((C74176nj) jN).f206836d.f205229X.mo17428b();
                            C27655b bVar3 = (C27655b) ((C74176nj) jN).f206836d.f205260ab.mo17428b();
                            C68214a a4 = C68219e.m98518a(((C74176nj) jN).f206836d.f205218M);
                            C24981d dVar = (C24981d) ((C74176nj) jN).f206836d.f205231Z.mo17428b();
                            C68214a a5 = C68219e.m98518a(((C74176nj) jN).f206836d.f205273ao);
                            C68214a a6 = C68219e.m98518a(((C74176nj) jN).f206836d.f205220O);
                            C73958bn bnVar = ((C74176nj) jN).f206836d;
                            C69464a aVar3 = bnVar.f205274ap;
                            C25898ae aeVar = (C25898ae) bnVar.f205275aq.mo17428b();
                            C69464a aVar4 = aVar3;
                            C28138v vVar = new C28138v((C26243ad) ((C74176nj) jN).f206677a.a.f203100ja.mo17428b(), (C21370a) ((C74176nj) jN).f206677a.i.mo17428b(), (Executor) ((C74176nj) jN).f206677a.lH.mo17428b(), C68219e.m98518a(((C74176nj) jN).f206836d.f205223R));
                            C68219e.m98518a(((C74176nj) jN).f206836d.f205277as);
                            oVar = this;
                            oVar.f75122b = new C28206x(oVar2, accountId, axVar, a, tVar, lVar, ad, zmVar, axVar2, configFlagsImpl, cVar, lensConnectivityManager, zVar, a2, a3, fVar, zVar2, abVar, set, bVar, bVar2, avVar, zVar3, bVar3, a4, dVar, a5, a6, aVar4, aeVar, vVar, (C58833ax) ((C74176nj) jN).f206836d.f205276ar.mo17428b(), (C28463g) ((C74176nj) jN).f206677a.b.f200114dV.mo17428b(), (C28310af) ((C74176nj) jN).f206677a.a.f202878fQ.mo17428b(), ((C74176nj) jN).f206836d.mo69016cR(), (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b(), ((C74176nj) jN).f206730b.f198027a.mo66959fZ().mo60889c());
                            super.getLifecycle().mo5790b(new TracedFragmentLifecycle(oVar.f75124d, oVar.f75121a));
                        } else {
                            throw new IllegalStateException("LensViewFragmentPeer.Listener could not be resolved");
                        }
                    } else {
                        String obj = C28206x.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = oVar.f75124d;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
