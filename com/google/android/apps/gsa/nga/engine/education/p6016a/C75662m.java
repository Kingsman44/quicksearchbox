package com.google.android.apps.gsa.nga.engine.education.p6016a;

import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p4008y.p4009a.C53552al;
import com.google.assistant.p4008y.p4009a.C53561au;
import com.google.assistant.p4008y.p4009a.C53569bb;
import com.google.assistant.p4008y.p4009a.C53585br;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.m */
/* compiled from: PG */
public final /* synthetic */ class C75662m implements Function {

    /* renamed from: a */
    public final /* synthetic */ C53593bz f210027a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210028b;

    public /* synthetic */ C75662m(C53593bz bzVar, Locale locale) {
        this.f210027a = bzVar;
        this.f210028b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53561au auVar;
        C75649ah ahVar;
        Optional optional;
        String str;
        Optional optional2;
        C75641a aVar;
        Integer num;
        Integer num2;
        C53593bz bzVar = this.f210027a;
        Locale locale = this.f210028b;
        C53552al alVar = (C53552al) obj;
        if (alVar.f140542b == 2) {
            auVar = (C53561au) alVar.f140543c;
        } else {
            auVar = C53561au.f140569h;
        }
        C62963cj cjVar = new C62963cj(auVar.f140573c, C53561au.f140568d);
        C62971cq cqVar = auVar.f140575f;
        Stream stream = Collection.EL.stream(cjVar);
        C58495hd hdVar = C75675z.f210064d;
        Objects.requireNonNull(hdVar);
        C58528ij ijVar = (C58528ij) stream.map(new C75659j(hdVar)).filter(C75660k.f210025a).collect(C58370cn.f155947b);
        C58528ij ijVar2 = (C58528ij) Collection.EL.stream(cqVar).collect(C58370cn.f155947b);
        if ((auVar.f140571a & 4) != 0) {
            locale = Locale.forLanguageTag(auVar.f140576g);
        }
        C75644ac l = C75650ai.m121912l();
        l.mo71787d(auVar.f140572b);
        C75654e eVar = (C75654e) l;
        eVar.f209998d = C75653d.m121929a(bzVar.f140661b);
        l.mo71788e(locale);
        l.mo71786c(ijVar);
        if ((bzVar.f140660a & 16) != 0) {
            ahVar = C75653d.m121929a(bzVar.f140665f);
        } else {
            if (cqVar.size() == 1) {
                String str2 = (String) cqVar.get(0);
                if (C75675z.f210065e.containsKey(str2) && (num2 = (Integer) C75675z.f210065e.get(str2)) != null) {
                    aVar = new C75641a(num2.intValue());
                    ahVar = aVar;
                }
            }
            String str3 = bzVar.f140662c;
            if (!C75675z.f210066f.containsKey(str3) || (num = (Integer) C75675z.f210066f.get(str3)) == null) {
                ahVar = new C75641a(R.string.nga_quick_actions_suggestion_hint);
            } else {
                aVar = new C75641a(num.intValue());
                ahVar = aVar;
            }
        }
        eVar.f209997c = ahVar;
        if ((bzVar.f140660a & 64) != 0) {
            C53569bb bbVar = bzVar.f140667h;
            if (bbVar == null) {
                bbVar = C53569bb.f140594i;
            }
            optional = Optional.m71637of(bbVar);
        } else {
            optional = Optional.empty();
        }
        l.mo71790g(optional);
        if (!bzVar.f140663d.isEmpty()) {
            str = bzVar.f140663d;
        } else {
            if (cqVar.size() == 1) {
                String str4 = (String) cqVar.get(0);
                if (C75675z.f210067g.containsKey(str4)) {
                    str = (String) C75675z.f210067g.get(str4);
                }
            }
            String str5 = bzVar.f140662c;
            str = C75675z.f210068h.containsKey(str5) ? (String) C75675z.f210068h.get(str5) : BuildConfig.FLAVOR;
        }
        eVar.f210001g = str;
        C75645ad c = C75646ae.m121905c();
        C53585br brVar = bzVar.f140668i;
        if (brVar == null) {
            brVar = C53585br.f140639d;
        }
        c.mo71793c(brVar.f140642b);
        C53585br brVar2 = bzVar.f140668i;
        if (((brVar2 == null ? C53585br.f140639d : brVar2).f140641a & 2) != 0) {
            if (brVar2 == null) {
                brVar2 = C53585br.f140639d;
            }
            optional2 = Optional.m71637of(brVar2.f140643c);
        } else {
            optional2 = Optional.empty();
        }
        c.mo71792b(optional2);
        l.mo71785b(c.mo71791a());
        if ((auVar.f140571a & 2) != 0) {
            eVar.f209999e = Optional.ofNullable(auVar.f140574e);
        }
        if (!auVar.f140575f.isEmpty()) {
            l.mo71789f(ijVar2);
        }
        return l.mo71784a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
