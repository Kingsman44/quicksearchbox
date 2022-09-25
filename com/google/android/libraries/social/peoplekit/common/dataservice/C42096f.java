package com.google.android.libraries.social.peoplekit.common.dataservice;

import android.content.Context;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.p3269d.p3270a.C41925ab;
import com.google.android.libraries.social.p3269d.p3270a.C41926ac;
import com.google.android.libraries.social.p3269d.p3270a.C41931f;
import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.p3269d.p3270a.C41942q;
import com.google.android.libraries.social.p3269d.p3270a.C41943r;
import com.google.android.libraries.social.p3269d.p3270a.C41946u;
import com.google.android.libraries.social.p3269d.p3270a.C41949x;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Locale;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.f */
/* compiled from: PG */
public final class C42096f {
    /* renamed from: a */
    public static C41949x m73796a(Channel channel, Context context) {
        C41946u uVar = (C41946u) C41949x.f109493g.createBuilder();
        String h = channel.mo44627h();
        uVar.copyOnWrite();
        C41949x xVar = (C41949x) uVar.instance;
        h.getClass();
        xVar.f109495a |= 2;
        xVar.f109497c = h;
        int b = channel.mo44621b();
        uVar.copyOnWrite();
        C41949x xVar2 = (C41949x) uVar.instance;
        xVar2.f109496b = m73803h(b) - 1;
        xVar2.f109495a |= 1;
        C41942q qVar = (C41942q) C41943r.f109473l.createBuilder();
        if (!TextUtils.isEmpty(channel.mo44635p()) && !channel.mo44612D()) {
            String p = channel.mo44635p();
            qVar.copyOnWrite();
            C41943r rVar = (C41943r) qVar.instance;
            p.getClass();
            rVar.f109475a |= 1;
            rVar.f109476b = p;
            if (channel.mo44644y()) {
                String p2 = channel.mo44635p();
                qVar.copyOnWrite();
                C41943r rVar2 = (C41943r) qVar.instance;
                p2.getClass();
                rVar2.f109475a |= 2048;
                rVar2.f109485k = p2;
            }
        }
        if (!TextUtils.isEmpty(channel.mo44632m())) {
            String m = channel.mo44632m();
            qVar.copyOnWrite();
            C41943r rVar3 = (C41943r) qVar.instance;
            m.getClass();
            rVar3.f109475a |= 1024;
            rVar3.f109484j = m;
        }
        if (!TextUtils.isEmpty(channel.mo44638s())) {
            String s = channel.mo44638s();
            qVar.copyOnWrite();
            C41943r rVar4 = (C41943r) qVar.instance;
            s.getClass();
            rVar4.f109475a |= 2;
            rVar4.f109477c = s;
        }
        if (!TextUtils.isEmpty(channel.mo44634o())) {
            String o = channel.mo44634o();
            qVar.copyOnWrite();
            C41943r rVar5 = (C41943r) qVar.instance;
            o.getClass();
            rVar5.f109475a |= 128;
            rVar5.f109483i = o;
        }
        if (!TextUtils.isEmpty(channel.mo44636q())) {
            String q = channel.mo44636q();
            qVar.copyOnWrite();
            C41943r rVar6 = (C41943r) qVar.instance;
            q.getClass();
            rVar6.f109475a |= 4;
            rVar6.f109478d = q;
        }
        String b2 = C42092b.m73790b(context);
        qVar.copyOnWrite();
        C41943r rVar7 = (C41943r) qVar.instance;
        b2.getClass();
        rVar7.f109475a |= 64;
        rVar7.f109482h = b2;
        boolean z = channel.mo44645z();
        qVar.copyOnWrite();
        C41943r rVar8 = (C41943r) qVar.instance;
        rVar8.f109475a |= 8;
        rVar8.f109479e = z;
        if (channel.mo44611C() && !TextUtils.isEmpty(channel.mo44637r())) {
            String r = channel.mo44637r();
            qVar.copyOnWrite();
            C41943r rVar9 = (C41943r) qVar.instance;
            r.getClass();
            rVar9.f109475a |= 16;
            rVar9.f109480f = r;
            int c = channel.mo44622c();
            qVar.copyOnWrite();
            C41943r rVar10 = (C41943r) qVar.instance;
            rVar10.f109481g = m73803h(c) - 1;
            rVar10.f109475a |= 32;
        }
        int I = channel.mo44617I();
        if (!(I == 0 || I == 1)) {
            C41925ab abVar = (C41925ab) C41926ac.f109377d.createBuilder();
            abVar.copyOnWrite();
            C41926ac acVar = (C41926ac) abVar.instance;
            acVar.f109380b = I - 1;
            acVar.f109379a |= 128;
            int H = channel.mo44616H();
            abVar.copyOnWrite();
            C41926ac acVar2 = (C41926ac) abVar.instance;
            int i = H - 1;
            if (H != 0) {
                acVar2.f109381c = i;
                acVar2.f109379a |= 256;
                C41931f fVar = (C41931f) C41932g.f109390d.createBuilder();
                fVar.copyOnWrite();
                C41932g gVar = (C41932g) fVar.instance;
                C41926ac acVar3 = (C41926ac) abVar.build();
                acVar3.getClass();
                C62971cq cqVar = gVar.f109393b;
                if (!cqVar.mo58948c()) {
                    gVar.f109393b = C62942bv.mutableCopy(cqVar);
                }
                gVar.f109393b.add(acVar3);
                uVar.copyOnWrite();
                C41949x xVar3 = (C41949x) uVar.instance;
                C41932g gVar2 = (C41932g) fVar.build();
                gVar2.getClass();
                xVar3.f109500f = gVar2;
                xVar3.f109495a |= 16;
            } else {
                throw null;
            }
        }
        uVar.copyOnWrite();
        C41949x xVar4 = (C41949x) uVar.instance;
        C41943r rVar11 = (C41943r) qVar.build();
        rVar11.getClass();
        xVar4.f109498d = rVar11;
        xVar4.f109495a |= 4;
        return (C41949x) uVar.build();
    }

