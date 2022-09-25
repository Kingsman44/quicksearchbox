package com.google.android.apps.gsa.nga.engine.recognition.p6136o;

import com.google.android.apps.gsa.nga.engine.recognition.C77561an;
import com.google.android.apps.gsa.nga.engine.recognition.C77562ao;
import com.google.android.apps.gsa.nga.engine.recognition.C77563ap;
import com.google.android.apps.gsa.nga.engine.recognition.C77875o;
import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.speech.p5218j.C67070jy;
import com.google.speech.p5218j.C67091ks;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.o.f */
/* compiled from: PG */
public final class C77881f {

    /* renamed from: a */
    public final C58247c f214537a;

    public C77881f() {
        C58254i iVar = new C58254i();
        iVar.mo54821e(1, TimeUnit.MINUTES);
        this.f214537a = iVar.mo54817a();
    }

    /* renamed from: a */
    public final C77563ap mo72853a(String str, C77889u uVar, C67091ks ksVar) {
        C58485gu guVar = (C58485gu) Collection.EL.stream(((C67070jy) Map.EL.getOrDefault(Collections.unmodifiableMap(ksVar.f182393f), ksVar.f182390c, C67070jy.f182315b)).f182317a).map(C77879d.f214535a).map(C77880e.f214536a).collect(C58370cn.f155946a);
        Optional b = mo72854b(str, guVar);
        C77561an e = C77563ap.m124450e();
        ((C77875o) e).f214526a = Optional.m71637of(uVar);
        e.mo72666d(ksVar.f182394g.size() > 0);
        e.mo72665c(guVar);
        e.mo72664b(b);
        return e.mo72663a();
    }

    /* renamed from: b */
    public final synchronized Optional mo72854b(String str, C58485gu guVar) {
        Collection.EL.stream(guVar).filter(C77876a.f214531a).max(Comparator.CC.comparingInt(C77877b.f214532a)).ifPresent(new C77878c(this, str));
        return Optional.ofNullable((C77562ao) ((C58206am) this.f214537a).f155647a.mo54792f(str));
    }
}
