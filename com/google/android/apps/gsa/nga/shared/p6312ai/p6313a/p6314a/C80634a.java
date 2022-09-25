package com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.p6314a;

import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80633a;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80638b;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80641e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4520a.C58254i;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ai.a.a.a */
/* compiled from: PG */
public final class C80634a implements C80641e {

    /* renamed from: a */
    private static final C58974d f221372a = C58974d.m91136j();

    /* renamed from: b */
    private static final Duration f221373b = Duration.ofMinutes(5);

    /* renamed from: c */
    private final C58247c f221374c;

    public C80634a() {
        C58254i iVar = new C58254i();
        iVar.mo54822f(f221373b.getSeconds(), TimeUnit.SECONDS);
        iVar.mo54823g(5);
        this.f221374c = iVar.mo54817a();
    }

    /* renamed from: a */
    public final Optional mo74373a(C37672hs hsVar) {
        Optional ofNullable = Optional.ofNullable((C80633a) ((C58206am) this.f221374c).f155647a.mo54792f(hsVar));
        this.f221374c.mo54714d(hsVar);
        if (ofNullable.isEmpty()) {
            ((C58970a) ((C58970a) f221372a.mo56226d()).mo56372aa(6141)).mo56389s("No ClientConfiguration present for InvocationToken %s", C81062c.m129010a(Optional.m71637of(hsVar)));
        }
        return ofNullable;
    }

    /* renamed from: b */
    public final void mo74374b(C80633a aVar) {
        C80638b bVar = (C80638b) aVar.instance;
        if ((bVar.f221381a & 16) != 0) {
            C58247c cVar = this.f221374c;
            C37672hs hsVar = bVar.f221386f;
            if (hsVar == null) {
                hsVar = C37672hs.f100056c;
            }
            ((C58206am) cVar).f155647a.put(hsVar, aVar);
            return;
        }
        ((C58970a) ((C58970a) f221372a.mo56226d()).mo56372aa(6142)).mo56386p("ClientConfiguration is missing InvocationToken, not caching");
    }
}
