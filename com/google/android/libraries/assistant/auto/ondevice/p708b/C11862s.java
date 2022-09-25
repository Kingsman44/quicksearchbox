package com.google.android.libraries.assistant.auto.ondevice.p708b;

import android.text.TextUtils;
import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15670b;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52155hg;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.grammar.pumpkin.C66525q;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.s */
/* compiled from: PG */
public final class C11862s implements a {

    /* renamed from: a */
    public static final C58974d f38197a = C58974d.m91134h("MediaControlBuilder");

    /* renamed from: d */
    public static C58833ax m27620d(String str) {
        if (TextUtils.isEmpty(str)) {
            return C58836b.f156633a;
        }
        C52155hg hgVar = (C52155hg) C52159hk.f136860e.createBuilder();
        hgVar.copyOnWrite();
        C52159hk hkVar = (C52159hk) hgVar.instance;
        hkVar.f136864c = 2;
        hkVar.f136862a |= 4;
        C58485gu n = C58485gu.m89846n(C15670b.m32466a(str, "common_media_control_args", "assistant.api.client_op.CommonMediaControlArgs", (C52159hk) hgVar.build()));
        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
        C52081en b = C15669a.m32463b(n, Arrays.asList(new Integer[]{23164}));
        eVar.copyOnWrite();
        C51195j jVar = (C51195j) eVar.instance;
        b.getClass();
        jVar.f133275j = b;
        jVar.f133266a |= 128;
        return C58833ax.m90834k((C51195j) eVar.build());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo20245a(com.google.knowledge.p4661a.p4662a.C61752n r6, com.google.android.apps.gsa.shared.search.Query r7) {
        /*
            r5 = this;
            java.lang.String r7 = r6.f166811b
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1090849647: goto L_0x0036;
                case -365932152: goto L_0x002c;
                case 515454733: goto L_0x0022;
                case 799095313: goto L_0x0018;
                case 870216797: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r0 = "StopPlayback"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 4
            goto L_0x0041
        L_0x0018:
            java.lang.String r0 = "PausePlayback"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 3
            goto L_0x0041
        L_0x0022:
            java.lang.String r0 = "PreviousMedia"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 1
            goto L_0x0041
        L_0x002c:
            java.lang.String r0 = "ResumePlayback"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 2
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "NextMedia"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 0
            goto L_0x0041
        L_0x0040:
            r7 = -1
        L_0x0041:
            if (r7 == 0) goto L_0x0082
            if (r7 == r4) goto L_0x007b
            if (r7 == r3) goto L_0x0074
            if (r7 == r2) goto L_0x006d
            if (r7 == r1) goto L_0x0066
            com.google.common.f.a.d r7 = f38197a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7
            r0 = 43610(0xaa5a, float:6.111E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r0)
            com.google.common.f.a.a r7 = (com.google.common.p4526f.p4527a.C58970a) r7
            java.lang.String r0 = "IntentQuery is not related to media control or is not supported: %s"
            java.lang.String r6 = r6.f166811b
            r7.mo56389s(r0, r6)
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
            goto L_0x0088
        L_0x0066:
            java.lang.String r6 = "media.STOP"
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x0088
        L_0x006d:
            java.lang.String r6 = "media.PAUSE"
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x0088
        L_0x0074:
            java.lang.String r6 = "media.RESUME"
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x0088
        L_0x007b:
            java.lang.String r6 = "media.PREVIOUS"
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x0088
        L_0x0082:
            java.lang.String r6 = "media.NEXT"
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
        L_0x0088:
            java.lang.String r7 = ""
            java.lang.Object r6 = r6.mo56109e(r7)
            java.lang.String r6 = (java.lang.String) r6
            com.google.common.base.ax r6 = m27620d(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11862s.mo20245a(com.google.knowledge.a.a.n, com.google.android.apps.gsa.shared.search.Query):com.google.common.base.ax");
    }

    /* renamed from: b */
    public final C60870cx mo20246b(C66525q qVar, Query query) {
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: c */
    public final C60870cx mo20247c(C52081en enVar) {
        return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
    }
}
