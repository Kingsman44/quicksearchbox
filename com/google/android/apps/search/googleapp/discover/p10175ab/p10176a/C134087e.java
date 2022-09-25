package com.google.android.apps.search.googleapp.discover.p10175ab.p10176a;

import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.protos.p4816ai.p4817a.C63193g;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.ve.attention.DiscoverLogSender$log$1", mo61344c = "DiscoverLogSender.kt", mo61345d = "invokeSuspend", mo61346e = {37})
/* renamed from: com.google.android.apps.search.googleapp.discover.ab.a.e */
/* compiled from: PG */
final class C134087e extends C69572j implements C69630p {

    /* renamed from: a */
    int f365259a;

    /* renamed from: b */
    final /* synthetic */ C134088f f365260b;

    /* renamed from: c */
    final /* synthetic */ C63193g f365261c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134087e(C134088f fVar, C63193g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f365260b = fVar;
        this.f365261c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134087e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C59743a aVar;
        C69554a aVar2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f365259a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C134088f.f365262a.mo56226d()).mo56382g(th);
                cVar.mo56379ah(new C59094n(40558));
                cVar.mo56386p("Error generating client instance id.");
                return C69788q.f186170a;
            }
        } else {
            C69714l.m101134b(obj);
            C47633f a = this.f365260b.f365265d.mo41441a();
            C69664n.m101060f(a, "clientInstanceIdGenerator.generate()");
            this.f365259a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        String str = (String) ((Optional) obj).orElse(null);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        C69664n.m101060f(tzVar, "newBuilder()");
        if (str != null) {
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164254i |= 8192;
            ufVar.f164166bT = str;
        }
        C38750am amVar = (C38750am) this.f365260b.f365263b.mo27525b();
        C134699b a2 = this.f365260b.f365264c.mo111973a();
        C134699b bVar = C134699b.CLEARCUT_EVENT_TYPE_UNSPECIFIED;
        int ordinal = a2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                aVar = C59743a.LOG_ATTENTION_FEED;
            } else if (ordinal == 2) {
                aVar = C59743a.DISCOVER_CHANNELS_ATTENTION_EVENT;
            } else {
                throw new C69677g();
            }
            amVar.mo41607s(aVar, tzVar, this.f365261c);
            return C69788q.f186170a;
        }
        throw new IllegalStateException("Must specify a clearcut log event type.");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134087e(this.f365260b, this.f365261c, gVar);
    }
}
