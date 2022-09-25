package com.google.android.apps.gsa.speech.p7277g;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.speech.p7272e.C92238b;
import com.google.android.apps.gsa.speech.p7272e.p7273a.C92237c;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92248j;
import com.google.android.apps.gsa.staticplugins.p7404aq.C94042a;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.g.c */
/* compiled from: PG */
public final class C92298c implements C118549h {

    /* renamed from: a */
    private static final C59071e f257378a = C59071e.m91332i("com.google.android.apps.gsa.speech.g.c");

    /* renamed from: b */
    private final Context f257379b;

    /* renamed from: c */
    private final C89994f f257380c;

    /* renamed from: d */
    private final C86130z f257381d;

    /* renamed from: e */
    private final C86124t f257382e;

    /* renamed from: f */
    private final C92238b f257383f;

    /* renamed from: g */
    private final C92248j f257384g;

    /* renamed from: h */
    private final C92237c f257385h;

    /* renamed from: i */
    private final C68214a f257386i;

    /* renamed from: j */
    private final C90476a f257387j;

    /* renamed from: k */
    private final C94042a f257388k;

    public C92298c(Context context, C94042a aVar, C89994f fVar, C86130z zVar, C86124t tVar, C92238b bVar, C92248j jVar, C92237c cVar, C68214a aVar2, C90476a aVar3) {
        this.f257379b = context;
        this.f257388k = aVar;
        this.f257380c = fVar;
        this.f257381d = zVar;
        this.f257382e = tVar;
        this.f257383f = bVar;
        this.f257384g = jVar;
        this.f257385h = cVar;
        this.f257386i = aVar2;
        this.f257387j = aVar3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo65234a(com.google.android.apps.gsa.tasks.C118476ak r26) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.speech.p7277g.p7278a.C92296c.f257375a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x001a
            java.lang.Object r0 = r2.f169969b
            goto L_0x001e
        L_0x001a:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x001e:
            com.google.android.apps.gsa.speech.g.a.b r0 = (com.google.android.apps.gsa.speech.p7277g.p7278a.C92295b) r0
            java.lang.String r2 = r0.f257373b
            java.lang.String r0 = r0.f257374c
            boolean r3 = com.google.common.base.C58837ba.m90859h(r2)
            r4 = 1
            if (r4 == r3) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            boolean r3 = com.google.common.base.C58837ba.m90859h(r0)
            if (r3 != 0) goto L_0x0039
            com.google.android.apps.gsa.speech.e.b.k r0 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k.m151476a(r0)
            r3 = r0
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r2 != 0) goto L_0x004d
            if (r3 != 0) goto L_0x004d
            com.google.common.f.e r0 = f257378a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "Both locale and grammarType are null, nothing to compile."
            r3 = 12437(0x3095, float:1.7428E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0136
        L_0x004d:
            com.google.common.f.e r0 = f257378a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r4 = 12436(0x3094, float:1.7427E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r4 = "Processing grammar compilation for locale: %s, grammar type: %s"
            r0.mo56354G(r4, r2, r3)
            com.google.android.apps.gsa.staticplugins.aq.a r0 = r1.f257388k
            android.content.Context r4 = r1.f257379b
            boolean r6 = com.google.android.apps.gsa.shared.util.C90772bp.m148283J(r4)
            com.google.android.apps.gsa.speech.e.b.j r15 = r1.f257384g
            com.google.android.apps.gsa.speech.e.b r7 = r1.f257383f
            com.google.android.apps.gsa.speech.e.b.q r14 = r7.f257173c
            com.google.android.apps.gsa.shared.m.b.f r7 = r1.f257380c
            com.google.android.apps.gsa.speech.e.a.c r13 = r1.f257385h
            dagger.a r12 = r1.f257386i
            com.google.android.apps.gsa.search.core.i.z r11 = r1.f257381d
            com.google.android.apps.gsa.search.core.i.t r10 = r1.f257382e
            com.google.android.apps.gsa.shared.util.v r8 = r0.f262687b
            boolean r17 = r8.mo85390b()
            android.content.SharedPreferences r0 = r0.f262686a
            java.lang.String r8 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r8)     // Catch:{ NoSuchAlgorithmException -> 0x0089 }
            goto L_0x009e
        L_0x0089:
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.p7404aq.p7405a.C94056n.f262723a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "ContextCompilationHandl"
            r8.mo56378ag(r9, r5)
            java.lang.String r5 = "MD5 message digests not supported."
            r9 = 19472(0x4c10, float:2.7286E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r9)).mo56386p(r5)
            r5 = 0
        L_0x009e:
            boolean r8 = r15.mo86932k()
            if (r8 != 0) goto L_0x00a9
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo86926e()
        L_0x00a9:
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = r7.mo83885ae()
        L_0x00af:
            boolean r6 = com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84570aa.m135301f(r10, r6, r2)
            r9 = 0
            if (r3 != 0) goto L_0x00fd
            if (r6 != 0) goto L_0x00bd
            com.google.android.apps.gsa.speech.e.b.w r3 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92261w.f257246a
            com.google.android.apps.gsa.speech.e.b.k[] r3 = r3.f257250e
            goto L_0x00cd
        L_0x00bd:
            com.google.android.apps.gsa.speech.e.b.w r3 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92261w.f257246a
            com.google.android.apps.gsa.speech.e.b.k[] r3 = r3.f257250e
            com.google.android.apps.gsa.speech.e.b.w r6 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92261w.f257247b
            com.google.android.apps.gsa.speech.e.b.k[] r6 = r6.f257250e
            java.lang.Class<com.google.android.apps.gsa.speech.e.b.k> r7 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k.class
            java.lang.Object[] r3 = com.google.common.p4522b.C58704ox.m90448a(r3, r6, r7)
            com.google.android.apps.gsa.speech.e.b.k[] r3 = (com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k[]) r3
        L_0x00cd:
            int r13 = r3.length
        L_0x00ce:
            if (r9 >= r13) goto L_0x0131
            r7 = r3[r9]
            r6 = r2
            r8 = r4
            r18 = r9
            r9 = r15
            r19 = r10
            r10 = r14
            r20 = r11
            r11 = r5
            r21 = r12
            r22 = r13
            r13 = r20
            r23 = r14
            r14 = r19
            r24 = r15
            r15 = r17
            r16 = r0
            com.google.android.apps.gsa.staticplugins.p7404aq.p7405a.C94056n.m155258a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            int r9 = r18 + 1
            r10 = r19
            r11 = r20
            r13 = r22
            r14 = r23
            r15 = r24
            goto L_0x00ce
        L_0x00fd:
            r19 = r10
            r20 = r11
            r21 = r12
            r23 = r14
            r24 = r15
            r13.mo86916e()
            com.google.android.apps.gsa.speech.e.b.n r7 = r3.f257211k     // Catch:{ all -> 0x013b }
            com.google.android.apps.gsa.speech.e.b.n r8 = com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n.VOICE_ACTIONS     // Catch:{ all -> 0x013b }
            if (r7 != r8) goto L_0x0116
            if (r6 != 0) goto L_0x0116
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013b }
            r4 = r13
            goto L_0x012e
        L_0x0116:
            r6 = r2
            r7 = r3
            r8 = r4
            r2 = 0
            r9 = r24
            r10 = r23
            r11 = r5
            r12 = r21
            r4 = r13
            r13 = r20
            r14 = r19
            r15 = r17
            r16 = r0
            boolean r9 = com.google.android.apps.gsa.staticplugins.p7404aq.p7405a.C94056n.m155258a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0139 }
        L_0x012e:
            r4.mo86914c(r3, r9)
        L_0x0131:
            r0 = 334(0x14e, float:4.68E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r0)
        L_0x0136:
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        L_0x0139:
            r0 = move-exception
            goto L_0x013e
        L_0x013b:
            r0 = move-exception
            r4 = r13
            r2 = 0
        L_0x013e:
            r4.mo86914c(r3, r2)
            goto L_0x0143
        L_0x0142:
            throw r0
        L_0x0143:
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7277g.C92298c.mo65234a(com.google.android.apps.gsa.tasks.ak):com.google.common.util.concurrent.cx");
    }
}
