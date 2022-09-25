package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80587u;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.cx */
/* compiled from: PG */
public abstract class C80722cx {

    /* renamed from: a */
    private static final C59071e f221600a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.aj.a.a.cx");

    /* renamed from: p */
    public static C80716cr m128539p() {
        C80665au auVar = new C80665au();
        auVar.f221451a = BuildConfig.FLAVOR;
        auVar.f221452b = BuildConfig.FLAVOR;
        auVar.f221453c = BuildConfig.FLAVOR;
        auVar.mo74483g(false);
        auVar.mo74482f(false);
        auVar.mo74485i(C80721cw.MOLECULE);
        auVar.mo74484h(false);
        auVar.mo74479c(C80831aj.f221751c);
        auVar.f221455e = C80587u.CLICK_WHOLE_PLATE;
        auVar.mo74480d(Optional.empty());
        auVar.f221456f = 1;
        auVar.mo74487k(C80727db.f221610d);
        return auVar;
    }

    /* renamed from: q */
    public static Optional m128540q(C63010eb ebVar, byte[] bArr) {
        if (bArr == null) {
            return Optional.empty();
        }
        try {
            return Optional.m71637of(ebVar.mo59015n(bArr, C62921ba.m95368a()));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f221600a.mo56226d()).mo56382g(e)).mo56372aa(6522)).mo56386p("Failed to parse proto.");
            return Optional.empty();
        }
    }

    /* renamed from: a */
    public abstract C80587u mo74490a();

    /* renamed from: b */
    public abstract C80716cr mo74491b();

    /* renamed from: c */
    public abstract C80721cw mo74492c();

    /* renamed from: d */
    public abstract C80727db mo74493d();

    /* renamed from: e */
    public abstract C80831aj mo74494e();

    /* renamed from: f */
    public abstract Optional mo74496f();

    /* renamed from: g */
    public abstract Optional mo74497g();

    /* renamed from: h */
    public abstract Optional mo74498h();

    /* renamed from: i */
    public abstract String mo74500i();

    /* renamed from: j */
    public abstract String mo74501j();

    /* renamed from: k */
    public abstract String mo74502k();

    /* renamed from: l */
    public abstract boolean mo74503l();

    /* renamed from: m */
    public abstract boolean mo74504m();

    /* renamed from: n */
    public abstract boolean mo74505n();

    /* renamed from: o */
    public abstract int mo74506o();
}
