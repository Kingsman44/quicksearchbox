package com.google.android.apps.gsa.speech.p7272e.p7274b;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.languagepack.e.f;
import com.google.common.base.C58826aq;
import com.google.common.base.C58827ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.speech.e.b.q */
/* compiled from: PG */
public final class C92255q {

    /* renamed from: b */
    public static final /* synthetic */ int f257227b = 0;

    /* renamed from: c */
    private static final C59071e f257228c = C59071e.m91332i("com.google.android.apps.gsa.speech.e.b.q");

    /* renamed from: d */
    private static final C58826aq f257229d = new C58826aq(C58827ar.m90818c(','), ":");

    /* renamed from: a */
    public final SharedPreferences f257230a;

    public C92255q(SharedPreferences sharedPreferences) {
        this.f257230a = sharedPreferences;
    }

    /* renamed from: e */
    private static String m151480e(Map map) {
        return f257229d.mo56095a((Map) Collection.EL.stream(map.entrySet()).collect(Collectors.toMap(C92253o.f257225a, C92254p.f257226a)));
    }

    /* renamed from: f */
    private final void m151481f(String str) {
        this.f257230a.edit().putString("g3_active_downloads", str).apply();
    }

    /* renamed from: a */
    public final String mo86936a(C92249k kVar) {
        return this.f257230a.getString("g3_apk_grammar_revision_id_v1:".concat(String.valueOf(kVar.f257209i)), (String) null);
    }

    /* renamed from: b */
    public final synchronized HashMap mo86937b() {
        HashMap hashMap;
        String string = this.f257230a.getString("g3_active_downloads", BuildConfig.FLAVOR);
        hashMap = new HashMap();
        for (String trim : string.split(",")) {
            String trim2 = trim.trim();
            if (!TextUtils.isEmpty(trim2)) {
                String[] split = trim2.split(":");
                if (split.length != 2 || TextUtils.isEmpty(split[0])) {
                    ((C59052c) ((C59052c) f257228c.mo56225c()).mo56372aa(12317)).mo56389s("Skipping bad value in active downloads setting pref :%s", trim2);
                } else {
                    try {
                        hashMap.put(split[0], C62942bv.parseFrom((C62942bv) f.d, Base64.decode(split[1], 3), C62921ba.m95368a()));
                    } catch (C62974ct | IllegalArgumentException unused) {
                        ((C59052c) ((C59052c) f257228c.mo56225c()).mo56372aa(12318)).mo56389s("Skipping bad value in active downloads pref: %s", trim2);
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public final synchronized void mo86938c(String str, f fVar) {
        HashMap b = mo86937b();
        if (!b.containsKey(str)) {
            b.put(str, fVar);
            m151481f(m151480e(b));
        } else {
            throw new IllegalStateException("Attempt to add download :" + str + ", was already active.");
        }
    }

    /* renamed from: d */
    public final synchronized void mo86939d(String str) {
        HashMap b = mo86937b();
        if (!b.containsKey(str)) {
            ((C59052c) ((C59052c) f257228c.mo56226d()).mo56372aa(12319)).mo56389s("Attempt to remove non-existent download%s", str);
            return;
        }
        b.remove(str);
        m151481f(m151480e(b));
    }
}
