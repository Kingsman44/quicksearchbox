package com.google.android.libraries.silk.p3238b.p3239a;

import com.google.common.base.C58838bb;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.silk.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C41744b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f109095a;

    public /* synthetic */ C41744b(String str) {
        this.f109095a = str;
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
        String str = this.f109095a;
        String str2 = (String) obj;
        C58485gu guVar = C41745c.f109096a;
        if (str2.equals("*")) {
            return true;
        }
        List i = C58869cf.m90936b(new C58903m('*')).mo56155i(str2);
        if (i.size() == 1) {
            return str2.equals(str);
        }
        C58838bb.m90869d(i.size() == 2, "Silk allowed patterns can have maximum one wildcard sign.");
        C58838bb.m90869d(((String) i.get(0)).endsWith("://") && ((String) i.get(1)).startsWith("."), "Silk patterns only allow wildcards for subdomains.");
        if (!str.startsWith((String) i.get(0)) || !str.endsWith((String) i.get(1))) {
            return false;
        }
        return true;
    }
}
