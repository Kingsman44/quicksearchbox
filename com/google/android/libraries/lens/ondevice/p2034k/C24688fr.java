package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24271c;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.Executor;

@C24266a(mo29795a = "ServerQueryPrimitive")
/* renamed from: com.google.android.libraries.lens.ondevice.k.fr */
/* compiled from: PG */
public final class C24688fr implements C24650eg {

    /* renamed from: b */
    private static final C58974d f67523b = C58974d.m91135i("ServerQueryPrimitive");

    /* renamed from: a */
    public final C58833ax f67524a;

    /* renamed from: c */
    private final C58833ax f67525c;

    public C24688fr(C58833ax axVar, C58833ax axVar2) {
        this.f67524a = axVar;
        this.f67525c = axVar2;
    }

    /* renamed from: a */
    public final /* synthetic */ C58833ax mo29949a(C24795f fVar) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        if (this.f67524a.mo56113h()) {
            C58833ax axVar = this.f67525c;
            if (axVar.mo56113h()) {
                ((Executor) axVar.mo56107c()).execute(new C24687fq(this));
                return;
            }
            throw new C24271c("ServerQueryExecutor missing");
        }
        throw new C24271c("ServerQueryEngine missing");
    }

    /* renamed from: c */
    public final void mo29951c() {
        if (this.f67524a.mo56113h() && this.f67525c.mo56113h()) {
            ((C58970a) ((C58970a) f67523b.mo56224b()).mo56372aa(48854)).mo56386p("Stopping ServerQueryEngine");
            ((Executor) this.f67525c.mo56107c()).execute(new C24686fp(this));
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo29952d(C24795f fVar) {
        return false;
    }
}