    /* renamed from: b */
    public static String m73797b(Channel channel, Context context) {
        String p = channel.mo44635p();
        String i = m73804i(channel, context);
        if (TextUtils.isEmpty(p)) {
            return i;
        }
        if (TextUtils.isEmpty(i)) {
            return p;
        }
        return p + " <" + i + ">";
    }

    /* renamed from: c */
    public static String m73798c(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        char charAt = str.charAt(0);
        return ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) ? BuildConfig.FLAVOR : String.valueOf(charAt).toUpperCase(Locale.getDefault());
    }

    /* renamed from: d */
    public static String m73799d(Channel channel) {
        String h = channel.mo44627h();
        if (channel.mo44621b() == 1 || channel.mo44621b() == 5) {
            h = C42092b.m73789a(h);
        }
        int b = channel.mo44621b();
        return h + "::" + b;
    }

    /* renamed from: e */
    public static boolean m73800e(Channel channel, String str, String str2) {
        if (!TextUtils.isEmpty(str) && C42092b.m73792d(str, channel.mo44627h())) {
            return true;
        }
        if (TextUtils.isEmpty(str2) || !str2.equals(channel.mo44636q())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m73801f(Channel channel, Channel channel2) {
        if (channel.mo44623d() != null || channel2.mo44623d() != null) {
            return Objects.equals(channel.mo44623d(), channel2.mo44623d());
        }
        if (channel.mo44621b() != channel2.mo44621b()) {
            return false;
        }
        String h = channel.mo44627h();
        String h2 = channel2.mo44627h();
        if (channel.mo44621b() == 1 || channel.mo44621b() == 5) {
            h = C42092b.m73789a(h);
            h2 = C42092b.m73789a(h2);
        }
        return TextUtils.equals(h, h2);
    }

    /* renamed from: g */
    public static int m73802g(int i) {
        switch (i - 1) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 2;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    /* renamed from: h */
    static int m73803h(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 1;
        }
    }

    /* renamed from: i */
    public static String m73804i(Channel channel, Context context) {
        String k = channel.mo44630k(context);
        int b = channel.mo44621b();
        if (b == 3) {
            String r = channel.mo44637r();
            if (TextUtils.isEmpty(r)) {
                return null;
            }
            if (channel.mo44622c() == 2) {
                return C42092b.m73791c(r, context);
            }
            return r;
        } else if (b == 4) {
            return C42092b.m73791c(channel.mo44627h(), context);
        } else {
            if (b != 5) {
                return k;
            }
            return channel.mo44627h();
        }
    }
}
