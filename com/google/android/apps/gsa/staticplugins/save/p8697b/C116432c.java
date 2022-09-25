package com.google.android.apps.gsa.staticplugins.save.p8697b;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.save.p8694a.C116371ab;
import com.google.android.apps.gsa.staticplugins.save.p8694a.C116381al;
import com.google.android.apps.gsa.staticplugins.save.p8694a.C116420z;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;
import com.google.android.apps.search.googleapp.p10539y.p10540a.C139883a;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.b.c */
/* compiled from: PG */
public final class C116432c implements C23113i {

    /* renamed from: a */
    private final C116421a f322844a;

    public C116432c(C116421a aVar) {
        this.f322844a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SaveEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("changeList")) {
                ((C116381al) this.f322844a).mo102678t();
            } else if (str.equals("listSelected_com.google.android.apps.gsa.staticplugins.save.shared.proto.ModelProto.ListSelectorItem_java.lang.Boolean")) {
                C116424c cVar = (C116424c) new C23271p(C116424c.f322815o.getParserForType(), C62921ba.m95368a(), C116424c.f322815o).mo28733b("list", pVar);
                Boolean valueOf = Boolean.valueOf(pVar.f63472a.getBoolean("createList"));
                C116381al alVar = (C116381al) this.f322844a;
                ((C23251a) alVar.f322715c.mo102662g()).mo28730f(C58833ax.m90834k(C116435f.CONFIRMATION_TRAY_VISIBLE), false);
                C116424c cVar2 = alVar.f322721i;
                if (cVar2 == null || !cVar2.equals(cVar)) {
                    if (!valueOf.booleanValue()) {
                        alVar.f322721i = cVar;
                    }
                    alVar.mo102670l(cVar, valueOf.booleanValue());
                }
            } else if (str.equals("viewList")) {
                C116381al alVar2 = (C116381al) this.f322844a;
                C116424c cVar3 = alVar2.f322721i;
                if (cVar3 == null) {
                    alVar2.mo102674p(720908);
                    return;
                }
                C116420z zVar = alVar2.f322719g;
                String str3 = cVar3.f322825j;
                if (C58837ba.m90859h(str3)) {
                    zVar.f322810a.mo78753h(5, C58833ax.m90834k(C139883a.m227490b(C116371ab.m193011b(cVar3))), C58836b.f156633a);
                } else {
                    zVar.f322810a.mo78753h(5, C58833ax.m90833j(Uri.parse(str3).getPath()), C58836b.f156633a);
                }
                alVar2.f322714b.mo28600c();
            }
        }
    }
}
