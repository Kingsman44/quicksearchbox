package com.google.android.apps.gsa.search.core.p6812m;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p337aa.p338a.C6600b;
import com.google.p337aa.p338a.C6610l;

/* renamed from: com.google.android.apps.gsa.search.core.m.b */
/* compiled from: PG */
public final class C86180b {

    /* renamed from: b */
    private static final C59071e f232875b = C59071e.m91332i("com.google.android.apps.gsa.search.core.m.b");

    /* renamed from: a */
    public final C86338r f232876a;

    /* renamed from: c */
    private final C85929cw f232877c;

    public C86180b(C86127w wVar, C85929cw cwVar) {
        this.f232876a = wVar.f232790a.mo79722a();
        this.f232877c = cwVar;
    }

    /* renamed from: d */
    private static Uri m138626d(Uri uri, String str) {
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri.Builder scheme = parse.buildUpon().scheme(uri.getScheme());
        if (TextUtils.isEmpty(parse.getAuthority())) {
            scheme.authority(uri.getAuthority());
        }
        return scheme.build();
    }

    /* renamed from: e */
    private static final C86179a m138627e(C6610l lVar, Uri uri) {
        if (lVar.f19635d.isEmpty()) {
            return new C86179a();
        }
        C86179a aVar = new C86179a();
        aVar.f232870a = lVar.f19633b;
        if (!TextUtils.isEmpty(aVar.f232870a)) {
            aVar.f232870a = m138626d(uri, aVar.f232870a).toString();
        }
        aVar.f232873d = lVar.f19638g;
        int a = C6600b.m17998a(lVar.f19639h);
        if (a == 0) {
            a = 1;
        }
        aVar.f232874e = a;
        try {
            aVar.f232871b = Color.parseColor(lVar.f19635d);
            if (!lVar.f19637f.isEmpty()) {
                try {
                    aVar.f232872c = Color.parseColor(lVar.f19637f);
                } catch (IllegalArgumentException e) {
                    ((C59052c) ((C59052c) ((C59052c) f232875b.mo56225c()).mo56382g(e)).mo56372aa(7704)).mo56389s("Invalid medium image hamburger menu color %s.", lVar.f19637f);
                    return new C86179a();
                }
            }
            return aVar;
        } catch (IllegalArgumentException e2) {
            ((C59052c) ((C59052c) ((C59052c) f232875b.mo56225c()).mo56382g(e2)).mo56372aa(7705)).mo56389s("Invalid medium image background color %s.", lVar.f19635d);
            return new C86179a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x02bd A[Catch:{ all -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02cb A[Catch:{ all -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x031b A[Catch:{ all -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0352 A[Catch:{ all -> 0x0366 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.shared.search.doodle.DoodleData mo79816a(android.net.Uri r55, byte[] r56) {
        /*
            r54 = this;
            r1 = r55
            r2 = 0
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x037e }
            com.google.aa.d r3 = com.google.p337aa.C6617d.f19649y     // Catch:{ ct -> 0x037e }
            r4 = r56
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r4, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x037e }
            r3 = r0
            com.google.aa.d r3 = (com.google.p337aa.C6617d) r3     // Catch:{ ct -> 0x037e }
            int r0 = r3.f19670t
            int r0 = com.google.p337aa.p338a.C6608j.m18001a(r0)
            if (r0 != 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            r4 = 4
            if (r0 == r4) goto L_0x002c
            com.google.common.f.e r0 = f232875b
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Invalid header_layout, only LEGACY supported"
            r3 = 7709(0x1e1d, float:1.0803E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            return r2
        L_0x002c:
            int r0 = r3.f19651a     // Catch:{ all -> 0x0368 }
            r0 = r0 & 64
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x0047
            com.google.aa.a.l r0 = r3.f19659i     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x003a
            com.google.aa.a.l r0 = com.google.p337aa.p338a.C6610l.f19630i     // Catch:{ all -> 0x0368 }
        L_0x003a:
            java.lang.String r0 = r0.f19634c     // Catch:{ all -> 0x0368 }
            com.google.aa.a.l r6 = r3.f19659i     // Catch:{ all -> 0x0368 }
            if (r6 != 0) goto L_0x0042
            com.google.aa.a.l r6 = com.google.p337aa.p338a.C6610l.f19630i     // Catch:{ all -> 0x0368 }
        L_0x0042:
            int r6 = r6.f19638g     // Catch:{ all -> 0x0368 }
            r7 = r6
            r6 = r0
            goto L_0x0049
        L_0x0047:
            r6 = r4
            r7 = 0
        L_0x0049:
            int r0 = r3.f19651a     // Catch:{ all -> 0x0368 }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0070
            com.google.aa.a.l r0 = r3.f19658h     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x0055
            com.google.aa.a.l r0 = com.google.p337aa.p338a.C6610l.f19630i     // Catch:{ all -> 0x0368 }
        L_0x0055:
            java.lang.String r9 = r0.f19634c     // Catch:{ all -> 0x0368 }
            boolean r10 = r0.f19636e     // Catch:{ all -> 0x0368 }
            int r0 = r0.f19638g     // Catch:{ all -> 0x0368 }
            com.google.aa.a.l r11 = r3.f19658h     // Catch:{ all -> 0x0368 }
            if (r11 != 0) goto L_0x0061
            com.google.aa.a.l r11 = com.google.p337aa.p338a.C6610l.f19630i     // Catch:{ all -> 0x0368 }
        L_0x0061:
            int r11 = r11.f19639h     // Catch:{ all -> 0x0368 }
            int r11 = com.google.p337aa.p338a.C6600b.m17998a(r11)     // Catch:{ all -> 0x0368 }
            if (r11 != 0) goto L_0x006a
            r11 = 1
        L_0x006a:
            r39 = r11
            r11 = r10
            r10 = r9
            r9 = r0
            goto L_0x0075
        L_0x0070:
            r10 = r4
            r9 = 0
            r11 = 0
            r39 = 1
        L_0x0075:
            int r0 = r3.f19651a     // Catch:{ all -> 0x0368 }
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0086
            com.google.aa.a.l r0 = r3.f19660j     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x0081
            com.google.aa.a.l r0 = com.google.p337aa.p338a.C6610l.f19630i     // Catch:{ all -> 0x0368 }
        L_0x0081:
            com.google.android.apps.gsa.search.core.m.a r0 = m138627e(r0, r1)     // Catch:{ all -> 0x0368 }
            goto L_0x008b
        L_0x0086:
            com.google.android.apps.gsa.search.core.m.a r0 = new com.google.android.apps.gsa.search.core.m.a     // Catch:{ all -> 0x0368 }
            r0.<init>()     // Catch:{ all -> 0x0368 }
        L_0x008b:
            r12 = r0
            int r0 = r3.f19652b     // Catch:{ all -> 0x0368 }
            r13 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r13
            if (r0 == 0) goto L_0x009e
            com.google.aa.a.l r0 = r3.f19674x     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x0099
            com.google.aa.a.l r0 = com.google.p337aa.p338a.C6610l.f19630i     // Catch:{ all -> 0x0368 }
        L_0x0099:
            com.google.android.apps.gsa.search.core.m.a r0 = m138627e(r0, r1)     // Catch:{ all -> 0x0368 }
            goto L_0x00a3
        L_0x009e:
            com.google.android.apps.gsa.search.core.m.a r0 = new com.google.android.apps.gsa.search.core.m.a     // Catch:{ all -> 0x0368 }
            r0.<init>()     // Catch:{ all -> 0x0368 }
        L_0x00a3:
            r13 = r0
            int r0 = r3.f19652b     // Catch:{ all -> 0x0368 }
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00be
            com.google.aa.a.l r0 = r3.f19672v     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x00b0
            com.google.aa.a.l r0 = com.google.p337aa.p338a.C6610l.f19630i     // Catch:{ all -> 0x0368 }
        L_0x00b0:
            java.lang.String r0 = r0.f19633b     // Catch:{ all -> 0x0368 }
            com.google.aa.a.l r14 = r3.f19672v     // Catch:{ all -> 0x0368 }
            if (r14 != 0) goto L_0x00b8
            com.google.aa.a.l r14 = com.google.p337aa.p338a.C6610l.f19630i     // Catch:{ all -> 0x0368 }
        L_0x00b8:
            int r14 = r14.f19638g     // Catch:{ all -> 0x0368 }
            r38 = r14
            r14 = r0
            goto L_0x00c1
        L_0x00be:
            r14 = r4
            r38 = 0
        L_0x00c1:
            int r0 = r3.f19652b     // Catch:{ all -> 0x0368 }
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0153
            com.google.aa.a.l r0 = r3.f19673w     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x00cd
            com.google.aa.a.l r0 = com.google.p337aa.p338a.C6610l.f19630i     // Catch:{ all -> 0x0368 }
        L_0x00cd:
            r15 = r0
            java.lang.String r5 = r15.f19634c     // Catch:{ all -> 0x0368 }
            boolean r8 = r15.f19636e     // Catch:{ all -> 0x0368 }
            int r2 = r15.f19638g     // Catch:{ all -> 0x0368 }
            int r0 = r15.f19639h     // Catch:{ all -> 0x0368 }
            int r0 = com.google.p337aa.p338a.C6600b.m17998a(r0)     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x00e1
            r18 = r2
            r17 = 1
            goto L_0x00e5
        L_0x00e1:
            r17 = r0
            r18 = r2
        L_0x00e5:
            java.lang.String r2 = r15.f19637f     // Catch:{ all -> 0x0368 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x0115
            int r0 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x00f5 }
            r2 = r0
            r19 = r4
            goto L_0x0118
        L_0x00f5:
            r0 = move-exception
            r19 = r4
            r4 = r0
            com.google.common.f.e r0 = f232875b     // Catch:{ all -> 0x0368 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0368 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0368 }
            com.google.common.f.x r0 = r0.mo56382g(r4)     // Catch:{ all -> 0x0368 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0368 }
            r4 = 7708(0x1e1c, float:1.0801E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ all -> 0x0368 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0368 }
            java.lang.String r4 = "Invalid dark hamburger menu color %s."
            r0.mo56389s(r4, r2)     // Catch:{ all -> 0x0368 }
            goto L_0x0117
        L_0x0115:
            r19 = r4
        L_0x0117:
            r2 = 0
        L_0x0118:
            java.lang.String r4 = r15.f19635d     // Catch:{ all -> 0x0368 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x014a
            int r0 = android.graphics.Color.parseColor(r4)     // Catch:{ IllegalArgumentException -> 0x012d }
            r44 = r0
            r45 = r2
            r46 = r17
            r2 = r18
            goto L_0x015f
        L_0x012d:
            r0 = move-exception
            r15 = r0
            com.google.common.f.e r0 = f232875b     // Catch:{ all -> 0x0368 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0368 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0368 }
            com.google.common.f.x r0 = r0.mo56382g(r15)     // Catch:{ all -> 0x0368 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0368 }
            r15 = 7707(0x1e1b, float:1.08E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r15)     // Catch:{ all -> 0x0368 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0368 }
            java.lang.String r15 = "Invalid dark background color %s."
            r0.mo56389s(r15, r4)     // Catch:{ all -> 0x0368 }
        L_0x014a:
            r45 = r2
            r46 = r17
            r2 = r18
            r44 = 0
            goto L_0x015f
        L_0x0153:
            r19 = r4
            r5 = r19
            r2 = 0
            r8 = 0
            r44 = 0
            r45 = 0
            r46 = 1
        L_0x015f:
            com.google.aa.a.n r0 = r3.f19662l     // Catch:{ all -> 0x0368 }
            if (r0 != 0) goto L_0x0165
            com.google.aa.a.n r0 = com.google.p337aa.p338a.C6612n.f19640b     // Catch:{ all -> 0x0368 }
        L_0x0165:
            java.lang.String r0 = r0.f19642a     // Catch:{ all -> 0x0368 }
            com.google.protobuf.cq r4 = r3.f19668r     // Catch:{ all -> 0x0368 }
            int r4 = r4.size()     // Catch:{ all -> 0x0368 }
            if (r4 <= 0) goto L_0x01b5
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x0368 }
            r4.<init>()     // Catch:{ all -> 0x0368 }
            r17 = r2
            r15 = 0
        L_0x0177:
            com.google.protobuf.cq r2 = r3.f19668r     // Catch:{ all -> 0x0368 }
            int r2 = r2.size()     // Catch:{ all -> 0x0368 }
            if (r15 >= r2) goto L_0x01b0
            com.google.protobuf.cq r2 = r3.f19668r     // Catch:{ all -> 0x0368 }
            java.lang.Object r2 = r2.get(r15)     // Catch:{ all -> 0x0368 }
            com.google.aa.a.d r2 = (com.google.p337aa.p338a.C6602d) r2     // Catch:{ all -> 0x0368 }
            java.lang.String r2 = r2.f19624a     // Catch:{ all -> 0x0368 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0368 }
            if (r2 != 0) goto L_0x01a9
            com.google.protobuf.cq r2 = r3.f19668r     // Catch:{ all -> 0x0368 }
            java.lang.Object r2 = r2.get(r15)     // Catch:{ all -> 0x0368 }
            com.google.aa.a.d r2 = (com.google.p337aa.p338a.C6602d) r2     // Catch:{ all -> 0x0368 }
            java.lang.String r2 = r2.f19624a     // Catch:{ all -> 0x0368 }
            r18 = r7
            com.google.protobuf.cq r7 = r3.f19668r     // Catch:{ all -> 0x0368 }
            java.lang.Object r7 = r7.get(r15)     // Catch:{ all -> 0x0368 }
            com.google.aa.a.d r7 = (com.google.p337aa.p338a.C6602d) r7     // Catch:{ all -> 0x0368 }
            java.lang.String r7 = r7.f19625b     // Catch:{ all -> 0x0368 }
            r4.putString(r2, r7)     // Catch:{ all -> 0x0368 }
            goto L_0x01ab
        L_0x01a9:
            r18 = r7
        L_0x01ab:
            int r15 = r15 + 1
            r7 = r18
            goto L_0x0177
        L_0x01b0:
            r18 = r7
            r34 = r4
            goto L_0x01bb
        L_0x01b5:
            r17 = r2
            r18 = r7
            r34 = 0
        L_0x01bb:
            int r2 = r3.f19667q     // Catch:{ all -> 0x0368 }
            int r4 = r3.f19663m     // Catch:{ all -> 0x0368 }
            int r4 = com.google.p337aa.p338a.C6606h.m18000a(r4)     // Catch:{ all -> 0x0368 }
            if (r4 != 0) goto L_0x01c7
            r15 = 1
            goto L_0x01c8
        L_0x01c7:
            r15 = r4
        L_0x01c8:
            int r4 = r3.f19664n     // Catch:{ all -> 0x0368 }
            int r4 = com.google.p337aa.p338a.C6604f.m17999a(r4)     // Catch:{ all -> 0x0368 }
            if (r4 != 0) goto L_0x01d1
            r4 = 1
        L_0x01d1:
            java.lang.String r7 = r3.f19653c     // Catch:{ all -> 0x0368 }
            r20 = r9
            java.lang.String r9 = r3.f19654d     // Catch:{ all -> 0x0368 }
            r33 = r0
            java.lang.String r0 = r3.f19656f     // Catch:{ all -> 0x0368 }
            r21 = r9
            java.lang.String r9 = r3.f19655e     // Catch:{ all -> 0x0368 }
            r22 = r7
            java.lang.String r7 = r3.f19657g     // Catch:{ all -> 0x0368 }
            r23 = r12
            r24 = r13
            long r12 = r3.f19661k     // Catch:{ all -> 0x0368 }
            r25 = r12
            int r12 = r3.f19665o     // Catch:{ all -> 0x0368 }
            int r12 = com.google.p337aa.p338a.C6614p.m18002a(r12)     // Catch:{ all -> 0x0368 }
            if (r12 != 0) goto L_0x01f4
            r12 = 1
        L_0x01f4:
            boolean r13 = r3.f19666p     // Catch:{ all -> 0x0368 }
            r27 = r4
            boolean r4 = r3.f19669s     // Catch:{ all -> 0x0368 }
            r28 = r13
            com.google.aa.b r13 = r3.f19671u     // Catch:{ all -> 0x0368 }
            if (r13 != 0) goto L_0x0202
            com.google.aa.b r13 = com.google.p337aa.C6615b.f19645c     // Catch:{ all -> 0x0368 }
        L_0x0202:
            android.net.Uri r29 = m138626d(r1, r0)     // Catch:{ all -> 0x0368 }
            r30 = r13
            java.lang.String r13 = r29.toString()     // Catch:{ all -> 0x0368 }
            r52 = r3
            r36 = r4
            r3 = r54
            com.google.android.apps.gsa.search.core.google.cw r4 = r3.f232877c     // Catch:{ all -> 0x0366 }
            com.google.android.apps.gsa.shared.search.Query r3 = com.google.android.apps.gsa.shared.search.Query.f252741b     // Catch:{ all -> 0x0366 }
            com.google.android.apps.gsa.shared.search.Query r3 = r4.mo79574o(r3, r13)     // Catch:{ all -> 0x0366 }
            if (r3 != 0) goto L_0x022c
            com.google.common.f.e r1 = f232875b     // Catch:{ all -> 0x0366 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0366 }
            java.lang.String r2 = "Doodle: bad search_url: %s"
            r3 = 7712(0x1e20, float:1.0807E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r0)     // Catch:{ all -> 0x0366 }
        L_0x0229:
            r2 = 0
            goto L_0x0365
        L_0x022c:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0366 }
            if (r0 != 0) goto L_0x023b
            android.net.Uri r0 = m138626d(r1, r9)     // Catch:{ all -> 0x0366 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0366 }
            goto L_0x023d
        L_0x023b:
            r0 = r19
        L_0x023d:
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0366 }
            if (r4 != 0) goto L_0x0246
            r4 = r18
            goto L_0x024f
        L_0x0246:
            boolean r4 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0366 }
            if (r4 != 0) goto L_0x0356
            r6 = r10
            r4 = r20
        L_0x024f:
            android.net.Uri r6 = m138626d(r1, r6)     // Catch:{ all -> 0x0366 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0366 }
            boolean r9 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0366 }
            if (r9 != 0) goto L_0x0268
            android.net.Uri r9 = m138626d(r1, r14)     // Catch:{ all -> 0x0366 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0366 }
            r37 = r9
            goto L_0x026a
        L_0x0268:
            r37 = r14
        L_0x026a:
            boolean r9 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0366 }
            if (r9 != 0) goto L_0x027d
            if (r11 == 0) goto L_0x027d
            android.net.Uri r9 = m138626d(r1, r10)     // Catch:{ all -> 0x0366 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0366 }
            r10 = r20
            goto L_0x0280
        L_0x027d:
            r9 = r19
            r10 = 0
        L_0x0280:
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0366 }
            if (r11 != 0) goto L_0x02a0
            android.net.Uri r5 = m138626d(r1, r5)     // Catch:{ all -> 0x0366 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0366 }
            if (r8 == 0) goto L_0x0299
            r42 = r5
            r43 = r17
            r40 = r19
            r41 = 0
            goto L_0x02a8
        L_0x0299:
            r40 = r5
            r41 = r17
            r42 = r19
            goto L_0x02a6
        L_0x02a0:
            r40 = r19
            r42 = r40
            r41 = 0
        L_0x02a6:
            r43 = 0
        L_0x02a8:
            android.net.Uri r29 = m138626d(r1, r7)     // Catch:{ all -> 0x0366 }
            com.google.android.apps.gsa.shared.search.doodle.DoodleData r5 = new com.google.android.apps.gsa.shared.search.doodle.DoodleData     // Catch:{ all -> 0x0366 }
            r7 = r23
            java.lang.String r8 = r7.f232870a     // Catch:{ all -> 0x0366 }
            int r11 = r7.f232873d     // Catch:{ all -> 0x0366 }
            int r14 = r7.f232871b     // Catch:{ all -> 0x0366 }
            int r13 = r7.f232872c     // Catch:{ all -> 0x0366 }
            int r7 = r7.f232874e     // Catch:{ all -> 0x0366 }
            r1 = 2
            if (r12 == r1) goto L_0x02cb
            r1 = 3
            if (r12 == r1) goto L_0x02c6
            r1 = -1
            r1 = r24
            r32 = -1
            goto L_0x02d0
        L_0x02c6:
            r1 = r24
            r32 = 1
            goto L_0x02d0
        L_0x02cb:
            r1 = 6
            r1 = r24
            r32 = 6
        L_0x02d0:
            java.lang.String r12 = r1.f232870a     // Catch:{ all -> 0x0366 }
            r31 = r7
            int r7 = r1.f232873d     // Catch:{ all -> 0x0366 }
            r48 = r7
            int r7 = r1.f232871b     // Catch:{ all -> 0x0366 }
            r49 = r7
            int r7 = r1.f232872c     // Catch:{ all -> 0x0366 }
            int r1 = r1.f232874e     // Catch:{ all -> 0x0366 }
            r47 = r12
            r50 = r25
            r12 = r5
            r53 = r5
            r35 = r28
            r5 = r30
            r28 = r13
            r13 = r2
            r2 = r14
            r14 = r3
            r16 = r27
            r17 = r22
            r18 = r21
            r19 = r0
            r20 = r6
            r21 = r4
            r22 = r9
            r23 = r10
            r24 = r8
            r25 = r11
            r26 = r2
            r27 = r28
            r28 = r31
            r30 = r50
            r50 = r7
            r51 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ all -> 0x0366 }
            if (r5 == 0) goto L_0x0352
            int r0 = r5.f19647a     // Catch:{ all -> 0x0366 }
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0352
            com.google.protobuf.bn r0 = r5.toBuilder()     // Catch:{ all -> 0x0366 }
            com.google.aa.a r0 = (com.google.p337aa.C6598a) r0     // Catch:{ all -> 0x0366 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x0366 }
            com.google.aa.b r2 = (com.google.p337aa.C6615b) r2     // Catch:{ all -> 0x0366 }
            java.lang.String r2 = r2.f19648b     // Catch:{ all -> 0x0366 }
            r1 = r55
            r3 = 2
            android.net.Uri r1 = m138626d(r1, r2)     // Catch:{ all -> 0x0366 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0366 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0366 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x0366 }
            com.google.aa.b r2 = (com.google.p337aa.C6615b) r2     // Catch:{ all -> 0x0366 }
            r1.getClass()     // Catch:{ all -> 0x0366 }
            int r4 = r2.f19647a     // Catch:{ all -> 0x0366 }
            r3 = r3 | r4
            r2.f19647a = r3     // Catch:{ all -> 0x0366 }
            r2.f19648b = r1     // Catch:{ all -> 0x0366 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0366 }
            com.google.aa.b r0 = (com.google.p337aa.C6615b) r0     // Catch:{ all -> 0x0366 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0366 }
            r1 = r53
            r1.f252920A = r0     // Catch:{ all -> 0x0366 }
            goto L_0x0354
        L_0x0352:
            r1 = r53
        L_0x0354:
            r2 = r1
            goto L_0x0365
        L_0x0356:
            com.google.common.f.e r0 = f232875b     // Catch:{ all -> 0x0366 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0366 }
            java.lang.String r1 = "Doodle: all large image urls are empty."
            r2 = 7711(0x1e1f, float:1.0805E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0366 }
            goto L_0x0229
        L_0x0365:
            return r2
        L_0x0366:
            r0 = move-exception
            goto L_0x036b
        L_0x0368:
            r0 = move-exception
            r52 = r3
        L_0x036b:
            com.google.common.f.e r1 = f232875b
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Error parsing doodle config: %s"
            r3 = 7706(0x1e1a, float:1.0798E-41)
            r4 = r52
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56389s(r2, r4)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x037c:
            r1 = 0
            return r1
        L_0x037e:
            r0 = move-exception
            com.google.common.f.e r1 = f232875b
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Error parsing doodle."
            r3 = 7710(0x1e1e, float:1.0804E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            goto L_0x037c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6812m.C86180b.mo79816a(android.net.Uri, byte[]):com.google.android.apps.gsa.shared.search.doodle.DoodleData");
    }

    /* renamed from: b */
    public final DoodleData mo79817b() {
        try {
            String string = this.f232876a.getString("doodle_uri", (String) null);
            byte[] e = this.f232876a.mo80079e("doodle_bytes", (byte[]) null);
            if (string == null || e == null || e.length <= 0) {
                return null;
            }
            return mo79816a(Uri.parse(string), e);
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) f232875b.mo56226d()).mo56382g(th)).mo56372aa(7713)).mo56386p("Error retrieving doodle config from preferences");
            int i = C90755l.f253831a;
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo79818c() {
        if (this.f232876a.getBoolean("doodle_sticky_test_data", false)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f232876a.contains("doodle_expiration_time") || currentTimeMillis < this.f232876a.getLong("doodle_expiration_time", 0)) {
            return false;
        }
        return true;
    }
}
