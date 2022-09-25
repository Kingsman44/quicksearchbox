package com.facebook.litho.p326e;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.litho.e.o */
/* compiled from: PG */
public abstract class C6226o {

    /* renamed from: a */
    public Map f18402a = null;

    /* renamed from: b */
    public ArrayList f18403b = null;

    /* renamed from: c */
    public float f18404c;

    /* renamed from: d */
    public long f18405d = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo12765a(long j);

    /* renamed from: d */
    public final int mo13184d() {
        Map map = this.f18402a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C6226o mo13185e() {
        if (mo13184d() <= 1) {
            return mo13186f("default_input");
        }
        throw new RuntimeException("Trying to get single input of node with multiple inputs!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C6226o mo13186f(String str) {
        String str2;
        C6226o g = mo13187g(str);
        if (g != null) {
            return g;
        }
        Map map = this.f18402a;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            String str3 = BuildConfig.FLAVOR;
            while (it.hasNext()) {
                str3 = str3 + "'" + ((String) it.next()) + "'";
                if (!it.hasNext()) {
                    str3 = str3.concat(", ");
                }
            }
            str2 = "[" + str3 + "]";
        } else {
            str2 = "[]";
        }
        throw new RuntimeException("Tried to get non-existent input '" + str + "'. Node only has these inputs: " + str2);
    }

    /* renamed from: g */
    public final C6226o mo13187g(String str) {
        Map map = this.f18402a;
        if (map == null) {
            return null;
        }
        return (C6226o) map.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Collection mo13188h() {
        Map map = this.f18402a;
        if (map == null) {
            return Collections.emptySet();
        }
        return map.values();
    }

    /* renamed from: i */
    public final void mo13189i(String str) {
        Map map = this.f18402a;
        if (map == null || map.remove(str) == null) {
            throw new RuntimeException("Tried to remove non-existent input with name: ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: j */
    public final void mo13190j(C6226o oVar) {
        if (!this.f18403b.remove(oVar)) {
            throw new RuntimeException("Tried to remove non-existent input!");
        }
    }
}
