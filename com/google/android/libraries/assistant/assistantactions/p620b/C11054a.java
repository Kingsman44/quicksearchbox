package com.google.android.libraries.assistant.assistantactions.p620b;

import android.util.SparseBooleanArray;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.assistant.assistantactions.b.a */
/* compiled from: PG */
public final class C11054a {

    /* renamed from: a */
    public final SparseBooleanArray f36298a = new SparseBooleanArray();

    /* renamed from: b */
    public final Map f36299b;

    /* renamed from: c */
    final Map f36300c;

    /* renamed from: d */
    public final Map f36301d;

    public C11054a() {
        new HashMap();
        this.f36299b = new HashMap();
        this.f36300c = new HashMap();
        this.f36301d = new HashMap();
    }

    /* renamed from: a */
    public final String mo19520a(int i) {
        return (String) C58833ax.m90833j((String) this.f36300c.get(Integer.valueOf(i))).mo56109e(BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public final boolean mo19521b(int i) {
        int indexOfKey = this.f36298a.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.f36298a.valueAt(indexOfKey);
        }
        return false;
    }

    /* renamed from: c */
    public final void mo19522c(long j) {
        this.f36301d.put(21, Long.valueOf(j));
    }

    /* renamed from: d */
    public final void mo19523d(String str) {
        this.f36300c.put(15, str);
    }

    /* renamed from: e */
    public final void mo19524e(Map map) {
        this.f36299b.put(14, map);
    }
}
