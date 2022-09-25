package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b;

import android.content.ComponentName;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i.C106564b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i.C106566d;
import com.google.android.libraries.assistant.pcp.p1573k.C18941u;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.impl.MediaRecommendationsAppSelectorImpl$getAppForMediaSessionPaused$2$pausedActiveAppsFuture$1", mo61344c = "MediaRecommendationsAppSelectorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {128})
/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.c */
/* compiled from: PG */
final class C123952c extends C69572j implements C69630p {

    /* renamed from: a */
    int f342366a;

    /* renamed from: b */
    final /* synthetic */ C123962m f342367b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C123952c(C123962m mVar, C69577g gVar) {
        super(2, gVar);
        this.f342367b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C123952c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f342366a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C18941u uVar = this.f342367b.f342395c;
            this.f342366a = 1;
            obj = uVar.mo24201a();
            if (obj == aVar) {
                return aVar;
            }
        }
        C62971cq cqVar = ((C106566d) obj).f297149a;
        C69664n.m101060f(cqVar, "mediaServiceHelper\n     … .activeMediaSessionsList");
        C123962m mVar = this.f342367b;
        ArrayList<C106564b> arrayList = new ArrayList<>();
        for (Object next : cqVar) {
            C106564b bVar = (C106564b) next;
            C69664n.m101060f(bVar, "mediaSession");
            if (!bVar.f297145d) {
                Duration ofMillis = Duration.ofMillis(mVar.f342396d.mo26871c() - bVar.f297146e);
                Object b = mVar.f342398f.mo17428b();
                C69664n.m101060f(b, "lastMediaStoppedPlayingTimeout.get()");
                if (ofMillis.compareTo(C62949a.m95468c((C62910ar) b)) < 0) {
                    arrayList.add(next);
                }
            }
        }
        C123962m mVar2 = this.f342367b;
        ArrayList arrayList2 = new ArrayList();
        for (C106564b bVar2 : arrayList) {
            ComponentName componentName = (ComponentName) mVar2.f342394b.mo24190a(bVar2.f297143b).orElse(null);
            if (componentName != null) {
                arrayList2.add(componentName);
            }
        }
        return arrayList2;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C123952c(this.f342367b, gVar);
    }
}
