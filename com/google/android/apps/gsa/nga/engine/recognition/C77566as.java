package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.as */
/* compiled from: PG */
public abstract class C77566as {

    /* renamed from: m */
    public static final C58974d f213709m = C58974d.m91136j();

    /* renamed from: o */
    public static C77566as m124462o(C37672hs hsVar) {
        C77885q x = m124464x();
        x.f214553h = 7;
        x.f214548c = Optional.m71637of(hsVar);
        return x.mo72859a();
    }

    /* renamed from: p */
    public static C77566as m124463p() {
        C77885q x = m124464x();
        x.f214553h = 1;
        return x.mo72859a();
    }

    /* renamed from: x */
    public static C77885q m124464x() {
        C77885q qVar = new C77885q();
        qVar.mo72863e(16000);
        qVar.mo72860b(1);
        qVar.f214546a = 2;
        qVar.f214552g = (byte) (qVar.f214552g | 4);
        qVar.mo72864f(Optional.empty());
        qVar.mo72862d(false);
        qVar.mo72861c(false);
        return qVar;
    }

    /* renamed from: a */
    public abstract int mo72678a();

    /* renamed from: b */
    public abstract int mo72679b();

    /* renamed from: c */
    public abstract int mo72680c();

    /* renamed from: d */
    public abstract Optional mo72681d();

    /* renamed from: e */
    public abstract Optional mo72682e();

    /* renamed from: f */
    public abstract Optional mo72683f();

    /* renamed from: g */
    public abstract Optional mo72684g();

    /* renamed from: h */
    public abstract Optional mo72685h();

    /* renamed from: i */
    public abstract Optional mo72686i();

    /* renamed from: j */
    public abstract boolean mo72687j();

    /* renamed from: k */
    public abstract boolean mo72688k();

    /* renamed from: l */
    public abstract C77885q mo72689l();

    /* renamed from: m */
    public abstract int mo72690m();

    /* renamed from: n */
    public final C77548aa mo72691n() {
        if ((mo72693r().isPresent() && !((Boolean) mo72693r().get()).booleanValue()) || mo72690m() == 8) {
            return C77548aa.PREEMPTIBLE;
        }
        if (mo72698w()) {
            return C77548aa.DSP;
        }
        if (mo72696u()) {
            return C77548aa.DSP_BISTO;
        }
        if (mo72695t()) {
            return C77548aa.BISTO;
        }
        return C77548aa.BUILT_IN;
    }

    /* renamed from: q */
    public final C77566as mo72692q() {
        C77885q l = mo72689l();
        l.mo72863e(16000);
        l.mo72862d(true);
        return l.mo72859a();
    }

    /* renamed from: r */
    public final Optional mo72693r() {
        if (mo72698w()) {
            return Optional.m71637of(Boolean.valueOf(((HotwordResult) mo72682e().get()).mo84678C()));
        }
        if (mo72696u()) {
            return Optional.m71637of(true);
        }
        return Optional.empty();
    }

    /* renamed from: s */
    public final boolean mo72694s() {
        return mo72690m() == 2;
    }

    /* renamed from: t */
    public final boolean mo72695t() {
        return mo72690m() == 7;
    }

    /* renamed from: u */
    public final boolean mo72696u() {
        return mo72690m() == 6 && mo72682e().isPresent() && ((HotwordResult) mo72682e().get()).mo84704u().mo56113h() && ((HotwordResult) mo72682e().get()).mo84698p().mo56113h() && ((HotwordResult) mo72682e().get()).mo84699q().mo56113h();
    }

    /* renamed from: v */
    public final boolean mo72697v() {
        return mo72690m() == 1;
    }

    /* renamed from: w */
    public final boolean mo72698w() {
        return mo72690m() == 4 && mo72682e().isPresent();
    }
}
