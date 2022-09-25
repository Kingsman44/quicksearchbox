package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.C21258ba;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.JSController;
import com.google.common.base.C58833ax;
import com.google.protos.youtube.elements.C66174cs;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import p3186j$.util.Objects;
import p5488io.p5490b.C69807c;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.libraries.elements.d.e.a.w */
/* compiled from: PG */
public final /* synthetic */ class C20991w implements C69807c {

    /* renamed from: a */
    public final /* synthetic */ C20994z f58835a;

    /* renamed from: b */
    public final /* synthetic */ JSController f58836b;

    /* renamed from: c */
    public final /* synthetic */ C21311r f58837c;

    /* renamed from: d */
    public final /* synthetic */ C66174cs f58838d;

    /* renamed from: e */
    public final /* synthetic */ SenderStateOuterClass$SenderState f58839e;

    public /* synthetic */ C20991w(C20994z zVar, JSController jSController, C21311r rVar, C66174cs csVar, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState) {
        this.f58835a = zVar;
        this.f58836b = jSController;
        this.f58837c = rVar;
        this.f58838d = csVar;
        this.f58839e = senderStateOuterClass$SenderState;
    }

    /* renamed from: a */
    public final void mo25806a(C69872g gVar) {
        byte[] bArr;
        C20994z zVar = this.f58835a;
        JSController jSController = this.f58836b;
        C21311r rVar = this.f58837c;
        C66174cs csVar = this.f58838d;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.f58839e;
        if (jSController != null) {
            C58833ax axVar = (C58833ax) zVar.f58842a.mo17428b();
            if (axVar.mo56113h()) {
                C20993y yVar = new C20993y(gVar);
                C20979k kVar = new C20979k((C21313t) zVar.f58843b.mo27525b(), rVar);
                byte[] byteArray = csVar.toByteArray();
                byte[] bArr2 = C21258ba.f59581a;
                if (senderStateOuterClass$SenderState != null) {
                    bArr = senderStateOuterClass$SenderState.toByteArray();
                } else {
                    bArr = C21258ba.f59581a;
                }
                jSController.executeFunction(byteArray, bArr2, bArr, (ByteStore) axVar.mo56107c(), kVar, yVar);
                Objects.requireNonNull(yVar);
                gVar.mo61502c(new C20992x(yVar));
                return;
            }
            throw new C21260bc("ByteStore is not provided");
        }
        throw new C21260bc("JavaScript controller is not provided");
    }
}
