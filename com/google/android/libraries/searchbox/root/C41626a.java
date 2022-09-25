package com.google.android.libraries.searchbox.root;

import android.os.Bundle;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import java.util.List;

/* renamed from: com.google.android.libraries.searchbox.root.a */
/* compiled from: PG */
public final class C41626a {

    /* renamed from: a */
    public final List f108836a;

    /* renamed from: b */
    public final Bundle f108837b;

    /* renamed from: c */
    public final boolean f108838c;

    /* renamed from: d */
    public final boolean f108839d;

    /* renamed from: e */
    public final C54231at f108840e;

    public C41626a(List list) {
        this(list, new Bundle(), true, false, C54231at.f142359r);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response:{suggestions:[");
        boolean z = true;
        for (RootSuggestion rootSuggestion : this.f108836a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(rootSuggestion);
            z = false;
        }
        sb.append("]}");
        return sb.toString();
    }

    public C41626a(List list, Bundle bundle, boolean z, boolean z2, C54231at atVar) {
        Bundle bundle2;
        this.f108836a = list;
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        }
        this.f108837b = bundle2;
        this.f108838c = z;
        this.f108839d = z2;
        this.f108840e = atVar;
    }
}
