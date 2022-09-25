package com.google.android.libraries.lens.view.srpx;

import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.p060c.C0977g;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.p2014e.C24203af;
import com.google.android.libraries.lens.view.p2078at.C25528k;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25494i;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25483a;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25486d;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.srpx.p2171b.C28035a;
import com.google.android.libraries.lens.view.srpx.p2171b.C28036b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3353c.C43316a;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.webview.contrib.p3476a.C44355e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62940bt;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.srpx.p */
/* compiled from: PG */
public final class C28050p implements C27654a {

    /* renamed from: a */
    public static final C58974d f76331a = C58974d.m91135i("SrpXFragment");

    /* renamed from: b */
    public final C28049o f76332b;

    /* renamed from: c */
    public final AccountId f76333c;

    /* renamed from: d */
    public final String f76334d;

    /* renamed from: e */
    public final C43269t f76335e;

    /* renamed from: f */
    public final C44355e f76336f;

    /* renamed from: g */
    public final C46801dp f76337g;

    /* renamed from: h */
    public final C43377v f76338h;

    /* renamed from: i */
    public final C28443m f76339i;

    /* renamed from: j */
    public final Map f76340j = new C0977g();

    /* renamed from: k */
    public CoordinatorLayout f76341k;

    /* renamed from: l */
    public C25494i f76342l;

    /* renamed from: m */
    public C28452b f76343m;

    /* renamed from: n */
    public int f76344n;

    /* renamed from: o */
    public boolean f76345o = false;

    /* renamed from: p */
    private final C28043i f76346p;

    /* renamed from: q */
    private final C25528k f76347q;

    /* renamed from: r */
    private final C43262m f76348r;

    /* renamed from: s */
    private final C28306ab f76349s;

    /* renamed from: t */
    private final String f76350t;

    /* renamed from: u */
    private boolean f76351u = true;

    /* renamed from: v */
    private boolean f76352v;

