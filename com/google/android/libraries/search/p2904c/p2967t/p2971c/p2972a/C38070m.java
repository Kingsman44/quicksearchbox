package com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129709f;
import com.google.android.libraries.search.p2904c.C37508do;
import com.google.android.libraries.search.p2904c.C37510dq;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2941l.C37823d;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.p2950a.C37890a;
import com.google.android.libraries.search.p2904c.p2964r.C37957a;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38057a;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38072b;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38078c;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38080d;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38082f;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38084h;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38086j;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38087k;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38088l;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38089m;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38090n;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38091o;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38093q;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38094r;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.p2973b.C38074b;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.p2973b.C38077e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.t.c.a.m */
/* compiled from: PG */
public final class C38070m implements C38087k, C38077e {

    /* renamed from: a */
    public static final C59071e f100861a = C59071e.m91331h();

    /* renamed from: b */
    public final AudioManager f100862b;

    /* renamed from: c */
    public PhoneStateListener f100863c;

    /* renamed from: d */
    public C38059b f100864d;

    /* renamed from: e */
    public final TelephonyManager f100865e;

    /* renamed from: f */
    public final C60836bq f100866f = new C60836bq();

    /* renamed from: g */
    public final Map f100867g = new LinkedHashMap();

    /* renamed from: h */
    public final Set f100868h = new LinkedHashSet();

    /* renamed from: i */
    public boolean f100869i;

    /* renamed from: j */
    public List f100870j;

    /* renamed from: k */
    public List f100871k;

    /* renamed from: l */
    private final C37957a f100872l;

    /* renamed from: m */
    private final Context f100873m;

    /* renamed from: n */
    private final Executor f100874n;

    /* renamed from: o */
    private final C71422aw f100875o;

    /* renamed from: p */
    private final C69585o f100876p;

    /* renamed from: q */
    private final C58833ax f100877q;

    /* renamed from: r */
    private final C37890a f100878r;

