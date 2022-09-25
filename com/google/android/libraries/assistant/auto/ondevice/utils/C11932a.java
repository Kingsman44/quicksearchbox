package com.google.android.libraries.assistant.auto.ondevice.utils;

import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52649zo;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.assistant.p3897e.p3921j.aep;
import com.google.assistant.p3897e.p3921j.aeq;
import com.google.assistant.p3897e.p3921j.aer;
import com.google.assistant.p3897e.p3921j.aet;
import com.google.assistant.p3897e.p3921j.aeu;
import com.google.assistant.p3897e.p3921j.aey;
import com.google.assistant.p3897e.p3921j.aez;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.a */
/* compiled from: PG */
public final class C11932a {
    /* renamed from: a */
    public static C51809dy m27748a(String str, String str2, String str3, C63088z zVar) {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = str;
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str2;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = str3;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        zVar.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = zVar;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        dvVar.mo53732b(kbVar);
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: b */
    public static C51809dy m27749b(aet aet, boolean z) {
        aer aer = (aer) aeu.f134959h.createBuilder();
        aer.copyOnWrite();
        aeu aeu = (aeu) aer.instance;
        aeu.f134961a |= 1;
        aeu.f134962b = true;
        aer.copyOnWrite();
        aeu aeu2 = (aeu) aer.instance;
        aeu2.f134963c = aet.f134958c;
        aeu2.f134961a |= 2;
        aer.copyOnWrite();
        aeu aeu3 = (aeu) aer.instance;
        aeu3.f134961a |= 4;
        aeu3.f134964d = z;
        return m27748a("notification.FETCH", "notification_fetch_args", "assistant.api.client_op.NotificationFetchArgs", ((aeu) aer.build()).toByteString());
    }

    /* renamed from: c */
    public static C51809dy m27750c(int i, boolean z, boolean z2) {
        aep aep = (aep) aeq.f134947f.createBuilder();
        aep.copyOnWrite();
        aeq aeq = (aeq) aep.instance;
        aeq.f134949a |= 1;
        aeq.f134950b = i;
        aep.copyOnWrite();
        aeq aeq2 = (aeq) aep.instance;
        aeq2.f134949a |= 2;
        aeq2.f134951c = z;
        aep.copyOnWrite();
        aeq aeq3 = (aeq) aep.instance;
        aeq3.f134949a |= 4;
        aeq3.f134952d = z2;
        return m27748a("notification.MARK_AS_READ", "mark_notification_as_read_args", "assistant.api.client_op.MarkNotificationAsReadArgs", ((aeq) aep.build()).toByteString());
    }

    /* renamed from: d */
    public static C51809dy m27751d() {
        C52649zo zoVar = (C52649zo) C52654zt.f138233e.createBuilder();
        zoVar.copyOnWrite();
        C52654zt ztVar = (C52654zt) zoVar.instance;
        ztVar.f138236b = 1;
        ztVar.f138235a |= 1;
        zoVar.copyOnWrite();
        C52654zt ztVar2 = (C52654zt) zoVar.instance;
        ztVar2.f138237c = 1;
        ztVar2.f138235a |= 2;
        zoVar.copyOnWrite();
        C52654zt ztVar3 = (C52654zt) zoVar.instance;
        ztVar3.f138238d = 0;
        ztVar3.f138235a |= 8;
        return m27748a("mic.UPDATE", "mic_behavior_args", "assistant.api.client_op.MicBehaviorArgs", ((C52654zt) zoVar.build()).toByteString());
    }

    /* renamed from: e */
    public static C51809dy m27752e(int i) {
        aey aey = (aey) aez.f134976g.createBuilder();
        aey.copyOnWrite();
        aez aez = (aez) aey.instance;
        aez.f134978a |= 1;
        aez.f134979b = i;
        aey.copyOnWrite();
        aez aez2 = (aez) aey.instance;
        aez2.f134978a |= 4;
        aez2.f134980c = true;
        return m27748a("notification.READ", "notification_read_args", "assistant.api.client_op.NotificationReadArgs", ((aez) aey.build()).toByteString());
    }

    /* renamed from: f */
    public static List m27753f(Resources resources) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C15669a.m32462a(resources.getString(R.string.general_bailout)));
        return arrayList;
    }

    /* renamed from: g */
    public static List m27754g(String str) {
        return Arrays.asList(new C51809dy[]{C15669a.m32462a(str), m27751d()});
    }
}
