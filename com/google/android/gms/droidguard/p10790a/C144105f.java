package com.google.android.gms.droidguard.p10790a;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.droidguard.p10791b.C144115c;
import com.google.android.libraries.social.populous.android.C42181t;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.gms.droidguard.a.f */
/* compiled from: PG */
public final class C144105f {
    /* renamed from: a */
    public static File m234304a(Context context) {
        return context.getDir("dg_cache", 0);
    }

    /* renamed from: b */
    public static void m234305b(File file, File file2) {
        if (!file.renameTo(file2)) {
            String valueOf = String.valueOf(file);
            String valueOf2 = String.valueOf(file2);
            throw new C144100a("Failed to rename " + valueOf + " -> " + valueOf2 + ".");
        }
    }

    /* renamed from: c */
    public static final void m234306c(C144107h hVar) {
        File file = hVar.f390388c;
        try {
            if (!file.exists()) {
                if (!file.createNewFile()) {
                    String obj = hVar.toString();
                    throw new C144100a("Failed to touch last-used file for " + obj + ".");
                }
            }
            if (!file.setLastModified(System.currentTimeMillis())) {
                String obj2 = hVar.toString();
                throw new C144100a("Failed to update last-used timestamp for " + obj2 + ".");
            }
        } catch (IOException e) {
            String obj3 = hVar.toString();
            String obj4 = e.toString();
            throw new C144100a("Failed to touch last-used file for " + obj3 + ": " + obj4);
        }
    }

    /* renamed from: d */
    public static final C144107h m234307d(Context context, List list) {
        return m234310g("tmp_".concat(String.valueOf(UUID.randomUUID().toString())), context);
    }

    /* renamed from: e */
    public static final C144107h m234308e(C144108i iVar, Context context, List list) {
        C144107h g = m234310g(iVar.f390389a, context);
        if (!g.mo119655a()) {
            return null;
        }
        m234306c(g);
        return g;
    }

    /* renamed from: f */
    public static final void m234309f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!C144115c.m234321a(file)) {
                String valueOf = String.valueOf(file);
                Log.e("DG", "Failed to clean up temporary file " + valueOf + ".");
            }
        }
        list.clear();
    }

    /* renamed from: g */
    public static final C144107h m234310g(String str, Context context) {
        File file = new File(m234304a(context), str);
        return new C144107h(new C144103d(file, "the.apk"), new File(file, "opt"), new File(file, C42181t.f110467a));
    }
}
