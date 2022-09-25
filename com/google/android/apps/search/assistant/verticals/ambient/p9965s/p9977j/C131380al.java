package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import android.media.AudioManager;
import android.provider.Settings;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.apps.search.assistant.verticals.ambient.p9912d.p9914b.C130602a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130935bt;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130940by;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130945cc;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p4016z.C53714bl;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58970a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.surface.mediarecommendations.MediaRecommendationsSuggestionProducer$generateSuggestions$1", mo61344c = "MediaRecommendationsSuggestionProducer.kt", mo61345d = "invokeSuspend", mo61346e = {96})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.al */
/* compiled from: PG */
final class C131380al extends C69572j implements C69630p {

    /* renamed from: a */
    int f359141a;

    /* renamed from: b */
    final /* synthetic */ C53715bm f359142b;

    /* renamed from: c */
    final /* synthetic */ C131386ar f359143c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131380al(C53715bm bmVar, C131386ar arVar, C69577g gVar) {
        super(2, gVar);
        this.f359142b = bmVar;
        this.f359143c = arVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131380al) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C106532f fVar;
        C106532f fVar2;
        int mode;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f359141a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (C53714bl.m86892a(this.f359142b.f141023a) == C53714bl.HEADSET_STATE) {
                C131386ar arVar = this.f359143c;
                C53715bm bmVar = this.f359142b;
                if (bmVar.f141023a == 4) {
                    fVar = (C106532f) bmVar.f141024b;
                } else {
                    fVar = C106532f.f297078g;
                }
                C69664n.m101060f(fVar, "event.headsetState");
                C17692f b = C130602a.m212960b(fVar);
                if (!((Boolean) arVar.f359167g.mo17428b()).booleanValue()) {
                    ((C58970a) arVar.f359168h.mo56224b()).mo56386p("#shouldHandleContext(): Media recommendation is not enabled. Not handling...");
                } else if (Settings.Secure.getInt(arVar.f359161a.getContentResolver(), "qs_media_recommend", 1) != 0) {
                    AudioManager audioManager = (AudioManager) arVar.f359161a.getSystemService("audio");
                    if (audioManager == null || !(audioManager.isMusicActive() || (mode = audioManager.getMode()) == 2 || mode == 3)) {
                        if (arVar.f359165e.mo109714a(b)) {
                            ((C58970a) arVar.f359168h.mo56226d()).mo56386p("#shouldHandleContext(): Headphone connection event already handled.");
                        } else {
                            C17691e a = C17691e.m34970a(b.f50862c);
                            if (a == null) {
                                a = C17691e.UNKNOWN;
                            }
                            if (a == C17691e.CAR_BLUETOOTH) {
                                ((C58970a) arVar.f359168h.mo56224b()).mo56386p("#shouldHandleContext(): Car bluetooth is connected. Exit");
                            } else {
                                C131386ar arVar2 = this.f359143c;
                                C53715bm bmVar2 = this.f359142b;
                                if (bmVar2.f141023a == 4) {
                                    fVar2 = (C106532f) bmVar2.f141024b;
                                } else {
                                    fVar2 = C106532f.f297078g;
                                }
                                C69664n.m101060f(fVar2, "event.headsetState");
                                C17692f b2 = C130602a.m212960b(fVar2);
                                this.f359141a = 1;
                                C17689c a2 = C17689c.m34968a(b2.f50861b);
                                if (a2 == null) {
                                    a2 = C17689c.UNSPECIFIED;
                                }
                                if (a2 == C17689c.DISCONNECTED) {
                                    ((C58970a) arVar2.f359168h.mo56224b()).mo56386p("Handling disconnection. Producing undefined card");
                                    C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
                                    C50794cr crVar = C50794cr.UNDEFINED;
                                    cnVar.copyOnWrite();
                                    C50818do doVar = (C50818do) cnVar.instance;
                                    doVar.f132315l = crVar.f132222T;
                                    doVar.f132304a |= 1024;
                                    C50818do doVar2 = (C50818do) cnVar.build();
                                    C69664n.m101060f(doVar2, "buildUndefinedCard()");
                                    obj = new C130935bt(doVar2);
                                } else {
                                    obj = C71803m.m105040a(arVar2.f359162b, new C131385aq(arVar2, b2, (C69577g) null), this);
                                }
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    }
                } else {
                    ((C58970a) arVar.f359168h.mo56224b()).mo56386p("#shouldHandleContext(): Media recommendation setting is disabled. Not handling...");
                }
            }
            return C130940by.f358275a;
        }
        return (C130945cc) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131380al(this.f359142b, this.f359143c, gVar);
    }
}
