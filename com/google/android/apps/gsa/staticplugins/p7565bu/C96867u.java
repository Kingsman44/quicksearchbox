package com.google.android.apps.gsa.staticplugins.p7565bu;

import android.text.TextUtils;
import com.google.common.base.C58887cx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.u */
/* compiled from: PG */
public final /* synthetic */ class C96867u implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C96867u f270844a = new C96867u();

    private /* synthetic */ C96867u() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C96809ab abVar = (C96809ab) obj;
        StringBuilder sb = new StringBuilder("Date: ");
        sb.append(abVar.mo90358d());
        sb.append(", MddTaskTag: ");
        sb.append(abVar.mo90356b());
        C58495hd a = abVar.mo90355a();
        sb.append("\nPhenotype client and configs: ");
        C58800sl lA = a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            sb.append("\nPhConfig ");
            sb.append((String) entry.getKey());
            sb.append(" clients [");
            sb.append((String) Collection.EL.stream((C58485gu) entry.getValue()).map(C96868v.f270845a).collect(Collectors.joining(" || ")));
            sb.append("]");
        }
        Throwable c = abVar.mo90357c();
        if (c != null) {
            sb.append("\nException: ");
            String message = c.getMessage();
            if (!TextUtils.isEmpty(message)) {
                sb.append(message);
            }
            sb.append("\n");
            sb.append(C58887cx.m90975b(c));
        }
        return sb.toString();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
