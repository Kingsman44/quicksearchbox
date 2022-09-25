package com.google.android.libraries.p11012aj;

import android.content.Context;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.aj.d */
/* compiled from: PG */
public final class C147605d {

    /* renamed from: a */
    private final Context f398411a;

    /* renamed from: b */
    private final Set f398412b;

    public C147605d(Context context, Map map) {
        this.f398411a = context;
        this.f398412b = ((C58495hd) map).keySet();
    }

    /* renamed from: a */
    public final boolean mo124374a() {
        if (!C147596b.m240670a()) {
            return false;
        }
        String b = C147596b.m240671b();
        if (b == null) {
            return true;
        }
        int size = this.f398412b.size();
        if (size == 0) {
            return b.equals(this.f398411a.getPackageName());
        }
        if (size == 1) {
            String a = ((C147600c) C58557jl.m90133n(this.f398412b)).mo124359a();
            C58838bb.m90873h(a.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", a);
            return b.equals(String.valueOf(this.f398411a.getPackageName()).concat(String.valueOf(a)));
        }
        throw new IllegalArgumentException("More than 1 custom main process specified");
    }
}
