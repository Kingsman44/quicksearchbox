package com.google.android.libraries.lens.sdk.avs;

import android.content.Context;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.lens.ondevice.C24823o;
import com.google.android.libraries.lens.sdk.avs.p2039a.C24852i;
import com.google.android.libraries.lens.sdk.avs.p2042c.C24864c;
import com.google.android.libraries.lens.sdk.p2045c.C24914a;
import com.google.android.libraries.lens.sdk.p2045c.C24927l;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.lens.sdk.avs.s */
/* compiled from: PG */
public final class C24902s implements C24927l {

    /* renamed from: a */
    public static final C58974d f68013a = C58974d.m91135i("VisualSearchController");

    /* renamed from: e */
    private static final C58495hd f68014e = C58495hd.m89903q(2, 1, 1, 1, 3, (Object) null, (Object) null, 0);

    /* renamed from: b */
    public final boolean f68015b;

    /* renamed from: c */
    public final Map f68016c = new HashMap();

    /* renamed from: d */
    public final AtomicInteger f68017d = new AtomicInteger(0);

    /* renamed from: f */
    private final C24890g f68018f;

    /* renamed from: g */
    private final C24896m f68019g;

    /* renamed from: h */
    private final C143701ac f68020h;

    /* renamed from: i */
    private final C65603f f68021i;

    /* renamed from: j */
    private final Context f68022j;

    public C24902s(Context context, C24823o oVar, C24852i iVar, C24896m mVar, C143701ac acVar, boolean z, C65603f fVar) {
        this.f68018f = new C24890g(context, oVar, iVar);
        this.f68019g = mVar;
        this.f68020h = acVar;
        this.f68015b = z;
        this.f68021i = fVar;
        this.f68022j = context;
    }

