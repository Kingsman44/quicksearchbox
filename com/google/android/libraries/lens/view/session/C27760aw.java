package com.google.android.libraries.lens.view.session;

import android.util.SizeF;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.common.p4552o.p4563i.C59947db;
import com.google.common.p4552o.p4563i.C59951df;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.aw */
/* compiled from: PG */
public final /* synthetic */ class C27760aw implements Function {

    /* renamed from: a */
    public final /* synthetic */ SizeF f75764a;

    public /* synthetic */ C27760aw(SizeF sizeF) {
        this.f75764a = sizeF;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        SizeF sizeF = this.f75764a;
        int i = C27761ax.f75765b;
        C59947db dbVar = ((C59951df) obj).f162029b;
        if (dbVar == null) {
            dbVar = C59947db.f162011g;
        }
        return C24093a.m44749e(dbVar, sizeF);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
