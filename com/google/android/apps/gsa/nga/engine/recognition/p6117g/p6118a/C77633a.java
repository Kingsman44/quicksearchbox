package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80556a;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80557b;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.a */
/* compiled from: PG */
public final /* synthetic */ class C77633a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C37561eb f213851a;

    public /* synthetic */ C77633a(C37561eb ebVar) {
        this.f213851a = ebVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C37519dz dzVar;
        C37561eb ebVar = this.f213851a;
        C80556a aVar = (C80556a) ((C80557b) obj).toBuilder();
        int i = ebVar.f99802a;
        if (i == 1) {
            C37563ed a = C37563ed.m66571a(((Integer) ebVar.f99803b).intValue());
            if (a == null) {
                a = C37563ed.UNKNOWN_OPENING_SUCCESS;
            }
            str = a.name();
        } else {
            if (i == 2) {
                dzVar = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                if (dzVar == null) {
                    dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            str = dzVar.name();
        }
        aVar.copyOnWrite();
        C80557b bVar = (C80557b) aVar.instance;
        str.getClass();
        bVar.f221116a |= 2;
        bVar.f221118c = str;
        return (C80557b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