    /* renamed from: a */
    public final void mo30131a(C24914a aVar) {
        ((C58970a) ((C58970a) f68013a.mo56224b()).mo56372aa(48890)).mo56389s("Detached %s", aVar.f68027b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x024f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30132b(com.google.android.libraries.lens.sdk.p2045c.C24914a r10, android.os.Bundle r11) {
        /*
            r9 = this;
            com.google.common.f.a.d r0 = f68013a
            com.google.common.f.x r1 = r0.mo56224b()
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            r2 = 48892(0xbefc, float:6.8512E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            java.lang.String r2 = "onClientEvent from %s"
            java.lang.String r3 = r10.f68027b
            r1.mo56389s(r2, r3)
            java.lang.String r1 = "SessionType"
            java.lang.String r2 = r11.getString(r1)
            java.lang.String r3 = "SessionTypeAvs"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0037
            com.google.common.f.x r10 = r0.mo56226d()
            java.lang.String r11 = r11.getString(r1)
            r0 = 48896(0xbf00, float:6.8518E-41)
            java.lang.String r1 = "Unexpected session type: %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r0)).mo56389s(r1, r11)
            return
        L_0x0037:
            java.lang.String r1 = "EventType"
            java.lang.String r1 = r11.getString(r1)
            if (r1 != 0) goto L_0x004c
            com.google.common.f.x r10 = r0.mo56226d()
            java.lang.String r11 = "Could not retrieve event type"
            r0 = 48895(0xbeff, float:6.8516E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r0)).mo56386p(r11)
            return
        L_0x004c:
            java.lang.String r2 = "Payload"
            android.os.Bundle r11 = r11.getBundle(r2)
            if (r11 != 0) goto L_0x0061
            com.google.common.f.x r10 = r0.mo56226d()
            java.lang.String r11 = "Could not retrieve payload"
            r0 = 48894(0xbefe, float:6.8515E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r0)).mo56386p(r11)
            return
        L_0x0061:
            android.content.Context r2 = r9.f68022j
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r11.setClassLoader(r2)
            int r2 = r1.hashCode()
            r3 = -1926884332(0xffffffff8d261414, float:-5.1176867E-31)
            r4 = 0
            r5 = 2
            java.lang.String r6 = "StartSession"
            java.lang.String r7 = "StopSession"
            r8 = 1
            if (r2 == r3) goto L_0x0097
            r3 = 78391464(0x4ac28a8, float:4.0474343E-36)
            if (r2 == r3) goto L_0x008d
            r3 = 2014861300(0x781857f4, float:1.2359578E34)
            if (r2 == r3) goto L_0x0085
            goto L_0x009f
        L_0x0085:
            boolean r2 = r1.equals(r6)
            if (r2 == 0) goto L_0x009f
            r2 = 0
            goto L_0x00a0
        L_0x008d:
            java.lang.String r2 = "Query"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x009f
            r2 = 1
            goto L_0x00a0
        L_0x0097:
            boolean r2 = r1.equals(r7)
            if (r2 == 0) goto L_0x009f
            r2 = 2
            goto L_0x00a0
        L_0x009f:
            r2 = -1
        L_0x00a0:
            if (r2 == 0) goto L_0x024f
            if (r2 == r8) goto L_0x0146
            if (r2 == r5) goto L_0x00b3
            com.google.common.f.x r10 = r0.mo56225c()
            java.lang.String r11 = "Unrecognized event type: %s"
            r0 = 48893(0xbefd, float:6.8514E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r0)).mo56389s(r11, r1)
            return
        L_0x00b3:
            com.google.android.libraries.lens.sdk.avs.data.r r1 = new com.google.android.libraries.lens.sdk.avs.data.r
            r1.<init>(r11)
            com.google.common.f.x r11 = r0.mo56224b()
            java.lang.String r2 = r1.mo30111a()
            r3 = 48906(0xbf0a, float:6.8532E-41)
            java.lang.String r4 = "Stopping sessionId %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r11).mo56372aa(r3)).mo56389s(r4, r2)
            java.lang.String r11 = r1.mo30111a()
            java.util.Map r2 = r9.f68016c
            boolean r2 = r2.containsKey(r11)
            if (r2 != 0) goto L_0x00e1
            com.google.common.f.x r10 = r0.mo56226d()
            java.lang.String r0 = "Attempted to stop unknown sessionId %s"
            r1 = 48908(0xbf0c, float:6.8535E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r1)).mo56389s(r0, r11)
            return
        L_0x00e1:
            java.util.Map r2 = r9.f68016c
            java.lang.Object r2 = r2.get(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0129
            boolean r0 = r9.f68015b
            if (r0 == 0) goto L_0x00fb
            com.google.android.libraries.lens.sdk.avs.g r0 = r9.f68018f
            r0.mo30117c(r1)
        L_0x00fb:
            com.google.android.libraries.lens.sdk.avs.m r0 = r9.f68019g
            com.google.android.libraries.lens.sdk.avs.data.s r2 = new com.google.android.libraries.lens.sdk.avs.data.s
            r2.<init>()
            java.lang.String r1 = r1.mo30111a()
            r1.getClass()
            r2.mo30114b(r1)
            android.os.Bundle r1 = r2.f67965a
            android.os.Bundle r1 = com.google.android.libraries.lens.sdk.avs.p2042c.C24864c.m46002a(r7, r1)
            r10.mo30134a(r1)
            java.util.concurrent.Executor r10 = r0.f67998b
            com.google.android.libraries.lens.sdk.avs.i r1 = new com.google.android.libraries.lens.sdk.avs.i
            r1.<init>(r0)
            java.lang.Runnable r0 = com.google.apps.tiktok.tracing.C47810es.m84977q(r1)
            r10.execute(r0)
            java.util.Map r10 = r9.f68016c
            r10.remove(r11)
            return
        L_0x0129:
            if (r2 != r8) goto L_0x0131
            com.google.android.libraries.lens.sdk.avs.g r10 = r9.f68018f
            r10.mo30117c(r1)
            return
        L_0x0131:
            com.google.common.f.x r10 = r0.mo56225c()
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10
            r0 = 48907(0xbf0b, float:6.8533E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r0)
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10
            java.lang.String r0 = "Unable to stop sessionId %s with execution mode %s"
            r10.mo56352E(r0, r11, r2)
            return
        L_0x0146:
            com.google.android.libraries.lens.sdk.avs.data.k r1 = new com.google.android.libraries.lens.sdk.avs.data.k
            r1.<init>(r11)
            com.google.common.f.x r11 = r0.mo56224b()
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            r2 = 48897(0xbf01, float:6.8519E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r2)
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            java.lang.String r2 = r1.mo30089c()
            int r3 = r1.mo30087a()
            java.lang.String r4 = "Querying sessionId %s, queryId %d."
            r11.mo56352E(r4, r2, r3)
            com.google.android.libraries.lens.sdk.avs.data.j r11 = r1.mo30088b()
            r2 = 0
            if (r11 == 0) goto L_0x018d
            com.google.android.libraries.lens.sdk.avs.data.j r11 = r1.mo30088b()
            r11.getClass()
            com.google.android.libraries.lens.sdk.avs.data.f r11 = r11.mo30085a()
            if (r11 == 0) goto L_0x018d
            com.google.android.libraries.lens.sdk.avs.data.j r11 = r1.mo30088b()
            r11.getClass()
            com.google.android.libraries.lens.sdk.avs.data.f r11 = r11.mo30085a()
            r11.getClass()
            android.graphics.Bitmap r2 = r11.mo30075a()
        L_0x018d:
            if (r2 != 0) goto L_0x019c
            com.google.common.f.x r10 = r0.mo56226d()
            java.lang.String r11 = "Invalid query without bitmap."
            r0 = 48900(0xbf04, float:6.8523E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r0)).mo56386p(r11)
            return
        L_0x019c:
            java.lang.String r11 = r1.mo30089c()
            java.util.Map r2 = r9.f68016c
            boolean r2 = r2.containsKey(r11)
            if (r2 != 0) goto L_0x01b5
            com.google.common.f.x r10 = r0.mo56226d()
            java.lang.String r0 = "Attempted to query unknown sessionId %s"
            r1 = 48899(0xbf03, float:6.8522E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r1)).mo56389s(r0, r11)
            return
        L_0x01b5:
            java.util.Map r2 = r9.f68016c
            java.lang.Object r2 = r2.get(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0220
            boolean r11 = r9.f68015b
            if (r11 == 0) goto L_0x01cc
            com.google.android.libraries.lens.sdk.avs.g r11 = r9.f68018f
            r11.mo30115a(r1)
        L_0x01cc:
            com.google.android.libraries.lens.sdk.avs.m r11 = r9.f68019g
            com.google.android.libraries.lens.sdk.avs.r r0 = new com.google.android.libraries.lens.sdk.avs.r
            r0.<init>(r9, r10)
            android.os.Bundle r10 = r1.f67959a
            java.lang.String r2 = "payload"
            boolean r10 = r10.containsKey(r2)
            if (r10 == 0) goto L_0x0211
            com.google.android.libraries.lens.sdk.avs.data.j r10 = r1.mo30088b()
            r10.getClass()
            android.os.Bundle r10 = r10.f67958a
            java.lang.String r2 = "image"
            boolean r10 = r10.containsKey(r2)
            if (r10 == 0) goto L_0x0211
            com.google.android.libraries.lens.sdk.avs.data.j r10 = r1.mo30088b()
            r10.getClass()
            com.google.android.libraries.lens.sdk.avs.data.f r10 = r10.mo30085a()
            r10.getClass()
            boolean r10 = r10.mo30076b()
            if (r10 == 0) goto L_0x0211
            java.util.concurrent.Executor r10 = r11.f67998b
            com.google.android.libraries.lens.sdk.avs.j r2 = new com.google.android.libraries.lens.sdk.avs.j
            r2.<init>(r11, r1, r0)
            java.lang.Runnable r11 = com.google.apps.tiktok.tracing.C47810es.m84977q(r2)
            r10.execute(r11)
            return
        L_0x0211:
            com.google.common.f.a.d r10 = com.google.android.libraries.lens.sdk.avs.C24896m.f67997a
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r11 = "Invalid query - does it have a payload with an image bitmap?"
            r0 = 48880(0xbef0, float:6.8495E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r0)).mo56386p(r11)
            return
        L_0x0220:
            java.util.Map r10 = r9.f68016c
            java.lang.Object r10 = r10.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r10 != r8) goto L_0x0234
            com.google.android.libraries.lens.sdk.avs.g r10 = r9.f68018f
            r10.mo30115a(r1)
            return
        L_0x0234:
            com.google.common.f.x r10 = r0.mo56225c()
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10
            r0 = 48898(0xbf02, float:6.852E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r0)
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10
            java.util.Map r0 = r9.f68016c
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r1 = "Unable to query from session %s with execution mode %s"
            r10.mo56354G(r1, r11, r0)
            return
        L_0x024f:
            com.google.android.libraries.lens.sdk.avs.data.p r1 = new com.google.android.libraries.lens.sdk.avs.data.p
            r1.<init>(r11)
            android.os.Bundle r11 = r1.f67962a
            java.lang.String r2 = "session_id"
            boolean r11 = r11.containsKey(r2)
            if (r11 != 0) goto L_0x026a
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            r1.mo30108f(r11)
            goto L_0x027d
        L_0x026a:
            java.lang.String r11 = r1.mo30104b()
            if (r11 != 0) goto L_0x027d
            com.google.common.f.x r10 = r0.mo56226d()
            java.lang.String r11 = "Aborting start session request with null sessionId"
            r0 = 48905(0xbf09, float:6.853E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r0)).mo56386p(r11)
            return
        L_0x027d:
            java.lang.String r11 = r1.mo30104b()
            r11.getClass()
            com.google.common.f.x r2 = r0.mo56224b()
            java.lang.String r3 = "Starting sessionId %s"
            r5 = 48901(0xbf05, float:6.8525E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r5)).mo56389s(r3, r11)
            boolean r2 = r1.mo30105c()
            if (r2 == 0) goto L_0x034b
            com.google.android.libraries.lens.sdk.avs.data.d r2 = r1.mo30103a()
            r2.getClass()
            boolean r2 = r2.mo30069b()
            if (r2 != 0) goto L_0x02a5
            goto L_0x034b
        L_0x02a5:
            com.google.android.libraries.lens.sdk.avs.data.d r2 = r1.mo30103a()
            r2.getClass()
            int r2 = r2.mo30068a()
            com.google.common.b.hd r3 = f68014e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r7 = r3.containsKey(r5)
            if (r7 != 0) goto L_0x02c9
            com.google.common.f.x r10 = r0.mo56225c()
            java.lang.String r11 = "Execution mode not found for surface %s"
            r0 = 48904(0xbf08, float:6.8529E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r0)).mo56387q(r11, r2)
            return
        L_0x02c9:
            java.lang.Object r2 = r3.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0320
            boolean r0 = r9.f68015b
            if (r0 == 0) goto L_0x02ee
            com.google.android.libraries.lens.sdk.avs.g r0 = r9.f68018f
            com.google.android.libraries.lens.sdk.avs.p r2 = new com.google.android.libraries.lens.sdk.avs.p
            r2.<init>(r9, r10, r11)
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            r0.f67983d = r2
            com.google.android.libraries.lens.sdk.avs.g r0 = r9.f68018f
            r0.mo30116b(r1)
        L_0x02ee:
            com.google.android.libraries.lens.sdk.avs.m r0 = r9.f68019g
            com.google.android.libraries.lens.sdk.avs.data.q r2 = new com.google.android.libraries.lens.sdk.avs.data.q
            r2.<init>()
            java.lang.String r1 = r1.mo30104b()
            r1.getClass()
            r2.mo30110b(r1)
            android.os.Bundle r1 = r2.f67963a
            android.os.Bundle r1 = com.google.android.libraries.lens.sdk.avs.p2042c.C24864c.m46002a(r6, r1)
            r10.mo30134a(r1)
            java.util.concurrent.Executor r10 = r0.f67998b
            com.google.android.libraries.lens.sdk.avs.k r1 = new com.google.android.libraries.lens.sdk.avs.k
            r1.<init>(r0)
            java.lang.Runnable r0 = com.google.apps.tiktok.tracing.C47810es.m84977q(r1)
            r10.execute(r0)
            java.util.Map r10 = r9.f68016c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r10.put(r11, r0)
            return
        L_0x0320:
            if (r2 != r8) goto L_0x033e
            com.google.android.libraries.lens.sdk.avs.g r0 = r9.f68018f
            com.google.android.libraries.lens.sdk.avs.q r2 = new com.google.android.libraries.lens.sdk.avs.q
            r2.<init>(r9, r10, r11)
            j$.util.Optional r10 = p3186j$.util.Optional.m71637of(r2)
            r0.f67983d = r10
            com.google.android.libraries.lens.sdk.avs.g r10 = r9.f68018f
            r10.mo30116b(r1)
            java.util.Map r10 = r9.f68016c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r10.put(r11, r0)
            return
        L_0x033e:
            com.google.common.f.x r10 = r0.mo56225c()
            java.lang.String r11 = "Unable to start session for execution mode %s"
            r0 = 48903(0xbf07, float:6.8528E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r0)).mo56387q(r11, r2)
            return
        L_0x034b:
            com.google.common.f.x r10 = r0.mo56225c()
            java.lang.String r0 = "Start session request with sessionId %s has incomplete client info"
            r1 = 48902(0xbf06, float:6.8526E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r1)).mo56389s(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.sdk.avs.C24902s.mo30132b(com.google.android.libraries.lens.sdk.c.a, android.os.Bundle):void");
    }

    /* renamed from: c */
    public final boolean mo30133c(C24914a aVar) {
        int i = aVar.f68026a;
        String str = aVar.f68027b;
        if (i == -1) {
            ((C58970a) ((C58970a) f68013a.mo56226d()).mo56372aa(48915)).mo56386p("Attached client has invalid uid");
        } else if (str == null) {
            ((C58970a) ((C58970a) f68013a.mo56226d()).mo56372aa(48914)).mo56386p("Attached client has no package name");
        } else if (this.f68020h.mo119085d(i) || C24864c.m46012k(this.f68021i.f178307a, str)) {
            ((C58970a) ((C58970a) f68013a.mo56224b()).mo56372aa(48909)).mo56389s("Attached client %s", aVar.f68027b);
            return true;
        }
        ((C58970a) ((C58970a) f68013a.mo56226d()).mo56372aa(48910)).mo56386p("Attempted to attach client that is not allowed for internal API use");
        return false;
    }
}
