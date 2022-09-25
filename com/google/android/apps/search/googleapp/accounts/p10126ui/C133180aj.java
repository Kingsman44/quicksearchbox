package com.google.android.apps.search.googleapp.accounts.p10126ui;

import com.google.android.apps.search.googleapp.accounts.C133149a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133160h;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.C133241x;
import com.google.android.apps.search.googleapp.p10122ab.C133148g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.p3674l.p3675a.C47363g;
import com.google.apps.tiktok.p3674l.p3675a.C47364h;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.aj */
/* compiled from: PG */
public final class C133180aj {

    /* renamed from: a */
    public static final C59071e f363018a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.aj");

    /* renamed from: b */
    public final C133177ag f363019b;

    /* renamed from: c */
    public final C47363g f363020c;

    /* renamed from: d */
    public final C133241x f363021d;

    /* renamed from: e */
    public final C46439e f363022e;

    /* renamed from: f */
    public final C46440f f363023f;

    /* renamed from: g */
    public final C28306ab f363024g;

    /* renamed from: h */
    public final C28310af f363025h;

    /* renamed from: i */
    public final C28443m f363026i;

    /* renamed from: j */
    public final C133148g f363027j;

    /* renamed from: com.google.android.apps.search.googleapp.accounts.ui.aj$a */
    /* compiled from: PG */
    final class C133181a implements C46440f {

        /* renamed from: a */
        private final C133177ag f363028a;

        /* renamed from: b */
        private final C133160h f363029b;

        public C133181a(C133177ag agVar, C133160h hVar) {
            this.f363028a = agVar;
            this.f363029b = hVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) C133180aj.f363018a.mo56226d()).mo56382g(th)).mo56372aa(40018)).mo56386p("Failed to set OpenAccountMenuOnStart to true");
            C47393f.m84235f(new C133149a(), this.f363028a);
            this.f363029b.mo111001a((C46108a) null);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            this.f363028a.requireDialog().dismiss();
            C47393f.m84235f(new C133149a(), this.f363028a);
            this.f363029b.mo111001a((C46108a) null);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C133180aj(C133177ag agVar, C133160h hVar, C47364h hVar2, C133241x xVar, C46439e eVar, C28306ab abVar, C28310af afVar, C28443m mVar, C133148g gVar) {
        this.f363019b = agVar;
        this.f363020c = hVar2.mo51239a();
        this.f363021d = xVar;
        this.f363022e = eVar;
        this.f363024g = abVar;
        this.f363025h = afVar;
        this.f363026i = mVar;
        this.f363027j = gVar;
        this.f363023f = new C133181a(agVar, hVar);
    }
}
