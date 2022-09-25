package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4566l.C60129au;
import com.google.common.p4552o.p4566l.C60130av;
import com.google.common.p4552o.p4566l.C60180cr;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.e.t */
/* compiled from: PG */
public final /* synthetic */ class C29053t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29056w f78852a;

    /* renamed from: b */
    public final /* synthetic */ int f78853b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f78854c;

    /* renamed from: d */
    public final /* synthetic */ int f78855d;

    public /* synthetic */ C29053t(C29056w wVar, int i, int i2, C58833ax axVar) {
        this.f78852a = wVar;
        this.f78855d = i;
        this.f78853b = i2;
        this.f78854c = axVar;
    }

    public final Object apply(Object obj) {
        C29056w wVar = this.f78852a;
        int i = this.f78855d;
        int i2 = this.f78853b;
        C58833ax axVar = this.f78854c;
        List<C60130av> list = (List) obj;
        if (list == null) {
            return null;
        }
        for (C60130av builder : list) {
            wVar.mo34559m(i, (C60129au) builder.toBuilder(), (long) i2, (C60180cr) axVar.mo56107c());
        }
        return null;
    }
}
