package com.google.android.libraries.search.p2904c.p2929h.p2930a;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.libraries.search.p2904c.C37628gg;
import com.google.android.libraries.search.p2904c.C37629gh;
import com.google.android.libraries.search.p2904c.C37630gi;
import com.google.android.libraries.search.p2904c.C37631gj;
import com.google.android.libraries.search.p2904c.C37633gl;
import com.google.android.libraries.search.p2904c.C37635gn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.InputStream;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5472e.C69597a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.audiotactilefeedback.impl.AudiotactileFeedbackClientImpl$playFeedback$1", mo61344c = "AudiotactileFeedbackClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.h.a.b */
/* compiled from: PG */
final class C37651b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C37629gh f100017a;

    /* renamed from: b */
    final /* synthetic */ C37652c f100018b;

    /* renamed from: c */
    private /* synthetic */ Object f100019c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37651b(C37629gh ghVar, C37652c cVar, C69577g gVar) {
        super(2, gVar);
        this.f100017a = ghVar;
        this.f100018b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37651b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f100019c;
        C37629gh ghVar = this.f100017a;
        C37652c cVar = this.f100018b;
        try {
            C59052c cVar2 = (C59052c) C37652c.f100020a.mo56224b();
            cVar2.mo56378ag(C58975e.f156826a, "ALT.AudiotactileFdbkCt");
            C37628gg a = C37628gg.m66600a(ghVar.f99990b);
            if (a == null) {
                a = C37628gg.EVENT_UNDEFINED;
            }
            String name = a.name();
            cVar2.mo56379ah(new C59094n(52755));
            cVar2.mo56389s("#audio# playing feedback resource(%s)", name);
            C59052c cVar3 = (C59052c) C37652c.f100020a.mo56224b();
            cVar3.mo56378ag(C58975e.f156826a, "ALT.AudiotactileFdbkCt");
            C37628gg a2 = C37628gg.m66600a(ghVar.f99990b);
            if (a2 == null) {
                a2 = C37628gg.EVENT_UNDEFINED;
            }
            String name2 = a2.name();
            cVar3.mo56379ah(new C59094n(52756));
            cVar3.mo56389s("#audio# loading feedback resource(%s) to AudioTrack", name2);
            Map map = C37652c.f100021b;
            C37628gg a3 = C37628gg.m66600a(ghVar.f99990b);
            if (a3 == null) {
                a3 = C37628gg.EVENT_UNDEFINED;
            }
            Integer num = (Integer) map.get(a3);
            if (num != null) {
                InputStream openRawResource = cVar.f100022c.getResources().openRawResource(num.intValue());
                C69664n.m101060f(openRawResource, "context.resources.openRawResource(resourceId)");
                byte[] a4 = C69597a.m101012a(openRawResource);
                AudioAttributes build = new AudioAttributes.Builder().setUsage(11).setContentType(4).build();
                AudioFormat build2 = new AudioFormat.Builder().setChannelMask(4).setEncoding(2).setSampleRate(16000).build();
                int length = a4.length;
                AudioTrack audioTrack = new AudioTrack(build, build2, length, 0, 0);
                audioTrack.write(a4, 0, length);
                C37650a aVar2 = new C37650a(ghVar);
                audioTrack.setNotificationMarkerPosition(audioTrack.getBufferSizeInFrames());
                audioTrack.setPlaybackPositionUpdateListener(new C37653d(aVar2));
                audioTrack.play();
                C37630gi giVar = (C37630gi) C37631gj.f99991c.createBuilder();
                C69664n.m101060f(giVar, "newBuilder()");
                C37635gn a5 = C69664n.m101061g(giVar, "builder");
                a5.mo41041b(C37633gl.AUDIOTACTILE_FEEDBACK_STATUS_SUCCESS);
                obj2 = a5.mo41040a();
                C37629gh ghVar2 = this.f100017a;
                Throwable a6 = C69702k.m101124a(obj2);
                if (a6 == null) {
                    return obj2;
                }
                if (a6 instanceof IllegalArgumentException) {
                    C59052c cVar4 = (C59052c) C37652c.f100020a.mo56226d();
                    cVar4.mo56378ag(C58975e.f156826a, "ALT.AudiotactileFdbkCt");
                    C59052c cVar5 = (C59052c) cVar4.mo56382g(a6);
                    C37628gg a7 = C37628gg.m66600a(ghVar2.f99990b);
                    if (a7 == null) {
                        a7 = C37628gg.EVENT_UNDEFINED;
                    }
                    String name3 = a7.name();
                    cVar5.mo56379ah(new C59094n(52758));
                    cVar5.mo56389s("#audio# feedback audio resource(%s) not found", name3);
                    C37630gi giVar2 = (C37630gi) C37631gj.f99991c.createBuilder();
                    C69664n.m101060f(giVar2, "newBuilder()");
                    C37635gn a8 = C69664n.m101061g(giVar2, "builder");
                    a8.mo41041b(C37633gl.AUDIOTACTILE_FEEDBACK_STATUS_FAILURE_INVALID_PARAMS);
                    return a8.mo41040a();
                }
                C59052c cVar6 = (C59052c) C37652c.f100020a.mo56226d();
                cVar6.mo56378ag(C58975e.f156826a, "ALT.AudiotactileFdbkCt");
                C59052c cVar7 = (C59052c) cVar6.mo56382g(a6);
                C37628gg a9 = C37628gg.m66600a(ghVar2.f99990b);
                if (a9 == null) {
                    a9 = C37628gg.EVENT_UNDEFINED;
                }
                String name4 = a9.name();
                cVar7.mo56379ah(new C59094n(52757));
                cVar7.mo56389s("#audio# playing feedback audio resource(%s) failed", name4);
                C37630gi giVar3 = (C37630gi) C37631gj.f99991c.createBuilder();
                C69664n.m101060f(giVar3, "newBuilder()");
                C37635gn a10 = C69664n.m101061g(giVar3, "builder");
                a10.mo41041b(C37633gl.AUDIOTACTILE_FEEDBACK_STATUS_UNKNOWN);
                return a10.mo41040a();
            }
            throw new IllegalArgumentException("Invalid params");
        } catch (Throwable th) {
            obj2 = C69714l.m101133a(th);
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C37651b bVar = new C37651b(this.f100017a, this.f100018b, gVar);
        bVar.f100019c = obj;
        return bVar;
    }
}
