package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.p1714d.p1724f.C21099g;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protos.youtube.elements.C66160ce;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.p5164b.C66011b;
import com.youtube.android.libraries.elements.templates.C68105a;
import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.io.IOException;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.elements.d.e.a.s */
/* compiled from: PG */
public final /* synthetic */ class C20987s implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C20989u f58823a;

    /* renamed from: b */
    public final /* synthetic */ C66160ce f58824b;

    /* renamed from: c */
    public final /* synthetic */ C21311r f58825c;

    public /* synthetic */ C20987s(C20989u uVar, C66160ce ceVar, C21311r rVar) {
        this.f58823a = uVar;
        this.f58824b = ceVar;
        this.f58825c = rVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        C20989u uVar = this.f58823a;
        C66160ce ceVar = this.f58824b;
        C21311r rVar = this.f58825c;
        C21279bv bvVar = (C21279bv) obj;
        C21313t tVar = (C21313t) uVar.f58830b.mo27525b();
        C66011b bVar = ceVar.f179904b;
        if (bVar == null) {
            bVar = C66011b.f179508a;
        }
        try {
            C68105a a = EkoProcessor.m98450a(bVar.toByteArray(), C21099g.m39633a(bvVar).f59137a, uVar.f58831c);
            if (a.f184338a.mo61679g()) {
                byte[] bArr = a.f184339b;
                bArr.getClass();
                C62921ba a2 = C62921ba.m95368a();
                return tVar.mo26125b((CommandOuterClass$Command) C62942bv.parseFrom((C62942bv) CommandOuterClass$Command.f179510a, bArr, a2), rVar, 1);
            }
            String description = a.f184338a.getDescription();
            throw new C21260bc("Eko processor error: " + description);
        } catch (IOException e) {
            throw new C21260bc("Invalid eko template", e);
        }
    }
}
