package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C102902ak implements Function {

    /* renamed from: a */
    public final /* synthetic */ C102909ar f287358a;

    /* renamed from: b */
    public final /* synthetic */ String f287359b;

    /* renamed from: c */
    public final /* synthetic */ C91032p f287360c;

    public /* synthetic */ C102902ak(C102909ar arVar, String str, C91032p pVar) {
        this.f287358a = arVar;
        this.f287359b = str;
        this.f287360c = pVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C102909ar arVar = this.f287358a;
        String str = this.f287359b;
        C91032p pVar = this.f287360c;
        return ((C86054o) arVar.f287368b.mo27525b()).mo79672f(str, (Account) obj, false, pVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
