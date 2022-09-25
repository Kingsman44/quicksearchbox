package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80556a;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80557b;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.b */
/* compiled from: PG */
public final /* synthetic */ class C77634b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C37514du f213852a;

    public /* synthetic */ C77634b(C37514du duVar) {
        this.f213852a = duVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C37512ds dsVar;
        C37514du duVar = this.f213852a;
        C80556a aVar = (C80556a) ((C80557b) obj).toBuilder();
        int i = duVar.f99631a;
        if (i == 1) {
            C37516dw a = C37516dw.m66521a(((Integer) duVar.f99632b).intValue());
            if (a == null) {
                a = C37516dw.UNKNOWN_CLOSING_SUCCESS;
            }
            str = a.name();
        } else {
            if (i == 2) {
                dsVar = C37512ds.m66519a(((Integer) duVar.f99632b).intValue());
                if (dsVar == null) {
                    dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
                }
            } else {
                dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
            }
            str = dsVar.name();
        }
        aVar.copyOnWrite();
        C80557b bVar = (C80557b) aVar.instance;
        str.getClass();
        bVar.f221116a |= 4;
        bVar.f221119d = str;
        return (C80557b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
