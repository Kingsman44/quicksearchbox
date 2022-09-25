package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21237ag;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.youtube.p5283a.p5284a.C68074bj;
import java.util.BitSet;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.d.dy */
/* compiled from: PG */
public final class C20929dy extends C6405o {

    /* renamed from: a */
    public C21065ea f58694a;

    /* renamed from: d */
    private final String[] f58695d = {"commandResolver", "conversionContext", "drawableRequester", "logger", "styleRunExtensionConverters", "textType", "typefaceProvider"};

    /* renamed from: e */
    private final BitSet f58696e = new BitSet(7);

    /* renamed from: W */
    public final void mo26057W(C21296cl clVar) {
        this.f58694a.f59040J = clVar;
        this.f58696e.set(6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13260b(C6407q qVar) {
        this.f58694a = (C21065ea) qVar;
    }

    /* renamed from: c */
    public final C21065ea mo13259a() {
        m17225m(7, this.f58696e, this.f58695d);
        return this.f58694a;
    }

    /* renamed from: d */
    public final void mo26059d(C21313t tVar) {
        this.f58694a.f59042b = tVar;
        this.f58696e.set(0);
    }

    /* renamed from: e */
    public final void mo26060e(C21319z zVar) {
        this.f58694a.f59043c = zVar;
        this.f58696e.set(1);
    }

    /* renamed from: f */
    public final void mo26061f(C21237ag agVar) {
        this.f58694a.f59044d = agVar;
        this.f58696e.set(2);
    }

    /* renamed from: g */
    public final void mo26062g(C6411u uVar, C21065ea eaVar) {
        super.mo13449w(uVar, eaVar);
        this.f58694a = eaVar;
        this.f58696e.clear();
    }

    /* renamed from: h */
    public final void mo26063h(C21259bb bbVar) {
        this.f58694a.f59032B = bbVar;
        this.f58696e.set(3);
    }

    /* renamed from: i */
    public final void mo26064i(Map map) {
        this.f58694a.f59038H = map;
        this.f58696e.set(4);
    }

    /* renamed from: j */
    public final void mo26065j(C68074bj bjVar) {
        this.f58694a.f59039I = bjVar;
        this.f58696e.set(5);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo13268k() {
    }
}
