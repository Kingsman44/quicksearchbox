package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.p4553a.C59527cx;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez */
/* compiled from: PG */
public abstract class C113415ez {

    /* renamed from: L */
    public static final C113415ez f314042L;

    static {
        C113414ey R = m187750R();
        R.mo100175t(C48672ag.UNKNOWN);
        f314042L = R.mo100156a();
    }

    /* renamed from: R */
    public static C113414ey m187750R() {
        C113386e eVar = new C113386e();
        eVar.f313953a = BuildConfig.FLAVOR;
        eVar.mo100180y(0);
        eVar.mo100177v(C48580an.UNKNOWN);
        eVar.mo100176u(0);
        eVar.mo100167l(0);
        eVar.mo100174s(C59203do.f157270a);
        eVar.mo100163h(C59203do.f157270a);
        eVar.mo100162g(0.0f);
        eVar.mo100161f(C41679e.f109005p);
        eVar.f313963k = C58729pv.f156485a;
        eVar.mo100160e(C59527cx.f157947n);
        eVar.mo100166k(C113397eh.f314000f);
        eVar.f313968p = C58485gu.m89844l(new C113341cl[0]);
        return eVar;
    }

    /* renamed from: A */
    public abstract Optional mo100188A();

    /* renamed from: B */
    public abstract Optional mo100189B();

    /* renamed from: C */
    public abstract Optional mo100190C();

    /* renamed from: D */
    public abstract Optional mo100191D();

    /* renamed from: E */
    public abstract Optional mo100192E();

    /* renamed from: F */
    public abstract Optional mo100193F();

    /* renamed from: G */
    public abstract Optional mo100194G();

    /* renamed from: H */
    public abstract Optional mo100195H();

    /* renamed from: I */
    public abstract Optional mo100196I();

    /* renamed from: J */
    public abstract Optional mo100197J();

    /* renamed from: K */
    public abstract OptionalInt mo100198K();

    /* renamed from: L */
    public abstract String mo100199L();

    /* renamed from: M */
    public C58485gu mo100054M() {
        throw null;
    }

    /* renamed from: N */
    public C60870cx mo100055N() {
        throw null;
    }

    /* renamed from: O */
    public Optional mo100056O() {
        throw null;
    }

    /* renamed from: P */
    public Optional mo100057P() {
        throw null;
    }

    /* renamed from: Q */
    public String mo100058Q() {
        throw null;
    }

    /* renamed from: S */
    public final String mo100200S() {
        return String.format(Locale.US, "DisplayText='%s', ", new Object[]{mo100199L()}) + String.format(Locale.US, "Type=%d, ", new Object[]{Integer.valueOf(mo100206f())}) + String.format(Locale.US, "Subtype=%d, ", new Object[]{Integer.valueOf(mo100205e())}) + String.format(Locale.US, "SuggestionType=%s, ", new Object[]{mo100210j().name()}) + String.format(Locale.US, "SourceType=%s, ", new Object[]{mo100211k().name()}) + String.format(Locale.US, "SourceScore=%f, ", new Object[]{Double.valueOf(mo100202b())}) + String.format(Locale.US, "CurrentScore=%f, ", new Object[]{Double.valueOf(mo100201a())});
    }

    /* renamed from: a */
    public abstract double mo100201a();

    /* renamed from: b */
    public abstract double mo100202b();

    /* renamed from: c */
    public abstract float mo100203c();

    /* renamed from: d */
    public abstract int mo100204d();

    /* renamed from: e */
    public abstract int mo100205e();

    /* renamed from: f */
    public abstract int mo100206f();

    /* renamed from: g */
    public abstract C113397eh mo100207g();

    /* renamed from: h */
    public abstract C113414ey mo100208h();

    public abstract int hashCode();

    /* renamed from: i */
    public abstract C41679e mo100209i();

    /* renamed from: j */
    public abstract C48580an mo100210j();

    /* renamed from: k */
    public abstract C48672ag mo100211k();

    /* renamed from: l */
    public abstract C58485gu mo100212l();

    /* renamed from: m */
    public abstract C58495hd mo100213m();

    /* renamed from: n */
    public abstract C59527cx mo100214n();

    /* renamed from: o */
    public abstract Optional mo100215o();

    /* renamed from: p */
    public abstract Optional mo100216p();

    /* renamed from: q */
    public abstract Optional mo100217q();

    /* renamed from: r */
    public abstract Optional mo100218r();

    /* renamed from: s */
    public abstract Optional mo100219s();

    /* renamed from: t */
    public abstract Optional mo100220t();

    /* renamed from: u */
    public abstract Optional mo100221u();

    /* renamed from: v */
    public abstract Optional mo100222v();

    /* renamed from: w */
    public abstract Optional mo100223w();

    /* renamed from: x */
    public abstract Optional mo100224x();

    /* renamed from: y */
    public abstract Optional mo100225y();

    /* renamed from: z */
    public abstract Optional mo100226z();
}
