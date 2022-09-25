package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i.C106563a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i.C106564b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i.C106565c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i.C106566d;
import com.google.android.libraries.assistant.pcp.p1573k.C18941u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cp */
/* compiled from: PG */
public final class C18870cp implements C18941u {

    /* renamed from: b */
    private static final C59071e f53127b = C59071e.m91331h();

    /* renamed from: c */
    private static final Set f53128c = C69531o.m100939p(new Integer[]{0, 1, 2, 7, 8});

    /* renamed from: a */
    public final C71422aw f53129a;

    /* renamed from: d */
    private final Context f53130d;

    public C18870cp(Context context, C71422aw awVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f53130d = context;
        this.f53129a = awVar;
    }

    /* renamed from: a */
    public final Object mo24201a() {
        if (this.f53130d.checkSelfPermission("android.permission.MEDIA_CONTENT_CONTROL") != 0) {
            C59052c cVar = (C59052c) f53127b.mo56225c();
            cVar.mo56379ah(new C59094n(47479));
            cVar.mo56386p("Failed to get active media sessions, missing permission of MEDIA_CONTENT_CONTROL.");
            C106566d dVar = C106566d.f297147b;
            C69664n.m101060f(dVar, "getDefaultInstance()");
            return dVar;
        }
        Object systemService = this.f53130d.getSystemService("media_session");
        MediaSessionManager mediaSessionManager = systemService instanceof MediaSessionManager ? (MediaSessionManager) systemService : null;
        if (mediaSessionManager == null) {
            C59052c cVar2 = (C59052c) f53127b.mo56225c();
            cVar2.mo56379ah(new C59094n(47478));
            cVar2.mo56386p("Failed to get MediaSessionManager");
            C106566d dVar2 = C106566d.f297147b;
            C69664n.m101060f(dVar2, "getDefaultInstance()");
            return dVar2;
        }
        List<MediaController> activeSessions = mediaSessionManager.getActiveSessions((ComponentName) null);
        C69664n.m101060f(activeSessions, "sessionManager\n      .getActiveSessions(null)");
        ArrayList<C106564b> arrayList = new ArrayList<>(C69540x.m100804k(activeSessions, 10));
        for (MediaController mediaController : activeSessions) {
            PlaybackState playbackState = mediaController.getPlaybackState();
            int state = playbackState != null ? playbackState.getState() : 0;
            C106563a aVar = (C106563a) C106564b.f297140f.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C69664n.m101061g(aVar, "builder");
            String packageName = mediaController.getPackageName();
            C69664n.m101060f(packageName, "controller.packageName");
            C69664n.m101061g(packageName, "value");
            aVar.copyOnWrite();
            C106564b bVar = (C106564b) aVar.instance;
            packageName.getClass();
            bVar.f297142a |= 1;
            bVar.f297143b = packageName;
            int hashCode = mediaController.getSessionToken().hashCode();
            aVar.copyOnWrite();
            C106564b bVar2 = (C106564b) aVar.instance;
            bVar2.f297142a |= 2;
            bVar2.f297144c = (long) hashCode;
            boolean contains = f53128c.contains(new Integer(state));
            aVar.copyOnWrite();
            C106564b bVar3 = (C106564b) aVar.instance;
            bVar3.f297142a |= 4;
            bVar3.f297145d = !contains;
            long lastPositionUpdateTime = playbackState != null ? playbackState.getLastPositionUpdateTime() : 0;
            aVar.copyOnWrite();
            C106564b bVar4 = (C106564b) aVar.instance;
            bVar4.f297142a |= 8;
            bVar4.f297146e = lastPositionUpdateTime;
            C62942bv build = aVar.build();
            C69664n.m101060f(build, "_builder.build()");
            arrayList.add((C106564b) build);
        }
        C106565c cVar3 = (C106565c) C106566d.f297147b.createBuilder();
        for (C106564b bVar5 : arrayList) {
            cVar3.copyOnWrite();
            C106566d dVar3 = (C106566d) cVar3.instance;
            bVar5.getClass();
            C62971cq cqVar = dVar3.f297149a;
            if (!cqVar.mo58948c()) {
                dVar3.f297149a = C62942bv.mutableCopy(cqVar);
            }
            dVar3.f297149a.add(bVar5);
        }
        C62942bv build2 = cVar3.build();
        C69664n.m101060f(build2, "sessionManager\n      .ge…n)\n      }\n      .build()");
        return build2;
    }
}
