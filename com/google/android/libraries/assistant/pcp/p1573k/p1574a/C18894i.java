package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.pm.PackageItemInfo;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.i */
/* compiled from: PG */
public final /* synthetic */ class C18894i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C18894i f53178a = new C18894i();

    private /* synthetic */ C18894i() {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        PackageItemInfo packageItemInfo = (PackageItemInfo) obj;
        boolean h = C58837ba.m90859h(packageItemInfo.packageName);
        boolean h2 = C58837ba.m90859h(packageItemInfo.name);
        if (h || h2) {
            C59104x d = C18907v.f53191a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TNG.MediaAppCProvider");
            ((C59052c) ((C59052c) d).mo56372aa(47391)).mo56389s("#getMediaAppComponents() Filtering out %s because empty name/packageName", packageItemInfo);
        }
        return !h && !h2;
    }
}
