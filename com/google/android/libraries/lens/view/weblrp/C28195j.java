package com.google.android.libraries.lens.view.weblrp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.infopanel.C27195m;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.p2078at.C25528k;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25494i;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25485c;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25486d;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.contrib.p3389i.C43630d;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.webview.contrib.p3476a.C44355e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4538j.p4539a.C59305c;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.common.p4543n.p4544a.C59355k;
import com.google.common.p4543n.p4544a.C59358n;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.lens.view.weblrp.j */
/* compiled from: PG */
public final class C28195j implements C27654a {

    /* renamed from: a */
    public static final C59071e f76727a = C59071e.m91332i("com.google.android.libraries.lens.view.weblrp.j");

    /* renamed from: b */
    public final C37215b f76728b;

    /* renamed from: c */
    public final C25543z f76729c;

    /* renamed from: d */
    public byte[] f76730d = null;

    /* renamed from: e */
    public C59308f f76731e;

    /* renamed from: f */
    public final C28443m f76732f;

    /* renamed from: g */
    public final C28306ab f76733g;

    /* renamed from: h */
    public final C28191f f76734h;

    /* renamed from: i */
    public final C26980p f76735i;

    /* renamed from: j */
    public final AccountId f76736j;

    /* renamed from: k */
    public final C26244b f76737k;

    /* renamed from: l */
    public final C43262m f76738l;

    /* renamed from: m */
    public final C43269t f76739m;

    /* renamed from: n */
    public final C25799b f76740n;

    /* renamed from: o */
    public final C46801dp f76741o;

    /* renamed from: p */
    public final C43377v f76742p;

    /* renamed from: q */
    public final C43630d f76743q;

    /* renamed from: r */
    public final C44355e f76744r;

    /* renamed from: s */
    public final C21370a f76745s;

    /* renamed from: t */
    public final Context f76746t;

    /* renamed from: u */
    public final boolean f76747u;

    /* renamed from: v */
    public boolean f76748v;

    /* renamed from: w */
    public C58833ax f76749w = C58836b.f156633a;

    /* renamed from: x */
    public C25494i f76750x;

    /* renamed from: y */
    public boolean f76751y = false;

    /* renamed from: z */
    private final C25528k f76752z;

