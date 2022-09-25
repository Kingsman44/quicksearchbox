package com.google.android.libraries.social.populous.logging;

import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.core.C42282bh;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.ContainerInfo;
import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import java.util.EnumSet;
import p5602o.p5607c.C71942m;

/* compiled from: PG */
public abstract class LogEntity implements Parcelable {
    /* renamed from: A */
    public static C42584s m75050A(GroupMetadata groupMetadata, String str) {
        C42584s y = m75052y();
        y.mo45619g(9);
        y.mo45628p(groupMetadata.f110775g);
        y.mo45630r(EnumSet.of(C42331dc.PAPI_TOPN));
        y.mo45621i(groupMetadata.mo44929b().mo45029c());
        ((C42562a) y).f111676c = str;
        return y;
    }

    /* renamed from: B */
    public static void m75051B(C42584s sVar) {
        if (sVar.mo45614b() != null) {
            sVar.mo45627o(4);
        } else {
            sVar.mo45627o(5);
        }
    }

    /* renamed from: y */
    public static C42584s m75052y() {
        C42562a aVar = new C42562a();
        aVar.f111675b = BuildConfig.FLAVOR;
        aVar.f111674a = BuildConfig.FLAVOR;
        aVar.mo45617e(0);
        aVar.mo45628p(0);
        aVar.mo45620h(0);
        aVar.mo45619g(1);
        aVar.mo45627o(5);
        aVar.mo45630r(EnumSet.noneOf(C42331dc.class));
        aVar.mo45629q(EnumSet.noneOf(C42331dc.class));
        aVar.mo45623k(false);
        aVar.mo45624l(false);
        aVar.mo45622j(false);
        aVar.mo45618f(false);
        aVar.mo45625m(false);
        aVar.mo45626n(false);
        return aVar;
    }

    /* renamed from: z */
    public static C42584s m75053z(ContactMethodField contactMethodField, String str, boolean z) {
        C58485gu guVar;
        PersonFieldMetadata b = contactMethodField.mo44976b();
        C42584s y = m75052y();
        y.mo45628p(b.f110786c);
        y.mo45620h(b.f110787d);
        y.mo45630r(EnumSet.copyOf(b.f110792i));
        y.mo45621i(b.f110784a.mo45029c());
        C42562a aVar = (C42562a) y;
        aVar.f111676c = str;
        y.mo45622j(b.f110788e);
        y.mo45618f(b.f110789f);
        y.mo45626n(z);
        C42282bh bhVar = C42282bh.EMAIL;
        int ordinal = contactMethodField.mo45020lo().ordinal();
        Long l = null;
        if (ordinal == 0) {
            aVar.f111677d = contactMethodField.mo45116j().mo44982g().toString();
            y.mo45619g(2);
        } else if (ordinal == 1) {
            aVar.f111678e = contactMethodField.mo45118l().mo44982g().toString();
            y.mo45619g(3);
        } else if (ordinal == 2) {
            int i = contactMethodField.mo45117k().mo45019i();
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                y.mo45619g(1);
            } else if (i2 == 1) {
                aVar.f111678e = contactMethodField.mo45117k().mo44982g().toString();
                y.mo45619g(6);
            } else if (i2 == 2) {
                aVar.f111679f = contactMethodField.mo45117k().mo44982g().toString();
                y.mo45619g(7);
            } else if (i2 == 3) {
                aVar.f111677d = contactMethodField.mo45117k().mo44982g().toString();
                y.mo45619g(8);
            }
        } else if (ordinal == 3) {
            aVar.f111677d = contactMethodField.mo45117k().mo44982g().toString();
            y.mo45619g(8);
        } else if (ordinal == 4) {
            aVar.f111678e = contactMethodField.mo45117k().mo44982g().toString();
            y.mo45619g(6);
        } else if (ordinal == 5) {
            aVar.f111679f = contactMethodField.mo45117k().mo44982g().toString();
            y.mo45619g(7);
        }
        aVar.f111679f = contactMethodField.mo44976b().mo45153a();
        PersonFieldMetadata b2 = contactMethodField.mo44976b();
        if (b2 != null && (guVar = b2.f110793j) != null) {
            int size = guVar.size();
            int i3 = 0;
            while (i3 < size) {
                ContainerInfo containerInfo = (ContainerInfo) guVar.get(i3);
                i3++;
                if (containerInfo.mo44960c() == 3) {
                    try {
                        l = Long.decode(containerInfo.mo44958a());
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if (b2.f110804u == 3) {
                l = Long.decode(b2.f110800q);
            }
        }
        aVar.f111680g = l;
        m75051B(y);
        return y;
    }

    /* renamed from: C */
    public final boolean mo45611C() {
        return C58557jl.m90138s(mo45583o(), C42583r.f111754a);
    }

    /* renamed from: a */
    public abstract int mo45567a();

    /* renamed from: b */
    public abstract int mo45568b();

    /* renamed from: c */
    public abstract int mo45569c();

    /* renamed from: d */
    public abstract C42584s mo45570d();

    /* renamed from: e */
    public abstract Integer mo45571e();

    /* renamed from: f */
    public abstract Long mo45573f();

    /* renamed from: g */
    public abstract String mo45574g();

    /* renamed from: h */
    public abstract String mo45575h();

    /* renamed from: i */
    public abstract String mo45577i();

    /* renamed from: j */
    public abstract String mo45578j();

    /* renamed from: k */
    public abstract String mo45579k();

    /* renamed from: l */
    public abstract String mo45580l();

    /* renamed from: m */
    public abstract String mo45581m();

    /* renamed from: n */
    public abstract EnumSet mo45582n();

    /* renamed from: o */
    public abstract EnumSet mo45583o();

    /* renamed from: p */
    public abstract C71942m mo45584p();

    /* renamed from: q */
    public abstract boolean mo45585q();

    /* renamed from: r */
    public abstract boolean mo45586r();

    /* renamed from: s */
    public abstract boolean mo45587s();

    /* renamed from: t */
    public abstract boolean mo45588t();

    /* renamed from: u */
    public abstract boolean mo45590u();

    /* renamed from: v */
    public abstract boolean mo45591v();

    /* renamed from: w */
    public abstract int mo45592w();

    /* renamed from: x */
    public abstract int mo45593x();
}
