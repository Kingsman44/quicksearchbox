package com.google.android.libraries.assistant.auto.tng.gmm.p990b.p991a;

import android.os.Parcel;
import com.google.android.apps.p453b.p457b.p458a.p459a.C8998a;
import com.google.android.apps.p453b.p457b.p460b.p461a.C9000a;
import com.google.android.apps.p453b.p457b.p460b.p462b.C9002b;
import com.google.android.apps.p453b.p457b.p460b.p462b.C9010j;
import com.google.android.p445a.C8850c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13576a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f41571a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f41572b;

    /* renamed from: c */
    public final /* synthetic */ C13583h f41573c;

    public /* synthetic */ C13576a(C60870cx cxVar, C60870cx cxVar2, C13583h hVar) {
        this.f41571a = cxVar;
        this.f41572b = cxVar2;
        this.f41573c = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f41571a;
        C60870cx cxVar2 = this.f41572b;
        C13583h hVar = this.f41573c;
        C9000a aVar = (C9000a) C60856cj.m92909r(cxVar);
        MessageLite messageLite = (MessageLite) C60856cj.m92909r(cxVar2);
        if (aVar != null) {
            if (messageLite instanceof C9002b) {
                C59104x b = C13580e.f41580a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "GmmOffroadExecutor");
                ((C59052c) ((C59052c) b).mo56372aa(45152)).mo56389s("Start GMM Offroad directions search request: %s", messageLite);
                byte[] byteArray = messageLite.toByteArray();
                C8998a aVar2 = hVar.f41591d;
                Parcel gA = aVar.mo17260gA();
                gA.writeByteArray(byteArray);
                C8850c.m23499h(gA, aVar2);
                aVar.mo17263hf(3, gA);
            } else if (messageLite instanceof C9010j) {
                C59104x b2 = C13580e.f41580a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "GmmOffroadExecutor");
                ((C59052c) ((C59052c) b2).mo56372aa(45151)).mo56354G("Start GMM Offroad search request for query: %s\n %s", ((C9010j) messageLite).f31132b, messageLite);
                byte[] byteArray2 = messageLite.toByteArray();
                C8998a aVar3 = hVar.f41591d;
                Parcel gA2 = aVar.mo17260gA();
                gA2.writeByteArray(byteArray2);
                C8850c.m23499h(gA2, aVar3);
                aVar.mo17263hf(2, gA2);
            } else {
                C59104x d = C13580e.f41580a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GmmOffroadExecutor");
                ((C59052c) ((C59052c) d).mo56372aa(45150)).mo56386p("Unknown Search Request");
                throw new IllegalStateException("Unknown Search Request");
            }
            return hVar.f41588a;
        }
        C59104x d2 = C13580e.f41580a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "GmmOffroadExecutor");
        ((C59052c) ((C59052c) d2).mo56372aa(45153)).mo56386p("IOfflineExternalSearch is null");
        throw new IllegalStateException("IOfflineExternalSearch is null");
    }
}
