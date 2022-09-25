package com.google.android.apps.search.googleapp.search.suggest.sources.icing;

import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138032ax;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137975a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.ListIterator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.j */
/* compiled from: PG */
public final class C138538j implements C137975a {

    /* renamed from: a */
    private final boolean f376804a;

    /* renamed from: b */
    private final boolean f376805b;

    public C138538j(boolean z, boolean z2) {
        this.f376804a = z;
        this.f376805b = z2;
    }

    /* renamed from: a */
    public final int mo114065a() {
        return 201;
    }

    /* renamed from: b */
    public final C60870cx mo114066b(C138133o oVar, List list, C138134p pVar) {
        C69664n.m101061g(oVar, "request");
        C69664n.m101061g(list, "suggestions");
        C69664n.m101061g(pVar, "responseParameters");
        String str = oVar.f375825b;
        C69664n.m101060f(str, "request.query");
        if (str.length() == 0) {
            C139704d a = C139704d.m227141a(oVar.f375830g);
            if (a == null) {
                a = C139704d.UNKNOWN;
            }
            if (a == C139704d.WIDGET && this.f376804a && !this.f376805b) {
                ListIterator listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    C138030av avVar = (C138030av) listIterator.next();
                    C138032ax a2 = C138032ax.m224334a(avVar.f375547k);
                    if (a2 == null) {
                        a2 = C138032ax.INVALID;
                    }
                    if (a2 != C138032ax.PRIMARY) {
                        C138034az a3 = C138034az.m224336a(avVar.f375545i);
                        if (a3 == null) {
                            a3 = C138034az.NONE;
                        }
                        if (a3 == C138034az.COMPLETE_SERVER) {
                            C138027as asVar = (C138027as) avVar.toBuilder();
                            C138032ax axVar = C138032ax.PRIMARY;
                            asVar.copyOnWrite();
                            C138030av avVar2 = (C138030av) asVar.instance;
                            avVar2.f375547k = axVar.f375579B;
                            avVar2.f375538a |= 128;
                            C62942bv build = asVar.build();
                            C69664n.m101060f(build, "suggestion.toBuilder().s…ionGroup(PRIMARY).build()");
                            listIterator.set(build);
                        }
                    }
                }
            }
        }
        return C60856cj.m92900i(list);
    }
}
