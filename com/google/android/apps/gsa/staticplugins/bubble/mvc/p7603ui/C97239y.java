package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58586kn;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.y */
/* compiled from: PG */
public final /* synthetic */ class C97239y implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97136ah f271650a;

    /* renamed from: b */
    public final /* synthetic */ C28293k f271651b;

    /* renamed from: c */
    public final /* synthetic */ C28293k f271652c;

    /* renamed from: d */
    public final /* synthetic */ C28293k f271653d;

    public /* synthetic */ C97239y(C97136ah ahVar, C28293k kVar, C28293k kVar2, C28293k kVar3) {
        this.f271650a = ahVar;
        this.f271651b = kVar;
        this.f271652c = kVar2;
        this.f271653d = kVar3;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int i;
        C28292j jVar;
        C97136ah ahVar = this.f271650a;
        C28293k kVar = this.f271651b;
        C28293k kVar2 = this.f271652c;
        C28293k kVar3 = this.f271653d;
        C28257a aVar = (C28257a) kVar;
        C28293k c = C28293k.m52906c(aVar.f76908a, C58431eu.m89653c(aVar.f76909b, C58431eu.m89653c(C58431eu.m89654f(new C58586kn(kVar2, new C28293k[0])).mo55248h(), (List) obj)));
        C28292j jVar2 = new C28292j(50125);
        C58431eu f = C58431eu.m89654f(new C58586kn(kVar3, new C28293k[]{c}));
        C58480gp e = C58485gu.m89837e();
        if (ahVar.mo90530r()) {
            i = ahVar.f271412j;
        } else {
            i = ahVar.f271412j + 1;
        }
        if (i == 1) {
            jVar = new C28292j(70864);
        } else if (i == 2) {
            jVar = new C28292j(70861);
        } else if (i == 3) {
            jVar = new C28292j(70862);
        } else {
            jVar = i >= 4 ? new C28292j(70872) : null;
        }
        e.mo55395g(C28293k.m52908e(jVar, new C28293k[0]));
        if (ahVar.mo90530r()) {
            e.mo55395g(C28293k.m52908e(new C28292j(70863), new C28293k[0]));
        }
        int i2 = ahVar.f271413k;
        if (i2 != 0) {
            e.mo55395g(C28293k.m52908e(new C28292j(i2), new C28293k[0]));
        }
        return C28293k.m52906c(jVar2, C58431eu.m89653c(f.mo55248h(), e.mo55394f()));
    }
}
