package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36680d;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b.C36676d;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2812b.C36684d;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.C36759g;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.C36690a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3861at.C50345tq;
import com.google.assistant.p3861at.C50358uc;
import com.google.assistant.p3861at.C50359ud;
import com.google.assistant.p3861at.C50362ug;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C63088z;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ac */
/* compiled from: PG */
public final class C36704ac {

    /* renamed from: a */
    public static final C59071e f95609a = C59071e.m91332i("com.google.android.libraries.search.assistant.u.b.c.b.a.ac");

    /* renamed from: b */
    public final Context f95610b;

    /* renamed from: c */
    public final C37215b f95611c;

    /* renamed from: d */
    public final C46801dp f95612d;

    /* renamed from: e */
    public final C36690a f95613e;

    /* renamed from: f */
    public final AccountId f95614f;

    /* renamed from: g */
    public final String f95615g;

    /* renamed from: h */
    public final C36748w f95616h;

    /* renamed from: i */
    public final C36680d f95617i;

    /* renamed from: j */
    public final C46439e f95618j;

    /* renamed from: k */
    public final C46778cv f95619k;

    /* renamed from: l */
    public final C36706b f95620l = new C36706b();

    /* renamed from: m */
    public final C36705a f95621m = new C36705a();

    /* renamed from: n */
    public Optional f95622n = Optional.empty();

    /* renamed from: o */
    public boolean f95623o = false;

    /* renamed from: p */
    public int f95624p = 0;

    /* renamed from: q */
    private final FragmentManager f95625q;

    /* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ac$a */
    /* compiled from: PG */
    final class C36705a implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C36704ac.f95609a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OmniconsentFrag");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(51566)).mo56386p("Failed to record multi-consent UDC consent completed status.");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C58976aa aaVar = C58975e.f156826a;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ac$b */
    /* compiled from: PG */
    final class C36706b implements C46440f {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x d = C36704ac.f95609a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OmniconsentFrag");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(51568)).mo56386p("Failed to update multi-consent UDC screen interaction.");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C58976aa aaVar = C58975e.f156826a;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C36704ac(AccountId accountId, C36748w wVar, String str, C36690a aVar, C46801dp dpVar, C46778cv cvVar, C37215b bVar, C36680d dVar, C46439e eVar) {
        this.f95610b = wVar.getContext();
        this.f95614f = accountId;
        this.f95616h = wVar;
        this.f95615g = str;
        this.f95625q = wVar.getChildFragmentManager();
        this.f95613e = aVar;
        this.f95612d = dpVar;
        this.f95619k = cvVar;
        this.f95611c = bVar;
        this.f95617i = dVar;
        this.f95618j = eVar;
    }

