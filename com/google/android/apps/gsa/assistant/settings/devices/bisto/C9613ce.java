package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124619al;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.ce */
/* compiled from: PG */
public final /* synthetic */ class C9613ce implements Function {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33225a;

    /* renamed from: b */
    public final /* synthetic */ boolean f33226b;

    /* renamed from: c */
    public final /* synthetic */ boolean f33227c;

    /* renamed from: d */
    public final /* synthetic */ boolean f33228d;

    /* renamed from: e */
    public final /* synthetic */ boolean f33229e;

    public /* synthetic */ C9613ce(C9619ck ckVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f33225a = ckVar;
        this.f33226b = z;
        this.f33227c = z2;
        this.f33228d = z3;
        this.f33229e = z4;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C9619ck ckVar = this.f33225a;
        boolean z = this.f33226b;
        boolean z2 = this.f33227c;
        boolean z3 = this.f33228d;
        boolean z4 = this.f33229e;
        C124619al alVar = (C124619al) ((C124620am) obj).toBuilder();
        if (z) {
            alVar.copyOnWrite();
            C124620am amVar = (C124620am) alVar.instance;
            amVar.f343763a |= 4;
            amVar.f343766d = z2;
        }
        if (z3) {
            alVar.copyOnWrite();
            C124620am amVar2 = (C124620am) alVar.instance;
            amVar2.f343763a |= 8;
            amVar2.f343767e = z4;
            if (!z4) {
                ckVar.f33292z = 4;
            }
        }
        return (C124620am) alVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
