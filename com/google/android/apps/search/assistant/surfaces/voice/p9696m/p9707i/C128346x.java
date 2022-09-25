package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import android.content.Context;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17362b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17506i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17510m;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17518u;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.p2511d.C32561x;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35617aj;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35628au;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.x */
/* compiled from: PG */
public final class C128346x implements C35628au {

    /* renamed from: a */
    public static final C59071e f353001a = C59071e.m91331h();

    /* renamed from: b */
    public static final C17508k f353002b;

    /* renamed from: c */
    public final Context f353003c;

    /* renamed from: d */
    public final C35617aj f353004d;

    /* renamed from: e */
    public final C17362b f353005e;

    /* renamed from: f */
    private final C71422aw f353006f;

    static {
        C17506i iVar = (C17506i) C17508k.f50521c.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C17510m a = C69664n.m101061g(iVar, "builder");
        C17518u uVar = C17518u.f50532a;
        C69664n.m101060f(uVar, "getDefaultInstance()");
        a.mo23377c(uVar);
        f353002b = a.mo23375a();
    }

    public C128346x(Context context, C71422aw awVar, C17362b bVar, C35617aj ajVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f353003c = context;
        this.f353006f = awVar;
        this.f353005e = bVar;
        this.f353004d = ajVar;
    }

    /* renamed from: a */
    public final C60870cx mo21073a(BundledMessageNotification bundledMessageNotification, String str) {
        C69664n.m101061g(bundledMessageNotification, "notification");
        C69664n.m101061g(str, "locale");
        return C32561x.m60381a(this.f353006f, new C128343u(this, bundledMessageNotification, str, (C69577g) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.m.i.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.google.android.apps.search.assistant.surfaces.voice.m.i.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.google.android.apps.search.assistant.surfaces.voice.m.i.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108398b(com.google.android.libraries.assistant.p1363c.p1398g.C17360b r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128345w
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.voice.m.i.w r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128345w) r0
            int r1 = r0.f353000d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353000d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.m.i.w r0 = new com.google.android.apps.search.assistant.surfaces.voice.m.i.w
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f352998b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353000d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f352997a
            p5462h.C69714l.m101134b(r6)
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.assistant.c.g.a r5 = r5.mo23302a()
            com.google.common.util.concurrent.cx r5 = r5.mo23275a()
            java.lang.String r6 = "ttsSession.sessionStatus.playbackEndStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.f352997a = r4
            r0.f353000d = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r6 == r1) goto L_0x0091
            r5 = r4
        L_0x004c:
            com.google.android.libraries.assistant.c.g.k.ac r6 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17467ac) r6
            int r0 = r6.f50443b
            r1 = 2
            if (r0 != r1) goto L_0x0085
            com.google.common.f.e r0 = f353001a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.Object r6 = r6.f50444c
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.android.libraries.assistant.c.g.k.aa r6 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17465aa.m34779a(r6)
            if (r6 != 0) goto L_0x006b
            com.google.android.libraries.assistant.c.g.k.aa r6 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17465aa.UNSPECIFIED_PLAYBACK_END_FAILURE
        L_0x006b:
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 37858(0x93e2, float:5.305E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Failed to play message TTS, end status=%s"
            r0.mo56389s(r1, r6)
            r6 = r5
            com.google.android.apps.search.assistant.surfaces.voice.m.i.x r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128346x) r6
            com.google.android.libraries.search.assistant.performer.communication.d.aj r6 = r6.f353004d
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.ABORTED
            r6.mo21076a(r0)
        L_0x0085:
            com.google.android.apps.search.assistant.surfaces.voice.m.i.x r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128346x) r5
            com.google.android.libraries.search.assistant.performer.communication.d.aj r5 = r5.f353004d
            com.google.net.a.a.b r6 = com.google.net.p4726a.p4727a.C62722b.OK
            r5.mo21076a(r6)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128346x.mo108398b(com.google.android.libraries.assistant.c.g.b, h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final C60870cx mo21075c(BundledMessageNotification bundledMessageNotification, String str, String str2) {
        C69664n.m101061g(bundledMessageNotification, "notification");
        C69664n.m101061g(str, "locale");
        return C32561x.m60381a(this.f353006f, new C128344v(this, bundledMessageNotification, str, (C69577g) null));
    }
}