    /* renamed from: c */
    private final void m65303c() {
        if (!this.f95622n.isPresent() || !((C36734j) this.f95622n.get()).f95721e) {
            C58976aa aaVar = C58975e.f156826a;
            mo40338b(6);
            return;
        }
        C50362ug ugVar = ((C36734j) this.f95622n.get()).f95718b;
        if (ugVar == null) {
            ugVar = C50362ug.f131096h;
        }
        C50359ud udVar = ugVar.f131100c;
        if (udVar == null) {
            udVar = C50359ud.f131080h;
        }
        C36726c cVar = (C36726c) C36727d.f95691e.createBuilder();
        C50345tq tqVar = udVar.f131085d;
        if (tqVar == null) {
            tqVar = C50345tq.f131022d;
        }
        cVar.copyOnWrite();
        C36727d dVar = (C36727d) cVar.instance;
        tqVar.getClass();
        dVar.f95694b = tqVar;
        dVar.f95693a |= 2;
        String str = udVar.f131086e;
        cVar.copyOnWrite();
        C36727d dVar2 = (C36727d) cVar.instance;
        str.getClass();
        dVar2.f95693a |= 4;
        dVar2.f95695c = str;
        C50358uc ucVar = udVar.f131083b;
        if (ucVar == null) {
            ucVar = C50358uc.f131066m;
        }
        String str2 = ucVar.f131074g;
        cVar.copyOnWrite();
        C36727d dVar3 = (C36727d) cVar.instance;
        str2.getClass();
        dVar3.f95693a |= 16;
        dVar3.f95696d = str2;
        AccountId accountId = this.f95614f;
        C36725b bVar = new C36725b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, (C36727d) cVar.build());
        mo40337a(bVar, "OobeDisclosureFragment");
    }

    /* renamed from: d */
    private final void m65304d() {
        Optional optional;
        if (this.f95622n.isPresent()) {
            C36734j jVar = (C36734j) this.f95622n.get();
            while (true) {
                int i = this.f95624p;
                C50362ug ugVar = jVar.f95718b;
                if (ugVar == null) {
                    ugVar = C50362ug.f131096h;
                }
                if (i >= ugVar.f131101d.size()) {
                    break;
                }
                C62963cj cjVar = new C62963cj(jVar.f95722f, C36734j.f95714g);
                C50362ug ugVar2 = jVar.f95718b;
                if (ugVar2 == null) {
                    ugVar2 = C50362ug.f131096h;
                }
                if (!C36676d.m65267b(ugVar2, this.f95624p).filter(new C36750y(cjVar)).isPresent()) {
                    break;
                }
                this.f95624p++;
            }
            int i2 = this.f95624p;
            C50362ug ugVar3 = jVar.f95718b;
            if (ugVar3 == null) {
                ugVar3 = C50362ug.f131096h;
            }
            if (i2 >= ugVar3.f131101d.size() || new C62963cj(jVar.f95722f, C36734j.f95714g).isEmpty()) {
                C58976aa aaVar = C58975e.f156826a;
                m65303c();
                return;
            }
            C50362ug ugVar4 = jVar.f95718b;
            if (ugVar4 == null) {
                ugVar4 = C50362ug.f131096h;
            }
            C50359ud udVar = (C50359ud) ugVar4.f131101d.get(i2);
            C36712ai aiVar = (C36712ai) C36713aj.f95647k.createBuilder();
            C36735k kVar = (C36735k) C36736l.f95725c.createBuilder();
            C50358uc ucVar = udVar.f131083b;
            if (ucVar == null) {
                ucVar = C50358uc.f131066m;
            }
            String join = TextUtils.join("<p>", ucVar.f131073f);
            kVar.copyOnWrite();
            C36736l lVar = (C36736l) kVar.instance;
            join.getClass();
            lVar.f95727a |= 1;
            lVar.f95728b = join;
            C36736l lVar2 = (C36736l) kVar.build();
            aiVar.copyOnWrite();
            C36713aj ajVar = (C36713aj) aiVar.instance;
            lVar2.getClass();
            ajVar.f95650b = lVar2;
            ajVar.f95649a |= 1;
            aiVar.copyOnWrite();
            C36713aj ajVar2 = (C36713aj) aiVar.instance;
            ajVar2.f95649a |= 512;
            ajVar2.f95658j = true;
            boolean z = jVar.f95724i;
            aiVar.copyOnWrite();
            C36713aj ajVar3 = (C36713aj) aiVar.instance;
            ajVar3.f95649a |= 256;
            ajVar3.f95657i = z;
            C50358uc ucVar2 = udVar.f131083b;
            if (ucVar2 == null) {
                ucVar2 = C50358uc.f131066m;
            }
            aiVar.copyOnWrite();
            C36713aj ajVar4 = (C36713aj) aiVar.instance;
            ucVar2.getClass();
            ajVar4.f95651c = ucVar2;
            ajVar4.f95649a |= 2;
            C36724ar a = C36676d.m65266a(udVar);
            aiVar.copyOnWrite();
            C36713aj ajVar5 = (C36713aj) aiVar.instance;
            a.getClass();
            ajVar5.f95654f = a;
            ajVar5.f95649a |= 32;
            String str = udVar.f131087f;
            aiVar.copyOnWrite();
            C36713aj ajVar6 = (C36713aj) aiVar.instance;
            str.getClass();
            ajVar6.f95649a |= 4;
            ajVar6.f95652d = str;
            String str2 = udVar.f131088g;
            aiVar.copyOnWrite();
            C36713aj ajVar7 = (C36713aj) aiVar.instance;
            str2.getClass();
            ajVar7.f95649a |= 8;
            ajVar7.f95653e = str2;
            C50362ug ugVar5 = jVar.f95718b;
            if (ugVar5 == null) {
                ugVar5 = C50362ug.f131096h;
            }
            C63088z zVar = ugVar5.f131104g;
            aiVar.copyOnWrite();
            C36713aj ajVar8 = (C36713aj) aiVar.instance;
            zVar.getClass();
            ajVar8.f95649a |= 64;
            ajVar8.f95655g = zVar;
            if ((jVar.f95717a & 16) != 0) {
                String str3 = jVar.f95723h;
                aiVar.copyOnWrite();
                C36713aj ajVar9 = (C36713aj) aiVar.instance;
                str3.getClass();
                ajVar9.f95649a |= 128;
                ajVar9.f95656h = str3;
            }
            C36713aj ajVar10 = (C36713aj) aiVar.build();
            C50362ug ugVar6 = jVar.f95718b;
            if (ugVar6 == null) {
                ugVar6 = C50362ug.f131096h;
            }
            Optional b = C36676d.m65267b(ugVar6, i2);
            if (!b.isPresent()) {
                optional = Optional.empty();
            } else {
                C56002b bVar = C56002b.UNKNOWN_SETTING_SET_ID;
                int ordinal = ((C56002b) b.get()).ordinal();
                if (ordinal == 5) {
                    optional = Optional.m71637of("OobeMultiConsentWaaFragment");
                } else if (ordinal == 11) {
                    optional = Optional.m71637of("OobeMultiConsentDaFragment");
                } else if (ordinal == 12) {
                    optional = Optional.m71637of("OobeMultiConsentDcFragment");
                } else {
                    throw new IllegalArgumentException("Unknown screen settingSetId: %s".concat(String.valueOf(((C56002b) b.get()).name())));
                }
            }
            optional.ifPresent(new C36749x(this, ajVar10));
        }
    }

    /* renamed from: a */
    public final void mo40337a(Fragment fragment, String str) {
        if (this.f95625q.f634a.mo671c(str) == null) {
            C0154a aVar = new C0154a(this.f95625q);
            aVar.mo689v(R.id.assistant_oobe_omniconsent_root_container, fragment, str);
            aVar.mo509f();
        }
    }

    /* renamed from: b */
    public final void mo40338b(int i) {
        int i2 = i - 1;
        C58976aa aaVar = C58975e.f156826a;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 == 1) {
                if (!this.f95622n.isPresent()) {
                    mo40338b(6);
                }
                C36734j jVar = (C36734j) this.f95622n.get();
                if (jVar.f95720d) {
                    m65304d();
                } else if (!jVar.f95719c) {
                    m65303c();
                } else if (this.f95622n.isPresent()) {
                    C36734j jVar2 = (C36734j) this.f95622n.get();
                    C50362ug ugVar = jVar2.f95718b;
                    if (ugVar == null) {
                        ugVar = C50362ug.f131096h;
                    }
                    C50359ud udVar = ugVar.f131100c;
                    if (udVar == null) {
                        udVar = C50359ud.f131080h;
                    }
                    C36712ai aiVar = (C36712ai) C36713aj.f95647k.createBuilder();
                    C36735k kVar = (C36735k) C36736l.f95725c.createBuilder();
                    C50358uc ucVar = udVar.f131083b;
                    if (ucVar == null) {
                        ucVar = C50358uc.f131066m;
                    }
                    String join = TextUtils.join("<p>", ucVar.f131073f);
                    kVar.copyOnWrite();
                    C36736l lVar = (C36736l) kVar.instance;
                    join.getClass();
                    lVar.f95727a |= 1;
                    lVar.f95728b = join;
                    C36736l lVar2 = (C36736l) kVar.build();
                    aiVar.copyOnWrite();
                    C36713aj ajVar = (C36713aj) aiVar.instance;
                    lVar2.getClass();
                    ajVar.f95650b = lVar2;
                    ajVar.f95649a = 1 | ajVar.f95649a;
                    boolean z = jVar2.f95724i;
                    aiVar.copyOnWrite();
                    C36713aj ajVar2 = (C36713aj) aiVar.instance;
                    ajVar2.f95649a |= 256;
                    ajVar2.f95657i = z;
                    C50358uc ucVar2 = udVar.f131083b;
                    if (ucVar2 == null) {
                        ucVar2 = C50358uc.f131066m;
                    }
                    aiVar.copyOnWrite();
                    C36713aj ajVar3 = (C36713aj) aiVar.instance;
                    ucVar2.getClass();
                    ajVar3.f95651c = ucVar2;
                    ajVar3.f95649a |= 2;
                    C36724ar a = C36676d.m65266a(udVar);
                    aiVar.copyOnWrite();
                    C36713aj ajVar4 = (C36713aj) aiVar.instance;
                    a.getClass();
                    ajVar4.f95654f = a;
                    ajVar4.f95649a |= 32;
                    String str = udVar.f131087f;
                    aiVar.copyOnWrite();
                    C36713aj ajVar5 = (C36713aj) aiVar.instance;
                    str.getClass();
                    ajVar5.f95649a = 4 | ajVar5.f95649a;
                    ajVar5.f95652d = str;
                    String str2 = udVar.f131088g;
                    aiVar.copyOnWrite();
                    C36713aj ajVar6 = (C36713aj) aiVar.instance;
                    str2.getClass();
                    ajVar6.f95649a |= 8;
                    ajVar6.f95653e = str2;
                    C50362ug ugVar2 = jVar2.f95718b;
                    if (ugVar2 == null) {
                        ugVar2 = C50362ug.f131096h;
                    }
                    C63088z zVar = ugVar2.f131104g;
                    aiVar.copyOnWrite();
                    C36713aj ajVar7 = (C36713aj) aiVar.instance;
                    zVar.getClass();
                    ajVar7.f95649a |= 64;
                    ajVar7.f95655g = zVar;
                    if ((jVar2.f95717a & 16) != 0) {
                        String str3 = jVar2.f95723h;
                        aiVar.copyOnWrite();
                        C36713aj ajVar8 = (C36713aj) aiVar.instance;
                        str3.getClass();
                        ajVar8.f95649a |= 128;
                        ajVar8.f95656h = str3;
                    }
                    AccountId accountId = this.f95614f;
                    C36715al alVar = new C36715al();
                    C68324h.m98669f(alVar);
                    C47247a.m84047b(alVar, accountId);
                    C47243l.m84039a(alVar, (C36713aj) aiVar.build());
                    mo40337a(alVar, "OobeUdcConsentFragment");
                }
            } else if (i2 == 2) {
                m65303c();
            } else if (i2 == 3) {
                m65304d();
            } else if (i2 == 4 || i2 == 5) {
                C47393f.m84236g(C36684d.m65278c("OobeOmniconsentFragment", this.f95614f), this.f95616h);
            }
        } else if (this.f95625q.f634a.mo671c("OobeLoadingFragment") == null) {
            C0154a aVar = new C0154a(this.f95625q);
            AccountId accountId2 = this.f95614f;
            C36759g gVar = new C36759g();
            C68324h.m98669f(gVar);
            C47247a.m84047b(gVar, accountId2);
            C47243l.m84040b(gVar, "OobeLoadingFragment");
            aVar.mo511h(R.id.assistant_oobe_omniconsent_root_container, gVar, (String) null, 1);
            aVar.mo509f();
        }
    }
}
