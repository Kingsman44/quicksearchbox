package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2810a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.search.assistant.surfaces.onboarding.oobe.p9495a.C126658a;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.common.base.C58817ah;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63145c;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C36660c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C36660c f95531a = new C36660c();

    private /* synthetic */ C36660c() {
    }

    public final Object apply(Object obj) {
        C46690ah ahVar = C36670m.f95550a;
        Intent a = C126658a.m207115a();
        Bundle bundle = new Bundle();
        ProtoParsers.m95532o(bundle, "oobe_args", (C63145c) obj);
        a.putExtras(bundle);
        return a;
    }
}
