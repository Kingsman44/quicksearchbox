package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import android.content.ComponentName;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113187cr;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113259al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113263ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54813af;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.e */
/* compiled from: PG */
public final /* synthetic */ class C111401e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C113188cs f309954a;

    public /* synthetic */ C111401e(C113188cs csVar) {
        this.f309954a = csVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C113188cs csVar = this.f309954a;
        C113415ez ezVar = (C113415ez) obj;
        Intent a = C113188cs.m187209a(ezVar);
        C41663ac acVar = ezVar.mo100209i().f109008b;
        if (acVar == null) {
            acVar = C41663ac.f108934g;
        }
        if (acVar.f108937b != 3 || a == null) {
            C58976aa aaVar = C58975e.f156826a;
            ezVar.mo100199L();
            return Optional.empty();
        }
        C113263ap apVar = new C113263ap();
        apVar.f313630b = Optional.m71637of(a);
        ComponentName component = a.getComponent();
        if (component != null) {
            str = component.getPackageName();
            Optional k = csVar.f313513b.mo99852k(str);
            Objects.requireNonNull(apVar);
            k.ifPresent(new C113187cr(apVar));
        } else {
            C41663ac acVar2 = ezVar.mo100209i().f109008b;
            if (acVar2 == null) {
                acVar2 = C41663ac.f108934g;
            }
            apVar.f313629a = Optional.m71637of(C113259al.m187318c(acVar2.f108937b == 3 ? (String) acVar2.f108938c : BuildConfig.FLAVOR));
            C59104x d = C113188cs.f313512a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasCreationUtils");
            ((C59052c) ((C59052c) d).mo56372aa(27978)).mo56389s("Null intent package! %s", ezVar);
            str = BuildConfig.FLAVOR;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        ezVar.mo100199L();
        C113414ey h = ezVar.mo100208h();
        h.mo100175t(C48672ag.APPS);
        h.mo100164i(ezVar.mo100199L());
        h.mo100174s(C59203do.f157270a);
        h.mo100168m(apVar.mo99958a());
        h.mo100167l(20010);
        h.mo100180y(20010);
        h.mo100177v(C48580an.ICON_SHORTCUT);
        h.mo100169n(C54813af.APPS);
        h.mo100173r(csVar.f313515d.mo99841a(ezVar.mo100199L(), str));
        return Optional.m71637of(h.mo100156a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
