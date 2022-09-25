package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bb */
/* compiled from: PG */
final class C97978bb extends C90880an {

    /* renamed from: a */
    final /* synthetic */ String f273567a;

    /* renamed from: b */
    final /* synthetic */ C97980bd f273568b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97978bb(C97980bd bdVar, String str) {
        super("Get launcher pref", 1, 8);
        this.f273568b = bdVar;
        this.f273567a = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("default_value", ((Boolean) C97980bd.f273574c.get(this.f273567a)).booleanValue());
        return this.f273568b.f273577f.call(C97980bd.f273573b, "get_boolean_setting", this.f273567a, bundle);
    }
}
