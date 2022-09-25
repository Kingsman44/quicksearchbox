package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import android.text.TextUtils;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2268e.p2287j.C29957h;
import com.google.android.libraries.notifications.p2292g.C30004l;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58801sm;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55572h;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55586v;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.e.j.a.j */
/* compiled from: PG */
public final class C29947j implements C29957h {

    /* renamed from: a */
    private final C29941d f81094a;

    public C29947j(C29941d dVar) {
        this.f81094a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair mo35244a(java.lang.String r26, com.google.android.libraries.notifications.data.C29820k r27, com.google.android.libraries.notifications.data.C29827r r28, boolean r29, com.google.android.libraries.notifications.C30007h r30, com.google.android.libraries.notifications.p2292g.C30004l r31) {
        /*
            r25 = this;
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r25
            r10 = r31
            com.google.android.libraries.notifications.e.j.a.d r11 = r9.f81094a
            java.lang.String r0 = "NotificationBuilderHelper"
            r12 = 2
            r13 = 0
            r14 = 0
            r15 = 1
            if (r8 != 0) goto L_0x002c
            java.lang.String r1 = "Failed validation: Thread is null."
            java.lang.Object[] r2 = new java.lang.Object[r14]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55789a(r0, r1, r2)
            com.google.android.libraries.notifications.e.b.a.a r1 = r11.f81080e
            r2 = 3
            com.google.android.libraries.notifications.e.b.a r1 = r1.mo35160b(r2)
            r1.mo35145j(r7)
            r1.mo35139d(r13)
            r1.mo35136a()
            goto L_0x0056
        L_0x002c:
            com.google.bf.b.a.a.v r1 = r28.mo35052a()
            java.lang.String r1 = r1.f146661b
            boolean r1 = r1.isEmpty()
            r5 = 8
            if (r1 == 0) goto L_0x0073
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.String r2 = r28.mo35063j()
            r1[r14] = r2
            java.lang.String r2 = "Failed validation: Thread [%s] is missing content title."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55789a(r0, r2, r1)
            com.google.android.libraries.notifications.e.b.a.a r1 = r11.f81080e
            com.google.android.libraries.notifications.e.b.a r1 = r1.mo35160b(r5)
            r1.mo35145j(r7)
            r1.mo35139d(r8)
            r1.mo35136a()
        L_0x0056:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r2 = "NULL"
            if (r7 == 0) goto L_0x0061
            java.lang.Long r3 = r27.mo35004d()
            goto L_0x0062
        L_0x0061:
            r3 = r2
        L_0x0062:
            r1[r14] = r3
            if (r8 == 0) goto L_0x006a
            java.lang.String r2 = r28.mo35063j()
        L_0x006a:
            r1[r15] = r2
            java.lang.String r2 = "Payload contain insufficient data to display the notification. Account ID [%s], ThreadId [%s]."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55791c(r0, r2, r1)
            goto L_0x0550
        L_0x0073:
            com.google.bf.b.a.a.v r4 = r28.mo35052a()
            android.content.Context r0 = r11.f81076a
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131170768(0x7f0715d0, float:1.7955904E38)
            int r0 = r0.getDimensionPixelSize(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.protobuf.cq r1 = r4.f146663d
            java.util.List r1 = r11.mo35232c(r7, r1, r0, r0)
            r2.addAll(r1)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x00af
            int r1 = r4.f146660a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00af
            com.google.bf.b.a.a.aj r1 = r4.f146664e
            if (r1 != 0) goto L_0x00a4
            com.google.bf.b.a.a.aj r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55530aj.f146536c
        L_0x00a4:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            java.util.List r0 = r11.mo35232c(r7, r1, r0, r0)
            r2.addAll(r0)
        L_0x00af:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r4.f146660a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0119
            com.google.bf.b.a.a.o r0 = r4.f146667h
            if (r0 != 0) goto L_0x00c0
            com.google.bf.b.a.a.o r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55579o.f146634g
        L_0x00c0:
            com.google.protobuf.cq r3 = r0.f146638c
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0119
            com.google.protobuf.cq r0 = r0.f146638c
            java.util.Iterator r0 = r0.iterator()
        L_0x00ce:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0119
            java.lang.Object r3 = r0.next()
            com.google.bf.b.a.a.aj r3 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55530aj) r3
            java.lang.String r5 = r3.f146538a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0113
            android.content.Context r0 = r11.f81076a
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131170767(0x7f0715cf, float:1.7955902E38)
            float r5 = r0.getDimension(r5)
            r14 = 2131170766(0x7f0715ce, float:1.79559E38)
            float r0 = r0.getDimension(r14)
            java.lang.String r14 = r3.f146538a
            java.lang.String r3 = r3.f146539b
            int r5 = (int) r5
            int r0 = (int) r0
            r17 = r0
            r0 = r11
            r15 = r1
            r1 = r27
            r13 = r2
            r2 = r14
            r14 = 2131170768(0x7f0715d0, float:1.7955904E38)
            r12 = r4
            r4 = r5
            r5 = r17
            java.util.concurrent.Future r0 = r0.mo35233e(r1, r2, r3, r4, r5)
            r15.add(r0)
            goto L_0x011f
        L_0x0113:
            r5 = 8
            r13 = 0
            r14 = 0
            r15 = 1
            goto L_0x00ce
        L_0x0119:
            r15 = r1
            r13 = r2
            r12 = r4
            r14 = 2131170768(0x7f0715d0, float:1.7955904E38)
        L_0x011f:
            android.content.Context r0 = r11.f81076a
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r14)
            int r1 = r12.f146660a
            r1 = r1 & 32
            if (r1 == 0) goto L_0x014e
            com.google.bf.b.a.a.o r1 = r12.f146667h
            if (r1 != 0) goto L_0x0135
            com.google.bf.b.a.a.o r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55579o.f146634g
        L_0x0135:
            int r1 = r1.f146640e
            int r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55578n.m87711a(r1)
            if (r1 != 0) goto L_0x013e
            goto L_0x014e
        L_0x013e:
            r2 = 2
            if (r1 != r2) goto L_0x014e
            com.google.bf.b.a.a.o r1 = r12.f146667h
            if (r1 != 0) goto L_0x0147
            com.google.bf.b.a.a.o r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55579o.f146634g
        L_0x0147:
            com.google.protobuf.cq r1 = r1.f146641f
            java.util.List r0 = r11.mo35232c(r7, r1, r0, r0)
            goto L_0x0152
        L_0x014e:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0152:
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = r30
            com.google.android.libraries.notifications.h r1 = r3.mo35311e(r1)
            java.util.List r14 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55474d(r13, r1)
            java.util.List r5 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55474d(r15, r1)
            java.util.List r4 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55474d(r0, r1)
            int r1 = r14.size()
            int r2 = r13.size()
            if (r1 != r2) goto L_0x0184
            int r1 = r5.size()
            int r2 = r15.size()
            if (r1 != r2) goto L_0x0184
            int r1 = r4.size()
            int r0 = r0.size()
            if (r1 == r0) goto L_0x0195
        L_0x0184:
            com.google.android.libraries.notifications.e.b.a.a r0 = r11.f81080e
            r1 = 12
            com.google.android.libraries.notifications.e.b.a r0 = r0.mo35160b(r1)
            r0.mo35139d(r8)
            r0.mo35145j(r7)
            r0.mo35136a()
        L_0x0195:
            androidx.core.app.z r13 = new androidx.core.app.z
            android.content.Context r0 = r11.f81076a
            r1 = 0
            r13.<init>(r0, r1)
            com.google.android.libraries.notifications.platform.c.f r0 = r11.f81079d
            java.lang.Integer r0 = r0.mo35444e()
            int r0 = r0.intValue()
            android.app.Notification r1 = r13.f5679J
            r1.icon = r0
            java.lang.String r0 = r12.f146661b
            java.lang.CharSequence r0 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55473b(r0)
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r13.f5685e = r0
            java.lang.String r0 = r12.f146662c
            java.lang.CharSequence r0 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55473b(r0)
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r13.f5686f = r0
            int r0 = r12.f146670k
            int r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55572h.m87710a(r0)
            if (r0 != 0) goto L_0x01cc
            r0 = 1
        L_0x01cc:
            int r0 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55475f(r0)
            r13.f5690j = r0
            r0 = 8
            r1 = 1
            r13.mo5015d(r0, r1)
            com.google.bf.b.a.a.v r0 = r28.mo35052a()
            int r1 = r0.f146660a
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x01e6
            java.lang.String r0 = r0.f146679t
            goto L_0x01f6
        L_0x01e6:
            if (r7 == 0) goto L_0x01f5
            com.google.android.libraries.notifications.platform.c.f r0 = r11.f81079d
            boolean r0 = r0.mo35451j()
            if (r0 == 0) goto L_0x01f5
            java.lang.String r0 = r27.mo35009h()
            goto L_0x01f6
        L_0x01f5:
            r0 = 0
        L_0x01f6:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0202
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r13.f5694n = r0
        L_0x0202:
            java.lang.String r0 = r12.f146674o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x020f
            java.lang.String r0 = r12.f146674o
            r13.mo5023l(r0)
        L_0x020f:
            com.google.bf.b.a.a.s r0 = r12.f146669j
            if (r0 != 0) goto L_0x0215
            com.google.bf.b.a.a.s r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55583s.f146644f
        L_0x0215:
            boolean r0 = r0.f146646a
            if (r0 == 0) goto L_0x021e
            r0 = 2
            r1 = 1
            r13.mo5015d(r0, r1)
        L_0x021e:
            if (r29 != 0) goto L_0x0234
            com.google.android.libraries.notifications.platform.c.f r0 = r11.f81079d
            boolean r0 = r0.mo35455n()
            if (r0 == 0) goto L_0x0234
            com.google.bf.b.a.a.s r0 = r12.f146669j
            if (r0 != 0) goto L_0x022e
            com.google.bf.b.a.a.s r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55583s.f146644f
        L_0x022e:
            boolean r0 = r0.f146647b
            if (r0 != 0) goto L_0x0234
            r0 = 2
            goto L_0x023a
        L_0x0234:
            android.app.Notification r0 = r13.f5679J
            r1 = 0
            r0.vibrate = r1
            r0 = 0
        L_0x023a:
            if (r29 != 0) goto L_0x0262
            com.google.android.libraries.notifications.platform.c.f r1 = r11.f81079d
            boolean r1 = r1.mo35454m()
            if (r1 == 0) goto L_0x0262
            com.google.bf.b.a.a.s r1 = r12.f146669j
            if (r1 != 0) goto L_0x024a
            com.google.bf.b.a.a.s r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55583s.f146644f
        L_0x024a:
            boolean r1 = r1.f146648c
            if (r1 != 0) goto L_0x0262
            com.google.android.libraries.notifications.platform.c.f r1 = r11.f81079d
            android.net.Uri r1 = r1.mo35441b()
            if (r1 == 0) goto L_0x0260
            com.google.android.libraries.notifications.platform.c.f r1 = r11.f81079d
            android.net.Uri r1 = r1.mo35441b()
            r13.mo5021j(r1)
            goto L_0x0262
        L_0x0260:
            r0 = r0 | 1
        L_0x0262:
            if (r29 != 0) goto L_0x02b3
            com.google.android.libraries.notifications.platform.c.f r1 = r11.f81079d
            boolean r1 = r1.mo35452k()
            if (r1 == 0) goto L_0x02b3
            com.google.bf.b.a.a.s r1 = r12.f146669j
            if (r1 != 0) goto L_0x0272
            com.google.bf.b.a.a.s r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55583s.f146644f
        L_0x0272:
            boolean r1 = r1.f146649d
            if (r1 != 0) goto L_0x02b3
            com.google.android.libraries.notifications.platform.c.f r1 = r11.f81079d
            java.lang.Integer r1 = r1.mo35446f()
            if (r1 == 0) goto L_0x02b1
            com.google.android.libraries.notifications.platform.c.f r1 = r11.f81079d
            java.lang.Integer r1 = r1.mo35446f()
            int r1 = r1.intValue()
            android.app.Notification r2 = r13.f5679J
            r2.ledARGB = r1
            android.app.Notification r1 = r13.f5679J
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.ledOnMS = r2
            android.app.Notification r1 = r13.f5679J
            r2 = 9000(0x2328, float:1.2612E-41)
            r1.ledOffMS = r2
            android.app.Notification r1 = r13.f5679J
            int r1 = r1.ledOnMS
            if (r1 == 0) goto L_0x02a6
            android.app.Notification r1 = r13.f5679J
            int r1 = r1.ledOffMS
            if (r1 == 0) goto L_0x02a6
            r1 = 1
            goto L_0x02a7
        L_0x02a6:
            r1 = 0
        L_0x02a7:
            android.app.Notification r2 = r13.f5679J
            int r3 = r2.flags
            r3 = r3 & -2
            r1 = r1 | r3
            r2.flags = r1
            goto L_0x02b3
        L_0x02b1:
            r0 = r0 | 4
        L_0x02b3:
            r13.mo5019h(r0)
            com.google.android.libraries.notifications.e.j.g r0 = r11.f81078c
            r0.mo35237d(r13, r8)
            if (r29 == 0) goto L_0x02c0
            r0 = 1
            r13.f5678I = r0
        L_0x02c0:
            int r0 = r12.f146660a
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x02cb
            int r0 = r12.f146675p
            r13.f5670A = r0
            goto L_0x02e9
        L_0x02cb:
            com.google.android.libraries.notifications.platform.c.f r0 = r11.f81079d
            java.lang.Integer r0 = r0.mo35443d()
            if (r0 == 0) goto L_0x02e9
            android.content.Context r0 = r11.f81076a
            android.content.res.Resources r0 = r0.getResources()
            com.google.android.libraries.notifications.platform.c.f r1 = r11.f81079d
            java.lang.Integer r1 = r1.mo35443d()
            int r1 = r1.intValue()
            int r0 = r0.getColor(r1)
            r13.f5670A = r0
        L_0x02e9:
            long r0 = r12.f146665f
            r2 = 0
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x02f9
            android.app.Notification r2 = r13.f5679J
            r18 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r18
            r2.when = r0
        L_0x02f9:
            int r0 = r12.f146660a
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0304
            boolean r0 = r12.f146678s
            r13.f5691k = r0
        L_0x0304:
            java.lang.String r0 = r12.f146676q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0310
            java.lang.String r0 = r12.f146676q
            r13.f5701u = r0
        L_0x0310:
            int r0 = r12.f146660a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0351
            com.google.bf.b.a.a.o r0 = r12.f146667h
            if (r0 != 0) goto L_0x031c
            com.google.bf.b.a.a.o r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55579o.f146634g
        L_0x031c:
            java.lang.String r1 = r0.f146636a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0351
            java.lang.String r1 = r0.f146637b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0351
            androidx.core.app.x r1 = new androidx.core.app.x
            r1.<init>()
            java.lang.String r2 = r0.f146636a
            java.lang.CharSequence r2 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55473b(r2)
            java.lang.CharSequence r2 = androidx.core.app.C1839z.m5037c(r2)
            r1.f5580f = r2
            java.lang.String r0 = r0.f146637b
            java.lang.CharSequence r0 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55473b(r0)
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r1.f5669a = r0
            r13.mo5022k(r1)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x0353
        L_0x0351:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0353:
            r15 = r0
            java.util.List r0 = r28.mo35066m()
            java.util.Iterator r16 = r0.iterator()
        L_0x035c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0404
            java.lang.Object r0 = r16.next()
            r17 = r0
            com.google.android.libraries.notifications.data.o r17 = (com.google.android.libraries.notifications.data.C29824o) r17
            int r0 = r17.mo35032k()
            r1 = 2
            if (r0 != r1) goto L_0x03dd
            com.google.android.libraries.notifications.e.j.a.h r0 = r11.f81077b
            r1 = r26
            r2 = r27
            r3 = r28
            r9 = r4
            r4 = r17
            r18 = r15
            r15 = r5
            r5 = r31
            android.app.PendingIntent r0 = r0.mo35239a(r1, r2, r3, r4, r5)
            java.util.HashSet r20 = new java.util.HashSet
            r20.<init>()
            android.os.Bundle r21 = new android.os.Bundle
            r21.<init>()
            java.lang.String r1 = r17.mo35027g()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x039e
            java.lang.String r1 = r17.mo35028h()
            goto L_0x03a2
        L_0x039e:
            java.lang.String r1 = r17.mo35027g()
        L_0x03a2:
            r22 = r1
            java.lang.String r19 = "com.google.android.libraries.notifications.REPLY_TEXT_KEY"
            r23 = 0
            r24 = 1
            androidx.core.app.ba r1 = androidx.core.app.C1809az.m4976a(r19, r20, r21, r22, r23, r24)
            androidx.core.app.r r2 = new androidx.core.app.r
            int r3 = r17.mo35020a()
            java.lang.String r4 = r17.mo35028h()
            r2.<init>(r3, r4, r0)
            r2.mo5009b(r1)
            androidx.core.app.s r0 = r2.mo5008a()
            r13.mo5017f(r0)
            if (r10 == 0) goto L_0x03fc
            com.google.protobuf.cq r0 = r10.f81218a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03fc
            com.google.protobuf.cq r0 = r10.f81218a
            r1 = 0
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            r13.f5695o = r0
            goto L_0x03fc
        L_0x03dd:
            r9 = r4
            r18 = r15
            r15 = r5
            com.google.android.libraries.notifications.e.j.a.h r0 = r11.f81077b
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r17
            r5 = r31
            android.app.PendingIntent r0 = r0.mo35239a(r1, r2, r3, r4, r5)
            int r1 = r17.mo35020a()
            java.lang.String r2 = r17.mo35028h()
            r13.mo5016e(r1, r2, r0)
        L_0x03fc:
            r4 = r9
            r5 = r15
            r15 = r18
            r9 = r25
            goto L_0x035c
        L_0x0404:
            r9 = r4
            r18 = r15
            r15 = r5
            int r0 = r12.f146660a
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x04b3
            com.google.bf.b.a.a.u r0 = r12.f146671l
            if (r0 != 0) goto L_0x0414
            com.google.bf.b.a.a.u r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55585u.f146652d
        L_0x0414:
            boolean r0 = r0.f146654a
            if (r0 == 0) goto L_0x041d
            r0 = 1
            r13.f5671B = r0
            goto L_0x04b3
        L_0x041d:
            com.google.bf.b.a.a.u r0 = r12.f146671l
            if (r0 != 0) goto L_0x0423
            com.google.bf.b.a.a.u r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55585u.f146652d
        L_0x0423:
            java.lang.String r0 = r0.f146655b
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0430
            java.lang.CharSequence r0 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55473b(r0)
            goto L_0x0440
        L_0x0430:
            android.content.Context r0 = r11.f81076a
            com.google.android.libraries.notifications.platform.c.f r1 = r11.f81079d
            java.lang.Integer r1 = r1.mo35442c()
            int r1 = r1.intValue()
            java.lang.String r0 = r0.getString(r1)
        L_0x0440:
            com.google.bf.b.a.a.u r1 = r12.f146671l
            if (r1 != 0) goto L_0x0446
            com.google.bf.b.a.a.u r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55585u.f146652d
        L_0x0446:
            java.lang.String r1 = r1.f146656c
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0453
            java.lang.CharSequence r1 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55473b(r1)
            goto L_0x0461
        L_0x0453:
            android.content.Context r1 = r11.f81076a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131951704(0x7f130058, float:1.953983E38)
            r3 = 1
            java.lang.String r1 = r1.getQuantityString(r2, r3)
        L_0x0461:
            androidx.core.app.z r2 = new androidx.core.app.z
            android.content.Context r3 = r11.f81076a
            r4 = 0
            r2.<init>(r3, r4)
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r2.f5685e = r0
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r1)
            r2.f5686f = r0
            com.google.android.libraries.notifications.platform.c.f r0 = r11.f81079d
            java.lang.Integer r0 = r0.mo35444e()
            int r0 = r0.intValue()
            android.app.Notification r1 = r2.f5679J
            r1.icon = r0
            if (r7 == 0) goto L_0x048f
            java.lang.String r0 = r27.mo35009h()
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r2.f5694n = r0
        L_0x048f:
            com.google.android.libraries.notifications.platform.c.f r0 = r11.f81079d
            java.lang.Integer r0 = r0.mo35443d()
            if (r0 == 0) goto L_0x04ad
            android.content.Context r0 = r11.f81076a
            android.content.res.Resources r0 = r0.getResources()
            com.google.android.libraries.notifications.platform.c.f r1 = r11.f81079d
            java.lang.Integer r1 = r1.mo35443d()
            int r1 = r1.intValue()
            int r0 = r0.getColor(r1)
            r2.f5670A = r0
        L_0x04ad:
            android.app.Notification r0 = r2.mo5013a()
            r13.f5672C = r0
        L_0x04b3:
            java.lang.String r0 = r12.f146668i
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04bf
            java.lang.String r0 = r12.f146668i
            r13.f5705y = r0
        L_0x04bf:
            android.graphics.Bitmap r0 = r11.mo35231a(r12, r14)
            if (r0 == 0) goto L_0x04c7
            r13.f5688h = r0
        L_0x04c7:
            r0 = 0
            java.lang.Object r1 = com.google.common.p4522b.C58557jl.m90130k(r15, r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x051e
            int r0 = r12.f146660a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x051e
            com.google.bf.b.a.a.o r0 = r12.f146667h
            if (r0 != 0) goto L_0x04dc
            com.google.bf.b.a.a.o r0 = com.google.p4160bf.p4164b.p4165a.p4166a.C55579o.f146634g
        L_0x04dc:
            androidx.core.app.w r2 = new androidx.core.app.w
            r2.<init>()
            r2.mo5012e(r1)
            int r1 = r0.f146640e
            int r1 = com.google.p4160bf.p4164b.p4165a.p4166a.C55578n.m87711a(r1)
            if (r1 != 0) goto L_0x04ed
            r1 = 1
        L_0x04ed:
            int r1 = r1 + -1
            r3 = 1
            if (r1 == r3) goto L_0x04fb
            r3 = 2
            if (r1 == r3) goto L_0x04f6
            goto L_0x0502
        L_0x04f6:
            r1 = 0
            r2.mo5011d(r1)
            goto L_0x0502
        L_0x04fb:
            android.graphics.Bitmap r1 = r11.mo35231a(r12, r9)
            r2.mo5011d(r1)
        L_0x0502:
            java.lang.String r1 = r0.f146636a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0516
            java.lang.String r0 = r0.f146636a
            java.lang.CharSequence r0 = com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.m55473b(r0)
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r2.f5580f = r0
        L_0x0516:
            r13.mo5022k(r2)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0520
        L_0x051e:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0520:
            com.google.android.libraries.notifications.e.j.a.h r1 = r11.f81077b
            r2 = 1
            com.google.android.libraries.notifications.data.r[] r3 = new com.google.android.libraries.notifications.data.C29827r[r2]
            r4 = 0
            r3[r4] = r8
            java.util.List r3 = java.util.Arrays.asList(r3)
            android.app.PendingIntent r1 = r1.mo35240b(r6, r7, r3, r10)
            r13.f5687g = r1
            com.google.android.libraries.notifications.e.j.a.h r1 = r11.f81077b
            com.google.android.libraries.notifications.data.r[] r2 = new com.google.android.libraries.notifications.data.C29827r[r2]
            r2[r4] = r8
            java.util.List r2 = java.util.Arrays.asList(r2)
            android.app.PendingIntent r1 = r1.mo35241c(r6, r7, r2)
            android.app.Notification r2 = r13.f5679J
            r2.deleteIntent = r1
            android.util.Pair r1 = new android.util.Pair
            r2 = r18
            com.google.common.base.ax r0 = r0.mo56105a(r2)
            r1.<init>(r13, r0)
            r13 = r1
        L_0x0550:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29947j.mo35244a(java.lang.String, com.google.android.libraries.notifications.data.k, com.google.android.libraries.notifications.data.r, boolean, com.google.android.libraries.notifications.h, com.google.android.libraries.notifications.g.l):android.util.Pair");
    }

    /* renamed from: b */
    public final C1839z mo35245b(String str, C29820k kVar, List list, C30004l lVar) {
        String str2;
        C29941d dVar = this.f81094a;
        C58838bb.m90868c(list != null);
        C58838bb.m90868c(!list.isEmpty());
        C1839z zVar = new C1839z(dVar.f81076a, (String) null);
        zVar.f5678I = 2;
        zVar.f5679J.icon = dVar.f81079d.mo35444e().intValue();
        int a = C55572h.m87710a(((C29827r) Collections.max(list, C29940c.f81075a)).mo35052a().f146670k);
        if (a == 0) {
            a = 1;
        }
        zVar.f5690j = C29941d.m55475f(a);
        HashSet hashSet = new HashSet();
        C58801sm G = ((C58485gu) list).listIterator(0);
        int i = 0;
        while (G.hasNext()) {
            C55586v a2 = ((C29827r) G.next()).mo35052a();
            if ((a2.f146660a & C89885b.S3REQUEST_VALUE) != 0) {
                hashSet.add(a2.f146679t);
            } else {
                i++;
            }
        }
        if (hashSet.size() == 1 && i == 0) {
            str2 = (String) hashSet.iterator().next();
        } else {
            str2 = (kVar == null || !dVar.f81079d.mo35451j()) ? null : kVar.mo35009h();
        }
        if (!TextUtils.isEmpty(str2)) {
            zVar.f5694n = C1839z.m5037c(str2);
        }
        if (dVar.f81079d.mo35443d() != null) {
            zVar.f5670A = dVar.f81076a.getResources().getColor(dVar.f81079d.mo35443d().intValue());
        }
        dVar.f81078c.mo35237d(zVar, (C29827r) list.get(0));
        int i2 = ((C58724pq) list).f156474d;
        String string = dVar.f81076a.getString(dVar.f81079d.mo35442c().intValue());
        String quantityString = dVar.f81076a.getResources().getQuantityString(R.plurals.public_notification_text, i2, new Object[]{Integer.valueOf(i2)});
        C1839z zVar2 = new C1839z(dVar.f81076a, (String) null);
        zVar2.f5685e = C1839z.m5037c(string);
        zVar2.f5686f = C1839z.m5037c(quantityString);
        zVar2.f5679J.icon = dVar.f81079d.mo35444e().intValue();
        if (kVar != null) {
            zVar2.f5694n = C1839z.m5037c(kVar.mo35009h());
        }
        if (dVar.f81079d.mo35443d() != null) {
            zVar2.f5670A = dVar.f81076a.getResources().getColor(dVar.f81079d.mo35443d().intValue());
        }
        zVar.f5672C = zVar2.mo5013a();
        zVar.f5687g = dVar.f81077b.mo35240b(str, kVar, list, lVar);
        zVar.f5679J.deleteIntent = dVar.f81077b.mo35241c(str, kVar, list);
        return zVar;
    }
}
