package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.c */
/* compiled from: PG */
public final class C121511c {

    /* renamed from: a */
    public static final C121511c f337208a = new C121511c();

    /* renamed from: c */
    private static final Pattern f337209c = Pattern.compile("[a-zA-Z0-9_]+");

    /* renamed from: b */
    public final String f337210b;

    /* renamed from: d */
    private final Map f337211d;

    private C121511c() {
        this.f337211d = new HashMap();
        this.f337210b = BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public static C121511c m200805a(String str, C121511c cVar) {
        List i = C58869cf.m90936b(new C58903m('/')).mo56155i(str);
        for (int i2 = 0; i2 < i.size() - 1; i2++) {
            cVar = cVar.m200806b((String) i.get(i2));
        }
        return cVar.m200807c((String) i.get(i.size() - 1));
    }

    /* renamed from: b */
    private final synchronized C121511c m200806b(String str) {
        if (!f337209c.matcher(str).matches()) {
            throw new IllegalArgumentException("Component name '" + str + "' must be a valid label.");
        } else if (this.f337211d.containsKey(str)) {
            return (C121511c) this.f337211d.get(str);
        } else {
            C121511c cVar = new C121511c(this, str);
            this.f337211d.put(str, cVar);
            return cVar;
        }
    }

    /* renamed from: c */
    private final synchronized C121511c m200807c(String str) {
        if (!this.f337211d.containsKey(str)) {
        } else {
            String str2 = this.f337210b;
            throw new IllegalArgumentException("Child name collision detected in component '" + str2 + "': attempted to register child component " + str);
        }
        return m200806b(str);
    }

    public final String toString() {
        return this.f337210b;
    }

    private C121511c(C121511c cVar, String str) {
        this.f337211d = new HashMap();
        String str2 = cVar.f337210b;
        String str3 = true != str2.isEmpty() ? "/" : BuildConfig.FLAVOR;
        this.f337210b = str2 + str3 + str;
    }
}
