package com.google.android.libraries.search.p3160s.p3161a;

import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44042e;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44044g;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44050m;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.p4552o.C59723dh;
import com.google.common.p4552o.C59725dj;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.search.s.a.b */
/* compiled from: PG */
public final class C40548b implements C44042e {

    /* renamed from: a */
    private final C37215b f106417a;

    /* renamed from: b */
    private final C43269t f106418b;

    /* renamed from: c */
    private final C37254c f106419c;

    public C40548b(C38780c cVar, C43269t tVar, C37254c cVar2) {
        this.f106417a = cVar.mo41619a(C38828b.GOOGLE_APP);
        this.f106418b = tVar;
        this.f106419c = cVar2;
    }

    /* renamed from: a */
    public final void mo42500a(C44050m mVar) {
        int i;
        C37215b bVar = this.f106417a;
        C37258g gVar = C37182a.f97756O;
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        C59723dh dhVar = (C59723dh) C59725dj.f160305d.createBuilder();
        C44050m mVar2 = C44050m.UNSPECIFIED_VERIFY_COOKIES_RESULT;
        switch (mVar.ordinal()) {
            case 4:
                i = 2;
                break;
            case 5:
                i = 3;
                break;
            case 6:
                i = 4;
                break;
            case 7:
                i = 5;
                break;
            case 8:
                i = 6;
                break;
            default:
                i = 1;
                break;
        }
        dhVar.copyOnWrite();
        C59725dj djVar = (C59725dj) dhVar.instance;
        djVar.f160308b = i - 1;
        djVar.f160307a |= 1;
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C59725dj djVar2 = (C59725dj) dhVar.build();
        djVar2.getClass();
        czVar.f160212c = djVar2;
        czVar.f160210a |= 8;
        bVar.mo19974a(gVar.mo40812e(btVar, (C59711cz) cyVar.build()));
    }

    /* renamed from: b */
    public final void mo42501b(C44050m mVar) {
        this.f106417a.mo19974a(C37182a.f97757P.mo40803a(mVar.f114705m, "COOKIE_VERIFY_RESULT"));
    }

    /* renamed from: c */
    public final void mo42502c() {
        this.f106417a.mo19974a(C37182a.f97757P.mo40805c(C62722b.UNKNOWN));
    }

    /* renamed from: d */
    public final void mo42503d(C44044g gVar) {
        this.f106417a.mo19974a(C37182a.f97757P.mo40803a(gVar.f114684m, "COOKIE_REFRESH_RESULT"));
    }

    /* renamed from: e */
    public final void mo42504e() {
        C37215b bVar = this.f106417a;
        C37252a c = this.f106419c.mo40779c();
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        C59723dh dhVar = (C59723dh) C59725dj.f160305d.createBuilder();
        boolean equals = this.f106418b.mo46385c().equals(C43271v.WEB_LAYER);
        dhVar.copyOnWrite();
        C59725dj djVar = (C59725dj) dhVar.instance;
        djVar.f160307a |= 2;
        djVar.f160309c = equals;
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C59725dj djVar2 = (C59725dj) dhVar.build();
        djVar2.getClass();
        czVar.f160212c = djVar2;
        czVar.f160210a |= 8;
        c.mo40792p(btVar, (C59711cz) cyVar.build());
        bVar.mo19974a(c);
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo42505f() {
        return false;
    }
}
