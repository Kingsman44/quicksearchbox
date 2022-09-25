package com.google.android.apps.gsa.shared.p7148ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60547ty;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.ui.p */
/* compiled from: PG */
public final class C90704p {

    /* renamed from: a */
    public static final C59071e f253728a = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.p");

    /* renamed from: g */
    private static final Map f253729g = new HashMap();

    /* renamed from: b */
    public final String f253730b;

    /* renamed from: c */
    public final int f253731c;

    /* renamed from: d */
    public final C60547ty f253732d;

    /* renamed from: e */
    public final Activity f253733e;

    /* renamed from: f */
    public boolean f253734f;

    public C90704p(Activity activity, String str, C60547ty tyVar) {
        this.f253733e = activity;
        this.f253730b = str;
        C22872h.m42743c(C0826b.class);
        Map map = f253729g;
        Integer num = (Integer) map.get(str);
        Integer valueOf = Integer.valueOf((num == null ? 0 : num).intValue() + 1);
        map.put(str, valueOf);
        int intValue = valueOf.intValue();
        this.f253731c = intValue;
        String.format(Locale.getDefault(), "%s-%d", new Object[]{str, Integer.valueOf(intValue)});
        this.f253732d = tyVar;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public static Intent m148106a(Intent intent) {
        if (intent == null) {
            return intent;
        }
        Intent a = C90772bp.m148293a(intent);
        if (a != null) {
            return a;
        }
        C89911f.m146435c(14250082);
        return null;
    }

    /* renamed from: b */
    public static Bundle m148107b(Bundle bundle) {
        if (bundle == null) {
            return bundle;
        }
        Bundle g = C90772bp.m148299g(bundle);
        if (g != null) {
            return g;
        }
        C89911f.m146435c(14250082);
        return null;
    }
}
