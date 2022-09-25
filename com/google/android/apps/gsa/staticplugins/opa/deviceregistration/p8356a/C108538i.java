package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8356a;

import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108617cq;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108623cw;
import com.google.assistant.p3861at.C50173ng;
import com.google.assistant.p3861at.C50186nt;
import com.google.assistant.p3861at.C50187nu;
import com.google.assistant.p3861at.C50189nw;
import com.google.assistant.p3861at.C50192nz;
import com.google.assistant.p3861at.C50194oa;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.a.i */
/* compiled from: PG */
public final class C108538i implements C108532c {

    /* renamed from: a */
    public C50189nw f301956a = C50189nw.f130472e;

    /* renamed from: b */
    private final C108617cq f301957b;

    /* renamed from: c */
    private final C108623cw f301958c;

    public C108538i(C108617cq cqVar, C108623cw cwVar) {
        this.f301957b = cqVar;
        this.f301958c = cwVar;
    }

    /* renamed from: f */
    private final C60870cx m180468f(C50187nu nuVar) {
        C108617cq cqVar = this.f301957b;
        C58976aa aaVar = C58975e.f156826a;
        C50192nz nzVar = (C50192nz) C50194oa.f130485d.createBuilder();
        nzVar.copyOnWrite();
        C50194oa oaVar = (C50194oa) nzVar.instance;
        nuVar.getClass();
        C62971cq cqVar2 = oaVar.f130489c;
        if (!cqVar2.mo58948c()) {
            oaVar.f130489c = C62942bv.mutableCopy(cqVar2);
        }
        oaVar.f130489c.add(nuVar);
        return C60922j.m93044g(cqVar.mo97030e((C50194oa) nzVar.build()), C108536g.f301954a, C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo96970a(String str, C108531b bVar) {
        C50186nt ntVar = (C50186nt) C50187nu.f130466e.createBuilder();
        String str2 = (String) Objects.requireNonNull(bVar.mo96965a(), "Attempted to assign device to room with null ID");
        ntVar.copyOnWrite();
        C50187nu nuVar = (C50187nu) ntVar.instance;
        str2.getClass();
        nuVar.f130468a |= 1;
        nuVar.f130469b = str2;
        ntVar.mo53381a(str);
        return m180468f((C50187nu) ntVar.build());
    }

    /* renamed from: b */
    public final C60870cx mo96971b(String str, String str2) {
        C50186nt ntVar = (C50186nt) C50187nu.f130466e.createBuilder();
        ntVar.copyOnWrite();
        C50187nu nuVar = (C50187nu) ntVar.instance;
        str2.getClass();
        nuVar.f130468a |= 4;
        nuVar.f130470c = str2;
        ntVar.mo53381a(str);
        return m180468f((C50187nu) ntVar.build());
    }

    /* renamed from: c */
    public final C60870cx mo96972c() {
        return C60922j.m93044g(this.f301958c.mo97032b(), new C108537h(this), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final Set mo96973d() {
        return (Set) Collection.EL.stream(this.f301956a.f130476c).map(C108533d.f301951a).collect(Collectors.toSet());
    }

    /* renamed from: e */
    public final boolean mo96974e(String str) {
        return (((C50173ng) Collection.EL.stream(this.f301956a.f130475b).filter(new C108534e(str)).findFirst().orElseThrow(new C108535f(str))).f130421a & 128) != 0;
    }
}
