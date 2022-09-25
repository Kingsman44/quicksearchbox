package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110972aj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110985aw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111029bz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111062l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113126ak;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C111331a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111370f f309798a;

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f309799b;

    /* renamed from: c */
    public final /* synthetic */ String f309800c;

    /* renamed from: d */
    public final /* synthetic */ int f309801d;

    public /* synthetic */ C111331a(C111370f fVar, Map.Entry entry, String str, int i) {
        this.f309798a = fVar;
        this.f309799b = entry;
        this.f309800c = str;
        this.f309801d = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        double d;
        C111370f fVar = this.f309798a;
        Map.Entry entry = this.f309799b;
        String str = this.f309800c;
        int i = this.f309801d;
        C54759g gVar = (C54759g) obj;
        C49301bt btVar = (C49301bt) entry.getKey();
        double doubleValue = ((Double) entry.getValue()).doubleValue();
        C48670ae a = ((C111029bz) fVar.f309890a.mo27525b()).mo99018a(((C49301bt) entry.getKey()).f127426b);
        if (!((C111029bz) fVar.f309890a.mo27525b()).mo99022e(gVar, a)) {
            d = C59203do.f157270a;
        } else {
            C110972aj ajVar = (C110972aj) fVar.f309891b.mo27525b();
            C54773u uVar = gVar.f143681a;
            if (uVar == null) {
                uVar = C54773u.f143704c;
            }
            C48582b a2 = ajVar.mo98996a(uVar.f143706a);
            if (!fVar.f309892c.mo79746e(C90063do.f249279aY)) {
                d = fVar.f309892c.mo79747m(C90063do.f249642r);
            } else {
                C111029bz bzVar = (C111029bz) fVar.f309890a.mo27525b();
                Optional d2 = bzVar.mo99021d(a);
                C60870cx e = bzVar.f309215b.mo98999e(a2);
                AtomicReference atomicReference = new AtomicReference();
                C60856cj.m92895d(e).mo57334a(new C110985aw(atomicReference, e), C60826bg.f164896a);
                if (d2.isEmpty()) {
                    d = bzVar.f309221h.mo99887a(str, Stream.CC.m71935of(atomicReference.toString()), i);
                } else {
                    C113126ak akVar = bzVar.f309221h;
                    Stream concat = Stream.CC.concat(Collection.EL.stream(bzVar.f309215b.mo98997b((C111062l) d2.get(), true, false)), Stream.CC.m71935of(atomicReference.toString()));
                    if (!TextUtils.isEmpty(str)) {
                        String lowerCase = str.trim().toLowerCase(Locale.getDefault());
                        C58485gu guVar = (C58485gu) concat.collect(C58370cn.f155946a);
                        int size = guVar.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            String str2 = (String) guVar.get(i2);
                            if (!TextUtils.isEmpty(str2) && lowerCase.equals(str2.trim().toLowerCase(Locale.getDefault()))) {
                                d = bzVar.f309214a.mo79747m(C90063do.f249642r);
                                break;
                            }
                            i2++;
                        }
                    }
                    d = bzVar.f309221h.mo99887a(str, Stream.CC.concat(Collection.EL.stream(bzVar.f309215b.mo98997b((C111062l) d2.get(), false, true)), Stream.CC.m71935of(atomicReference.toString())), i);
                }
            }
            C58976aa aaVar = C58975e.f156826a;
            C54773u uVar2 = gVar.f143681a;
            if (uVar2 == null) {
                uVar2 = C54773u.f143704c;
            }
            String str3 = uVar2.f143706a;
        }
        return new C111371g(gVar, btVar, doubleValue * d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
