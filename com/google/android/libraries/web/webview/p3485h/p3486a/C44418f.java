package com.google.android.libraries.web.webview.p3485h.p3486a;

import com.google.common.base.C58838bb;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.webview.h.a.f */
/* compiled from: PG */
public final /* synthetic */ class C44418f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f115463a;

    public /* synthetic */ C44418f(String str) {
        this.f115463a = str;
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
        String str = this.f115463a;
        String str2 = (String) obj;
        if (str2.equals("*")) {
            return true;
        }
        List i = C58869cf.m90936b(new C58903m('*')).mo56155i(str2);
        if (i.size() == 1) {
            return str2.equals(str);
        }
        C58838bb.m90869d(i.size() == 2, "PostMessage allowed URLs can have maximum one wildcard sign.");
        C58838bb.m90869d(((String) i.get(0)).endsWith("://") && ((String) i.get(1)).startsWith("."), "PostMessage allowed URLs only allow wildcards for subdomains.");
        if (!str.startsWith((String) i.get(0)) || !str.endsWith((String) i.get(1))) {
            return false;
        }
        return true;
    }
}
