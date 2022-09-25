package com.google.android.apps.gsa.nga.shared.permissions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.C0816c;
import androidx.activity.result.p046a.C0811d;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.opa.p6441f.C83676c;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.common.base.C58824ao;
import com.google.common.base.C58827ar;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;

/* compiled from: PG */
public class PermissionsRequestActivity extends C81446b {

    /* renamed from: c */
    private static final String[] f222853c = new String[0];

    /* renamed from: d */
    private static final C58827ar f222854d;

    /* renamed from: e */
    private static final C58869cf f222855e = C58869cf.m90938d(";").mo56151a();

    /* renamed from: b */
    public C83676c f222856b;

    static {
        C58827ar arVar = new C58827ar(";");
        f222854d = new C58824ao(arVar, arVar);
    }

    /* renamed from: b */
    public static Intent m129561b(Context context, String... strArr) {
        C58976aa aaVar = C58975e.f156826a;
        return new Intent(context, PermissionsRequestActivity.class).addFlags(268435456).putExtra("required_permissions", f222854d.mo56097d(Arrays.asList(strArr)));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        C74504a.m120462a(f.B);
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
        C0816c s = mo3336s(new C0811d(), this.f2708i, new C81447c(this));
        String stringExtra = getIntent().getStringExtra("required_permissions");
        if (C58837ba.m90859h(stringExtra)) {
            strArr = f222853c;
        } else {
            strArr = (String[]) C58557jl.m90142w(f222855e.mo56153g(stringExtra), String.class);
        }
        if (strArr.length == 0) {
            finish();
        } else {
            s.mo526b(strArr);
        }
    }
}
