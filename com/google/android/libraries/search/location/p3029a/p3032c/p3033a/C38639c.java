package com.google.android.libraries.search.location.p3029a.p3032c.p3033a;

import com.google.android.gms.awareness.C142930e;
import com.google.android.gms.awareness.fence.C142933b;
import com.google.android.gms.awareness.fence.C142934c;
import com.google.android.gms.awareness.fence.C142935d;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.tasks.C146042v;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.concurrent.C46459k;

/* renamed from: com.google.android.libraries.search.location.a.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C38639c implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ C142930e f102098a;

    /* renamed from: b */
    public final /* synthetic */ String f102099b;

    public /* synthetic */ C38639c(C142930e eVar, String str) {
        this.f102098a = eVar;
        this.f102099b = str;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        C142930e eVar = this.f102098a;
        String str = this.f102099b;
        int i = C38640d.f102100a;
        FenceStateMapImpl b = ((C142934c) ((C142933b) obj).f389625a).mo117825b();
        C143919bh.m233958a(b);
        for (String str2 : b.f390282a.keySet()) {
            C142935d dVar = new C142935d();
            dVar.mo117829d(str2);
            C46459k.m82829b(C43205e.m76192b(eVar.mo117823a(dVar.mo117826a())), "Failed to cancel a FenceClient subscription %s for %s", str2, str);
        }
    }
}
