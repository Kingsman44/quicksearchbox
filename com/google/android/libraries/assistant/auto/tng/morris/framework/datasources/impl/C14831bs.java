package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14076d;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14415ij;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14416ik;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14417il;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bs */
/* compiled from: PG */
public final /* synthetic */ class C14831bs implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C14842cc f44663a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f44664b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f44665c;

    public /* synthetic */ C14831bs(C14842cc ccVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f44663a = ccVar;
        this.f44664b = cxVar;
        this.f44665c = cxVar2;
    }

    public final Object call() {
        PlaybackStateCompat f;
        C14842cc ccVar = this.f44663a;
        C60870cx cxVar = this.f44664b;
        C60870cx cxVar2 = this.f44665c;
        if (ccVar.f44689h.get() != C14416ik.SESSION_NOT_AVAILABLE) {
            ArrayList<C0320v> arrayList = new ArrayList<>();
            for (C14826bn a : (List) C60856cj.m92909r(cxVar)) {
                arrayList.add(a.mo21730a());
            }
            C0320v vVar = null;
            C0320v vVar2 = null;
            for (C0320v vVar3 : arrayList) {
                if (ccVar.f44690i.containsKey(new C14841cb(vVar3))) {
                    if (vVar3 == null) {
                        C58976aa aaVar = C58975e.f156826a;
                    } else if (vVar3.mo1038f() == null) {
                        C58976aa aaVar2 = C58975e.f156826a;
                    } else {
                        int i = vVar3.mo1038f().f994a;
                        if (i == 6 || i == 3) {
                            C58976aa aaVar3 = C58975e.f156826a;
                            vVar = vVar3;
                        }
                    }
                    if (vVar2 == null && vVar3 != null && (f = vVar3.mo1038f()) != null && f.f994a == 2 && C14842cc.m31214o(f, 4) && C14842cc.m31215q(vVar3.mo1036d())) {
                        vVar2 = vVar3;
                    }
                }
            }
            if (vVar == null) {
                vVar = vVar2;
            }
            ccVar.mo21772n(vVar);
        }
        int b = C14076d.m30361b(((C14077e) C60856cj.m92909r(cxVar2)).f42734b);
        if (b == 0) {
            b = 1;
        }
        if (b == 2) {
            b = 4;
        }
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14415ij ijVar = (C14415ij) C14417il.f43604g.createBuilder();
        ijVar.copyOnWrite();
        ((C14417il) ijVar.instance).f43606a = 11;
        ijVar.copyOnWrite();
        ((C14417il) ijVar.instance).f43608c = ((C14416ik) ccVar.f44689h.get()).getNumber();
        ijVar.copyOnWrite();
        ((C14417il) ijVar.instance).f43611f = C14076d.m30360a(b);
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14417il ilVar = (C14417il) ijVar.build();
        ilVar.getClass();
        lfVar.f43801d = ilVar;
        lfVar.f43800c = 6;
        return (C14492lf) gtVar.build();
    }
}
