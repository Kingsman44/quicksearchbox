package com.google.android.apps.search.googleapp.promomanager.p10377f.p10378a;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56992b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4900a.C63864f;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.a.h */
/* compiled from: PG */
final class C137064h implements C137057a {

    /* renamed from: a */
    private static final C59071e f372998a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.a.h");

    /* renamed from: b */
    private final Fragment f372999b;

    /* renamed from: c */
    private final Context f373000c;

    public C137064h(Fragment fragment) {
        this.f372999b = fragment;
        this.f373000c = fragment.getContext();
    }

    /* renamed from: a */
    public final boolean mo113483a(C63944h hVar) {
        Object obj;
        C59052c cVar = (C59052c) ((C59052c) f372998a.mo56224b()).mo56372aa(40921);
        C63943g a = C63943g.m96323a(hVar.f172935a);
        if (a == null) {
            a = C63943g.TYPE_UNSPECIFIED;
        }
        cVar.mo56389s("#executeAction(%s)", a.name());
        C62940bt r0 = C62942bv.checkIsLite(C63864f.f172693d);
        hVar.mo58887l(r0);
        Object l = hVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C63864f fVar = (C63864f) obj;
        if ((fVar.f172695a & 1) == 0 || !C1793aj.m4937b(new C1800aq(this.f373000c).f5622a)) {
            C47709i.m84861a(this.f372999b, new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", this.f373000c.getApplicationInfo().packageName));
            return true;
        }
        String str = fVar.f172696b;
        try {
            int parseInt = Integer.parseInt(str);
            if (C56992b.m88249a(parseInt) != 0) {
                if (parseInt != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("importance");
                    Intent putExtra = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", this.f373000c.getApplicationInfo().packageName).putExtra("android.provider.extra.CHANNEL_ID", str);
                    putExtra.putStringArrayListExtra("android.provider.extra.CHANNEL_FILTER_LIST", arrayList);
                    C47709i.m84861a(this.f372999b, putExtra);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
        }
        return false;
    }
}
