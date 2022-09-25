package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.a */
/* compiled from: PG */
public final class C112957a {

    /* renamed from: a */
    public static final C112957a f313023a = new C112957a();

    /* renamed from: c */
    private static final Pattern f313024c = Pattern.compile("[a-zA-Z0-9_]+");

    /* renamed from: b */
    public final String f313025b;

    /* renamed from: d */
    private final Map f313026d;

    private C112957a() {
        this.f313026d = new HashMap();
        this.f313025b = BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public static C112957a m186944a(C112957a aVar, String str) {
        List i = C58869cf.m90936b(new C58903m('/')).mo56155i(str);
        for (int i2 = 0; i2 < i.size() - 1; i2++) {
            aVar = aVar.m186945b((String) i.get(i2));
        }
        return aVar.m186946c((String) i.get(i.size() - 1));
    }

    /* renamed from: b */
    private final synchronized C112957a m186945b(String str) {
        if (!f313024c.matcher(str).matches()) {
            throw new IllegalArgumentException("Component name '" + str + "' must be a valid label.");
        } else if (this.f313026d.containsKey(str)) {
            return (C112957a) this.f313026d.get(str);
        } else {
            C112957a aVar = new C112957a(this, str);
            this.f313026d.put(str, aVar);
            return aVar;
        }
    }

    /* renamed from: c */
    private final synchronized C112957a m186946c(String str) {
        if (!this.f313026d.containsKey(str)) {
        } else {
            String str2 = this.f313025b;
            throw new IllegalArgumentException("Child name collision detected in component '" + str2 + "': attempted to register child component " + str);
        }
        return m186945b(str);
    }

    public final String toString() {
        return this.f313025b;
    }

    private C112957a(C112957a aVar, String str) {
        this.f313026d = new HashMap();
        String str2 = aVar.f313025b;
        String str3 = true != str2.isEmpty() ? "/" : BuildConfig.FLAVOR;
        this.f313025b = str2 + str3 + str;
    }
}
