package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telecom.TelecomManager;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3917i.p3918a.C51252av;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52633yz;
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
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.g */
/* compiled from: PG */
public final class C33033g {

    /* renamed from: a */
    private static final C59071e f88463a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.g");

    /* renamed from: b */
    private static final C58528ij f88464b = C58528ij.m90012L("vnd.android.cursor.item/vnd.com.whatsapp.voip.call", "vnd.android.cursor.item/vnd.jp.naver.line.android.call.voice", "vnd.android.cursor.item/com.hike.chat.stickers.voice_call");

    /* renamed from: c */
    private static final C58528ij f88465c = C58528ij.m90012L("vnd.android.cursor.item/vnd.com.whatsapp.video.call", "vnd.android.cursor.item/vnd.jp.naver.line.android.call.video", "vnd.android.cursor.item/com.hike.chat.stickers.voice_call");

    /* renamed from: a */
    public static Optional m61299a(C51406gn gnVar) {
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
                return Optional.m71637of((C51252av) obj);
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f88463a.mo56225c()).mo56382g(e)).mo56372aa(50702)).mo56386p("Incompatible CommunicationFluidActionsData proto implementations");
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public static Optional m61300b(C52623yp ypVar, String str) {
        for (C52633yz yzVar : m61303e(ypVar)) {
            if ((yzVar.f138194a & 1) != 0 && yzVar.f138195b.equals(str)) {
                C52613yf yfVar = yzVar.f138197d;
                if (yfVar == null) {
                    yfVar = C52613yf.f138138f;
                }
                if ((yfVar.f138140a & 4) != 0) {
                    C58528ij ijVar = f88464b;
                    C52613yf yfVar2 = yzVar.f138197d;
                    if (yfVar2 == null) {
                        yfVar2 = C52613yf.f138138f;
                    }
                    if (ijVar.contains(yfVar2.f138143d)) {
                        C52613yf yfVar3 = yzVar.f138197d;
                        if (yfVar3 == null) {
                            yfVar3 = C52613yf.f138138f;
                        }
                        return Optional.m71637of(yfVar3.f138143d);
                    }
                } else {
                    continue;
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: c */
    public static Optional m61301c(C52623yp ypVar, String str) {
        for (C52633yz yzVar : m61303e(ypVar)) {
            if ((yzVar.f138194a & 1) != 0 && yzVar.f138195b.equals(str)) {
                C52613yf yfVar = yzVar.f138197d;
                if (yfVar == null) {
                    yfVar = C52613yf.f138138f;
                }
                if ((yfVar.f138140a & 4) != 0) {
                    C58528ij ijVar = f88465c;
                    C52613yf yfVar2 = yzVar.f138197d;
                    if (yfVar2 == null) {
                        yfVar2 = C52613yf.f138138f;
                    }
                    if (ijVar.contains(yfVar2.f138143d)) {
                        C52613yf yfVar3 = yzVar.f138197d;
                        if (yfVar3 == null) {
                            yfVar3 = C52613yf.f138138f;
                        }
                        return Optional.m71637of(yfVar3.f138143d);
                    }
                } else {
                    continue;
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: d */
    public static Optional m61302d(Context context, Optional optional) {
        if (optional.isPresent()) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo((String) optional.get(), 0);
                if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled) {
                    return optional;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return Optional.ofNullable((TelecomManager) context.getSystemService("telecom")).map(C33032f.f88462a);
    }

    /* renamed from: e */
    public static List m61303e(C52623yp ypVar) {
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
    public static Set m61304f(C52623yp ypVar) {
        HashSet hashSet = new HashSet();
        for (C52633yz yzVar : m61303e(ypVar)) {
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
                        C58528ij ijVar = f88464b;
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
    public static Set m61305g(C52623yp ypVar) {
        HashSet hashSet = new HashSet();
        for (C52633yz yzVar : m61303e(ypVar)) {
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
                        C58528ij ijVar = f88465c;
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
    public static void m61306h(C32993ao aoVar) {
        Optional optional;
        Optional t = aoVar.mo38490t((String) aoVar.mo38489s().orElse(BuildConfig.FLAVOR), BuildConfig.FLAVOR);
        Optional r = aoVar.mo38488r();
        if (t.isPresent() && r.isPresent()) {
            if (m61308j(aoVar)) {
                optional = m61301c((C52623yp) t.get(), (String) r.get());
            } else {
                optional = m61300b((C52623yp) t.get(), (String) r.get());
            }
            if (optional.isPresent()) {
                aoVar.mo38464I((String) optional.get());
            }
        }
    }

    /* renamed from: i */
    public static boolean m61307i(C32993ao aoVar) {
        return aoVar != null && aoVar.mo38471a().f88383a.isPresent();
    }

    /* renamed from: j */
    public static boolean m61308j(C32993ao aoVar) {
        return aoVar != null && aoVar.mo38470O();
    }
}
