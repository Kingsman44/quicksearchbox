package com.google.android.apps.gsa.search.core.preferences;

import android.app.NotificationChannel;
import android.content.Context;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91385o;
import com.google.android.apps.p489g.p491b.p492a.C9124b;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C8090vd;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56992b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.f */
/* compiled from: PG */
public final class C86315f {

    /* renamed from: a */
    private static final C59071e f233375a = C59071e.m91332i("com.google.android.apps.gsa.search.core.preferences.f");

    /* renamed from: a */
    public static NotificationChannel m139019a(String str, String str2, int i) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setShowBadge(false);
        return notificationChannel;
    }

    /* renamed from: b */
    public static String m139020b(C8090vd vdVar) {
        try {
            return Integer.toString(((C9124b) C62942bv.parseFrom((C62942bv) C9124b.f31408b, vdVar.toByteString())).f31410a);
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f233375a.mo56226d()).mo56382g(e)).mo56372aa(8303)).mo56386p("protobuffer parsing exception which should never happen.");
            int a = C56992b.m88249a(vdVar.f28452b);
            if (a == 0) {
                a = 1;
            }
            return Integer.toString(a - 1);
        }
    }

    /* renamed from: c */
    public static void m139021c(Context context, C91385o oVar, C58833ax axVar) {
        oVar.mo85701c(m139019a(Integer.toString(27), context.getResources().getString(R.string.miscellaneous_notification_channel), axVar.mo56113h() ? ((Integer) axVar.mo56107c()).intValue() : 2));
    }
}
