package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.assistant.p3897e.p3921j.C51809dy;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69632r;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateHubmodeConnectionImpl$connectToHubModeService$1$1", mo61344c = "VoicePlateHubmodeConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bw */
/* compiled from: PG */
final class C128741bw extends C69572j implements C69632r {

    /* renamed from: a */
    /* synthetic */ Object f353914a;

    /* renamed from: b */
    /* synthetic */ Object f353915b;

    /* renamed from: c */
    /* synthetic */ boolean f353916c;

    public C128741bw(C69577g gVar) {
        super(4, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C128741bw bwVar = new C128741bw((C69577g) obj4);
        bwVar.f353914a = (C128736br) obj;
        bwVar.f353915b = (C51809dy) obj2;
        bwVar.f353916c = booleanValue;
        return bwVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f353914a;
        return new C128737bs((C128736br) obj2, (C51809dy) this.f353915b, this.f353916c);
    }
}
