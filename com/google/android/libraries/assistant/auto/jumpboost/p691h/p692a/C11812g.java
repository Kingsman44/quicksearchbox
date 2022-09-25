package com.google.android.libraries.assistant.auto.jumpboost.p691h.p692a;

import android.app.Activity;
import android.support.p031v4.app.Fragment;
import androidx.navigation.C3807af;
import androidx.navigation.C3825ax;
import com.google.android.apps.auto.sdk.C8971c;
import com.google.android.gms.car.p10760f.C143268bb;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11628d;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d.C11636b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11791b;
import com.google.android.libraries.assistant.auto.jumpboost.p664b.p665a.C11447a;
import com.google.android.libraries.assistant.auto.jumpboost.p666c.p667a.C11449a;
import com.google.android.libraries.assistant.auto.jumpboost.p691h.p693b.C11819b;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1110c.p1111a.C15502d;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46498s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.h.a.g */
/* compiled from: PG */
public final class C11812g {

    /* renamed from: a */
    public static final C59071e f37977a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.h.a.g");

    /* renamed from: b */
    public final C11449a f37978b;

    /* renamed from: c */
    public final AccountId f37979c;

    /* renamed from: d */
    public final C46485f f37980d;

    /* renamed from: e */
    public final C11628d f37981e;

    /* renamed from: f */
    public final C11791b f37982f;

    /* renamed from: g */
    public final Fragment f37983g;

    /* renamed from: h */
    public final C46439e f37984h;

    /* renamed from: i */
    public final C62921ba f37985i;

    /* renamed from: j */
    public final C46440f f37986j;

    /* renamed from: k */
    public final C46440f f37987k;

    /* renamed from: l */
    public final C46440f f37988l;

    /* renamed from: m */
    public final C15488n f37989m;

    /* renamed from: n */
    public final C15502d f37990n;

    /* renamed from: o */
    public final C38750am f37991o;

    /* renamed from: p */
    public final C69464a f37992p;

    /* renamed from: q */
    public final C11636b f37993q;

    /* renamed from: r */
    public final C11819b f37994r;

    /* renamed from: s */
    public boolean f37995s = true;

    public C11812g(C11819b bVar, C38750am amVar, C11449a aVar, AccountId accountId, C46485f fVar, C15488n nVar, C15502d dVar, C11628d dVar2, C11791b bVar2, Fragment fragment, C46439e eVar, C62921ba baVar, C69464a aVar2, C11636b bVar3) {
        this.f37994r = bVar;
        this.f37978b = aVar;
        this.f37979c = accountId;
        this.f37980d = fVar;
        this.f37989m = nVar;
        this.f37990n = dVar;
        this.f37981e = dVar2;
        this.f37982f = bVar2;
        this.f37983g = fragment;
        this.f37984h = eVar;
        this.f37985i = baVar;
        this.f37986j = new C11809d(this);
        this.f37987k = new C11810e(this);
        this.f37988l = new C11811f(this);
        this.f37991o = amVar;
        this.f37992p = aVar2;
        this.f37993q = bVar3;
    }

    /* renamed from: e */
    private final C58833ax m27481e(Fragment fragment) {
        C58833ax j = C58833ax.m90833j(((C3807af) ((C46498s) this.f37980d.mo50482c(fragment)).f121646a.mo6453a()).mo8046f());
        if (!j.mo56113h()) {
            C59104x d = f37977a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AsProjectedFP");
            ((C59052c) ((C59052c) d).mo56372aa(43488)).mo56386p("The current navigation destination doesn't exist");
        }
        return j;
    }

    /* renamed from: a */
    public final C58833ax mo20164a() {
        if (this.f37983g.getHost() instanceof C11447a) {
            Object host = this.f37983g.getHost();
            host.getClass();
            C8971c cVar = ((C11447a) host).f37238e;
            cVar.getClass();
            return C58833ax.m90834k(((C143268bb) cVar.f388166f).f388466o);
        } else if (this.f37983g.getHost() instanceof Activity) {
            Object host2 = this.f37983g.getHost();
            host2.getClass();
            return C58833ax.m90834k(((Activity) host2).getIntent());
        } else {
            C59104x d = f37977a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AsProjectedFP");
            ((C59052c) ((C59052c) d).mo56372aa(43489)).mo56386p("Failed to get intent from an unsupported activity");
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public final void mo20165b() {
        this.f37982f.mo20152e(false);
        this.f37982f.mo20153f(false);
        if (this.f37983g.getHost() instanceof C11447a) {
            C58976aa aaVar = C58975e.f156826a;
            Object host = this.f37983g.getHost();
            host.getClass();
            C8971c cVar = ((C11447a) host).f37238e;
            cVar.getClass();
            cVar.mo118012A();
        }
        if (this.f37983g.getHost() instanceof Activity) {
            C58976aa aaVar2 = C58975e.f156826a;
            Object host2 = this.f37983g.getHost();
            host2.getClass();
            ((Activity) host2).finish();
        }
    }

    /* renamed from: c */
    public final boolean mo20166c(Fragment fragment) {
        C58833ax e = m27481e(fragment);
        return e.mo56113h() && ((C3825ax) e.mo56107c()).f12360i == R.id.aap_media_rec_screen;
    }

    /* renamed from: d */
    public final boolean mo20167d(Fragment fragment) {
        C58833ax e = m27481e(fragment);
        return e.mo56113h() && ((C3825ax) e.mo56107c()).f12360i == R.id.aap_voice_plate_screen;
    }
}
