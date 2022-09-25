package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16763m;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C109541ah implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109541ah f305072a = new C109541ah();

    private /* synthetic */ C109541ah() {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C16763m mVar = (C16763m) obj;
        int i = C109546am.f305077i;
        if (!mVar.f49052d.equals("overlay")) {
            return false;
        }
        return (mVar.f49050b == 2 ? (String) mVar.f49051c : BuildConfig.FLAVOR).equals("1");
    }
}
