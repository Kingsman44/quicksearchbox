package com.google.android.apps.gsa.search.shared.actions;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55158i;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55212k;
import com.google.p4152bb.p4153a.C55239l;
import com.google.p4152bb.p4153a.C55266m;
import com.google.p4152bb.p4153a.C55293n;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.m */
/* compiled from: PG */
public final class C87425m {

    /* renamed from: a */
    private final PackageManager f236096a;

    /* renamed from: b */
    private final Context f236097b;

    /* renamed from: c */
    private final boolean f236098c;

    public C87425m(PackageManager packageManager, Context context, boolean z) {
        this.f236096a = packageManager;
        this.f236097b = context;
        this.f236098c = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle m141598b(java.util.List r16, com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l r17, com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m r18) {
        /*
            r1 = r17
            r0 = r18
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            boolean r3 = r16.isEmpty()
            if (r3 == 0) goto L_0x0010
            return r2
        L_0x0010:
            java.util.Iterator r3 = r16.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02da
            java.lang.Object r4 = r3.next()
            com.google.bb.a.f r4 = (com.google.p4152bb.p4153a.C55077f) r4
            int r5 = r4.f144893a
            r6 = r5 & 1
            r7 = 0
            if (r6 == 0) goto L_0x02ce
            int r6 = r4.f144895c
            int r8 = com.google.p4152bb.p4153a.C55050e.m87569a(r6)
            if (r8 != 0) goto L_0x0030
            goto L_0x0050
        L_0x0030:
            r9 = 13
            if (r8 != r9) goto L_0x0050
            com.google.bb.a.n r5 = r4.f144899g
            if (r5 != 0) goto L_0x003a
            com.google.bb.a.n r5 = com.google.p4152bb.p4153a.C55293n.f145650k
        L_0x003a:
            android.content.Intent r5 = m141600d(r5, r1, r0)
            if (r5 != 0) goto L_0x004a
            com.google.android.apps.gsa.search.shared.actions.modular.f r0 = r17.mo81210Q()
            java.lang.String r1 = "Nested intent not set."
            r0.mo81398b(r1)
            return r7
        L_0x004a:
            java.lang.String r4 = r4.f144894b
            r2.putParcelable(r4, r5)
            goto L_0x0014
        L_0x0050:
            int r6 = com.google.p4152bb.p4153a.C55050e.m87569a(r6)
            if (r6 != 0) goto L_0x0057
            goto L_0x006d
        L_0x0057:
            r8 = 10
            if (r6 != r8) goto L_0x006d
            com.google.bb.a.b r5 = r4.f144897e
            if (r5 != 0) goto L_0x0061
            com.google.bb.a.b r5 = com.google.p4152bb.p4153a.C54969b.f144589b
        L_0x0061:
            com.google.protobuf.cq r5 = r5.f144591a
            android.os.Bundle r5 = m141598b(r5, r1, r0)
            java.lang.String r4 = r4.f144894b
            r2.putBundle(r4, r5)
            goto L_0x0014
        L_0x006d:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x02c2
            com.google.bb.a.he r5 = r4.f144896d
            if (r5 != 0) goto L_0x0077
            com.google.bb.a.he r5 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x0077:
            com.google.protobuf.cq r5 = r5.f145138g
            boolean r6 = r1 instanceof com.google.android.apps.gsa.search.shared.actions.modular.ModularAction
            r8 = 1
            if (r6 == 0) goto L_0x00aa
            r6 = r1
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r6 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r6
            java.util.Iterator r5 = r5.iterator()
        L_0x0085:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00aa
            java.lang.Object r9 = r5.next()
            com.google.bb.a.hc r9 = (com.google.p4152bb.p4153a.C55134hc) r9
            int r10 = r9.f145121a
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0085
            int r9 = r9.f145122b
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument r9 = r6.mo81211R(r9)
            boolean r10 = r9 instanceof com.google.android.apps.gsa.search.shared.actions.modular.arguments.AmbiguousArgument
            if (r10 == 0) goto L_0x0085
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.AmbiguousArgument r9 = (com.google.android.apps.gsa.search.shared.actions.modular.arguments.AmbiguousArgument) r9
            boolean r9 = r9.mo81260hB()
            if (r9 == 0) goto L_0x0085
            goto L_0x0014
        L_0x00aa:
            r5 = 3
            com.google.bb.a.he r6 = r4.f144896d     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r6 != 0) goto L_0x00b1
            com.google.bb.a.he r6 = com.google.p4152bb.p4153a.C55136he.f145130j     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x00b1:
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r6 = r0.mo81378a(r6, r1, r8)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            boolean r9 = r6.mo81247f()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r9 == 0) goto L_0x0014
            int r9 = r4.f144895c     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r9 = com.google.p4152bb.p4153a.C55050e.m87569a(r9)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r9 != 0) goto L_0x00c4
            r9 = 1
        L_0x00c4:
            int r9 = r9 + -1
            r10 = 11
            java.lang.String r11 = ")"
            if (r9 == r10) goto L_0x0272
            r14 = 0
            r10 = 5
            r7 = 7
            r12 = 4
            r13 = 0
            switch(r9) {
                case 1: goto L_0x0267;
                case 2: goto L_0x025c;
                case 3: goto L_0x0251;
                case 4: goto L_0x0203;
                case 5: goto L_0x01b0;
                case 6: goto L_0x0179;
                case 7: goto L_0x0128;
                case 8: goto L_0x00fb;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            com.google.android.apps.gsa.search.shared.actions.modular.f r6 = r17.mo81210Q()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r7 = r4.f144895c     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r7 = com.google.p4152bb.p4153a.C55050e.m87569a(r7)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r7 != 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r8 = r7
        L_0x00e3:
            int r8 = r8 + -1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r7.<init>()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r9 = "Unknown extra type: "
            r7.append(r9)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r7.append(r8)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r7 = r7.toString()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r6.mo81398b(r7)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x00fb:
            java.lang.String r7 = r4.f144894b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.util.Collection r9 = r6.f236133l     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r9 == 0) goto L_0x0108
            com.google.common.base.ah r8 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c.f236124c     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.util.ArrayList r6 = r6.mo81246e(r9, r8)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0123
        L_0x0108:
            int r9 = r6.f236134m     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r9 = r9 + -1
            r10 = 8
            if (r9 == r10) goto L_0x0121
            java.lang.Integer[] r8 = new java.lang.Integer[r8]     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r6 = r6.mo81242a()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r8[r13] = r6     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.util.ArrayList r6 = com.google.common.p4522b.C58597ky.m90212c(r8)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0123
        L_0x0121:
            java.util.ArrayList r6 = r6.f236132k     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x0123:
            r2.putIntegerArrayList(r7, r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x0128:
            java.lang.String r9 = r4.f144894b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r13 = r6.f236134m     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r13 = r13 + -1
            if (r13 == r8) goto L_0x016b
            if (r13 == r7) goto L_0x0168
            if (r13 == r5) goto L_0x0164
            if (r13 == r12) goto L_0x0160
            if (r13 != r10) goto L_0x0142
            boolean r6 = r6.f236129h     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r6 == 0) goto L_0x013f
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0174
        L_0x013f:
            r12 = 0
            goto L_0x0174
        L_0x0142:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r2 = java.lang.Integer.toString(r13)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r6 = "Can't convert to double (type="
            r3.append(r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.append(r11)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x0160:
            long r6 = r6.f236128g     // Catch:{ IllegalArgumentException -> 0x02b2 }
            double r12 = (double) r6     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0174
        L_0x0164:
            int r6 = r6.f236127f     // Catch:{ IllegalArgumentException -> 0x02b2 }
            double r12 = (double) r6     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0174
        L_0x0168:
            double r12 = r6.f236126e     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0174
        L_0x016b:
            java.lang.String r6 = r6.f236125d     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r6.getClass()
            double r12 = java.lang.Double.parseDouble(r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x0174:
            r2.putDouble(r9, r12)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x0179:
            java.lang.String r7 = r4.f144894b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.util.Collection r9 = r6.f236133l     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r9 == 0) goto L_0x0194
            int r8 = r9.size()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.util.Collection r9 = r6.f236133l     // Catch:{ IllegalArgumentException -> 0x02b2 }
            com.google.common.base.ah r10 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c.f236123b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.util.ArrayList r6 = r6.mo81246e(r9, r10)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.Object[] r6 = r6.toArray(r8)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x01ab
        L_0x0194:
            int r9 = r6.f236134m     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r9 = r9 + -1
            r10 = 6
            if (r9 == r10) goto L_0x01a9
            java.lang.String r6 = r6.mo81245d()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r6 != 0) goto L_0x01a3
            r6 = 0
            goto L_0x01ab
        L_0x01a3:
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r8[r13] = r6     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r6 = r8
            goto L_0x01ab
        L_0x01a9:
            java.lang.String[] r6 = r6.f236130i     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x01ab:
            r2.putStringArray(r7, r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x01b0:
            java.lang.String r9 = r4.f144894b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r13 = r6.f236134m     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r13 = r13 + -1
            if (r13 == r8) goto L_0x01f8
            if (r13 == r7) goto L_0x01ef
            if (r13 == r5) goto L_0x01e8
            if (r13 == r12) goto L_0x01e1
            if (r13 != r10) goto L_0x01c3
            boolean r8 = r6.f236129h     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x01fe
        L_0x01c3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r2 = java.lang.Integer.toString(r13)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r6 = "Can't convert to boolean (type="
            r3.append(r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.append(r11)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x01e1:
            long r6 = r6.f236128g     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x01ed
            goto L_0x01fe
        L_0x01e8:
            int r6 = r6.f236127f     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r6 == 0) goto L_0x01ed
            goto L_0x01fe
        L_0x01ed:
            r8 = 0
            goto L_0x01fe
        L_0x01ef:
            double r6 = r6.f236126e     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x01ed
            goto L_0x01fe
        L_0x01f8:
            java.lang.String r6 = r6.f236125d     // Catch:{ IllegalArgumentException -> 0x02b2 }
            boolean r8 = java.lang.Boolean.parseBoolean(r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x01fe:
            r2.putBoolean(r9, r8)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x0203:
            java.lang.String r9 = r4.f144894b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r13 = r6.f236134m     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r13 = r13 + -1
            if (r13 == r8) goto L_0x0243
            if (r13 == r7) goto L_0x023f
            if (r13 == r5) goto L_0x023b
            if (r13 == r12) goto L_0x0238
            if (r13 != r10) goto L_0x021a
            boolean r6 = r6.f236129h     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r6 == 0) goto L_0x024c
            r14 = 1
            goto L_0x024c
        L_0x021a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r2 = java.lang.Integer.toString(r13)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r6 = "Can't convert to long (type="
            r3.append(r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.append(r11)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x0238:
            long r14 = r6.f236128g     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x024c
        L_0x023b:
            int r6 = r6.f236127f     // Catch:{ IllegalArgumentException -> 0x02b2 }
            long r14 = (long) r6     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x024c
        L_0x023f:
            double r6 = r6.f236126e     // Catch:{ IllegalArgumentException -> 0x02b2 }
            long r14 = (long) r6     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x024c
        L_0x0243:
            java.lang.String r6 = r6.f236125d     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r6.getClass()
            long r14 = java.lang.Long.parseLong(r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x024c:
            r2.putLong(r9, r14)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x0251:
            java.lang.String r7 = r4.f144894b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r6 = r6.mo81242a()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r2.putInt(r7, r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x025c:
            java.lang.String r7 = r4.f144894b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            android.net.Uri r6 = r6.mo81243b()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r2.putParcelable(r7, r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x0267:
            java.lang.String r7 = r4.f144894b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r6 = r6.mo81245d()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r2.putString(r7, r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x0272:
            java.lang.String r7 = r4.f144894b     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r9 = r6.f236134m     // Catch:{ IllegalArgumentException -> 0x02b2 }
            int r9 = r9 + -1
            if (r9 == r8) goto L_0x029d
            if (r9 != r10) goto L_0x027f
            byte[] r6 = r6.f236131j     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x02ad
        L_0x027f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r2 = java.lang.Integer.toString(r9)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r6 = "Can't convert to byte array (type="
            r3.append(r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.append(r2)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r3.append(r11)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            java.lang.String r2 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x02b2 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02b2 }
        L_0x029d:
            java.lang.String r6 = r6.f236125d     // Catch:{ IllegalArgumentException -> 0x02b2 }
            if (r6 == 0) goto L_0x02ac
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            byte[] r6 = r6.getBytes(r8)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x02ad
        L_0x02ac:
            r6 = 0
        L_0x02ad:
            r2.putByteArray(r7, r6)     // Catch:{ IllegalArgumentException -> 0x02b2 }
            goto L_0x0014
        L_0x02b2:
            r0 = move-exception
            com.google.android.apps.gsa.search.shared.actions.modular.f r1 = r17.mo81210Q()
            com.google.bb.a.he r2 = r4.f144896d
            if (r2 != 0) goto L_0x02bd
            com.google.bb.a.he r2 = com.google.p4152bb.p4153a.C55136he.f145130j
        L_0x02bd:
            r1.mo81400d(r5, r2, r0)
            r5 = 0
            return r5
        L_0x02c2:
            r5 = r7
            com.google.android.apps.gsa.search.shared.actions.modular.f r6 = r17.mo81210Q()
            java.lang.String r7 = "Execution info contains intent extra without value"
            r6.mo81395a(r7, r4, r5)
            goto L_0x0014
        L_0x02ce:
            r5 = r7
            com.google.android.apps.gsa.search.shared.actions.modular.f r6 = r17.mo81210Q()
            java.lang.String r7 = "Execution info contains intent extra without name"
            r6.mo81395a(r7, r4, r5)
            goto L_0x0014
        L_0x02da:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.C87425m.m141598b(java.util.List, com.google.android.apps.gsa.search.shared.actions.modular.arguments.l, com.google.android.apps.gsa.search.shared.actions.modular.arguments.m):android.os.Bundle");
    }

    /* renamed from: c */
    private static ClipData.Item m141599c(C55212k kVar, C87448l lVar, C87449m mVar) {
        Intent intent;
        C55136he heVar = kVar.f145351b;
        if (heVar == null) {
            heVar = C55136he.f145130j;
        }
        String f = m141602f(heVar, lVar, mVar, 7);
        C55136he heVar2 = kVar.f145352c;
        if (heVar2 == null) {
            heVar2 = C55136he.f145130j;
        }
        String f2 = m141602f(heVar2, lVar, mVar, 7);
        C55136he heVar3 = kVar.f145354e;
        if (heVar3 == null) {
            heVar3 = C55136he.f145130j;
        }
        Uri e = m141601e(heVar3, lVar, mVar, 7);
        if ((kVar.f145350a & 4) != 0) {
            C55293n nVar = kVar.f145353d;
            if (nVar == null) {
                nVar = C55293n.f145650k;
            }
            intent = m141600d(nVar, lVar, mVar);
        } else {
            intent = null;
        }
        return new ClipData.Item(f, f2, intent, e);
    }

    /* renamed from: d */
    private static Intent m141600d(C55293n nVar, C87448l lVar, C87449m mVar) {
        ClipData clipData;
        Intent intent = new Intent(nVar.f145653b);
        if ((nVar.f145652a & 4) != 0) {
            intent.setFlags(nVar.f145655d);
        }
        for (String addCategory : nVar.f145659h) {
            intent.addCategory(addCategory);
        }
        C55136he heVar = nVar.f145656e;
        if (heVar == null) {
            heVar = C55136he.f145130j;
        }
        String f = m141602f(heVar, lVar, mVar, 1);
        if (f != null) {
            intent.setPackage(f);
        }
        C55136he heVar2 = nVar.f145658g;
        if (heVar2 == null) {
            heVar2 = C55136he.f145130j;
        }
        String f2 = m141602f(heVar2, lVar, mVar, 4);
        if (f2 != null) {
            intent.setComponent(ComponentName.unflattenFromString(f2));
        }
        C55136he heVar3 = nVar.f145657f;
        if (heVar3 == null) {
            heVar3 = C55136he.f145130j;
        }
        Uri e = m141601e(heVar3, lVar, mVar, 2);
        if (e != null) {
            if ((2 & nVar.f145652a) != 0) {
                intent.setDataAndType(e, nVar.f145654c);
            } else {
                intent.setData(e);
            }
        } else if ((nVar.f145652a & 2) != 0) {
            intent.setType(nVar.f145654c);
        }
        if ((nVar.f145652a & 64) != 0) {
            C55239l lVar2 = nVar.f145661j;
            if (lVar2 == null) {
                lVar2 = C55239l.f145443d;
            }
            C62971cq cqVar = lVar2.f145447c;
            if ((lVar2.f145445a & 1) == 0 || cqVar.isEmpty()) {
                clipData = null;
            } else {
                C55158i iVar = lVar2.f145446b;
                if (iVar == null) {
                    iVar = C55158i.f145207c;
                }
                C55136he heVar4 = iVar.f145209a;
                if (heVar4 == null) {
                    heVar4 = C55136he.f145130j;
                }
                String f3 = m141602f(heVar4, lVar, mVar, 7);
                int size = iVar.f145210b.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = m141602f((C55136he) iVar.f145210b.get(i), lVar, mVar, 7);
                }
                clipData = new ClipData(f3, strArr, m141599c((C55212k) cqVar.get(0), lVar, mVar));
                for (C55212k c : cqVar.subList(1, cqVar.size())) {
                    clipData.addItem(m141599c(c, lVar, mVar));
                }
            }
            intent.setClipData(clipData);
        }
        Bundle b = m141598b(nVar.f145660i, lVar, mVar);
        if (b == null) {
            return null;
        }
        if (b.size() > 0) {
            intent.putExtras(b);
        }
        return intent;
    }

    /* renamed from: e */
    private static Uri m141601e(C55136he heVar, C87448l lVar, C87449m mVar, int i) {
        if (heVar == null) {
            return null;
        }
        try {
            C87429c a = mVar.mo81378a(heVar, lVar, false);
            if (a.mo81247f()) {
                return a.mo81243b();
            }
            return null;
        } catch (IllegalArgumentException e) {
            lVar.mo81210Q().mo81400d(i, heVar, e);
            return null;
        }
    }

    /* renamed from: f */
    private static String m141602f(C55136he heVar, C87448l lVar, C87449m mVar, int i) {
        if (heVar == null) {
            return null;
        }
        try {
            C87429c a = mVar.mo81378a(heVar, lVar, true);
            if (a.mo81247f()) {
                return a.mo81245d();
            }
            return null;
        } catch (IllegalArgumentException e) {
            lVar.mo81210Q().mo81400d(i, heVar, e);
            return null;
        }
    }

    /* renamed from: a */
    public final Intent mo81206a(C55208jw jwVar, C87448l lVar, C87449m mVar) {
        Intent intent = null;
        if (!jwVar.f145329l) {
            C55266m mVar2 = (C55266m) C55293n.f145650k.createBuilder();
            if ((jwVar.f145318a & 1) != 0) {
                String str = jwVar.f145319b;
                mVar2.copyOnWrite();
                C55293n nVar = (C55293n) mVar2.instance;
                str.getClass();
                nVar.f145652a = 1 | nVar.f145652a;
                nVar.f145653b = str;
            }
            if ((jwVar.f145318a & 2) != 0) {
                String str2 = jwVar.f145320c;
                mVar2.copyOnWrite();
                C55293n nVar2 = (C55293n) mVar2.instance;
                str2.getClass();
                nVar2.f145652a |= 2;
                nVar2.f145654c = str2;
            }
            if ((jwVar.f145318a & 4) != 0) {
                int i = jwVar.f145321d;
                mVar2.copyOnWrite();
                C55293n nVar3 = (C55293n) mVar2.instance;
                nVar3.f145652a |= 4;
                nVar3.f145655d = i;
            }
            if ((jwVar.f145318a & 8) != 0) {
                C55136he heVar = jwVar.f145322e;
                if (heVar == null) {
                    heVar = C55136he.f145130j;
                }
                mVar2.copyOnWrite();
                C55293n nVar4 = (C55293n) mVar2.instance;
                heVar.getClass();
                nVar4.f145656e = heVar;
                nVar4.f145652a |= 8;
            }
            if ((jwVar.f145318a & 16) != 0) {
                C55136he heVar2 = jwVar.f145324g;
                if (heVar2 == null) {
                    heVar2 = C55136he.f145130j;
                }
                mVar2.copyOnWrite();
                C55293n nVar5 = (C55293n) mVar2.instance;
                heVar2.getClass();
                nVar5.f145657f = heVar2;
                nVar5.f145652a |= 16;
            }
            if ((jwVar.f145318a & 32) != 0) {
                C55136he heVar3 = jwVar.f145325h;
                if (heVar3 == null) {
                    heVar3 = C55136he.f145130j;
                }
                mVar2.copyOnWrite();
                C55293n nVar6 = (C55293n) mVar2.instance;
                heVar3.getClass();
                nVar6.f145658g = heVar3;
                nVar6.f145652a |= 32;
            }
            if ((jwVar.f145318a & 524288) != 0) {
                C55239l lVar2 = jwVar.f145341x;
                if (lVar2 == null) {
                    lVar2 = C55239l.f145443d;
                }
                mVar2.copyOnWrite();
                C55293n nVar7 = (C55293n) mVar2.instance;
                lVar2.getClass();
                nVar7.f145661j = lVar2;
                nVar7.f145652a |= 64;
            }
            mVar2.mo54228a(jwVar.f145326i);
            mVar2.mo54229b(jwVar.f145327j);
            Intent d = m141600d((C55293n) mVar2.build(), lVar, mVar);
            if (!(d == null || (jwVar.f145318a & C89885b.S3REQUEST_VALUE) == 0)) {
                d.putExtra(jwVar.f145339v, PendingIntent.getActivity(this.f236097b, 0, C147798a.m240896b(new Intent(this.f236097b, getClass()), 67108864, 0), 67108864));
            }
            if (jwVar.f145334q) {
                if (!this.f236098c) {
                    lVar.mo81210Q().mo81395a("Intent.CATEGORY_VOICE not supported", jwVar, (Throwable) null);
                    return null;
                } else if (d != null) {
                    d.addCategory("android.intent.category.VOICE");
                }
            }
            intent = d;
        } else if ((jwVar.f145318a & 8) != 0) {
            C55136he heVar4 = jwVar.f145322e;
            if (heVar4 == null) {
                heVar4 = C55136he.f145130j;
            }
            String f = m141602f(heVar4, lVar, mVar, 1);
            if (f != null) {
                intent = this.f236096a.getLaunchIntentForPackage(f);
            }
        } else {
            lVar.mo81210Q().mo81395a("Launch intent with invalid package", jwVar, (Throwable) null);
        }
        if (!(intent == null || (jwVar.f145318a & 65536) == 0)) {
            intent.putExtra("EXPECT_EXTERNAL_APP_UI", jwVar.f145338u);
        }
        return intent;
    }
}
