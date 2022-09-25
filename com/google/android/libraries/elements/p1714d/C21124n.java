package com.google.android.libraries.elements.p1714d;

import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p329g.p331b.C6317s;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21262be;
import com.google.android.libraries.elements.interfaces.C21278bu;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1714d.p1719e.p1720a.C20975g;
import com.google.protos.youtube.elements.C66260r;
import com.google.protos.youtube.elements.C66266x;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.youtube.p5283a.p5284a.C68093o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.elements.d.n */
/* compiled from: PG */
public final class C21124n {

    /* renamed from: a */
    public static final /* synthetic */ int f59231a = 0;

    /* renamed from: b */
    private static final String f59232b = "n";

    /* renamed from: c */
    private static final AtomicInteger f59233c = new AtomicInteger(1);

    /* renamed from: a */
    static int m39670a(int i, boolean z, C21259bb bbVar) {
        if (!z) {
            if (i == 2) {
                return -1;
            }
            if (i != 0) {
                bbVar.mo25782a(C66260r.LOG_TYPE_CONFIGURATION_ERROR, "Only snap to start is implemented for vertical lists", C21319z.f59680u, (Throwable) null);
                return LinearLayoutManager.INVALID_OFFSET;
            }
        } else if (i == 1) {
            return Integer.MAX_VALUE;
        } else {
            if (i != 2) {
                return LinearLayoutManager.INVALID_OFFSET;
            }
            return -1;
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    /* renamed from: b */
    public static void m39671b(RecyclerView recyclerView, C21313t tVar, CommandOuterClass$Command commandOuterClass$Command, C21310q qVar, C21256az azVar, C21248ar arVar) {
        C21309p k = C21311r.m40252k();
        C21230a aVar = (C21230a) k;
        aVar.f59560a = recyclerView;
        aVar.f59565f = azVar;
        aVar.f59564e = arVar;
        tVar.mo26124a(commandOuterClass$Command, qVar.mo25826a(k).mo26698a()).mo61453k();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.facebook.litho.g.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.facebook.litho.g.b.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: com.facebook.litho.g.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: com.facebook.litho.g.b.d} */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f9, code lost:
        if (r5 != 0) goto L_0x00fc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facebook.litho.C6407q m39672c(com.facebook.litho.C6411u r21, com.google.android.libraries.elements.interfaces.C21249as r22, com.google.android.libraries.elements.interfaces.C21239ai r23, p5488io.p5490b.p5494b.C69802a r24, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21319z r25, @com.facebook.litho.p323b.C6118b com.youtube.p5283a.p5284a.C68093o r26, @com.facebook.litho.p323b.C6118b java.util.List r27, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21313t r28, com.facebook.litho.p329g.p331b.C6317s r29, java.util.concurrent.atomic.AtomicBoolean r30, com.google.android.libraries.elements.interfaces.C21278bu r31, @com.facebook.litho.p323b.C6118b boolean r32, @com.facebook.litho.p323b.C6118b java.util.concurrent.atomic.AtomicReference r33, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.internal.C21357r r34, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.internal.C21357r r35, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.internal.C21357r r36, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.p1714d.C21125o r37, com.google.android.libraries.elements.interfaces.C21310q r38, com.google.android.libraries.elements.internal.C21340at r39, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21259bb r40, com.google.android.libraries.elements.interfaces.C21308o r41, com.google.android.libraries.elements.interfaces.C21262be r42) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r10 = r25
            r4 = r26
            r5 = r29
            r6 = r33
            r7 = r37
            r11 = r39
            r8 = r40
            r9 = r41
            r12 = r42
            r13 = r38
            if (r7 == 0) goto L_0x0021
            r7.mo26160b(r13, r13)
        L_0x0021:
            com.google.android.libraries.elements.interfaces.az r7 = r25.mo26806h()
            int r14 = r26.mo60240g()
            r15 = 1
            if (r14 != r15) goto L_0x002e
            r14 = 1
            goto L_0x002f
        L_0x002e:
            r14 = 0
        L_0x002f:
            if (r14 == 0) goto L_0x0039
            int r13 = r26.mo60242i()
            if (r13 != r15) goto L_0x0039
            r13 = 1
            goto L_0x003a
        L_0x0039:
            r13 = 0
        L_0x003a:
            r15 = 2
            if (r14 == 0) goto L_0x0045
            int r11 = r26.mo60242i()
            if (r11 != r15) goto L_0x0045
            r11 = 1
            goto L_0x0046
        L_0x0045:
            r11 = 0
        L_0x0046:
            com.youtube.a.a.ag r15 = r26.mo60244k()
            if (r15 == 0) goto L_0x00be
            com.youtube.a.a.ag r16 = r26.mo60244k()
            if (r16 != 0) goto L_0x0053
            goto L_0x00be
        L_0x0053:
            int r17 = r26.mo60242i()
            if (r17 != 0) goto L_0x00be
            int r5 = r16.mo60106i()
            r6 = 405782140(0x182fbe7c, float:2.271439E-24)
            if (r5 != r6) goto L_0x00be
            r5 = 6
            java.nio.ByteBuffer r6 = r15.mo16918f(r5)
            com.youtube.a.a.aj r5 = new com.youtube.a.a.aj
            r5.<init>()
            java.nio.ByteOrder r15 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r15)
            int r15 = r6.position()
            int r15 = r6.getInt(r15)
            int r16 = r6.position()
            int r15 = r15 + r16
            r5.mo16917e(r15, r6)
            int r6 = r5.mo60112g()
            if (r6 <= 0) goto L_0x00b1
            com.facebook.litho.g.b.a r6 = new com.facebook.litho.g.b.a
            r6.<init>()
            int r15 = r5.mo60112g()
            r6.f18588c = r15
            int r15 = r26.mo60240g()
            int r15 = m39677h(r15)
            r6.f18587b = r15
            int r15 = r26.mo60243j()
            int r15 = m39670a(r15, r14, r8)
            r6.f18590e = r15
            int r5 = r5.mo60112g()
            r6.f18589d = r5
            r16 = r7
            r7 = 0
            goto L_0x00da
        L_0x00b1:
            com.google.protos.youtube.elements.r r5 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_CONFIGURATION_ERROR
            java.lang.String r6 = "Span count should be at least 1 for GridCollectionLayout. Provided 0"
            com.google.android.libraries.elements.interfaces.z r15 = com.google.android.libraries.elements.interfaces.C21319z.f59680u
            r16 = r7
            r7 = 0
            r8.mo25782a(r5, r6, r15, r7)
            goto L_0x00c1
        L_0x00be:
            r16 = r7
            r7 = 0
        L_0x00c1:
            com.facebook.litho.g.b.d r6 = new com.facebook.litho.g.b.d
            r6.<init>()
            int r5 = r26.mo60240g()
            int r5 = m39677h(r5)
            r6.f18602b = r5
            int r5 = r26.mo60243j()
            int r5 = m39670a(r5, r14, r8)
            r6.f18603c = r5
        L_0x00da:
            com.google.protos.youtube.elements.df r5 = r25.mo26844E()
            com.google.android.libraries.elements.interfaces.bd r15 = r25.mo26842C()
            if (r15 == 0) goto L_0x00fb
            if (r5 != 0) goto L_0x00e7
            goto L_0x00fb
        L_0x00e7:
            com.google.protos.youtube.elements.dl r5 = r5.f179999b
            if (r5 != 0) goto L_0x00ed
            com.google.protos.youtube.elements.dl r5 = com.google.protos.youtube.elements.C66198dl.f180008b
        L_0x00ed:
            com.google.protos.youtube.elements.dj r5 = r5.f180011a
            if (r5 != 0) goto L_0x00f3
            com.google.protos.youtube.elements.dj r5 = com.google.protos.youtube.elements.C66196dj.f180004b
        L_0x00f3:
            int r5 = r5.f180006a
            int r5 = com.google.protos.youtube.elements.C66195di.m96838a(r5)
            if (r5 != 0) goto L_0x00fc
        L_0x00fb:
            r5 = 1
        L_0x00fc:
            com.facebook.litho.g.b.j r15 = r25.mo26802e()
            if (r15 != 0) goto L_0x0108
            com.facebook.litho.g.b.i r15 = new com.facebook.litho.g.b.i
            r15.<init>()
            goto L_0x0112
        L_0x0108:
            com.facebook.litho.g.b.j r15 = r25.mo26802e()
            com.facebook.litho.g.b.i r7 = new com.facebook.litho.g.b.i
            r7.<init>(r15)
            r15 = r7
        L_0x0112:
            com.google.android.libraries.elements.interfaces.az r7 = r25.mo26806h()
            if (r7 != 0) goto L_0x011a
            r7 = 0
            goto L_0x011e
        L_0x011a:
            com.google.android.libraries.elements.interfaces.bq r7 = r7.mo26723d()
        L_0x011e:
            r18 = r14
            if (r7 == 0) goto L_0x0156
            float r14 = r7.mo26762b()
            r19 = 0
            int r19 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r19 < 0) goto L_0x0142
            r15.f18611a = r14
            com.google.android.libraries.search.rendering.xuikit.d.c.b r14 = r7.mo26768h()
            r15.f18615e = r14
            com.google.android.libraries.search.rendering.xuikit.d.c.d r7 = r7.mo26769i()
            if (r7 == 0) goto L_0x0156
            com.google.android.libraries.elements.internal.ac r14 = new com.google.android.libraries.elements.internal.ac
            r14.<init>(r7)
            r15.f18613c = r14
            goto L_0x0156
        L_0x0142:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Range ratio cannot be negative: "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0156:
            r7 = 1
            if (r13 == 0) goto L_0x015b
            r15.f18612b = r7
        L_0x015b:
            if (r11 == 0) goto L_0x015f
            r15.f18614d = r7
        L_0x015f:
            com.facebook.litho.g.b.k r14 = com.facebook.litho.p329g.p331b.C6311m.m16922b(r21)
            if (r9 != 0) goto L_0x01c2
            com.facebook.litho.g.o r8 = new com.facebook.litho.g.o
            r8.<init>(r0)
            com.google.android.libraries.elements.d.j r8 = new com.google.android.libraries.elements.d.j
            r8.<init>()
            com.google.android.libraries.elements.d.k r7 = new com.google.android.libraries.elements.d.k
            r7.<init>()
            r8.f59209a = r7
            java.util.BitSet r7 = r8.f59210b
            r7.clear()
            com.google.android.libraries.elements.d.k r7 = r8.f59209a
            r7.f59215p = r10
            java.util.BitSet r7 = r8.f59210b
            r20 = r5
            r5 = 3
            r7.set(r5)
            com.google.android.libraries.elements.d.k r5 = r8.f59209a
            r5.f59217r = r1
            java.util.BitSet r1 = r8.f59210b
            r5 = 5
            r1.set(r5)
            com.google.android.libraries.elements.d.k r1 = r8.f59209a
            r1.f59216q = r2
            java.util.BitSet r1 = r8.f59210b
            r2 = 4
            r1.set(r2)
            com.google.android.libraries.elements.d.k r1 = r8.f59209a
            r1.f59214o = r3
            java.util.BitSet r1 = r8.f59210b
            r2 = 2
            r1.set(r2)
            com.google.android.libraries.elements.d.k r1 = r8.f59209a
            r1.f59213n = r4
            java.util.BitSet r1 = r8.f59210b
            r2 = 1
            r1.set(r2)
            com.google.android.libraries.elements.d.k r1 = r8.f59209a
            r2 = r27
            r1.f59212m = r2
            java.util.BitSet r1 = r8.f59210b
            r2 = 0
            r1.set(r2)
            com.google.android.libraries.elements.d.k r1 = r8.mo13289a()
            r0 = r1
            r1 = 0
            goto L_0x022e
        L_0x01c2:
            r20 = r5
            com.facebook.litho.g.o r5 = new com.facebook.litho.g.o
            r5.<init>(r0)
            com.google.android.libraries.elements.d.aw r5 = new com.google.android.libraries.elements.d.aw
            r5.<init>()
            com.google.android.libraries.elements.d.ay r7 = new com.google.android.libraries.elements.d.ay
            r7.<init>()
            r5.f58269a = r7
            java.util.BitSet r7 = r5.f58270b
            r7.clear()
            com.google.android.libraries.elements.d.ay r7 = r5.f58269a
            r7.f58281p = r10
            java.util.BitSet r7 = r5.f58270b
            r0 = 3
            r7.set(r0)
            com.google.android.libraries.elements.d.ay r0 = r5.f58269a
            r0.f58284s = r8
            java.util.BitSet r0 = r5.f58270b
            r7 = 6
            r0.set(r7)
            com.google.android.libraries.elements.d.ay r0 = r5.f58269a
            r0.f58283r = r1
            java.util.BitSet r0 = r5.f58270b
            r1 = 5
            r0.set(r1)
            com.google.android.libraries.elements.d.ay r0 = r5.f58269a
            r0.f58282q = r2
            java.util.BitSet r0 = r5.f58270b
            r1 = 4
            r0.set(r1)
            com.google.android.libraries.elements.d.ay r0 = r5.f58269a
            r0.f58280o = r3
            java.util.BitSet r0 = r5.f58270b
            r1 = 2
            r0.set(r1)
            com.google.android.libraries.elements.d.ay r0 = r5.f58269a
            r0.f58279n = r4
            java.util.BitSet r0 = r5.f58270b
            r1 = 1
            r0.set(r1)
            com.google.android.libraries.elements.d.ay r0 = r5.f58269a
            r0.f58278m = r9
            java.util.BitSet r0 = r5.f58270b
            r1 = 0
            r0.set(r1)
            com.google.android.libraries.elements.d.ay r0 = r5.f58269a
            r0.f58285t = r12
            java.util.BitSet r0 = r5.f58270b
            r2 = 7
            r0.set(r2)
            com.google.android.libraries.elements.d.ay r0 = r5.mo13289a()
        L_0x022e:
            r14.mo13314h(r0)
            com.facebook.litho.g.b.m r0 = r14.f18640a
            r0.f18672c = r1
            if (r16 == 0) goto L_0x0240
            boolean r1 = r16.mo26728i()
            if (r1 == 0) goto L_0x023e
            goto L_0x0240
        L_0x023e:
            r1 = 0
            goto L_0x0241
        L_0x0240:
            r1 = 1
        L_0x0241:
            r0.f18660H = r1
            com.facebook.litho.g.b.j r0 = r15.mo13308a()
            r6.mo13302b(r0)
            com.facebook.litho.g.b.u r0 = r6.mo13301a()
            com.facebook.litho.g.b.m r1 = r14.f18640a
            r1.f18663K = r0
            if (r13 != 0) goto L_0x0259
            if (r11 == 0) goto L_0x0257
            goto L_0x0259
        L_0x0257:
            r0 = 0
            goto L_0x025a
        L_0x0259:
            r0 = 1
        L_0x025a:
            r1.f18671b = r0
            boolean r0 = r25.mo26847H()
            com.facebook.litho.g.b.m r1 = r14.f18640a
            r1.f18655C = r0
            if (r9 == 0) goto L_0x026f
            boolean r0 = r41.mo25857c()
            if (r0 != 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r0 = 0
            goto L_0x0270
        L_0x026f:
            r0 = 1
        L_0x0270:
            r1.f18674e = r0
            r0 = 34
            int r0 = r4.mo16913a(r0)
            if (r0 == 0) goto L_0x0284
            java.nio.ByteBuffer r1 = r4.f24704b
            int r2 = r4.f24703a
            int r0 = r0 + r2
            int r2 = r1.getInt(r0)
            goto L_0x0285
        L_0x0284:
            r2 = 0
        L_0x0285:
            r0 = 1
            if (r2 == r0) goto L_0x028f
            r7 = 2
            if (r2 == r7) goto L_0x028d
            r0 = 0
            goto L_0x0291
        L_0x028d:
            r0 = 1
            goto L_0x0291
        L_0x028f:
            r7 = 2
            r0 = 2
        L_0x0291:
            com.facebook.litho.g.b.m r1 = r14.f18640a
            r1.f18662J = r0
            if (r9 != 0) goto L_0x02a0
            com.facebook.litho.g.b.h r0 = new com.facebook.litho.g.b.h
            r0.<init>()
            com.facebook.litho.g.b.m r1 = r14.f18640a
            r1.f18656D = r0
        L_0x02a0:
            if (r12 == 0) goto L_0x02a9
            com.facebook.litho.cb r0 = com.google.android.libraries.elements.p1714d.C21118h.m39652b(r21)
            r14.mo13425I(r0)
        L_0x02a9:
            r5 = r33
            if (r5 == 0) goto L_0x02b9
            r0 = r31
            r5.set(r0)
            com.facebook.litho.cb r0 = com.google.android.libraries.elements.p1714d.C21118h.m39652b(r21)
            r14.mo13425I(r0)
        L_0x02b9:
            if (r32 == 0) goto L_0x02d8
            r14.mo13438V()
            java.lang.String r0 = f59232b
            java.util.concurrent.atomic.AtomicInteger r1 = f59233c
            int r1 = r1.getAndIncrement()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r14.mo13424H(r0)
        L_0x02d8:
            r0 = r29
            if (r0 == 0) goto L_0x02e0
            com.facebook.litho.g.b.m r1 = r14.f18640a
            r1.f18653A = r0
        L_0x02e0:
            com.youtube.a.a.x r0 = new com.youtube.a.a.x
            r0.<init>()
            r1 = 14
            int r1 = r4.mo16913a(r1)
            if (r1 == 0) goto L_0x02fd
            int r2 = r4.f24703a
            int r1 = r1 + r2
            java.nio.ByteBuffer r2 = r4.f24704b
            int r2 = r2.getInt(r1)
            int r1 = r1 + r2
            java.nio.ByteBuffer r2 = r4.f24704b
            r0.mo16917e(r1, r2)
            goto L_0x02fe
        L_0x02fd:
            r0 = 0
        L_0x02fe:
            if (r0 == 0) goto L_0x03ad
            com.youtube.a.a.w r1 = r0.mo60258g()
            if (r1 == 0) goto L_0x031a
            com.youtube.a.a.w r1 = r0.mo60258g()
            float r1 = r1.mo60256b()
            r14.mo13312f(r1)
            r14.mo13313g(r1)
            r14.mo13315i(r1)
            r14.mo13310d(r1)
        L_0x031a:
            com.youtube.a.a.w r1 = r0.mo60261j()
            if (r1 == 0) goto L_0x032e
            com.youtube.a.a.w r1 = r0.mo60261j()
            float r1 = r1.mo60256b()
            r14.mo13312f(r1)
            r14.mo13313g(r1)
        L_0x032e:
            com.youtube.a.a.w r1 = r0.mo60266o()
            if (r1 == 0) goto L_0x0342
            com.youtube.a.a.w r1 = r0.mo60266o()
            float r1 = r1.mo60256b()
            r14.mo13315i(r1)
            r14.mo13310d(r1)
        L_0x0342:
            com.youtube.a.a.w r1 = r0.mo60265n()
            if (r1 == 0) goto L_0x0353
            com.youtube.a.a.w r1 = r0.mo60265n()
            float r1 = r1.mo60256b()
            r14.mo13315i(r1)
        L_0x0353:
            com.youtube.a.a.w r1 = r0.mo60262k()
            if (r1 == 0) goto L_0x0364
            com.youtube.a.a.w r1 = r0.mo60262k()
            float r1 = r1.mo60256b()
            r14.mo13312f(r1)
        L_0x0364:
            com.youtube.a.a.w r1 = r0.mo60259h()
            if (r1 == 0) goto L_0x0375
            com.youtube.a.a.w r1 = r0.mo60259h()
            float r1 = r1.mo60256b()
            r14.mo13310d(r1)
        L_0x0375:
            com.youtube.a.a.w r1 = r0.mo60263l()
            if (r1 == 0) goto L_0x0386
            com.youtube.a.a.w r1 = r0.mo60263l()
            float r1 = r1.mo60256b()
            r14.mo13313g(r1)
        L_0x0386:
            com.youtube.a.a.w r1 = r0.mo60264m()
            if (r1 == 0) goto L_0x0397
            com.youtube.a.a.w r1 = r0.mo60264m()
            float r1 = r1.mo60256b()
            r14.mo13312f(r1)
        L_0x0397:
            com.youtube.a.a.w r1 = r0.mo60260i()
            if (r1 == 0) goto L_0x03a8
            com.youtube.a.a.w r0 = r0.mo60260i()
            float r0 = r0.mo60256b()
            r14.mo13313g(r0)
        L_0x03a8:
            com.facebook.litho.g.b.m r0 = r14.f18640a
            r1 = 0
            r0.f18673d = r1
        L_0x03ad:
            if (r34 != 0) goto L_0x03bc
            if (r35 != 0) goto L_0x03bc
            if (r36 != 0) goto L_0x03bc
            if (r5 != 0) goto L_0x03bc
            r0 = r20
            r1 = 1
            if (r0 == r1) goto L_0x03ed
            r8 = 2
            goto L_0x03bf
        L_0x03bc:
            r0 = r20
            r8 = r0
        L_0x03bf:
            com.google.android.libraries.elements.d.l r11 = new com.google.android.libraries.elements.d.l
            r0 = r11
            r1 = r34
            r2 = r28
            r3 = r38
            r4 = r25
            r5 = r33
            r6 = r30
            r7 = r36
            r9 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.facebook.litho.g.b.m r0 = r14.f18640a
            java.util.List r0 = r0.f18661I
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            if (r0 != r1) goto L_0x03e6
            com.facebook.litho.g.b.m r0 = r14.f18640a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f18661I = r1
        L_0x03e6:
            com.facebook.litho.g.b.m r0 = r14.f18640a
            java.util.List r0 = r0.f18661I
            r0.add(r11)
        L_0x03ed:
            if (r18 == 0) goto L_0x040d
            android.support.v7.widget.fs r0 = r25.mo26800c()
            if (r0 == 0) goto L_0x03fe
            android.support.v7.widget.fs r0 = r25.mo26800c()
            com.facebook.litho.g.b.m r1 = r14.f18640a
            r1.f18657E = r0
            goto L_0x0415
        L_0x03fe:
            com.google.android.libraries.elements.c.b.a r0 = r25.mo26797A()
            if (r0 == 0) goto L_0x0415
            com.google.android.libraries.elements.c.b.a r0 = r25.mo26797A()
            com.facebook.litho.g.b.m r1 = r14.f18640a
            r1.f18669Q = r0
            goto L_0x0415
        L_0x040d:
            r0 = r39
            if (r0 == 0) goto L_0x0415
            com.facebook.litho.g.b.m r1 = r14.f18640a
            r1.f18657E = r0
        L_0x0415:
            com.facebook.litho.g.b.m r0 = r14.mo13259a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C21124n.m39672c(com.facebook.litho.u, com.google.android.libraries.elements.interfaces.as, com.google.android.libraries.elements.interfaces.ai, io.b.b.a, com.google.android.libraries.elements.interfaces.z, com.youtube.a.a.o, java.util.List, com.google.android.libraries.elements.interfaces.t, com.facebook.litho.g.b.s, java.util.concurrent.atomic.AtomicBoolean, com.google.android.libraries.elements.interfaces.bu, boolean, java.util.concurrent.atomic.AtomicReference, com.google.android.libraries.elements.internal.r, com.google.android.libraries.elements.internal.r, com.google.android.libraries.elements.internal.r, com.google.android.libraries.elements.d.o, com.google.android.libraries.elements.interfaces.q, com.google.android.libraries.elements.internal.at, com.google.android.libraries.elements.interfaces.bb, com.google.android.libraries.elements.interfaces.o, com.google.android.libraries.elements.interfaces.be):com.facebook.litho.q");
    }

