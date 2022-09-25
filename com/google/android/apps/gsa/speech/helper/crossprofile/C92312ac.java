package com.google.android.apps.gsa.speech.helper.crossprofile;

import com.google.android.enterprise.connectedapps.C142555ao;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.speech.helper.crossprofile.ac */
/* compiled from: PG */
public final /* synthetic */ class C92312ac implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C92312ac f257412a = new C92312ac();

    private /* synthetic */ C92312ac() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i;
        Map.Entry entry = (Map.Entry) obj;
        C142555ao aoVar = (C142555ao) entry.getKey();
        if (aoVar.mo117171a()) {
            i = 2;
        } else {
            i = aoVar.f386833a == 1 ? 3 : 1;
        }
        return Collection.EL.stream((Set) entry.getValue()).map(new C92341y(i));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
