package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.phenotype.client.stable.ba */
/* compiled from: PG */
public final /* synthetic */ class C31709ba implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C31691aj f85254a;

    /* renamed from: b */
    public final /* synthetic */ String f85255b;

    /* renamed from: c */
    public final /* synthetic */ C31760t f85256c;

    public /* synthetic */ C31709ba(C31691aj ajVar, String str, C31760t tVar) {
        this.f85254a = ajVar;
        this.f85255b = str;
        this.f85256c = tVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C31691aj ajVar = this.f85254a;
        String str2 = this.f85255b;
        C31760t tVar = this.f85256c;
        List<String> list = (List) obj;
        if (!ajVar.f85217d) {
            list = C58485gu.m89846n(BuildConfig.FLAVOR);
        }
        C58480gp e = C58485gu.m89837e();
        for (String str3 : list) {
            if (!C31714bf.f85271c.containsKey(new C58835az(str2, str3))) {
                C31731bw bwVar = new C31731bw(tVar, str2, str3, ajVar.f85215b);
                if (ajVar.f85216c) {
                    Context context = tVar.f85364a;
                    str = C31706ay.m59039a(context).getString(ajVar.f85214a, BuildConfig.FLAVOR);
                } else {
                    str = str3;
                }
                C60870cx b = bwVar.mo37347b(str);
                C60838bs i = C60838bs.m92859i(b);
                Objects.requireNonNull(bwVar);
                e.mo55395g(C60922j.m93045h(C60922j.m93045h(i, new C31711bc(bwVar), tVar.mo37368h()), new C31712bd(tVar, b, ajVar, str3), tVar.mo37368h()));
            }
        }
        return C60856cj.m92892a(e.mo55394f()).mo57334a(C31707az.f85248a, tVar.mo37368h());
    }
}
