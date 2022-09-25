package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1233b;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16064a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.C16189a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16356bc;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16359bf;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16360bg;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.b.b */
/* compiled from: PG */
public final class C16199b implements C16189a {

    /* renamed from: a */
    private final C21370a f47762a;

    /* renamed from: b */
    private final Context f47763b;

    public C16199b(C21370a aVar, Context context) {
        this.f47762a = aVar;
        this.f47763b = context;
    }

    /* renamed from: b */
    private final C16170n m33235b(C16170n nVar) {
        C16064a aVar = new C16064a();
        aVar.mo22677c(nVar.mo22752f());
        aVar.f47529b = (String) nVar.mo22747b().f48083h.get(0);
        aVar.mo22676b(nVar.mo22750e());
        aVar.mo22678d(nVar.mo22753g());
        aVar.mo22680f(nVar.mo22746a());
        aVar.mo22679e(nVar.mo22747b());
        aVar.f47530c = Long.valueOf(this.f47762a.mo26870b());
        return aVar.mo22675a();
    }

    /* renamed from: a */
    public final List mo22848a(List list, C15777d dVar) {
        Optional optional;
        Optional optional2;
        Optional optional3;
        Optional optional4;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16170n nVar = (C16170n) it.next();
            C58976aa aaVar = C58975e.f156826a;
            nVar.mo22750e();
            C16327aa aaVar2 = C16327aa.UNKNOWN_ACTION_TYPE;
            C16327aa a = C16327aa.m33331a(nVar.mo22747b().f48080e);
            if (a == null) {
                a = C16327aa.UNKNOWN_ACTION_TYPE;
            }
            int ordinal = a.ordinal();
            if (ordinal != 25) {
                if (ordinal != 31) {
                    switch (ordinal) {
                        case 17:
                            C16360bg e = dVar.mo22547e();
                            boolean isEmpty = e.f48164d.isEmpty();
                            boolean z = e.f48162b;
                            if (!isEmpty || !z) {
                                optional3 = Optional.empty();
                            } else {
                                optional3 = Optional.m71637of(m33235b(nVar));
                            }
                            Objects.requireNonNull(arrayList);
                            optional3.ifPresent(new C16198a(arrayList));
                            continue;
                        case 18:
                            C16360bg e2 = dVar.mo22547e();
                            boolean isEmpty2 = e2.f48164d.isEmpty();
                            boolean z2 = e2.f48162b;
                            C16359bf bfVar = e2.f48165e;
                            if (bfVar == null) {
                                bfVar = C16359bf.f48152f;
                            }
                            boolean z3 = bfVar.f48155b;
                            if (isEmpty2 || !z2 || z3) {
                                optional4 = Optional.empty();
                            } else {
                                optional4 = Optional.m71637of(m33235b(nVar));
                            }
                            Objects.requireNonNull(arrayList);
                            optional4.ifPresent(new C16198a(arrayList));
                            continue;
                        case 19:
                            break;
                        default:
                            C16327aa a2 = C16327aa.m33331a(nVar.mo22747b().f48080e);
                            if (a2 == null) {
                                a2 = C16327aa.UNKNOWN_ACTION_TYPE;
                            }
                            a2.name();
                            continue;
                    }
                }
                C16360bg e3 = dVar.mo22547e();
                boolean z4 = e3.f48166f;
                C16356bc bcVar = e3.f48163c;
                if (bcVar == null) {
                    bcVar = C16356bc.f48144g;
                }
                boolean z5 = bcVar.f48147b;
                if (z4 || (!z5 && !dVar.mo22544b().mo22733g().equals(C16090ap.MORRIS_DRIVING_SCREEN))) {
                    optional2 = Optional.empty();
                } else {
                    C36619a.m65147c(this.f47763b);
                    optional2 = Optional.m71637of(m33235b(nVar));
                }
                Objects.requireNonNull(arrayList);
                optional2.ifPresent(new C16198a(arrayList));
            } else {
                C16359bf bfVar2 = dVar.mo22547e().f48165e;
                if (bfVar2 == null) {
                    bfVar2 = C16359bf.f48152f;
                }
                if (bfVar2.f48157d) {
                    optional = Optional.empty();
                } else {
                    optional = Optional.m71637of(m33235b(nVar));
                }
                Objects.requireNonNull(arrayList);
                optional.ifPresent(new C16198a(arrayList));
            }
        }
        C58976aa aaVar3 = C58975e.f156826a;
        return arrayList;
    }
}
