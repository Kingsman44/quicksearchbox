package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import com.google.android.libraries.componentview.components.p1682a.p1683a.C19758c;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19759d;
import com.google.assistant.p3897e.p3921j.C52561wh;
import com.google.assistant.p3897e.p3921j.C52562wi;
import com.google.common.base.C58810aa;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.a */
/* compiled from: PG */
abstract class C84059a extends C58810aa {
    /* renamed from: a */
    public abstract void mo77514a(C52562wi wiVar, C19758c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17535b(Object obj) {
        C52562wi wiVar = (C52562wi) obj;
        C19758c cVar = (C19758c) C19759d.f55189d.createBuilder();
        if ((wiVar.f137958a & 1) != 0) {
            String str = wiVar.f137959b;
            cVar.copyOnWrite();
            C19759d dVar = (C19759d) cVar.instance;
            str.getClass();
            dVar.f55191a |= 1;
            dVar.f55192b = str;
        }
        if ((wiVar.f137958a & 2) != 0) {
            mo77514a(wiVar, cVar);
        }
        return (C19759d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17536c(Object obj) {
        C19759d dVar = (C19759d) obj;
        C52561wh whVar = (C52561wh) C52562wi.f137956d.createBuilder();
        if ((dVar.f55191a & 1) != 0) {
            String str = dVar.f55192b;
            whVar.copyOnWrite();
            C52562wi wiVar = (C52562wi) whVar.instance;
            str.getClass();
            wiVar.f137958a |= 1;
            wiVar.f137959b = str;
        }
        if ((dVar.f55191a & 2) != 0) {
            mo77515d(dVar, whVar);
        }
        return (C52562wi) whVar.build();
    }

    /* renamed from: d */
    public abstract void mo77515d(C19759d dVar, C52561wh whVar);
}
