package com.google.android.libraries.kids.platform.kidonboarding;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.p046a.C0809b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.p4109av.p4114c.p4115a.p4116a.C54610c;
import com.google.p4109av.p4114c.p4115a.p4116a.C54612e;
import com.google.p4109av.p4114c.p4115a.p4116a.C54613f;
import com.google.p4109av.p4114c.p4115a.p4116a.C54615h;
import com.google.p4109av.p4114c.p4115a.p4116a.C54618k;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.kids.platform.kidonboarding.e */
/* compiled from: PG */
public final class C24048e extends C0809b {

    /* renamed from: a */
    private final AccountId f65718a;

    public C24048e(AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        this.f65718a = accountId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo613a(Context context, Object obj) {
        C54618k kVar = (C54618k) obj;
        C69664n.m101061g(kVar, "input");
        Intent intent = new Intent(context, KidOnboardingActivity.class);
        ProtoParsers.m95531n(intent, "com.google.android.libraries.kids.platform.kidonboarding.extra.kidOnboardingParamsProto", kVar);
        C45963aa.m82131a(intent, this.f65718a);
        return intent;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo614b(int i, Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.libraries.kids.platform.kidonboarding.extra.kidOnboardingOutcomeProto")) {
            C54610c cVar = (C54610c) C54613f.f143382f.createBuilder();
            C69664n.m101060f(cVar, "newBuilder()");
            C54615h a = C69664n.m101061g(cVar, "builder");
            a.mo54146b(C54612e.UNRECOVERABLE_ERROR);
            return a.mo54145a();
        }
        try {
            MessageLite b = ProtoParsers.m95519b(intent, "com.google.android.libraries.kids.platform.kidonboarding.extra.kidOnboardingOutcomeProto", C54613f.f143382f, C62921ba.m95368a());
            C69664n.m101060f(b, "get(\n        intent,\n   …eratedRegistry(),\n      )");
            return (C54613f) b;
        } catch (C62974ct unused) {
            C54610c cVar2 = (C54610c) C54613f.f143382f.createBuilder();
            C69664n.m101060f(cVar2, "newBuilder()");
            C54615h a2 = C69664n.m101061g(cVar2, "builder");
            a2.mo54146b(C54612e.UNRECOVERABLE_ERROR);
            return a2.mo54145a();
        } catch (NullPointerException unused2) {
            C54610c cVar3 = (C54610c) C54613f.f143382f.createBuilder();
            C69664n.m101060f(cVar3, "newBuilder()");
            C54615h a3 = C69664n.m101061g(cVar3, "builder");
            a3.mo54146b(C54612e.UNRECOVERABLE_ERROR);
            return a3.mo54145a();
        }
    }
}
