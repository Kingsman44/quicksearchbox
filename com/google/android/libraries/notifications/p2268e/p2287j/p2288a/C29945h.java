package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29824o;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2292g.C30004l;
import com.google.android.libraries.notifications.p2293h.C30011d;
import com.google.android.libraries.notifications.p2293h.C30012e;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30073c;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58847bk;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58557jl;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55538ar;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55563bp;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68815x;

/* renamed from: com.google.android.libraries.notifications.e.j.a.h */
/* compiled from: PG */
public final class C29945h {

    /* renamed from: a */
    public final C58833ax f81088a;

    /* renamed from: b */
    private final Context f81089b;

    /* renamed from: c */
    private final C30075e f81090c;

    public C29945h(Context context, C30075e eVar, C58833ax axVar) {
        this.f81089b = context;
        this.f81090c = eVar;
        this.f81088a = axVar;
    }

    /* renamed from: f */
    private static int m55486f() {
        return Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* renamed from: a */
    public final PendingIntent mo35239a(String str, C29820k kVar, C29827r rVar, C29824o oVar, C30004l lVar) {
        int i;
        int i2;
        C30011d dVar;
        C29944g gVar;
        C29827r rVar2 = rVar;
        int k = oVar.mo35032k();
        int i3 = k - 1;
        if (k != 0) {
            if (i3 != 0) {
                i = 2;
                if (i3 != 1) {
                    i = i3 != 2 ? i3 != 3 ? 0 : 5 : 4;
                }
            } else if (!oVar.mo35026f().isEmpty()) {
                i = 1;
            } else {
                throw new IllegalStateException("ChimeNotificationAction must have an action id or builtInActionType");
            }
            String concat = "com.google.android.libraries.notifications.ACTION_ID:".concat(String.valueOf(oVar.mo35026f()));
            if (i == 1) {
                dVar = ((C30012e) ((C58847bk) this.f81088a).f156646a).mo35327a(rVar2, oVar);
                i2 = 1;
            } else {
                C29824o oVar2 = oVar;
                i2 = i;
                dVar = C30011d.m55652e();
            }
            if (dVar.mo35315c() != 1 || dVar.mo35314b() == null) {
                boolean z = !oVar.mo35030i().isEmpty();
                String a = C68815x.f184891a.mo6453a().mo60498a();
                if (!TextUtils.isEmpty(a)) {
                    Iterator it = C58869cf.m90938d(",").mo56153g(a).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals(oVar.mo35026f())) {
                                gVar = C29944g.ACTIVITY;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                int i4 = oVar.mo35022c().f146605b;
                gVar = C29944g.BROADCAST;
                return mo35243e(str, i2, concat, gVar, kVar, Arrays.asList(new C29827r[]{rVar2}), oVar.mo35022c(), lVar, oVar, 3, z, dVar.mo35313a());
            }
            return mo35242d(str, i2, concat, kVar, Arrays.asList(new C29827r[]{rVar2}), oVar.mo35022c(), dVar.mo35314b(), lVar, 3, dVar.mo35313a());
        }
        throw null;
    }

    /* renamed from: b */
    public final PendingIntent mo35240b(String str, C29820k kVar, List list, C30004l lVar) {
        List list2 = list;
        C30011d b = ((C30012e) ((C58847bk) this.f81088a).f156646a).mo35328b(list2);
        if (b.mo35315c() != 1 || b.mo35314b() == null) {
            boolean isEmpty = ((C29827r) list2.get(0)).mo35052a().f146666g.isEmpty();
            return mo35243e(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", C29944g.BROADCAST, kVar, list, C29950m.m55507a(list), lVar, (C29824o) null, 2, !isEmpty, b.mo35313a());
        }
        return mo35242d(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", kVar, list, C29950m.m55507a(list), b.mo35314b(), lVar, 2, b.mo35313a());
    }

    /* renamed from: c */
    public final PendingIntent mo35241c(String str, C29820k kVar, List list) {
        C29944g gVar = C29944g.BROADCAST;
        C55563bp bpVar = (C55563bp) C55564bq.f146602f.createBuilder();
        bpVar.copyOnWrite();
        C55564bq bqVar = (C55564bq) bpVar.instance;
        bqVar.f146608e = 2;
        bqVar.f146604a |= 8;
        bpVar.copyOnWrite();
        C55564bq bqVar2 = (C55564bq) bpVar.instance;
        bqVar2.f146607d = 2;
        bqVar2.f146604a |= 4;
        return mo35243e(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED", gVar, kVar, list, (C55564bq) bpVar.build(), (C30004l) null, (C29824o) null, 4, false, ((C30012e) ((C58847bk) this.f81088a).f156646a).mo35330d());
    }

    /* renamed from: d */
    public final PendingIntent mo35242d(String str, int i, String str2, C29820k kVar, List list, C55564bq bqVar, List list2, C30004l lVar, int i2, Bundle bundle) {
        int i3 = i;
        String str3 = str2;
        C29820k kVar2 = kVar;
        List list3 = list;
        C58838bb.m90869d(!list2.isEmpty(), "Collaborator intents should not be empty");
        C30058b.m55794f("PendingIntentHelper", "Creating a collaborator pending intent for action [%s] in account [%s]", str3, kVar2 != null ? kVar.mo35009h() : "null");
        Intent intent = (Intent) C58557jl.m90131l(list2);
        if (TextUtils.isEmpty(intent.getIdentifier())) {
            int hashCode = str.hashCode();
            intent.setIdentifier("chime://" + hashCode);
        }
        C29939b.m55465b(intent, kVar);
        intent.putExtra("com.google.android.libraries.notifications.EVENT_TYPE", i);
        intent.putExtra("com.google.android.libraries.notifications.ACTION_ID", str2);
        C29939b.m55469f(intent, bqVar);
        C29939b.m55467d(intent, lVar);
        C29939b.m55472i(intent, i2);
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA", bundle);
        if (list.size() == 1) {
            C29939b.m55468e(intent, (C29827r) list.get(0));
        } else {
            C29939b.m55466c(intent, (C29827r) list.get(0));
        }
        String str4 = str;
        return PendingIntent.getActivities(this.f81089b, C29949l.m55504a(str, str2, i), (Intent[]) list2.toArray(new Intent[0]), m55486f() | 134217728);
    }

    /* renamed from: e */
    public final PendingIntent mo35243e(String str, int i, String str2, C29944g gVar, C29820k kVar, List list, C55564bq bqVar, C30004l lVar, C29824o oVar, int i2, boolean z, Bundle bundle) {
        C29944g gVar2;
        String str3 = str;
        int i3 = i;
        String str4 = str2;
        C29820k kVar2 = kVar;
        List list2 = list;
        C55564bq bqVar2 = bqVar;
        C30058b.m55794f("PendingIntentHelper", "Creating a notification pending intent for action [%s], handler [%s] and handleInForeground [%s] in account [%s]", str4, gVar, Boolean.valueOf(z), kVar2 != null ? kVar.mo35009h() : "null");
        Intent className = new Intent("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT").setClassName(this.f81089b, ((C30073c) ((C30071a) this.f81090c).f81358d).f81377b);
        C29939b.m55465b(className, kVar2);
        className.putExtra("com.google.android.libraries.notifications.EVENT_TYPE", i);
        className.putExtra("com.google.android.libraries.notifications.ACTION_ID", str4);
        C29939b.m55469f(className, bqVar2);
        C29939b.m55467d(className, lVar);
        if (oVar != null) {
            className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION", oVar.mo35133m().toByteArray());
        }
        C29939b.m55472i(className, i2);
        className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA", bundle);
        if (z) {
            gVar2 = C29944g.ACTIVITY;
            className.putExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", true);
        } else {
            gVar2 = gVar;
        }
        if (list.size() == 1) {
            C29939b.m55468e(className, (C29827r) list2.get(0));
        } else {
            C29939b.m55466c(className, (C29827r) list2.get(0));
        }
        if (gVar2 != C29944g.ACTIVITY) {
            int a = C55538ar.m87703a(bqVar2.f146605b);
            if (a != 0 && a == 5) {
                className.addFlags(268435456);
            }
            return PendingIntent.getBroadcast(this.f81089b, C29949l.m55504a(str, str4, i), className, m55486f() | 134217728);
        }
        className.setClassName(this.f81089b, ((C30073c) ((C30071a) this.f81090c).f81358d).f81376a);
        return PendingIntent.getActivity(this.f81089b, C29949l.m55504a(str, str4, i), className, m55486f() | 134217728);
    }
}
