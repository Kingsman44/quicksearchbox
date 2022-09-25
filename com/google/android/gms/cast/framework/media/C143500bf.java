package com.google.android.gms.cast.framework.media;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.C143360ar;
import com.google.android.gms.cast.C143368az;
import com.google.android.gms.cast.C143558i;
import com.google.android.gms.cast.C143603l;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.cast.internal.C143570ai;
import com.google.android.gms.cast.internal.C143572ak;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.android.gms.tasks.C146010af;
import com.google.common.p4535g.C59203do;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.cast.framework.media.bf */
/* compiled from: PG */
public final class C143500bf implements C143558i {

    /* renamed from: a */
    public static final C143566ae f389126a = new C143566ae("RemoteMediaClient");

    /* renamed from: b */
    public final Object f389127b = new Object();

    /* renamed from: c */
    public final Handler f389128c = new C144861c(Looper.getMainLooper());

    /* renamed from: d */
    public final C143572ak f389129d;

    /* renamed from: e */
    public C146010af f389130e;

    /* renamed from: f */
    public final List f389131f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public final List f389132g = new CopyOnWriteArrayList();

    /* renamed from: h */
    public final Map f389133h = new ConcurrentHashMap();

    /* renamed from: i */
    public final Map f389134i = new ConcurrentHashMap();

    /* renamed from: j */
    private final C143486as f389135j;

    /* renamed from: k */
    private final C143535v f389136k;

    /* renamed from: l */
    private C143603l f389137l;

    static {
        String str = C143572ak.f389273e;
    }

    public C143500bf(C143572ak akVar) {
        C143486as asVar = new C143486as(this);
        this.f389135j = asVar;
        this.f389129d = akVar;
        akVar.f389278E = new C143496bb(this);
        akVar.f389320d = asVar;
        if (akVar.f389320d == null) {
            akVar.mo118910a();
            akVar.mo118896j();
        }
        this.f389136k = new C143535v(this);
    }

    /* renamed from: D */
    public static C143854z m232974D() {
        C143488au auVar = new C143488au();
        auVar.mo119112p(new C143487at(new Status(1, 17, (String) null, (PendingIntent) null, (ConnectionResult) null)));
        return auVar;
    }

    /* renamed from: A */
    public final boolean mo118762A() {
        C143919bh.m233964g("Must be called from the main thread.");
        MediaStatus i = mo118781i();
        return i != null && i.f388703e == 2;
    }

    /* renamed from: B */
    public final boolean mo118763B() {
        C143919bh.m233964g("Must be called from the main thread.");
        MediaStatus i = mo118781i();
        return i != null && i.f388716r;
    }

