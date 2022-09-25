package com.google.android.apps.gsa.search.shared.actions.util;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.p4152bb.p4153a.C55122gr;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55354pg;
import com.google.p4152bb.p4153a.C55355ph;
import com.google.p4152bb.p4153a.C55360pm;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.p */
/* compiled from: PG */
public final class C87494p {
    /* renamed from: a */
    public static C55361pn m142024a(ResolveInfo resolveInfo, Intent intent, PackageManager packageManager, C55240la laVar) {
        ComponentInfo componentInfo;
        String str;
        String str2;
        String str3 = null;
        if (resolveInfo.activityInfo != null) {
            componentInfo = resolveInfo.activityInfo;
        } else {
            componentInfo = resolveInfo.serviceInfo != null ? resolveInfo.serviceInfo : null;
        }
        C55360pm pmVar = (C55360pm) C55361pn.f145866g.createBuilder();
        if (laVar != null) {
            int i = laVar.f145452b;
            pmVar.copyOnWrite();
            C55361pn pnVar = (C55361pn) pmVar.instance;
            pnVar.f145868a |= 2;
            pnVar.f145870c = i;
            C55122gr grVar = C55122gr.PRIMARY;
            pmVar.copyOnWrite();
            C55361pn pnVar2 = (C55361pn) pmVar.instance;
            pnVar2.f145873f = grVar.f145060e;
            pnVar2.f145868a |= 16;
        }
        C55354pg pgVar = (C55354pg) C55355ph.f145852e.createBuilder();
        if (intent == null) {
            str = null;
        } else {
            str = intent.getPackage();
        }
        if (TextUtils.isEmpty(str)) {
            if (componentInfo == null) {
                str = null;
            } else {
                str = componentInfo.packageName;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            pgVar.copyOnWrite();
            C55355ph phVar = (C55355ph) pgVar.instance;
            str.getClass();
            phVar.f145855a |= 1;
            phVar.f145856b = str;
        }
        if (intent == null || intent.getComponent() == null) {
            str2 = (componentInfo == null || TextUtils.isEmpty(componentInfo.packageName) || TextUtils.isEmpty(componentInfo.name)) ? null : new ComponentName(componentInfo.packageName, componentInfo.name).flattenToString();
        } else {
            str2 = intent.getComponent().flattenToString();
        }
        if (!TextUtils.isEmpty(str2)) {
            pgVar.copyOnWrite();
            C55355ph phVar2 = (C55355ph) pgVar.instance;
            str2.getClass();
            phVar2.f145855a |= 2;
            phVar2.f145857c = str2;
        }
        if (intent.hasCategory("android.intent.category.VOICE")) {
            pgVar.copyOnWrite();
            C55355ph phVar3 = (C55355ph) pgVar.instance;
            phVar3.f145855a |= 4;
            phVar3.f145858d = true;
        }
        pmVar.mo58885m(C55355ph.f145853f, (C55355ph) pgVar.build());
        if (componentInfo != null) {
            str3 = componentInfo.loadLabel(packageManager).toString();
        }
        if (TextUtils.isEmpty(str3) && "com.google.android.gm".equals(str)) {
            str3 = "Gmail";
        }
        if (str3 != null) {
            pmVar.copyOnWrite();
            C55361pn pnVar3 = (C55361pn) pmVar.instance;
            pnVar3.f145868a |= 1;
            pnVar3.f145869b = str3;
        }
        return (C55361pn) pmVar.build();
    }

    /* renamed from: b */
    public static C55361pn m142025b(List list, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55361pn pnVar = (C55361pn) it.next();
            if (str.equals(m142026c(pnVar))) {
                return pnVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m142026c(C55361pn pnVar) {
        Object obj;
        if (pnVar == null) {
            return null;
        }
        C62940bt r1 = C62942bv.checkIsLite(C55355ph.f145853f);
        pnVar.mo58887l(r1);
        if (!pnVar.f169962ag.mo58857o(r1.f169971d)) {
            return null;
        }
        C62940bt r0 = C62942bv.checkIsLite(C55355ph.f145853f);
        pnVar.mo58887l(r0);
        Object l = pnVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        return ((C55355ph) obj).f145856b;
    }
}
