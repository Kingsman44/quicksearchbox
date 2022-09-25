package com.google.android.libraries.web.profile;

import com.google.android.libraries.web.base.C43271v;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.base.C58817ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.h */
/* compiled from: PG */
final class C44073h implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C44074i f114738a;

    /* renamed from: b */
    final /* synthetic */ C43271v f114739b;

    public C44073h(C44074i iVar, C43271v vVar) {
        this.f114738a = iVar;
        this.f114739b = vVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C44074i iVar = this.f114738a;
        C43271v vVar = this.f114739b;
        C46215j b = ((C46108a) obj).mo50210b();
        C69664n.m101060f(b, "account.info()");
        return iVar.mo47041a(vVar, b);
    }
}
