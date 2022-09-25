package com.google.android.libraries.appactions.p11035a;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58543iy;
import com.google.p4129b.p4136c.C54758f;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.a.z */
/* compiled from: PG */
public final /* synthetic */ class C147858z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C147827ac f398885a;

    /* renamed from: b */
    public final /* synthetic */ String f398886b;

    /* renamed from: c */
    public final /* synthetic */ C58486gv f398887c;

    public /* synthetic */ C147858z(C147827ac acVar, String str, C58486gv gvVar) {
        this.f398885a = acVar;
        this.f398886b = str;
        this.f398887c = gvVar;
    }

    public final void accept(Object obj) {
        C147827ac acVar = this.f398885a;
        String str = this.f398886b;
        C58486gv gvVar = this.f398887c;
        C54759g gVar = (C54759g) obj;
        C58543iy iyVar = acVar.f398826a;
        C58543iy iyVar2 = acVar.f398828c;
        C54773u uVar = gVar.f143681a;
        if (uVar == null) {
            uVar = C54773u.f143704c;
        }
        String str2 = uVar.f143706a;
        C58480gp e = C58485gu.m89837e();
        C54758f fVar = gVar.f143682b;
        if (fVar == null) {
            fVar = C54758f.f143676b;
        }
        e.mo55396h(fVar.f143678a);
        iyVar.mo55540b(str, str2, new C147830af(e.mo55394f()));
        C58480gp gpVar = new C58480gp(4);
        C54773u uVar2 = gVar.f143681a;
        if (uVar2 == null) {
            uVar2 = C54773u.f143704c;
        }
        Collection.EL.stream(uVar2.f143707b).filter(C147843k.f398862a).forEach(new C147844l(gpVar, gvVar, str2));
        if (!gpVar.mo55394f().isEmpty()) {
            iyVar2.mo55540b(str, str2, gpVar.mo55394f());
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