    public C38070m(AudioManager audioManager, C37957a aVar, C37890a aVar2, Context context, Executor executor, C71422aw awVar, C69585o oVar, C58833ax axVar) {
        C69664n.m101061g(audioManager, "audioManager");
        C69664n.m101061g(aVar, "audioSessionIdStore");
        C69664n.m101061g(aVar2, "tokenGenerator");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "mainContext");
        this.f100862b = audioManager;
        this.f100872l = aVar;
        this.f100878r = aVar2;
        this.f100873m = context;
        this.f100874n = executor;
        this.f100875o = awVar;
        this.f100876p = oVar;
        this.f100877q = axVar;
        this.f100865e = (TelephonyManager) context.getSystemService("phone");
        C69496am amVar = C69496am.f185918a;
        this.f100870j = amVar;
        this.f100871k = amVar;
    }

    /* renamed from: a */
    public final void mo41230a(C129709f fVar) {
        C69664n.m101061g(fVar, "listener");
        C59052c cVar = (C59052c) f100861a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
        String a = C37331f.m66337a(fVar);
        int size = this.f100868h.size();
        cVar.mo56379ah(new C59094n(52959));
        cVar.mo56352E("#audio# unregister mic state listener (%s), current count = %d", a, size);
        mo41237h(this.f100866f, "unregister mic state listener failed", new C38068k(this, fVar, (C69577g) null));
    }

    /* renamed from: b */
    public final void mo41231b(C129709f fVar) {
        C69664n.m101061g(fVar, "listener");
        C59052c cVar = (C59052c) f100861a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
        String a = C37331f.m66337a(fVar);
        Integer valueOf = Integer.valueOf(this.f100868h.size());
        cVar.mo56379ah(new C59094n(52957));
        cVar.mo56359L("#audio# register mic state listener(%s), current total(%d), sendCurrentState(%b)", a, valueOf, false);
        mo41237h(this.f100866f, "register mic state listener failed", new C38065h(this, fVar, (C69577g) null));
    }

    /* renamed from: c */
    public final long mo41232c() {
        return this.f100878r.f100473a.incrementAndGet();
    }

    /* renamed from: d */
    public final C38089m mo41233d() {
        C37561eb ebVar;
        ArrayList arrayList = new ArrayList();
        for (C38074b bVar : this.f100870j) {
            C38057a aVar = (C38057a) C38072b.f100882e.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C38084h a = C69664n.m101061g(aVar, "builder");
            C38086j a2 = C38086j.m67233a(bVar.f100893d);
            if (a2 == null) {
                a2 = C38086j.CLIENT_TYPE_UNKNOWN;
            }
            C69664n.m101060f(a2, "partialUpdate.clientType");
            a.mo41250b(a2);
            if ((bVar.f100890a & 16) != 0) {
                int i = bVar.f100895f;
                C38057a aVar2 = a.f100907a;
                aVar2.copyOnWrite();
                C38072b bVar2 = (C38072b) aVar2.instance;
                bVar2.f100884a |= 4;
                bVar2.f100887d = i;
            }
            if (bVar.f100891b == 2) {
                ebVar = (C37561eb) bVar.f100892c;
            } else {
                ebVar = C37561eb.f99800c;
            }
            C69664n.m101060f(ebVar, "partialUpdate.openStatus");
            a.mo41251c(ebVar);
            arrayList.add(a.mo41249a());
        }
        C69540x.m100811r(arrayList, this.f100871k);
        if (this.f100869i) {
            C38057a aVar3 = (C38057a) C38072b.f100882e.createBuilder();
            C69664n.m101060f(aVar3, "newBuilder()");
            C38084h a3 = C69664n.m101061g(aVar3, "builder");
            a3.mo41250b(C38086j.CLIENT_TYPE_TELEPHONY_CALL);
            C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
            C69664n.m101060f(eaVar, "newBuilder()");
            C37510dq a4 = C69664n.m101061g(eaVar, "builder");
            a4.mo40998c(C37563ed.OPENED);
            a3.mo41251c(a4.mo40996a());
            arrayList.add(a3.mo41249a());
        }
        C38088l lVar = (C38088l) C38089m.f100917b.createBuilder();
        C69664n.m101060f(lVar, "newBuilder()");
        C69664n.m101061g(lVar, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C38089m) lVar.instance).f100919a);
        C69664n.m101060f(unmodifiableList, "_builder.getUpdatesList()");
        new C62883b(unmodifiableList);
        lVar.copyOnWrite();
        C38089m mVar = (C38089m) lVar.instance;
        C62971cq cqVar = mVar.f100919a;
        if (!cqVar.mo58948c()) {
            mVar.f100919a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) mVar.f100919a);
        C62942bv build = lVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C38089m) build;
    }

    /* renamed from: e */
    public final C38091o mo41234e(List list) {
        C38086j jVar;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) next;
            if (audioRecordingConfiguration.getClientAudioSource() != 1999 && !this.f100872l.mo41167b(audioRecordingConfiguration.getClientAudioSessionId())) {
                arrayList.add(next);
            }
        }
        int b = C69505av.m100860b(C69540x.m100804k(arrayList, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (Object next2 : arrayList) {
            linkedHashMap.put(Integer.valueOf(((AudioRecordingConfiguration) next2).getClientAudioSessionId()), next2);
        }
        Map r = C69505av.m100876r(linkedHashMap);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C38072b bVar : this.f100871k) {
            if (!r.containsKey(Integer.valueOf(bVar.f100887d))) {
                C38078c cVar = (C38078c) C38080d.f100899f.createBuilder();
                C69664n.m101060f(cVar, "newBuilder()");
                C38082f a = C69664n.m101061g(cVar, "builder");
                C38086j a2 = C38086j.m67233a(bVar.f100885b);
                if (a2 == null) {
                    a2 = C38086j.CLIENT_TYPE_UNKNOWN;
                }
                C69664n.m101060f(a2, "clientUpdate.clientType");
                a.mo41246b(a2);
                int i = bVar.f100887d;
                C38078c cVar2 = a.f100906a;
                cVar2.copyOnWrite();
                C38080d dVar = (C38080d) cVar2.instance;
                dVar.f100901a |= 8;
                dVar.f100905e = i;
                C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
                C69664n.m101060f(dtVar, "newBuilder()");
                C37508do a3 = C69664n.m101061g(dtVar, "builder");
                a3.mo40995c(C37516dw.CLOSED);
                a.mo41247c(a3.mo40993a());
                arrayList3.add(a.mo41245a());
            } else {
                arrayList2.add(bVar);
            }
            r.remove(Integer.valueOf(bVar.f100887d));
        }
        for (AudioRecordingConfiguration audioRecordingConfiguration2 : r.values()) {
            if (((C38094r) ((C58847bk) this.f100877q).f156646a).mo41239a(audioRecordingConfiguration2)) {
                jVar = C38086j.CLIENT_TYPE_PLATFORM_EXTERNAL;
            } else {
                jVar = C38086j.CLIENT_TYPE_EXTERNAL;
            }
            C38057a aVar = (C38057a) C38072b.f100882e.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C38084h a4 = C69664n.m101061g(aVar, "builder");
            a4.mo41250b(jVar);
            int clientAudioSessionId = audioRecordingConfiguration2.getClientAudioSessionId();
            C38057a aVar2 = a4.f100907a;
            aVar2.copyOnWrite();
            C38072b bVar2 = (C38072b) aVar2.instance;
            bVar2.f100884a |= 4;
            bVar2.f100887d = clientAudioSessionId;
            C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
            C69664n.m101060f(eaVar, "newBuilder()");
            C37510dq a5 = C69664n.m101061g(eaVar, "builder");
            a5.mo40998c(C37563ed.OPENED);
            a4.mo41251c(a5.mo40996a());
            arrayList2.add(a4.mo41249a());
            C38078c cVar3 = (C38078c) C38080d.f100899f.createBuilder();
            C69664n.m101060f(cVar3, "newBuilder()");
            C38082f a6 = C69664n.m101061g(cVar3, "builder");
            a6.mo41246b(jVar);
            int clientAudioSessionId2 = audioRecordingConfiguration2.getClientAudioSessionId();
            C38078c cVar4 = a6.f100906a;
            cVar4.copyOnWrite();
            C38080d dVar2 = (C38080d) cVar4.instance;
            dVar2.f100901a |= 8;
            dVar2.f100905e = clientAudioSessionId2;
            C37560ea eaVar2 = (C37560ea) C37561eb.f99800c.createBuilder();
            C69664n.m101060f(eaVar2, "newBuilder()");
            C37510dq a7 = C69664n.m101061g(eaVar2, "builder");
            a7.mo40998c(C37563ed.OPENED);
            a6.mo41248d(a7.mo40996a());
            arrayList3.add(a6.mo41245a());
        }
        this.f100871k = C69540x.m100837S(arrayList2, new C38062e());
        C38090n nVar = (C38090n) C38091o.f100920b.createBuilder();
        C69664n.m101060f(nVar, "newBuilder()");
        C38093q a8 = C69664n.m101061g(nVar, "builder");
        a8.mo41256c();
        List S = C69540x.m100837S(arrayList3, new C38063f());
        C69664n.m101061g(S, "values");
        C38090n nVar2 = a8.f100923a;
        nVar2.copyOnWrite();
        C38091o oVar = (C38091o) nVar2.instance;
        oVar.mo41253a();
        C62947c.addAll((Iterable) S, (List) oVar.f100922a);
        return a8.mo41254a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo41235f(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a.C38066i
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.c.t.c.a.i r0 = (com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a.C38066i) r0
            int r1 = r0.f100855e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f100855e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.c.t.c.a.i r0 = new com.google.android.libraries.search.c.t.c.a.i
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f100853c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f100855e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r1 = r0.f100852b
            java.lang.Object r0 = r0.f100851a
            p5462h.C69714l.m101134b(r6)     // Catch:{ all -> 0x002c }
            goto L_0x004e
        L_0x002c:
            r6 = move-exception
            goto L_0x0068
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            p5462h.C69714l.m101134b(r6)
            h.c.o r6 = r5.f100876p     // Catch:{ all -> 0x0066 }
            com.google.android.libraries.search.c.t.c.a.j r2 = new com.google.android.libraries.search.c.t.c.a.j     // Catch:{ all -> 0x0066 }
            r2.<init>(r5, r4)     // Catch:{ all -> 0x0066 }
            r0.f100851a = r5     // Catch:{ all -> 0x0066 }
            r0.f100852b = r5     // Catch:{ all -> 0x0066 }
            r0.f100855e = r3     // Catch:{ all -> 0x0066 }
            java.lang.Object r6 = kotlinx.coroutines.C71803m.m105040a(r6, r2, r0)     // Catch:{ all -> 0x0066 }
            if (r6 == r1) goto L_0x0065
            r0 = r5
            r1 = r0
        L_0x004e:
            com.google.android.libraries.search.c.t.c.a.d r6 = (com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a.C38061d) r6     // Catch:{ all -> 0x002c }
            r2 = r1
            com.google.android.libraries.search.c.t.c.a.m r2 = (com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a.C38070m) r2     // Catch:{ all -> 0x002c }
            r2.f100863c = r6     // Catch:{ all -> 0x002c }
            com.google.android.libraries.search.c.t.c.a.m r1 = (com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a.C38070m) r1     // Catch:{ all -> 0x002c }
            android.telephony.TelephonyManager r1 = r1.f100865e     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0063
            r2 = 32
            r1.listen(r6, r2)     // Catch:{ all -> 0x002c }
            h.q r6 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x002c }
            goto L_0x006c
        L_0x0063:
            r6 = r4
            goto L_0x006c
        L_0x0065:
            return r1
        L_0x0066:
            r6 = move-exception
            r0 = r5
        L_0x0068:
            java.lang.Object r6 = p5462h.C69714l.m101133a(r6)
        L_0x006c:
            java.lang.Throwable r6 = p5462h.C69702k.m101124a(r6)
            if (r6 == 0) goto L_0x0095
            com.google.common.f.e r6 = f100861a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "ALT.MicStateReporter"
            r6.mo56378ag(r1, r2)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 52955(0xcedb, float:7.4206E-41)
            r1.<init>(r2)
            r6.mo56379ah(r1)
            java.lang.String r1 = "#audio# skip registering phone state listener, no permissions?"
            r6.mo56386p(r1)
            com.google.android.libraries.search.c.t.c.a.m r0 = (com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a.C38070m) r0
            r0.f100863c = r4
        L_0x0095:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2967t.p2971c.p2972a.C38070m.mo41235f(h.c.g):java.lang.Object");
    }

    /* renamed from: g */
    public final void mo41236g(C38089m mVar, C38091o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        for (C129709f fVar : this.f100868h) {
            Map map = this.f100867g;
            Object obj = map.get(fVar);
            if (obj == null) {
                obj = new C60836bq();
                map.put(fVar, obj);
            }
            mo41237h((C60836bq) obj, "failed to notify mic state listener", new C38064g(fVar, mVar, oVar, (C69577g) null));
        }
    }

    /* renamed from: h */
    public final void mo41237h(C60836bq bqVar, String str, C69626l lVar) {
        Executor executor = this.f100874n;
        C71422aw awVar = this.f100875o;
        C69664n.m101061g(executor, "executor");
        C69664n.m101061g(awVar, "coroutineScope");
        C46459k.m82829b(bqVar.mo57305b(new C37823d(awVar, lVar), executor), "%s", str);
    }

    /* renamed from: i */
    public final void mo41238i(C38074b bVar) {
        C69664n.m101061g(bVar, "partialUpdate");
        C58976aa aaVar = C58975e.f156826a;
        if ((bVar.f100890a & 8) != 0) {
            mo41237h(this.f100866f, "failed to process partial update", new C38069l(this, bVar, (C69577g) null));
            return;
        }
        C59052c cVar = (C59052c) f100861a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "ALT.MicStateReporter");
        cVar.mo56379ah(new C59094n(52962));
        cVar.mo56386p("#audio# skip partial update as no updateId present");
    }
}