    /* renamed from: d */
    static void m39673d(@C6118b String str, @C6118b C20975g gVar, C6317s sVar, AtomicBoolean atomicBoolean) {
        if (!(str == null || sVar == null)) {
            C6317s sVar2 = (C6317s) C20975g.f58795a.put(str, sVar);
            if (sVar2 != null) {
                C20975g.f58796b.remove(sVar2.mo13573a());
            }
            C66266x xVar = (C66266x) C20975g.f58797c.remove(str);
            if (xVar != null) {
                gVar.mo26088d(xVar, (View) null, (View) null);
            }
        }
        atomicBoolean.set(false);
    }

    /* renamed from: e */
    static void m39674e(@C6118b String str, C6317s sVar) {
        C6317s sVar2;
        if (str != null && (sVar2 = (C6317s) C20975g.f58795a.get(str)) != null && sVar2 == sVar) {
            C20975g.f58795a.remove(str);
            C20975g.f58796b.remove(sVar2.mo13573a());
        }
    }

    /* renamed from: f */
    static void m39675f(@C6118b C68093o oVar, @C6118b AtomicReference atomicReference, C21262be beVar, C6317s sVar, AtomicBoolean atomicBoolean) {
        RecyclerView a;
        if (!(atomicReference == null || atomicReference.get() == null || !atomicBoolean.getAndSet(false))) {
            RecyclerView a2 = sVar.mo13573a();
            if (a2 != null) {
                if (oVar.mo60240g() == 1) {
                    a2.getWidth();
                } else {
                    a2.getHeight();
                }
                ((C21278bu) atomicReference.get()).mo26013c(a2);
            } else {
                return;
            }
        }
        if (beVar != null && (a = sVar.mo13573a()) != null) {
            beVar.mo2460d(a);
            a.setTag(R.id.elements_item_touch_helper, beVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m39676g(com.facebook.litho.C6411u r14, @com.facebook.litho.p323b.C6118b java.lang.String r15, @com.facebook.litho.p323b.C6118b p5460g.p5461a.C69464a r16, @com.facebook.litho.p323b.C6118b com.youtube.p5283a.p5284a.C68043af r17, @com.facebook.litho.p323b.C6118b com.youtube.p5283a.p5284a.C68093o r18, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21319z r19, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.p1714d.p1715a.C20784i r20, com.facebook.litho.C6281fx r21, com.facebook.litho.C6281fx r22, com.facebook.litho.C6281fx r23, com.facebook.litho.C6281fx r24, com.facebook.litho.C6281fx r25, com.facebook.litho.C6281fx r26, com.facebook.litho.C6281fx r27, com.facebook.litho.C6281fx r28) {
        /*
            r0 = r15
            r1 = r17
            r2 = r18
            r11 = r19
            r12 = r20
            com.facebook.litho.g.b.s r3 = new com.facebook.litho.g.b.s
            r3.<init>()
            r4 = r21
            r4.f18496a = r3
            com.google.android.libraries.elements.d.m r4 = new com.google.android.libraries.elements.d.m
            r5 = r14
            android.content.Context r5 = r5.f19009b
            r4.<init>(r2, r5, r3)
            r3 = r25
            r3.f18496a = r4
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 0
            r3.<init>(r4)
            r4 = r24
            r4.f18496a = r3
            if (r16 == 0) goto L_0x0034
            java.lang.Object r3 = r16.mo17428b()
            com.google.android.libraries.elements.interfaces.bu r3 = (com.google.android.libraries.elements.interfaces.C21278bu) r3
            r4 = r22
            r4.f18496a = r3
        L_0x0034:
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 1
            r3.<init>(r4)
            r4 = r23
            r4.f18496a = r3
            r3 = 4
            if (r1 == 0) goto L_0x005b
            int r4 = r1.mo16913a(r3)
            if (r4 == 0) goto L_0x005b
            java.nio.ByteBuffer r5 = r1.f24704b
            int r1 = r1.f24703a
            int r4 = r4 + r1
            byte r1 = r5.get(r4)
            if (r1 == 0) goto L_0x005b
            com.google.android.libraries.elements.internal.at r1 = new com.google.android.libraries.elements.internal.at
            r1.<init>()
            r4 = r26
            r4.f18496a = r1
        L_0x005b:
            com.youtube.a.a.m r1 = new com.youtube.a.a.m
            r1.<init>()
            r4 = 38
            int r4 = r2.mo16913a(r4)
            r13 = 0
            if (r4 == 0) goto L_0x0079
            int r5 = r2.f24703a
            int r4 = r4 + r5
            java.nio.ByteBuffer r5 = r2.f24704b
            int r5 = r5.getInt(r4)
            int r4 = r4 + r5
            java.nio.ByteBuffer r5 = r2.f24704b
            r1.mo16917e(r4, r5)
            goto L_0x007a
        L_0x0079:
            r1 = r13
        L_0x007a:
            if (r1 != 0) goto L_0x007f
        L_0x007c:
            r1 = r13
            goto L_0x0154
        L_0x007f:
            com.google.common.base.ax r4 = r12.f58142e
            if (r0 != 0) goto L_0x008f
            com.google.android.libraries.elements.interfaces.bb r0 = r12.f58138a
            com.google.protos.youtube.elements.r r1 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_CONFIGURATION_ERROR
            java.lang.String r3 = "Unique collection key is required"
            com.google.android.libraries.elements.interfaces.z r4 = com.google.android.libraries.elements.interfaces.C21319z.f59680u
            r0.mo25782a(r1, r3, r4, r13)
            goto L_0x007c
        L_0x008f:
            java.nio.ByteBuffer r3 = r1.mo16918f(r3)
            int r4 = r3.remaining()
            byte[] r4 = new byte[r4]
            r3.get(r4)
            g.a.a r3 = r12.f58139b
            java.lang.Object r3 = r3.mo17428b()
            r7 = r3
            com.google.android.libraries.elements.d.a.d r7 = (com.google.android.libraries.elements.p1714d.p1715a.C20779d) r7
            com.google.common.base.ax r3 = r12.f58142e
            com.google.common.base.bk r3 = (com.google.common.base.C58847bk) r3
            java.lang.Object r3 = r3.f156646a
            g.a.a r3 = (p5460g.p5461a.C69464a) r3
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.libraries.elements.interfaces.ByteStore r3 = (com.google.android.libraries.elements.interfaces.ByteStore) r3
            com.youtube.android.libraries.elements.StatusOr r0 = com.google.android.libraries.elements.interfaces.DataSourceDelegate.getDelegate(r4, r7, r3, r15)
            boolean r3 = r0.hasValue
            if (r3 != 0) goto L_0x00cb
            com.google.android.libraries.elements.interfaces.bb r1 = r12.f58138a
            com.google.protos.youtube.elements.r r3 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_CONFIGURATION_ERROR
            io.grpc.Status r0 = r0.status
            io.grpc.StatusException r0 = r0.asException()
            java.lang.String r4 = "Error getting DataSourceDelegate"
            r1.mo25782a(r3, r4, r11, r0)
            goto L_0x007c
        L_0x00cb:
            java.lang.Object r0 = r0.value
            r6 = r0
            com.google.android.libraries.elements.interfaces.DataSourceDelegate r6 = (com.google.android.libraries.elements.interfaces.DataSourceDelegate) r6
            if (r6 != 0) goto L_0x00dc
            com.google.android.libraries.elements.interfaces.bb r0 = r12.f58138a
            com.google.protos.youtube.elements.r r1 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INTERNAL_ERROR
            java.lang.String r3 = "Received null DataSourceDelegate from JNI"
            r0.mo25782a(r1, r3, r11, r13)
            goto L_0x007c
        L_0x00dc:
            com.google.android.libraries.elements.d.a.b r0 = r12.f58140c
            com.youtube.a.a.ba r3 = new com.youtube.a.a.ba
            r3.<init>()
            r4 = 6
            int r4 = r1.mo16913a(r4)
            if (r4 == 0) goto L_0x00fb
            int r5 = r1.f24703a
            int r4 = r4 + r5
            java.nio.ByteBuffer r5 = r1.f24704b
            int r5 = r5.getInt(r4)
            int r4 = r4 + r5
            java.nio.ByteBuffer r5 = r1.f24704b
            r3.mo16917e(r4, r5)
            r8 = r3
            goto L_0x00fc
        L_0x00fb:
            r8 = r13
        L_0x00fc:
            com.youtube.a.a.y r3 = new com.youtube.a.a.y
            r3.<init>()
            r4 = 8
            int r4 = r1.mo16913a(r4)
            if (r4 == 0) goto L_0x011a
            int r5 = r1.f24703a
            int r4 = r4 + r5
            java.nio.ByteBuffer r5 = r1.f24704b
            int r5 = r5.getInt(r4)
            int r4 = r4 + r5
            java.nio.ByteBuffer r5 = r1.f24704b
            r3.mo16917e(r4, r5)
            r9 = r3
            goto L_0x011b
        L_0x011a:
            r9 = r13
        L_0x011b:
            com.youtube.a.a.bd r3 = new com.youtube.a.a.bd
            r3.<init>()
            r4 = 10
            int r4 = r1.mo16913a(r4)
            if (r4 == 0) goto L_0x0139
            int r5 = r1.f24703a
            int r4 = r4 + r5
            java.nio.ByteBuffer r5 = r1.f24704b
            int r5 = r5.getInt(r4)
            int r4 = r4 + r5
            java.nio.ByteBuffer r1 = r1.f24704b
            r3.mo16917e(r4, r1)
            r10 = r3
            goto L_0x013a
        L_0x0139:
            r10 = r13
        L_0x013a:
            com.google.android.libraries.elements.d.a.a r1 = new com.google.android.libraries.elements.d.a.a
            g.a.a r0 = r0.f58131a
            java.lang.Object r0 = r0.mo17428b()
            r4 = r0
            com.google.android.libraries.elements.internal.t r4 = (com.google.android.libraries.elements.internal.C21359t) r4
            r4.getClass()
            r19.getClass()
            r7.getClass()
            r3 = r1
            r5 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x0154:
            if (r1 == 0) goto L_0x017d
            r0 = r27
            r0.f18496a = r1
            io.b.e.a.b r0 = r19.mo26811l()
            if (r0 == 0) goto L_0x0167
            io.b.e.a.b r0 = r19.mo26811l()
            r0.mo61462b(r1)
        L_0x0167:
            boolean r0 = r1.f58126b
            if (r0 == 0) goto L_0x0177
            com.google.android.libraries.elements.d.a.k r13 = new com.google.android.libraries.elements.d.a.k
            com.google.android.libraries.elements.d.a.l r0 = new com.google.android.libraries.elements.d.a.l
            com.google.android.libraries.elements.interfaces.t r3 = r12.f58141d
            r0.<init>(r11, r1, r2, r3)
            r13.<init>(r0)
        L_0x0177:
            if (r13 == 0) goto L_0x017d
            r0 = r28
            r0.f18496a = r13
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C21124n.m39676g(com.facebook.litho.u, java.lang.String, g.a.a, com.youtube.a.a.af, com.youtube.a.a.o, com.google.android.libraries.elements.interfaces.z, com.google.android.libraries.elements.d.a.i, com.facebook.litho.fx, com.facebook.litho.fx, com.facebook.litho.fx, com.facebook.litho.fx, com.facebook.litho.fx, com.facebook.litho.fx, com.facebook.litho.fx, com.facebook.litho.fx):void");
    }

    /* renamed from: h */
    private static int m39677h(int i) {
        return i != 1 ? 1 : 0;
    }
}