    /* renamed from: com.google.android.libraries.lens.view.weblrp.j$a */
    /* compiled from: PG */
    final class C28196a implements C46792di {
        public C28196a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C28195j.f76727a.mo56225c()).mo56382g(th)).mo56372aa(50317)).mo56386p("WebStateCallbacks#onError");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C58833ax axVar;
            int a;
            int a2;
            Object obj2;
            C43376u uVar = (C43376u) obj;
            C43323b bVar = uVar.f113336i;
            if (bVar == null) {
                bVar = C43323b.f113174a;
            }
            C62940bt r1 = C62942bv.checkIsLite(C25486d.f69438f);
            bVar.mo58887l(r1);
            if (bVar.f169962ag.mo58857o(r1.f169971d)) {
                C62940bt r12 = C62942bv.checkIsLite(C25486d.f69438f);
                bVar.mo58887l(r12);
                Object l = bVar.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj2 = r12.f169969b;
                } else {
                    obj2 = r12.mo58889c(l);
                }
                axVar = C58833ax.m90834k((C25486d) obj2);
            } else {
                axVar = C58836b.f156633a;
            }
            C43369n a3 = C43369n.m76519a(uVar.f113330c);
            if (a3 == null) {
                a3 = C43369n.UNSPECIFIED;
            }
            if (a3 != C43369n.UNSPECIFIED) {
                C43369n a4 = C43369n.m76519a(uVar.f113330c);
                if (a4 == null) {
                    a4 = C43369n.UNSPECIFIED;
                }
                if ((a4 != C43369n.SUCCESS || (axVar.mo56113h() && (a2 = C25485c.m46944a(((C25486d) axVar.mo56107c()).f69443d)) != 0 && a2 == 2)) && C28195j.this.f76750x != null) {
                    C43369n a5 = C43369n.m76519a(uVar.f113330c);
                    if (a5 == null) {
                        a5 = C43369n.UNSPECIFIED;
                    }
                    int ordinal = a5.ordinal();
                    if (ordinal == 2) {
                        C27195m mVar = (C27195m) C28195j.this.f76750x;
                        mVar.f74361y.mo32359i();
                        mVar.f74361y.mo32373r(mVar.f74344h.mo32436b().mo32412b());
                    } else if (ordinal == 4) {
                        C28195j.this.f76750x.mo30519k(true);
                    } else if (ordinal == 5 || ordinal == 6) {
                        if ((C28195j.this.f76740n.mo30941b() || C28195j.this.f76740n.mo30940a()) && (uVar.f113328a & 4) != 0) {
                            C43363h hVar = uVar.f113331d;
                            if (hVar == null) {
                                hVar = C43363h.f113275f;
                            }
                            if (hVar.f113280d == 401) {
                                return;
                            }
                        }
                        if (axVar.mo56113h() && (a = C25485c.m46944a(((C25486d) axVar.mo56107c()).f69443d)) != 0 && a == 2) {
                            C28195j.this.f76750x.mo30519k(false);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C28195j(String str, C28191f fVar, C25543z zVar, C21370a aVar, C28443m mVar, C28306ab abVar, C25528k kVar, C26980p pVar, AccountId accountId, C26244b bVar, C43262m mVar2, C43269t tVar, C46801dp dpVar, C43377v vVar, C25799b bVar2, C43630d dVar, boolean z, C37215b bVar3, C44355e eVar, Context context) {
        this.f76748v = Boolean.parseBoolean(str);
        this.f76734h = fVar;
        this.f76729c = zVar;
        this.f76745s = aVar;
        this.f76732f = mVar;
        this.f76733g = abVar;
        this.f76752z = kVar;
        this.f76735i = pVar;
        this.f76736j = accountId;
        this.f76737k = bVar;
        this.f76738l = mVar2;
        this.f76739m = tVar;
        this.f76740n = bVar2;
        this.f76741o = dpVar;
        this.f76742p = vVar;
        this.f76743q = dVar;
        this.f76744r = eVar;
        this.f76728b = bVar3;
        this.f76746t = context;
        this.f76747u = z;
    }

    /* renamed from: a */
    public static View m52740a(View view) {
        if (view.isScrollContainer()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View a = m52740a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final C58833ax mo33712b() {
        String str;
        byte[] bArr = this.f76730d;
        if (bArr == null && this.f76731e == null) {
            ((C59052c) ((C59052c) f76727a.mo56226d()).mo56372aa(50322)).mo56386p("Failed to trigger blessing, presentationHtml is null");
            return C58836b.f156633a;
        }
        if (bArr != null) {
            str = C63088z.m96139A(bArr).mo59170I(C62972cr.f170009a);
        } else {
            C59308f fVar = this.f76731e;
            fVar.getClass();
            str = new C59305c(fVar.f157474a).f157465a;
        }
        if (str.isEmpty()) {
            ((C59052c) ((C59052c) f76727a.mo56226d()).mo56372aa(50321)).mo56386p("Failed to trigger blessing, html is empty");
            return C58836b.f156633a;
        }
        String trim = new C59355k(C59358n.m92254b("\"")).mo56883b(C59358n.m92255c(C59358n.m92254b("base href=\"")).mo56883b(str.substring(0, 150))).trim();
        ((C59052c) ((C59052c) f76727a.mo56224b()).mo56372aa(50320)).mo56389s("Demo url: %s", trim);
        return C58833ax.m90834k(trim);
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("WebLrpFragmentPeer");
        eVar.mo33148e("impl", this.f76739m.mo46385c().name());
    }

    /* renamed from: d */
    public final void mo33713d(C43255f fVar) {
        C58833ax a = this.f76752z.mo30585a();
        if (a.mo56113h()) {
            ((String) a.mo56107c()).length();
            fVar.f113051b.mo55429h("X-Client-Data", (String) a.mo56107c());
        }
    }
}
