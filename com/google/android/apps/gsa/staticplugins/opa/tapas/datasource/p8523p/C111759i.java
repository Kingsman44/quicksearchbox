package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8523p;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58557jl;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p.i */
/* compiled from: PG */
public final /* synthetic */ class C111759i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111761k f310644a;

    /* renamed from: b */
    public final /* synthetic */ String f310645b;

    public /* synthetic */ C111759i(C111761k kVar, String str) {
        this.f310644a = kVar;
        this.f310645b = str;
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
        String str;
        C111761k kVar = this.f310644a;
        String str2 = this.f310645b;
        C113415ez ezVar = (C113415ez) obj;
        Uri uri = (Uri) Optional.ofNullable((Uri) kVar.f310651d.get(ezVar)).orElse(Uri.parse(BuildConfig.FLAVOR));
        String L = ezVar.mo100199L();
        if (str2.isEmpty()) {
            return true;
        }
        if (uri.getHost() != null) {
            String a = C80884a.m128736a(str2);
            String a2 = C80884a.m128736a(L);
            List i = C58869cf.m90939e(C111761k.f310649c).mo56155i(a);
            if (Character.isWhitespace(a.charAt(a.length() - 1))) {
                str = BuildConfig.FLAVOR;
            } else {
                List subList = i.subList(0, i.size() - 1);
                String str3 = (String) C58557jl.m90131l(i);
                i = subList;
                str = str3;
            }
            if (!((List) Collection.EL.stream(i).filter(C111752b.f310636a).distinct().collect(Collectors.toList())).isEmpty()) {
                return true;
            }
            ArrayList arrayList = new ArrayList(C58869cf.m90939e(C111761k.f310648b).mo56155i((CharSequence) Optional.ofNullable(uri.getHost()).orElse(BuildConfig.FLAVOR)));
            if (uri.getPathSegments() != null) {
                for (String i2 : uri.getPathSegments()) {
                    arrayList.addAll(C58869cf.m90939e(C111761k.f310648b).mo56155i(i2));
                }
            }
            arrayList.addAll(C58869cf.m90939e(C111761k.f310649c).mo56155i(a2));
            List<String> list = (List) Collection.EL.stream(arrayList).filter(C111753c.f310637a).distinct().collect(Collectors.toList());
            if (!str.isEmpty()) {
                for (String startsWith : list) {
                    if (startsWith.startsWith(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
