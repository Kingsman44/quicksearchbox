package com.google.android.apps.gsa.staticplugins.p7686co.p7690d;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91400l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C8142xb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.d.b */
/* compiled from: PG */
public final /* synthetic */ class C98284b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98289g f274372a;

    /* renamed from: b */
    public final /* synthetic */ C8142xb f274373b;

    /* renamed from: c */
    public final /* synthetic */ C7642eo f274374c;

    public /* synthetic */ C98284b(C98289g gVar, C8142xb xbVar, C7642eo eoVar) {
        this.f274372a = gVar;
        this.f274373b = xbVar;
        this.f274374c = eoVar;
    }

    public final C60870cx apply(Object obj) {
        C98289g gVar = this.f274372a;
        C8142xb xbVar = this.f274373b;
        C7642eo eoVar = this.f274374c;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            return gVar.mo85730f(xbVar, false, eoVar, (C7669fo) null, 3);
        }
        return C60856cj.m92899h(new C91400l(num.intValue()));
    }
}
