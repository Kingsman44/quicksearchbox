package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.util.Pair;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80270y;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80271z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.r */
/* compiled from: PG */
public final /* synthetic */ class C75962r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C75962r f210754a = new C75962r();

    private /* synthetic */ C75962r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Pair pair = (Pair) obj;
        C80270y yVar = (C80270y) C80271z.f220273d.createBuilder();
        String str = (String) pair.first;
        yVar.copyOnWrite();
        C80271z zVar = (C80271z) yVar.instance;
        str.getClass();
        zVar.f220275a |= 1;
        zVar.f220276b = str;
        String str2 = (String) pair.second;
        yVar.copyOnWrite();
        C80271z zVar2 = (C80271z) yVar.instance;
        str2.getClass();
        zVar2.f220275a |= 2;
        zVar2.f220277c = str2;
        return yVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
