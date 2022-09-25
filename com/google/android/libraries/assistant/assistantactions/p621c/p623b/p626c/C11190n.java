package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import android.content.Context;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11203a;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p627d.C11204b;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52155hg;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.n */
/* compiled from: PG */
public final class C11190n implements C11204b {

    /* renamed from: a */
    private static final C59071e f36593a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.c.n");

    /* renamed from: b */
    private static final Map f36594b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("fluid_action_id_next", m26521b("media.NEXT"));
        gzVar.mo55429h("fluid_action_id_prev", m26521b("media.PREVIOUS"));
        gzVar.mo55429h("fluid_action_id_pause", m26521b("media.PAUSE"));
        gzVar.mo55429h("fluid_action_id_play", m26521b("media.RESUME"));
        f36594b = gzVar.mo55427f(false);
    }

    /* renamed from: b */
    private static C51809dy m26521b(String str) {
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52155hg hgVar = (C52155hg) C52159hk.f136860e.createBuilder();
        hgVar.copyOnWrite();
        C52159hk hkVar = (C52159hk) hgVar.instance;
        hkVar.f136865d = 1;
        hkVar.f136862a |= 16;
        dvVar.mo53733c(C11209d.m26587q("common_media_control_args", "assistant.api.client_op.media_args", hgVar.build()));
        return C11209d.m26574d(str, (C51807dw) dvVar.build());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[SYNTHETIC, Splitter:B:24:0x0052] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo19603a(android.content.Context r4, com.google.assistant.p3897e.p3921j.C52081en r5, com.google.android.libraries.assistant.assistantactions.p620b.C11054a r6) {
        /*
            r3 = this;
            com.google.protobuf.cq r4 = r5.f136684d
            int r4 = r4.size()
            r6 = 1
            if (r4 != r6) goto L_0x0047
            com.google.protobuf.cq r4 = r5.f136684d
            java.lang.Object r4 = com.google.common.p4522b.C58557jl.m90133n(r4)
            com.google.assistant.e.j.ep r4 = (com.google.assistant.p3897e.p3921j.C52083ep) r4
            int r0 = r4.f136692b
            r1 = 3
            if (r0 != r1) goto L_0x001b
            java.lang.Object r0 = r4.f136693c
            com.google.assistant.e.j.ek r0 = (com.google.assistant.p3897e.p3921j.C52078ek) r0
            goto L_0x001d
        L_0x001b:
            com.google.assistant.e.j.ek r0 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x001d:
            int r0 = r0.f136674b
            r2 = 5
            if (r0 != r2) goto L_0x0047
            int r0 = r4.f136692b
            if (r0 != r1) goto L_0x002b
            java.lang.Object r4 = r4.f136693c
            com.google.assistant.e.j.ek r4 = (com.google.assistant.p3897e.p3921j.C52078ek) r4
            goto L_0x002d
        L_0x002b:
            com.google.assistant.e.j.ek r4 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x002d:
            int r0 = r4.f136674b
            if (r0 != r2) goto L_0x0036
            java.lang.Object r4 = r4.f136675c
            com.google.assistant.e.j.du r4 = (com.google.assistant.p3897e.p3921j.C51805du) r4
            goto L_0x0038
        L_0x0036:
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0038:
            java.lang.String r0 = "ui.TAP"
            java.lang.String r1 = r4.f135927b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x0049
        L_0x0047:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
        L_0x0049:
            boolean r0 = r4.mo56113h()
            if (r0 != 0) goto L_0x0052
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            return r4
        L_0x0052:
            java.lang.Object r4 = r4.mo56107c()     // Catch:{ ct -> 0x00b0 }
            com.google.assistant.e.j.du r4 = (com.google.assistant.p3897e.p3921j.C51805du) r4     // Catch:{ ct -> 0x00b0 }
            java.lang.String r0 = "tap_input"
            com.google.protobuf.dn r4 = r4.f135929d     // Catch:{ ct -> 0x00b0 }
            boolean r1 = r4.containsKey(r0)     // Catch:{ ct -> 0x00b0 }
            if (r1 == 0) goto L_0x00aa
            java.lang.Object r4 = r4.get(r0)     // Catch:{ ct -> 0x00b0 }
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4     // Catch:{ ct -> 0x00b0 }
            com.google.protobuf.z r4 = r4.f137061c     // Catch:{ ct -> 0x00b0 }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00b0 }
            com.google.assistant.e.j.lo r1 = com.google.assistant.p3897e.p3921j.C52271lo.f137214c     // Catch:{ ct -> 0x00b0 }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (com.google.protobuf.C63088z) r4, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x00b0 }
            com.google.assistant.e.j.lo r4 = (com.google.assistant.p3897e.p3921j.C52271lo) r4     // Catch:{ ct -> 0x00b0 }
            java.lang.String r0 = r4.f137217b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0081
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            return r4
        L_0x0081:
            java.util.Map r0 = f36594b
            java.lang.String r4 = r4.f137217b
            java.lang.Object r4 = r0.get(r4)
            com.google.assistant.e.j.dy r4 = (com.google.assistant.p3897e.p3921j.C51809dy) r4
            if (r4 == 0) goto L_0x00a7
            com.google.assistant.e.j.dy[] r6 = new com.google.assistant.p3897e.p3921j.C51809dy[r6]
            r0 = 0
            r6[r0] = r4
            java.util.List r4 = java.util.Arrays.asList(r6)
            com.google.assistant.e.j.ex r5 = r5.f136685e
            if (r5 != 0) goto L_0x009c
            com.google.assistant.e.j.ex r5 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x009c:
            com.google.common.b.pz r6 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.e.a.j r4 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26566b(r4, r6, r5)
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            return r4
        L_0x00a7:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            return r4
        L_0x00aa:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ ct -> 0x00b0 }
            r4.<init>()     // Catch:{ ct -> 0x00b0 }
            throw r4     // Catch:{ ct -> 0x00b0 }
        L_0x00b0:
            r4 = move-exception
            com.google.common.f.e r5 = f36593a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "Error while parsing TapInput proto."
            r0 = 43077(0xa845, float:6.0364E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r0)).mo56386p(r6)
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11190n.mo19603a(android.content.Context, com.google.assistant.e.j.en, com.google.android.libraries.assistant.assistantactions.b.a):com.google.common.base.ax");
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo19605d(Context context, C52081en enVar, C11054a aVar) {
        return C11203a.m26543a(this, context, enVar, aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C60870cx mo19606e(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar, C11054a aVar) {
        return C11203a.m26544b(this, context, ffVar, uhVar, exVar);
    }

    /* renamed from: f */
    public final /* synthetic */ C58833ax mo19607f(Context context, C51953ff ffVar, C52507uh uhVar, C52091ex exVar) {
        return C58836b.f156633a;
    }
}
