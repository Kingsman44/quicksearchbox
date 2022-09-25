package com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a;

import android.os.RemoteException;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91907e;
import com.google.android.sidekick.shared.remoteapi.TrainingQuestion;
import com.google.common.p4526f.C59052c;
import com.google.p375ai.p378b.C7918ou;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.e.a.c */
/* compiled from: PG */
final class C91719c extends C90945k {

    /* renamed from: a */
    final /* synthetic */ C7918ou f255809a;

    /* renamed from: b */
    final /* synthetic */ C91043j f255810b;

    /* renamed from: c */
    final /* synthetic */ C91725i f255811c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91719c(C91725i iVar, C90929bz bzVar, C7918ou ouVar, C91043j jVar) {
        super("resolveTrainingQuestionAsync", bzVar, 2, 8);
        this.f255811c = iVar;
        this.f255809a = ouVar;
        this.f255810b = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77936a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        C91907e b = this.f255811c.mo86215b();
        if (b == null) {
            return null;
        }
        try {
            return b.mo85972a(new ProtoLiteParcelable((MessageLite) this.f255809a));
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C91725i.f255821a.mo56225c()).mo56382g(e)).mo56372aa(11872)).mo56386p("Error resolving training question");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo77937b(Object obj) {
        this.f255810b.mo17709a((TrainingQuestion) obj);
    }
}
