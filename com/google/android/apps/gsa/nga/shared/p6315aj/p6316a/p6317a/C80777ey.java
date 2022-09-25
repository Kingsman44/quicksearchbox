package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ey */
/* compiled from: PG */
public final /* synthetic */ class C80777ey implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80777ey f221689a = new C80777ey();

    private /* synthetic */ C80777ey() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80784fe feVar = (C80784fe) obj;
        Bundle bundle = new Bundle();
        bundle.putString("label", feVar.mo74609f());
        bundle.putString("id", feVar.mo74607e());
        C80745dt.m128612c(bundle, feVar.mo74605c());
        int h = feVar.mo74611h();
        String a = C80783fd.m128647a(h);
        if (h != 0) {
            bundle.putString("style_type", a);
            int g = feVar.mo74610g();
            String a2 = C80782fc.m128646a(g);
            if (g != 0) {
                bundle.putString("suggestion_type", a2);
                C80786fg b = feVar.mo74604b();
                if (b != null) {
                    int b2 = b.mo74401b();
                    int i = b2 - 1;
                    if (b2 == 0) {
                        throw null;
                    } else if (i == 0) {
                        bundle.putString("icon_url", b.mo74409d());
                    } else if (i == 1) {
                        bundle.putParcelable("icon", b.mo74400a());
                    } else if (i == 2) {
                        bundle.putParcelable("tintable_icon", b.mo74405c());
                    }
                }
                C80589w a3 = feVar.mo74603a();
                if (a3 != null) {
                    bundle.putByteArray("logging_info", a3.toByteArray());
                }
                bundle.putByteArray("debug_data", feVar.mo74606d().toByteArray());
                return bundle;
            }
            throw null;
        }
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
