package com.google.android.apps.gsa.staticplugins.p7614bx.p7620c;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.p6467p.C84040d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.c.r */
/* compiled from: PG */
public final class C97415r {

    /* renamed from: a */
    public static final C58528ij f272040a = C58528ij.m90015O("de", "es", "fr", "it", "ja", "ko", "ru", "cs", "da", "fi", "id", "in", "nb", "nl", "no", "pl", "sv", "th", "tr", "uk", "vi");

    /* renamed from: b */
    public static final C58528ij f272041b = C58528ij.m90012L("pt_BR", "zh_TW", "zh_HK");

    /* renamed from: c */
    public final C68214a f272042c;

    /* renamed from: d */
    public final C89257aa f272043d;

    /* renamed from: e */
    public final C86124t f272044e;

    /* renamed from: f */
    public final C86054o f272045f;

    /* renamed from: g */
    public final C22871g f272046g;

    /* renamed from: h */
    public final C68214a f272047h;

    /* renamed from: i */
    public final C84040d f272048i;

    /* renamed from: j */
    private final cb f272049j;

    public C97415r(C68214a aVar, C89257aa aaVar, C86124t tVar, C86054o oVar, cb cbVar, C84040d dVar, C22871g gVar, C68214a aVar2) {
        this.f272042c = aVar;
        this.f272043d = aaVar;
        this.f272044e = tVar;
        this.f272045f = oVar;
        this.f272049j = cbVar;
        this.f272048i = dVar;
        this.f272046g = gVar;
        this.f272047h = aVar2;
    }

    /* renamed from: a */
    public final boolean mo90710a() {
        Account a = this.f272045f.mo79668a();
        return a != null && !this.f272049j.f(a);
    }
}
