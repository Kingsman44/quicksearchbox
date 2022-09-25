package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.text.TextUtils;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80705cg;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.ar */
/* compiled from: PG */
public final /* synthetic */ class C81981ar implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81981ar f224127a = new C81981ar();

    private /* synthetic */ C81981ar() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80705cg cgVar = (C80705cg) obj;
        if (TextUtils.isEmpty(cgVar.mo74459d())) {
            return Locale.getDefault();
        }
        return Locale.forLanguageTag(cgVar.mo74459d());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
