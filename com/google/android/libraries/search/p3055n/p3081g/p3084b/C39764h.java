package com.google.android.libraries.search.p3055n.p3081g.p3084b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.p3055n.C39811o;
import com.google.android.libraries.search.p3055n.C39812p;
import com.google.android.libraries.search.p3055n.C39817u;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.n.g.b.h */
/* compiled from: PG */
public final /* synthetic */ class C39764h implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C39764h f104593a = new C39764h();

    private /* synthetic */ C39764h() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C39812p pVar = (C39812p) obj;
        C39811o a = C39811o.m69225a(pVar.f104695b);
        if (a == null) {
            a = C39811o.PHRASE_UNKNOWN;
        }
        String str = a == C39811o.OK_HEY_GOOGLE ? "x_google" : "okgoogle";
        C39817u uVar = pVar.f104696c;
        if (uVar == null) {
            uVar = C39817u.f104702d;
        }
        return String.format("https://www.gstatic.com/android-search/hotword/%s/%s/hotword.data", new Object[]{str, uVar.f104704a == 2 ? (String) uVar.f104705b : BuildConfig.FLAVOR});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
