package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.df */
/* compiled from: PG */
public abstract class C80731df {
    /* renamed from: f */
    public static C80730de m128563f() {
        C80672ba baVar = new C80672ba();
        baVar.f221486a = BuildConfig.FLAVOR;
        baVar.mo74525c(C80831aj.f221751c);
        baVar.mo74526d(C80758ef.f221662e);
        return baVar;
    }

    /* renamed from: g */
    public static C80731df m128564g(Bundle bundle) {
        C80758ef efVar;
        C80730de f = m128563f();
        f.mo74527e(bundle.getString("text", BuildConfig.FLAVOR));
        f.mo74524b(bundle.getString("bottom_text", BuildConfig.FLAVOR));
        f.mo74525c(C80745dt.m128611b(bundle));
        byte[] byteArray = bundle.getByteArray("privacyInputUiKey");
        if (byteArray == null) {
            ((C59052c) ((C59052c) C80745dt.f221643a.mo56226d()).mo56372aa(6528)).mo56386p("Could not parse to PrivacyInputUi, byteArray is empty");
            efVar = C80758ef.f221662e;
        } else {
            try {
                efVar = (C80758ef) C62942bv.parseFrom((C62942bv) C80758ef.f221662e, byteArray, C62921ba.m95368a());
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) C80745dt.f221643a.mo56226d()).mo56382g(e)).mo56372aa(6527)).mo56386p("Could not parse to PrivacyInputUi");
                efVar = C80758ef.f221662e;
            }
        }
        f.mo74526d(efVar);
        return f.mo74523a();
    }

    /* renamed from: a */
    public abstract C80758ef mo74528a();

    /* renamed from: b */
    public abstract C80831aj mo74529b();

    /* renamed from: c */
    public abstract String mo74530c();

    /* renamed from: d */
    public abstract String mo74531d();

    /* renamed from: e */
    public final Bundle mo74635e() {
        Bundle bundle = new Bundle();
        bundle.putString("text", mo74531d());
        bundle.putString("bottom_text", mo74530c());
        C80745dt.m128612c(bundle, mo74529b());
        bundle.putByteArray("privacyInputUiKey", mo74528a().toByteArray());
        return bundle;
    }
}
