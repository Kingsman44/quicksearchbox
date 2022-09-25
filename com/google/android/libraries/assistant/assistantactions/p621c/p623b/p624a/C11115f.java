package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telecom.TelecomManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.assistant.p3897e.p3917i.p3918a.C51252av;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.f */
/* compiled from: PG */
public final class C11115f {

    /* renamed from: a */
    private static final C59071e f36435a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.a.f");

    /* renamed from: b */
    private static final C58528ij f36436b = C58528ij.m90012L("vnd.android.cursor.item/vnd.com.whatsapp.voip.call", "vnd.android.cursor.item/vnd.jp.naver.line.android.call.voice", "vnd.android.cursor.item/com.hike.chat.stickers.voice_call");

    /* renamed from: c */
    private static final C58528ij f36437c = C58528ij.m90012L("vnd.android.cursor.item/vnd.com.whatsapp.video.call", "vnd.android.cursor.item/vnd.jp.naver.line.android.call.video", "vnd.android.cursor.item/com.hike.chat.stickers.voice_call");

    /* renamed from: a */
    public static C58833ax m26404a(C51406gn gnVar) {
        Object obj;
        try {
            C51406gn gnVar2 = (C51406gn) C62942bv.parseFrom((C62942bv) C51406gn.f133887s, gnVar.toByteArray(), C62921ba.m95368a());
            C62940bt r0 = C62942bv.checkIsLite(C51252av.f133427f);
            gnVar2.mo58887l(r0);
            if (gnVar2.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r02 = C62942bv.checkIsLite(C51252av.f133427f);
                gnVar2.mo58887l(r02);
                Object l = gnVar2.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj = r02.f169969b;
                } else {
                    obj = r02.mo58889c(l);
                }
                return C58833ax.m90834k((C51252av) obj);
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f36435a.mo56225c()).mo56382g(e)).mo56372aa(42870)).mo56386p("Incompatible CommunicationFluidActionsData proto implementations");
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public static C58833ax m26405b(C52623yp ypVar, String str) {
        for (C52633yz yzVar : m26408e(ypVar)) {
            if ((yzVar.f138194a & 1) != 0 && yzVar.f138195b.equals(str)) {
                C52613yf yfVar = yzVar.f138197d;
                if (yfVar == null) {
                    yfVar = C52613yf.f138138f;
                }
                if ((yfVar.f138140a & 4) != 0) {
                    C58528ij ijVar = f36436b;
                    C52613yf yfVar2 = yzVar.f138197d;
                    if (yfVar2 == null) {
                        yfVar2 = C52613yf.f138138f;
                    }
                    if (ijVar.contains(yfVar2.f138143d)) {
                        C52613yf yfVar3 = yzVar.f138197d;
                        if (yfVar3 == null) {
                            yfVar3 = C52613yf.f138138f;
                        }
                        return C58833ax.m90834k(yfVar3.f138143d);
                    }
                } else {
                    continue;
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public static C58833ax m26406c(C52623yp ypVar, String str) {
        for (C52633yz yzVar : m26408e(ypVar)) {
            if ((yzVar.f138194a & 1) != 0 && yzVar.f138195b.equals(str)) {
                C52613yf yfVar = yzVar.f138197d;
                if (yfVar == null) {
                    yfVar = C52613yf.f138138f;
                }
                if ((yfVar.f138140a & 4) != 0) {
                    C58528ij ijVar = f36437c;
                    C52613yf yfVar2 = yzVar.f138197d;
                    if (yfVar2 == null) {
                        yfVar2 = C52613yf.f138138f;
                    }
                    if (ijVar.contains(yfVar2.f138143d)) {
                        C52613yf yfVar3 = yzVar.f138197d;
                        if (yfVar3 == null) {
                            yfVar3 = C52613yf.f138138f;
                        }
                        return C58833ax.m90834k(yfVar3.f138143d);
                    }
                } else {
                    continue;
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public static C58833ax m26407d(Context context, C58833ax axVar) {
        if (axVar.mo56113h()) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo((String) axVar.mo56107c(), 0);
                if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled) {
                    return axVar;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
        return telecomManager != null ? C58833ax.m90833j(telecomManager.getDefaultDialerPackage()) : C58836b.f156633a;
    }

    /* renamed from: e */
    public static List m26408e(C52623yp ypVar) {
        ArrayList arrayList = new ArrayList();
        C52627yt ytVar = ypVar.f138165b;
        if (ytVar == null) {
            ytVar = C52627yt.f138176c;
        }
        for (C52617yj yjVar : ytVar.f138179b) {
            arrayList.addAll(yjVar.f138148a);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static Set m26409f(C52623yp ypVar) {
        HashSet hashSet = new HashSet();
        for (C52633yz yzVar : m26408e(ypVar)) {
            if ((yzVar.f138194a & 1) != 0) {
                String str = yzVar.f138195b;
                if (str.equals("com.google.android.apps.tachyon") || str.equals("com.whatsapp")) {
                    hashSet.add(str);
                } else {
                    C52613yf yfVar = yzVar.f138197d;
                    if (yfVar == null) {
                        yfVar = C52613yf.f138138f;
                    }
                    if ((yfVar.f138140a & 4) != 0) {
                        C58528ij ijVar = f36436b;
                        C52613yf yfVar2 = yzVar.f138197d;
                        if (yfVar2 == null) {
                            yfVar2 = C52613yf.f138138f;
                        }
                        if (ijVar.contains(yfVar2.f138143d)) {
                            hashSet.add(str);
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: g */
    public static Set m26410g(C52623yp ypVar) {
        HashSet hashSet = new HashSet();
        for (C52633yz yzVar : m26408e(ypVar)) {
            if ((yzVar.f138194a & 1) != 0) {
                String str = yzVar.f138195b;
                if (str.equals("com.google.android.apps.tachyon") || str.equals("com.whatsapp")) {
                    hashSet.add(str);
                } else {
                    C52613yf yfVar = yzVar.f138197d;
                    if (yfVar == null) {
                        yfVar = C52613yf.f138138f;
                    }
                    if ((yfVar.f138140a & 4) != 0) {
                        C58528ij ijVar = f36437c;
                        C52613yf yfVar2 = yzVar.f138197d;
                        if (yfVar2 == null) {
                            yfVar2 = C52613yf.f138138f;
                        }
                        if (ijVar.contains(yfVar2.f138143d)) {
                            hashSet.add(str);
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: h */
    public static void m26411h(C11078an anVar) {
        C58833ax axVar;
        C58833ax t = anVar.mo19589t((String) anVar.mo19588s().mo56109e(BuildConfig.FLAVOR), BuildConfig.FLAVOR);
        C58833ax r = anVar.mo19587r();
        if (t.mo56113h() && r.mo56113h()) {
            if (m26413j(anVar)) {
                axVar = m26406c((C52623yp) t.mo56107c(), (String) r.mo56107c());
            } else {
                axVar = m26405b((C52623yp) t.mo56107c(), (String) r.mo56107c());
            }
            if (axVar.mo56113h()) {
                anVar.mo19563I((String) axVar.mo56107c());
            }
        }
    }

    /* renamed from: i */
    public static boolean m26412i(C11078an anVar) {
        return anVar != null && anVar.mo19570a().f36350a.mo56113h();
    }

    /* renamed from: j */
    public static boolean m26413j(C11078an anVar) {
        return anVar != null && anVar.mo19569O();
    }

    /* renamed from: k */
    public static boolean m26414k(C11054a aVar) {
        return aVar != null && aVar.mo19521b(17);
    }
}
