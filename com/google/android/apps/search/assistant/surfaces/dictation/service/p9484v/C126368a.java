package com.google.android.apps.search.assistant.surfaces.dictation.service.p9484v;

import android.content.ComponentName;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.workprofile.WorkProfileChecker$hasProfileOwner$2", mo61344c = "WorkProfileChecker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.v.a */
/* compiled from: PG */
final class C126368a extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C126370c f348063a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126368a(C126370c cVar, C69577g gVar) {
        super(2, gVar);
        this.f348063a = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126368a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        List<ComponentName> activeAdmins = this.f348063a.f348066a.getActiveAdmins();
        boolean z = false;
        if (activeAdmins != null) {
            C126370c cVar = this.f348063a;
            if (!activeAdmins.isEmpty()) {
                Iterator<T> it = activeAdmins.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (cVar.f348066a.isProfileOwnerApp(((ComponentName) it.next()).getPackageName())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126368a(this.f348063a, gVar);
    }
}
