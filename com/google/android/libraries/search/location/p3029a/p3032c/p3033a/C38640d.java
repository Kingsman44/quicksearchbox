package com.google.android.libraries.search.location.p3029a.p3032c.p3033a;

import android.accounts.Account;
import com.google.android.gms.awareness.C142928c;
import com.google.android.gms.awareness.C142929d;
import com.google.android.gms.awareness.C142930e;
import com.google.android.gms.awareness.fence.C142933b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.contextmanager.fence.internal.C144034b;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.libraries.search.location.p3029a.p3032c.C38636a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.libraries.search.location.a.c.a.d */
/* compiled from: PG */
public final class C38640d implements C38638b, C38648l {

    /* renamed from: a */
    public static final /* synthetic */ int f102100a = 0;

    /* renamed from: b */
    private static final C58485gu f102101b = C58485gu.m89847o("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ContextFenceRegistration", "com.google.android.apps.search.assistant.platform.contexttrigger");

    /* renamed from: c */
    private final C38636a f102102c;

    public C38640d(C38636a aVar) {
        this.f102102c = aVar;
    }

    /* renamed from: a */
    public final boolean mo41535a(String str) {
        return f102101b.contains(str);
    }

    /* renamed from: b */
    public final void mo41536b(boolean z) {
        if (!z) {
            C58485gu guVar = f102101b;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                String str = (String) guVar.get(i2);
                C142930e b = C142928c.m231883b(this.f102102c.f102095a, C142929d.m231886a(str, (Account) null));
                FenceQueryRequestImpl fenceQueryRequestImpl = new FenceQueryRequestImpl();
                C143851w wVar = b.f389929D;
                C144034b bVar = new C144034b(wVar, fenceQueryRequestImpl);
                wVar.mo119159d(bVar);
                C146006ab a = C143918bg.m233955a(bVar, new C142933b());
                C146014aj ajVar = (C146014aj) a;
                ajVar.mo122495n(C146013ai.f394700a, new C38639c(b, str));
            }
        }
    }
}
