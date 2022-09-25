package com.google.android.libraries.p590as.p593b.p596b;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10878f;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.android.libraries.p590as.p593b.p596b.p604g.C10881i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58526ih;
import java.util.Locale;

/* renamed from: com.google.android.libraries.as.b.b.ax */
/* compiled from: PG */
public final /* synthetic */ class C10820ax implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C10846ba f35862a;

    public /* synthetic */ C10820ax(C10846ba baVar) {
        this.f35862a = baVar;
    }

    public final Object apply(Object obj) {
        C10846ba baVar = this.f35862a;
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i(((C10881i) obj).f35967a);
        if (baVar.f35905e) {
            String languageTag = Locale.getDefault().toLanguageTag();
            C10878f fVar = (C10878f) C10879g.f35958g.createBuilder();
            fVar.copyOnWrite();
            C10879g gVar = (C10879g) fVar.instance;
            languageTag.getClass();
            gVar.f35960a |= 1;
            gVar.f35961b = languageTag;
            ihVar.mo55373c((C10879g) fVar.build());
        }
        return ihVar.mo55486f();
    }
}