    /* renamed from: com.google.android.libraries.lens.view.srpx.p$a */
    /* compiled from: PG */
    final class C28051a implements C46792di {
        public C28051a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) C28050p.f76331a.mo56225c()).mo56382g(th)).mo56372aa(50159)).mo56386p("WebStateCallbacks#onError");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            String b = C28050p.m52285b(Uri.parse(uVar.f113329b));
            if (b == null || !C28050p.this.f76340j.containsKey(b) || !((Boolean) C28050p.this.f76340j.get(b)).booleanValue()) {
                C43369n a = C43369n.m76519a(uVar.f113330c);
                if (a == null) {
                    a = C43369n.UNSPECIFIED;
                }
                if (a != C43369n.UNSPECIFIED) {
                    C28050p.this.f76342l.getClass();
                    C43369n a2 = C43369n.m76519a(uVar.f113330c);
                    if (a2 == null) {
                        a2 = C43369n.UNSPECIFIED;
                    }
                    int ordinal = a2.ordinal();
                    if (ordinal == 2) {
                        C28050p.this.mo33504e();
                    } else if (ordinal == 4) {
                        if (b != null) {
                            C28050p.this.f76340j.put(b, true);
                        }
                        C28050p.this.mo33504e();
                        C28050p.this.f76342l.mo30519k(true);
                    } else if (ordinal == 5 || ordinal == 6) {
                        if (b != null) {
                            C28050p.this.f76340j.put(b, true);
                        }
                        C28050p.this.f76342l.mo30519k(false);
                    }
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C28050p(C28049o oVar, AccountId accountId, C28036b bVar, C28043i iVar, C25528k kVar, C43262m mVar, C43269t tVar, C44355e eVar, C46801dp dpVar, C43377v vVar, C28306ab abVar, C28443m mVar2) {
        this.f76332b = oVar;
        this.f76333c = accountId;
        this.f76334d = bVar.f76308a;
        this.f76344n = bVar.f76309b;
        this.f76350t = bVar.f76310c;
        this.f76352v = bVar.f76311d;
        this.f76346p = iVar;
        this.f76347q = kVar;
        this.f76348r = mVar;
        this.f76335e = tVar;
        this.f76337g = dpVar;
        this.f76338h = vVar;
        this.f76349s = abVar;
        this.f76339i = mVar2;
        this.f76336f = eVar;
    }

    /* renamed from: a */
    public static C28049o m52284a(AccountId accountId, String str, int i, C58833ax axVar, boolean z) {
        C28035a aVar = (C28035a) C28036b.f76306e.createBuilder();
        aVar.copyOnWrite();
        str.getClass();
        ((C28036b) aVar.instance).f76308a = str;
        aVar.copyOnWrite();
        ((C28036b) aVar.instance).f76309b = i;
        String afVar = axVar.mo56113h() ? ((C24203af) axVar.mo56107c()).toString() : BuildConfig.FLAVOR;
        aVar.copyOnWrite();
        ((C28036b) aVar.instance).f76310c = afVar;
        aVar.copyOnWrite();
        ((C28036b) aVar.instance).f76311d = z;
        C28049o oVar = new C28049o();
        C68324h.m98669f(oVar);
        C47247a.m84047b(oVar, accountId);
        C47243l.m84039a(oVar, (C28036b) aVar.build());
        return oVar;
    }

    /* renamed from: b */
    public static String m52285b(Uri uri) {
        String b = C28045k.m52256b(uri);
        return (b != null || !C28045k.m52258f(uri)) ? b : uri.toString();
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("SrpxFragmentPeer");
        eVar.mo33148e("impl", this.f76335e.mo46385c().name());
        eVar.mo33149f("url", this.f76334d);
    }

    /* renamed from: d */
    public final void mo33503d(String str, int i) {
        C28452b bVar;
        if (!this.f76351u && (bVar = this.f76343m) != null) {
            bVar.mo33910d();
            this.f76344n = i;
            this.f76345o = false;
        }
        this.f76351u = false;
        String b = m52285b(Uri.parse(str));
        if (b != null) {
            this.f76340j.put(b, false);
        }
        C43262m mVar = this.f76348r;
        boolean z = this.f76352v;
        C43255f m = C43257h.m76306m(str);
        String str2 = (String) this.f76346p.f76319a.mo33223a().mo56106b(C28042h.f76318a).mo56111f();
        if (!TextUtils.isEmpty(str2)) {
            m.f113051b.mo55429h("X-Geo", str2);
        }
        String str3 = (String) this.f76347q.mo30585a().mo56111f();
        if (!TextUtils.isEmpty(str3)) {
            m.f113051b.mo55429h("X-Client-Data", str3);
        }
        if (!this.f76350t.isEmpty()) {
            C43316a aVar = (C43316a) C43323b.f113174a.createBuilder();
            C62940bt btVar = C25486d.f69438f;
            C25483a aVar2 = (C25483a) C25486d.f69437e.createBuilder();
            String str4 = this.f76350t;
            aVar2.copyOnWrite();
            C25486d dVar = (C25486d) aVar2.instance;
            str4.getClass();
            dVar.f69440a |= 1;
            dVar.f69441b = str4;
            aVar2.copyOnWrite();
            C25486d dVar2 = (C25486d) aVar2.instance;
            dVar2.f69440a |= 2;
            dVar2.f69442c = z;
            aVar.mo58885m(btVar, (C25486d) aVar2.build());
            m.mo46343d((C43323b) aVar.build());
        }
        mVar.mo46333b(m.mo46365k());
        this.f76352v = false;
    }

    /* renamed from: e */
    public final void mo33504e() {
        C28452b bVar;
        if (this.f76341k != null && !this.f76345o && (bVar = this.f76343m) != null) {
            bVar.mo33907a(1L, this.f76349s.f76990a.mo33805a(C28427h.m53115a(this.f76344n)));
            this.f76345o = true;
        }
    }

    /* renamed from: f */
    public final void mo33505f(int i) {
        CoordinatorLayout coordinatorLayout = this.f76341k;
        if (coordinatorLayout != null) {
            ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
            layoutParams.height = i;
            this.f76341k.setLayoutParams(layoutParams);
        }
    }
}
