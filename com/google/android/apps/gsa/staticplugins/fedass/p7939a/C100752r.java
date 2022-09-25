package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132803k;
import com.google.android.apps.search.fedora.p10099e.C132804l;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.r */
/* compiled from: PG */
public final /* synthetic */ class C100752r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f281641a;

    /* renamed from: b */
    public final /* synthetic */ Function f281642b;

    public /* synthetic */ C100752r(String str, Function function) {
        this.f281641a = str;
        this.f281642b = function;
    }

    public final Object apply(Object obj) {
        String str = this.f281641a;
        Function function = this.f281642b;
        C132804l lVar = (C132804l) obj;
        C132798f fVar = C132798f.f362315o;
        str.getClass();
        C62995dn dnVar = lVar.f362343c;
        if (dnVar.containsKey(str)) {
            fVar = (C132798f) dnVar.get(str);
        }
        C132803k kVar = (C132803k) lVar.toBuilder();
        kVar.mo110907b(str, (C132798f) function.apply(fVar));
        return (C132804l) kVar.build();
    }
}
