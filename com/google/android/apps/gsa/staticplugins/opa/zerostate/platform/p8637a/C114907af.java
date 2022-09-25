package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114742l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114756j;
import com.google.android.material.bottomsheet.C44565p;
import com.google.assistant.p3994s.p3995a.C53064aa;
import com.google.assistant.p3994s.p3995a.C53070ag;
import com.google.assistant.p3994s.p3995a.C53470z;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.af */
/* compiled from: PG */
public final class C114907af {

    /* renamed from: a */
    C114906ae f318794a;

    /* renamed from: b */
    private final Context f318795b;

    /* renamed from: c */
    private final C44565p f318796c;

    /* renamed from: d */
    private final C114914am f318797d;

    /* renamed from: e */
    private final C114947y f318798e;

    /* renamed from: f */
    private final C114943u f318799f;

    /* renamed from: g */
    private final C114756j f318800g;

    /* renamed from: h */
    private C114913al f318801h;

    /* renamed from: i */
    private C114946x f318802i;

    /* renamed from: j */
    private C114942t f318803j;

    public C114907af(Context context, C114914am amVar, C114947y yVar, C114943u uVar, C44565p pVar, C114756j jVar) {
        this.f318795b = context;
        this.f318796c = pVar;
        this.f318797d = amVar;
        this.f318798e = yVar;
        this.f318799f = uVar;
        this.f318800g = jVar;
    }

    /* renamed from: a */
    public final void mo101699a(C53070ag agVar) {
        C53064aa aaVar;
        C53070ag agVar2 = agVar;
        int i = agVar2.f139076b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 6 ? i != 7 ? 0 : 4 : 3 : 2 : 1 : 5;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                if (this.f318802i == null) {
                    C114947y yVar = this.f318798e;
                    C44565p pVar = this.f318796c;
                    C114756j jVar = this.f318800g;
                    Context context = (Context) yVar.f318938a.mo17428b();
                    context.getClass();
                    C114919ar arVar = (C114919ar) yVar.f318939b.mo17428b();
                    arVar.getClass();
                    C68214a a = C68219e.m98518a(((C68226l) yVar.f318940c).f184585a);
                    a.getClass();
                    C68214a a2 = C68219e.m98518a(((C68226l) yVar.f318941d).f184585a);
                    a2.getClass();
                    this.f318802i = new C114946x(context, arVar, a, a2, pVar, jVar);
                }
                this.f318794a = this.f318802i;
            } else if (i3 != 1) {
                if (this.f318801h == null) {
                    C114914am amVar = this.f318797d;
                    C44565p pVar2 = this.f318796c;
                    C114756j jVar2 = this.f318800g;
                    Context context2 = (Context) amVar.f318832a.mo17428b();
                    context2.getClass();
                    C114912ak akVar = (C114912ak) amVar.f318833b.mo17428b();
                    akVar.getClass();
                    C114918aq aqVar = (C114918aq) amVar.f318834c.mo17428b();
                    aqVar.getClass();
                    C114903ab abVar = (C114903ab) amVar.f318835d.mo17428b();
                    abVar.getClass();
                    C114742l lVar = (C114742l) amVar.f318836e.mo17428b();
                    lVar.getClass();
                    ((C114919ar) amVar.f318837f.mo17428b()).getClass();
                    C68214a a3 = C68219e.m98518a(((C68226l) amVar.f318838g).f184585a);
                    a3.getClass();
                    C86124t tVar = (C86124t) amVar.f318839h.mo17428b();
                    tVar.getClass();
                    this.f318801h = new C114913al(context2, akVar, aqVar, abVar, lVar, a3, pVar2, tVar, jVar2);
                }
                this.f318794a = this.f318801h;
            } else {
                if (this.f318803j == null) {
                    C114943u uVar = this.f318799f;
                    C44565p pVar3 = this.f318796c;
                    C114756j jVar3 = this.f318800g;
                    C68214a a4 = C68219e.m98518a(((C68226l) uVar.f318917a).f184585a);
                    a4.getClass();
                    Context context3 = (Context) uVar.f318918b.mo17428b();
                    context3.getClass();
                    C114931i iVar = (C114931i) uVar.f318919c.mo17428b();
                    iVar.getClass();
                    C114935m mVar = (C114935m) uVar.f318920d.mo17428b();
                    mVar.getClass();
                    C114919ar arVar2 = (C114919ar) uVar.f318921e.mo17428b();
                    arVar2.getClass();
                    C68214a a5 = C68219e.m98518a(((C68226l) uVar.f318922f).f184585a);
                    a5.getClass();
                    C114742l lVar2 = (C114742l) uVar.f318923g.mo17428b();
                    lVar2.getClass();
                    C68214a a6 = C68219e.m98518a(((C68226l) uVar.f318924h).f184585a);
                    a6.getClass();
                    C114942t tVar2 = r5;
                    C114942t tVar3 = new C114942t(a4, context3, iVar, mVar, arVar2, a5, lVar2, a6, pVar3, jVar3);
                    this.f318803j = tVar2;
                }
                this.f318794a = this.f318803j;
            }
            C114906ae aeVar = this.f318794a;
            if (aeVar != null) {
                aeVar.mo101698m(agVar2);
                this.f318796c.setContentView(this.f318794a.mo101694h(), new ViewGroup.LayoutParams(-1, -2));
                C114906ae aeVar2 = this.f318794a;
                aeVar2.getClass();
                View i4 = aeVar2.mo101695i();
                if (agVar2.f139076b == 2) {
                    aaVar = (C53064aa) agVar2.f139077c;
                } else {
                    aaVar = C53064aa.f139063d;
                }
                C53470z zVar = aaVar.f139067c;
                if (zVar == null) {
                    zVar = C53470z.f140330c;
                }
                if (zVar.f140332a.isEmpty() && i4 != null && i4.requestFocus()) {
                    ((InputMethodManager) this.f318795b.getSystemService("input_method")).showSoftInput(i4, 1);
                    Window window = this.f318796c.getWindow();
                    window.getClass();
                    window.setSoftInputMode(20);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }
}
