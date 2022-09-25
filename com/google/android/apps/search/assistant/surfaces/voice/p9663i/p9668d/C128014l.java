package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.l */
/* compiled from: PG */
public final /* synthetic */ class C128014l implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C128017o f352286a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f352287b;

    public /* synthetic */ C128014l(C128017o oVar, C58485gu guVar) {
        this.f352286a = oVar;
        this.f352287b = guVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C128017o oVar = this.f352286a;
        C58485gu<C51347ei> guVar = this.f352287b;
        C128022t tVar = oVar.f352292c;
        C128002am amVar = (C128002am) C128003an.f352266e.createBuilder();
        amVar.copyOnWrite();
        C128003an anVar = (C128003an) amVar.instance;
        C62961ch chVar = anVar.f352269b;
        if (!chVar.mo58948c()) {
            anVar.f352269b = C62942bv.mutableCopy(chVar);
        }
        for (C51347ei eiVar : guVar) {
            anVar.f352269b.mo58916g(eiVar.f133743i);
        }
        return C70876o.m103760a(tVar.f189039a.mo39510a(C128024v.m209160b(), tVar.f189040b), (C128003an) amVar.build());
    }
}