    /* renamed from: C */
    public final void mo118764C(C143497bc bcVar, long j) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (bcVar != null && !this.f389133h.containsKey(bcVar)) {
            Map map = this.f389134i;
            Long valueOf = Long.valueOf(j);
            C143499be beVar = (C143499be) map.get(valueOf);
            if (beVar == null) {
                beVar = new C143499be(this, j);
                this.f389134i.put(valueOf, beVar);
            }
            beVar.f389121a.add(bcVar);
            this.f389133h.put(bcVar, beVar);
            if (mo118793u()) {
                beVar.mo118760a();
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0041 */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118765E(com.google.android.gms.cast.framework.media.C143492ay r8) {
        /*
            r7 = this;
            boolean r0 = r8.f389116g     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.cast.framework.media.bf r0 = r8.f389117h     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            java.util.List r0 = r0.f389131f     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
        L_0x000c:
            boolean r1 = r0.hasNext()     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            if (r1 == 0) goto L_0x001c
            java.lang.Object r1 = r0.next()     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            com.google.android.gms.cast.framework.media.av r1 = (com.google.android.gms.cast.framework.media.C143489av) r1     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            r1.mo118751e()     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            goto L_0x000c
        L_0x001c:
            com.google.android.gms.cast.framework.media.bf r0 = r8.f389117h     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            java.util.List r0 = r0.f389132g     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
        L_0x0024:
            boolean r1 = r0.hasNext()     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r1 = r0.next()     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            com.google.android.gms.cast.framework.media.aq r1 = (com.google.android.gms.cast.framework.media.C143484aq) r1     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            r1.mo6037f()     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            goto L_0x0024
        L_0x0034:
            com.google.android.gms.cast.framework.media.bf r0 = r8.f389117h     // Catch:{ ai -> 0x0041 }
            java.lang.Object r0 = r0.f389127b     // Catch:{ ai -> 0x0041 }
            monitor-enter(r0)     // Catch:{ ai -> 0x0041 }
            r8.mo118739h()     // Catch:{ all -> 0x003e }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return
        L_0x003e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r1     // Catch:{ ai -> 0x0041 }
        L_0x0041:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            r1 = 1
            r2 = 2100(0x834, float:2.943E-42)
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            com.google.android.gms.cast.framework.media.ax r0 = new com.google.android.gms.cast.framework.media.ax     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            r0.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            r8.mo119112p(r0)     // Catch:{ IllegalArgumentException -> 0x006b, all -> 0x0056 }
            return
        L_0x0056:
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r1 = 1
            r2 = 2100(0x834, float:2.943E-42)
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.gms.cast.framework.media.ax r0 = new com.google.android.gms.cast.framework.media.ax
            r0.<init>(r6)
            r8.mo119112p(r0)
            return
        L_0x006b:
            r8 = move-exception
            goto L_0x006e
        L_0x006d:
            throw r8
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.C143500bf.mo118765E(com.google.android.gms.cast.framework.media.ay):void");
    }

    /* renamed from: F */
    public final C143854z mo118766F() {
        C143919bh.m233964g("Must be called from the main thread.");
        if (!mo118792t()) {
            return m232974D();
        }
        C143479al alVar = new C143479al(this);
        mo118765E(alVar);
        return alVar;
    }

    /* renamed from: G */
    public final C143854z mo118767G() {
        C143919bh.m233964g("Must be called from the main thread.");
        if (!mo118792t()) {
            return m232974D();
        }
        C143481an anVar = new C143481an(this);
        mo118765E(anVar);
        return anVar;
    }

    /* renamed from: H */
    public final C143854z mo118768H(int i, long j) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (!mo118792t()) {
            return m232974D();
        }
        C143476ai aiVar = new C143476ai(this, i, j);
        mo118765E(aiVar);
        return aiVar;
    }

    /* renamed from: I */
    public final void mo118769I(MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (!mo118792t()) {
            m232974D();
        } else {
            mo118765E(new C143471ad(this, mediaQueueItemArr, i, i2, j, jSONObject));
        }
    }

    /* renamed from: J */
    public final void mo118770J() {
        C143919bh.m233964g("Must be called from the main thread.");
        if (!mo118792t()) {
            m232974D();
        } else {
            mo118765E(new C143474ag(this));
        }
    }

    /* renamed from: K */
    public final void mo118771K() {
        C143919bh.m233964g("Must be called from the main thread.");
        if (!mo118792t()) {
            m232974D();
        } else {
            mo118765E(new C143473af(this));
        }
    }

    /* renamed from: L */
    public final C143854z mo118772L(double d) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (!mo118792t()) {
            return m232974D();
        }
        C143483ap apVar = new C143483ap(this, d);
        mo118765E(apVar);
        return apVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0307 A[Catch:{ JSONException -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0324 A[Catch:{ JSONException -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0334 A[Catch:{ JSONException -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0341 A[Catch:{ JSONException -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x034b A[Catch:{ JSONException -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0352 A[Catch:{ JSONException -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0359 A[Catch:{ JSONException -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0360 A[Catch:{ JSONException -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x039e A[Catch:{ JSONException -> 0x03cd }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118773a(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r17
            java.lang.String r0 = "insertBefore"
            r2 = r16
            com.google.android.gms.cast.internal.ak r3 = r2.f389129d
            com.google.android.gms.cast.internal.ae r4 = r3.f389318b
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r1
            java.lang.String r8 = "message received: %s"
            r4.mo118884b(r8, r6)
            r4 = 2
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03cd }
            r6.<init>(r1)     // Catch:{ JSONException -> 0x03cd }
            java.lang.String r8 = "type"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ JSONException -> 0x03cd }
            java.lang.String r9 = "requestId"
            r10 = -1
            long r9 = r6.optLong(r9, r10)     // Catch:{ JSONException -> 0x03cd }
            int r11 = r8.hashCode()     // Catch:{ JSONException -> 0x03cd }
            java.lang.String r12 = "QUEUE_ITEM_IDS"
            java.lang.String r13 = "QUEUE_CHANGE"
            java.lang.String r14 = "QUEUE_ITEMS"
            switch(r11) {
                case -1830647528: goto L_0x008e;
                case -1790231854: goto L_0x0085;
                case -1125000185: goto L_0x007b;
                case -262628938: goto L_0x0071;
                case -61993624: goto L_0x0066;
                case 66247144: goto L_0x005c;
                case 154411710: goto L_0x0054;
                case 431600379: goto L_0x004a;
                case 823510221: goto L_0x0040;
                case 2107149050: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0098
        L_0x0038:
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0098
            r8 = 6
            goto L_0x0099
        L_0x0040:
            java.lang.String r11 = "MEDIA_STATUS"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0098
            r8 = 0
            goto L_0x0099
        L_0x004a:
            java.lang.String r11 = "INVALID_PLAYER_STATE"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0098
            r8 = 1
            goto L_0x0099
        L_0x0054:
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x0098
            r8 = 7
            goto L_0x0099
        L_0x005c:
            java.lang.String r11 = "ERROR"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0098
            r8 = 5
            goto L_0x0099
        L_0x0066:
            java.lang.String r11 = "SESSION_STATE"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0098
            r8 = 9
            goto L_0x0099
        L_0x0071:
            java.lang.String r11 = "LOAD_FAILED"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0098
            r8 = 2
            goto L_0x0099
        L_0x007b:
            java.lang.String r11 = "INVALID_REQUEST"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0098
            r8 = 4
            goto L_0x0099
        L_0x0085:
            boolean r8 = r8.equals(r14)
            if (r8 == 0) goto L_0x0098
            r8 = 8
            goto L_0x0099
        L_0x008e:
            java.lang.String r11 = "LOAD_CANCELLED"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0098
            r8 = 3
            goto L_0x0099
        L_0x0098:
            r8 = -1
        L_0x0099:
            java.lang.String r11 = "itemIds"
            r15 = 0
            switch(r8) {
                case 0: goto L_0x02ca;
                case 1: goto L_0x02a5;
                case 2: goto L_0x0299;
                case 3: goto L_0x028d;
                case 4: goto L_0x0268;
                case 5: goto L_0x022e;
                case 6: goto L_0x0212;
                case 7: goto L_0x011d;
                case 8: goto L_0x00d3;
                case 9: goto L_0x00a1;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x03cc
        L_0x00a1:
            com.google.android.gms.cast.internal.an r0 = r3.f389276C     // Catch:{ JSONException -> 0x03cd }
            r0.mo118909e(r9, r7, r15)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.tasks.af r0 = r3.f389277D     // Catch:{ JSONException -> 0x03cd }
            if (r0 != 0) goto L_0x00ac
            goto L_0x03cc
        L_0x00ac:
            java.lang.String r0 = "sessionState"
            org.json.JSONObject r0 = com.google.android.gms.cast.internal.C143596v.m233276i(r6, r0)     // Catch:{ JSONException -> 0x03cd }
            if (r0 == 0) goto L_0x03cc
            java.lang.String r6 = "loadRequestData"
            org.json.JSONObject r6 = r0.optJSONObject(r6)     // Catch:{ JSONException -> 0x03cd }
            if (r6 == 0) goto L_0x00c0
            com.google.android.gms.cast.MediaLoadRequestData r15 = com.google.android.gms.cast.MediaLoadRequestData.m232562a(r6)     // Catch:{ JSONException -> 0x03cd }
        L_0x00c0:
            java.lang.String r6 = "customData"
            org.json.JSONObject r0 = r0.optJSONObject(r6)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.SessionState r6 = new com.google.android.gms.cast.SessionState     // Catch:{ JSONException -> 0x03cd }
            r6.<init>(r15, r0)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.tasks.af r0 = r3.f389277D     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.tasks.aj r0 = r0.f394698a     // Catch:{ JSONException -> 0x03cd }
            r0.mo122508v(r6)     // Catch:{ JSONException -> 0x03cd }
            return
        L_0x00d3:
            com.google.android.gms.cast.internal.an r0 = r3.f389298y     // Catch:{ JSONException -> 0x03cd }
            r0.mo118909e(r9, r7, r15)     // Catch:{ JSONException -> 0x03cd }
            r3.mo118897k(r6, r14)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bb r0 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            if (r0 == 0) goto L_0x03cc
            java.lang.String r0 = "items"
            org.json.JSONArray r0 = r6.getJSONArray(r0)     // Catch:{ JSONException -> 0x03cd }
            int r6 = r0.length()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.MediaQueueItem[] r6 = new com.google.android.gms.cast.MediaQueueItem[r6]     // Catch:{ JSONException -> 0x03cd }
            r8 = 0
        L_0x00ec:
            int r9 = r0.length()     // Catch:{ JSONException -> 0x03cd }
            if (r8 >= r9) goto L_0x0103
            org.json.JSONObject r9 = r0.getJSONObject(r8)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.MediaQueueItem r10 = new com.google.android.gms.cast.MediaQueueItem     // Catch:{ JSONException -> 0x03cd }
            r10.<init>((org.json.JSONObject) r9)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.C143366ax.m232629a(r10)     // Catch:{ JSONException -> 0x03cd }
            r6[r8] = r10     // Catch:{ JSONException -> 0x03cd }
            int r8 = r8 + 1
            goto L_0x00ec
        L_0x0103:
            com.google.android.gms.cast.framework.media.bb r0 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bf r0 = r0.f389119a     // Catch:{ JSONException -> 0x03cd }
            java.util.List r0 = r0.f389132g     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x010d:
            boolean r8 = r0.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r8 == 0) goto L_0x03cc
            java.lang.Object r8 = r0.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.aq r8 = (com.google.android.gms.cast.framework.media.C143484aq) r8     // Catch:{ JSONException -> 0x03cd }
            r8.mo118742s(r6)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x010d
        L_0x011d:
            com.google.android.gms.cast.internal.an r8 = r3.f389299z     // Catch:{ JSONException -> 0x03cd }
            r8.mo118909e(r9, r7, r15)     // Catch:{ JSONException -> 0x03cd }
            r3.mo118897k(r6, r13)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bb r8 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            if (r8 == 0) goto L_0x03cc
            java.lang.String r8 = "changeType"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ JSONException -> 0x03cd }
            org.json.JSONArray r9 = r6.getJSONArray(r11)     // Catch:{ JSONException -> 0x03cd }
            int[] r9 = com.google.android.gms.cast.internal.C143572ak.m233189q(r9)     // Catch:{ JSONException -> 0x03cd }
            int r10 = r6.optInt(r0, r7)     // Catch:{ JSONException -> 0x03cd }
            if (r9 == 0) goto L_0x03cc
            int r12 = r8.hashCode()     // Catch:{ JSONException -> 0x03cd }
            switch(r12) {
                case -2130463047: goto L_0x0163;
                case -1881281404: goto L_0x0159;
                case -1785516855: goto L_0x014f;
                case 1122976047: goto L_0x0145;
                default: goto L_0x0144;
            }
        L_0x0144:
            goto L_0x016d
        L_0x0145:
            java.lang.String r12 = "ITEMS_CHANGE"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x016d
            r15 = 1
            goto L_0x016e
        L_0x014f:
            java.lang.String r12 = "UPDATE"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x016d
            r15 = 3
            goto L_0x016e
        L_0x0159:
            java.lang.String r12 = "REMOVE"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x016d
            r15 = 2
            goto L_0x016e
        L_0x0163:
            java.lang.String r12 = "INSERT"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x016d
            r15 = 0
            goto L_0x016e
        L_0x016d:
            r15 = -1
        L_0x016e:
            if (r15 == 0) goto L_0x01f8
            if (r15 == r5) goto L_0x01de
            if (r15 == r4) goto L_0x01c4
            r8 = 3
            if (r15 == r8) goto L_0x0179
            goto L_0x03cc
        L_0x0179:
            org.json.JSONArray r8 = r6.getJSONArray(r11)     // Catch:{ JSONException -> 0x03cd }
            int[] r8 = com.google.android.gms.cast.internal.C143572ak.m233189q(r8)     // Catch:{ JSONException -> 0x03cd }
            java.lang.String r9 = "A list of item IDs is expected in a QUEUE UPDATE message."
            com.google.android.gms.common.internal.C143919bh.m233971n(r8, r9)     // Catch:{ JSONException -> 0x03cd }
            java.lang.String r9 = "reorderItemIds"
            org.json.JSONArray r9 = r6.optJSONArray(r9)     // Catch:{ JSONException -> 0x03cd }
            if (r9 == 0) goto L_0x01be
            java.util.List r8 = com.google.android.gms.cast.internal.C143596v.m233274g(r8)     // Catch:{ JSONException -> 0x03cd }
            int r0 = r6.optInt(r0, r7)     // Catch:{ JSONException -> 0x03cd }
            int[] r6 = com.google.android.gms.cast.internal.C143572ak.m233189q(r9)     // Catch:{ JSONException -> 0x03cd }
            java.lang.Object r6 = com.google.android.gms.common.internal.C143919bh.m233958a(r6)     // Catch:{ JSONException -> 0x03cd }
            int[] r6 = (int[]) r6     // Catch:{ JSONException -> 0x03cd }
            java.util.List r6 = com.google.android.gms.cast.internal.C143596v.m233274g(r6)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bb r9 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bf r9 = r9.f389119a     // Catch:{ JSONException -> 0x03cd }
            java.util.List r9 = r9.f389132g     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x01ae:
            boolean r10 = r9.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r10 == 0) goto L_0x03cc
            java.lang.Object r10 = r9.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.aq r10 = (com.google.android.gms.cast.framework.media.C143484aq) r10     // Catch:{ JSONException -> 0x03cd }
            r10.mo118744u(r8, r6, r0)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x01ae
        L_0x01be:
            com.google.android.gms.cast.framework.media.bb r0 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            r0.mo118758a(r8)     // Catch:{ JSONException -> 0x03cd }
            return
        L_0x01c4:
            com.google.android.gms.cast.framework.media.bb r0 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bf r0 = r0.f389119a     // Catch:{ JSONException -> 0x03cd }
            java.util.List r0 = r0.f389132g     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x01ce:
            boolean r6 = r0.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r6 == 0) goto L_0x03cc
            java.lang.Object r6 = r0.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.aq r6 = (com.google.android.gms.cast.framework.media.C143484aq) r6     // Catch:{ JSONException -> 0x03cd }
            r6.mo118743t(r9)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x01ce
        L_0x01de:
            com.google.android.gms.cast.framework.media.bb r0 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bf r0 = r0.f389119a     // Catch:{ JSONException -> 0x03cd }
            java.util.List r0 = r0.f389132g     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x01e8:
            boolean r6 = r0.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r6 == 0) goto L_0x03cc
            java.lang.Object r6 = r0.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.aq r6 = (com.google.android.gms.cast.framework.media.C143484aq) r6     // Catch:{ JSONException -> 0x03cd }
            r6.mo118745v(r9)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x01e8
        L_0x01f8:
            com.google.android.gms.cast.framework.media.bb r0 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bf r0 = r0.f389119a     // Catch:{ JSONException -> 0x03cd }
            java.util.List r0 = r0.f389132g     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x0202:
            boolean r6 = r0.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r6 == 0) goto L_0x03cc
            java.lang.Object r6 = r0.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.aq r6 = (com.google.android.gms.cast.framework.media.C143484aq) r6     // Catch:{ JSONException -> 0x03cd }
            r6.mo118741r(r9, r10)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x0202
        L_0x0212:
            com.google.android.gms.cast.internal.an r0 = r3.f389297x     // Catch:{ JSONException -> 0x03cd }
            r0.mo118909e(r9, r7, r15)     // Catch:{ JSONException -> 0x03cd }
            r3.mo118897k(r6, r12)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bb r0 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            if (r0 == 0) goto L_0x03cc
            org.json.JSONArray r0 = r6.getJSONArray(r11)     // Catch:{ JSONException -> 0x03cd }
            int[] r0 = com.google.android.gms.cast.internal.C143572ak.m233189q(r0)     // Catch:{ JSONException -> 0x03cd }
            if (r0 == 0) goto L_0x03cc
            com.google.android.gms.cast.framework.media.bb r6 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            r6.mo118758a(r0)     // Catch:{ JSONException -> 0x03cd }
            return
        L_0x022e:
            java.util.List r0 = r3.f389308a     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x0234:
            boolean r8 = r0.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r8 == 0) goto L_0x024a
            java.lang.Object r8 = r0.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.an r8 = (com.google.android.gms.cast.internal.C143575an) r8     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.aj r11 = com.google.android.gms.cast.internal.C143572ak.m233188i(r6)     // Catch:{ JSONException -> 0x03cd }
            r12 = 2100(0x834, float:2.943E-42)
            r8.mo118909e(r9, r12, r11)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x0234
        L_0x024a:
            com.google.android.gms.cast.framework.media.bb r0 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            if (r0 == 0) goto L_0x03cc
            com.google.android.gms.cast.MediaError.m232558a(r6)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bb r0 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bf r0 = r0.f389119a     // Catch:{ JSONException -> 0x03cd }
            java.util.List r0 = r0.f389132g     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x025b:
            boolean r6 = r0.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r6 == 0) goto L_0x03cc
            java.lang.Object r6 = r0.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.aq r6 = (com.google.android.gms.cast.framework.media.C143484aq) r6     // Catch:{ JSONException -> 0x03cd }
            goto L_0x025b
        L_0x0268:
            com.google.android.gms.cast.internal.ae r0 = r3.f389318b     // Catch:{ JSONException -> 0x03cd }
            java.lang.String r8 = "received unexpected error: Invalid Request."
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ JSONException -> 0x03cd }
            r0.mo118889g(r8, r11)     // Catch:{ JSONException -> 0x03cd }
            java.util.List r0 = r3.f389308a     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x0277:
            boolean r8 = r0.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r8 == 0) goto L_0x03cc
            java.lang.Object r8 = r0.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.an r8 = (com.google.android.gms.cast.internal.C143575an) r8     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.aj r11 = com.google.android.gms.cast.internal.C143572ak.m233188i(r6)     // Catch:{ JSONException -> 0x03cd }
            r12 = 2001(0x7d1, float:2.804E-42)
            r8.mo118909e(r9, r12, r11)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x0277
        L_0x028d:
            com.google.android.gms.cast.internal.an r0 = r3.f389283j     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.aj r6 = com.google.android.gms.cast.internal.C143572ak.m233188i(r6)     // Catch:{ JSONException -> 0x03cd }
            r8 = 2101(0x835, float:2.944E-42)
            r0.mo118909e(r9, r8, r6)     // Catch:{ JSONException -> 0x03cd }
            return
        L_0x0299:
            com.google.android.gms.cast.internal.an r0 = r3.f389283j     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.aj r6 = com.google.android.gms.cast.internal.C143572ak.m233188i(r6)     // Catch:{ JSONException -> 0x03cd }
            r8 = 2100(0x834, float:2.943E-42)
            r0.mo118909e(r9, r8, r6)     // Catch:{ JSONException -> 0x03cd }
            return
        L_0x02a5:
            com.google.android.gms.cast.internal.ae r0 = r3.f389318b     // Catch:{ JSONException -> 0x03cd }
            java.lang.String r8 = "received unexpected error: Invalid Player State."
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ JSONException -> 0x03cd }
            r0.mo118889g(r8, r11)     // Catch:{ JSONException -> 0x03cd }
            java.util.List r0 = r3.f389308a     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x02b4:
            boolean r8 = r0.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r8 == 0) goto L_0x03cc
            java.lang.Object r8 = r0.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.an r8 = (com.google.android.gms.cast.internal.C143575an) r8     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.aj r11 = com.google.android.gms.cast.internal.C143572ak.m233188i(r6)     // Catch:{ JSONException -> 0x03cd }
            r12 = 2100(0x834, float:2.943E-42)
            r8.mo118909e(r9, r12, r11)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x02b4
        L_0x02ca:
            java.lang.String r0 = "status"
            org.json.JSONArray r0 = r6.getJSONArray(r0)     // Catch:{ JSONException -> 0x03cd }
            int r6 = r0.length()     // Catch:{ JSONException -> 0x03cd }
            if (r6 <= 0) goto L_0x03a8
            org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.an r6 = r3.f389283j     // Catch:{ JSONException -> 0x03cd }
            boolean r6 = r6.mo118907c(r9)     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.an r8 = r3.f389288o     // Catch:{ JSONException -> 0x03cd }
            boolean r8 = r8.mo118906b()     // Catch:{ JSONException -> 0x03cd }
            if (r8 == 0) goto L_0x02f3
            com.google.android.gms.cast.internal.an r8 = r3.f389288o     // Catch:{ JSONException -> 0x03cd }
            boolean r8 = r8.mo118907c(r9)     // Catch:{ JSONException -> 0x03cd }
            if (r8 == 0) goto L_0x02f1
            goto L_0x02f3
        L_0x02f1:
            r8 = 1
            goto L_0x0305
        L_0x02f3:
            com.google.android.gms.cast.internal.an r8 = r3.f389289p     // Catch:{ JSONException -> 0x03cd }
            boolean r8 = r8.mo118906b()     // Catch:{ JSONException -> 0x03cd }
            if (r8 == 0) goto L_0x0304
            com.google.android.gms.cast.internal.an r8 = r3.f389289p     // Catch:{ JSONException -> 0x03cd }
            boolean r8 = r8.mo118907c(r9)     // Catch:{ JSONException -> 0x03cd }
            if (r8 != 0) goto L_0x0304
            goto L_0x02f1
        L_0x0304:
            r8 = 0
        L_0x0305:
            if (r6 != 0) goto L_0x0311
            com.google.android.gms.cast.MediaStatus r6 = r3.f389280g     // Catch:{ JSONException -> 0x03cd }
            if (r6 != 0) goto L_0x030c
            goto L_0x0311
        L_0x030c:
            int r0 = r6.mo118434a(r0, r8)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x0320
        L_0x0311:
            com.google.android.gms.cast.MediaStatus r6 = new com.google.android.gms.cast.MediaStatus     // Catch:{ JSONException -> 0x03cd }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x03cd }
            r3.f389280g = r6     // Catch:{ JSONException -> 0x03cd }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x03cd }
            r3.f389279f = r11     // Catch:{ JSONException -> 0x03cd }
            r0 = 127(0x7f, float:1.78E-43)
        L_0x0320:
            r6 = r0 & 1
            if (r6 == 0) goto L_0x0330
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x03cd }
            r3.f389279f = r11     // Catch:{ JSONException -> 0x03cd }
            r6 = -1
            r3.f389282i = r6     // Catch:{ JSONException -> 0x03cd }
            r3.mo118901o()     // Catch:{ JSONException -> 0x03cd }
        L_0x0330:
            r6 = r0 & 2
            if (r6 == 0) goto L_0x033d
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x03cd }
            r3.f389279f = r11     // Catch:{ JSONException -> 0x03cd }
            r3.mo118901o()     // Catch:{ JSONException -> 0x03cd }
        L_0x033d:
            r6 = r0 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0347
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x03cd }
            r3.f389279f = r11     // Catch:{ JSONException -> 0x03cd }
        L_0x0347:
            r6 = r0 & 4
            if (r6 == 0) goto L_0x034e
            r3.mo118898l()     // Catch:{ JSONException -> 0x03cd }
        L_0x034e:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0355
            r3.mo118900n()     // Catch:{ JSONException -> 0x03cd }
        L_0x0355:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x035c
            r3.mo118899m()     // Catch:{ JSONException -> 0x03cd }
        L_0x035c:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x039a
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x03cd }
            r3.f389279f = r11     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.bb r6 = r3.f389278E     // Catch:{ JSONException -> 0x03cd }
            if (r6 == 0) goto L_0x039a
            com.google.android.gms.cast.framework.media.bf r8 = r6.f389119a     // Catch:{ JSONException -> 0x03cd }
            java.util.List r8 = r8.f389131f     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x0372:
            boolean r11 = r8.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r11 == 0) goto L_0x0382
            java.lang.Object r11 = r8.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.av r11 = (com.google.android.gms.cast.framework.media.C143489av) r11     // Catch:{ JSONException -> 0x03cd }
            r11.mo118747a()     // Catch:{ JSONException -> 0x03cd }
            goto L_0x0372
        L_0x0382:
            com.google.android.gms.cast.framework.media.bf r6 = r6.f389119a     // Catch:{ JSONException -> 0x03cd }
            java.util.List r6 = r6.f389132g     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x038a:
            boolean r8 = r6.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r8 == 0) goto L_0x039a
            java.lang.Object r8 = r6.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.framework.media.aq r8 = (com.google.android.gms.cast.framework.media.C143484aq) r8     // Catch:{ JSONException -> 0x03cd }
            r8.mo6032a()     // Catch:{ JSONException -> 0x03cd }
            goto L_0x038a
        L_0x039a:
            r0 = r0 & 64
            if (r0 == 0) goto L_0x03b6
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x03cd }
            r3.f389279f = r11     // Catch:{ JSONException -> 0x03cd }
            r3.mo118901o()     // Catch:{ JSONException -> 0x03cd }
            goto L_0x03b6
        L_0x03a8:
            r3.f389280g = r15     // Catch:{ JSONException -> 0x03cd }
            r3.mo118901o()     // Catch:{ JSONException -> 0x03cd }
            r3.mo118898l()     // Catch:{ JSONException -> 0x03cd }
            r3.mo118900n()     // Catch:{ JSONException -> 0x03cd }
            r3.mo118899m()     // Catch:{ JSONException -> 0x03cd }
        L_0x03b6:
            java.util.List r0 = r3.f389308a     // Catch:{ JSONException -> 0x03cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x03cd }
        L_0x03bc:
            boolean r6 = r0.hasNext()     // Catch:{ JSONException -> 0x03cd }
            if (r6 == 0) goto L_0x03cc
            java.lang.Object r6 = r0.next()     // Catch:{ JSONException -> 0x03cd }
            com.google.android.gms.cast.internal.an r6 = (com.google.android.gms.cast.internal.C143575an) r6     // Catch:{ JSONException -> 0x03cd }
            r6.mo118909e(r9, r7, r15)     // Catch:{ JSONException -> 0x03cd }
            goto L_0x03bc
        L_0x03cc:
            return
        L_0x03cd:
            r0 = move-exception
            com.google.android.gms.cast.internal.ae r3 = r3.f389318b
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r4[r7] = r0
            r4[r5] = r1
            java.lang.String r0 = "Message is malformed (%s); ignoring: %s"
            r3.mo118889g(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.C143500bf.mo118773a(java.lang.String):void");
    }

    /* renamed from: b */
    public final int mo118774b() {
        int i;
        synchronized (this.f389127b) {
            C143919bh.m233964g("Must be called from the main thread.");
            MediaStatus i2 = mo118781i();
            i = i2 != null ? i2.f388704f : 0;
        }
        return i;
    }

    /* renamed from: c */
    public final int mo118775c() {
        int i;
        synchronized (this.f389127b) {
            C143919bh.m233964g("Must be called from the main thread.");
            MediaStatus i2 = mo118781i();
            i = i2 != null ? i2.f388703e : 1;
        }
        return i;
    }

    /* renamed from: d */
    public final long mo118776d() {
        long j;
        synchronized (this.f389127b) {
            C143919bh.m233964g("Must be called from the main thread.");
            C143572ak akVar = this.f389129d;
            MediaInfo h = akVar.mo118895h();
            j = 0;
            if (h != null) {
                MediaStatus mediaStatus = akVar.f389280g;
                if (mediaStatus != null) {
                    Long l = akVar.f389281h;
                    if (l != null) {
                        if (l.equals(4294967296000L)) {
                            if (akVar.f389280g.f388719u != null) {
                                long longValue = l.longValue();
                                MediaStatus mediaStatus2 = akVar.f389280g;
                                if (mediaStatus2 != null) {
                                    MediaLiveSeekableRange mediaLiveSeekableRange = mediaStatus2.f388719u;
                                    if (mediaLiveSeekableRange != null) {
                                        long j2 = mediaLiveSeekableRange.f388654b;
                                        j = !mediaLiveSeekableRange.f388656d ? akVar.mo118892e(1.0d, j2, -1) : j2;
                                    }
                                }
                                j = Math.min(longValue, j);
                            } else if (akVar.mo118894g() >= 0) {
                                j = Math.min(l.longValue(), akVar.mo118894g());
                            }
                        }
                        j = l.longValue();
                    } else if (akVar.f389279f != 0) {
                        double d = mediaStatus.f388702d;
                        long j3 = mediaStatus.f388705g;
                        int i = mediaStatus.f388703e;
                        if (d != C59203do.f157270a) {
                            if (i == 2) {
                                j = akVar.mo118892e(d, j3, h.f388638e);
                            }
                        }
                        j = j3;
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: e */
    public final long mo118777e() {
        long g;
        synchronized (this.f389127b) {
            C143919bh.m233964g("Must be called from the main thread.");
            g = this.f389129d.mo118894g();
        }
        return g;
    }

    /* renamed from: f */
    public final MediaInfo mo118778f() {
        MediaInfo h;
        synchronized (this.f389127b) {
            C143919bh.m233964g("Must be called from the main thread.");
            h = this.f389129d.mo118895h();
        }
        return h;
    }

    /* renamed from: g */
    public final MediaQueueItem mo118779g() {
        C143919bh.m233964g("Must be called from the main thread.");
        MediaStatus i = mo118781i();
        if (i == null) {
            return null;
        }
        return i.mo118436c(i.f388701c);
    }

    /* renamed from: h */
    public final MediaQueueItem mo118780h() {
        C143919bh.m233964g("Must be called from the main thread.");
        MediaStatus i = mo118781i();
        if (i == null) {
            return null;
        }
        return i.mo118436c(i.f388710l);
    }

    /* renamed from: i */
    public final MediaStatus mo118781i() {
        MediaStatus mediaStatus;
        synchronized (this.f389127b) {
            C143919bh.m233964g("Must be called from the main thread.");
            mediaStatus = this.f389129d.f389280g;
        }
        return mediaStatus;
    }

    /* renamed from: j */
    public final C143535v mo118782j() {
        C143535v vVar;
        synchronized (this.f389127b) {
            C143919bh.m233964g("Must be called from the main thread.");
            vVar = this.f389136k;
        }
        return vVar;
    }

    /* renamed from: k */
    public final C143854z mo118783k(C143368az azVar) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (!mo118792t()) {
            return m232974D();
        }
        C143482ao aoVar = new C143482ao(this, azVar);
        mo118765E(aoVar);
        return aoVar;
    }

    /* renamed from: l */
    public final String mo118784l() {
        C143919bh.m233964g("Must be called from the main thread.");
        return this.f389129d.f389319c;
    }

    /* renamed from: m */
    public final void mo118785m() {
        C143603l lVar = this.f389137l;
        if (lVar != null) {
            lVar.mo118488g(mo118784l(), this);
            C143919bh.m233964g("Must be called from the main thread.");
            if (!mo118792t()) {
                m232974D();
            } else {
                mo118765E(new C143470ac(this));
            }
        }
    }

    /* renamed from: n */
    public final void mo118786n(C143484aq aqVar) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (aqVar != null) {
            this.f389132g.add(aqVar);
        }
    }

    /* renamed from: o */
    public final void mo118787o(C143603l lVar) {
        C143603l lVar2 = this.f389137l;
        if (lVar2 != lVar) {
            if (lVar2 != null) {
                C143572ak akVar = this.f389129d;
                akVar.mo118910a();
                akVar.mo118896j();
                this.f389136k.mo118831b();
                lVar2.mo118487f(mo118784l());
                this.f389135j.f389109a = null;
                this.f389128c.removeCallbacksAndMessages((Object) null);
            }
            this.f389137l = lVar;
            if (lVar != null) {
                this.f389135j.f389109a = lVar;
            }
        }
    }

    /* renamed from: p */
    public final void mo118788p() {
        if (this.f389130e != null) {
            f389126a.mo118884b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
            MediaInfo f = mo118778f();
            MediaStatus i = mo118781i();
            SessionState sessionState = null;
            if (!(f == null || i == null)) {
                C143360ar arVar = new C143360ar();
                arVar.f388807a = f;
                arVar.f388810d = mo118776d();
                arVar.f388808b = i.f388720v;
                arVar.mo118511b(i.f388702d);
                arVar.f388811e = i.f388709k;
                arVar.f388812f = i.f388713o;
                sessionState = new SessionState(arVar.mo118510a(), (JSONObject) null);
            }
            if (sessionState != null) {
                this.f389130e.f394698a.mo122508v(sessionState);
                return;
            }
            C146010af afVar = this.f389130e;
            afVar.f394698a.mo122507u(new C143570ai());
        }
    }

    /* renamed from: q */
    public final void mo118789q() {
        C143919bh.m233964g("Must be called from the main thread.");
        int c = mo118775c();
        if (c == 4 || c == 2) {
            mo118766F();
        } else {
            mo118767G();
        }
    }

    /* renamed from: r */
    public final void mo118790r(C143484aq aqVar) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (aqVar != null) {
            this.f389132g.remove(aqVar);
        }
    }

    /* renamed from: s */
    public final void mo118791s(Set set) {
        MediaInfo mediaInfo;
        HashSet<C143497bc> hashSet = new HashSet<>(set);
        if (mo118762A() || mo118798z() || mo118794v() || mo118796x()) {
            for (C143497bc d : hashSet) {
                d.mo6035d(mo118776d(), mo118777e());
            }
        } else if (mo118797y()) {
            MediaQueueItem h = mo118780h();
            if (h != null && (mediaInfo = h.f388690a) != null) {
                for (C143497bc d2 : hashSet) {
                    d2.mo6035d(0, mediaInfo.f388638e);
                }
            }
        } else {
            for (C143497bc d3 : hashSet) {
                d3.mo6035d(0, 0);
            }
        }
    }

    /* renamed from: t */
    public final boolean mo118792t() {
        return this.f389137l != null;
    }

    /* renamed from: u */
    public final boolean mo118793u() {
        C143919bh.m233964g("Must be called from the main thread.");
        return mo118794v() || mo118796x() || mo118762A() || mo118798z() || mo118797y();
    }

    /* renamed from: v */
    public final boolean mo118794v() {
        C143919bh.m233964g("Must be called from the main thread.");
        MediaStatus i = mo118781i();
        return i != null && i.f388703e == 4;
    }

    /* renamed from: w */
    public final boolean mo118795w() {
        C143919bh.m233964g("Must be called from the main thread.");
        MediaInfo f = mo118778f();
        return f != null && f.f388635b == 2;
    }

    /* renamed from: x */
    public final boolean mo118796x() {
        C143919bh.m233964g("Must be called from the main thread.");
        MediaStatus i = mo118781i();
        return i != null && i.f388703e == 5;
    }

    /* renamed from: y */
    public final boolean mo118797y() {
        C143919bh.m233964g("Must be called from the main thread.");
        MediaStatus i = mo118781i();
        return (i == null || i.f388710l == 0) ? false : true;
    }

    /* renamed from: z */
    public final boolean mo118798z() {
        C143919bh.m233964g("Must be called from the main thread.");
        MediaStatus i = mo118781i();
        if (i == null) {
            return false;
        }
        if (i.f388703e != 3) {
            return mo118795w() && mo118774b() == 2;
        }
        return true;
    }
}
