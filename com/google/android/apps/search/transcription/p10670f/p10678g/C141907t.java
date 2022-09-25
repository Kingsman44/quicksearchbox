package com.google.android.apps.search.transcription.p10670f.p10678g;

import android.os.Bundle;
import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.android.apps.search.transcription.p10670f.C141806ay;
import com.google.android.apps.search.transcription.p10670f.C141848bp;
import com.google.android.apps.search.transcription.p10670f.C141851bs;
import com.google.android.apps.search.transcription.p10670f.C141921o;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4575r.C60752i;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.speech.p5218j.C67087ko;
import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.transcription.f.g.t */
/* compiled from: PG */
final class C141907t implements C141848bp {

    /* renamed from: a */
    final /* synthetic */ C141908u f385028a;

    /* renamed from: b */
    final /* synthetic */ C141851bs f385029b;

    /* renamed from: c */
    final /* synthetic */ C141909v f385030c;

    public C141907t(C141909v vVar, C141908u uVar, C141851bs bsVar) {
        this.f385030c = vVar;
        this.f385028a = uVar;
        this.f385029b = bsVar;
    }

    /* renamed from: a */
    public final void mo116727a() {
        this.f385028a.mo20699d();
        this.f385030c.f385037g.f385010a.mo19974a(C37206a.f98788k);
        this.f385030c.f385035e.ifPresent(C141900m.f385021a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r7.f385029b.mo116839u() != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r7.f385030c.f385036f.ifPresent(new com.google.android.apps.search.transcription.p10670f.p10678g.C141905r());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r0 != 2) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r7.f385028a.mo20700e(r2);
        r7.f385030c.f385034d.remove(r7.f385028a);
        r7.f385030c.f385037g.mo116871a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r0 = r7.f385030c.f385033c;
        r0.f385006a.mo19398a(com.google.apps.tiktok.tracing.C47810es.m84977q(new com.google.android.apps.search.transcription.p10670f.p10678g.C141889b(r0, new com.google.android.apps.search.transcription.p10670f.p10678g.C141906s(r7, r7.f385028a, r2, r8))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116728b(com.google.android.apps.search.transcription.p10666b.C141760s r8) {
        /*
            r7 = this;
            com.google.android.apps.search.transcription.b.b r0 = r8.f384731a
            int r0 = r0.mo116705d()
            int r1 = r0 + -1
            if (r0 == 0) goto L_0x009a
            r2 = 3
            r3 = 2
            r4 = 5
            switch(r1) {
                case 0: goto L_0x005b;
                case 1: goto L_0x005b;
                case 2: goto L_0x004e;
                case 3: goto L_0x0045;
                case 4: goto L_0x005b;
                case 5: goto L_0x0043;
                case 6: goto L_0x005b;
                case 7: goto L_0x0041;
                case 8: goto L_0x005c;
                case 9: goto L_0x005b;
                case 10: goto L_0x005b;
                case 11: goto L_0x002e;
                case 12: goto L_0x0043;
                case 13: goto L_0x0041;
                case 14: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x005b
        L_0x0011:
            com.google.android.apps.search.transcription.b.b r1 = r8.f384731a
            int r2 = r1.mo116703a()
            r1 = 12
            if (r2 == r1) goto L_0x005c
            r1 = 13
            if (r2 == r1) goto L_0x005c
            com.google.common.f.e r1 = com.google.android.apps.search.transcription.p10670f.p10678g.C141909v.f385031a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r5 = "Invalid error code for LANGUAGE_PACK_ERROR: %d"
            r6 = 41934(0xa3ce, float:5.8762E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r6)).mo56387q(r5, r2)
            goto L_0x005b
        L_0x002e:
            com.google.android.apps.search.transcription.f.bs r1 = r7.f385029b
            boolean r1 = r1.mo116839u()
            if (r1 == 0) goto L_0x0043
            com.google.android.apps.search.transcription.b.b r1 = r8.f384731a
            int r1 = r1.mo116703a()
            if (r1 != r3) goto L_0x005b
            r2 = 8
            goto L_0x005c
        L_0x0041:
            r2 = 7
            goto L_0x005c
        L_0x0043:
            r2 = 2
            goto L_0x005c
        L_0x0045:
            com.google.android.apps.search.transcription.f.bs r1 = r7.f385029b
            boolean r1 = r1.mo116839u()
            if (r1 == 0) goto L_0x0043
            goto L_0x005b
        L_0x004e:
            com.google.android.apps.search.transcription.b.b r1 = r8.f384731a
            int r1 = r1.mo116703a()
            r4 = 102(0x66, float:1.43E-43)
            if (r1 != r4) goto L_0x005c
            r2 = 9
            goto L_0x005c
        L_0x005b:
            r2 = 5
        L_0x005c:
            com.google.android.apps.search.transcription.f.g.v r1 = r7.f385030c
            j$.util.Optional r1 = r1.f385036f
            com.google.android.apps.search.transcription.f.g.r r4 = new com.google.android.apps.search.transcription.f.g.r
            r4.<init>()
            r1.ifPresent(r4)
            if (r0 != r3) goto L_0x0080
            com.google.android.apps.search.transcription.f.g.u r0 = r7.f385028a
            r0.mo20700e(r2)
            com.google.android.apps.search.transcription.f.g.v r0 = r7.f385030c
            j$.util.concurrent.ConcurrentHashMap r0 = r0.f385034d
            com.google.android.apps.search.transcription.f.g.u r1 = r7.f385028a
            r0.remove(r1)
            com.google.android.apps.search.transcription.f.g.v r0 = r7.f385030c
            com.google.android.apps.search.transcription.f.g.e r0 = r0.f385037g
            r0.mo116871a(r8)
            return
        L_0x0080:
            com.google.android.apps.search.transcription.f.g.v r0 = r7.f385030c
            com.google.android.apps.search.transcription.f.g.c r0 = r0.f385033c
            com.google.android.apps.search.transcription.f.g.u r1 = r7.f385028a
            com.google.android.apps.search.transcription.f.g.s r3 = new com.google.android.apps.search.transcription.f.g.s
            r3.<init>(r7, r1, r2, r8)
            com.google.common.util.concurrent.db r8 = r0.f385006a
            com.google.android.apps.search.transcription.f.g.b r1 = new com.google.android.apps.search.transcription.f.g.b
            r1.<init>(r0, r3)
            java.lang.Runnable r0 = com.google.apps.tiktok.tracing.C47810es.m84977q(r1)
            r8.mo19398a(r0)
            return
        L_0x009a:
            r8 = 0
            goto L_0x009d
        L_0x009c:
            throw r8
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.transcription.p10670f.p10678g.C141907t.mo116728b(com.google.android.apps.search.transcription.b.s):void");
    }

    /* renamed from: c */
    public final void mo116729c(C141760s sVar) {
        this.f385030c.f385037g.f385010a.mo19974a(C37206a.f98797t.mo40810a(sVar.f384731a.mo116703a(), sVar.f384731a.mo116704c()));
    }

    /* renamed from: d */
    public final /* synthetic */ void mo116730d() {
    }

    /* renamed from: e */
    public final void mo116731e(C141806ay ayVar) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("results_recognition", C58597ky.m90212c(ayVar.f384848b));
        bundle.putStringArrayList("android.speech.extra.UNSTABLE_TEXT", C58597ky.m90212c(ayVar.f384849c));
        this.f385030c.f385035e.ifPresent(new C141903p());
        this.f385028a.mo20701f(bundle);
    }

    /* renamed from: f */
    public final void mo116732f() {
        if (this.f385029b.mo116836r()) {
            this.f385028a.mo20698c();
        }
        this.f385030c.f385034d.remove(this.f385028a);
        this.f385030c.f385036f.ifPresent(C141902o.f385023a);
        this.f385030c.f385037g.f385010a.mo19974a(C37206a.f98786i.mo40805c(C62722b.OK));
    }

    /* renamed from: g */
    public final void mo116733g(C141921o oVar) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("results_recognition", new ArrayList(oVar.f385104a));
        if (oVar.f385106c.size() > 0) {
            bundle.putParcelableArrayList("results_alternatives", (ArrayList) Collection.EL.stream(oVar.f385106c).map(C141894g.f385011a).collect(Collectors.toCollection(C141895h.f385012a)));
        }
        if (oVar.f385105b.size() > 0) {
            bundle.putFloatArray("confidence_scores", C60752i.m92732f(oVar.f385105b));
        }
        if (this.f385029b.mo116836r()) {
            this.f385028a.mo20705j(bundle);
        } else {
            this.f385028a.mo20703h(bundle);
        }
        this.f385030c.f385035e.ifPresent(new C141904q());
    }

    /* renamed from: h */
    public final void mo116734h(C67087ko koVar) {
        Bundle bundle = new Bundle();
        ProtoParsers.m95532o(bundle, "soda_event", koVar);
        this.f385028a.mo20701f(bundle);
    }

    /* renamed from: i */
    public final void mo116735i() {
        this.f385028a.mo20697b();
        this.f385030c.f385037g.f385010a.mo19974a(C37206a.f98787j);
        this.f385030c.f385035e.ifPresent(C141901n.f385022a);
    }
}
