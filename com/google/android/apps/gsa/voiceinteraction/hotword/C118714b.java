package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.os.Build;
import android.os.Process;
import com.google.android.libraries.assistant.hotword.C18370g;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.b */
/* compiled from: PG */
final class C118714b implements C18370g {

    /* renamed from: a */
    final /* synthetic */ C118719g f331134a;

    public C118714b(C118719g gVar) {
        this.f331134a = gVar;
    }

    /* renamed from: a */
    public final void mo23775a(boolean z) {
        C118719g gVar = this.f331134a;
        if (gVar.f331152o && gVar.f331151n != null && Build.VERSION.SDK_INT >= 30) {
            C118719g gVar2 = this.f331134a;
            if (gVar2.f331145h != null) {
                gVar2.f331152o = false;
                gVar2.f331151n.finishOp("android:record_audio", Process.myUid(), this.f331134a.f331145h.getPackageName(), C39227c.m68658b(C39226b.TAG_CLASSIC_ASSISTANT_URI_VIS));
            }
        }
        C118717e eVar = this.f331134a.f331141d;
        if (eVar != null) {
            eVar.mo49465b(z);
        }
    }
}
