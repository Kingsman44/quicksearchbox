package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82906ev;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.c */
/* compiled from: PG */
public final /* synthetic */ class C79777c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ e f218714a;

    /* renamed from: b */
    public final /* synthetic */ C82889ee f218715b;

    public /* synthetic */ C79777c(e eVar, C82889ee eeVar) {
        this.f218714a = eVar;
        this.f218715b = eeVar;
    }

    public final void accept(Object obj) {
        e eVar = this.f218714a;
        C82889ee eeVar = this.f218715b;
        C79813di diVar = (C79813di) obj;
        C82906ev evVar = (C82906ev) C82907ew.f226160o.createBuilder();
        evVar.copyOnWrite();
        C82907ew ewVar = (C82907ew) evVar.instance;
        ewVar.f226163b = eVar.ca;
        ewVar.f226162a |= 1;
        C82907ew ewVar2 = ((C79814dj) diVar.instance).f218856f;
        if (((ewVar2 == null ? C82907ew.f226160o : ewVar2).f226162a & 2) != 0) {
            if (ewVar2 == null) {
                ewVar2 = C82907ew.f226160o;
            }
            String str = ewVar2.f226164c;
            evVar.copyOnWrite();
            C82907ew ewVar3 = (C82907ew) evVar.instance;
            str.getClass();
            ewVar3.f226162a |= 2;
            ewVar3.f226164c = str;
        }
        long j = eeVar.f226103h;
        evVar.copyOnWrite();
        C82907ew ewVar4 = (C82907ew) evVar.instance;
        ewVar4.f226162a |= 8;
        ewVar4.f226166e = j;
        diVar.copyOnWrite();
        C79814dj djVar = (C79814dj) diVar.instance;
        C82907ew ewVar5 = (C82907ew) evVar.build();
        ewVar5.getClass();
        djVar.f218856f = ewVar5;
        djVar.f218851a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
