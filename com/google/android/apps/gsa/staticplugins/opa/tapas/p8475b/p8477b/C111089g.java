package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import android.content.pm.ApplicationInfo;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48648i;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48649j;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.g */
/* compiled from: PG */
public final /* synthetic */ class C111089g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111090h f309318a;

    public /* synthetic */ C111089g(C111090h hVar) {
        this.f309318a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111090h hVar = this.f309318a;
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        String str = applicationInfo.packageName;
        C48648i iVar = (C48648i) C48649j.f125734d.createBuilder();
        iVar.copyOnWrite();
        C48649j jVar = (C48649j) iVar.instance;
        str.getClass();
        jVar.f125736a |= 1;
        jVar.f125737b = str;
        Optional f = hVar.f309320b.mo99847f(str);
        if (f.isPresent()) {
            String obj2 = ((CharSequence) f.get()).toString();
            iVar.copyOnWrite();
            C48649j jVar2 = (C48649j) iVar.instance;
            obj2.getClass();
            jVar2.f125736a |= 2;
            jVar2.f125738c = obj2;
        } else {
            String obj3 = hVar.f309320b.mo99853l(applicationInfo).toString();
            iVar.copyOnWrite();
            C48649j jVar3 = (C48649j) iVar.instance;
            obj3.getClass();
            jVar3.f125736a |= 2;
            jVar3.f125738c = obj3;
        }
        return (C48649j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
