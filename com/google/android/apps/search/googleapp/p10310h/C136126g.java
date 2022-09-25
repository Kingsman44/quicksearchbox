package com.google.android.apps.search.googleapp.p10310h;

import android.content.Intent;
import android.net.Uri;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.h.g */
/* compiled from: PG */
public final class C136126g {

    /* renamed from: a */
    public static final C58974d f370751a = C58974d.m91135i("GAAIntentParser");

    /* renamed from: a */
    public static Optional m221187a(Intent intent) {
        Optional d = m221190d(intent, "discover_intent_options");
        if (d.isPresent()) {
            try {
                return Optional.m71637of((C136123d) C62942bv.parseFrom((C62942bv) C136123d.f370743d, C59326i.f157516d.mo56836k((CharSequence) d.get()), C62921ba.m95368a()));
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) f370751a.mo56225c()).mo56382g(e)).mo56372aa(40567)).mo56386p("Error parsing DiscoverIntentOptions proto");
            }
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public static Optional m221188b(Intent intent) {
        if (intent.hasExtra("pixel_launcher_data")) {
            try {
                return Optional.m71637of((C136135p) ProtoParsers.m95520c(intent.getExtras(), "pixel_launcher_data", C136135p.f370764b, C62921ba.m95368a()));
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) f370751a.mo56225c()).mo56382g(e)).mo56372aa(40570)).mo56386p("Error parsing PixelLauncherData proto");
            }
        }
        return Optional.empty();
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p3186j$.util.Optional m221189c(android.content.Intent r5) {
        /*
            java.lang.String r0 = "is-ash-assistant-entrypoint"
            java.lang.String r1 = "ga_query_options"
            j$.util.Optional r1 = m221190d(r5, r1)
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L_0x008a
            com.google.common.l.i r2 = com.google.common.p4541l.C59326i.f157516d     // Catch:{ ct -> 0x007b }
            java.lang.Object r1 = r1.get()     // Catch:{ ct -> 0x007b }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ ct -> 0x007b }
            byte[] r1 = r2.mo56836k(r1)     // Catch:{ ct -> 0x007b }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x007b }
            com.google.android.apps.search.googleapp.search.e.g r3 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ ct -> 0x007b }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r1, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x007b }
            com.google.android.apps.search.googleapp.search.e.g r1 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r1     // Catch:{ ct -> 0x007b }
            int r2 = r5.getFlags()     // Catch:{ ct -> 0x007b }
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r3
            r4 = 1
            if (r2 != r3) goto L_0x004b
            com.google.protobuf.bn r1 = r1.toBuilder()     // Catch:{ ct -> 0x007b }
            com.google.android.apps.search.googleapp.search.e.e r1 = (com.google.android.apps.search.googleapp.search.p10409e.C137416e) r1     // Catch:{ ct -> 0x007b }
            r1.copyOnWrite()     // Catch:{ ct -> 0x007b }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ ct -> 0x007b }
            com.google.android.apps.search.googleapp.search.e.g r2 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r2     // Catch:{ ct -> 0x007b }
            int r3 = r2.f373769a     // Catch:{ ct -> 0x007b }
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r2.f373769a = r3     // Catch:{ ct -> 0x007b }
            r2.f373784p = r4     // Catch:{ ct -> 0x007b }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ ct -> 0x007b }
            com.google.android.apps.search.googleapp.search.e.g r1 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r1     // Catch:{ ct -> 0x007b }
        L_0x004b:
            boolean r2 = r5.hasExtra(r0)     // Catch:{ ct -> 0x007b }
            if (r2 == 0) goto L_0x0076
            com.google.protobuf.bn r1 = r1.toBuilder()     // Catch:{ ct -> 0x007b }
            com.google.android.apps.search.googleapp.search.e.e r1 = (com.google.android.apps.search.googleapp.search.p10409e.C137416e) r1     // Catch:{ ct -> 0x007b }
            java.lang.String r2 = "source"
            java.lang.String r3 = "and.opa.ash"
            r1.mo113714b(r2, r3)     // Catch:{ ct -> 0x007b }
            java.lang.String r2 = "ash_mode"
            r3 = 0
            boolean r5 = r5.getBooleanExtra(r0, r3)     // Catch:{ ct -> 0x007b }
            if (r4 == r5) goto L_0x006a
            java.lang.String r5 = "1"
            goto L_0x006c
        L_0x006a:
            java.lang.String r5 = "0"
        L_0x006c:
            r1.mo113714b(r2, r5)     // Catch:{ ct -> 0x007b }
            com.google.protobuf.bv r5 = r1.build()     // Catch:{ ct -> 0x007b }
            r1 = r5
            com.google.android.apps.search.googleapp.search.e.g r1 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r1     // Catch:{ ct -> 0x007b }
        L_0x0076:
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r1)     // Catch:{ ct -> 0x007b }
            return r5
        L_0x007b:
            r5 = move-exception
            com.google.common.f.a.d r0 = f370751a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Error parsing QueryOptions proto"
            r2 = 40572(0x9e7c, float:5.6853E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56382g(r5)).mo56372aa(r2)).mo56386p(r1)
        L_0x008a:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10310h.C136126g.m221189c(android.content.Intent):j$.util.Optional");
    }

    /* renamed from: d */
    public static Optional m221190d(Intent intent, String str) {
        Uri data = intent.getData();
        if (data != null) {
            return Optional.ofNullable(data.getQueryParameter(str));
        }
        ((C58970a) ((C58970a) f370751a.mo56226d()).mo56372aa(40573)).mo56386p("intent does not contains data");
        return Optional.empty();
    }

    /* renamed from: e */
    public static Optional m221191e(Intent intent) {
        Optional optional;
        try {
            optional = m221190d(intent, "tab_type").map(C136125f.f370750a);
        } catch (NumberFormatException e) {
            try {
                ((C58970a) ((C58970a) ((C58970a) f370751a.mo56226d()).mo56382g(e)).mo56372aa(40569)).mo56386p("Integer parameter is not an integer.");
                optional = Optional.empty();
            } catch (IllegalArgumentException e2) {
                ((C58970a) ((C58970a) ((C58970a) f370751a.mo56226d()).mo56382g(e2)).mo56372aa(40574)).mo56386p("Cannot convert tab to enum");
                return Optional.empty();
            }
        }
        return optional.map(C136124e.f370749a);
    }

    /* renamed from: f */
    public static String m221192f(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        return data.getQueryParameter("tab_persistence_id");
    }

    /* renamed from: g */
    public static boolean m221193g(Intent intent) {
        return "android.intent.action.MAIN".equals(intent.getAction()) && intent.hasCategory("android.intent.category.LAUNCHER");
    }

    /* renamed from: h */
    public static boolean m221194h(Intent intent) {
        return intent.getBooleanExtra("open_account_menu_on_start", false);
    }

    /* renamed from: i */
    public static void m221195i(Intent intent) {
        intent.removeExtra("open_account_menu_on_start");
    }
}
