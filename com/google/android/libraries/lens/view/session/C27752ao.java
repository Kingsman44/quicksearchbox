package com.google.android.libraries.lens.view.session;

import android.util.SizeF;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.common.p4552o.p4563i.C59947db;
import com.google.common.p4552o.p4563i.C59949dd;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.ao */
/* compiled from: PG */
public final /* synthetic */ class C27752ao implements Function {

    /* renamed from: a */
    public final /* synthetic */ SizeF f75754a;

    public /* synthetic */ C27752ao(SizeF sizeF) {
        this.f75754a = sizeF;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        SizeF sizeF = this.f75754a;
        int i = C27761ax.f75765b;
        C59947db dbVar = ((C59949dd) obj).f162022b;
        if (dbVar == null) {
            dbVar = C59947db.f162011g;
        }
        return C24093a.m44749e(dbVar, sizeF);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
