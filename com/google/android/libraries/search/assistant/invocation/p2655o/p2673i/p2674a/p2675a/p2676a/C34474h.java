package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81052j;
import com.google.android.apps.gsa.shared.speech.hotword.C90599p;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37496dc;
import com.google.android.libraries.search.p2904c.C37655hb;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.speech.p5208h.C66626cx;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.h */
/* compiled from: PG */
final class C34474h extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C37672hs f91601a;

    /* renamed from: b */
    final /* synthetic */ C81052j f91602b;

    /* renamed from: c */
    final /* synthetic */ C37467cp f91603c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34474h(C37672hs hsVar, C81052j jVar, C37467cp cpVar) {
        super(1);
        this.f91601a = hsVar;
        this.f91602b = jVar;
        this.f91603c = cpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C37496dc dcVar;
        C37496dc dcVar2;
        C90599p pVar = (C90599p) obj;
        C69664n.m101061g(pVar, "$this$convert");
        pVar.mo84724m(this.f91601a);
        C66626cx a = C66626cx.m97268a(this.f91602b.f222160e);
        if (a == null) {
            a = C66626cx.DEVICE_TYPE_UNKNOWN;
        }
        pVar.mo84718g(a);
        C37467cp cpVar = this.f91603c;
        if (cpVar.f99460a == 5) {
            dcVar = (C37496dc) cpVar.f99461b;
        } else {
            dcVar = C37496dc.f99549c;
        }
        C37655hb hbVar = dcVar.f99552b;
        if (hbVar == null) {
            hbVar = C37655hb.f100025d;
        }
        pVar.mo84729r(hbVar.f100028b);
        C37467cp cpVar2 = this.f91603c;
        if (cpVar2.f99460a == 5) {
            dcVar2 = (C37496dc) cpVar2.f99461b;
        } else {
            dcVar2 = C37496dc.f99549c;
        }
        C37655hb hbVar2 = dcVar2.f99552b;
        if (hbVar2 == null) {
            hbVar2 = C37655hb.f100025d;
        }
        pVar.mo84723l(hbVar2.f100029c);
        return C69788q.f186170a;
    }
}
