package com.google.android.apps.gsa.assistant.handoff;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.t */
/* compiled from: PG */
public final class C9487t extends C9444aa {

    /* renamed from: a */
    static final C58485gu f32927a = C58485gu.m89850r("/food/browsemenu", "/food/cart", "/food/chooseprovider", "/food/selectaddress", "/food/checkout");

    /* renamed from: b */
    static final C58485gu f32928b = C58485gu.m89847o("ondemandplatform.google.com", "food.sandbox.google.com");

    public C9487t() {
        super(C9493z.FOOD_ORDERING_CART_UPDATED);
    }

    /* renamed from: c */
    private static Intent m24021c(Uri uri) {
        Intent a = C87574a.f236603a.mo83277a(new Intent("android.intent.action.VIEW", uri));
        a.putExtra("full_screen", true);
        a.putExtra("WEBVIEW_SHOW_PROGRESS_BAR", true);
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.assistant.handoff.C9448ae mo17685a(int r9, android.content.Intent r10) {
        /*
            r8 = this;
            com.google.assistant.au.f r9 = com.google.assistant.p3862au.C50522f.f131501d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.au.d r9 = (com.google.assistant.p3862au.C50520d) r9
            com.google.assistant.e.j.sw r0 = com.google.assistant.p3897e.p3921j.C52468sw.f137732c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.su r0 = (com.google.assistant.p3897e.p3921j.C52466su) r0
            java.lang.String r1 = "canceled"
            if (r10 == 0) goto L_0x0026
            java.lang.String r2 = "result"
            java.lang.String r3 = r10.getStringExtra(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.lang.String r2 = r10.getStringExtra(r2)
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            int r3 = r2.hashCode()
            r4 = -1402931637(0xffffffffac60f64b, float:-3.1969035E-12)
            r5 = 0
            r6 = -1
            r7 = 1
            if (r3 == r4) goto L_0x0041
            r4 = -123173735(0xfffffffff8a88499, float:-2.7343602E34)
            if (r3 == r4) goto L_0x0039
            goto L_0x004b
        L_0x0039:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x004b
            r1 = 0
            goto L_0x004c
        L_0x0041:
            java.lang.String r1 = "completed"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = -1
        L_0x004c:
            if (r1 == 0) goto L_0x0070
            if (r1 == r7) goto L_0x0060
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.sw r1 = (com.google.assistant.p3897e.p3921j.C52468sw) r1
            r2 = 3
            r1.f137735b = r2
            int r2 = r1.f137734a
            r2 = r2 | r7
            r1.f137734a = r2
            goto L_0x007f
        L_0x0060:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.sw r1 = (com.google.assistant.p3897e.p3921j.C52468sw) r1
            r2 = 4
            r1.f137735b = r2
            int r2 = r1.f137734a
            r2 = r2 | r7
            r1.f137734a = r2
            goto L_0x0080
        L_0x0070:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.sw r1 = (com.google.assistant.p3897e.p3921j.C52468sw) r1
            r2 = 2
            r1.f137735b = r2
            int r2 = r1.f137734a
            r2 = r2 | r7
            r1.f137734a = r2
        L_0x007f:
            r5 = -1
        L_0x0080:
            com.google.android.apps.gsa.assistant.handoff.z r1 = com.google.android.apps.gsa.assistant.handoff.C9493z.FOOD_ORDERING_CART_UPDATED
            com.google.common.base.ax r1 = r1.f32952k
            com.google.common.base.bk r1 = (com.google.common.base.C58847bk) r1
            java.lang.Object r1 = r1.f156646a
            java.lang.String r1 = (java.lang.String) r1
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.assistant.au.f r2 = (com.google.assistant.p3862au.C50522f) r2
            r2.f131504b = r1
            com.google.protobuf.h r1 = com.google.protobuf.C63070h.f170215c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.protobuf.g r1 = (com.google.protobuf.C63062g) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.protobuf.h r2 = (com.google.protobuf.C63070h) r2
            java.lang.String r3 = "type.googleapis.com/assistant.api.client_input.CartUpdatedInputParam"
            r2.f170217a = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.sw r0 = (com.google.assistant.p3897e.p3921j.C52468sw) r0
            com.google.protobuf.z r0 = r0.toByteString()
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.protobuf.h r2 = (com.google.protobuf.C63070h) r2
            r0.getClass()
            r2.f170218b = r0
            com.google.protobuf.bv r0 = r1.build()
            com.google.protobuf.h r0 = (com.google.protobuf.C63070h) r0
            java.lang.String r1 = "food_ordering_input_params"
            r9.mo53404b(r1, r0)
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90833j(r10)
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.au.f r9 = (com.google.assistant.p3862au.C50522f) r9
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            com.google.android.apps.gsa.assistant.handoff.j r0 = new com.google.android.apps.gsa.assistant.handoff.j
            r0.<init>(r5, r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.handoff.C9487t.mo17685a(int, android.content.Intent):com.google.android.apps.gsa.assistant.handoff.ae");
    }

    /* renamed from: b */
    public final C58833ax mo17686b(Context context, C9447ad adVar) {
        C58833ax c = C9482o.m24015c(adVar);
        if (C9482o.f32916a.contains(adVar.f32864a.getScheme()) && C9482o.f32917b.contains(adVar.f32864a.getHost()) && c.mo56113h()) {
            Uri parse = Uri.parse((String) c.mo56107c());
            if (f32928b.contains(parse.getHost()) && f32927a.contains(parse.getPath())) {
                return C58833ax.m90834k(m24021c(adVar.f32864a));
            }
        }
        C58833ax b = adVar.mo17688b("url", "url");
        return (!adVar.mo17691e("url-handoff", "assistant") || !b.mo56113h() || adVar.mo17689c("feature_namespace").intValue() != 1) ? C58836b.f156633a : C58833ax.m90834k(m24021c(Uri.parse((String) b.mo56107c())));
    }
}
